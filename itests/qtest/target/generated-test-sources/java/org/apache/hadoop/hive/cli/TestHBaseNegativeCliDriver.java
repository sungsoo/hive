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

import org.apache.hadoop.hive.ql.QTestUtil.MiniClusterType;
import org.apache.hadoop.hive.hbase.HBaseQTestUtil;
import org.apache.hadoop.hive.hbase.HBaseTestSetup;

public class TestHBaseNegativeCliDriver extends TestCase {

  private static final String HIVE_ROOT = HBaseQTestUtil.ensurePathEndsInSlash(System.getProperty("hive.root"));
  private HBaseQTestUtil qt;
  private HBaseTestSetup setup;

  public TestHBaseNegativeCliDriver(String name, HBaseTestSetup setup) {
    super(name);
    qt = null;
    this.setup = setup;
  }

  @Override
  protected void setUp() {

    MiniClusterType miniMR = MiniClusterType.valueForString("");

    try {
      qt = new HBaseQTestUtil((HIVE_ROOT + "hbase-handler/src/test/results/negative/"), (HIVE_ROOT + "itests/qtest/target/qfile-results/hbase-handler/negative/"), miniMR, setup);
    } catch (Exception e) {
      System.err.println("Exception: " + e.getMessage());
      e.printStackTrace();
      System.err.flush();
      fail("Unexpected exception in setup");
    }
  }

  @Override
  protected void tearDown() {
    try {
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
    HBaseTestSetup setup = new HBaseTestSetup(suite);
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("cascade_dbdrop.q")) {
      suite.addTest(new TestHBaseNegativeCliDriver("testCliDriver_cascade_dbdrop", setup));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("cascade_dbdrop_hadoop20.q")) {
      suite.addTest(new TestHBaseNegativeCliDriver("testCliDriver_cascade_dbdrop_hadoop20", setup));
    }
    return setup;
  }

  public void testCliDriver_cascade_dbdrop() throws Exception {
    runTest("cascade_dbdrop", "cascade_dbdrop.q", (HIVE_ROOT + "hbase-handler/src/test/queries/negative/cascade_dbdrop.q"));
  }

  public void testCliDriver_cascade_dbdrop_hadoop20() throws Exception {
    runTest("cascade_dbdrop_hadoop20", "cascade_dbdrop_hadoop20.q", (HIVE_ROOT + "hbase-handler/src/test/queries/negative/cascade_dbdrop_hadoop20.q"));
  }


  private void runTest(String tname, String fname, String fpath) throws Exception {
    long startTime = System.currentTimeMillis();
    try {
      System.err.println("Begin query: " + fname);

      qt.addFile(fpath);

      if (qt.shouldBeSkipped(fname)) {
        System.err.println("Test " + fname + " skipped");
        return;
      }

      qt.cliInit(fname);
      qt.clearTestSideEffects();
      int ecode = qt.executeClient(fname);
      if (ecode == 0) {
        qt.failed(fname, null);
      }

      ecode = qt.checkCliDriverResults(fname);
      if (ecode != 0) {
        qt.failedDiff(ecode, fname, null);
      }
      qt.clearPostTestEffects();

    } catch (Throwable e) {
      qt.failed(e, fname, null);
    }

    long elapsedTime = System.currentTimeMillis() - startTime;
    System.err.println("Done query: " + fname + " elapsedTime=" + elapsedTime/1000 + "s");
    assertTrue("Test passed", true);
  }
}

