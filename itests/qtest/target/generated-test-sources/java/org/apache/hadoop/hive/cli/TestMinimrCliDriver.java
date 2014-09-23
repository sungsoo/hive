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

public class TestMinimrCliDriver extends TestCase {

  private static final String HIVE_ROOT = QTestUtil.ensurePathEndsInSlash(System.getProperty("hive.root"));
  private static QTestUtil qt;

  static {

    MiniClusterType miniMR = MiniClusterType.valueForString("miniMR");
    String hiveConfDir = "";
    try {
      String hadoopVer = "2.3.0";
      qt = new QTestUtil((HIVE_ROOT + "ql/src/test/results/clientpositive/"), (HIVE_ROOT + "itests/qtest/target/qfile-results/clientpositive/"), miniMR, hiveConfDir, hadoopVer);

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

  public TestMinimrCliDriver(String name) {
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
    System.err.println ("Cleaning up " + "TestMinimrCliDriver");
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
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("auto_sortmerge_join_16.q")) {
      suite.addTest(new TestMinimrCliDriver("testCliDriver_auto_sortmerge_join_16"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("bucket4.q")) {
      suite.addTest(new TestMinimrCliDriver("testCliDriver_bucket4"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("bucket5.q")) {
      suite.addTest(new TestMinimrCliDriver("testCliDriver_bucket5"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("bucket_num_reducers.q")) {
      suite.addTest(new TestMinimrCliDriver("testCliDriver_bucket_num_reducers"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("bucket_num_reducers2.q")) {
      suite.addTest(new TestMinimrCliDriver("testCliDriver_bucket_num_reducers2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("bucketizedhiveinputformat.q")) {
      suite.addTest(new TestMinimrCliDriver("testCliDriver_bucketizedhiveinputformat"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("bucketmapjoin6.q")) {
      suite.addTest(new TestMinimrCliDriver("testCliDriver_bucketmapjoin6"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("bucketmapjoin7.q")) {
      suite.addTest(new TestMinimrCliDriver("testCliDriver_bucketmapjoin7"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("disable_merge_for_bucketing.q")) {
      suite.addTest(new TestMinimrCliDriver("testCliDriver_disable_merge_for_bucketing"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("external_table_with_space_in_location_path.q")) {
      suite.addTest(new TestMinimrCliDriver("testCliDriver_external_table_with_space_in_location_path"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("file_with_header_footer.q")) {
      suite.addTest(new TestMinimrCliDriver("testCliDriver_file_with_header_footer"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("groupby2.q")) {
      suite.addTest(new TestMinimrCliDriver("testCliDriver_groupby2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("import_exported_table.q")) {
      suite.addTest(new TestMinimrCliDriver("testCliDriver_import_exported_table"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("index_bitmap3.q")) {
      suite.addTest(new TestMinimrCliDriver("testCliDriver_index_bitmap3"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("index_bitmap_auto.q")) {
      suite.addTest(new TestMinimrCliDriver("testCliDriver_index_bitmap_auto"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("infer_bucket_sort_bucketed_table.q")) {
      suite.addTest(new TestMinimrCliDriver("testCliDriver_infer_bucket_sort_bucketed_table"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("infer_bucket_sort_dyn_part.q")) {
      suite.addTest(new TestMinimrCliDriver("testCliDriver_infer_bucket_sort_dyn_part"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("infer_bucket_sort_map_operators.q")) {
      suite.addTest(new TestMinimrCliDriver("testCliDriver_infer_bucket_sort_map_operators"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("infer_bucket_sort_merge.q")) {
      suite.addTest(new TestMinimrCliDriver("testCliDriver_infer_bucket_sort_merge"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("infer_bucket_sort_num_buckets.q")) {
      suite.addTest(new TestMinimrCliDriver("testCliDriver_infer_bucket_sort_num_buckets"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("infer_bucket_sort_reducers_power_two.q")) {
      suite.addTest(new TestMinimrCliDriver("testCliDriver_infer_bucket_sort_reducers_power_two"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("input16_cc.q")) {
      suite.addTest(new TestMinimrCliDriver("testCliDriver_input16_cc"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("join1.q")) {
      suite.addTest(new TestMinimrCliDriver("testCliDriver_join1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("leftsemijoin_mr.q")) {
      suite.addTest(new TestMinimrCliDriver("testCliDriver_leftsemijoin_mr"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("list_bucket_dml_10.q")) {
      suite.addTest(new TestMinimrCliDriver("testCliDriver_list_bucket_dml_10"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("load_fs2.q")) {
      suite.addTest(new TestMinimrCliDriver("testCliDriver_load_fs2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("load_hdfs_file_with_space_in_the_name.q")) {
      suite.addTest(new TestMinimrCliDriver("testCliDriver_load_hdfs_file_with_space_in_the_name"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("parallel_orderby.q")) {
      suite.addTest(new TestMinimrCliDriver("testCliDriver_parallel_orderby"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("ql_rewrite_gbtoidx.q")) {
      suite.addTest(new TestMinimrCliDriver("testCliDriver_ql_rewrite_gbtoidx"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("quotedid_smb.q")) {
      suite.addTest(new TestMinimrCliDriver("testCliDriver_quotedid_smb"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("reduce_deduplicate.q")) {
      suite.addTest(new TestMinimrCliDriver("testCliDriver_reduce_deduplicate"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("remote_script.q")) {
      suite.addTest(new TestMinimrCliDriver("testCliDriver_remote_script"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("root_dir_external_table.q")) {
      suite.addTest(new TestMinimrCliDriver("testCliDriver_root_dir_external_table"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("schemeAuthority.q")) {
      suite.addTest(new TestMinimrCliDriver("testCliDriver_schemeAuthority"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("schemeAuthority2.q")) {
      suite.addTest(new TestMinimrCliDriver("testCliDriver_schemeAuthority2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("scriptfile1.q")) {
      suite.addTest(new TestMinimrCliDriver("testCliDriver_scriptfile1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("scriptfile1_win.q")) {
      suite.addTest(new TestMinimrCliDriver("testCliDriver_scriptfile1_win"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("smb_mapjoin_8.q")) {
      suite.addTest(new TestMinimrCliDriver("testCliDriver_smb_mapjoin_8"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("stats_counter.q")) {
      suite.addTest(new TestMinimrCliDriver("testCliDriver_stats_counter"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("stats_counter_partitioned.q")) {
      suite.addTest(new TestMinimrCliDriver("testCliDriver_stats_counter_partitioned"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("truncate_column_buckets.q")) {
      suite.addTest(new TestMinimrCliDriver("testCliDriver_truncate_column_buckets"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_using.q")) {
      suite.addTest(new TestMinimrCliDriver("testCliDriver_udf_using"));
    }
    suite.addTest(new TestMinimrCliDriver("testCliDriver_shutdown"));
    return suite;
  }

  static String debugHint = "\nSee ./ql/target/tmp/log/hive.log or ./itests/qtest/target/tmp/log/hive.log, "
     + "or check ./ql/target/surefire-reports or ./itests/qtest/target/surefire-reports/ for specific test cases logs.";

  public void testCliDriver_auto_sortmerge_join_16() throws Exception {
    runTest("auto_sortmerge_join_16", "auto_sortmerge_join_16.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/auto_sortmerge_join_16.q"));
  }

  public void testCliDriver_bucket4() throws Exception {
    runTest("bucket4", "bucket4.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/bucket4.q"));
  }

  public void testCliDriver_bucket5() throws Exception {
    runTest("bucket5", "bucket5.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/bucket5.q"));
  }

  public void testCliDriver_bucket_num_reducers() throws Exception {
    runTest("bucket_num_reducers", "bucket_num_reducers.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/bucket_num_reducers.q"));
  }

  public void testCliDriver_bucket_num_reducers2() throws Exception {
    runTest("bucket_num_reducers2", "bucket_num_reducers2.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/bucket_num_reducers2.q"));
  }

  public void testCliDriver_bucketizedhiveinputformat() throws Exception {
    runTest("bucketizedhiveinputformat", "bucketizedhiveinputformat.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/bucketizedhiveinputformat.q"));
  }

  public void testCliDriver_bucketmapjoin6() throws Exception {
    runTest("bucketmapjoin6", "bucketmapjoin6.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/bucketmapjoin6.q"));
  }

  public void testCliDriver_bucketmapjoin7() throws Exception {
    runTest("bucketmapjoin7", "bucketmapjoin7.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/bucketmapjoin7.q"));
  }

  public void testCliDriver_disable_merge_for_bucketing() throws Exception {
    runTest("disable_merge_for_bucketing", "disable_merge_for_bucketing.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/disable_merge_for_bucketing.q"));
  }

  public void testCliDriver_external_table_with_space_in_location_path() throws Exception {
    runTest("external_table_with_space_in_location_path", "external_table_with_space_in_location_path.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/external_table_with_space_in_location_path.q"));
  }

  public void testCliDriver_file_with_header_footer() throws Exception {
    runTest("file_with_header_footer", "file_with_header_footer.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/file_with_header_footer.q"));
  }

  public void testCliDriver_groupby2() throws Exception {
    runTest("groupby2", "groupby2.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/groupby2.q"));
  }

  public void testCliDriver_import_exported_table() throws Exception {
    runTest("import_exported_table", "import_exported_table.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/import_exported_table.q"));
  }

  public void testCliDriver_index_bitmap3() throws Exception {
    runTest("index_bitmap3", "index_bitmap3.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/index_bitmap3.q"));
  }

  public void testCliDriver_index_bitmap_auto() throws Exception {
    runTest("index_bitmap_auto", "index_bitmap_auto.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/index_bitmap_auto.q"));
  }

  public void testCliDriver_infer_bucket_sort_bucketed_table() throws Exception {
    runTest("infer_bucket_sort_bucketed_table", "infer_bucket_sort_bucketed_table.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/infer_bucket_sort_bucketed_table.q"));
  }

  public void testCliDriver_infer_bucket_sort_dyn_part() throws Exception {
    runTest("infer_bucket_sort_dyn_part", "infer_bucket_sort_dyn_part.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/infer_bucket_sort_dyn_part.q"));
  }

  public void testCliDriver_infer_bucket_sort_map_operators() throws Exception {
    runTest("infer_bucket_sort_map_operators", "infer_bucket_sort_map_operators.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/infer_bucket_sort_map_operators.q"));
  }

  public void testCliDriver_infer_bucket_sort_merge() throws Exception {
    runTest("infer_bucket_sort_merge", "infer_bucket_sort_merge.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/infer_bucket_sort_merge.q"));
  }

  public void testCliDriver_infer_bucket_sort_num_buckets() throws Exception {
    runTest("infer_bucket_sort_num_buckets", "infer_bucket_sort_num_buckets.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/infer_bucket_sort_num_buckets.q"));
  }

  public void testCliDriver_infer_bucket_sort_reducers_power_two() throws Exception {
    runTest("infer_bucket_sort_reducers_power_two", "infer_bucket_sort_reducers_power_two.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/infer_bucket_sort_reducers_power_two.q"));
  }

  public void testCliDriver_input16_cc() throws Exception {
    runTest("input16_cc", "input16_cc.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/input16_cc.q"));
  }

  public void testCliDriver_join1() throws Exception {
    runTest("join1", "join1.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/join1.q"));
  }

  public void testCliDriver_leftsemijoin_mr() throws Exception {
    runTest("leftsemijoin_mr", "leftsemijoin_mr.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/leftsemijoin_mr.q"));
  }

  public void testCliDriver_list_bucket_dml_10() throws Exception {
    runTest("list_bucket_dml_10", "list_bucket_dml_10.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/list_bucket_dml_10.q"));
  }

  public void testCliDriver_load_fs2() throws Exception {
    runTest("load_fs2", "load_fs2.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/load_fs2.q"));
  }

  public void testCliDriver_load_hdfs_file_with_space_in_the_name() throws Exception {
    runTest("load_hdfs_file_with_space_in_the_name", "load_hdfs_file_with_space_in_the_name.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/load_hdfs_file_with_space_in_the_name.q"));
  }

  public void testCliDriver_parallel_orderby() throws Exception {
    runTest("parallel_orderby", "parallel_orderby.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/parallel_orderby.q"));
  }

  public void testCliDriver_ql_rewrite_gbtoidx() throws Exception {
    runTest("ql_rewrite_gbtoidx", "ql_rewrite_gbtoidx.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/ql_rewrite_gbtoidx.q"));
  }

  public void testCliDriver_quotedid_smb() throws Exception {
    runTest("quotedid_smb", "quotedid_smb.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/quotedid_smb.q"));
  }

  public void testCliDriver_reduce_deduplicate() throws Exception {
    runTest("reduce_deduplicate", "reduce_deduplicate.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/reduce_deduplicate.q"));
  }

  public void testCliDriver_remote_script() throws Exception {
    runTest("remote_script", "remote_script.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/remote_script.q"));
  }

  public void testCliDriver_root_dir_external_table() throws Exception {
    runTest("root_dir_external_table", "root_dir_external_table.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/root_dir_external_table.q"));
  }

  public void testCliDriver_schemeAuthority() throws Exception {
    runTest("schemeAuthority", "schemeAuthority.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/schemeAuthority.q"));
  }

  public void testCliDriver_schemeAuthority2() throws Exception {
    runTest("schemeAuthority2", "schemeAuthority2.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/schemeAuthority2.q"));
  }

  public void testCliDriver_scriptfile1() throws Exception {
    runTest("scriptfile1", "scriptfile1.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/scriptfile1.q"));
  }

  public void testCliDriver_scriptfile1_win() throws Exception {
    runTest("scriptfile1_win", "scriptfile1_win.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/scriptfile1_win.q"));
  }

  public void testCliDriver_smb_mapjoin_8() throws Exception {
    runTest("smb_mapjoin_8", "smb_mapjoin_8.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/smb_mapjoin_8.q"));
  }

  public void testCliDriver_stats_counter() throws Exception {
    runTest("stats_counter", "stats_counter.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/stats_counter.q"));
  }

  public void testCliDriver_stats_counter_partitioned() throws Exception {
    runTest("stats_counter_partitioned", "stats_counter_partitioned.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/stats_counter_partitioned.q"));
  }

  public void testCliDriver_truncate_column_buckets() throws Exception {
    runTest("truncate_column_buckets", "truncate_column_buckets.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/truncate_column_buckets.q"));
  }

  public void testCliDriver_udf_using() throws Exception {
    runTest("udf_using", "udf_using.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf_using.q"));
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
