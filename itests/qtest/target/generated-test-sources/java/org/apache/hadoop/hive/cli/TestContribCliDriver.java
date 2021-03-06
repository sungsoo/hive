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
import org.apache.hadoop.hive.ql.session.SessionState;

public class TestContribCliDriver extends TestCase {

  private static final String HIVE_ROOT = QTestUtil.ensurePathEndsInSlash(System.getProperty("hive.root"));
  private static QTestUtil qt;

  static {

    MiniClusterType miniMR = MiniClusterType.valueForString("");
    String hiveConfDir = "";
    try {
      String hadoopVer = "${hadoopVersion}";
      qt = new QTestUtil((HIVE_ROOT + "contrib/src/test/results/clientpositive/"), (HIVE_ROOT + "itests/qtest/target/qfile-results/contribclientpositive/"), miniMR, hiveConfDir, hadoopVer);

      // do a one time initialization
      qt.cleanUp();
      qt.createSources();

    } catch (Exception e) {
      System.err.println("Exception: " + e.getMessage());
      e.printStackTrace();
      System.err.flush();
      fail("Unexpected exception in static initialization"+e.getMessage());
    }
  }

  public TestContribCliDriver(String name) {
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
  public void testCliDriver_shutdown() {
    System.err.println ("Cleaning up " + "TestContribCliDriver");
  }

  @Override
  protected void tearDown() {
    try {
      qt.clearPostTestEffects();
      if (getName().equals("testCliDriver_shutdown"))
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
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("dboutput.q")) {
      suite.addTest(new TestContribCliDriver("testCliDriver_dboutput"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("fileformat_base64.q")) {
      suite.addTest(new TestContribCliDriver("testCliDriver_fileformat_base64"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("java_mr_example.q")) {
      suite.addTest(new TestContribCliDriver("testCliDriver_java_mr_example"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("lateral_view_explode2.q")) {
      suite.addTest(new TestContribCliDriver("testCliDriver_lateral_view_explode2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("serde_regex.q")) {
      suite.addTest(new TestContribCliDriver("testCliDriver_serde_regex"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("serde_s3.q")) {
      suite.addTest(new TestContribCliDriver("testCliDriver_serde_s3"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("serde_typedbytes.q")) {
      suite.addTest(new TestContribCliDriver("testCliDriver_serde_typedbytes"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("serde_typedbytes2.q")) {
      suite.addTest(new TestContribCliDriver("testCliDriver_serde_typedbytes2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("serde_typedbytes3.q")) {
      suite.addTest(new TestContribCliDriver("testCliDriver_serde_typedbytes3"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("serde_typedbytes4.q")) {
      suite.addTest(new TestContribCliDriver("testCliDriver_serde_typedbytes4"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("serde_typedbytes5.q")) {
      suite.addTest(new TestContribCliDriver("testCliDriver_serde_typedbytes5"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("serde_typedbytes6.q")) {
      suite.addTest(new TestContribCliDriver("testCliDriver_serde_typedbytes6"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("serde_typedbytes_null.q")) {
      suite.addTest(new TestContribCliDriver("testCliDriver_serde_typedbytes_null"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udaf_example_avg.q")) {
      suite.addTest(new TestContribCliDriver("testCliDriver_udaf_example_avg"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udaf_example_group_concat.q")) {
      suite.addTest(new TestContribCliDriver("testCliDriver_udaf_example_group_concat"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udaf_example_max.q")) {
      suite.addTest(new TestContribCliDriver("testCliDriver_udaf_example_max"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udaf_example_max_n.q")) {
      suite.addTest(new TestContribCliDriver("testCliDriver_udaf_example_max_n"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udaf_example_min.q")) {
      suite.addTest(new TestContribCliDriver("testCliDriver_udaf_example_min"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udaf_example_min_n.q")) {
      suite.addTest(new TestContribCliDriver("testCliDriver_udaf_example_min_n"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_example_add.q")) {
      suite.addTest(new TestContribCliDriver("testCliDriver_udf_example_add"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_example_arraymapstruct.q")) {
      suite.addTest(new TestContribCliDriver("testCliDriver_udf_example_arraymapstruct"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_example_format.q")) {
      suite.addTest(new TestContribCliDriver("testCliDriver_udf_example_format"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_row_sequence.q")) {
      suite.addTest(new TestContribCliDriver("testCliDriver_udf_row_sequence"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udtf_explode2.q")) {
      suite.addTest(new TestContribCliDriver("testCliDriver_udtf_explode2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udtf_output_on_close.q")) {
      suite.addTest(new TestContribCliDriver("testCliDriver_udtf_output_on_close"));
    }
    suite.addTest(new TestContribCliDriver("testCliDriver_shutdown"));
    return suite;
  }

  static String debugHint = "\nSee ./ql/target/tmp/log/hive.log or ./itests/qtest/target/tmp/log/hive.log, "
     + "or check ./ql/target/surefire-reports or ./itests/qtest/target/surefire-reports/ for specific test cases logs.";

  public void testCliDriver_dboutput() throws Exception {
    runTest("dboutput", "dboutput.q", (HIVE_ROOT + "contrib/src/test/queries/clientpositive/dboutput.q"));
  }

  public void testCliDriver_fileformat_base64() throws Exception {
    runTest("fileformat_base64", "fileformat_base64.q", (HIVE_ROOT + "contrib/src/test/queries/clientpositive/fileformat_base64.q"));
  }

  public void testCliDriver_java_mr_example() throws Exception {
    runTest("java_mr_example", "java_mr_example.q", (HIVE_ROOT + "contrib/src/test/queries/clientpositive/java_mr_example.q"));
  }

  public void testCliDriver_lateral_view_explode2() throws Exception {
    runTest("lateral_view_explode2", "lateral_view_explode2.q", (HIVE_ROOT + "contrib/src/test/queries/clientpositive/lateral_view_explode2.q"));
  }

  public void testCliDriver_serde_regex() throws Exception {
    runTest("serde_regex", "serde_regex.q", (HIVE_ROOT + "contrib/src/test/queries/clientpositive/serde_regex.q"));
  }

  public void testCliDriver_serde_s3() throws Exception {
    runTest("serde_s3", "serde_s3.q", (HIVE_ROOT + "contrib/src/test/queries/clientpositive/serde_s3.q"));
  }

  public void testCliDriver_serde_typedbytes() throws Exception {
    runTest("serde_typedbytes", "serde_typedbytes.q", (HIVE_ROOT + "contrib/src/test/queries/clientpositive/serde_typedbytes.q"));
  }

  public void testCliDriver_serde_typedbytes2() throws Exception {
    runTest("serde_typedbytes2", "serde_typedbytes2.q", (HIVE_ROOT + "contrib/src/test/queries/clientpositive/serde_typedbytes2.q"));
  }

  public void testCliDriver_serde_typedbytes3() throws Exception {
    runTest("serde_typedbytes3", "serde_typedbytes3.q", (HIVE_ROOT + "contrib/src/test/queries/clientpositive/serde_typedbytes3.q"));
  }

  public void testCliDriver_serde_typedbytes4() throws Exception {
    runTest("serde_typedbytes4", "serde_typedbytes4.q", (HIVE_ROOT + "contrib/src/test/queries/clientpositive/serde_typedbytes4.q"));
  }

  public void testCliDriver_serde_typedbytes5() throws Exception {
    runTest("serde_typedbytes5", "serde_typedbytes5.q", (HIVE_ROOT + "contrib/src/test/queries/clientpositive/serde_typedbytes5.q"));
  }

  public void testCliDriver_serde_typedbytes6() throws Exception {
    runTest("serde_typedbytes6", "serde_typedbytes6.q", (HIVE_ROOT + "contrib/src/test/queries/clientpositive/serde_typedbytes6.q"));
  }

  public void testCliDriver_serde_typedbytes_null() throws Exception {
    runTest("serde_typedbytes_null", "serde_typedbytes_null.q", (HIVE_ROOT + "contrib/src/test/queries/clientpositive/serde_typedbytes_null.q"));
  }

  public void testCliDriver_udaf_example_avg() throws Exception {
    runTest("udaf_example_avg", "udaf_example_avg.q", (HIVE_ROOT + "contrib/src/test/queries/clientpositive/udaf_example_avg.q"));
  }

  public void testCliDriver_udaf_example_group_concat() throws Exception {
    runTest("udaf_example_group_concat", "udaf_example_group_concat.q", (HIVE_ROOT + "contrib/src/test/queries/clientpositive/udaf_example_group_concat.q"));
  }

  public void testCliDriver_udaf_example_max() throws Exception {
    runTest("udaf_example_max", "udaf_example_max.q", (HIVE_ROOT + "contrib/src/test/queries/clientpositive/udaf_example_max.q"));
  }

  public void testCliDriver_udaf_example_max_n() throws Exception {
    runTest("udaf_example_max_n", "udaf_example_max_n.q", (HIVE_ROOT + "contrib/src/test/queries/clientpositive/udaf_example_max_n.q"));
  }

  public void testCliDriver_udaf_example_min() throws Exception {
    runTest("udaf_example_min", "udaf_example_min.q", (HIVE_ROOT + "contrib/src/test/queries/clientpositive/udaf_example_min.q"));
  }

  public void testCliDriver_udaf_example_min_n() throws Exception {
    runTest("udaf_example_min_n", "udaf_example_min_n.q", (HIVE_ROOT + "contrib/src/test/queries/clientpositive/udaf_example_min_n.q"));
  }

  public void testCliDriver_udf_example_add() throws Exception {
    runTest("udf_example_add", "udf_example_add.q", (HIVE_ROOT + "contrib/src/test/queries/clientpositive/udf_example_add.q"));
  }

  public void testCliDriver_udf_example_arraymapstruct() throws Exception {
    runTest("udf_example_arraymapstruct", "udf_example_arraymapstruct.q", (HIVE_ROOT + "contrib/src/test/queries/clientpositive/udf_example_arraymapstruct.q"));
  }

  public void testCliDriver_udf_example_format() throws Exception {
    runTest("udf_example_format", "udf_example_format.q", (HIVE_ROOT + "contrib/src/test/queries/clientpositive/udf_example_format.q"));
  }

  public void testCliDriver_udf_row_sequence() throws Exception {
    runTest("udf_row_sequence", "udf_row_sequence.q", (HIVE_ROOT + "contrib/src/test/queries/clientpositive/udf_row_sequence.q"));
  }

  public void testCliDriver_udtf_explode2() throws Exception {
    runTest("udtf_explode2", "udtf_explode2.q", (HIVE_ROOT + "contrib/src/test/queries/clientpositive/udtf_explode2.q"));
  }

  public void testCliDriver_udtf_output_on_close() throws Exception {
    runTest("udtf_output_on_close", "udtf_output_on_close.q", (HIVE_ROOT + "contrib/src/test/queries/clientpositive/udtf_output_on_close.q"));
  }


  private void runTest(String tname, String fname, String fpath) throws Exception {
    long startTime = System.currentTimeMillis();
    try {
      System.err.println("Begin query: " + fname);

      qt.addFile(fpath);

      if (qt.shouldBeSkipped(fname)) {
        return;
      }

      qt.cliInit(fname, false);
      int ecode = qt.executeClient(fname);
      if (ecode != 0) {
        qt.failed(ecode, fname, debugHint);
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
