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

import org.apache.hadoop.hive.ql.QTestUtil;
import org.apache.hadoop.hive.ql.QTestUtil.MiniClusterType;
import org.apache.hadoop.hive.ql.exec.Task;

public class TestNegativeMinimrCliDriver extends TestCase {

  private static final String HIVE_ROOT = QTestUtil.ensurePathEndsInSlash(System.getProperty("hive.root"));
  private static QTestUtil qt;

  static {
    MiniClusterType miniMR = MiniClusterType.valueForString("miniMR");

    try {
      String hadoopVer = "${hadoopVersion}";
      qt = new QTestUtil((HIVE_ROOT + "ql/src/test/results/clientnegative/"), (HIVE_ROOT + "itests/qtest/target/qfile-results/clientnegative/"), miniMR, hadoopVer);
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

  public TestNegativeMinimrCliDriver(String name) {
    super(name);
  }

  @Override
  protected void setUp() {
    try {
      qt.clearTestSideEffects();
    }
    catch (Throwable e) {
      e.printStackTrace();
      System.err.flush();
      fail("Unexpected exception in setup");
    }
  }

  @Override
  protected void tearDown() {
    try {
      qt.clearPostTestEffects();
      if (getName().equals("testNegativeCliDriver_shutdown"))
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
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("cluster_tasklog_retrieval.q")) {
      suite.addTest(new TestNegativeMinimrCliDriver("testNegativeCliDriver_cluster_tasklog_retrieval"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("file_with_header_footer_negative.q")) {
      suite.addTest(new TestNegativeMinimrCliDriver("testNegativeCliDriver_file_with_header_footer_negative"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("mapreduce_stack_trace.q")) {
      suite.addTest(new TestNegativeMinimrCliDriver("testNegativeCliDriver_mapreduce_stack_trace"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("mapreduce_stack_trace_hadoop20.q")) {
      suite.addTest(new TestNegativeMinimrCliDriver("testNegativeCliDriver_mapreduce_stack_trace_hadoop20"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("mapreduce_stack_trace_turnoff.q")) {
      suite.addTest(new TestNegativeMinimrCliDriver("testNegativeCliDriver_mapreduce_stack_trace_turnoff"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("mapreduce_stack_trace_turnoff_hadoop20.q")) {
      suite.addTest(new TestNegativeMinimrCliDriver("testNegativeCliDriver_mapreduce_stack_trace_turnoff_hadoop20"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("minimr_broken_pipe.q")) {
      suite.addTest(new TestNegativeMinimrCliDriver("testNegativeCliDriver_minimr_broken_pipe"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_local_resource.q")) {
      suite.addTest(new TestNegativeMinimrCliDriver("testNegativeCliDriver_udf_local_resource"));
    }
    suite.addTest(new TestNegativeMinimrCliDriver("testNegativeCliDriver_shutdown"));
    return suite;
  }

  /**
   * Dummy last test. This is only meant to shutdown qt
   */
  public void testNegativeCliDriver_shutdown() {
    System.err.println ("Cleaning up " + "TestNegativeMinimrCliDriver");
  }

  static String debugHint = "\nSee ./ql/target/tmp/log/hive.log or ./itests/qtest/target/tmp/log/hive.log, "
     + "or check ./ql/target/surefire-reports or ./itests/qtest/target/surefire-reports/ for specific test cases logs.";

  public void testNegativeCliDriver_cluster_tasklog_retrieval() throws Exception {
    runTest("cluster_tasklog_retrieval", "cluster_tasklog_retrieval.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/cluster_tasklog_retrieval.q"));
  }

  public void testNegativeCliDriver_file_with_header_footer_negative() throws Exception {
    runTest("file_with_header_footer_negative", "file_with_header_footer_negative.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/file_with_header_footer_negative.q"));
  }

  public void testNegativeCliDriver_mapreduce_stack_trace() throws Exception {
    runTest("mapreduce_stack_trace", "mapreduce_stack_trace.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/mapreduce_stack_trace.q"));
  }

  public void testNegativeCliDriver_mapreduce_stack_trace_hadoop20() throws Exception {
    runTest("mapreduce_stack_trace_hadoop20", "mapreduce_stack_trace_hadoop20.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/mapreduce_stack_trace_hadoop20.q"));
  }

  public void testNegativeCliDriver_mapreduce_stack_trace_turnoff() throws Exception {
    runTest("mapreduce_stack_trace_turnoff", "mapreduce_stack_trace_turnoff.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/mapreduce_stack_trace_turnoff.q"));
  }

  public void testNegativeCliDriver_mapreduce_stack_trace_turnoff_hadoop20() throws Exception {
    runTest("mapreduce_stack_trace_turnoff_hadoop20", "mapreduce_stack_trace_turnoff_hadoop20.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/mapreduce_stack_trace_turnoff_hadoop20.q"));
  }

  public void testNegativeCliDriver_minimr_broken_pipe() throws Exception {
    runTest("minimr_broken_pipe", "minimr_broken_pipe.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/minimr_broken_pipe.q"));
  }

  public void testNegativeCliDriver_udf_local_resource() throws Exception {
    runTest("udf_local_resource", "udf_local_resource.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/udf_local_resource.q"));
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

      qt.cliInit(fname, false);
      int ecode = qt.executeClient(fname);
      if (ecode == 0) {
        qt.failed(fname, debugHint);
      }

      ecode = qt.checkCliDriverResults(fname);
      if (ecode != 0) {
        qt.failedDiff(ecode, fname, debugHint);
      }
    }
    catch (Throwable e) {
      qt.failed(e, fname, debugHint);
    }

    long elapsedTime = System.currentTimeMillis() - startTime;
    System.err.println("Done query: " + fname + " elapsedTime=" + elapsedTime/1000 + "s");
    assertTrue("Test passed", true);
  }
}
