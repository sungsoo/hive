/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.hadoop.hive.cli;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import java.io.*;
import java.util.*;
import java.util.Arrays;

import org.apache.hadoop.hive.ql.QTestUtil;
import org.apache.hadoop.hive.ql.QTestUtil.MiniClusterType;
import org.apache.hadoop.hive.ql.session.SessionState;

public class TestCompareCliDriver extends TestCase {

  private static final String HIVE_ROOT = QTestUtil.ensurePathEndsInSlash(System.getProperty("hive.root"));
  private static QTestUtil qt;

  static {

    MiniClusterType miniMR = MiniClusterType.valueForString("");
    String hiveConfDir = "";
    try {
      String hadoopVer = "2.3.0";
      qt = new QTestUtil((HIVE_ROOT + "$resultsDir"), (HIVE_ROOT + "itests/qtest/target/qfile-results/clientcompare/"), miniMR, hiveConfDir, hadoopVer);

      // do a one time initialization
      qt.cleanUp();
      qt.createSources();

    } catch (Exception e) {
      System.err.println("Exception: " + e.getMessage());
      e.printStackTrace();
      System.err.flush();
      fail("Unexpected exception in static initialization");
    }
  }

  public TestCompareCliDriver(String name) {
    super(name);
  }

  @Override
  protected void setUp() {
    try {
      qt.clearTestSideEffects();
    } catch (Exception e) {
      System.err.println("Exception: " + e.getMessage());
      e.printStackTrace();
      System.err.flush();
      fail("Unexpected exception in setup");
    }
  }

  /**
   * Dummy last test. This is only meant to shutdown qt
   */
  public void testCompareCliDriver_shutdown() {
    System.err.println ("Cleaning up " + "TestCompareCliDriver");
  }

  @Override
  protected void tearDown() {
    try {
      qt.clearPostTestEffects();
      if (getName().equals("testCompareCliDriver_shutdown"))
        qt.shutdown();
    }
    catch (Exception e) {
      System.err.println("Exception: " + e.getMessage());
      e.printStackTrace();
      System.err.flush();
      fail("Unexpected exception in tearDown");
    }
  }

  public static Test suite() {
    Set<String> qFilesToExecute = new HashSet<String>();
    String qFiles = System.getProperty("qfile", "").trim();
    if(!qFiles.isEmpty()) {
      for(String qFile : qFiles.split(",")) {
        qFile = qFile.trim();
        if(!qFile.isEmpty()) {
          qFilesToExecute.add(qFile);
        }
      }
    }
    TestSuite suite = new TestSuite();
    
    
    
    if (qFilesToExecute.isEmpty() || qFilesToExecute.contains("vectorized_math_funcs.q")) {
      suite.addTest(new TestCompareCliDriver("testCompareCliDriver_vectorized_math_funcs"));
    }
    suite.addTest(new TestCompareCliDriver("testCompareCliDriver_shutdown"));
    return suite;
  }
  
  private Map<String, List<String>> versionFiles = new HashMap<String, List<String>>();

  static String debugHint = "\nSee ./ql/target/tmp/log/hive.log or ./itests/qtest/target/tmp/log/hive.log, "
     + "or check ./ql/target/surefire-reports or ./itests/qtest/target/surefire-reports/ for specific test cases logs.";

  public void testCompareCliDriver_vectorized_math_funcs() throws Exception {
    runTest("vectorized_math_funcs", "vectorized_math_funcs.q", (HIVE_ROOT + "ql/src/test/queries/clientcompare/vectorized_math_funcs.q"));
  }


  private void runTest(String tname, String fname, String fpath) throws Exception {
    final String queryDirectory = HIVE_ROOT + "ql/src/test/queries/clientcompare/";
  
    long startTime = System.currentTimeMillis();
    try {
      System.err.println("Begin query: " + fname);
      // TODO: versions could also be picked at build time.
      List<String> versionFiles = QTestUtil.getVersionFiles(queryDirectory, tname);
      if (versionFiles.size() < 2) {
        fail("Cannot run " + tname + " with only " + versionFiles.size() + " versions");
      }

      qt.addFile(fpath);
      for (String versionFile : versionFiles) {
        qt.addFile(new File(queryDirectory, versionFile), true);
      }

      if (qt.shouldBeSkipped(fname)) {
        return;
      }

      int ecode = 0;
      List<String> outputs = new ArrayList<String>(versionFiles.size());
      for (String versionFile : versionFiles) {
        // 1 for "_" after tname; 3 for ".qv" at the end. Version is in between.
        String versionStr = versionFile.substring(tname.length() + 1, versionFile.length() - 3);
        outputs.add(qt.cliInit(tname + "." + versionStr, false));
        // TODO: will this work?
        ecode = qt.executeClient(versionFile, fname);
        if (ecode != 0) {
          qt.failed(ecode, fname, debugHint);
        }
      }

      ecode = qt.checkCompareCliDriverResults(fname, outputs);
      if (ecode != 0) {
        qt.failedDiff(ecode, fname, debugHint);
      }
    }
    catch (Throwable e) {
      qt.failed(e, fname, debugHint);
    }

    long elapsedTime = System.currentTimeMillis() - startTime;
    System.err.println("Done query: " + fname + " elapsedTime=" + elapsedTime/1000 + "s");
  }
}
