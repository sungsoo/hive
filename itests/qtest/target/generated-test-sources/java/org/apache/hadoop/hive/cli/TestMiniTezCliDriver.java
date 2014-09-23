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

public class TestMiniTezCliDriver extends TestCase {

  private static final String HIVE_ROOT = QTestUtil.ensurePathEndsInSlash(System.getProperty("hive.root"));
  private static QTestUtil qt;

  static {

    MiniClusterType miniMR = MiniClusterType.valueForString("tez");
    String hiveConfDir = "/Users/sungsoo/github/apache-hive/itests/qtest/../../data/conf/tez";
    try {
      String hadoopVer = "2.3.0";
      qt = new QTestUtil((HIVE_ROOT + "ql/src/test/results/clientpositive/tez/"), (HIVE_ROOT + "itests/qtest/target/qfile-results/clientpositive/"), miniMR, hiveConfDir, hadoopVer);

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

  public TestMiniTezCliDriver(String name) {
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
    System.err.println ("Cleaning up " + "TestMiniTezCliDriver");
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
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("auto_join0.q")) {
      suite.addTest(new TestMiniTezCliDriver("testCliDriver_auto_join0"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("auto_join1.q")) {
      suite.addTest(new TestMiniTezCliDriver("testCliDriver_auto_join1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("bucket2.q")) {
      suite.addTest(new TestMiniTezCliDriver("testCliDriver_bucket2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("bucket3.q")) {
      suite.addTest(new TestMiniTezCliDriver("testCliDriver_bucket3"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("bucket4.q")) {
      suite.addTest(new TestMiniTezCliDriver("testCliDriver_bucket4"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("bucket_map_join_tez1.q")) {
      suite.addTest(new TestMiniTezCliDriver("testCliDriver_bucket_map_join_tez1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("bucket_map_join_tez2.q")) {
      suite.addTest(new TestMiniTezCliDriver("testCliDriver_bucket_map_join_tez2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("count.q")) {
      suite.addTest(new TestMiniTezCliDriver("testCliDriver_count"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("create_merge_compressed.q")) {
      suite.addTest(new TestMiniTezCliDriver("testCliDriver_create_merge_compressed"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("cross_join.q")) {
      suite.addTest(new TestMiniTezCliDriver("testCliDriver_cross_join"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("cross_product_check_1.q")) {
      suite.addTest(new TestMiniTezCliDriver("testCliDriver_cross_product_check_1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("cross_product_check_2.q")) {
      suite.addTest(new TestMiniTezCliDriver("testCliDriver_cross_product_check_2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("ctas.q")) {
      suite.addTest(new TestMiniTezCliDriver("testCliDriver_ctas"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("custom_input_output_format.q")) {
      suite.addTest(new TestMiniTezCliDriver("testCliDriver_custom_input_output_format"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("disable_merge_for_bucketing.q")) {
      suite.addTest(new TestMiniTezCliDriver("testCliDriver_disable_merge_for_bucketing"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("dynpart_sort_opt_vectorization.q")) {
      suite.addTest(new TestMiniTezCliDriver("testCliDriver_dynpart_sort_opt_vectorization"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("dynpart_sort_optimization.q")) {
      suite.addTest(new TestMiniTezCliDriver("testCliDriver_dynpart_sort_optimization"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("enforce_order.q")) {
      suite.addTest(new TestMiniTezCliDriver("testCliDriver_enforce_order"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("filter_join_breaktask.q")) {
      suite.addTest(new TestMiniTezCliDriver("testCliDriver_filter_join_breaktask"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("filter_join_breaktask2.q")) {
      suite.addTest(new TestMiniTezCliDriver("testCliDriver_filter_join_breaktask2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("groupby1.q")) {
      suite.addTest(new TestMiniTezCliDriver("testCliDriver_groupby1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("groupby2.q")) {
      suite.addTest(new TestMiniTezCliDriver("testCliDriver_groupby2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("groupby3.q")) {
      suite.addTest(new TestMiniTezCliDriver("testCliDriver_groupby3"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("having.q")) {
      suite.addTest(new TestMiniTezCliDriver("testCliDriver_having"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("insert1.q")) {
      suite.addTest(new TestMiniTezCliDriver("testCliDriver_insert1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("insert_into1.q")) {
      suite.addTest(new TestMiniTezCliDriver("testCliDriver_insert_into1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("insert_into2.q")) {
      suite.addTest(new TestMiniTezCliDriver("testCliDriver_insert_into2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("join0.q")) {
      suite.addTest(new TestMiniTezCliDriver("testCliDriver_join0"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("join1.q")) {
      suite.addTest(new TestMiniTezCliDriver("testCliDriver_join1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("leftsemijoin.q")) {
      suite.addTest(new TestMiniTezCliDriver("testCliDriver_leftsemijoin"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("limit_pushdown.q")) {
      suite.addTest(new TestMiniTezCliDriver("testCliDriver_limit_pushdown"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("load_dyn_part1.q")) {
      suite.addTest(new TestMiniTezCliDriver("testCliDriver_load_dyn_part1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("load_dyn_part2.q")) {
      suite.addTest(new TestMiniTezCliDriver("testCliDriver_load_dyn_part2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("load_dyn_part3.q")) {
      suite.addTest(new TestMiniTezCliDriver("testCliDriver_load_dyn_part3"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("mapjoin_decimal.q")) {
      suite.addTest(new TestMiniTezCliDriver("testCliDriver_mapjoin_decimal"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("mapjoin_mapjoin.q")) {
      suite.addTest(new TestMiniTezCliDriver("testCliDriver_mapjoin_mapjoin"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("mapreduce1.q")) {
      suite.addTest(new TestMiniTezCliDriver("testCliDriver_mapreduce1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("mapreduce2.q")) {
      suite.addTest(new TestMiniTezCliDriver("testCliDriver_mapreduce2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("merge1.q")) {
      suite.addTest(new TestMiniTezCliDriver("testCliDriver_merge1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("merge2.q")) {
      suite.addTest(new TestMiniTezCliDriver("testCliDriver_merge2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("metadata_only_queries.q")) {
      suite.addTest(new TestMiniTezCliDriver("testCliDriver_metadata_only_queries"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("mrr.q")) {
      suite.addTest(new TestMiniTezCliDriver("testCliDriver_mrr"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("orc_analyze.q")) {
      suite.addTest(new TestMiniTezCliDriver("testCliDriver_orc_analyze"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("ptf.q")) {
      suite.addTest(new TestMiniTezCliDriver("testCliDriver_ptf"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("sample1.q")) {
      suite.addTest(new TestMiniTezCliDriver("testCliDriver_sample1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("stats_counter.q")) {
      suite.addTest(new TestMiniTezCliDriver("testCliDriver_stats_counter"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("stats_counter_partitioned.q")) {
      suite.addTest(new TestMiniTezCliDriver("testCliDriver_stats_counter_partitioned"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("stats_noscan_1.q")) {
      suite.addTest(new TestMiniTezCliDriver("testCliDriver_stats_noscan_1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("subquery_exists.q")) {
      suite.addTest(new TestMiniTezCliDriver("testCliDriver_subquery_exists"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("subquery_in.q")) {
      suite.addTest(new TestMiniTezCliDriver("testCliDriver_subquery_in"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("tez_dml.q")) {
      suite.addTest(new TestMiniTezCliDriver("testCliDriver_tez_dml"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("tez_fsstat.q")) {
      suite.addTest(new TestMiniTezCliDriver("testCliDriver_tez_fsstat"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("tez_insert_overwrite_local_directory_1.q")) {
      suite.addTest(new TestMiniTezCliDriver("testCliDriver_tez_insert_overwrite_local_directory_1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("tez_join_tests.q")) {
      suite.addTest(new TestMiniTezCliDriver("testCliDriver_tez_join_tests"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("tez_joins_explain.q")) {
      suite.addTest(new TestMiniTezCliDriver("testCliDriver_tez_joins_explain"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("tez_schema_evolution.q")) {
      suite.addTest(new TestMiniTezCliDriver("testCliDriver_tez_schema_evolution"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("tez_union.q")) {
      suite.addTest(new TestMiniTezCliDriver("testCliDriver_tez_union"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("union2.q")) {
      suite.addTest(new TestMiniTezCliDriver("testCliDriver_union2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("union3.q")) {
      suite.addTest(new TestMiniTezCliDriver("testCliDriver_union3"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("union4.q")) {
      suite.addTest(new TestMiniTezCliDriver("testCliDriver_union4"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("union5.q")) {
      suite.addTest(new TestMiniTezCliDriver("testCliDriver_union5"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("union6.q")) {
      suite.addTest(new TestMiniTezCliDriver("testCliDriver_union6"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("union7.q")) {
      suite.addTest(new TestMiniTezCliDriver("testCliDriver_union7"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("union8.q")) {
      suite.addTest(new TestMiniTezCliDriver("testCliDriver_union8"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("union9.q")) {
      suite.addTest(new TestMiniTezCliDriver("testCliDriver_union9"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("vectorization_15.q")) {
      suite.addTest(new TestMiniTezCliDriver("testCliDriver_vectorization_15"));
    }
    suite.addTest(new TestMiniTezCliDriver("testCliDriver_shutdown"));
    return suite;
  }

  static String debugHint = "\nSee ./ql/target/tmp/log/hive.log or ./itests/qtest/target/tmp/log/hive.log, "
     + "or check ./ql/target/surefire-reports or ./itests/qtest/target/surefire-reports/ for specific test cases logs.";

  public void testCliDriver_auto_join0() throws Exception {
    runTest("auto_join0", "auto_join0.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/auto_join0.q"));
  }

  public void testCliDriver_auto_join1() throws Exception {
    runTest("auto_join1", "auto_join1.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/auto_join1.q"));
  }

  public void testCliDriver_bucket2() throws Exception {
    runTest("bucket2", "bucket2.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/bucket2.q"));
  }

  public void testCliDriver_bucket3() throws Exception {
    runTest("bucket3", "bucket3.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/bucket3.q"));
  }

  public void testCliDriver_bucket4() throws Exception {
    runTest("bucket4", "bucket4.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/bucket4.q"));
  }

  public void testCliDriver_bucket_map_join_tez1() throws Exception {
    runTest("bucket_map_join_tez1", "bucket_map_join_tez1.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/bucket_map_join_tez1.q"));
  }

  public void testCliDriver_bucket_map_join_tez2() throws Exception {
    runTest("bucket_map_join_tez2", "bucket_map_join_tez2.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/bucket_map_join_tez2.q"));
  }

  public void testCliDriver_count() throws Exception {
    runTest("count", "count.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/count.q"));
  }

  public void testCliDriver_create_merge_compressed() throws Exception {
    runTest("create_merge_compressed", "create_merge_compressed.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/create_merge_compressed.q"));
  }

  public void testCliDriver_cross_join() throws Exception {
    runTest("cross_join", "cross_join.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/cross_join.q"));
  }

  public void testCliDriver_cross_product_check_1() throws Exception {
    runTest("cross_product_check_1", "cross_product_check_1.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/cross_product_check_1.q"));
  }

  public void testCliDriver_cross_product_check_2() throws Exception {
    runTest("cross_product_check_2", "cross_product_check_2.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/cross_product_check_2.q"));
  }

  public void testCliDriver_ctas() throws Exception {
    runTest("ctas", "ctas.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/ctas.q"));
  }

  public void testCliDriver_custom_input_output_format() throws Exception {
    runTest("custom_input_output_format", "custom_input_output_format.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/custom_input_output_format.q"));
  }

  public void testCliDriver_disable_merge_for_bucketing() throws Exception {
    runTest("disable_merge_for_bucketing", "disable_merge_for_bucketing.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/disable_merge_for_bucketing.q"));
  }

  public void testCliDriver_dynpart_sort_opt_vectorization() throws Exception {
    runTest("dynpart_sort_opt_vectorization", "dynpart_sort_opt_vectorization.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/dynpart_sort_opt_vectorization.q"));
  }

  public void testCliDriver_dynpart_sort_optimization() throws Exception {
    runTest("dynpart_sort_optimization", "dynpart_sort_optimization.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/dynpart_sort_optimization.q"));
  }

  public void testCliDriver_enforce_order() throws Exception {
    runTest("enforce_order", "enforce_order.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/enforce_order.q"));
  }

  public void testCliDriver_filter_join_breaktask() throws Exception {
    runTest("filter_join_breaktask", "filter_join_breaktask.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/filter_join_breaktask.q"));
  }

  public void testCliDriver_filter_join_breaktask2() throws Exception {
    runTest("filter_join_breaktask2", "filter_join_breaktask2.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/filter_join_breaktask2.q"));
  }

  public void testCliDriver_groupby1() throws Exception {
    runTest("groupby1", "groupby1.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/groupby1.q"));
  }

  public void testCliDriver_groupby2() throws Exception {
    runTest("groupby2", "groupby2.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/groupby2.q"));
  }

  public void testCliDriver_groupby3() throws Exception {
    runTest("groupby3", "groupby3.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/groupby3.q"));
  }

  public void testCliDriver_having() throws Exception {
    runTest("having", "having.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/having.q"));
  }

  public void testCliDriver_insert1() throws Exception {
    runTest("insert1", "insert1.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/insert1.q"));
  }

  public void testCliDriver_insert_into1() throws Exception {
    runTest("insert_into1", "insert_into1.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/insert_into1.q"));
  }

  public void testCliDriver_insert_into2() throws Exception {
    runTest("insert_into2", "insert_into2.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/insert_into2.q"));
  }

  public void testCliDriver_join0() throws Exception {
    runTest("join0", "join0.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/join0.q"));
  }

  public void testCliDriver_join1() throws Exception {
    runTest("join1", "join1.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/join1.q"));
  }

  public void testCliDriver_leftsemijoin() throws Exception {
    runTest("leftsemijoin", "leftsemijoin.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/leftsemijoin.q"));
  }

  public void testCliDriver_limit_pushdown() throws Exception {
    runTest("limit_pushdown", "limit_pushdown.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/limit_pushdown.q"));
  }

  public void testCliDriver_load_dyn_part1() throws Exception {
    runTest("load_dyn_part1", "load_dyn_part1.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/load_dyn_part1.q"));
  }

  public void testCliDriver_load_dyn_part2() throws Exception {
    runTest("load_dyn_part2", "load_dyn_part2.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/load_dyn_part2.q"));
  }

  public void testCliDriver_load_dyn_part3() throws Exception {
    runTest("load_dyn_part3", "load_dyn_part3.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/load_dyn_part3.q"));
  }

  public void testCliDriver_mapjoin_decimal() throws Exception {
    runTest("mapjoin_decimal", "mapjoin_decimal.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/mapjoin_decimal.q"));
  }

  public void testCliDriver_mapjoin_mapjoin() throws Exception {
    runTest("mapjoin_mapjoin", "mapjoin_mapjoin.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/mapjoin_mapjoin.q"));
  }

  public void testCliDriver_mapreduce1() throws Exception {
    runTest("mapreduce1", "mapreduce1.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/mapreduce1.q"));
  }

  public void testCliDriver_mapreduce2() throws Exception {
    runTest("mapreduce2", "mapreduce2.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/mapreduce2.q"));
  }

  public void testCliDriver_merge1() throws Exception {
    runTest("merge1", "merge1.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/merge1.q"));
  }

  public void testCliDriver_merge2() throws Exception {
    runTest("merge2", "merge2.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/merge2.q"));
  }

  public void testCliDriver_metadata_only_queries() throws Exception {
    runTest("metadata_only_queries", "metadata_only_queries.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/metadata_only_queries.q"));
  }

  public void testCliDriver_mrr() throws Exception {
    runTest("mrr", "mrr.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/mrr.q"));
  }

  public void testCliDriver_orc_analyze() throws Exception {
    runTest("orc_analyze", "orc_analyze.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/orc_analyze.q"));
  }

  public void testCliDriver_ptf() throws Exception {
    runTest("ptf", "ptf.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/ptf.q"));
  }

  public void testCliDriver_sample1() throws Exception {
    runTest("sample1", "sample1.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/sample1.q"));
  }

  public void testCliDriver_stats_counter() throws Exception {
    runTest("stats_counter", "stats_counter.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/stats_counter.q"));
  }

  public void testCliDriver_stats_counter_partitioned() throws Exception {
    runTest("stats_counter_partitioned", "stats_counter_partitioned.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/stats_counter_partitioned.q"));
  }

  public void testCliDriver_stats_noscan_1() throws Exception {
    runTest("stats_noscan_1", "stats_noscan_1.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/stats_noscan_1.q"));
  }

  public void testCliDriver_subquery_exists() throws Exception {
    runTest("subquery_exists", "subquery_exists.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/subquery_exists.q"));
  }

  public void testCliDriver_subquery_in() throws Exception {
    runTest("subquery_in", "subquery_in.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/subquery_in.q"));
  }

  public void testCliDriver_tez_dml() throws Exception {
    runTest("tez_dml", "tez_dml.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/tez_dml.q"));
  }

  public void testCliDriver_tez_fsstat() throws Exception {
    runTest("tez_fsstat", "tez_fsstat.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/tez_fsstat.q"));
  }

  public void testCliDriver_tez_insert_overwrite_local_directory_1() throws Exception {
    runTest("tez_insert_overwrite_local_directory_1", "tez_insert_overwrite_local_directory_1.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/tez_insert_overwrite_local_directory_1.q"));
  }

  public void testCliDriver_tez_join_tests() throws Exception {
    runTest("tez_join_tests", "tez_join_tests.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/tez_join_tests.q"));
  }

  public void testCliDriver_tez_joins_explain() throws Exception {
    runTest("tez_joins_explain", "tez_joins_explain.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/tez_joins_explain.q"));
  }

  public void testCliDriver_tez_schema_evolution() throws Exception {
    runTest("tez_schema_evolution", "tez_schema_evolution.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/tez_schema_evolution.q"));
  }

  public void testCliDriver_tez_union() throws Exception {
    runTest("tez_union", "tez_union.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/tez_union.q"));
  }

  public void testCliDriver_union2() throws Exception {
    runTest("union2", "union2.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/union2.q"));
  }

  public void testCliDriver_union3() throws Exception {
    runTest("union3", "union3.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/union3.q"));
  }

  public void testCliDriver_union4() throws Exception {
    runTest("union4", "union4.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/union4.q"));
  }

  public void testCliDriver_union5() throws Exception {
    runTest("union5", "union5.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/union5.q"));
  }

  public void testCliDriver_union6() throws Exception {
    runTest("union6", "union6.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/union6.q"));
  }

  public void testCliDriver_union7() throws Exception {
    runTest("union7", "union7.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/union7.q"));
  }

  public void testCliDriver_union8() throws Exception {
    runTest("union8", "union8.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/union8.q"));
  }

  public void testCliDriver_union9() throws Exception {
    runTest("union9", "union9.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/union9.q"));
  }

  public void testCliDriver_vectorization_15() throws Exception {
    runTest("vectorization_15", "vectorization_15.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/vectorization_15.q"));
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
