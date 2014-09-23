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

public class TestCliDriver extends TestCase {

  private static final String HIVE_ROOT = QTestUtil.ensurePathEndsInSlash(System.getProperty("hive.root"));
  private static QTestUtil qt;

  static {

    MiniClusterType miniMR = MiniClusterType.valueForString("");
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

  public TestCliDriver(String name) {
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
    System.err.println ("Cleaning up " + "TestCliDriver");
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
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("add_part_exist.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_add_part_exist"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("add_part_multiple.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_add_part_multiple"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("add_partition_no_whitelist.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_add_partition_no_whitelist"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("add_partition_with_whitelist.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_add_partition_with_whitelist"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("alias_casted_column.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_alias_casted_column"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("allcolref_in_udf.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_allcolref_in_udf"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("alter1.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_alter1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("alter2.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_alter2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("alter3.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_alter3"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("alter4.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_alter4"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("alter5.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_alter5"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("alter_char1.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_alter_char1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("alter_char2.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_alter_char2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("alter_concatenate_indexed_table.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_alter_concatenate_indexed_table"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("alter_db_owner.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_alter_db_owner"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("alter_index.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_alter_index"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("alter_merge.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_alter_merge"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("alter_merge_2.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_alter_merge_2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("alter_merge_stats.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_alter_merge_stats"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("alter_numbuckets_partitioned_table.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_alter_numbuckets_partitioned_table"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("alter_numbuckets_partitioned_table2.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_alter_numbuckets_partitioned_table2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("alter_numbuckets_partitioned_table2_h23.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_alter_numbuckets_partitioned_table2_h23"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("alter_numbuckets_partitioned_table_h23.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_alter_numbuckets_partitioned_table_h23"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("alter_partition_clusterby_sortby.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_alter_partition_clusterby_sortby"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("alter_partition_coltype.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_alter_partition_coltype"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("alter_partition_format_loc.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_alter_partition_format_loc"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("alter_partition_protect_mode.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_alter_partition_protect_mode"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("alter_partition_with_whitelist.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_alter_partition_with_whitelist"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("alter_rename_partition.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_alter_rename_partition"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("alter_rename_partition_authorization.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_alter_rename_partition_authorization"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("alter_skewed_table.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_alter_skewed_table"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("alter_table_not_sorted.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_alter_table_not_sorted"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("alter_table_serde.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_alter_table_serde"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("alter_table_serde2.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_alter_table_serde2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("alter_varchar1.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_alter_varchar1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("alter_varchar2.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_alter_varchar2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("alter_view_as_select.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_alter_view_as_select"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("alter_view_rename.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_alter_view_rename"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("ambiguous_col.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_ambiguous_col"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("annotate_stats_filter.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_annotate_stats_filter"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("annotate_stats_groupby.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_annotate_stats_groupby"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("annotate_stats_join.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_annotate_stats_join"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("annotate_stats_limit.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_annotate_stats_limit"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("annotate_stats_part.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_annotate_stats_part"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("annotate_stats_select.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_annotate_stats_select"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("annotate_stats_table.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_annotate_stats_table"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("annotate_stats_union.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_annotate_stats_union"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("ansi_sql_arithmetic.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_ansi_sql_arithmetic"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("archive.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_archive"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("archive_corrupt.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_archive_corrupt"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("archive_excludeHadoop20.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_archive_excludeHadoop20"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("archive_multi.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_archive_multi"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("authorization_1.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_authorization_1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("authorization_1_sql_std.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_authorization_1_sql_std"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("authorization_2.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_authorization_2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("authorization_3.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_authorization_3"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("authorization_4.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_authorization_4"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("authorization_5.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_authorization_5"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("authorization_6.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_authorization_6"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("authorization_7.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_authorization_7"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("authorization_8.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_authorization_8"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("authorization_9.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_authorization_9"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("authorization_admin_almighty1.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_authorization_admin_almighty1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("authorization_create_func1.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_authorization_create_func1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("authorization_create_macro1.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_authorization_create_macro1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("authorization_create_table_owner_privs.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_authorization_create_table_owner_privs"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("authorization_grant_public_role.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_authorization_grant_public_role"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("authorization_grant_table_priv.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_authorization_grant_table_priv"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("authorization_index.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_authorization_index"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("authorization_owner_actions.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_authorization_owner_actions"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("authorization_owner_actions_db.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_authorization_owner_actions_db"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("authorization_parts.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_authorization_parts"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("authorization_revoke_table_priv.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_authorization_revoke_table_priv"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("authorization_role_grant1.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_authorization_role_grant1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("authorization_role_grant2.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_authorization_role_grant2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("authorization_set_show_current_role.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_authorization_set_show_current_role"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("authorization_view_sqlstd.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_authorization_view_sqlstd"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("auto_join0.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_auto_join0"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("auto_join1.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_auto_join1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("auto_join10.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_auto_join10"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("auto_join11.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_auto_join11"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("auto_join12.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_auto_join12"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("auto_join13.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_auto_join13"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("auto_join14.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_auto_join14"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("auto_join14_hadoop20.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_auto_join14_hadoop20"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("auto_join15.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_auto_join15"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("auto_join16.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_auto_join16"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("auto_join17.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_auto_join17"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("auto_join18.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_auto_join18"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("auto_join18_multi_distinct.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_auto_join18_multi_distinct"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("auto_join19.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_auto_join19"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("auto_join2.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_auto_join2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("auto_join20.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_auto_join20"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("auto_join21.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_auto_join21"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("auto_join22.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_auto_join22"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("auto_join23.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_auto_join23"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("auto_join24.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_auto_join24"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("auto_join25.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_auto_join25"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("auto_join26.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_auto_join26"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("auto_join27.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_auto_join27"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("auto_join28.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_auto_join28"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("auto_join29.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_auto_join29"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("auto_join3.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_auto_join3"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("auto_join30.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_auto_join30"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("auto_join31.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_auto_join31"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("auto_join32.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_auto_join32"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("auto_join4.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_auto_join4"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("auto_join5.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_auto_join5"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("auto_join6.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_auto_join6"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("auto_join7.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_auto_join7"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("auto_join8.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_auto_join8"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("auto_join9.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_auto_join9"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("auto_join_filters.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_auto_join_filters"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("auto_join_nulls.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_auto_join_nulls"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("auto_join_reordering_values.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_auto_join_reordering_values"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("auto_join_without_localtask.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_auto_join_without_localtask"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("auto_smb_mapjoin_14.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_auto_smb_mapjoin_14"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("auto_sortmerge_join_1.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_auto_sortmerge_join_1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("auto_sortmerge_join_10.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_auto_sortmerge_join_10"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("auto_sortmerge_join_11.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_auto_sortmerge_join_11"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("auto_sortmerge_join_12.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_auto_sortmerge_join_12"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("auto_sortmerge_join_13.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_auto_sortmerge_join_13"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("auto_sortmerge_join_14.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_auto_sortmerge_join_14"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("auto_sortmerge_join_15.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_auto_sortmerge_join_15"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("auto_sortmerge_join_2.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_auto_sortmerge_join_2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("auto_sortmerge_join_3.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_auto_sortmerge_join_3"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("auto_sortmerge_join_4.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_auto_sortmerge_join_4"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("auto_sortmerge_join_5.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_auto_sortmerge_join_5"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("auto_sortmerge_join_6.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_auto_sortmerge_join_6"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("auto_sortmerge_join_7.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_auto_sortmerge_join_7"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("auto_sortmerge_join_8.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_auto_sortmerge_join_8"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("auto_sortmerge_join_9.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_auto_sortmerge_join_9"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("autogen_colalias.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_autogen_colalias"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("avro_change_schema.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_avro_change_schema"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("avro_compression_enabled.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_avro_compression_enabled"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("avro_evolved_schemas.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_avro_evolved_schemas"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("avro_joins.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_avro_joins"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("avro_nullable_fields.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_avro_nullable_fields"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("avro_partitioned.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_avro_partitioned"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("avro_sanity_test.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_avro_sanity_test"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("avro_schema_error_message.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_avro_schema_error_message"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("avro_schema_literal.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_avro_schema_literal"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("ba_table1.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_ba_table1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("ba_table2.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_ba_table2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("ba_table3.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_ba_table3"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("ba_table_udfs.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_ba_table_udfs"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("ba_table_union.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_ba_table_union"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("binary_constant.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_binary_constant"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("binary_output_format.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_binary_output_format"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("binary_table_bincolserde.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_binary_table_bincolserde"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("binary_table_colserde.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_binary_table_colserde"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("binarysortable_1.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_binarysortable_1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("bucket1.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_bucket1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("bucket2.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_bucket2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("bucket3.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_bucket3"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("bucket_groupby.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_bucket_groupby"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("bucket_if_with_path_filter.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_bucket_if_with_path_filter"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("bucket_map_join_1.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_bucket_map_join_1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("bucket_map_join_2.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_bucket_map_join_2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("bucketcontext_1.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_bucketcontext_1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("bucketcontext_2.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_bucketcontext_2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("bucketcontext_3.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_bucketcontext_3"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("bucketcontext_4.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_bucketcontext_4"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("bucketcontext_5.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_bucketcontext_5"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("bucketcontext_6.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_bucketcontext_6"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("bucketcontext_7.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_bucketcontext_7"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("bucketcontext_8.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_bucketcontext_8"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("bucketizedhiveinputformat_auto.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_bucketizedhiveinputformat_auto"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("bucketmapjoin1.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_bucketmapjoin1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("bucketmapjoin10.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_bucketmapjoin10"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("bucketmapjoin11.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_bucketmapjoin11"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("bucketmapjoin12.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_bucketmapjoin12"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("bucketmapjoin13.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_bucketmapjoin13"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("bucketmapjoin2.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_bucketmapjoin2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("bucketmapjoin3.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_bucketmapjoin3"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("bucketmapjoin4.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_bucketmapjoin4"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("bucketmapjoin5.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_bucketmapjoin5"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("bucketmapjoin8.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_bucketmapjoin8"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("bucketmapjoin9.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_bucketmapjoin9"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("bucketmapjoin_negative.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_bucketmapjoin_negative"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("bucketmapjoin_negative2.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_bucketmapjoin_negative2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("bucketmapjoin_negative3.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_bucketmapjoin_negative3"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("bucketsortoptimize_insert_1.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_bucketsortoptimize_insert_1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("bucketsortoptimize_insert_2.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_bucketsortoptimize_insert_2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("bucketsortoptimize_insert_3.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_bucketsortoptimize_insert_3"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("bucketsortoptimize_insert_4.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_bucketsortoptimize_insert_4"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("bucketsortoptimize_insert_5.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_bucketsortoptimize_insert_5"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("bucketsortoptimize_insert_6.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_bucketsortoptimize_insert_6"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("bucketsortoptimize_insert_7.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_bucketsortoptimize_insert_7"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("bucketsortoptimize_insert_8.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_bucketsortoptimize_insert_8"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("case_sensitivity.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_case_sensitivity"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("cast1.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_cast1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("cast_to_int.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_cast_to_int"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("char_1.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_char_1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("char_2.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_char_2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("char_cast.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_char_cast"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("char_comparison.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_char_comparison"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("char_join1.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_char_join1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("char_nested_types.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_char_nested_types"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("char_serde.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_char_serde"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("char_udf1.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_char_udf1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("char_union1.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_char_union1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("char_varchar_udf.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_char_varchar_udf"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("cluster.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_cluster"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("column_access_stats.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_column_access_stats"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("columnarserde_create_shortcut.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_columnarserde_create_shortcut"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("columnstats_partlvl.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_columnstats_partlvl"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("columnstats_tbllvl.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_columnstats_tbllvl"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("combine1.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_combine1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("combine2.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_combine2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("combine2_hadoop20.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_combine2_hadoop20"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("combine2_win.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_combine2_win"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("combine3.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_combine3"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("compile_processor.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_compile_processor"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("compute_stats_binary.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_compute_stats_binary"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("compute_stats_boolean.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_compute_stats_boolean"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("compute_stats_decimal.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_compute_stats_decimal"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("compute_stats_double.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_compute_stats_double"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("compute_stats_empty_table.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_compute_stats_empty_table"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("compute_stats_long.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_compute_stats_long"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("compute_stats_string.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_compute_stats_string"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("concatenate_inherit_table_location.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_concatenate_inherit_table_location"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("constant_prop.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_constant_prop"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("convert_enum_to_string.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_convert_enum_to_string"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("correlationoptimizer1.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_correlationoptimizer1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("correlationoptimizer10.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_correlationoptimizer10"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("correlationoptimizer11.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_correlationoptimizer11"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("correlationoptimizer12.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_correlationoptimizer12"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("correlationoptimizer13.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_correlationoptimizer13"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("correlationoptimizer14.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_correlationoptimizer14"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("correlationoptimizer15.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_correlationoptimizer15"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("correlationoptimizer2.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_correlationoptimizer2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("correlationoptimizer3.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_correlationoptimizer3"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("correlationoptimizer4.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_correlationoptimizer4"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("correlationoptimizer5.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_correlationoptimizer5"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("correlationoptimizer6.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_correlationoptimizer6"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("correlationoptimizer7.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_correlationoptimizer7"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("correlationoptimizer8.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_correlationoptimizer8"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("correlationoptimizer9.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_correlationoptimizer9"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("count.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_count"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("cp_mj_rc.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_cp_mj_rc"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("create_1.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_create_1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("create_alter_list_bucketing_table1.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_create_alter_list_bucketing_table1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("create_big_view.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_create_big_view"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("create_default_prop.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_create_default_prop"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("create_escape.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_create_escape"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("create_func1.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_create_func1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("create_genericudaf.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_create_genericudaf"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("create_genericudf.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_create_genericudf"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("create_insert_outputformat.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_create_insert_outputformat"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("create_like.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_create_like"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("create_like2.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_create_like2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("create_like_tbl_props.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_create_like_tbl_props"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("create_like_view.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_create_like_view"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("create_merge_compressed.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_create_merge_compressed"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("create_nested_type.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_create_nested_type"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("create_or_replace_view.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_create_or_replace_view"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("create_skewed_table1.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_create_skewed_table1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("create_struct_table.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_create_struct_table"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("create_udaf.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_create_udaf"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("create_union_table.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_create_union_table"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("create_view.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_create_view"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("create_view_partitioned.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_create_view_partitioned"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("create_view_translate.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_create_view_translate"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("cross_join.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_cross_join"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("cross_product_check_1.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_cross_product_check_1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("cross_product_check_2.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_cross_product_check_2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("ct_case_insensitive.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_ct_case_insensitive"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("ctas.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_ctas"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("ctas_char.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_ctas_char"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("ctas_colname.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_ctas_colname"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("ctas_date.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_ctas_date"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("ctas_hadoop20.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_ctas_hadoop20"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("ctas_uses_database_location.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_ctas_uses_database_location"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("ctas_varchar.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_ctas_varchar"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("cte_1.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_cte_1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("cte_2.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_cte_2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("custom_input_output_format.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_custom_input_output_format"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("database.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_database"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("database_drop.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_database_drop"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("database_location.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_database_location"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("database_properties.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_database_properties"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("date_1.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_date_1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("date_2.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_date_2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("date_3.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_date_3"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("date_4.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_date_4"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("date_comparison.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_date_comparison"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("date_join1.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_date_join1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("date_serde.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_date_serde"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("date_udf.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_date_udf"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("dbtxnmgr_compact1.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_dbtxnmgr_compact1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("dbtxnmgr_compact2.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_dbtxnmgr_compact2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("dbtxnmgr_compact3.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_dbtxnmgr_compact3"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("dbtxnmgr_ddl1.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_dbtxnmgr_ddl1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("dbtxnmgr_query1.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_dbtxnmgr_query1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("dbtxnmgr_query2.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_dbtxnmgr_query2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("dbtxnmgr_query3.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_dbtxnmgr_query3"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("dbtxnmgr_query4.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_dbtxnmgr_query4"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("dbtxnmgr_query5.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_dbtxnmgr_query5"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("dbtxnmgr_showlocks.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_dbtxnmgr_showlocks"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("ddltime.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_ddltime"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("decimal_1.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_decimal_1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("decimal_2.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_decimal_2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("decimal_3.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_decimal_3"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("decimal_4.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_decimal_4"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("decimal_5.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_decimal_5"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("decimal_6.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_decimal_6"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("decimal_join.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_decimal_join"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("decimal_precision.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_decimal_precision"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("decimal_serde.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_decimal_serde"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("decimal_udf.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_decimal_udf"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("default_partition_name.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_default_partition_name"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("delimiter.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_delimiter"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("desc_non_existent_tbl.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_desc_non_existent_tbl"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("desc_tbl_part_cols.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_desc_tbl_part_cols"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("describe_comment_indent.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_describe_comment_indent"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("describe_comment_nonascii.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_describe_comment_nonascii"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("describe_database_json.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_describe_database_json"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("describe_formatted_view_partitioned.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_describe_formatted_view_partitioned"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("describe_formatted_view_partitioned_json.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_describe_formatted_view_partitioned_json"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("describe_pretty.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_describe_pretty"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("describe_syntax.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_describe_syntax"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("describe_table.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_describe_table"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("describe_table_json.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_describe_table_json"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("describe_xpath.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_describe_xpath"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("diff_part_input_formats.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_diff_part_input_formats"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("disable_file_format_check.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_disable_file_format_check"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("disallow_incompatible_type_change_off.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_disallow_incompatible_type_change_off"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("distinct_stats.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_distinct_stats"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("driverhook.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_driverhook"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("drop_database_removes_partition_dirs.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_drop_database_removes_partition_dirs"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("drop_function.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_drop_function"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("drop_index.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_drop_index"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("drop_index_removes_partition_dirs.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_drop_index_removes_partition_dirs"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("drop_multi_partitions.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_drop_multi_partitions"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("drop_partitions_filter.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_drop_partitions_filter"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("drop_partitions_filter2.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_drop_partitions_filter2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("drop_partitions_filter3.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_drop_partitions_filter3"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("drop_partitions_ignore_protection.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_drop_partitions_ignore_protection"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("drop_table.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_drop_table"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("drop_table2.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_drop_table2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("drop_table_removes_partition_dirs.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_drop_table_removes_partition_dirs"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("drop_udf.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_drop_udf"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("drop_view.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_drop_view"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("drop_with_concurrency.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_drop_with_concurrency"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("dynamic_partition_skip_default.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_dynamic_partition_skip_default"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("dynpart_sort_opt_vectorization.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_dynpart_sort_opt_vectorization"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("dynpart_sort_optimization.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_dynpart_sort_optimization"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("enforce_order.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_enforce_order"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("escape1.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_escape1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("escape2.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_escape2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("escape_clusterby1.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_escape_clusterby1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("escape_distributeby1.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_escape_distributeby1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("escape_orderby1.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_escape_orderby1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("escape_sortby1.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_escape_sortby1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("exchange_partition.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_exchange_partition"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("exchange_partition2.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_exchange_partition2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("exchange_partition3.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_exchange_partition3"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("exim_00_nonpart_empty.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_exim_00_nonpart_empty"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("exim_01_nonpart.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_exim_01_nonpart"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("exim_02_00_part_empty.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_exim_02_00_part_empty"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("exim_02_part.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_exim_02_part"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("exim_03_nonpart_over_compat.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_exim_03_nonpart_over_compat"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("exim_04_all_part.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_exim_04_all_part"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("exim_04_evolved_parts.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_exim_04_evolved_parts"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("exim_05_some_part.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_exim_05_some_part"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("exim_06_one_part.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_exim_06_one_part"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("exim_07_all_part_over_nonoverlap.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_exim_07_all_part_over_nonoverlap"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("exim_08_nonpart_rename.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_exim_08_nonpart_rename"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("exim_09_part_spec_nonoverlap.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_exim_09_part_spec_nonoverlap"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("exim_10_external_managed.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_exim_10_external_managed"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("exim_11_managed_external.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_exim_11_managed_external"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("exim_12_external_location.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_exim_12_external_location"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("exim_13_managed_location.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_exim_13_managed_location"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("exim_14_managed_location_over_existing.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_exim_14_managed_location_over_existing"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("exim_15_external_part.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_exim_15_external_part"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("exim_16_part_external.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_exim_16_part_external"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("exim_17_part_managed.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_exim_17_part_managed"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("exim_18_part_external.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_exim_18_part_external"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("exim_19_00_part_external_location.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_exim_19_00_part_external_location"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("exim_19_part_external_location.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_exim_19_part_external_location"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("exim_20_part_managed_location.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_exim_20_part_managed_location"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("exim_21_export_authsuccess.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_exim_21_export_authsuccess"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("exim_22_import_exist_authsuccess.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_exim_22_import_exist_authsuccess"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("exim_23_import_part_authsuccess.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_exim_23_import_part_authsuccess"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("exim_24_import_nonexist_authsuccess.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_exim_24_import_nonexist_authsuccess"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("exim_hidden_files.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_exim_hidden_files"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("explain_dependency.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_explain_dependency"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("explain_dependency2.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_explain_dependency2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("explain_logical.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_explain_logical"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("explain_rearrange.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_explain_rearrange"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("explode_null.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_explode_null"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("fetch_aggregation.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_fetch_aggregation"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("fileformat_mix.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_fileformat_mix"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("fileformat_sequencefile.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_fileformat_sequencefile"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("fileformat_text.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_fileformat_text"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("filter_join_breaktask.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_filter_join_breaktask"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("filter_join_breaktask2.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_filter_join_breaktask2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("filter_numeric.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_filter_numeric"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("global_limit.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_global_limit"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("groupby1.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_groupby1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("groupby10.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_groupby10"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("groupby11.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_groupby11"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("groupby12.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_groupby12"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("groupby1_limit.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_groupby1_limit"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("groupby1_map.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_groupby1_map"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("groupby1_map_nomap.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_groupby1_map_nomap"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("groupby1_map_skew.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_groupby1_map_skew"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("groupby1_noskew.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_groupby1_noskew"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("groupby2_limit.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_groupby2_limit"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("groupby2_map.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_groupby2_map"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("groupby2_map_multi_distinct.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_groupby2_map_multi_distinct"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("groupby2_map_skew.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_groupby2_map_skew"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("groupby2_noskew.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_groupby2_noskew"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("groupby2_noskew_multi_distinct.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_groupby2_noskew_multi_distinct"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("groupby3.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_groupby3"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("groupby3_map.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_groupby3_map"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("groupby3_map_multi_distinct.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_groupby3_map_multi_distinct"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("groupby3_map_skew.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_groupby3_map_skew"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("groupby3_noskew.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_groupby3_noskew"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("groupby3_noskew_multi_distinct.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_groupby3_noskew_multi_distinct"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("groupby4.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_groupby4"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("groupby4_map.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_groupby4_map"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("groupby4_map_skew.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_groupby4_map_skew"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("groupby4_noskew.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_groupby4_noskew"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("groupby5.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_groupby5"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("groupby5_map.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_groupby5_map"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("groupby5_map_skew.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_groupby5_map_skew"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("groupby5_noskew.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_groupby5_noskew"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("groupby6.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_groupby6"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("groupby6_map.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_groupby6_map"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("groupby6_map_skew.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_groupby6_map_skew"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("groupby6_noskew.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_groupby6_noskew"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("groupby7.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_groupby7"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("groupby7_map.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_groupby7_map"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("groupby7_map_multi_single_reducer.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_groupby7_map_multi_single_reducer"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("groupby7_map_skew.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_groupby7_map_skew"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("groupby7_noskew.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_groupby7_noskew"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("groupby7_noskew_multi_single_reducer.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_groupby7_noskew_multi_single_reducer"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("groupby8.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_groupby8"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("groupby8_map.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_groupby8_map"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("groupby8_map_skew.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_groupby8_map_skew"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("groupby8_noskew.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_groupby8_noskew"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("groupby9.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_groupby9"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("groupby_bigdata.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_groupby_bigdata"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("groupby_complex_types.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_groupby_complex_types"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("groupby_complex_types_multi_single_reducer.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_groupby_complex_types_multi_single_reducer"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("groupby_cube1.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_groupby_cube1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("groupby_distinct_samekey.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_groupby_distinct_samekey"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("groupby_grouping_id1.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_groupby_grouping_id1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("groupby_grouping_id2.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_groupby_grouping_id2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("groupby_grouping_sets1.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_groupby_grouping_sets1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("groupby_grouping_sets2.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_groupby_grouping_sets2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("groupby_grouping_sets3.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_groupby_grouping_sets3"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("groupby_grouping_sets4.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_groupby_grouping_sets4"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("groupby_grouping_sets5.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_groupby_grouping_sets5"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("groupby_map_ppr.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_groupby_map_ppr"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("groupby_map_ppr_multi_distinct.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_groupby_map_ppr_multi_distinct"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("groupby_multi_insert_common_distinct.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_groupby_multi_insert_common_distinct"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("groupby_multi_single_reducer.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_groupby_multi_single_reducer"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("groupby_multi_single_reducer2.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_groupby_multi_single_reducer2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("groupby_multi_single_reducer3.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_groupby_multi_single_reducer3"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("groupby_mutli_insert_common_distinct.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_groupby_mutli_insert_common_distinct"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("groupby_neg_float.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_groupby_neg_float"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("groupby_position.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_groupby_position"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("groupby_ppd.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_groupby_ppd"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("groupby_ppr.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_groupby_ppr"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("groupby_ppr_multi_distinct.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_groupby_ppr_multi_distinct"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("groupby_resolution.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_groupby_resolution"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("groupby_rollup1.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_groupby_rollup1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("groupby_sort_1.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_groupby_sort_1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("groupby_sort_10.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_groupby_sort_10"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("groupby_sort_11.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_groupby_sort_11"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("groupby_sort_2.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_groupby_sort_2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("groupby_sort_3.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_groupby_sort_3"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("groupby_sort_4.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_groupby_sort_4"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("groupby_sort_5.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_groupby_sort_5"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("groupby_sort_6.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_groupby_sort_6"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("groupby_sort_7.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_groupby_sort_7"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("groupby_sort_8.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_groupby_sort_8"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("groupby_sort_9.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_groupby_sort_9"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("groupby_sort_skew_1.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_groupby_sort_skew_1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("groupby_sort_test_1.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_groupby_sort_test_1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("having.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_having"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("hook_context_cs.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_hook_context_cs"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("hook_order.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_hook_order"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("implicit_cast1.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_implicit_cast1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("index_auth.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_index_auth"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("index_auto.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_index_auto"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("index_auto_empty.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_index_auto_empty"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("index_auto_file_format.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_index_auto_file_format"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("index_auto_mult_tables.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_index_auto_mult_tables"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("index_auto_mult_tables_compact.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_index_auto_mult_tables_compact"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("index_auto_multiple.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_index_auto_multiple"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("index_auto_partitioned.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_index_auto_partitioned"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("index_auto_self_join.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_index_auto_self_join"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("index_auto_unused.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_index_auto_unused"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("index_auto_update.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_index_auto_update"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("index_bitmap.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_index_bitmap"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("index_bitmap1.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_index_bitmap1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("index_bitmap2.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_index_bitmap2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("index_bitmap_auto_partitioned.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_index_bitmap_auto_partitioned"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("index_bitmap_compression.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_index_bitmap_compression"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("index_bitmap_rc.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_index_bitmap_rc"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("index_compact.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_index_compact"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("index_compact_1.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_index_compact_1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("index_compact_2.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_index_compact_2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("index_compact_3.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_index_compact_3"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("index_compact_binary_search.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_index_compact_binary_search"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("index_compression.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_index_compression"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("index_creation.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_index_creation"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("index_serde.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_index_serde"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("index_stale.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_index_stale"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("index_stale_partitioned.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_index_stale_partitioned"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("infer_bucket_sort.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_infer_bucket_sort"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("infer_bucket_sort_convert_join.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_infer_bucket_sort_convert_join"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("infer_bucket_sort_grouping_operators.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_infer_bucket_sort_grouping_operators"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("infer_bucket_sort_list_bucket.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_infer_bucket_sort_list_bucket"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("infer_bucket_sort_multi_insert.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_infer_bucket_sort_multi_insert"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("infer_const_type.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_infer_const_type"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("init_file.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_init_file"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("innerjoin.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_innerjoin"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("inoutdriver.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_inoutdriver"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("input.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_input"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("input0.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_input0"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("input1.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_input1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("input10.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_input10"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("input11.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_input11"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("input11_limit.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_input11_limit"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("input12.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_input12"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("input12_hadoop20.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_input12_hadoop20"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("input13.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_input13"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("input14.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_input14"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("input14_limit.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_input14_limit"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("input15.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_input15"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("input16.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_input16"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("input17.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_input17"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("input18.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_input18"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("input19.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_input19"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("input1_limit.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_input1_limit"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("input2.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_input2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("input20.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_input20"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("input21.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_input21"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("input22.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_input22"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("input23.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_input23"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("input24.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_input24"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("input25.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_input25"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("input26.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_input26"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("input28.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_input28"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("input2_limit.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_input2_limit"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("input3.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_input3"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("input30.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_input30"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("input31.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_input31"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("input32.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_input32"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("input33.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_input33"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("input34.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_input34"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("input35.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_input35"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("input36.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_input36"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("input37.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_input37"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("input38.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_input38"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("input39.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_input39"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("input39_hadoop20.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_input39_hadoop20"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("input3_limit.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_input3_limit"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("input4.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_input4"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("input40.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_input40"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("input41.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_input41"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("input42.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_input42"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("input43.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_input43"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("input44.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_input44"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("input45.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_input45"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("input46.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_input46"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("input49.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_input49"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("input4_cb_delim.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_input4_cb_delim"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("input4_limit.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_input4_limit"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("input5.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_input5"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("input6.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_input6"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("input7.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_input7"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("input8.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_input8"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("input9.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_input9"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("input_columnarserde.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_input_columnarserde"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("input_dfs.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_input_dfs"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("input_dynamicserde.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_input_dynamicserde"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("input_lazyserde.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_input_lazyserde"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("input_limit.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_input_limit"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("input_part0.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_input_part0"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("input_part1.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_input_part1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("input_part10.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_input_part10"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("input_part10_win.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_input_part10_win"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("input_part2.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_input_part2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("input_part3.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_input_part3"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("input_part4.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_input_part4"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("input_part5.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_input_part5"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("input_part6.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_input_part6"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("input_part7.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_input_part7"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("input_part8.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_input_part8"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("input_part9.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_input_part9"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("input_testsequencefile.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_input_testsequencefile"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("input_testxpath.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_input_testxpath"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("input_testxpath2.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_input_testxpath2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("input_testxpath3.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_input_testxpath3"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("input_testxpath4.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_input_testxpath4"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("inputddl1.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_inputddl1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("inputddl2.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_inputddl2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("inputddl3.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_inputddl3"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("inputddl4.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_inputddl4"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("inputddl5.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_inputddl5"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("inputddl6.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_inputddl6"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("inputddl7.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_inputddl7"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("inputddl8.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_inputddl8"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("insert1.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_insert1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("insert1_overwrite_partitions.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_insert1_overwrite_partitions"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("insert2_overwrite_partitions.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_insert2_overwrite_partitions"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("insert_compressed.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_insert_compressed"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("insert_into1.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_insert_into1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("insert_into2.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_insert_into2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("insert_into3.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_insert_into3"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("insert_into4.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_insert_into4"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("insert_into5.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_insert_into5"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("insert_into6.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_insert_into6"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("insert_overwrite_local_directory_1.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_insert_overwrite_local_directory_1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("insertexternal1.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_insertexternal1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("join0.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_join0"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("join10.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_join10"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("join11.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_join11"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("join12.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_join12"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("join13.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_join13"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("join14.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_join14"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("join14_hadoop20.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_join14_hadoop20"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("join15.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_join15"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("join16.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_join16"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("join17.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_join17"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("join18.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_join18"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("join18_multi_distinct.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_join18_multi_distinct"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("join19.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_join19"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("join2.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_join2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("join20.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_join20"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("join21.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_join21"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("join22.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_join22"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("join23.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_join23"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("join24.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_join24"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("join25.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_join25"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("join26.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_join26"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("join27.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_join27"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("join28.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_join28"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("join29.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_join29"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("join3.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_join3"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("join30.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_join30"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("join31.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_join31"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("join32.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_join32"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("join32_lessSize.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_join32_lessSize"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("join33.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_join33"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("join34.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_join34"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("join35.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_join35"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("join36.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_join36"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("join37.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_join37"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("join38.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_join38"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("join39.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_join39"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("join4.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_join4"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("join40.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_join40"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("join41.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_join41"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("join5.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_join5"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("join6.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_join6"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("join7.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_join7"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("join8.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_join8"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("join9.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_join9"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("join_1to1.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_join_1to1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("join_alt_syntax.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_join_alt_syntax"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("join_array.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_join_array"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("join_casesensitive.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_join_casesensitive"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("join_cond_pushdown_1.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_join_cond_pushdown_1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("join_cond_pushdown_2.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_join_cond_pushdown_2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("join_cond_pushdown_3.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_join_cond_pushdown_3"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("join_cond_pushdown_4.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_join_cond_pushdown_4"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("join_cond_pushdown_unqual1.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_join_cond_pushdown_unqual1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("join_cond_pushdown_unqual2.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_join_cond_pushdown_unqual2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("join_cond_pushdown_unqual3.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_join_cond_pushdown_unqual3"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("join_cond_pushdown_unqual4.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_join_cond_pushdown_unqual4"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("join_empty.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_join_empty"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("join_filters.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_join_filters"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("join_filters_overlap.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_join_filters_overlap"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("join_hive_626.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_join_hive_626"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("join_literals.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_join_literals"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("join_map_ppr.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_join_map_ppr"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("join_merging.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_join_merging"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("join_nulls.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_join_nulls"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("join_nullsafe.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_join_nullsafe"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("join_rc.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_join_rc"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("join_reorder.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_join_reorder"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("join_reorder2.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_join_reorder2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("join_reorder3.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_join_reorder3"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("join_reorder4.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_join_reorder4"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("join_star.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_join_star"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("join_thrift.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_join_thrift"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("join_vc.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_join_vc"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("join_view.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_join_view"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("keyword_1.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_keyword_1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("lateral_view.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_lateral_view"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("lateral_view_cp.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_lateral_view_cp"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("lateral_view_noalias.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_lateral_view_noalias"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("lateral_view_outer.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_lateral_view_outer"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("lateral_view_ppd.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_lateral_view_ppd"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("lb_fs_stats.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_lb_fs_stats"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("leadlag.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_leadlag"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("leadlag_queries.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_leadlag_queries"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("leftsemijoin.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_leftsemijoin"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("limit_partition_metadataonly.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_limit_partition_metadataonly"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("limit_pushdown.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_limit_pushdown"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("limit_pushdown_negative.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_limit_pushdown_negative"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("lineage1.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_lineage1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("list_bucket_dml_1.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_list_bucket_dml_1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("list_bucket_dml_11.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_list_bucket_dml_11"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("list_bucket_dml_12.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_list_bucket_dml_12"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("list_bucket_dml_13.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_list_bucket_dml_13"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("list_bucket_dml_2.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_list_bucket_dml_2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("list_bucket_dml_3.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_list_bucket_dml_3"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("list_bucket_dml_4.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_list_bucket_dml_4"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("list_bucket_dml_5.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_list_bucket_dml_5"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("list_bucket_dml_6.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_list_bucket_dml_6"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("list_bucket_dml_7.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_list_bucket_dml_7"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("list_bucket_dml_8.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_list_bucket_dml_8"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("list_bucket_dml_9.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_list_bucket_dml_9"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("list_bucket_query_multiskew_1.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_list_bucket_query_multiskew_1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("list_bucket_query_multiskew_2.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_list_bucket_query_multiskew_2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("list_bucket_query_multiskew_3.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_list_bucket_query_multiskew_3"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("list_bucket_query_oneskew_1.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_list_bucket_query_oneskew_1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("list_bucket_query_oneskew_2.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_list_bucket_query_oneskew_2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("list_bucket_query_oneskew_3.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_list_bucket_query_oneskew_3"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("literal_decimal.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_literal_decimal"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("literal_double.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_literal_double"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("literal_ints.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_literal_ints"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("literal_string.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_literal_string"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("load_binary_data.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_load_binary_data"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("load_dyn_part1.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_load_dyn_part1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("load_dyn_part10.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_load_dyn_part10"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("load_dyn_part11.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_load_dyn_part11"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("load_dyn_part12.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_load_dyn_part12"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("load_dyn_part13.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_load_dyn_part13"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("load_dyn_part14.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_load_dyn_part14"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("load_dyn_part14_win.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_load_dyn_part14_win"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("load_dyn_part15.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_load_dyn_part15"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("load_dyn_part2.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_load_dyn_part2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("load_dyn_part3.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_load_dyn_part3"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("load_dyn_part4.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_load_dyn_part4"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("load_dyn_part5.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_load_dyn_part5"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("load_dyn_part6.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_load_dyn_part6"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("load_dyn_part7.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_load_dyn_part7"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("load_dyn_part8.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_load_dyn_part8"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("load_dyn_part9.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_load_dyn_part9"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("load_exist_part_authsuccess.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_load_exist_part_authsuccess"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("load_file_with_space_in_the_name.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_load_file_with_space_in_the_name"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("load_fs.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_load_fs"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("load_fs_overwrite.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_load_fs_overwrite"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("load_nonpart_authsuccess.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_load_nonpart_authsuccess"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("load_overwrite.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_load_overwrite"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("load_part_authsuccess.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_load_part_authsuccess"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("loadpart1.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_loadpart1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("loadpart2.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_loadpart2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("loadpart_err.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_loadpart_err"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("lock1.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_lock1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("lock2.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_lock2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("lock3.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_lock3"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("lock4.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_lock4"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("louter_join_ppr.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_louter_join_ppr"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("macro.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_macro"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("mapjoin1.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_mapjoin1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("mapjoin_addjar.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_mapjoin_addjar"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("mapjoin_distinct.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_mapjoin_distinct"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("mapjoin_filter_on_outerjoin.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_mapjoin_filter_on_outerjoin"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("mapjoin_hook.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_mapjoin_hook"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("mapjoin_mapjoin.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_mapjoin_mapjoin"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("mapjoin_memcheck.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_mapjoin_memcheck"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("mapjoin_subquery.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_mapjoin_subquery"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("mapjoin_subquery2.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_mapjoin_subquery2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("mapjoin_test_outer.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_mapjoin_test_outer"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("mapreduce1.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_mapreduce1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("mapreduce2.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_mapreduce2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("mapreduce3.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_mapreduce3"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("mapreduce4.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_mapreduce4"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("mapreduce5.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_mapreduce5"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("mapreduce6.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_mapreduce6"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("mapreduce7.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_mapreduce7"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("mapreduce8.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_mapreduce8"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("merge1.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_merge1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("merge2.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_merge2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("merge3.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_merge3"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("merge4.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_merge4"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("merge_dynamic_partition.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_merge_dynamic_partition"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("merge_dynamic_partition2.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_merge_dynamic_partition2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("merge_dynamic_partition3.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_merge_dynamic_partition3"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("merge_dynamic_partition4.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_merge_dynamic_partition4"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("merge_dynamic_partition5.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_merge_dynamic_partition5"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("mergejoins.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_mergejoins"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("mergejoins_mixed.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_mergejoins_mixed"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("metadata_export_drop.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_metadata_export_drop"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("metadata_only_queries.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_metadata_only_queries"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("metadata_only_queries_with_filters.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_metadata_only_queries_with_filters"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("metadataonly1.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_metadataonly1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("mi.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_mi"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("misc_json.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_misc_json"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("multiMapJoin1.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_multiMapJoin1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("multiMapJoin2.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_multiMapJoin2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("multi_insert.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_multi_insert"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("multi_insert_gby.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_multi_insert_gby"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("multi_insert_gby2.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_multi_insert_gby2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("multi_insert_gby3.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_multi_insert_gby3"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("multi_insert_lateral_view.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_multi_insert_lateral_view"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("multi_insert_move_tasks_share_dependencies.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_multi_insert_move_tasks_share_dependencies"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("multi_join_union.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_multi_join_union"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("multi_sahooks.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_multi_sahooks"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("multigroupby_singlemr.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_multigroupby_singlemr"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("nested_complex.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_nested_complex"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("nestedvirtual.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_nestedvirtual"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("newline.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_newline"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("no_hooks.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_no_hooks"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("noalias_subq1.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_noalias_subq1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("nomore_ambiguous_table_col.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_nomore_ambiguous_table_col"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("nonblock_op_deduplicate.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_nonblock_op_deduplicate"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("nonmr_fetch.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_nonmr_fetch"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("nonmr_fetch_threshold.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_nonmr_fetch_threshold"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("nonreserved_keywords_input37.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_nonreserved_keywords_input37"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("nonreserved_keywords_insert_into1.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_nonreserved_keywords_insert_into1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("notable_alias1.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_notable_alias1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("notable_alias2.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_notable_alias2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("notable_alias3.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_notable_alias3"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("null_cast.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_null_cast"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("null_column.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_null_column"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("nullformat.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_nullformat"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("nullformatCTAS.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_nullformatCTAS"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("nullformatdir.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_nullformatdir"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("nullgroup.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_nullgroup"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("nullgroup2.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_nullgroup2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("nullgroup3.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_nullgroup3"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("nullgroup4.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_nullgroup4"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("nullgroup4_multi_distinct.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_nullgroup4_multi_distinct"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("nullgroup5.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_nullgroup5"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("nullinput.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_nullinput"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("nullinput2.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_nullinput2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("nullscript.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_nullscript"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("num_op_type_conv.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_num_op_type_conv"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("ops_comparison.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_ops_comparison"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("optional_outer.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_optional_outer"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("orc_analyze.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_orc_analyze"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("orc_create.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_orc_create"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("orc_createas1.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_orc_createas1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("orc_dictionary_threshold.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_orc_dictionary_threshold"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("orc_diff_part_cols.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_orc_diff_part_cols"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("orc_diff_part_cols2.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_orc_diff_part_cols2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("orc_empty_files.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_orc_empty_files"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("orc_empty_strings.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_orc_empty_strings"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("orc_ends_with_nulls.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_orc_ends_with_nulls"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("orc_min_max.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_orc_min_max"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("orc_ppd_char.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_orc_ppd_char"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("orc_ppd_date.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_orc_ppd_date"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("orc_ppd_decimal.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_orc_ppd_decimal"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("orc_ppd_varchar.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_orc_ppd_varchar"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("orc_predicate_pushdown.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_orc_predicate_pushdown"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("orc_split_elimination.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_orc_split_elimination"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("orc_vectorization_ppd.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_orc_vectorization_ppd"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("order.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_order"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("order2.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_order2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("order_within_subquery.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_order_within_subquery"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("outer_join_ppr.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_outer_join_ppr"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("overridden_confs.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_overridden_confs"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("parallel.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_parallel"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("parenthesis_star_by.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_parenthesis_star_by"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("parquet_create.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_parquet_create"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("parquet_ctas.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_parquet_ctas"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("parquet_partitioned.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_parquet_partitioned"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("parquet_types.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_parquet_types"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("partInit.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_partInit"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("part_inherit_tbl_props.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_part_inherit_tbl_props"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("part_inherit_tbl_props_empty.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_part_inherit_tbl_props_empty"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("part_inherit_tbl_props_with_star.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_part_inherit_tbl_props_with_star"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("partcols1.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_partcols1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("partition_date.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_partition_date"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("partition_date2.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_partition_date2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("partition_decode_name.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_partition_decode_name"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("partition_schema1.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_partition_schema1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("partition_serde_format.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_partition_serde_format"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("partition_special_char.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_partition_special_char"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("partition_type_check.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_partition_type_check"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("partition_varchar1.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_partition_varchar1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("partition_varchar2.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_partition_varchar2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("partition_vs_table_metadata.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_partition_vs_table_metadata"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("partition_wise_fileformat.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_partition_wise_fileformat"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("partition_wise_fileformat10.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_partition_wise_fileformat10"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("partition_wise_fileformat11.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_partition_wise_fileformat11"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("partition_wise_fileformat12.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_partition_wise_fileformat12"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("partition_wise_fileformat13.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_partition_wise_fileformat13"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("partition_wise_fileformat14.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_partition_wise_fileformat14"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("partition_wise_fileformat15.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_partition_wise_fileformat15"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("partition_wise_fileformat16.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_partition_wise_fileformat16"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("partition_wise_fileformat17.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_partition_wise_fileformat17"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("partition_wise_fileformat18.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_partition_wise_fileformat18"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("partition_wise_fileformat2.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_partition_wise_fileformat2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("partition_wise_fileformat3.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_partition_wise_fileformat3"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("partition_wise_fileformat4.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_partition_wise_fileformat4"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("partition_wise_fileformat5.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_partition_wise_fileformat5"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("partition_wise_fileformat6.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_partition_wise_fileformat6"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("partition_wise_fileformat7.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_partition_wise_fileformat7"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("partition_wise_fileformat8.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_partition_wise_fileformat8"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("partition_wise_fileformat9.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_partition_wise_fileformat9"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("partitions_json.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_partitions_json"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("pcr.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_pcr"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("plan_json.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_plan_json"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("ppd1.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_ppd1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("ppd2.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_ppd2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("ppd_clusterby.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_ppd_clusterby"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("ppd_constant_expr.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_ppd_constant_expr"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("ppd_constant_where.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_ppd_constant_where"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("ppd_gby.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_ppd_gby"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("ppd_gby2.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_ppd_gby2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("ppd_gby_join.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_ppd_gby_join"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("ppd_join.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_ppd_join"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("ppd_join2.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_ppd_join2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("ppd_join3.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_ppd_join3"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("ppd_join4.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_ppd_join4"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("ppd_join_filter.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_ppd_join_filter"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("ppd_multi_insert.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_ppd_multi_insert"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("ppd_outer_join1.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_ppd_outer_join1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("ppd_outer_join2.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_ppd_outer_join2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("ppd_outer_join3.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_ppd_outer_join3"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("ppd_outer_join4.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_ppd_outer_join4"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("ppd_outer_join5.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_ppd_outer_join5"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("ppd_random.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_ppd_random"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("ppd_repeated_alias.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_ppd_repeated_alias"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("ppd_transform.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_ppd_transform"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("ppd_udf_case.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_ppd_udf_case"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("ppd_udf_col.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_ppd_udf_col"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("ppd_udtf.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_ppd_udtf"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("ppd_union.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_ppd_union"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("ppd_union_view.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_ppd_union_view"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("ppd_vc.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_ppd_vc"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("ppr_allchildsarenull.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_ppr_allchildsarenull"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("ppr_pushdown.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_ppr_pushdown"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("ppr_pushdown2.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_ppr_pushdown2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("ppr_pushdown3.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_ppr_pushdown3"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("print_header.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_print_header"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("progress_1.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_progress_1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("protectmode.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_protectmode"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("protectmode2.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_protectmode2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("ptf.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_ptf"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("ptf_decimal.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_ptf_decimal"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("ptf_general_queries.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_ptf_general_queries"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("ptf_matchpath.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_ptf_matchpath"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("ptf_rcfile.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_ptf_rcfile"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("ptf_register_tblfn.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_ptf_register_tblfn"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("ptf_seqfile.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_ptf_seqfile"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("push_or.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_push_or"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("query_properties.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_query_properties"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("query_result_fileformat.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_query_result_fileformat"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("query_with_semi.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_query_with_semi"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("quote1.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_quote1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("quote2.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_quote2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("quotedid_alter.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_quotedid_alter"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("quotedid_basic.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_quotedid_basic"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("quotedid_partition.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_quotedid_partition"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("quotedid_skew.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_quotedid_skew"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("quotedid_tblproperty.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_quotedid_tblproperty"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("rand_partitionpruner1.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_rand_partitionpruner1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("rand_partitionpruner2.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_rand_partitionpruner2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("rand_partitionpruner3.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_rand_partitionpruner3"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("rcfile_bigdata.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_rcfile_bigdata"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("rcfile_columnar.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_rcfile_columnar"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("rcfile_createas1.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_rcfile_createas1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("rcfile_default_format.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_rcfile_default_format"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("rcfile_lazydecompress.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_rcfile_lazydecompress"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("rcfile_merge1.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_rcfile_merge1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("rcfile_merge2.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_rcfile_merge2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("rcfile_merge3.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_rcfile_merge3"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("rcfile_merge4.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_rcfile_merge4"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("rcfile_null_value.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_rcfile_null_value"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("rcfile_toleratecorruptions.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_rcfile_toleratecorruptions"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("rcfile_union.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_rcfile_union"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("recursive_dir.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_recursive_dir"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("reduce_deduplicate_exclude_gby.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_reduce_deduplicate_exclude_gby"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("reduce_deduplicate_exclude_join.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_reduce_deduplicate_exclude_join"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("reduce_deduplicate_extended.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_reduce_deduplicate_extended"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("reducesink_dedup.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_reducesink_dedup"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("regex_col.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_regex_col"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("regexp_extract.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_regexp_extract"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("rename_column.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_rename_column"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("rename_external_partition_location.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_rename_external_partition_location"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("rename_partition_location.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_rename_partition_location"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("rename_table_location.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_rename_table_location"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("repair.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_repair"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("reset_conf.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_reset_conf"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("router_join_ppr.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_router_join_ppr"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("sample1.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_sample1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("sample10.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_sample10"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("sample2.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_sample2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("sample3.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_sample3"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("sample4.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_sample4"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("sample5.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_sample5"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("sample6.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_sample6"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("sample7.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_sample7"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("sample8.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_sample8"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("sample9.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_sample9"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("sample_islocalmode_hook.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_sample_islocalmode_hook"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("sample_islocalmode_hook_hadoop20.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_sample_islocalmode_hook_hadoop20"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("script_env_var1.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_script_env_var1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("script_env_var2.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_script_env_var2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("script_pipe.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_script_pipe"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("select_as_omitted.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_select_as_omitted"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("select_dummy_source.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_select_dummy_source"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("select_transform_hint.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_select_transform_hint"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("select_unquote_and.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_select_unquote_and"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("select_unquote_not.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_select_unquote_not"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("select_unquote_or.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_select_unquote_or"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("semicolon.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_semicolon"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("semijoin.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_semijoin"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("serde_regex.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_serde_regex"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("serde_reported_schema.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_serde_reported_schema"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("serde_user_properties.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_serde_user_properties"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("set_processor_namespaces.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_set_processor_namespaces"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("set_variable_sub.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_set_variable_sub"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("show_columns.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_show_columns"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("show_create_table_alter.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_show_create_table_alter"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("show_create_table_db_table.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_show_create_table_db_table"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("show_create_table_delimited.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_show_create_table_delimited"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("show_create_table_partitioned.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_show_create_table_partitioned"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("show_create_table_serde.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_show_create_table_serde"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("show_create_table_view.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_show_create_table_view"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("show_describe_func_quotes.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_show_describe_func_quotes"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("show_functions.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_show_functions"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("show_indexes_edge_cases.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_show_indexes_edge_cases"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("show_indexes_syntax.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_show_indexes_syntax"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("show_partitions.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_show_partitions"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("show_roles.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_show_roles"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("show_tables.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_show_tables"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("show_tablestatus.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_show_tablestatus"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("show_tblproperties.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_show_tblproperties"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("showparts.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_showparts"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("skewjoin.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_skewjoin"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("skewjoin_noskew.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_skewjoin_noskew"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("skewjoin_union_remove_1.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_skewjoin_union_remove_1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("skewjoin_union_remove_2.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_skewjoin_union_remove_2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("skewjoinopt1.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_skewjoinopt1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("skewjoinopt10.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_skewjoinopt10"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("skewjoinopt11.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_skewjoinopt11"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("skewjoinopt12.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_skewjoinopt12"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("skewjoinopt13.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_skewjoinopt13"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("skewjoinopt14.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_skewjoinopt14"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("skewjoinopt15.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_skewjoinopt15"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("skewjoinopt16.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_skewjoinopt16"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("skewjoinopt17.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_skewjoinopt17"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("skewjoinopt18.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_skewjoinopt18"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("skewjoinopt19.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_skewjoinopt19"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("skewjoinopt2.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_skewjoinopt2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("skewjoinopt20.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_skewjoinopt20"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("skewjoinopt3.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_skewjoinopt3"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("skewjoinopt4.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_skewjoinopt4"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("skewjoinopt5.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_skewjoinopt5"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("skewjoinopt6.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_skewjoinopt6"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("skewjoinopt7.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_skewjoinopt7"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("skewjoinopt8.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_skewjoinopt8"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("skewjoinopt9.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_skewjoinopt9"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("smb_mapjoin9.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_smb_mapjoin9"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("smb_mapjoin_1.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_smb_mapjoin_1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("smb_mapjoin_10.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_smb_mapjoin_10"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("smb_mapjoin_11.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_smb_mapjoin_11"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("smb_mapjoin_12.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_smb_mapjoin_12"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("smb_mapjoin_13.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_smb_mapjoin_13"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("smb_mapjoin_14.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_smb_mapjoin_14"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("smb_mapjoin_15.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_smb_mapjoin_15"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("smb_mapjoin_16.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_smb_mapjoin_16"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("smb_mapjoin_17.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_smb_mapjoin_17"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("smb_mapjoin_18.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_smb_mapjoin_18"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("smb_mapjoin_19.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_smb_mapjoin_19"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("smb_mapjoin_2.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_smb_mapjoin_2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("smb_mapjoin_20.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_smb_mapjoin_20"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("smb_mapjoin_21.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_smb_mapjoin_21"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("smb_mapjoin_22.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_smb_mapjoin_22"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("smb_mapjoin_25.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_smb_mapjoin_25"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("smb_mapjoin_3.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_smb_mapjoin_3"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("smb_mapjoin_4.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_smb_mapjoin_4"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("smb_mapjoin_5.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_smb_mapjoin_5"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("smb_mapjoin_6.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_smb_mapjoin_6"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("smb_mapjoin_7.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_smb_mapjoin_7"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("sort.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_sort"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("sort_merge_join_desc_1.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_sort_merge_join_desc_1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("sort_merge_join_desc_2.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_sort_merge_join_desc_2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("sort_merge_join_desc_3.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_sort_merge_join_desc_3"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("sort_merge_join_desc_4.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_sort_merge_join_desc_4"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("sort_merge_join_desc_5.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_sort_merge_join_desc_5"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("sort_merge_join_desc_6.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_sort_merge_join_desc_6"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("sort_merge_join_desc_7.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_sort_merge_join_desc_7"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("source.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_source"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("split.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_split"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("split_sample.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_split_sample"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("stats0.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_stats0"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("stats1.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_stats1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("stats10.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_stats10"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("stats11.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_stats11"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("stats12.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_stats12"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("stats13.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_stats13"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("stats14.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_stats14"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("stats15.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_stats15"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("stats16.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_stats16"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("stats18.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_stats18"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("stats19.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_stats19"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("stats2.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_stats2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("stats20.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_stats20"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("stats3.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_stats3"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("stats4.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_stats4"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("stats5.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_stats5"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("stats6.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_stats6"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("stats7.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_stats7"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("stats8.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_stats8"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("stats9.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_stats9"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("stats_aggregator_error_1.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_stats_aggregator_error_1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("stats_empty_dyn_part.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_stats_empty_dyn_part"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("stats_empty_partition.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_stats_empty_partition"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("stats_invalidation.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_stats_invalidation"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("stats_list_bucket.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_stats_list_bucket"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("stats_noscan_1.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_stats_noscan_1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("stats_noscan_2.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_stats_noscan_2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("stats_only_null.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_stats_only_null"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("stats_partscan_1.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_stats_partscan_1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("stats_partscan_1_23.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_stats_partscan_1_23"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("stats_publisher_error_1.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_stats_publisher_error_1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("statsfs.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_statsfs"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("str_to_map.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_str_to_map"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("subq.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_subq"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("subq2.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_subq2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("subq_where_serialization.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_subq_where_serialization"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("subquery_alias.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_subquery_alias"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("subquery_exists.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_subquery_exists"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("subquery_exists_having.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_subquery_exists_having"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("subquery_in.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_subquery_in"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("subquery_in_having.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_subquery_in_having"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("subquery_multiinsert.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_subquery_multiinsert"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("subquery_notexists.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_subquery_notexists"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("subquery_notexists_having.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_subquery_notexists_having"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("subquery_notin.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_subquery_notin"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("subquery_notin_having.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_subquery_notin_having"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("subquery_unqualcolumnrefs.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_subquery_unqualcolumnrefs"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("subquery_views.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_subquery_views"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("symlink_text_input_format.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_symlink_text_input_format"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("table_access_keys_stats.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_table_access_keys_stats"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("tablename_with_select.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_tablename_with_select"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("test_boolean_whereclause.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_test_boolean_whereclause"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("timestamp_1.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_timestamp_1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("timestamp_2.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_timestamp_2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("timestamp_3.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_timestamp_3"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("timestamp_comparison.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_timestamp_comparison"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("timestamp_lazy.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_timestamp_lazy"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("timestamp_null.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_timestamp_null"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("timestamp_udf.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_timestamp_udf"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("touch.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_touch"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("transform1.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_transform1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("transform2.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_transform2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("transform_ppr1.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_transform_ppr1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("transform_ppr2.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_transform_ppr2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("truncate_column.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_truncate_column"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("truncate_column_list_bucket.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_truncate_column_list_bucket"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("truncate_column_merge.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_truncate_column_merge"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("truncate_table.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_truncate_table"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("type_cast_1.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_type_cast_1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("type_conversions_1.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_type_conversions_1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("type_widening.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_type_widening"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udaf_collect_set.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udaf_collect_set"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udaf_context_ngrams.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udaf_context_ngrams"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udaf_corr.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udaf_corr"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udaf_covar_pop.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udaf_covar_pop"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udaf_covar_samp.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udaf_covar_samp"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udaf_histogram_numeric.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udaf_histogram_numeric"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udaf_ngrams.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udaf_ngrams"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udaf_number_format.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udaf_number_format"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udaf_percentile.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udaf_percentile"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udaf_percentile_approx_20.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udaf_percentile_approx_20"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udaf_percentile_approx_23.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udaf_percentile_approx_23"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udaf_sum_list.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udaf_sum_list"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf1.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf2.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf3.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf3"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf4.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf4"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf5.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf5"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf6.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf6"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf7.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf7"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf8.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf8"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf9.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf9"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_10_trims.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf_10_trims"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_E.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf_E"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_PI.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf_PI"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_abs.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf_abs"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_acos.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf_acos"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_add.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf_add"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_array.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf_array"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_array_contains.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf_array_contains"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_ascii.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf_ascii"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_asin.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf_asin"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_atan.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf_atan"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_avg.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf_avg"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_between.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf_between"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_bigint.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf_bigint"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_bin.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf_bin"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_bitmap_and.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf_bitmap_and"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_bitmap_empty.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf_bitmap_empty"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_bitmap_or.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf_bitmap_or"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_bitwise_and.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf_bitwise_and"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_bitwise_not.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf_bitwise_not"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_bitwise_or.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf_bitwise_or"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_bitwise_xor.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf_bitwise_xor"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_boolean.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf_boolean"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_case.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf_case"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_case_column_pruning.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf_case_column_pruning"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_case_thrift.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf_case_thrift"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_ceil.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf_ceil"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_ceiling.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf_ceiling"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_coalesce.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf_coalesce"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_compare_java_string.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf_compare_java_string"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_concat.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf_concat"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_concat_insert1.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf_concat_insert1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_concat_insert2.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf_concat_insert2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_concat_ws.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf_concat_ws"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_context_aware.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf_context_aware"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_conv.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf_conv"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_cos.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf_cos"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_count.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf_count"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_current_database.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf_current_database"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_date_add.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf_date_add"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_date_sub.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf_date_sub"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_datediff.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf_datediff"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_day.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf_day"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_dayofmonth.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf_dayofmonth"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_degrees.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf_degrees"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_div.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf_div"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_divide.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf_divide"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_double.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf_double"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_elt.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf_elt"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_equal.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf_equal"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_exp.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf_exp"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_explode.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf_explode"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_field.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf_field"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_find_in_set.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf_find_in_set"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_float.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf_float"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_floor.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf_floor"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_format_number.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf_format_number"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_from_unixtime.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf_from_unixtime"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_get_json_object.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf_get_json_object"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_greaterthan.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf_greaterthan"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_greaterthanorequal.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf_greaterthanorequal"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_hash.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf_hash"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_hex.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf_hex"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_hour.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf_hour"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_if.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf_if"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_in.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf_in"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_in_file.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf_in_file"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_index.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf_index"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_inline.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf_inline"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_instr.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf_instr"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_int.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf_int"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_isnotnull.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf_isnotnull"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_isnull.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf_isnull"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_isnull_isnotnull.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf_isnull_isnotnull"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_java_method.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf_java_method"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_lcase.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf_lcase"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_length.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf_length"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_lessthan.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf_lessthan"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_lessthanorequal.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf_lessthanorequal"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_like.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf_like"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_ln.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf_ln"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_locate.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf_locate"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_log.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf_log"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_log10.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf_log10"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_log2.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf_log2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_logic_java_boolean.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf_logic_java_boolean"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_lower.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf_lower"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_lpad.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf_lpad"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_ltrim.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf_ltrim"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_map.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf_map"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_map_keys.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf_map_keys"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_map_values.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf_map_values"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_max.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf_max"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_min.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf_min"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_minute.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf_minute"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_modulo.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf_modulo"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_month.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf_month"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_named_struct.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf_named_struct"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_negative.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf_negative"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_not.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf_not"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_notequal.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf_notequal"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_notop.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf_notop"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_nvl.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf_nvl"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_or.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf_or"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_parse_url.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf_parse_url"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_percentile.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf_percentile"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_pmod.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf_pmod"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_positive.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf_positive"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_pow.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf_pow"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_power.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf_power"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_printf.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf_printf"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_radians.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf_radians"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_rand.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf_rand"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_reflect.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf_reflect"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_reflect2.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf_reflect2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_regexp.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf_regexp"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_regexp_extract.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf_regexp_extract"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_regexp_replace.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf_regexp_replace"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_repeat.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf_repeat"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_reverse.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf_reverse"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_rlike.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf_rlike"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_round.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf_round"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_round_2.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf_round_2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_round_3.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf_round_3"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_rpad.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf_rpad"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_rtrim.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf_rtrim"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_second.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf_second"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_sentences.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf_sentences"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_sign.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf_sign"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_sin.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf_sin"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_size.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf_size"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_smallint.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf_smallint"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_sort_array.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf_sort_array"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_space.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf_space"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_split.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf_split"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_sqrt.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf_sqrt"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_std.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf_std"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_stddev.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf_stddev"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_stddev_pop.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf_stddev_pop"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_stddev_samp.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf_stddev_samp"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_string.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf_string"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_struct.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf_struct"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_substr.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf_substr"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_substring.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf_substring"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_subtract.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf_subtract"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_sum.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf_sum"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_tan.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf_tan"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_testlength.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf_testlength"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_testlength2.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf_testlength2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_tinyint.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf_tinyint"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_to_boolean.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf_to_boolean"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_to_byte.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf_to_byte"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_to_date.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf_to_date"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_to_double.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf_to_double"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_to_float.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf_to_float"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_to_long.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf_to_long"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_to_short.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf_to_short"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_to_string.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf_to_string"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_to_unix_timestamp.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf_to_unix_timestamp"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_translate.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf_translate"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_trim.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf_trim"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_ucase.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf_ucase"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_unhex.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf_unhex"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_union.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf_union"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_unix_timestamp.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf_unix_timestamp"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_upper.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf_upper"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_var_pop.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf_var_pop"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_var_samp.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf_var_samp"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_variance.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf_variance"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_weekofyear.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf_weekofyear"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_when.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf_when"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_xpath.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf_xpath"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_xpath_boolean.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf_xpath_boolean"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_xpath_double.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf_xpath_double"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_xpath_float.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf_xpath_float"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_xpath_int.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf_xpath_int"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_xpath_long.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf_xpath_long"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_xpath_short.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf_xpath_short"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_xpath_string.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udf_xpath_string"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udtf_explode.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udtf_explode"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udtf_json_tuple.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udtf_json_tuple"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udtf_parse_url_tuple.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udtf_parse_url_tuple"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udtf_posexplode.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udtf_posexplode"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udtf_stack.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_udtf_stack"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("unicode_notation.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_unicode_notation"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("union.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_union"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("union10.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_union10"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("union11.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_union11"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("union12.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_union12"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("union13.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_union13"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("union14.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_union14"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("union15.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_union15"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("union16.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_union16"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("union17.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_union17"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("union18.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_union18"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("union19.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_union19"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("union2.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_union2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("union20.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_union20"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("union21.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_union21"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("union22.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_union22"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("union23.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_union23"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("union24.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_union24"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("union25.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_union25"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("union26.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_union26"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("union27.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_union27"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("union28.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_union28"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("union29.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_union29"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("union3.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_union3"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("union30.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_union30"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("union31.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_union31"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("union32.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_union32"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("union33.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_union33"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("union34.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_union34"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("union4.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_union4"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("union5.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_union5"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("union6.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_union6"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("union7.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_union7"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("union8.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_union8"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("union9.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_union9"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("union_date.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_union_date"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("union_lateralview.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_union_lateralview"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("union_null.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_union_null"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("union_ppr.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_union_ppr"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("union_remove_1.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_union_remove_1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("union_remove_10.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_union_remove_10"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("union_remove_11.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_union_remove_11"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("union_remove_12.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_union_remove_12"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("union_remove_13.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_union_remove_13"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("union_remove_14.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_union_remove_14"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("union_remove_15.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_union_remove_15"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("union_remove_16.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_union_remove_16"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("union_remove_17.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_union_remove_17"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("union_remove_18.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_union_remove_18"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("union_remove_19.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_union_remove_19"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("union_remove_2.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_union_remove_2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("union_remove_20.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_union_remove_20"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("union_remove_21.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_union_remove_21"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("union_remove_22.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_union_remove_22"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("union_remove_23.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_union_remove_23"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("union_remove_24.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_union_remove_24"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("union_remove_3.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_union_remove_3"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("union_remove_4.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_union_remove_4"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("union_remove_5.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_union_remove_5"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("union_remove_6.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_union_remove_6"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("union_remove_7.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_union_remove_7"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("union_remove_8.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_union_remove_8"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("union_remove_9.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_union_remove_9"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("union_script.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_union_script"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("union_top_level.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_union_top_level"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("union_view.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_union_view"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("uniquejoin.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_uniquejoin"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("unset_table_view_property.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_unset_table_view_property"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("updateAccessTime.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_updateAccessTime"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("varchar_1.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_varchar_1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("varchar_2.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_varchar_2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("varchar_cast.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_varchar_cast"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("varchar_comparison.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_varchar_comparison"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("varchar_join1.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_varchar_join1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("varchar_nested_types.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_varchar_nested_types"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("varchar_serde.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_varchar_serde"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("varchar_udf1.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_varchar_udf1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("varchar_union1.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_varchar_union1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("vector_between_in.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_vector_between_in"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("vector_coalesce.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_vector_coalesce"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("vector_decimal_aggregate.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_vector_decimal_aggregate"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("vector_decimal_cast.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_vector_decimal_cast"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("vector_decimal_expressions.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_vector_decimal_expressions"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("vector_decimal_mapjoin.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_vector_decimal_mapjoin"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("vector_decimal_math_funcs.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_vector_decimal_math_funcs"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("vector_left_outer_join.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_vector_left_outer_join"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("vector_non_string_partition.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_vector_non_string_partition"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("vectorization_0.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_vectorization_0"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("vectorization_1.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_vectorization_1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("vectorization_10.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_vectorization_10"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("vectorization_11.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_vectorization_11"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("vectorization_12.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_vectorization_12"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("vectorization_13.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_vectorization_13"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("vectorization_14.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_vectorization_14"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("vectorization_15.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_vectorization_15"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("vectorization_16.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_vectorization_16"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("vectorization_2.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_vectorization_2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("vectorization_3.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_vectorization_3"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("vectorization_4.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_vectorization_4"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("vectorization_5.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_vectorization_5"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("vectorization_6.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_vectorization_6"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("vectorization_7.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_vectorization_7"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("vectorization_8.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_vectorization_8"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("vectorization_9.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_vectorization_9"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("vectorization_decimal_date.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_vectorization_decimal_date"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("vectorization_div0.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_vectorization_div0"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("vectorization_limit.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_vectorization_limit"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("vectorization_nested_udf.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_vectorization_nested_udf"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("vectorization_not.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_vectorization_not"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("vectorization_part.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_vectorization_part"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("vectorization_part_project.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_vectorization_part_project"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("vectorization_pushdown.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_vectorization_pushdown"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("vectorization_short_regress.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_vectorization_short_regress"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("vectorized_bucketmapjoin1.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_vectorized_bucketmapjoin1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("vectorized_case.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_vectorized_case"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("vectorized_casts.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_vectorized_casts"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("vectorized_context.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_vectorized_context"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("vectorized_date_funcs.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_vectorized_date_funcs"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("vectorized_distinct_gby.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_vectorized_distinct_gby"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("vectorized_mapjoin.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_vectorized_mapjoin"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("vectorized_math_funcs.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_vectorized_math_funcs"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("vectorized_nested_mapjoin.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_vectorized_nested_mapjoin"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("vectorized_rcfile_columnar.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_vectorized_rcfile_columnar"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("vectorized_shufflejoin.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_vectorized_shufflejoin"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("vectorized_string_funcs.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_vectorized_string_funcs"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("vectorized_timestamp_funcs.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_vectorized_timestamp_funcs"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("view.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_view"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("view_cast.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_view_cast"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("view_inputs.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_view_inputs"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("virtual_column.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_virtual_column"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("windowing.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_windowing"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("windowing_adjust_rowcontainer_sz.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_windowing_adjust_rowcontainer_sz"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("windowing_columnPruning.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_windowing_columnPruning"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("windowing_expressions.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_windowing_expressions"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("windowing_multipartitioning.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_windowing_multipartitioning"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("windowing_navfn.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_windowing_navfn"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("windowing_ntile.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_windowing_ntile"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("windowing_rank.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_windowing_rank"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("windowing_udaf.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_windowing_udaf"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("windowing_udaf2.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_windowing_udaf2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("windowing_windowspec.q")) {
      suite.addTest(new TestCliDriver("testCliDriver_windowing_windowspec"));
    }
    suite.addTest(new TestCliDriver("testCliDriver_shutdown"));
    return suite;
  }

  static String debugHint = "\nSee ./ql/target/tmp/log/hive.log or ./itests/qtest/target/tmp/log/hive.log, "
     + "or check ./ql/target/surefire-reports or ./itests/qtest/target/surefire-reports/ for specific test cases logs.";

  public void testCliDriver_add_part_exist() throws Exception {
    runTest("add_part_exist", "add_part_exist.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/add_part_exist.q"));
  }

  public void testCliDriver_add_part_multiple() throws Exception {
    runTest("add_part_multiple", "add_part_multiple.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/add_part_multiple.q"));
  }

  public void testCliDriver_add_partition_no_whitelist() throws Exception {
    runTest("add_partition_no_whitelist", "add_partition_no_whitelist.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/add_partition_no_whitelist.q"));
  }

  public void testCliDriver_add_partition_with_whitelist() throws Exception {
    runTest("add_partition_with_whitelist", "add_partition_with_whitelist.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/add_partition_with_whitelist.q"));
  }

  public void testCliDriver_alias_casted_column() throws Exception {
    runTest("alias_casted_column", "alias_casted_column.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/alias_casted_column.q"));
  }

  public void testCliDriver_allcolref_in_udf() throws Exception {
    runTest("allcolref_in_udf", "allcolref_in_udf.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/allcolref_in_udf.q"));
  }

  public void testCliDriver_alter1() throws Exception {
    runTest("alter1", "alter1.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/alter1.q"));
  }

  public void testCliDriver_alter2() throws Exception {
    runTest("alter2", "alter2.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/alter2.q"));
  }

  public void testCliDriver_alter3() throws Exception {
    runTest("alter3", "alter3.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/alter3.q"));
  }

  public void testCliDriver_alter4() throws Exception {
    runTest("alter4", "alter4.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/alter4.q"));
  }

  public void testCliDriver_alter5() throws Exception {
    runTest("alter5", "alter5.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/alter5.q"));
  }

  public void testCliDriver_alter_char1() throws Exception {
    runTest("alter_char1", "alter_char1.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/alter_char1.q"));
  }

  public void testCliDriver_alter_char2() throws Exception {
    runTest("alter_char2", "alter_char2.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/alter_char2.q"));
  }

  public void testCliDriver_alter_concatenate_indexed_table() throws Exception {
    runTest("alter_concatenate_indexed_table", "alter_concatenate_indexed_table.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/alter_concatenate_indexed_table.q"));
  }

  public void testCliDriver_alter_db_owner() throws Exception {
    runTest("alter_db_owner", "alter_db_owner.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/alter_db_owner.q"));
  }

  public void testCliDriver_alter_index() throws Exception {
    runTest("alter_index", "alter_index.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/alter_index.q"));
  }

  public void testCliDriver_alter_merge() throws Exception {
    runTest("alter_merge", "alter_merge.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/alter_merge.q"));
  }

  public void testCliDriver_alter_merge_2() throws Exception {
    runTest("alter_merge_2", "alter_merge_2.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/alter_merge_2.q"));
  }

  public void testCliDriver_alter_merge_stats() throws Exception {
    runTest("alter_merge_stats", "alter_merge_stats.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/alter_merge_stats.q"));
  }

  public void testCliDriver_alter_numbuckets_partitioned_table() throws Exception {
    runTest("alter_numbuckets_partitioned_table", "alter_numbuckets_partitioned_table.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/alter_numbuckets_partitioned_table.q"));
  }

  public void testCliDriver_alter_numbuckets_partitioned_table2() throws Exception {
    runTest("alter_numbuckets_partitioned_table2", "alter_numbuckets_partitioned_table2.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/alter_numbuckets_partitioned_table2.q"));
  }

  public void testCliDriver_alter_numbuckets_partitioned_table2_h23() throws Exception {
    runTest("alter_numbuckets_partitioned_table2_h23", "alter_numbuckets_partitioned_table2_h23.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/alter_numbuckets_partitioned_table2_h23.q"));
  }

  public void testCliDriver_alter_numbuckets_partitioned_table_h23() throws Exception {
    runTest("alter_numbuckets_partitioned_table_h23", "alter_numbuckets_partitioned_table_h23.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/alter_numbuckets_partitioned_table_h23.q"));
  }

  public void testCliDriver_alter_partition_clusterby_sortby() throws Exception {
    runTest("alter_partition_clusterby_sortby", "alter_partition_clusterby_sortby.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/alter_partition_clusterby_sortby.q"));
  }

  public void testCliDriver_alter_partition_coltype() throws Exception {
    runTest("alter_partition_coltype", "alter_partition_coltype.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/alter_partition_coltype.q"));
  }

  public void testCliDriver_alter_partition_format_loc() throws Exception {
    runTest("alter_partition_format_loc", "alter_partition_format_loc.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/alter_partition_format_loc.q"));
  }

  public void testCliDriver_alter_partition_protect_mode() throws Exception {
    runTest("alter_partition_protect_mode", "alter_partition_protect_mode.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/alter_partition_protect_mode.q"));
  }

  public void testCliDriver_alter_partition_with_whitelist() throws Exception {
    runTest("alter_partition_with_whitelist", "alter_partition_with_whitelist.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/alter_partition_with_whitelist.q"));
  }

  public void testCliDriver_alter_rename_partition() throws Exception {
    runTest("alter_rename_partition", "alter_rename_partition.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/alter_rename_partition.q"));
  }

  public void testCliDriver_alter_rename_partition_authorization() throws Exception {
    runTest("alter_rename_partition_authorization", "alter_rename_partition_authorization.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/alter_rename_partition_authorization.q"));
  }

  public void testCliDriver_alter_skewed_table() throws Exception {
    runTest("alter_skewed_table", "alter_skewed_table.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/alter_skewed_table.q"));
  }

  public void testCliDriver_alter_table_not_sorted() throws Exception {
    runTest("alter_table_not_sorted", "alter_table_not_sorted.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/alter_table_not_sorted.q"));
  }

  public void testCliDriver_alter_table_serde() throws Exception {
    runTest("alter_table_serde", "alter_table_serde.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/alter_table_serde.q"));
  }

  public void testCliDriver_alter_table_serde2() throws Exception {
    runTest("alter_table_serde2", "alter_table_serde2.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/alter_table_serde2.q"));
  }

  public void testCliDriver_alter_varchar1() throws Exception {
    runTest("alter_varchar1", "alter_varchar1.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/alter_varchar1.q"));
  }

  public void testCliDriver_alter_varchar2() throws Exception {
    runTest("alter_varchar2", "alter_varchar2.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/alter_varchar2.q"));
  }

  public void testCliDriver_alter_view_as_select() throws Exception {
    runTest("alter_view_as_select", "alter_view_as_select.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/alter_view_as_select.q"));
  }

  public void testCliDriver_alter_view_rename() throws Exception {
    runTest("alter_view_rename", "alter_view_rename.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/alter_view_rename.q"));
  }

  public void testCliDriver_ambiguous_col() throws Exception {
    runTest("ambiguous_col", "ambiguous_col.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/ambiguous_col.q"));
  }

  public void testCliDriver_annotate_stats_filter() throws Exception {
    runTest("annotate_stats_filter", "annotate_stats_filter.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/annotate_stats_filter.q"));
  }

  public void testCliDriver_annotate_stats_groupby() throws Exception {
    runTest("annotate_stats_groupby", "annotate_stats_groupby.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/annotate_stats_groupby.q"));
  }

  public void testCliDriver_annotate_stats_join() throws Exception {
    runTest("annotate_stats_join", "annotate_stats_join.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/annotate_stats_join.q"));
  }

  public void testCliDriver_annotate_stats_limit() throws Exception {
    runTest("annotate_stats_limit", "annotate_stats_limit.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/annotate_stats_limit.q"));
  }

  public void testCliDriver_annotate_stats_part() throws Exception {
    runTest("annotate_stats_part", "annotate_stats_part.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/annotate_stats_part.q"));
  }

  public void testCliDriver_annotate_stats_select() throws Exception {
    runTest("annotate_stats_select", "annotate_stats_select.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/annotate_stats_select.q"));
  }

  public void testCliDriver_annotate_stats_table() throws Exception {
    runTest("annotate_stats_table", "annotate_stats_table.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/annotate_stats_table.q"));
  }

  public void testCliDriver_annotate_stats_union() throws Exception {
    runTest("annotate_stats_union", "annotate_stats_union.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/annotate_stats_union.q"));
  }

  public void testCliDriver_ansi_sql_arithmetic() throws Exception {
    runTest("ansi_sql_arithmetic", "ansi_sql_arithmetic.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/ansi_sql_arithmetic.q"));
  }

  public void testCliDriver_archive() throws Exception {
    runTest("archive", "archive.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/archive.q"));
  }

  public void testCliDriver_archive_corrupt() throws Exception {
    runTest("archive_corrupt", "archive_corrupt.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/archive_corrupt.q"));
  }

  public void testCliDriver_archive_excludeHadoop20() throws Exception {
    runTest("archive_excludeHadoop20", "archive_excludeHadoop20.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/archive_excludeHadoop20.q"));
  }

  public void testCliDriver_archive_multi() throws Exception {
    runTest("archive_multi", "archive_multi.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/archive_multi.q"));
  }

  public void testCliDriver_authorization_1() throws Exception {
    runTest("authorization_1", "authorization_1.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/authorization_1.q"));
  }

  public void testCliDriver_authorization_1_sql_std() throws Exception {
    runTest("authorization_1_sql_std", "authorization_1_sql_std.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/authorization_1_sql_std.q"));
  }

  public void testCliDriver_authorization_2() throws Exception {
    runTest("authorization_2", "authorization_2.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/authorization_2.q"));
  }

  public void testCliDriver_authorization_3() throws Exception {
    runTest("authorization_3", "authorization_3.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/authorization_3.q"));
  }

  public void testCliDriver_authorization_4() throws Exception {
    runTest("authorization_4", "authorization_4.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/authorization_4.q"));
  }

  public void testCliDriver_authorization_5() throws Exception {
    runTest("authorization_5", "authorization_5.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/authorization_5.q"));
  }

  public void testCliDriver_authorization_6() throws Exception {
    runTest("authorization_6", "authorization_6.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/authorization_6.q"));
  }

  public void testCliDriver_authorization_7() throws Exception {
    runTest("authorization_7", "authorization_7.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/authorization_7.q"));
  }

  public void testCliDriver_authorization_8() throws Exception {
    runTest("authorization_8", "authorization_8.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/authorization_8.q"));
  }

  public void testCliDriver_authorization_9() throws Exception {
    runTest("authorization_9", "authorization_9.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/authorization_9.q"));
  }

  public void testCliDriver_authorization_admin_almighty1() throws Exception {
    runTest("authorization_admin_almighty1", "authorization_admin_almighty1.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/authorization_admin_almighty1.q"));
  }

  public void testCliDriver_authorization_create_func1() throws Exception {
    runTest("authorization_create_func1", "authorization_create_func1.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/authorization_create_func1.q"));
  }

  public void testCliDriver_authorization_create_macro1() throws Exception {
    runTest("authorization_create_macro1", "authorization_create_macro1.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/authorization_create_macro1.q"));
  }

  public void testCliDriver_authorization_create_table_owner_privs() throws Exception {
    runTest("authorization_create_table_owner_privs", "authorization_create_table_owner_privs.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/authorization_create_table_owner_privs.q"));
  }

  public void testCliDriver_authorization_grant_public_role() throws Exception {
    runTest("authorization_grant_public_role", "authorization_grant_public_role.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/authorization_grant_public_role.q"));
  }

  public void testCliDriver_authorization_grant_table_priv() throws Exception {
    runTest("authorization_grant_table_priv", "authorization_grant_table_priv.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/authorization_grant_table_priv.q"));
  }

  public void testCliDriver_authorization_index() throws Exception {
    runTest("authorization_index", "authorization_index.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/authorization_index.q"));
  }

  public void testCliDriver_authorization_owner_actions() throws Exception {
    runTest("authorization_owner_actions", "authorization_owner_actions.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/authorization_owner_actions.q"));
  }

  public void testCliDriver_authorization_owner_actions_db() throws Exception {
    runTest("authorization_owner_actions_db", "authorization_owner_actions_db.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/authorization_owner_actions_db.q"));
  }

  public void testCliDriver_authorization_parts() throws Exception {
    runTest("authorization_parts", "authorization_parts.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/authorization_parts.q"));
  }

  public void testCliDriver_authorization_revoke_table_priv() throws Exception {
    runTest("authorization_revoke_table_priv", "authorization_revoke_table_priv.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/authorization_revoke_table_priv.q"));
  }

  public void testCliDriver_authorization_role_grant1() throws Exception {
    runTest("authorization_role_grant1", "authorization_role_grant1.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/authorization_role_grant1.q"));
  }

  public void testCliDriver_authorization_role_grant2() throws Exception {
    runTest("authorization_role_grant2", "authorization_role_grant2.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/authorization_role_grant2.q"));
  }

  public void testCliDriver_authorization_set_show_current_role() throws Exception {
    runTest("authorization_set_show_current_role", "authorization_set_show_current_role.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/authorization_set_show_current_role.q"));
  }

  public void testCliDriver_authorization_view_sqlstd() throws Exception {
    runTest("authorization_view_sqlstd", "authorization_view_sqlstd.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/authorization_view_sqlstd.q"));
  }

  public void testCliDriver_auto_join0() throws Exception {
    runTest("auto_join0", "auto_join0.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/auto_join0.q"));
  }

  public void testCliDriver_auto_join1() throws Exception {
    runTest("auto_join1", "auto_join1.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/auto_join1.q"));
  }

  public void testCliDriver_auto_join10() throws Exception {
    runTest("auto_join10", "auto_join10.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/auto_join10.q"));
  }

  public void testCliDriver_auto_join11() throws Exception {
    runTest("auto_join11", "auto_join11.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/auto_join11.q"));
  }

  public void testCliDriver_auto_join12() throws Exception {
    runTest("auto_join12", "auto_join12.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/auto_join12.q"));
  }

  public void testCliDriver_auto_join13() throws Exception {
    runTest("auto_join13", "auto_join13.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/auto_join13.q"));
  }

  public void testCliDriver_auto_join14() throws Exception {
    runTest("auto_join14", "auto_join14.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/auto_join14.q"));
  }

  public void testCliDriver_auto_join14_hadoop20() throws Exception {
    runTest("auto_join14_hadoop20", "auto_join14_hadoop20.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/auto_join14_hadoop20.q"));
  }

  public void testCliDriver_auto_join15() throws Exception {
    runTest("auto_join15", "auto_join15.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/auto_join15.q"));
  }

  public void testCliDriver_auto_join16() throws Exception {
    runTest("auto_join16", "auto_join16.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/auto_join16.q"));
  }

  public void testCliDriver_auto_join17() throws Exception {
    runTest("auto_join17", "auto_join17.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/auto_join17.q"));
  }

  public void testCliDriver_auto_join18() throws Exception {
    runTest("auto_join18", "auto_join18.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/auto_join18.q"));
  }

  public void testCliDriver_auto_join18_multi_distinct() throws Exception {
    runTest("auto_join18_multi_distinct", "auto_join18_multi_distinct.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/auto_join18_multi_distinct.q"));
  }

  public void testCliDriver_auto_join19() throws Exception {
    runTest("auto_join19", "auto_join19.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/auto_join19.q"));
  }

  public void testCliDriver_auto_join2() throws Exception {
    runTest("auto_join2", "auto_join2.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/auto_join2.q"));
  }

  public void testCliDriver_auto_join20() throws Exception {
    runTest("auto_join20", "auto_join20.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/auto_join20.q"));
  }

  public void testCliDriver_auto_join21() throws Exception {
    runTest("auto_join21", "auto_join21.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/auto_join21.q"));
  }

  public void testCliDriver_auto_join22() throws Exception {
    runTest("auto_join22", "auto_join22.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/auto_join22.q"));
  }

  public void testCliDriver_auto_join23() throws Exception {
    runTest("auto_join23", "auto_join23.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/auto_join23.q"));
  }

  public void testCliDriver_auto_join24() throws Exception {
    runTest("auto_join24", "auto_join24.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/auto_join24.q"));
  }

  public void testCliDriver_auto_join25() throws Exception {
    runTest("auto_join25", "auto_join25.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/auto_join25.q"));
  }

  public void testCliDriver_auto_join26() throws Exception {
    runTest("auto_join26", "auto_join26.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/auto_join26.q"));
  }

  public void testCliDriver_auto_join27() throws Exception {
    runTest("auto_join27", "auto_join27.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/auto_join27.q"));
  }

  public void testCliDriver_auto_join28() throws Exception {
    runTest("auto_join28", "auto_join28.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/auto_join28.q"));
  }

  public void testCliDriver_auto_join29() throws Exception {
    runTest("auto_join29", "auto_join29.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/auto_join29.q"));
  }

  public void testCliDriver_auto_join3() throws Exception {
    runTest("auto_join3", "auto_join3.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/auto_join3.q"));
  }

  public void testCliDriver_auto_join30() throws Exception {
    runTest("auto_join30", "auto_join30.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/auto_join30.q"));
  }

  public void testCliDriver_auto_join31() throws Exception {
    runTest("auto_join31", "auto_join31.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/auto_join31.q"));
  }

  public void testCliDriver_auto_join32() throws Exception {
    runTest("auto_join32", "auto_join32.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/auto_join32.q"));
  }

  public void testCliDriver_auto_join4() throws Exception {
    runTest("auto_join4", "auto_join4.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/auto_join4.q"));
  }

  public void testCliDriver_auto_join5() throws Exception {
    runTest("auto_join5", "auto_join5.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/auto_join5.q"));
  }

  public void testCliDriver_auto_join6() throws Exception {
    runTest("auto_join6", "auto_join6.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/auto_join6.q"));
  }

  public void testCliDriver_auto_join7() throws Exception {
    runTest("auto_join7", "auto_join7.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/auto_join7.q"));
  }

  public void testCliDriver_auto_join8() throws Exception {
    runTest("auto_join8", "auto_join8.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/auto_join8.q"));
  }

  public void testCliDriver_auto_join9() throws Exception {
    runTest("auto_join9", "auto_join9.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/auto_join9.q"));
  }

  public void testCliDriver_auto_join_filters() throws Exception {
    runTest("auto_join_filters", "auto_join_filters.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/auto_join_filters.q"));
  }

  public void testCliDriver_auto_join_nulls() throws Exception {
    runTest("auto_join_nulls", "auto_join_nulls.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/auto_join_nulls.q"));
  }

  public void testCliDriver_auto_join_reordering_values() throws Exception {
    runTest("auto_join_reordering_values", "auto_join_reordering_values.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/auto_join_reordering_values.q"));
  }

  public void testCliDriver_auto_join_without_localtask() throws Exception {
    runTest("auto_join_without_localtask", "auto_join_without_localtask.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/auto_join_without_localtask.q"));
  }

  public void testCliDriver_auto_smb_mapjoin_14() throws Exception {
    runTest("auto_smb_mapjoin_14", "auto_smb_mapjoin_14.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/auto_smb_mapjoin_14.q"));
  }

  public void testCliDriver_auto_sortmerge_join_1() throws Exception {
    runTest("auto_sortmerge_join_1", "auto_sortmerge_join_1.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/auto_sortmerge_join_1.q"));
  }

  public void testCliDriver_auto_sortmerge_join_10() throws Exception {
    runTest("auto_sortmerge_join_10", "auto_sortmerge_join_10.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/auto_sortmerge_join_10.q"));
  }

  public void testCliDriver_auto_sortmerge_join_11() throws Exception {
    runTest("auto_sortmerge_join_11", "auto_sortmerge_join_11.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/auto_sortmerge_join_11.q"));
  }

  public void testCliDriver_auto_sortmerge_join_12() throws Exception {
    runTest("auto_sortmerge_join_12", "auto_sortmerge_join_12.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/auto_sortmerge_join_12.q"));
  }

  public void testCliDriver_auto_sortmerge_join_13() throws Exception {
    runTest("auto_sortmerge_join_13", "auto_sortmerge_join_13.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/auto_sortmerge_join_13.q"));
  }

  public void testCliDriver_auto_sortmerge_join_14() throws Exception {
    runTest("auto_sortmerge_join_14", "auto_sortmerge_join_14.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/auto_sortmerge_join_14.q"));
  }

  public void testCliDriver_auto_sortmerge_join_15() throws Exception {
    runTest("auto_sortmerge_join_15", "auto_sortmerge_join_15.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/auto_sortmerge_join_15.q"));
  }

  public void testCliDriver_auto_sortmerge_join_2() throws Exception {
    runTest("auto_sortmerge_join_2", "auto_sortmerge_join_2.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/auto_sortmerge_join_2.q"));
  }

  public void testCliDriver_auto_sortmerge_join_3() throws Exception {
    runTest("auto_sortmerge_join_3", "auto_sortmerge_join_3.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/auto_sortmerge_join_3.q"));
  }

  public void testCliDriver_auto_sortmerge_join_4() throws Exception {
    runTest("auto_sortmerge_join_4", "auto_sortmerge_join_4.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/auto_sortmerge_join_4.q"));
  }

  public void testCliDriver_auto_sortmerge_join_5() throws Exception {
    runTest("auto_sortmerge_join_5", "auto_sortmerge_join_5.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/auto_sortmerge_join_5.q"));
  }

  public void testCliDriver_auto_sortmerge_join_6() throws Exception {
    runTest("auto_sortmerge_join_6", "auto_sortmerge_join_6.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/auto_sortmerge_join_6.q"));
  }

  public void testCliDriver_auto_sortmerge_join_7() throws Exception {
    runTest("auto_sortmerge_join_7", "auto_sortmerge_join_7.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/auto_sortmerge_join_7.q"));
  }

  public void testCliDriver_auto_sortmerge_join_8() throws Exception {
    runTest("auto_sortmerge_join_8", "auto_sortmerge_join_8.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/auto_sortmerge_join_8.q"));
  }

  public void testCliDriver_auto_sortmerge_join_9() throws Exception {
    runTest("auto_sortmerge_join_9", "auto_sortmerge_join_9.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/auto_sortmerge_join_9.q"));
  }

  public void testCliDriver_autogen_colalias() throws Exception {
    runTest("autogen_colalias", "autogen_colalias.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/autogen_colalias.q"));
  }

  public void testCliDriver_avro_change_schema() throws Exception {
    runTest("avro_change_schema", "avro_change_schema.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/avro_change_schema.q"));
  }

  public void testCliDriver_avro_compression_enabled() throws Exception {
    runTest("avro_compression_enabled", "avro_compression_enabled.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/avro_compression_enabled.q"));
  }

  public void testCliDriver_avro_evolved_schemas() throws Exception {
    runTest("avro_evolved_schemas", "avro_evolved_schemas.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/avro_evolved_schemas.q"));
  }

  public void testCliDriver_avro_joins() throws Exception {
    runTest("avro_joins", "avro_joins.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/avro_joins.q"));
  }

  public void testCliDriver_avro_nullable_fields() throws Exception {
    runTest("avro_nullable_fields", "avro_nullable_fields.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/avro_nullable_fields.q"));
  }

  public void testCliDriver_avro_partitioned() throws Exception {
    runTest("avro_partitioned", "avro_partitioned.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/avro_partitioned.q"));
  }

  public void testCliDriver_avro_sanity_test() throws Exception {
    runTest("avro_sanity_test", "avro_sanity_test.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/avro_sanity_test.q"));
  }

  public void testCliDriver_avro_schema_error_message() throws Exception {
    runTest("avro_schema_error_message", "avro_schema_error_message.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/avro_schema_error_message.q"));
  }

  public void testCliDriver_avro_schema_literal() throws Exception {
    runTest("avro_schema_literal", "avro_schema_literal.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/avro_schema_literal.q"));
  }

  public void testCliDriver_ba_table1() throws Exception {
    runTest("ba_table1", "ba_table1.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/ba_table1.q"));
  }

  public void testCliDriver_ba_table2() throws Exception {
    runTest("ba_table2", "ba_table2.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/ba_table2.q"));
  }

  public void testCliDriver_ba_table3() throws Exception {
    runTest("ba_table3", "ba_table3.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/ba_table3.q"));
  }

  public void testCliDriver_ba_table_udfs() throws Exception {
    runTest("ba_table_udfs", "ba_table_udfs.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/ba_table_udfs.q"));
  }

  public void testCliDriver_ba_table_union() throws Exception {
    runTest("ba_table_union", "ba_table_union.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/ba_table_union.q"));
  }

  public void testCliDriver_binary_constant() throws Exception {
    runTest("binary_constant", "binary_constant.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/binary_constant.q"));
  }

  public void testCliDriver_binary_output_format() throws Exception {
    runTest("binary_output_format", "binary_output_format.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/binary_output_format.q"));
  }

  public void testCliDriver_binary_table_bincolserde() throws Exception {
    runTest("binary_table_bincolserde", "binary_table_bincolserde.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/binary_table_bincolserde.q"));
  }

  public void testCliDriver_binary_table_colserde() throws Exception {
    runTest("binary_table_colserde", "binary_table_colserde.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/binary_table_colserde.q"));
  }

  public void testCliDriver_binarysortable_1() throws Exception {
    runTest("binarysortable_1", "binarysortable_1.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/binarysortable_1.q"));
  }

  public void testCliDriver_bucket1() throws Exception {
    runTest("bucket1", "bucket1.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/bucket1.q"));
  }

  public void testCliDriver_bucket2() throws Exception {
    runTest("bucket2", "bucket2.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/bucket2.q"));
  }

  public void testCliDriver_bucket3() throws Exception {
    runTest("bucket3", "bucket3.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/bucket3.q"));
  }

  public void testCliDriver_bucket_groupby() throws Exception {
    runTest("bucket_groupby", "bucket_groupby.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/bucket_groupby.q"));
  }

  public void testCliDriver_bucket_if_with_path_filter() throws Exception {
    runTest("bucket_if_with_path_filter", "bucket_if_with_path_filter.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/bucket_if_with_path_filter.q"));
  }

  public void testCliDriver_bucket_map_join_1() throws Exception {
    runTest("bucket_map_join_1", "bucket_map_join_1.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/bucket_map_join_1.q"));
  }

  public void testCliDriver_bucket_map_join_2() throws Exception {
    runTest("bucket_map_join_2", "bucket_map_join_2.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/bucket_map_join_2.q"));
  }

  public void testCliDriver_bucketcontext_1() throws Exception {
    runTest("bucketcontext_1", "bucketcontext_1.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/bucketcontext_1.q"));
  }

  public void testCliDriver_bucketcontext_2() throws Exception {
    runTest("bucketcontext_2", "bucketcontext_2.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/bucketcontext_2.q"));
  }

  public void testCliDriver_bucketcontext_3() throws Exception {
    runTest("bucketcontext_3", "bucketcontext_3.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/bucketcontext_3.q"));
  }

  public void testCliDriver_bucketcontext_4() throws Exception {
    runTest("bucketcontext_4", "bucketcontext_4.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/bucketcontext_4.q"));
  }

  public void testCliDriver_bucketcontext_5() throws Exception {
    runTest("bucketcontext_5", "bucketcontext_5.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/bucketcontext_5.q"));
  }

  public void testCliDriver_bucketcontext_6() throws Exception {
    runTest("bucketcontext_6", "bucketcontext_6.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/bucketcontext_6.q"));
  }

  public void testCliDriver_bucketcontext_7() throws Exception {
    runTest("bucketcontext_7", "bucketcontext_7.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/bucketcontext_7.q"));
  }

  public void testCliDriver_bucketcontext_8() throws Exception {
    runTest("bucketcontext_8", "bucketcontext_8.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/bucketcontext_8.q"));
  }

  public void testCliDriver_bucketizedhiveinputformat_auto() throws Exception {
    runTest("bucketizedhiveinputformat_auto", "bucketizedhiveinputformat_auto.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/bucketizedhiveinputformat_auto.q"));
  }

  public void testCliDriver_bucketmapjoin1() throws Exception {
    runTest("bucketmapjoin1", "bucketmapjoin1.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/bucketmapjoin1.q"));
  }

  public void testCliDriver_bucketmapjoin10() throws Exception {
    runTest("bucketmapjoin10", "bucketmapjoin10.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/bucketmapjoin10.q"));
  }

  public void testCliDriver_bucketmapjoin11() throws Exception {
    runTest("bucketmapjoin11", "bucketmapjoin11.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/bucketmapjoin11.q"));
  }

  public void testCliDriver_bucketmapjoin12() throws Exception {
    runTest("bucketmapjoin12", "bucketmapjoin12.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/bucketmapjoin12.q"));
  }

  public void testCliDriver_bucketmapjoin13() throws Exception {
    runTest("bucketmapjoin13", "bucketmapjoin13.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/bucketmapjoin13.q"));
  }

  public void testCliDriver_bucketmapjoin2() throws Exception {
    runTest("bucketmapjoin2", "bucketmapjoin2.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/bucketmapjoin2.q"));
  }

  public void testCliDriver_bucketmapjoin3() throws Exception {
    runTest("bucketmapjoin3", "bucketmapjoin3.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/bucketmapjoin3.q"));
  }

  public void testCliDriver_bucketmapjoin4() throws Exception {
    runTest("bucketmapjoin4", "bucketmapjoin4.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/bucketmapjoin4.q"));
  }

  public void testCliDriver_bucketmapjoin5() throws Exception {
    runTest("bucketmapjoin5", "bucketmapjoin5.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/bucketmapjoin5.q"));
  }

  public void testCliDriver_bucketmapjoin8() throws Exception {
    runTest("bucketmapjoin8", "bucketmapjoin8.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/bucketmapjoin8.q"));
  }

  public void testCliDriver_bucketmapjoin9() throws Exception {
    runTest("bucketmapjoin9", "bucketmapjoin9.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/bucketmapjoin9.q"));
  }

  public void testCliDriver_bucketmapjoin_negative() throws Exception {
    runTest("bucketmapjoin_negative", "bucketmapjoin_negative.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/bucketmapjoin_negative.q"));
  }

  public void testCliDriver_bucketmapjoin_negative2() throws Exception {
    runTest("bucketmapjoin_negative2", "bucketmapjoin_negative2.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/bucketmapjoin_negative2.q"));
  }

  public void testCliDriver_bucketmapjoin_negative3() throws Exception {
    runTest("bucketmapjoin_negative3", "bucketmapjoin_negative3.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/bucketmapjoin_negative3.q"));
  }

  public void testCliDriver_bucketsortoptimize_insert_1() throws Exception {
    runTest("bucketsortoptimize_insert_1", "bucketsortoptimize_insert_1.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/bucketsortoptimize_insert_1.q"));
  }

  public void testCliDriver_bucketsortoptimize_insert_2() throws Exception {
    runTest("bucketsortoptimize_insert_2", "bucketsortoptimize_insert_2.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/bucketsortoptimize_insert_2.q"));
  }

  public void testCliDriver_bucketsortoptimize_insert_3() throws Exception {
    runTest("bucketsortoptimize_insert_3", "bucketsortoptimize_insert_3.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/bucketsortoptimize_insert_3.q"));
  }

  public void testCliDriver_bucketsortoptimize_insert_4() throws Exception {
    runTest("bucketsortoptimize_insert_4", "bucketsortoptimize_insert_4.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/bucketsortoptimize_insert_4.q"));
  }

  public void testCliDriver_bucketsortoptimize_insert_5() throws Exception {
    runTest("bucketsortoptimize_insert_5", "bucketsortoptimize_insert_5.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/bucketsortoptimize_insert_5.q"));
  }

  public void testCliDriver_bucketsortoptimize_insert_6() throws Exception {
    runTest("bucketsortoptimize_insert_6", "bucketsortoptimize_insert_6.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/bucketsortoptimize_insert_6.q"));
  }

  public void testCliDriver_bucketsortoptimize_insert_7() throws Exception {
    runTest("bucketsortoptimize_insert_7", "bucketsortoptimize_insert_7.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/bucketsortoptimize_insert_7.q"));
  }

  public void testCliDriver_bucketsortoptimize_insert_8() throws Exception {
    runTest("bucketsortoptimize_insert_8", "bucketsortoptimize_insert_8.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/bucketsortoptimize_insert_8.q"));
  }

  public void testCliDriver_case_sensitivity() throws Exception {
    runTest("case_sensitivity", "case_sensitivity.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/case_sensitivity.q"));
  }

  public void testCliDriver_cast1() throws Exception {
    runTest("cast1", "cast1.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/cast1.q"));
  }

  public void testCliDriver_cast_to_int() throws Exception {
    runTest("cast_to_int", "cast_to_int.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/cast_to_int.q"));
  }

  public void testCliDriver_char_1() throws Exception {
    runTest("char_1", "char_1.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/char_1.q"));
  }

  public void testCliDriver_char_2() throws Exception {
    runTest("char_2", "char_2.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/char_2.q"));
  }

  public void testCliDriver_char_cast() throws Exception {
    runTest("char_cast", "char_cast.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/char_cast.q"));
  }

  public void testCliDriver_char_comparison() throws Exception {
    runTest("char_comparison", "char_comparison.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/char_comparison.q"));
  }

  public void testCliDriver_char_join1() throws Exception {
    runTest("char_join1", "char_join1.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/char_join1.q"));
  }

  public void testCliDriver_char_nested_types() throws Exception {
    runTest("char_nested_types", "char_nested_types.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/char_nested_types.q"));
  }

  public void testCliDriver_char_serde() throws Exception {
    runTest("char_serde", "char_serde.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/char_serde.q"));
  }

  public void testCliDriver_char_udf1() throws Exception {
    runTest("char_udf1", "char_udf1.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/char_udf1.q"));
  }

  public void testCliDriver_char_union1() throws Exception {
    runTest("char_union1", "char_union1.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/char_union1.q"));
  }

  public void testCliDriver_char_varchar_udf() throws Exception {
    runTest("char_varchar_udf", "char_varchar_udf.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/char_varchar_udf.q"));
  }

  public void testCliDriver_cluster() throws Exception {
    runTest("cluster", "cluster.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/cluster.q"));
  }

  public void testCliDriver_column_access_stats() throws Exception {
    runTest("column_access_stats", "column_access_stats.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/column_access_stats.q"));
  }

  public void testCliDriver_columnarserde_create_shortcut() throws Exception {
    runTest("columnarserde_create_shortcut", "columnarserde_create_shortcut.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/columnarserde_create_shortcut.q"));
  }

  public void testCliDriver_columnstats_partlvl() throws Exception {
    runTest("columnstats_partlvl", "columnstats_partlvl.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/columnstats_partlvl.q"));
  }

  public void testCliDriver_columnstats_tbllvl() throws Exception {
    runTest("columnstats_tbllvl", "columnstats_tbllvl.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/columnstats_tbllvl.q"));
  }

  public void testCliDriver_combine1() throws Exception {
    runTest("combine1", "combine1.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/combine1.q"));
  }

  public void testCliDriver_combine2() throws Exception {
    runTest("combine2", "combine2.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/combine2.q"));
  }

  public void testCliDriver_combine2_hadoop20() throws Exception {
    runTest("combine2_hadoop20", "combine2_hadoop20.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/combine2_hadoop20.q"));
  }

  public void testCliDriver_combine2_win() throws Exception {
    runTest("combine2_win", "combine2_win.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/combine2_win.q"));
  }

  public void testCliDriver_combine3() throws Exception {
    runTest("combine3", "combine3.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/combine3.q"));
  }

  public void testCliDriver_compile_processor() throws Exception {
    runTest("compile_processor", "compile_processor.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/compile_processor.q"));
  }

  public void testCliDriver_compute_stats_binary() throws Exception {
    runTest("compute_stats_binary", "compute_stats_binary.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/compute_stats_binary.q"));
  }

  public void testCliDriver_compute_stats_boolean() throws Exception {
    runTest("compute_stats_boolean", "compute_stats_boolean.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/compute_stats_boolean.q"));
  }

  public void testCliDriver_compute_stats_decimal() throws Exception {
    runTest("compute_stats_decimal", "compute_stats_decimal.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/compute_stats_decimal.q"));
  }

  public void testCliDriver_compute_stats_double() throws Exception {
    runTest("compute_stats_double", "compute_stats_double.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/compute_stats_double.q"));
  }

  public void testCliDriver_compute_stats_empty_table() throws Exception {
    runTest("compute_stats_empty_table", "compute_stats_empty_table.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/compute_stats_empty_table.q"));
  }

  public void testCliDriver_compute_stats_long() throws Exception {
    runTest("compute_stats_long", "compute_stats_long.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/compute_stats_long.q"));
  }

  public void testCliDriver_compute_stats_string() throws Exception {
    runTest("compute_stats_string", "compute_stats_string.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/compute_stats_string.q"));
  }

  public void testCliDriver_concatenate_inherit_table_location() throws Exception {
    runTest("concatenate_inherit_table_location", "concatenate_inherit_table_location.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/concatenate_inherit_table_location.q"));
  }

  public void testCliDriver_constant_prop() throws Exception {
    runTest("constant_prop", "constant_prop.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/constant_prop.q"));
  }

  public void testCliDriver_convert_enum_to_string() throws Exception {
    runTest("convert_enum_to_string", "convert_enum_to_string.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/convert_enum_to_string.q"));
  }

  public void testCliDriver_correlationoptimizer1() throws Exception {
    runTest("correlationoptimizer1", "correlationoptimizer1.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/correlationoptimizer1.q"));
  }

  public void testCliDriver_correlationoptimizer10() throws Exception {
    runTest("correlationoptimizer10", "correlationoptimizer10.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/correlationoptimizer10.q"));
  }

  public void testCliDriver_correlationoptimizer11() throws Exception {
    runTest("correlationoptimizer11", "correlationoptimizer11.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/correlationoptimizer11.q"));
  }

  public void testCliDriver_correlationoptimizer12() throws Exception {
    runTest("correlationoptimizer12", "correlationoptimizer12.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/correlationoptimizer12.q"));
  }

  public void testCliDriver_correlationoptimizer13() throws Exception {
    runTest("correlationoptimizer13", "correlationoptimizer13.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/correlationoptimizer13.q"));
  }

  public void testCliDriver_correlationoptimizer14() throws Exception {
    runTest("correlationoptimizer14", "correlationoptimizer14.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/correlationoptimizer14.q"));
  }

  public void testCliDriver_correlationoptimizer15() throws Exception {
    runTest("correlationoptimizer15", "correlationoptimizer15.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/correlationoptimizer15.q"));
  }

  public void testCliDriver_correlationoptimizer2() throws Exception {
    runTest("correlationoptimizer2", "correlationoptimizer2.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/correlationoptimizer2.q"));
  }

  public void testCliDriver_correlationoptimizer3() throws Exception {
    runTest("correlationoptimizer3", "correlationoptimizer3.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/correlationoptimizer3.q"));
  }

  public void testCliDriver_correlationoptimizer4() throws Exception {
    runTest("correlationoptimizer4", "correlationoptimizer4.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/correlationoptimizer4.q"));
  }

  public void testCliDriver_correlationoptimizer5() throws Exception {
    runTest("correlationoptimizer5", "correlationoptimizer5.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/correlationoptimizer5.q"));
  }

  public void testCliDriver_correlationoptimizer6() throws Exception {
    runTest("correlationoptimizer6", "correlationoptimizer6.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/correlationoptimizer6.q"));
  }

  public void testCliDriver_correlationoptimizer7() throws Exception {
    runTest("correlationoptimizer7", "correlationoptimizer7.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/correlationoptimizer7.q"));
  }

  public void testCliDriver_correlationoptimizer8() throws Exception {
    runTest("correlationoptimizer8", "correlationoptimizer8.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/correlationoptimizer8.q"));
  }

  public void testCliDriver_correlationoptimizer9() throws Exception {
    runTest("correlationoptimizer9", "correlationoptimizer9.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/correlationoptimizer9.q"));
  }

  public void testCliDriver_count() throws Exception {
    runTest("count", "count.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/count.q"));
  }

  public void testCliDriver_cp_mj_rc() throws Exception {
    runTest("cp_mj_rc", "cp_mj_rc.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/cp_mj_rc.q"));
  }

  public void testCliDriver_create_1() throws Exception {
    runTest("create_1", "create_1.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/create_1.q"));
  }

  public void testCliDriver_create_alter_list_bucketing_table1() throws Exception {
    runTest("create_alter_list_bucketing_table1", "create_alter_list_bucketing_table1.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/create_alter_list_bucketing_table1.q"));
  }

  public void testCliDriver_create_big_view() throws Exception {
    runTest("create_big_view", "create_big_view.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/create_big_view.q"));
  }

  public void testCliDriver_create_default_prop() throws Exception {
    runTest("create_default_prop", "create_default_prop.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/create_default_prop.q"));
  }

  public void testCliDriver_create_escape() throws Exception {
    runTest("create_escape", "create_escape.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/create_escape.q"));
  }

  public void testCliDriver_create_func1() throws Exception {
    runTest("create_func1", "create_func1.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/create_func1.q"));
  }

  public void testCliDriver_create_genericudaf() throws Exception {
    runTest("create_genericudaf", "create_genericudaf.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/create_genericudaf.q"));
  }

  public void testCliDriver_create_genericudf() throws Exception {
    runTest("create_genericudf", "create_genericudf.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/create_genericudf.q"));
  }

  public void testCliDriver_create_insert_outputformat() throws Exception {
    runTest("create_insert_outputformat", "create_insert_outputformat.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/create_insert_outputformat.q"));
  }

  public void testCliDriver_create_like() throws Exception {
    runTest("create_like", "create_like.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/create_like.q"));
  }

  public void testCliDriver_create_like2() throws Exception {
    runTest("create_like2", "create_like2.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/create_like2.q"));
  }

  public void testCliDriver_create_like_tbl_props() throws Exception {
    runTest("create_like_tbl_props", "create_like_tbl_props.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/create_like_tbl_props.q"));
  }

  public void testCliDriver_create_like_view() throws Exception {
    runTest("create_like_view", "create_like_view.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/create_like_view.q"));
  }

  public void testCliDriver_create_merge_compressed() throws Exception {
    runTest("create_merge_compressed", "create_merge_compressed.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/create_merge_compressed.q"));
  }

  public void testCliDriver_create_nested_type() throws Exception {
    runTest("create_nested_type", "create_nested_type.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/create_nested_type.q"));
  }

  public void testCliDriver_create_or_replace_view() throws Exception {
    runTest("create_or_replace_view", "create_or_replace_view.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/create_or_replace_view.q"));
  }

  public void testCliDriver_create_skewed_table1() throws Exception {
    runTest("create_skewed_table1", "create_skewed_table1.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/create_skewed_table1.q"));
  }

  public void testCliDriver_create_struct_table() throws Exception {
    runTest("create_struct_table", "create_struct_table.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/create_struct_table.q"));
  }

  public void testCliDriver_create_udaf() throws Exception {
    runTest("create_udaf", "create_udaf.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/create_udaf.q"));
  }

  public void testCliDriver_create_union_table() throws Exception {
    runTest("create_union_table", "create_union_table.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/create_union_table.q"));
  }

  public void testCliDriver_create_view() throws Exception {
    runTest("create_view", "create_view.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/create_view.q"));
  }

  public void testCliDriver_create_view_partitioned() throws Exception {
    runTest("create_view_partitioned", "create_view_partitioned.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/create_view_partitioned.q"));
  }

  public void testCliDriver_create_view_translate() throws Exception {
    runTest("create_view_translate", "create_view_translate.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/create_view_translate.q"));
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

  public void testCliDriver_ct_case_insensitive() throws Exception {
    runTest("ct_case_insensitive", "ct_case_insensitive.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/ct_case_insensitive.q"));
  }

  public void testCliDriver_ctas() throws Exception {
    runTest("ctas", "ctas.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/ctas.q"));
  }

  public void testCliDriver_ctas_char() throws Exception {
    runTest("ctas_char", "ctas_char.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/ctas_char.q"));
  }

  public void testCliDriver_ctas_colname() throws Exception {
    runTest("ctas_colname", "ctas_colname.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/ctas_colname.q"));
  }

  public void testCliDriver_ctas_date() throws Exception {
    runTest("ctas_date", "ctas_date.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/ctas_date.q"));
  }

  public void testCliDriver_ctas_hadoop20() throws Exception {
    runTest("ctas_hadoop20", "ctas_hadoop20.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/ctas_hadoop20.q"));
  }

  public void testCliDriver_ctas_uses_database_location() throws Exception {
    runTest("ctas_uses_database_location", "ctas_uses_database_location.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/ctas_uses_database_location.q"));
  }

  public void testCliDriver_ctas_varchar() throws Exception {
    runTest("ctas_varchar", "ctas_varchar.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/ctas_varchar.q"));
  }

  public void testCliDriver_cte_1() throws Exception {
    runTest("cte_1", "cte_1.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/cte_1.q"));
  }

  public void testCliDriver_cte_2() throws Exception {
    runTest("cte_2", "cte_2.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/cte_2.q"));
  }

  public void testCliDriver_custom_input_output_format() throws Exception {
    runTest("custom_input_output_format", "custom_input_output_format.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/custom_input_output_format.q"));
  }

  public void testCliDriver_database() throws Exception {
    runTest("database", "database.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/database.q"));
  }

  public void testCliDriver_database_drop() throws Exception {
    runTest("database_drop", "database_drop.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/database_drop.q"));
  }

  public void testCliDriver_database_location() throws Exception {
    runTest("database_location", "database_location.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/database_location.q"));
  }

  public void testCliDriver_database_properties() throws Exception {
    runTest("database_properties", "database_properties.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/database_properties.q"));
  }

  public void testCliDriver_date_1() throws Exception {
    runTest("date_1", "date_1.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/date_1.q"));
  }

  public void testCliDriver_date_2() throws Exception {
    runTest("date_2", "date_2.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/date_2.q"));
  }

  public void testCliDriver_date_3() throws Exception {
    runTest("date_3", "date_3.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/date_3.q"));
  }

  public void testCliDriver_date_4() throws Exception {
    runTest("date_4", "date_4.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/date_4.q"));
  }

  public void testCliDriver_date_comparison() throws Exception {
    runTest("date_comparison", "date_comparison.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/date_comparison.q"));
  }

  public void testCliDriver_date_join1() throws Exception {
    runTest("date_join1", "date_join1.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/date_join1.q"));
  }

  public void testCliDriver_date_serde() throws Exception {
    runTest("date_serde", "date_serde.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/date_serde.q"));
  }

  public void testCliDriver_date_udf() throws Exception {
    runTest("date_udf", "date_udf.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/date_udf.q"));
  }

  public void testCliDriver_dbtxnmgr_compact1() throws Exception {
    runTest("dbtxnmgr_compact1", "dbtxnmgr_compact1.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/dbtxnmgr_compact1.q"));
  }

  public void testCliDriver_dbtxnmgr_compact2() throws Exception {
    runTest("dbtxnmgr_compact2", "dbtxnmgr_compact2.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/dbtxnmgr_compact2.q"));
  }

  public void testCliDriver_dbtxnmgr_compact3() throws Exception {
    runTest("dbtxnmgr_compact3", "dbtxnmgr_compact3.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/dbtxnmgr_compact3.q"));
  }

  public void testCliDriver_dbtxnmgr_ddl1() throws Exception {
    runTest("dbtxnmgr_ddl1", "dbtxnmgr_ddl1.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/dbtxnmgr_ddl1.q"));
  }

  public void testCliDriver_dbtxnmgr_query1() throws Exception {
    runTest("dbtxnmgr_query1", "dbtxnmgr_query1.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/dbtxnmgr_query1.q"));
  }

  public void testCliDriver_dbtxnmgr_query2() throws Exception {
    runTest("dbtxnmgr_query2", "dbtxnmgr_query2.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/dbtxnmgr_query2.q"));
  }

  public void testCliDriver_dbtxnmgr_query3() throws Exception {
    runTest("dbtxnmgr_query3", "dbtxnmgr_query3.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/dbtxnmgr_query3.q"));
  }

  public void testCliDriver_dbtxnmgr_query4() throws Exception {
    runTest("dbtxnmgr_query4", "dbtxnmgr_query4.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/dbtxnmgr_query4.q"));
  }

  public void testCliDriver_dbtxnmgr_query5() throws Exception {
    runTest("dbtxnmgr_query5", "dbtxnmgr_query5.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/dbtxnmgr_query5.q"));
  }

  public void testCliDriver_dbtxnmgr_showlocks() throws Exception {
    runTest("dbtxnmgr_showlocks", "dbtxnmgr_showlocks.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/dbtxnmgr_showlocks.q"));
  }

  public void testCliDriver_ddltime() throws Exception {
    runTest("ddltime", "ddltime.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/ddltime.q"));
  }

  public void testCliDriver_decimal_1() throws Exception {
    runTest("decimal_1", "decimal_1.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/decimal_1.q"));
  }

  public void testCliDriver_decimal_2() throws Exception {
    runTest("decimal_2", "decimal_2.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/decimal_2.q"));
  }

  public void testCliDriver_decimal_3() throws Exception {
    runTest("decimal_3", "decimal_3.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/decimal_3.q"));
  }

  public void testCliDriver_decimal_4() throws Exception {
    runTest("decimal_4", "decimal_4.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/decimal_4.q"));
  }

  public void testCliDriver_decimal_5() throws Exception {
    runTest("decimal_5", "decimal_5.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/decimal_5.q"));
  }

  public void testCliDriver_decimal_6() throws Exception {
    runTest("decimal_6", "decimal_6.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/decimal_6.q"));
  }

  public void testCliDriver_decimal_join() throws Exception {
    runTest("decimal_join", "decimal_join.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/decimal_join.q"));
  }

  public void testCliDriver_decimal_precision() throws Exception {
    runTest("decimal_precision", "decimal_precision.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/decimal_precision.q"));
  }

  public void testCliDriver_decimal_serde() throws Exception {
    runTest("decimal_serde", "decimal_serde.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/decimal_serde.q"));
  }

  public void testCliDriver_decimal_udf() throws Exception {
    runTest("decimal_udf", "decimal_udf.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/decimal_udf.q"));
  }

  public void testCliDriver_default_partition_name() throws Exception {
    runTest("default_partition_name", "default_partition_name.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/default_partition_name.q"));
  }

  public void testCliDriver_delimiter() throws Exception {
    runTest("delimiter", "delimiter.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/delimiter.q"));
  }

  public void testCliDriver_desc_non_existent_tbl() throws Exception {
    runTest("desc_non_existent_tbl", "desc_non_existent_tbl.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/desc_non_existent_tbl.q"));
  }

  public void testCliDriver_desc_tbl_part_cols() throws Exception {
    runTest("desc_tbl_part_cols", "desc_tbl_part_cols.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/desc_tbl_part_cols.q"));
  }

  public void testCliDriver_describe_comment_indent() throws Exception {
    runTest("describe_comment_indent", "describe_comment_indent.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/describe_comment_indent.q"));
  }

  public void testCliDriver_describe_comment_nonascii() throws Exception {
    runTest("describe_comment_nonascii", "describe_comment_nonascii.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/describe_comment_nonascii.q"));
  }

  public void testCliDriver_describe_database_json() throws Exception {
    runTest("describe_database_json", "describe_database_json.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/describe_database_json.q"));
  }

  public void testCliDriver_describe_formatted_view_partitioned() throws Exception {
    runTest("describe_formatted_view_partitioned", "describe_formatted_view_partitioned.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/describe_formatted_view_partitioned.q"));
  }

  public void testCliDriver_describe_formatted_view_partitioned_json() throws Exception {
    runTest("describe_formatted_view_partitioned_json", "describe_formatted_view_partitioned_json.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/describe_formatted_view_partitioned_json.q"));
  }

  public void testCliDriver_describe_pretty() throws Exception {
    runTest("describe_pretty", "describe_pretty.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/describe_pretty.q"));
  }

  public void testCliDriver_describe_syntax() throws Exception {
    runTest("describe_syntax", "describe_syntax.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/describe_syntax.q"));
  }

  public void testCliDriver_describe_table() throws Exception {
    runTest("describe_table", "describe_table.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/describe_table.q"));
  }

  public void testCliDriver_describe_table_json() throws Exception {
    runTest("describe_table_json", "describe_table_json.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/describe_table_json.q"));
  }

  public void testCliDriver_describe_xpath() throws Exception {
    runTest("describe_xpath", "describe_xpath.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/describe_xpath.q"));
  }

  public void testCliDriver_diff_part_input_formats() throws Exception {
    runTest("diff_part_input_formats", "diff_part_input_formats.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/diff_part_input_formats.q"));
  }

  public void testCliDriver_disable_file_format_check() throws Exception {
    runTest("disable_file_format_check", "disable_file_format_check.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/disable_file_format_check.q"));
  }

  public void testCliDriver_disallow_incompatible_type_change_off() throws Exception {
    runTest("disallow_incompatible_type_change_off", "disallow_incompatible_type_change_off.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/disallow_incompatible_type_change_off.q"));
  }

  public void testCliDriver_distinct_stats() throws Exception {
    runTest("distinct_stats", "distinct_stats.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/distinct_stats.q"));
  }

  public void testCliDriver_driverhook() throws Exception {
    runTest("driverhook", "driverhook.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/driverhook.q"));
  }

  public void testCliDriver_drop_database_removes_partition_dirs() throws Exception {
    runTest("drop_database_removes_partition_dirs", "drop_database_removes_partition_dirs.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/drop_database_removes_partition_dirs.q"));
  }

  public void testCliDriver_drop_function() throws Exception {
    runTest("drop_function", "drop_function.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/drop_function.q"));
  }

  public void testCliDriver_drop_index() throws Exception {
    runTest("drop_index", "drop_index.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/drop_index.q"));
  }

  public void testCliDriver_drop_index_removes_partition_dirs() throws Exception {
    runTest("drop_index_removes_partition_dirs", "drop_index_removes_partition_dirs.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/drop_index_removes_partition_dirs.q"));
  }

  public void testCliDriver_drop_multi_partitions() throws Exception {
    runTest("drop_multi_partitions", "drop_multi_partitions.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/drop_multi_partitions.q"));
  }

  public void testCliDriver_drop_partitions_filter() throws Exception {
    runTest("drop_partitions_filter", "drop_partitions_filter.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/drop_partitions_filter.q"));
  }

  public void testCliDriver_drop_partitions_filter2() throws Exception {
    runTest("drop_partitions_filter2", "drop_partitions_filter2.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/drop_partitions_filter2.q"));
  }

  public void testCliDriver_drop_partitions_filter3() throws Exception {
    runTest("drop_partitions_filter3", "drop_partitions_filter3.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/drop_partitions_filter3.q"));
  }

  public void testCliDriver_drop_partitions_ignore_protection() throws Exception {
    runTest("drop_partitions_ignore_protection", "drop_partitions_ignore_protection.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/drop_partitions_ignore_protection.q"));
  }

  public void testCliDriver_drop_table() throws Exception {
    runTest("drop_table", "drop_table.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/drop_table.q"));
  }

  public void testCliDriver_drop_table2() throws Exception {
    runTest("drop_table2", "drop_table2.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/drop_table2.q"));
  }

  public void testCliDriver_drop_table_removes_partition_dirs() throws Exception {
    runTest("drop_table_removes_partition_dirs", "drop_table_removes_partition_dirs.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/drop_table_removes_partition_dirs.q"));
  }

  public void testCliDriver_drop_udf() throws Exception {
    runTest("drop_udf", "drop_udf.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/drop_udf.q"));
  }

  public void testCliDriver_drop_view() throws Exception {
    runTest("drop_view", "drop_view.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/drop_view.q"));
  }

  public void testCliDriver_drop_with_concurrency() throws Exception {
    runTest("drop_with_concurrency", "drop_with_concurrency.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/drop_with_concurrency.q"));
  }

  public void testCliDriver_dynamic_partition_skip_default() throws Exception {
    runTest("dynamic_partition_skip_default", "dynamic_partition_skip_default.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/dynamic_partition_skip_default.q"));
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

  public void testCliDriver_escape1() throws Exception {
    runTest("escape1", "escape1.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/escape1.q"));
  }

  public void testCliDriver_escape2() throws Exception {
    runTest("escape2", "escape2.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/escape2.q"));
  }

  public void testCliDriver_escape_clusterby1() throws Exception {
    runTest("escape_clusterby1", "escape_clusterby1.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/escape_clusterby1.q"));
  }

  public void testCliDriver_escape_distributeby1() throws Exception {
    runTest("escape_distributeby1", "escape_distributeby1.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/escape_distributeby1.q"));
  }

  public void testCliDriver_escape_orderby1() throws Exception {
    runTest("escape_orderby1", "escape_orderby1.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/escape_orderby1.q"));
  }

  public void testCliDriver_escape_sortby1() throws Exception {
    runTest("escape_sortby1", "escape_sortby1.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/escape_sortby1.q"));
  }

  public void testCliDriver_exchange_partition() throws Exception {
    runTest("exchange_partition", "exchange_partition.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/exchange_partition.q"));
  }

  public void testCliDriver_exchange_partition2() throws Exception {
    runTest("exchange_partition2", "exchange_partition2.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/exchange_partition2.q"));
  }

  public void testCliDriver_exchange_partition3() throws Exception {
    runTest("exchange_partition3", "exchange_partition3.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/exchange_partition3.q"));
  }

  public void testCliDriver_exim_00_nonpart_empty() throws Exception {
    runTest("exim_00_nonpart_empty", "exim_00_nonpart_empty.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/exim_00_nonpart_empty.q"));
  }

  public void testCliDriver_exim_01_nonpart() throws Exception {
    runTest("exim_01_nonpart", "exim_01_nonpart.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/exim_01_nonpart.q"));
  }

  public void testCliDriver_exim_02_00_part_empty() throws Exception {
    runTest("exim_02_00_part_empty", "exim_02_00_part_empty.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/exim_02_00_part_empty.q"));
  }

  public void testCliDriver_exim_02_part() throws Exception {
    runTest("exim_02_part", "exim_02_part.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/exim_02_part.q"));
  }

  public void testCliDriver_exim_03_nonpart_over_compat() throws Exception {
    runTest("exim_03_nonpart_over_compat", "exim_03_nonpart_over_compat.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/exim_03_nonpart_over_compat.q"));
  }

  public void testCliDriver_exim_04_all_part() throws Exception {
    runTest("exim_04_all_part", "exim_04_all_part.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/exim_04_all_part.q"));
  }

  public void testCliDriver_exim_04_evolved_parts() throws Exception {
    runTest("exim_04_evolved_parts", "exim_04_evolved_parts.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/exim_04_evolved_parts.q"));
  }

  public void testCliDriver_exim_05_some_part() throws Exception {
    runTest("exim_05_some_part", "exim_05_some_part.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/exim_05_some_part.q"));
  }

  public void testCliDriver_exim_06_one_part() throws Exception {
    runTest("exim_06_one_part", "exim_06_one_part.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/exim_06_one_part.q"));
  }

  public void testCliDriver_exim_07_all_part_over_nonoverlap() throws Exception {
    runTest("exim_07_all_part_over_nonoverlap", "exim_07_all_part_over_nonoverlap.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/exim_07_all_part_over_nonoverlap.q"));
  }

  public void testCliDriver_exim_08_nonpart_rename() throws Exception {
    runTest("exim_08_nonpart_rename", "exim_08_nonpart_rename.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/exim_08_nonpart_rename.q"));
  }

  public void testCliDriver_exim_09_part_spec_nonoverlap() throws Exception {
    runTest("exim_09_part_spec_nonoverlap", "exim_09_part_spec_nonoverlap.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/exim_09_part_spec_nonoverlap.q"));
  }

  public void testCliDriver_exim_10_external_managed() throws Exception {
    runTest("exim_10_external_managed", "exim_10_external_managed.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/exim_10_external_managed.q"));
  }

  public void testCliDriver_exim_11_managed_external() throws Exception {
    runTest("exim_11_managed_external", "exim_11_managed_external.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/exim_11_managed_external.q"));
  }

  public void testCliDriver_exim_12_external_location() throws Exception {
    runTest("exim_12_external_location", "exim_12_external_location.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/exim_12_external_location.q"));
  }

  public void testCliDriver_exim_13_managed_location() throws Exception {
    runTest("exim_13_managed_location", "exim_13_managed_location.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/exim_13_managed_location.q"));
  }

  public void testCliDriver_exim_14_managed_location_over_existing() throws Exception {
    runTest("exim_14_managed_location_over_existing", "exim_14_managed_location_over_existing.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/exim_14_managed_location_over_existing.q"));
  }

  public void testCliDriver_exim_15_external_part() throws Exception {
    runTest("exim_15_external_part", "exim_15_external_part.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/exim_15_external_part.q"));
  }

  public void testCliDriver_exim_16_part_external() throws Exception {
    runTest("exim_16_part_external", "exim_16_part_external.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/exim_16_part_external.q"));
  }

  public void testCliDriver_exim_17_part_managed() throws Exception {
    runTest("exim_17_part_managed", "exim_17_part_managed.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/exim_17_part_managed.q"));
  }

  public void testCliDriver_exim_18_part_external() throws Exception {
    runTest("exim_18_part_external", "exim_18_part_external.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/exim_18_part_external.q"));
  }

  public void testCliDriver_exim_19_00_part_external_location() throws Exception {
    runTest("exim_19_00_part_external_location", "exim_19_00_part_external_location.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/exim_19_00_part_external_location.q"));
  }

  public void testCliDriver_exim_19_part_external_location() throws Exception {
    runTest("exim_19_part_external_location", "exim_19_part_external_location.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/exim_19_part_external_location.q"));
  }

  public void testCliDriver_exim_20_part_managed_location() throws Exception {
    runTest("exim_20_part_managed_location", "exim_20_part_managed_location.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/exim_20_part_managed_location.q"));
  }

  public void testCliDriver_exim_21_export_authsuccess() throws Exception {
    runTest("exim_21_export_authsuccess", "exim_21_export_authsuccess.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/exim_21_export_authsuccess.q"));
  }

  public void testCliDriver_exim_22_import_exist_authsuccess() throws Exception {
    runTest("exim_22_import_exist_authsuccess", "exim_22_import_exist_authsuccess.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/exim_22_import_exist_authsuccess.q"));
  }

  public void testCliDriver_exim_23_import_part_authsuccess() throws Exception {
    runTest("exim_23_import_part_authsuccess", "exim_23_import_part_authsuccess.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/exim_23_import_part_authsuccess.q"));
  }

  public void testCliDriver_exim_24_import_nonexist_authsuccess() throws Exception {
    runTest("exim_24_import_nonexist_authsuccess", "exim_24_import_nonexist_authsuccess.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/exim_24_import_nonexist_authsuccess.q"));
  }

  public void testCliDriver_exim_hidden_files() throws Exception {
    runTest("exim_hidden_files", "exim_hidden_files.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/exim_hidden_files.q"));
  }

  public void testCliDriver_explain_dependency() throws Exception {
    runTest("explain_dependency", "explain_dependency.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/explain_dependency.q"));
  }

  public void testCliDriver_explain_dependency2() throws Exception {
    runTest("explain_dependency2", "explain_dependency2.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/explain_dependency2.q"));
  }

  public void testCliDriver_explain_logical() throws Exception {
    runTest("explain_logical", "explain_logical.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/explain_logical.q"));
  }

  public void testCliDriver_explain_rearrange() throws Exception {
    runTest("explain_rearrange", "explain_rearrange.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/explain_rearrange.q"));
  }

  public void testCliDriver_explode_null() throws Exception {
    runTest("explode_null", "explode_null.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/explode_null.q"));
  }

  public void testCliDriver_fetch_aggregation() throws Exception {
    runTest("fetch_aggregation", "fetch_aggregation.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/fetch_aggregation.q"));
  }

  public void testCliDriver_fileformat_mix() throws Exception {
    runTest("fileformat_mix", "fileformat_mix.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/fileformat_mix.q"));
  }

  public void testCliDriver_fileformat_sequencefile() throws Exception {
    runTest("fileformat_sequencefile", "fileformat_sequencefile.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/fileformat_sequencefile.q"));
  }

  public void testCliDriver_fileformat_text() throws Exception {
    runTest("fileformat_text", "fileformat_text.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/fileformat_text.q"));
  }

  public void testCliDriver_filter_join_breaktask() throws Exception {
    runTest("filter_join_breaktask", "filter_join_breaktask.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/filter_join_breaktask.q"));
  }

  public void testCliDriver_filter_join_breaktask2() throws Exception {
    runTest("filter_join_breaktask2", "filter_join_breaktask2.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/filter_join_breaktask2.q"));
  }

  public void testCliDriver_filter_numeric() throws Exception {
    runTest("filter_numeric", "filter_numeric.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/filter_numeric.q"));
  }

  public void testCliDriver_global_limit() throws Exception {
    runTest("global_limit", "global_limit.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/global_limit.q"));
  }

  public void testCliDriver_groupby1() throws Exception {
    runTest("groupby1", "groupby1.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/groupby1.q"));
  }

  public void testCliDriver_groupby10() throws Exception {
    runTest("groupby10", "groupby10.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/groupby10.q"));
  }

  public void testCliDriver_groupby11() throws Exception {
    runTest("groupby11", "groupby11.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/groupby11.q"));
  }

  public void testCliDriver_groupby12() throws Exception {
    runTest("groupby12", "groupby12.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/groupby12.q"));
  }

  public void testCliDriver_groupby1_limit() throws Exception {
    runTest("groupby1_limit", "groupby1_limit.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/groupby1_limit.q"));
  }

  public void testCliDriver_groupby1_map() throws Exception {
    runTest("groupby1_map", "groupby1_map.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/groupby1_map.q"));
  }

  public void testCliDriver_groupby1_map_nomap() throws Exception {
    runTest("groupby1_map_nomap", "groupby1_map_nomap.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/groupby1_map_nomap.q"));
  }

  public void testCliDriver_groupby1_map_skew() throws Exception {
    runTest("groupby1_map_skew", "groupby1_map_skew.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/groupby1_map_skew.q"));
  }

  public void testCliDriver_groupby1_noskew() throws Exception {
    runTest("groupby1_noskew", "groupby1_noskew.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/groupby1_noskew.q"));
  }

  public void testCliDriver_groupby2_limit() throws Exception {
    runTest("groupby2_limit", "groupby2_limit.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/groupby2_limit.q"));
  }

  public void testCliDriver_groupby2_map() throws Exception {
    runTest("groupby2_map", "groupby2_map.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/groupby2_map.q"));
  }

  public void testCliDriver_groupby2_map_multi_distinct() throws Exception {
    runTest("groupby2_map_multi_distinct", "groupby2_map_multi_distinct.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/groupby2_map_multi_distinct.q"));
  }

  public void testCliDriver_groupby2_map_skew() throws Exception {
    runTest("groupby2_map_skew", "groupby2_map_skew.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/groupby2_map_skew.q"));
  }

  public void testCliDriver_groupby2_noskew() throws Exception {
    runTest("groupby2_noskew", "groupby2_noskew.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/groupby2_noskew.q"));
  }

  public void testCliDriver_groupby2_noskew_multi_distinct() throws Exception {
    runTest("groupby2_noskew_multi_distinct", "groupby2_noskew_multi_distinct.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/groupby2_noskew_multi_distinct.q"));
  }

  public void testCliDriver_groupby3() throws Exception {
    runTest("groupby3", "groupby3.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/groupby3.q"));
  }

  public void testCliDriver_groupby3_map() throws Exception {
    runTest("groupby3_map", "groupby3_map.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/groupby3_map.q"));
  }

  public void testCliDriver_groupby3_map_multi_distinct() throws Exception {
    runTest("groupby3_map_multi_distinct", "groupby3_map_multi_distinct.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/groupby3_map_multi_distinct.q"));
  }

  public void testCliDriver_groupby3_map_skew() throws Exception {
    runTest("groupby3_map_skew", "groupby3_map_skew.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/groupby3_map_skew.q"));
  }

  public void testCliDriver_groupby3_noskew() throws Exception {
    runTest("groupby3_noskew", "groupby3_noskew.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/groupby3_noskew.q"));
  }

  public void testCliDriver_groupby3_noskew_multi_distinct() throws Exception {
    runTest("groupby3_noskew_multi_distinct", "groupby3_noskew_multi_distinct.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/groupby3_noskew_multi_distinct.q"));
  }

  public void testCliDriver_groupby4() throws Exception {
    runTest("groupby4", "groupby4.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/groupby4.q"));
  }

  public void testCliDriver_groupby4_map() throws Exception {
    runTest("groupby4_map", "groupby4_map.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/groupby4_map.q"));
  }

  public void testCliDriver_groupby4_map_skew() throws Exception {
    runTest("groupby4_map_skew", "groupby4_map_skew.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/groupby4_map_skew.q"));
  }

  public void testCliDriver_groupby4_noskew() throws Exception {
    runTest("groupby4_noskew", "groupby4_noskew.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/groupby4_noskew.q"));
  }

  public void testCliDriver_groupby5() throws Exception {
    runTest("groupby5", "groupby5.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/groupby5.q"));
  }

  public void testCliDriver_groupby5_map() throws Exception {
    runTest("groupby5_map", "groupby5_map.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/groupby5_map.q"));
  }

  public void testCliDriver_groupby5_map_skew() throws Exception {
    runTest("groupby5_map_skew", "groupby5_map_skew.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/groupby5_map_skew.q"));
  }

  public void testCliDriver_groupby5_noskew() throws Exception {
    runTest("groupby5_noskew", "groupby5_noskew.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/groupby5_noskew.q"));
  }

  public void testCliDriver_groupby6() throws Exception {
    runTest("groupby6", "groupby6.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/groupby6.q"));
  }

  public void testCliDriver_groupby6_map() throws Exception {
    runTest("groupby6_map", "groupby6_map.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/groupby6_map.q"));
  }

  public void testCliDriver_groupby6_map_skew() throws Exception {
    runTest("groupby6_map_skew", "groupby6_map_skew.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/groupby6_map_skew.q"));
  }

  public void testCliDriver_groupby6_noskew() throws Exception {
    runTest("groupby6_noskew", "groupby6_noskew.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/groupby6_noskew.q"));
  }

  public void testCliDriver_groupby7() throws Exception {
    runTest("groupby7", "groupby7.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/groupby7.q"));
  }

  public void testCliDriver_groupby7_map() throws Exception {
    runTest("groupby7_map", "groupby7_map.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/groupby7_map.q"));
  }

  public void testCliDriver_groupby7_map_multi_single_reducer() throws Exception {
    runTest("groupby7_map_multi_single_reducer", "groupby7_map_multi_single_reducer.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/groupby7_map_multi_single_reducer.q"));
  }

  public void testCliDriver_groupby7_map_skew() throws Exception {
    runTest("groupby7_map_skew", "groupby7_map_skew.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/groupby7_map_skew.q"));
  }

  public void testCliDriver_groupby7_noskew() throws Exception {
    runTest("groupby7_noskew", "groupby7_noskew.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/groupby7_noskew.q"));
  }

  public void testCliDriver_groupby7_noskew_multi_single_reducer() throws Exception {
    runTest("groupby7_noskew_multi_single_reducer", "groupby7_noskew_multi_single_reducer.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/groupby7_noskew_multi_single_reducer.q"));
  }

  public void testCliDriver_groupby8() throws Exception {
    runTest("groupby8", "groupby8.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/groupby8.q"));
  }

  public void testCliDriver_groupby8_map() throws Exception {
    runTest("groupby8_map", "groupby8_map.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/groupby8_map.q"));
  }

  public void testCliDriver_groupby8_map_skew() throws Exception {
    runTest("groupby8_map_skew", "groupby8_map_skew.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/groupby8_map_skew.q"));
  }

  public void testCliDriver_groupby8_noskew() throws Exception {
    runTest("groupby8_noskew", "groupby8_noskew.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/groupby8_noskew.q"));
  }

  public void testCliDriver_groupby9() throws Exception {
    runTest("groupby9", "groupby9.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/groupby9.q"));
  }

  public void testCliDriver_groupby_bigdata() throws Exception {
    runTest("groupby_bigdata", "groupby_bigdata.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/groupby_bigdata.q"));
  }

  public void testCliDriver_groupby_complex_types() throws Exception {
    runTest("groupby_complex_types", "groupby_complex_types.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/groupby_complex_types.q"));
  }

  public void testCliDriver_groupby_complex_types_multi_single_reducer() throws Exception {
    runTest("groupby_complex_types_multi_single_reducer", "groupby_complex_types_multi_single_reducer.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/groupby_complex_types_multi_single_reducer.q"));
  }

  public void testCliDriver_groupby_cube1() throws Exception {
    runTest("groupby_cube1", "groupby_cube1.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/groupby_cube1.q"));
  }

  public void testCliDriver_groupby_distinct_samekey() throws Exception {
    runTest("groupby_distinct_samekey", "groupby_distinct_samekey.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/groupby_distinct_samekey.q"));
  }

  public void testCliDriver_groupby_grouping_id1() throws Exception {
    runTest("groupby_grouping_id1", "groupby_grouping_id1.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/groupby_grouping_id1.q"));
  }

  public void testCliDriver_groupby_grouping_id2() throws Exception {
    runTest("groupby_grouping_id2", "groupby_grouping_id2.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/groupby_grouping_id2.q"));
  }

  public void testCliDriver_groupby_grouping_sets1() throws Exception {
    runTest("groupby_grouping_sets1", "groupby_grouping_sets1.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/groupby_grouping_sets1.q"));
  }

  public void testCliDriver_groupby_grouping_sets2() throws Exception {
    runTest("groupby_grouping_sets2", "groupby_grouping_sets2.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/groupby_grouping_sets2.q"));
  }

  public void testCliDriver_groupby_grouping_sets3() throws Exception {
    runTest("groupby_grouping_sets3", "groupby_grouping_sets3.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/groupby_grouping_sets3.q"));
  }

  public void testCliDriver_groupby_grouping_sets4() throws Exception {
    runTest("groupby_grouping_sets4", "groupby_grouping_sets4.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/groupby_grouping_sets4.q"));
  }

  public void testCliDriver_groupby_grouping_sets5() throws Exception {
    runTest("groupby_grouping_sets5", "groupby_grouping_sets5.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/groupby_grouping_sets5.q"));
  }

  public void testCliDriver_groupby_map_ppr() throws Exception {
    runTest("groupby_map_ppr", "groupby_map_ppr.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/groupby_map_ppr.q"));
  }

  public void testCliDriver_groupby_map_ppr_multi_distinct() throws Exception {
    runTest("groupby_map_ppr_multi_distinct", "groupby_map_ppr_multi_distinct.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/groupby_map_ppr_multi_distinct.q"));
  }

  public void testCliDriver_groupby_multi_insert_common_distinct() throws Exception {
    runTest("groupby_multi_insert_common_distinct", "groupby_multi_insert_common_distinct.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/groupby_multi_insert_common_distinct.q"));
  }

  public void testCliDriver_groupby_multi_single_reducer() throws Exception {
    runTest("groupby_multi_single_reducer", "groupby_multi_single_reducer.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/groupby_multi_single_reducer.q"));
  }

  public void testCliDriver_groupby_multi_single_reducer2() throws Exception {
    runTest("groupby_multi_single_reducer2", "groupby_multi_single_reducer2.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/groupby_multi_single_reducer2.q"));
  }

  public void testCliDriver_groupby_multi_single_reducer3() throws Exception {
    runTest("groupby_multi_single_reducer3", "groupby_multi_single_reducer3.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/groupby_multi_single_reducer3.q"));
  }

  public void testCliDriver_groupby_mutli_insert_common_distinct() throws Exception {
    runTest("groupby_mutli_insert_common_distinct", "groupby_mutli_insert_common_distinct.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/groupby_mutli_insert_common_distinct.q"));
  }

  public void testCliDriver_groupby_neg_float() throws Exception {
    runTest("groupby_neg_float", "groupby_neg_float.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/groupby_neg_float.q"));
  }

  public void testCliDriver_groupby_position() throws Exception {
    runTest("groupby_position", "groupby_position.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/groupby_position.q"));
  }

  public void testCliDriver_groupby_ppd() throws Exception {
    runTest("groupby_ppd", "groupby_ppd.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/groupby_ppd.q"));
  }

  public void testCliDriver_groupby_ppr() throws Exception {
    runTest("groupby_ppr", "groupby_ppr.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/groupby_ppr.q"));
  }

  public void testCliDriver_groupby_ppr_multi_distinct() throws Exception {
    runTest("groupby_ppr_multi_distinct", "groupby_ppr_multi_distinct.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/groupby_ppr_multi_distinct.q"));
  }

  public void testCliDriver_groupby_resolution() throws Exception {
    runTest("groupby_resolution", "groupby_resolution.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/groupby_resolution.q"));
  }

  public void testCliDriver_groupby_rollup1() throws Exception {
    runTest("groupby_rollup1", "groupby_rollup1.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/groupby_rollup1.q"));
  }

  public void testCliDriver_groupby_sort_1() throws Exception {
    runTest("groupby_sort_1", "groupby_sort_1.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/groupby_sort_1.q"));
  }

  public void testCliDriver_groupby_sort_10() throws Exception {
    runTest("groupby_sort_10", "groupby_sort_10.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/groupby_sort_10.q"));
  }

  public void testCliDriver_groupby_sort_11() throws Exception {
    runTest("groupby_sort_11", "groupby_sort_11.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/groupby_sort_11.q"));
  }

  public void testCliDriver_groupby_sort_2() throws Exception {
    runTest("groupby_sort_2", "groupby_sort_2.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/groupby_sort_2.q"));
  }

  public void testCliDriver_groupby_sort_3() throws Exception {
    runTest("groupby_sort_3", "groupby_sort_3.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/groupby_sort_3.q"));
  }

  public void testCliDriver_groupby_sort_4() throws Exception {
    runTest("groupby_sort_4", "groupby_sort_4.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/groupby_sort_4.q"));
  }

  public void testCliDriver_groupby_sort_5() throws Exception {
    runTest("groupby_sort_5", "groupby_sort_5.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/groupby_sort_5.q"));
  }

  public void testCliDriver_groupby_sort_6() throws Exception {
    runTest("groupby_sort_6", "groupby_sort_6.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/groupby_sort_6.q"));
  }

  public void testCliDriver_groupby_sort_7() throws Exception {
    runTest("groupby_sort_7", "groupby_sort_7.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/groupby_sort_7.q"));
  }

  public void testCliDriver_groupby_sort_8() throws Exception {
    runTest("groupby_sort_8", "groupby_sort_8.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/groupby_sort_8.q"));
  }

  public void testCliDriver_groupby_sort_9() throws Exception {
    runTest("groupby_sort_9", "groupby_sort_9.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/groupby_sort_9.q"));
  }

  public void testCliDriver_groupby_sort_skew_1() throws Exception {
    runTest("groupby_sort_skew_1", "groupby_sort_skew_1.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/groupby_sort_skew_1.q"));
  }

  public void testCliDriver_groupby_sort_test_1() throws Exception {
    runTest("groupby_sort_test_1", "groupby_sort_test_1.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/groupby_sort_test_1.q"));
  }

  public void testCliDriver_having() throws Exception {
    runTest("having", "having.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/having.q"));
  }

  public void testCliDriver_hook_context_cs() throws Exception {
    runTest("hook_context_cs", "hook_context_cs.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/hook_context_cs.q"));
  }

  public void testCliDriver_hook_order() throws Exception {
    runTest("hook_order", "hook_order.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/hook_order.q"));
  }

  public void testCliDriver_implicit_cast1() throws Exception {
    runTest("implicit_cast1", "implicit_cast1.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/implicit_cast1.q"));
  }

  public void testCliDriver_index_auth() throws Exception {
    runTest("index_auth", "index_auth.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/index_auth.q"));
  }

  public void testCliDriver_index_auto() throws Exception {
    runTest("index_auto", "index_auto.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/index_auto.q"));
  }

  public void testCliDriver_index_auto_empty() throws Exception {
    runTest("index_auto_empty", "index_auto_empty.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/index_auto_empty.q"));
  }

  public void testCliDriver_index_auto_file_format() throws Exception {
    runTest("index_auto_file_format", "index_auto_file_format.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/index_auto_file_format.q"));
  }

  public void testCliDriver_index_auto_mult_tables() throws Exception {
    runTest("index_auto_mult_tables", "index_auto_mult_tables.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/index_auto_mult_tables.q"));
  }

  public void testCliDriver_index_auto_mult_tables_compact() throws Exception {
    runTest("index_auto_mult_tables_compact", "index_auto_mult_tables_compact.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/index_auto_mult_tables_compact.q"));
  }

  public void testCliDriver_index_auto_multiple() throws Exception {
    runTest("index_auto_multiple", "index_auto_multiple.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/index_auto_multiple.q"));
  }

  public void testCliDriver_index_auto_partitioned() throws Exception {
    runTest("index_auto_partitioned", "index_auto_partitioned.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/index_auto_partitioned.q"));
  }

  public void testCliDriver_index_auto_self_join() throws Exception {
    runTest("index_auto_self_join", "index_auto_self_join.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/index_auto_self_join.q"));
  }

  public void testCliDriver_index_auto_unused() throws Exception {
    runTest("index_auto_unused", "index_auto_unused.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/index_auto_unused.q"));
  }

  public void testCliDriver_index_auto_update() throws Exception {
    runTest("index_auto_update", "index_auto_update.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/index_auto_update.q"));
  }

  public void testCliDriver_index_bitmap() throws Exception {
    runTest("index_bitmap", "index_bitmap.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/index_bitmap.q"));
  }

  public void testCliDriver_index_bitmap1() throws Exception {
    runTest("index_bitmap1", "index_bitmap1.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/index_bitmap1.q"));
  }

  public void testCliDriver_index_bitmap2() throws Exception {
    runTest("index_bitmap2", "index_bitmap2.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/index_bitmap2.q"));
  }

  public void testCliDriver_index_bitmap_auto_partitioned() throws Exception {
    runTest("index_bitmap_auto_partitioned", "index_bitmap_auto_partitioned.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/index_bitmap_auto_partitioned.q"));
  }

  public void testCliDriver_index_bitmap_compression() throws Exception {
    runTest("index_bitmap_compression", "index_bitmap_compression.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/index_bitmap_compression.q"));
  }

  public void testCliDriver_index_bitmap_rc() throws Exception {
    runTest("index_bitmap_rc", "index_bitmap_rc.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/index_bitmap_rc.q"));
  }

  public void testCliDriver_index_compact() throws Exception {
    runTest("index_compact", "index_compact.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/index_compact.q"));
  }

  public void testCliDriver_index_compact_1() throws Exception {
    runTest("index_compact_1", "index_compact_1.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/index_compact_1.q"));
  }

  public void testCliDriver_index_compact_2() throws Exception {
    runTest("index_compact_2", "index_compact_2.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/index_compact_2.q"));
  }

  public void testCliDriver_index_compact_3() throws Exception {
    runTest("index_compact_3", "index_compact_3.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/index_compact_3.q"));
  }

  public void testCliDriver_index_compact_binary_search() throws Exception {
    runTest("index_compact_binary_search", "index_compact_binary_search.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/index_compact_binary_search.q"));
  }

  public void testCliDriver_index_compression() throws Exception {
    runTest("index_compression", "index_compression.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/index_compression.q"));
  }

  public void testCliDriver_index_creation() throws Exception {
    runTest("index_creation", "index_creation.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/index_creation.q"));
  }

  public void testCliDriver_index_serde() throws Exception {
    runTest("index_serde", "index_serde.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/index_serde.q"));
  }

  public void testCliDriver_index_stale() throws Exception {
    runTest("index_stale", "index_stale.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/index_stale.q"));
  }

  public void testCliDriver_index_stale_partitioned() throws Exception {
    runTest("index_stale_partitioned", "index_stale_partitioned.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/index_stale_partitioned.q"));
  }

  public void testCliDriver_infer_bucket_sort() throws Exception {
    runTest("infer_bucket_sort", "infer_bucket_sort.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/infer_bucket_sort.q"));
  }

  public void testCliDriver_infer_bucket_sort_convert_join() throws Exception {
    runTest("infer_bucket_sort_convert_join", "infer_bucket_sort_convert_join.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/infer_bucket_sort_convert_join.q"));
  }

  public void testCliDriver_infer_bucket_sort_grouping_operators() throws Exception {
    runTest("infer_bucket_sort_grouping_operators", "infer_bucket_sort_grouping_operators.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/infer_bucket_sort_grouping_operators.q"));
  }

  public void testCliDriver_infer_bucket_sort_list_bucket() throws Exception {
    runTest("infer_bucket_sort_list_bucket", "infer_bucket_sort_list_bucket.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/infer_bucket_sort_list_bucket.q"));
  }

  public void testCliDriver_infer_bucket_sort_multi_insert() throws Exception {
    runTest("infer_bucket_sort_multi_insert", "infer_bucket_sort_multi_insert.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/infer_bucket_sort_multi_insert.q"));
  }

  public void testCliDriver_infer_const_type() throws Exception {
    runTest("infer_const_type", "infer_const_type.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/infer_const_type.q"));
  }

  public void testCliDriver_init_file() throws Exception {
    runTest("init_file", "init_file.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/init_file.q"));
  }

  public void testCliDriver_innerjoin() throws Exception {
    runTest("innerjoin", "innerjoin.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/innerjoin.q"));
  }

  public void testCliDriver_inoutdriver() throws Exception {
    runTest("inoutdriver", "inoutdriver.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/inoutdriver.q"));
  }

  public void testCliDriver_input() throws Exception {
    runTest("input", "input.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/input.q"));
  }

  public void testCliDriver_input0() throws Exception {
    runTest("input0", "input0.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/input0.q"));
  }

  public void testCliDriver_input1() throws Exception {
    runTest("input1", "input1.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/input1.q"));
  }

  public void testCliDriver_input10() throws Exception {
    runTest("input10", "input10.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/input10.q"));
  }

  public void testCliDriver_input11() throws Exception {
    runTest("input11", "input11.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/input11.q"));
  }

  public void testCliDriver_input11_limit() throws Exception {
    runTest("input11_limit", "input11_limit.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/input11_limit.q"));
  }

  public void testCliDriver_input12() throws Exception {
    runTest("input12", "input12.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/input12.q"));
  }

  public void testCliDriver_input12_hadoop20() throws Exception {
    runTest("input12_hadoop20", "input12_hadoop20.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/input12_hadoop20.q"));
  }

  public void testCliDriver_input13() throws Exception {
    runTest("input13", "input13.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/input13.q"));
  }

  public void testCliDriver_input14() throws Exception {
    runTest("input14", "input14.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/input14.q"));
  }

  public void testCliDriver_input14_limit() throws Exception {
    runTest("input14_limit", "input14_limit.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/input14_limit.q"));
  }

  public void testCliDriver_input15() throws Exception {
    runTest("input15", "input15.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/input15.q"));
  }

  public void testCliDriver_input16() throws Exception {
    runTest("input16", "input16.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/input16.q"));
  }

  public void testCliDriver_input17() throws Exception {
    runTest("input17", "input17.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/input17.q"));
  }

  public void testCliDriver_input18() throws Exception {
    runTest("input18", "input18.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/input18.q"));
  }

  public void testCliDriver_input19() throws Exception {
    runTest("input19", "input19.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/input19.q"));
  }

  public void testCliDriver_input1_limit() throws Exception {
    runTest("input1_limit", "input1_limit.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/input1_limit.q"));
  }

  public void testCliDriver_input2() throws Exception {
    runTest("input2", "input2.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/input2.q"));
  }

  public void testCliDriver_input20() throws Exception {
    runTest("input20", "input20.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/input20.q"));
  }

  public void testCliDriver_input21() throws Exception {
    runTest("input21", "input21.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/input21.q"));
  }

  public void testCliDriver_input22() throws Exception {
    runTest("input22", "input22.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/input22.q"));
  }

  public void testCliDriver_input23() throws Exception {
    runTest("input23", "input23.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/input23.q"));
  }

  public void testCliDriver_input24() throws Exception {
    runTest("input24", "input24.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/input24.q"));
  }

  public void testCliDriver_input25() throws Exception {
    runTest("input25", "input25.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/input25.q"));
  }

  public void testCliDriver_input26() throws Exception {
    runTest("input26", "input26.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/input26.q"));
  }

  public void testCliDriver_input28() throws Exception {
    runTest("input28", "input28.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/input28.q"));
  }

  public void testCliDriver_input2_limit() throws Exception {
    runTest("input2_limit", "input2_limit.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/input2_limit.q"));
  }

  public void testCliDriver_input3() throws Exception {
    runTest("input3", "input3.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/input3.q"));
  }

  public void testCliDriver_input30() throws Exception {
    runTest("input30", "input30.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/input30.q"));
  }

  public void testCliDriver_input31() throws Exception {
    runTest("input31", "input31.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/input31.q"));
  }

  public void testCliDriver_input32() throws Exception {
    runTest("input32", "input32.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/input32.q"));
  }

  public void testCliDriver_input33() throws Exception {
    runTest("input33", "input33.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/input33.q"));
  }

  public void testCliDriver_input34() throws Exception {
    runTest("input34", "input34.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/input34.q"));
  }

  public void testCliDriver_input35() throws Exception {
    runTest("input35", "input35.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/input35.q"));
  }

  public void testCliDriver_input36() throws Exception {
    runTest("input36", "input36.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/input36.q"));
  }

  public void testCliDriver_input37() throws Exception {
    runTest("input37", "input37.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/input37.q"));
  }

  public void testCliDriver_input38() throws Exception {
    runTest("input38", "input38.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/input38.q"));
  }

  public void testCliDriver_input39() throws Exception {
    runTest("input39", "input39.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/input39.q"));
  }

  public void testCliDriver_input39_hadoop20() throws Exception {
    runTest("input39_hadoop20", "input39_hadoop20.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/input39_hadoop20.q"));
  }

  public void testCliDriver_input3_limit() throws Exception {
    runTest("input3_limit", "input3_limit.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/input3_limit.q"));
  }

  public void testCliDriver_input4() throws Exception {
    runTest("input4", "input4.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/input4.q"));
  }

  public void testCliDriver_input40() throws Exception {
    runTest("input40", "input40.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/input40.q"));
  }

  public void testCliDriver_input41() throws Exception {
    runTest("input41", "input41.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/input41.q"));
  }

  public void testCliDriver_input42() throws Exception {
    runTest("input42", "input42.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/input42.q"));
  }

  public void testCliDriver_input43() throws Exception {
    runTest("input43", "input43.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/input43.q"));
  }

  public void testCliDriver_input44() throws Exception {
    runTest("input44", "input44.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/input44.q"));
  }

  public void testCliDriver_input45() throws Exception {
    runTest("input45", "input45.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/input45.q"));
  }

  public void testCliDriver_input46() throws Exception {
    runTest("input46", "input46.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/input46.q"));
  }

  public void testCliDriver_input49() throws Exception {
    runTest("input49", "input49.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/input49.q"));
  }

  public void testCliDriver_input4_cb_delim() throws Exception {
    runTest("input4_cb_delim", "input4_cb_delim.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/input4_cb_delim.q"));
  }

  public void testCliDriver_input4_limit() throws Exception {
    runTest("input4_limit", "input4_limit.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/input4_limit.q"));
  }

  public void testCliDriver_input5() throws Exception {
    runTest("input5", "input5.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/input5.q"));
  }

  public void testCliDriver_input6() throws Exception {
    runTest("input6", "input6.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/input6.q"));
  }

  public void testCliDriver_input7() throws Exception {
    runTest("input7", "input7.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/input7.q"));
  }

  public void testCliDriver_input8() throws Exception {
    runTest("input8", "input8.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/input8.q"));
  }

  public void testCliDriver_input9() throws Exception {
    runTest("input9", "input9.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/input9.q"));
  }

  public void testCliDriver_input_columnarserde() throws Exception {
    runTest("input_columnarserde", "input_columnarserde.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/input_columnarserde.q"));
  }

  public void testCliDriver_input_dfs() throws Exception {
    runTest("input_dfs", "input_dfs.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/input_dfs.q"));
  }

  public void testCliDriver_input_dynamicserde() throws Exception {
    runTest("input_dynamicserde", "input_dynamicserde.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/input_dynamicserde.q"));
  }

  public void testCliDriver_input_lazyserde() throws Exception {
    runTest("input_lazyserde", "input_lazyserde.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/input_lazyserde.q"));
  }

  public void testCliDriver_input_limit() throws Exception {
    runTest("input_limit", "input_limit.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/input_limit.q"));
  }

  public void testCliDriver_input_part0() throws Exception {
    runTest("input_part0", "input_part0.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/input_part0.q"));
  }

  public void testCliDriver_input_part1() throws Exception {
    runTest("input_part1", "input_part1.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/input_part1.q"));
  }

  public void testCliDriver_input_part10() throws Exception {
    runTest("input_part10", "input_part10.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/input_part10.q"));
  }

  public void testCliDriver_input_part10_win() throws Exception {
    runTest("input_part10_win", "input_part10_win.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/input_part10_win.q"));
  }

  public void testCliDriver_input_part2() throws Exception {
    runTest("input_part2", "input_part2.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/input_part2.q"));
  }

  public void testCliDriver_input_part3() throws Exception {
    runTest("input_part3", "input_part3.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/input_part3.q"));
  }

  public void testCliDriver_input_part4() throws Exception {
    runTest("input_part4", "input_part4.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/input_part4.q"));
  }

  public void testCliDriver_input_part5() throws Exception {
    runTest("input_part5", "input_part5.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/input_part5.q"));
  }

  public void testCliDriver_input_part6() throws Exception {
    runTest("input_part6", "input_part6.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/input_part6.q"));
  }

  public void testCliDriver_input_part7() throws Exception {
    runTest("input_part7", "input_part7.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/input_part7.q"));
  }

  public void testCliDriver_input_part8() throws Exception {
    runTest("input_part8", "input_part8.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/input_part8.q"));
  }

  public void testCliDriver_input_part9() throws Exception {
    runTest("input_part9", "input_part9.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/input_part9.q"));
  }

  public void testCliDriver_input_testsequencefile() throws Exception {
    runTest("input_testsequencefile", "input_testsequencefile.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/input_testsequencefile.q"));
  }

  public void testCliDriver_input_testxpath() throws Exception {
    runTest("input_testxpath", "input_testxpath.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/input_testxpath.q"));
  }

  public void testCliDriver_input_testxpath2() throws Exception {
    runTest("input_testxpath2", "input_testxpath2.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/input_testxpath2.q"));
  }

  public void testCliDriver_input_testxpath3() throws Exception {
    runTest("input_testxpath3", "input_testxpath3.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/input_testxpath3.q"));
  }

  public void testCliDriver_input_testxpath4() throws Exception {
    runTest("input_testxpath4", "input_testxpath4.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/input_testxpath4.q"));
  }

  public void testCliDriver_inputddl1() throws Exception {
    runTest("inputddl1", "inputddl1.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/inputddl1.q"));
  }

  public void testCliDriver_inputddl2() throws Exception {
    runTest("inputddl2", "inputddl2.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/inputddl2.q"));
  }

  public void testCliDriver_inputddl3() throws Exception {
    runTest("inputddl3", "inputddl3.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/inputddl3.q"));
  }

  public void testCliDriver_inputddl4() throws Exception {
    runTest("inputddl4", "inputddl4.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/inputddl4.q"));
  }

  public void testCliDriver_inputddl5() throws Exception {
    runTest("inputddl5", "inputddl5.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/inputddl5.q"));
  }

  public void testCliDriver_inputddl6() throws Exception {
    runTest("inputddl6", "inputddl6.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/inputddl6.q"));
  }

  public void testCliDriver_inputddl7() throws Exception {
    runTest("inputddl7", "inputddl7.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/inputddl7.q"));
  }

  public void testCliDriver_inputddl8() throws Exception {
    runTest("inputddl8", "inputddl8.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/inputddl8.q"));
  }

  public void testCliDriver_insert1() throws Exception {
    runTest("insert1", "insert1.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/insert1.q"));
  }

  public void testCliDriver_insert1_overwrite_partitions() throws Exception {
    runTest("insert1_overwrite_partitions", "insert1_overwrite_partitions.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/insert1_overwrite_partitions.q"));
  }

  public void testCliDriver_insert2_overwrite_partitions() throws Exception {
    runTest("insert2_overwrite_partitions", "insert2_overwrite_partitions.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/insert2_overwrite_partitions.q"));
  }

  public void testCliDriver_insert_compressed() throws Exception {
    runTest("insert_compressed", "insert_compressed.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/insert_compressed.q"));
  }

  public void testCliDriver_insert_into1() throws Exception {
    runTest("insert_into1", "insert_into1.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/insert_into1.q"));
  }

  public void testCliDriver_insert_into2() throws Exception {
    runTest("insert_into2", "insert_into2.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/insert_into2.q"));
  }

  public void testCliDriver_insert_into3() throws Exception {
    runTest("insert_into3", "insert_into3.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/insert_into3.q"));
  }

  public void testCliDriver_insert_into4() throws Exception {
    runTest("insert_into4", "insert_into4.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/insert_into4.q"));
  }

  public void testCliDriver_insert_into5() throws Exception {
    runTest("insert_into5", "insert_into5.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/insert_into5.q"));
  }

  public void testCliDriver_insert_into6() throws Exception {
    runTest("insert_into6", "insert_into6.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/insert_into6.q"));
  }

  public void testCliDriver_insert_overwrite_local_directory_1() throws Exception {
    runTest("insert_overwrite_local_directory_1", "insert_overwrite_local_directory_1.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/insert_overwrite_local_directory_1.q"));
  }

  public void testCliDriver_insertexternal1() throws Exception {
    runTest("insertexternal1", "insertexternal1.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/insertexternal1.q"));
  }

  public void testCliDriver_join0() throws Exception {
    runTest("join0", "join0.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/join0.q"));
  }

  public void testCliDriver_join10() throws Exception {
    runTest("join10", "join10.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/join10.q"));
  }

  public void testCliDriver_join11() throws Exception {
    runTest("join11", "join11.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/join11.q"));
  }

  public void testCliDriver_join12() throws Exception {
    runTest("join12", "join12.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/join12.q"));
  }

  public void testCliDriver_join13() throws Exception {
    runTest("join13", "join13.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/join13.q"));
  }

  public void testCliDriver_join14() throws Exception {
    runTest("join14", "join14.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/join14.q"));
  }

  public void testCliDriver_join14_hadoop20() throws Exception {
    runTest("join14_hadoop20", "join14_hadoop20.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/join14_hadoop20.q"));
  }

  public void testCliDriver_join15() throws Exception {
    runTest("join15", "join15.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/join15.q"));
  }

  public void testCliDriver_join16() throws Exception {
    runTest("join16", "join16.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/join16.q"));
  }

  public void testCliDriver_join17() throws Exception {
    runTest("join17", "join17.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/join17.q"));
  }

  public void testCliDriver_join18() throws Exception {
    runTest("join18", "join18.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/join18.q"));
  }

  public void testCliDriver_join18_multi_distinct() throws Exception {
    runTest("join18_multi_distinct", "join18_multi_distinct.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/join18_multi_distinct.q"));
  }

  public void testCliDriver_join19() throws Exception {
    runTest("join19", "join19.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/join19.q"));
  }

  public void testCliDriver_join2() throws Exception {
    runTest("join2", "join2.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/join2.q"));
  }

  public void testCliDriver_join20() throws Exception {
    runTest("join20", "join20.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/join20.q"));
  }

  public void testCliDriver_join21() throws Exception {
    runTest("join21", "join21.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/join21.q"));
  }

  public void testCliDriver_join22() throws Exception {
    runTest("join22", "join22.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/join22.q"));
  }

  public void testCliDriver_join23() throws Exception {
    runTest("join23", "join23.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/join23.q"));
  }

  public void testCliDriver_join24() throws Exception {
    runTest("join24", "join24.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/join24.q"));
  }

  public void testCliDriver_join25() throws Exception {
    runTest("join25", "join25.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/join25.q"));
  }

  public void testCliDriver_join26() throws Exception {
    runTest("join26", "join26.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/join26.q"));
  }

  public void testCliDriver_join27() throws Exception {
    runTest("join27", "join27.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/join27.q"));
  }

  public void testCliDriver_join28() throws Exception {
    runTest("join28", "join28.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/join28.q"));
  }

  public void testCliDriver_join29() throws Exception {
    runTest("join29", "join29.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/join29.q"));
  }

  public void testCliDriver_join3() throws Exception {
    runTest("join3", "join3.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/join3.q"));
  }

  public void testCliDriver_join30() throws Exception {
    runTest("join30", "join30.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/join30.q"));
  }

  public void testCliDriver_join31() throws Exception {
    runTest("join31", "join31.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/join31.q"));
  }

  public void testCliDriver_join32() throws Exception {
    runTest("join32", "join32.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/join32.q"));
  }

  public void testCliDriver_join32_lessSize() throws Exception {
    runTest("join32_lessSize", "join32_lessSize.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/join32_lessSize.q"));
  }

  public void testCliDriver_join33() throws Exception {
    runTest("join33", "join33.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/join33.q"));
  }

  public void testCliDriver_join34() throws Exception {
    runTest("join34", "join34.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/join34.q"));
  }

  public void testCliDriver_join35() throws Exception {
    runTest("join35", "join35.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/join35.q"));
  }

  public void testCliDriver_join36() throws Exception {
    runTest("join36", "join36.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/join36.q"));
  }

  public void testCliDriver_join37() throws Exception {
    runTest("join37", "join37.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/join37.q"));
  }

  public void testCliDriver_join38() throws Exception {
    runTest("join38", "join38.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/join38.q"));
  }

  public void testCliDriver_join39() throws Exception {
    runTest("join39", "join39.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/join39.q"));
  }

  public void testCliDriver_join4() throws Exception {
    runTest("join4", "join4.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/join4.q"));
  }

  public void testCliDriver_join40() throws Exception {
    runTest("join40", "join40.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/join40.q"));
  }

  public void testCliDriver_join41() throws Exception {
    runTest("join41", "join41.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/join41.q"));
  }

  public void testCliDriver_join5() throws Exception {
    runTest("join5", "join5.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/join5.q"));
  }

  public void testCliDriver_join6() throws Exception {
    runTest("join6", "join6.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/join6.q"));
  }

  public void testCliDriver_join7() throws Exception {
    runTest("join7", "join7.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/join7.q"));
  }

  public void testCliDriver_join8() throws Exception {
    runTest("join8", "join8.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/join8.q"));
  }

  public void testCliDriver_join9() throws Exception {
    runTest("join9", "join9.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/join9.q"));
  }

  public void testCliDriver_join_1to1() throws Exception {
    runTest("join_1to1", "join_1to1.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/join_1to1.q"));
  }

  public void testCliDriver_join_alt_syntax() throws Exception {
    runTest("join_alt_syntax", "join_alt_syntax.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/join_alt_syntax.q"));
  }

  public void testCliDriver_join_array() throws Exception {
    runTest("join_array", "join_array.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/join_array.q"));
  }

  public void testCliDriver_join_casesensitive() throws Exception {
    runTest("join_casesensitive", "join_casesensitive.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/join_casesensitive.q"));
  }

  public void testCliDriver_join_cond_pushdown_1() throws Exception {
    runTest("join_cond_pushdown_1", "join_cond_pushdown_1.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/join_cond_pushdown_1.q"));
  }

  public void testCliDriver_join_cond_pushdown_2() throws Exception {
    runTest("join_cond_pushdown_2", "join_cond_pushdown_2.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/join_cond_pushdown_2.q"));
  }

  public void testCliDriver_join_cond_pushdown_3() throws Exception {
    runTest("join_cond_pushdown_3", "join_cond_pushdown_3.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/join_cond_pushdown_3.q"));
  }

  public void testCliDriver_join_cond_pushdown_4() throws Exception {
    runTest("join_cond_pushdown_4", "join_cond_pushdown_4.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/join_cond_pushdown_4.q"));
  }

  public void testCliDriver_join_cond_pushdown_unqual1() throws Exception {
    runTest("join_cond_pushdown_unqual1", "join_cond_pushdown_unqual1.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/join_cond_pushdown_unqual1.q"));
  }

  public void testCliDriver_join_cond_pushdown_unqual2() throws Exception {
    runTest("join_cond_pushdown_unqual2", "join_cond_pushdown_unqual2.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/join_cond_pushdown_unqual2.q"));
  }

  public void testCliDriver_join_cond_pushdown_unqual3() throws Exception {
    runTest("join_cond_pushdown_unqual3", "join_cond_pushdown_unqual3.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/join_cond_pushdown_unqual3.q"));
  }

  public void testCliDriver_join_cond_pushdown_unqual4() throws Exception {
    runTest("join_cond_pushdown_unqual4", "join_cond_pushdown_unqual4.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/join_cond_pushdown_unqual4.q"));
  }

  public void testCliDriver_join_empty() throws Exception {
    runTest("join_empty", "join_empty.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/join_empty.q"));
  }

  public void testCliDriver_join_filters() throws Exception {
    runTest("join_filters", "join_filters.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/join_filters.q"));
  }

  public void testCliDriver_join_filters_overlap() throws Exception {
    runTest("join_filters_overlap", "join_filters_overlap.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/join_filters_overlap.q"));
  }

  public void testCliDriver_join_hive_626() throws Exception {
    runTest("join_hive_626", "join_hive_626.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/join_hive_626.q"));
  }

  public void testCliDriver_join_literals() throws Exception {
    runTest("join_literals", "join_literals.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/join_literals.q"));
  }

  public void testCliDriver_join_map_ppr() throws Exception {
    runTest("join_map_ppr", "join_map_ppr.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/join_map_ppr.q"));
  }

  public void testCliDriver_join_merging() throws Exception {
    runTest("join_merging", "join_merging.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/join_merging.q"));
  }

  public void testCliDriver_join_nulls() throws Exception {
    runTest("join_nulls", "join_nulls.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/join_nulls.q"));
  }

  public void testCliDriver_join_nullsafe() throws Exception {
    runTest("join_nullsafe", "join_nullsafe.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/join_nullsafe.q"));
  }

  public void testCliDriver_join_rc() throws Exception {
    runTest("join_rc", "join_rc.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/join_rc.q"));
  }

  public void testCliDriver_join_reorder() throws Exception {
    runTest("join_reorder", "join_reorder.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/join_reorder.q"));
  }

  public void testCliDriver_join_reorder2() throws Exception {
    runTest("join_reorder2", "join_reorder2.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/join_reorder2.q"));
  }

  public void testCliDriver_join_reorder3() throws Exception {
    runTest("join_reorder3", "join_reorder3.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/join_reorder3.q"));
  }

  public void testCliDriver_join_reorder4() throws Exception {
    runTest("join_reorder4", "join_reorder4.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/join_reorder4.q"));
  }

  public void testCliDriver_join_star() throws Exception {
    runTest("join_star", "join_star.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/join_star.q"));
  }

  public void testCliDriver_join_thrift() throws Exception {
    runTest("join_thrift", "join_thrift.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/join_thrift.q"));
  }

  public void testCliDriver_join_vc() throws Exception {
    runTest("join_vc", "join_vc.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/join_vc.q"));
  }

  public void testCliDriver_join_view() throws Exception {
    runTest("join_view", "join_view.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/join_view.q"));
  }

  public void testCliDriver_keyword_1() throws Exception {
    runTest("keyword_1", "keyword_1.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/keyword_1.q"));
  }

  public void testCliDriver_lateral_view() throws Exception {
    runTest("lateral_view", "lateral_view.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/lateral_view.q"));
  }

  public void testCliDriver_lateral_view_cp() throws Exception {
    runTest("lateral_view_cp", "lateral_view_cp.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/lateral_view_cp.q"));
  }

  public void testCliDriver_lateral_view_noalias() throws Exception {
    runTest("lateral_view_noalias", "lateral_view_noalias.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/lateral_view_noalias.q"));
  }

  public void testCliDriver_lateral_view_outer() throws Exception {
    runTest("lateral_view_outer", "lateral_view_outer.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/lateral_view_outer.q"));
  }

  public void testCliDriver_lateral_view_ppd() throws Exception {
    runTest("lateral_view_ppd", "lateral_view_ppd.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/lateral_view_ppd.q"));
  }

  public void testCliDriver_lb_fs_stats() throws Exception {
    runTest("lb_fs_stats", "lb_fs_stats.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/lb_fs_stats.q"));
  }

  public void testCliDriver_leadlag() throws Exception {
    runTest("leadlag", "leadlag.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/leadlag.q"));
  }

  public void testCliDriver_leadlag_queries() throws Exception {
    runTest("leadlag_queries", "leadlag_queries.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/leadlag_queries.q"));
  }

  public void testCliDriver_leftsemijoin() throws Exception {
    runTest("leftsemijoin", "leftsemijoin.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/leftsemijoin.q"));
  }

  public void testCliDriver_limit_partition_metadataonly() throws Exception {
    runTest("limit_partition_metadataonly", "limit_partition_metadataonly.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/limit_partition_metadataonly.q"));
  }

  public void testCliDriver_limit_pushdown() throws Exception {
    runTest("limit_pushdown", "limit_pushdown.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/limit_pushdown.q"));
  }

  public void testCliDriver_limit_pushdown_negative() throws Exception {
    runTest("limit_pushdown_negative", "limit_pushdown_negative.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/limit_pushdown_negative.q"));
  }

  public void testCliDriver_lineage1() throws Exception {
    runTest("lineage1", "lineage1.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/lineage1.q"));
  }

  public void testCliDriver_list_bucket_dml_1() throws Exception {
    runTest("list_bucket_dml_1", "list_bucket_dml_1.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/list_bucket_dml_1.q"));
  }

  public void testCliDriver_list_bucket_dml_11() throws Exception {
    runTest("list_bucket_dml_11", "list_bucket_dml_11.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/list_bucket_dml_11.q"));
  }

  public void testCliDriver_list_bucket_dml_12() throws Exception {
    runTest("list_bucket_dml_12", "list_bucket_dml_12.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/list_bucket_dml_12.q"));
  }

  public void testCliDriver_list_bucket_dml_13() throws Exception {
    runTest("list_bucket_dml_13", "list_bucket_dml_13.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/list_bucket_dml_13.q"));
  }

  public void testCliDriver_list_bucket_dml_2() throws Exception {
    runTest("list_bucket_dml_2", "list_bucket_dml_2.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/list_bucket_dml_2.q"));
  }

  public void testCliDriver_list_bucket_dml_3() throws Exception {
    runTest("list_bucket_dml_3", "list_bucket_dml_3.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/list_bucket_dml_3.q"));
  }

  public void testCliDriver_list_bucket_dml_4() throws Exception {
    runTest("list_bucket_dml_4", "list_bucket_dml_4.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/list_bucket_dml_4.q"));
  }

  public void testCliDriver_list_bucket_dml_5() throws Exception {
    runTest("list_bucket_dml_5", "list_bucket_dml_5.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/list_bucket_dml_5.q"));
  }

  public void testCliDriver_list_bucket_dml_6() throws Exception {
    runTest("list_bucket_dml_6", "list_bucket_dml_6.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/list_bucket_dml_6.q"));
  }

  public void testCliDriver_list_bucket_dml_7() throws Exception {
    runTest("list_bucket_dml_7", "list_bucket_dml_7.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/list_bucket_dml_7.q"));
  }

  public void testCliDriver_list_bucket_dml_8() throws Exception {
    runTest("list_bucket_dml_8", "list_bucket_dml_8.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/list_bucket_dml_8.q"));
  }

  public void testCliDriver_list_bucket_dml_9() throws Exception {
    runTest("list_bucket_dml_9", "list_bucket_dml_9.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/list_bucket_dml_9.q"));
  }

  public void testCliDriver_list_bucket_query_multiskew_1() throws Exception {
    runTest("list_bucket_query_multiskew_1", "list_bucket_query_multiskew_1.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/list_bucket_query_multiskew_1.q"));
  }

  public void testCliDriver_list_bucket_query_multiskew_2() throws Exception {
    runTest("list_bucket_query_multiskew_2", "list_bucket_query_multiskew_2.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/list_bucket_query_multiskew_2.q"));
  }

  public void testCliDriver_list_bucket_query_multiskew_3() throws Exception {
    runTest("list_bucket_query_multiskew_3", "list_bucket_query_multiskew_3.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/list_bucket_query_multiskew_3.q"));
  }

  public void testCliDriver_list_bucket_query_oneskew_1() throws Exception {
    runTest("list_bucket_query_oneskew_1", "list_bucket_query_oneskew_1.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/list_bucket_query_oneskew_1.q"));
  }

  public void testCliDriver_list_bucket_query_oneskew_2() throws Exception {
    runTest("list_bucket_query_oneskew_2", "list_bucket_query_oneskew_2.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/list_bucket_query_oneskew_2.q"));
  }

  public void testCliDriver_list_bucket_query_oneskew_3() throws Exception {
    runTest("list_bucket_query_oneskew_3", "list_bucket_query_oneskew_3.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/list_bucket_query_oneskew_3.q"));
  }

  public void testCliDriver_literal_decimal() throws Exception {
    runTest("literal_decimal", "literal_decimal.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/literal_decimal.q"));
  }

  public void testCliDriver_literal_double() throws Exception {
    runTest("literal_double", "literal_double.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/literal_double.q"));
  }

  public void testCliDriver_literal_ints() throws Exception {
    runTest("literal_ints", "literal_ints.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/literal_ints.q"));
  }

  public void testCliDriver_literal_string() throws Exception {
    runTest("literal_string", "literal_string.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/literal_string.q"));
  }

  public void testCliDriver_load_binary_data() throws Exception {
    runTest("load_binary_data", "load_binary_data.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/load_binary_data.q"));
  }

  public void testCliDriver_load_dyn_part1() throws Exception {
    runTest("load_dyn_part1", "load_dyn_part1.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/load_dyn_part1.q"));
  }

  public void testCliDriver_load_dyn_part10() throws Exception {
    runTest("load_dyn_part10", "load_dyn_part10.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/load_dyn_part10.q"));
  }

  public void testCliDriver_load_dyn_part11() throws Exception {
    runTest("load_dyn_part11", "load_dyn_part11.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/load_dyn_part11.q"));
  }

  public void testCliDriver_load_dyn_part12() throws Exception {
    runTest("load_dyn_part12", "load_dyn_part12.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/load_dyn_part12.q"));
  }

  public void testCliDriver_load_dyn_part13() throws Exception {
    runTest("load_dyn_part13", "load_dyn_part13.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/load_dyn_part13.q"));
  }

  public void testCliDriver_load_dyn_part14() throws Exception {
    runTest("load_dyn_part14", "load_dyn_part14.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/load_dyn_part14.q"));
  }

  public void testCliDriver_load_dyn_part14_win() throws Exception {
    runTest("load_dyn_part14_win", "load_dyn_part14_win.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/load_dyn_part14_win.q"));
  }

  public void testCliDriver_load_dyn_part15() throws Exception {
    runTest("load_dyn_part15", "load_dyn_part15.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/load_dyn_part15.q"));
  }

  public void testCliDriver_load_dyn_part2() throws Exception {
    runTest("load_dyn_part2", "load_dyn_part2.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/load_dyn_part2.q"));
  }

  public void testCliDriver_load_dyn_part3() throws Exception {
    runTest("load_dyn_part3", "load_dyn_part3.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/load_dyn_part3.q"));
  }

  public void testCliDriver_load_dyn_part4() throws Exception {
    runTest("load_dyn_part4", "load_dyn_part4.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/load_dyn_part4.q"));
  }

  public void testCliDriver_load_dyn_part5() throws Exception {
    runTest("load_dyn_part5", "load_dyn_part5.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/load_dyn_part5.q"));
  }

  public void testCliDriver_load_dyn_part6() throws Exception {
    runTest("load_dyn_part6", "load_dyn_part6.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/load_dyn_part6.q"));
  }

  public void testCliDriver_load_dyn_part7() throws Exception {
    runTest("load_dyn_part7", "load_dyn_part7.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/load_dyn_part7.q"));
  }

  public void testCliDriver_load_dyn_part8() throws Exception {
    runTest("load_dyn_part8", "load_dyn_part8.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/load_dyn_part8.q"));
  }

  public void testCliDriver_load_dyn_part9() throws Exception {
    runTest("load_dyn_part9", "load_dyn_part9.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/load_dyn_part9.q"));
  }

  public void testCliDriver_load_exist_part_authsuccess() throws Exception {
    runTest("load_exist_part_authsuccess", "load_exist_part_authsuccess.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/load_exist_part_authsuccess.q"));
  }

  public void testCliDriver_load_file_with_space_in_the_name() throws Exception {
    runTest("load_file_with_space_in_the_name", "load_file_with_space_in_the_name.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/load_file_with_space_in_the_name.q"));
  }

  public void testCliDriver_load_fs() throws Exception {
    runTest("load_fs", "load_fs.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/load_fs.q"));
  }

  public void testCliDriver_load_fs_overwrite() throws Exception {
    runTest("load_fs_overwrite", "load_fs_overwrite.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/load_fs_overwrite.q"));
  }

  public void testCliDriver_load_nonpart_authsuccess() throws Exception {
    runTest("load_nonpart_authsuccess", "load_nonpart_authsuccess.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/load_nonpart_authsuccess.q"));
  }

  public void testCliDriver_load_overwrite() throws Exception {
    runTest("load_overwrite", "load_overwrite.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/load_overwrite.q"));
  }

  public void testCliDriver_load_part_authsuccess() throws Exception {
    runTest("load_part_authsuccess", "load_part_authsuccess.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/load_part_authsuccess.q"));
  }

  public void testCliDriver_loadpart1() throws Exception {
    runTest("loadpart1", "loadpart1.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/loadpart1.q"));
  }

  public void testCliDriver_loadpart2() throws Exception {
    runTest("loadpart2", "loadpart2.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/loadpart2.q"));
  }

  public void testCliDriver_loadpart_err() throws Exception {
    runTest("loadpart_err", "loadpart_err.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/loadpart_err.q"));
  }

  public void testCliDriver_lock1() throws Exception {
    runTest("lock1", "lock1.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/lock1.q"));
  }

  public void testCliDriver_lock2() throws Exception {
    runTest("lock2", "lock2.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/lock2.q"));
  }

  public void testCliDriver_lock3() throws Exception {
    runTest("lock3", "lock3.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/lock3.q"));
  }

  public void testCliDriver_lock4() throws Exception {
    runTest("lock4", "lock4.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/lock4.q"));
  }

  public void testCliDriver_louter_join_ppr() throws Exception {
    runTest("louter_join_ppr", "louter_join_ppr.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/louter_join_ppr.q"));
  }

  public void testCliDriver_macro() throws Exception {
    runTest("macro", "macro.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/macro.q"));
  }

  public void testCliDriver_mapjoin1() throws Exception {
    runTest("mapjoin1", "mapjoin1.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/mapjoin1.q"));
  }

  public void testCliDriver_mapjoin_addjar() throws Exception {
    runTest("mapjoin_addjar", "mapjoin_addjar.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/mapjoin_addjar.q"));
  }

  public void testCliDriver_mapjoin_distinct() throws Exception {
    runTest("mapjoin_distinct", "mapjoin_distinct.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/mapjoin_distinct.q"));
  }

  public void testCliDriver_mapjoin_filter_on_outerjoin() throws Exception {
    runTest("mapjoin_filter_on_outerjoin", "mapjoin_filter_on_outerjoin.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/mapjoin_filter_on_outerjoin.q"));
  }

  public void testCliDriver_mapjoin_hook() throws Exception {
    runTest("mapjoin_hook", "mapjoin_hook.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/mapjoin_hook.q"));
  }

  public void testCliDriver_mapjoin_mapjoin() throws Exception {
    runTest("mapjoin_mapjoin", "mapjoin_mapjoin.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/mapjoin_mapjoin.q"));
  }

  public void testCliDriver_mapjoin_memcheck() throws Exception {
    runTest("mapjoin_memcheck", "mapjoin_memcheck.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/mapjoin_memcheck.q"));
  }

  public void testCliDriver_mapjoin_subquery() throws Exception {
    runTest("mapjoin_subquery", "mapjoin_subquery.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/mapjoin_subquery.q"));
  }

  public void testCliDriver_mapjoin_subquery2() throws Exception {
    runTest("mapjoin_subquery2", "mapjoin_subquery2.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/mapjoin_subquery2.q"));
  }

  public void testCliDriver_mapjoin_test_outer() throws Exception {
    runTest("mapjoin_test_outer", "mapjoin_test_outer.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/mapjoin_test_outer.q"));
  }

  public void testCliDriver_mapreduce1() throws Exception {
    runTest("mapreduce1", "mapreduce1.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/mapreduce1.q"));
  }

  public void testCliDriver_mapreduce2() throws Exception {
    runTest("mapreduce2", "mapreduce2.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/mapreduce2.q"));
  }

  public void testCliDriver_mapreduce3() throws Exception {
    runTest("mapreduce3", "mapreduce3.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/mapreduce3.q"));
  }

  public void testCliDriver_mapreduce4() throws Exception {
    runTest("mapreduce4", "mapreduce4.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/mapreduce4.q"));
  }

  public void testCliDriver_mapreduce5() throws Exception {
    runTest("mapreduce5", "mapreduce5.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/mapreduce5.q"));
  }

  public void testCliDriver_mapreduce6() throws Exception {
    runTest("mapreduce6", "mapreduce6.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/mapreduce6.q"));
  }

  public void testCliDriver_mapreduce7() throws Exception {
    runTest("mapreduce7", "mapreduce7.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/mapreduce7.q"));
  }

  public void testCliDriver_mapreduce8() throws Exception {
    runTest("mapreduce8", "mapreduce8.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/mapreduce8.q"));
  }

  public void testCliDriver_merge1() throws Exception {
    runTest("merge1", "merge1.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/merge1.q"));
  }

  public void testCliDriver_merge2() throws Exception {
    runTest("merge2", "merge2.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/merge2.q"));
  }

  public void testCliDriver_merge3() throws Exception {
    runTest("merge3", "merge3.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/merge3.q"));
  }

  public void testCliDriver_merge4() throws Exception {
    runTest("merge4", "merge4.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/merge4.q"));
  }

  public void testCliDriver_merge_dynamic_partition() throws Exception {
    runTest("merge_dynamic_partition", "merge_dynamic_partition.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/merge_dynamic_partition.q"));
  }

  public void testCliDriver_merge_dynamic_partition2() throws Exception {
    runTest("merge_dynamic_partition2", "merge_dynamic_partition2.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/merge_dynamic_partition2.q"));
  }

  public void testCliDriver_merge_dynamic_partition3() throws Exception {
    runTest("merge_dynamic_partition3", "merge_dynamic_partition3.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/merge_dynamic_partition3.q"));
  }

  public void testCliDriver_merge_dynamic_partition4() throws Exception {
    runTest("merge_dynamic_partition4", "merge_dynamic_partition4.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/merge_dynamic_partition4.q"));
  }

  public void testCliDriver_merge_dynamic_partition5() throws Exception {
    runTest("merge_dynamic_partition5", "merge_dynamic_partition5.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/merge_dynamic_partition5.q"));
  }

  public void testCliDriver_mergejoins() throws Exception {
    runTest("mergejoins", "mergejoins.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/mergejoins.q"));
  }

  public void testCliDriver_mergejoins_mixed() throws Exception {
    runTest("mergejoins_mixed", "mergejoins_mixed.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/mergejoins_mixed.q"));
  }

  public void testCliDriver_metadata_export_drop() throws Exception {
    runTest("metadata_export_drop", "metadata_export_drop.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/metadata_export_drop.q"));
  }

  public void testCliDriver_metadata_only_queries() throws Exception {
    runTest("metadata_only_queries", "metadata_only_queries.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/metadata_only_queries.q"));
  }

  public void testCliDriver_metadata_only_queries_with_filters() throws Exception {
    runTest("metadata_only_queries_with_filters", "metadata_only_queries_with_filters.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/metadata_only_queries_with_filters.q"));
  }

  public void testCliDriver_metadataonly1() throws Exception {
    runTest("metadataonly1", "metadataonly1.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/metadataonly1.q"));
  }

  public void testCliDriver_mi() throws Exception {
    runTest("mi", "mi.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/mi.q"));
  }

  public void testCliDriver_misc_json() throws Exception {
    runTest("misc_json", "misc_json.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/misc_json.q"));
  }

  public void testCliDriver_multiMapJoin1() throws Exception {
    runTest("multiMapJoin1", "multiMapJoin1.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/multiMapJoin1.q"));
  }

  public void testCliDriver_multiMapJoin2() throws Exception {
    runTest("multiMapJoin2", "multiMapJoin2.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/multiMapJoin2.q"));
  }

  public void testCliDriver_multi_insert() throws Exception {
    runTest("multi_insert", "multi_insert.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/multi_insert.q"));
  }

  public void testCliDriver_multi_insert_gby() throws Exception {
    runTest("multi_insert_gby", "multi_insert_gby.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/multi_insert_gby.q"));
  }

  public void testCliDriver_multi_insert_gby2() throws Exception {
    runTest("multi_insert_gby2", "multi_insert_gby2.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/multi_insert_gby2.q"));
  }

  public void testCliDriver_multi_insert_gby3() throws Exception {
    runTest("multi_insert_gby3", "multi_insert_gby3.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/multi_insert_gby3.q"));
  }

  public void testCliDriver_multi_insert_lateral_view() throws Exception {
    runTest("multi_insert_lateral_view", "multi_insert_lateral_view.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/multi_insert_lateral_view.q"));
  }

  public void testCliDriver_multi_insert_move_tasks_share_dependencies() throws Exception {
    runTest("multi_insert_move_tasks_share_dependencies", "multi_insert_move_tasks_share_dependencies.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/multi_insert_move_tasks_share_dependencies.q"));
  }

  public void testCliDriver_multi_join_union() throws Exception {
    runTest("multi_join_union", "multi_join_union.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/multi_join_union.q"));
  }

  public void testCliDriver_multi_sahooks() throws Exception {
    runTest("multi_sahooks", "multi_sahooks.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/multi_sahooks.q"));
  }

  public void testCliDriver_multigroupby_singlemr() throws Exception {
    runTest("multigroupby_singlemr", "multigroupby_singlemr.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/multigroupby_singlemr.q"));
  }

  public void testCliDriver_nested_complex() throws Exception {
    runTest("nested_complex", "nested_complex.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/nested_complex.q"));
  }

  public void testCliDriver_nestedvirtual() throws Exception {
    runTest("nestedvirtual", "nestedvirtual.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/nestedvirtual.q"));
  }

  public void testCliDriver_newline() throws Exception {
    runTest("newline", "newline.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/newline.q"));
  }

  public void testCliDriver_no_hooks() throws Exception {
    runTest("no_hooks", "no_hooks.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/no_hooks.q"));
  }

  public void testCliDriver_noalias_subq1() throws Exception {
    runTest("noalias_subq1", "noalias_subq1.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/noalias_subq1.q"));
  }

  public void testCliDriver_nomore_ambiguous_table_col() throws Exception {
    runTest("nomore_ambiguous_table_col", "nomore_ambiguous_table_col.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/nomore_ambiguous_table_col.q"));
  }

  public void testCliDriver_nonblock_op_deduplicate() throws Exception {
    runTest("nonblock_op_deduplicate", "nonblock_op_deduplicate.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/nonblock_op_deduplicate.q"));
  }

  public void testCliDriver_nonmr_fetch() throws Exception {
    runTest("nonmr_fetch", "nonmr_fetch.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/nonmr_fetch.q"));
  }

  public void testCliDriver_nonmr_fetch_threshold() throws Exception {
    runTest("nonmr_fetch_threshold", "nonmr_fetch_threshold.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/nonmr_fetch_threshold.q"));
  }

  public void testCliDriver_nonreserved_keywords_input37() throws Exception {
    runTest("nonreserved_keywords_input37", "nonreserved_keywords_input37.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/nonreserved_keywords_input37.q"));
  }

  public void testCliDriver_nonreserved_keywords_insert_into1() throws Exception {
    runTest("nonreserved_keywords_insert_into1", "nonreserved_keywords_insert_into1.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/nonreserved_keywords_insert_into1.q"));
  }

  public void testCliDriver_notable_alias1() throws Exception {
    runTest("notable_alias1", "notable_alias1.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/notable_alias1.q"));
  }

  public void testCliDriver_notable_alias2() throws Exception {
    runTest("notable_alias2", "notable_alias2.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/notable_alias2.q"));
  }

  public void testCliDriver_notable_alias3() throws Exception {
    runTest("notable_alias3", "notable_alias3.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/notable_alias3.q"));
  }

  public void testCliDriver_null_cast() throws Exception {
    runTest("null_cast", "null_cast.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/null_cast.q"));
  }

  public void testCliDriver_null_column() throws Exception {
    runTest("null_column", "null_column.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/null_column.q"));
  }

  public void testCliDriver_nullformat() throws Exception {
    runTest("nullformat", "nullformat.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/nullformat.q"));
  }

  public void testCliDriver_nullformatCTAS() throws Exception {
    runTest("nullformatCTAS", "nullformatCTAS.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/nullformatCTAS.q"));
  }

  public void testCliDriver_nullformatdir() throws Exception {
    runTest("nullformatdir", "nullformatdir.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/nullformatdir.q"));
  }

  public void testCliDriver_nullgroup() throws Exception {
    runTest("nullgroup", "nullgroup.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/nullgroup.q"));
  }

  public void testCliDriver_nullgroup2() throws Exception {
    runTest("nullgroup2", "nullgroup2.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/nullgroup2.q"));
  }

  public void testCliDriver_nullgroup3() throws Exception {
    runTest("nullgroup3", "nullgroup3.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/nullgroup3.q"));
  }

  public void testCliDriver_nullgroup4() throws Exception {
    runTest("nullgroup4", "nullgroup4.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/nullgroup4.q"));
  }

  public void testCliDriver_nullgroup4_multi_distinct() throws Exception {
    runTest("nullgroup4_multi_distinct", "nullgroup4_multi_distinct.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/nullgroup4_multi_distinct.q"));
  }

  public void testCliDriver_nullgroup5() throws Exception {
    runTest("nullgroup5", "nullgroup5.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/nullgroup5.q"));
  }

  public void testCliDriver_nullinput() throws Exception {
    runTest("nullinput", "nullinput.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/nullinput.q"));
  }

  public void testCliDriver_nullinput2() throws Exception {
    runTest("nullinput2", "nullinput2.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/nullinput2.q"));
  }

  public void testCliDriver_nullscript() throws Exception {
    runTest("nullscript", "nullscript.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/nullscript.q"));
  }

  public void testCliDriver_num_op_type_conv() throws Exception {
    runTest("num_op_type_conv", "num_op_type_conv.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/num_op_type_conv.q"));
  }

  public void testCliDriver_ops_comparison() throws Exception {
    runTest("ops_comparison", "ops_comparison.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/ops_comparison.q"));
  }

  public void testCliDriver_optional_outer() throws Exception {
    runTest("optional_outer", "optional_outer.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/optional_outer.q"));
  }

  public void testCliDriver_orc_analyze() throws Exception {
    runTest("orc_analyze", "orc_analyze.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/orc_analyze.q"));
  }

  public void testCliDriver_orc_create() throws Exception {
    runTest("orc_create", "orc_create.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/orc_create.q"));
  }

  public void testCliDriver_orc_createas1() throws Exception {
    runTest("orc_createas1", "orc_createas1.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/orc_createas1.q"));
  }

  public void testCliDriver_orc_dictionary_threshold() throws Exception {
    runTest("orc_dictionary_threshold", "orc_dictionary_threshold.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/orc_dictionary_threshold.q"));
  }

  public void testCliDriver_orc_diff_part_cols() throws Exception {
    runTest("orc_diff_part_cols", "orc_diff_part_cols.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/orc_diff_part_cols.q"));
  }

  public void testCliDriver_orc_diff_part_cols2() throws Exception {
    runTest("orc_diff_part_cols2", "orc_diff_part_cols2.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/orc_diff_part_cols2.q"));
  }

  public void testCliDriver_orc_empty_files() throws Exception {
    runTest("orc_empty_files", "orc_empty_files.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/orc_empty_files.q"));
  }

  public void testCliDriver_orc_empty_strings() throws Exception {
    runTest("orc_empty_strings", "orc_empty_strings.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/orc_empty_strings.q"));
  }

  public void testCliDriver_orc_ends_with_nulls() throws Exception {
    runTest("orc_ends_with_nulls", "orc_ends_with_nulls.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/orc_ends_with_nulls.q"));
  }

  public void testCliDriver_orc_min_max() throws Exception {
    runTest("orc_min_max", "orc_min_max.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/orc_min_max.q"));
  }

  public void testCliDriver_orc_ppd_char() throws Exception {
    runTest("orc_ppd_char", "orc_ppd_char.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/orc_ppd_char.q"));
  }

  public void testCliDriver_orc_ppd_date() throws Exception {
    runTest("orc_ppd_date", "orc_ppd_date.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/orc_ppd_date.q"));
  }

  public void testCliDriver_orc_ppd_decimal() throws Exception {
    runTest("orc_ppd_decimal", "orc_ppd_decimal.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/orc_ppd_decimal.q"));
  }

  public void testCliDriver_orc_ppd_varchar() throws Exception {
    runTest("orc_ppd_varchar", "orc_ppd_varchar.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/orc_ppd_varchar.q"));
  }

  public void testCliDriver_orc_predicate_pushdown() throws Exception {
    runTest("orc_predicate_pushdown", "orc_predicate_pushdown.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/orc_predicate_pushdown.q"));
  }

  public void testCliDriver_orc_split_elimination() throws Exception {
    runTest("orc_split_elimination", "orc_split_elimination.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/orc_split_elimination.q"));
  }

  public void testCliDriver_orc_vectorization_ppd() throws Exception {
    runTest("orc_vectorization_ppd", "orc_vectorization_ppd.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/orc_vectorization_ppd.q"));
  }

  public void testCliDriver_order() throws Exception {
    runTest("order", "order.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/order.q"));
  }

  public void testCliDriver_order2() throws Exception {
    runTest("order2", "order2.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/order2.q"));
  }

  public void testCliDriver_order_within_subquery() throws Exception {
    runTest("order_within_subquery", "order_within_subquery.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/order_within_subquery.q"));
  }

  public void testCliDriver_outer_join_ppr() throws Exception {
    runTest("outer_join_ppr", "outer_join_ppr.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/outer_join_ppr.q"));
  }

  public void testCliDriver_overridden_confs() throws Exception {
    runTest("overridden_confs", "overridden_confs.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/overridden_confs.q"));
  }

  public void testCliDriver_parallel() throws Exception {
    runTest("parallel", "parallel.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/parallel.q"));
  }

  public void testCliDriver_parenthesis_star_by() throws Exception {
    runTest("parenthesis_star_by", "parenthesis_star_by.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/parenthesis_star_by.q"));
  }

  public void testCliDriver_parquet_create() throws Exception {
    runTest("parquet_create", "parquet_create.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/parquet_create.q"));
  }

  public void testCliDriver_parquet_ctas() throws Exception {
    runTest("parquet_ctas", "parquet_ctas.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/parquet_ctas.q"));
  }

  public void testCliDriver_parquet_partitioned() throws Exception {
    runTest("parquet_partitioned", "parquet_partitioned.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/parquet_partitioned.q"));
  }

  public void testCliDriver_parquet_types() throws Exception {
    runTest("parquet_types", "parquet_types.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/parquet_types.q"));
  }

  public void testCliDriver_partInit() throws Exception {
    runTest("partInit", "partInit.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/partInit.q"));
  }

  public void testCliDriver_part_inherit_tbl_props() throws Exception {
    runTest("part_inherit_tbl_props", "part_inherit_tbl_props.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/part_inherit_tbl_props.q"));
  }

  public void testCliDriver_part_inherit_tbl_props_empty() throws Exception {
    runTest("part_inherit_tbl_props_empty", "part_inherit_tbl_props_empty.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/part_inherit_tbl_props_empty.q"));
  }

  public void testCliDriver_part_inherit_tbl_props_with_star() throws Exception {
    runTest("part_inherit_tbl_props_with_star", "part_inherit_tbl_props_with_star.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/part_inherit_tbl_props_with_star.q"));
  }

  public void testCliDriver_partcols1() throws Exception {
    runTest("partcols1", "partcols1.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/partcols1.q"));
  }

  public void testCliDriver_partition_date() throws Exception {
    runTest("partition_date", "partition_date.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/partition_date.q"));
  }

  public void testCliDriver_partition_date2() throws Exception {
    runTest("partition_date2", "partition_date2.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/partition_date2.q"));
  }

  public void testCliDriver_partition_decode_name() throws Exception {
    runTest("partition_decode_name", "partition_decode_name.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/partition_decode_name.q"));
  }

  public void testCliDriver_partition_schema1() throws Exception {
    runTest("partition_schema1", "partition_schema1.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/partition_schema1.q"));
  }

  public void testCliDriver_partition_serde_format() throws Exception {
    runTest("partition_serde_format", "partition_serde_format.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/partition_serde_format.q"));
  }

  public void testCliDriver_partition_special_char() throws Exception {
    runTest("partition_special_char", "partition_special_char.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/partition_special_char.q"));
  }

  public void testCliDriver_partition_type_check() throws Exception {
    runTest("partition_type_check", "partition_type_check.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/partition_type_check.q"));
  }

  public void testCliDriver_partition_varchar1() throws Exception {
    runTest("partition_varchar1", "partition_varchar1.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/partition_varchar1.q"));
  }

  public void testCliDriver_partition_varchar2() throws Exception {
    runTest("partition_varchar2", "partition_varchar2.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/partition_varchar2.q"));
  }

  public void testCliDriver_partition_vs_table_metadata() throws Exception {
    runTest("partition_vs_table_metadata", "partition_vs_table_metadata.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/partition_vs_table_metadata.q"));
  }

  public void testCliDriver_partition_wise_fileformat() throws Exception {
    runTest("partition_wise_fileformat", "partition_wise_fileformat.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/partition_wise_fileformat.q"));
  }

  public void testCliDriver_partition_wise_fileformat10() throws Exception {
    runTest("partition_wise_fileformat10", "partition_wise_fileformat10.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/partition_wise_fileformat10.q"));
  }

  public void testCliDriver_partition_wise_fileformat11() throws Exception {
    runTest("partition_wise_fileformat11", "partition_wise_fileformat11.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/partition_wise_fileformat11.q"));
  }

  public void testCliDriver_partition_wise_fileformat12() throws Exception {
    runTest("partition_wise_fileformat12", "partition_wise_fileformat12.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/partition_wise_fileformat12.q"));
  }

  public void testCliDriver_partition_wise_fileformat13() throws Exception {
    runTest("partition_wise_fileformat13", "partition_wise_fileformat13.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/partition_wise_fileformat13.q"));
  }

  public void testCliDriver_partition_wise_fileformat14() throws Exception {
    runTest("partition_wise_fileformat14", "partition_wise_fileformat14.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/partition_wise_fileformat14.q"));
  }

  public void testCliDriver_partition_wise_fileformat15() throws Exception {
    runTest("partition_wise_fileformat15", "partition_wise_fileformat15.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/partition_wise_fileformat15.q"));
  }

  public void testCliDriver_partition_wise_fileformat16() throws Exception {
    runTest("partition_wise_fileformat16", "partition_wise_fileformat16.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/partition_wise_fileformat16.q"));
  }

  public void testCliDriver_partition_wise_fileformat17() throws Exception {
    runTest("partition_wise_fileformat17", "partition_wise_fileformat17.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/partition_wise_fileformat17.q"));
  }

  public void testCliDriver_partition_wise_fileformat18() throws Exception {
    runTest("partition_wise_fileformat18", "partition_wise_fileformat18.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/partition_wise_fileformat18.q"));
  }

  public void testCliDriver_partition_wise_fileformat2() throws Exception {
    runTest("partition_wise_fileformat2", "partition_wise_fileformat2.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/partition_wise_fileformat2.q"));
  }

  public void testCliDriver_partition_wise_fileformat3() throws Exception {
    runTest("partition_wise_fileformat3", "partition_wise_fileformat3.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/partition_wise_fileformat3.q"));
  }

  public void testCliDriver_partition_wise_fileformat4() throws Exception {
    runTest("partition_wise_fileformat4", "partition_wise_fileformat4.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/partition_wise_fileformat4.q"));
  }

  public void testCliDriver_partition_wise_fileformat5() throws Exception {
    runTest("partition_wise_fileformat5", "partition_wise_fileformat5.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/partition_wise_fileformat5.q"));
  }

  public void testCliDriver_partition_wise_fileformat6() throws Exception {
    runTest("partition_wise_fileformat6", "partition_wise_fileformat6.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/partition_wise_fileformat6.q"));
  }

  public void testCliDriver_partition_wise_fileformat7() throws Exception {
    runTest("partition_wise_fileformat7", "partition_wise_fileformat7.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/partition_wise_fileformat7.q"));
  }

  public void testCliDriver_partition_wise_fileformat8() throws Exception {
    runTest("partition_wise_fileformat8", "partition_wise_fileformat8.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/partition_wise_fileformat8.q"));
  }

  public void testCliDriver_partition_wise_fileformat9() throws Exception {
    runTest("partition_wise_fileformat9", "partition_wise_fileformat9.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/partition_wise_fileformat9.q"));
  }

  public void testCliDriver_partitions_json() throws Exception {
    runTest("partitions_json", "partitions_json.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/partitions_json.q"));
  }

  public void testCliDriver_pcr() throws Exception {
    runTest("pcr", "pcr.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/pcr.q"));
  }

  public void testCliDriver_plan_json() throws Exception {
    runTest("plan_json", "plan_json.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/plan_json.q"));
  }

  public void testCliDriver_ppd1() throws Exception {
    runTest("ppd1", "ppd1.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/ppd1.q"));
  }

  public void testCliDriver_ppd2() throws Exception {
    runTest("ppd2", "ppd2.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/ppd2.q"));
  }

  public void testCliDriver_ppd_clusterby() throws Exception {
    runTest("ppd_clusterby", "ppd_clusterby.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/ppd_clusterby.q"));
  }

  public void testCliDriver_ppd_constant_expr() throws Exception {
    runTest("ppd_constant_expr", "ppd_constant_expr.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/ppd_constant_expr.q"));
  }

  public void testCliDriver_ppd_constant_where() throws Exception {
    runTest("ppd_constant_where", "ppd_constant_where.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/ppd_constant_where.q"));
  }

  public void testCliDriver_ppd_gby() throws Exception {
    runTest("ppd_gby", "ppd_gby.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/ppd_gby.q"));
  }

  public void testCliDriver_ppd_gby2() throws Exception {
    runTest("ppd_gby2", "ppd_gby2.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/ppd_gby2.q"));
  }

  public void testCliDriver_ppd_gby_join() throws Exception {
    runTest("ppd_gby_join", "ppd_gby_join.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/ppd_gby_join.q"));
  }

  public void testCliDriver_ppd_join() throws Exception {
    runTest("ppd_join", "ppd_join.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/ppd_join.q"));
  }

  public void testCliDriver_ppd_join2() throws Exception {
    runTest("ppd_join2", "ppd_join2.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/ppd_join2.q"));
  }

  public void testCliDriver_ppd_join3() throws Exception {
    runTest("ppd_join3", "ppd_join3.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/ppd_join3.q"));
  }

  public void testCliDriver_ppd_join4() throws Exception {
    runTest("ppd_join4", "ppd_join4.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/ppd_join4.q"));
  }

  public void testCliDriver_ppd_join_filter() throws Exception {
    runTest("ppd_join_filter", "ppd_join_filter.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/ppd_join_filter.q"));
  }

  public void testCliDriver_ppd_multi_insert() throws Exception {
    runTest("ppd_multi_insert", "ppd_multi_insert.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/ppd_multi_insert.q"));
  }

  public void testCliDriver_ppd_outer_join1() throws Exception {
    runTest("ppd_outer_join1", "ppd_outer_join1.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/ppd_outer_join1.q"));
  }

  public void testCliDriver_ppd_outer_join2() throws Exception {
    runTest("ppd_outer_join2", "ppd_outer_join2.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/ppd_outer_join2.q"));
  }

  public void testCliDriver_ppd_outer_join3() throws Exception {
    runTest("ppd_outer_join3", "ppd_outer_join3.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/ppd_outer_join3.q"));
  }

  public void testCliDriver_ppd_outer_join4() throws Exception {
    runTest("ppd_outer_join4", "ppd_outer_join4.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/ppd_outer_join4.q"));
  }

  public void testCliDriver_ppd_outer_join5() throws Exception {
    runTest("ppd_outer_join5", "ppd_outer_join5.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/ppd_outer_join5.q"));
  }

  public void testCliDriver_ppd_random() throws Exception {
    runTest("ppd_random", "ppd_random.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/ppd_random.q"));
  }

  public void testCliDriver_ppd_repeated_alias() throws Exception {
    runTest("ppd_repeated_alias", "ppd_repeated_alias.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/ppd_repeated_alias.q"));
  }

  public void testCliDriver_ppd_transform() throws Exception {
    runTest("ppd_transform", "ppd_transform.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/ppd_transform.q"));
  }

  public void testCliDriver_ppd_udf_case() throws Exception {
    runTest("ppd_udf_case", "ppd_udf_case.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/ppd_udf_case.q"));
  }

  public void testCliDriver_ppd_udf_col() throws Exception {
    runTest("ppd_udf_col", "ppd_udf_col.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/ppd_udf_col.q"));
  }

  public void testCliDriver_ppd_udtf() throws Exception {
    runTest("ppd_udtf", "ppd_udtf.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/ppd_udtf.q"));
  }

  public void testCliDriver_ppd_union() throws Exception {
    runTest("ppd_union", "ppd_union.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/ppd_union.q"));
  }

  public void testCliDriver_ppd_union_view() throws Exception {
    runTest("ppd_union_view", "ppd_union_view.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/ppd_union_view.q"));
  }

  public void testCliDriver_ppd_vc() throws Exception {
    runTest("ppd_vc", "ppd_vc.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/ppd_vc.q"));
  }

  public void testCliDriver_ppr_allchildsarenull() throws Exception {
    runTest("ppr_allchildsarenull", "ppr_allchildsarenull.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/ppr_allchildsarenull.q"));
  }

  public void testCliDriver_ppr_pushdown() throws Exception {
    runTest("ppr_pushdown", "ppr_pushdown.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/ppr_pushdown.q"));
  }

  public void testCliDriver_ppr_pushdown2() throws Exception {
    runTest("ppr_pushdown2", "ppr_pushdown2.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/ppr_pushdown2.q"));
  }

  public void testCliDriver_ppr_pushdown3() throws Exception {
    runTest("ppr_pushdown3", "ppr_pushdown3.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/ppr_pushdown3.q"));
  }

  public void testCliDriver_print_header() throws Exception {
    runTest("print_header", "print_header.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/print_header.q"));
  }

  public void testCliDriver_progress_1() throws Exception {
    runTest("progress_1", "progress_1.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/progress_1.q"));
  }

  public void testCliDriver_protectmode() throws Exception {
    runTest("protectmode", "protectmode.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/protectmode.q"));
  }

  public void testCliDriver_protectmode2() throws Exception {
    runTest("protectmode2", "protectmode2.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/protectmode2.q"));
  }

  public void testCliDriver_ptf() throws Exception {
    runTest("ptf", "ptf.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/ptf.q"));
  }

  public void testCliDriver_ptf_decimal() throws Exception {
    runTest("ptf_decimal", "ptf_decimal.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/ptf_decimal.q"));
  }

  public void testCliDriver_ptf_general_queries() throws Exception {
    runTest("ptf_general_queries", "ptf_general_queries.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/ptf_general_queries.q"));
  }

  public void testCliDriver_ptf_matchpath() throws Exception {
    runTest("ptf_matchpath", "ptf_matchpath.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/ptf_matchpath.q"));
  }

  public void testCliDriver_ptf_rcfile() throws Exception {
    runTest("ptf_rcfile", "ptf_rcfile.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/ptf_rcfile.q"));
  }

  public void testCliDriver_ptf_register_tblfn() throws Exception {
    runTest("ptf_register_tblfn", "ptf_register_tblfn.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/ptf_register_tblfn.q"));
  }

  public void testCliDriver_ptf_seqfile() throws Exception {
    runTest("ptf_seqfile", "ptf_seqfile.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/ptf_seqfile.q"));
  }

  public void testCliDriver_push_or() throws Exception {
    runTest("push_or", "push_or.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/push_or.q"));
  }

  public void testCliDriver_query_properties() throws Exception {
    runTest("query_properties", "query_properties.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/query_properties.q"));
  }

  public void testCliDriver_query_result_fileformat() throws Exception {
    runTest("query_result_fileformat", "query_result_fileformat.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/query_result_fileformat.q"));
  }

  public void testCliDriver_query_with_semi() throws Exception {
    runTest("query_with_semi", "query_with_semi.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/query_with_semi.q"));
  }

  public void testCliDriver_quote1() throws Exception {
    runTest("quote1", "quote1.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/quote1.q"));
  }

  public void testCliDriver_quote2() throws Exception {
    runTest("quote2", "quote2.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/quote2.q"));
  }

  public void testCliDriver_quotedid_alter() throws Exception {
    runTest("quotedid_alter", "quotedid_alter.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/quotedid_alter.q"));
  }

  public void testCliDriver_quotedid_basic() throws Exception {
    runTest("quotedid_basic", "quotedid_basic.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/quotedid_basic.q"));
  }

  public void testCliDriver_quotedid_partition() throws Exception {
    runTest("quotedid_partition", "quotedid_partition.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/quotedid_partition.q"));
  }

  public void testCliDriver_quotedid_skew() throws Exception {
    runTest("quotedid_skew", "quotedid_skew.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/quotedid_skew.q"));
  }

  public void testCliDriver_quotedid_tblproperty() throws Exception {
    runTest("quotedid_tblproperty", "quotedid_tblproperty.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/quotedid_tblproperty.q"));
  }

  public void testCliDriver_rand_partitionpruner1() throws Exception {
    runTest("rand_partitionpruner1", "rand_partitionpruner1.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/rand_partitionpruner1.q"));
  }

  public void testCliDriver_rand_partitionpruner2() throws Exception {
    runTest("rand_partitionpruner2", "rand_partitionpruner2.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/rand_partitionpruner2.q"));
  }

  public void testCliDriver_rand_partitionpruner3() throws Exception {
    runTest("rand_partitionpruner3", "rand_partitionpruner3.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/rand_partitionpruner3.q"));
  }

  public void testCliDriver_rcfile_bigdata() throws Exception {
    runTest("rcfile_bigdata", "rcfile_bigdata.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/rcfile_bigdata.q"));
  }

  public void testCliDriver_rcfile_columnar() throws Exception {
    runTest("rcfile_columnar", "rcfile_columnar.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/rcfile_columnar.q"));
  }

  public void testCliDriver_rcfile_createas1() throws Exception {
    runTest("rcfile_createas1", "rcfile_createas1.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/rcfile_createas1.q"));
  }

  public void testCliDriver_rcfile_default_format() throws Exception {
    runTest("rcfile_default_format", "rcfile_default_format.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/rcfile_default_format.q"));
  }

  public void testCliDriver_rcfile_lazydecompress() throws Exception {
    runTest("rcfile_lazydecompress", "rcfile_lazydecompress.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/rcfile_lazydecompress.q"));
  }

  public void testCliDriver_rcfile_merge1() throws Exception {
    runTest("rcfile_merge1", "rcfile_merge1.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/rcfile_merge1.q"));
  }

  public void testCliDriver_rcfile_merge2() throws Exception {
    runTest("rcfile_merge2", "rcfile_merge2.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/rcfile_merge2.q"));
  }

  public void testCliDriver_rcfile_merge3() throws Exception {
    runTest("rcfile_merge3", "rcfile_merge3.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/rcfile_merge3.q"));
  }

  public void testCliDriver_rcfile_merge4() throws Exception {
    runTest("rcfile_merge4", "rcfile_merge4.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/rcfile_merge4.q"));
  }

  public void testCliDriver_rcfile_null_value() throws Exception {
    runTest("rcfile_null_value", "rcfile_null_value.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/rcfile_null_value.q"));
  }

  public void testCliDriver_rcfile_toleratecorruptions() throws Exception {
    runTest("rcfile_toleratecorruptions", "rcfile_toleratecorruptions.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/rcfile_toleratecorruptions.q"));
  }

  public void testCliDriver_rcfile_union() throws Exception {
    runTest("rcfile_union", "rcfile_union.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/rcfile_union.q"));
  }

  public void testCliDriver_recursive_dir() throws Exception {
    runTest("recursive_dir", "recursive_dir.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/recursive_dir.q"));
  }

  public void testCliDriver_reduce_deduplicate_exclude_gby() throws Exception {
    runTest("reduce_deduplicate_exclude_gby", "reduce_deduplicate_exclude_gby.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/reduce_deduplicate_exclude_gby.q"));
  }

  public void testCliDriver_reduce_deduplicate_exclude_join() throws Exception {
    runTest("reduce_deduplicate_exclude_join", "reduce_deduplicate_exclude_join.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/reduce_deduplicate_exclude_join.q"));
  }

  public void testCliDriver_reduce_deduplicate_extended() throws Exception {
    runTest("reduce_deduplicate_extended", "reduce_deduplicate_extended.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/reduce_deduplicate_extended.q"));
  }

  public void testCliDriver_reducesink_dedup() throws Exception {
    runTest("reducesink_dedup", "reducesink_dedup.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/reducesink_dedup.q"));
  }

  public void testCliDriver_regex_col() throws Exception {
    runTest("regex_col", "regex_col.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/regex_col.q"));
  }

  public void testCliDriver_regexp_extract() throws Exception {
    runTest("regexp_extract", "regexp_extract.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/regexp_extract.q"));
  }

  public void testCliDriver_rename_column() throws Exception {
    runTest("rename_column", "rename_column.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/rename_column.q"));
  }

  public void testCliDriver_rename_external_partition_location() throws Exception {
    runTest("rename_external_partition_location", "rename_external_partition_location.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/rename_external_partition_location.q"));
  }

  public void testCliDriver_rename_partition_location() throws Exception {
    runTest("rename_partition_location", "rename_partition_location.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/rename_partition_location.q"));
  }

  public void testCliDriver_rename_table_location() throws Exception {
    runTest("rename_table_location", "rename_table_location.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/rename_table_location.q"));
  }

  public void testCliDriver_repair() throws Exception {
    runTest("repair", "repair.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/repair.q"));
  }

  public void testCliDriver_reset_conf() throws Exception {
    runTest("reset_conf", "reset_conf.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/reset_conf.q"));
  }

  public void testCliDriver_router_join_ppr() throws Exception {
    runTest("router_join_ppr", "router_join_ppr.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/router_join_ppr.q"));
  }

  public void testCliDriver_sample1() throws Exception {
    runTest("sample1", "sample1.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/sample1.q"));
  }

  public void testCliDriver_sample10() throws Exception {
    runTest("sample10", "sample10.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/sample10.q"));
  }

  public void testCliDriver_sample2() throws Exception {
    runTest("sample2", "sample2.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/sample2.q"));
  }

  public void testCliDriver_sample3() throws Exception {
    runTest("sample3", "sample3.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/sample3.q"));
  }

  public void testCliDriver_sample4() throws Exception {
    runTest("sample4", "sample4.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/sample4.q"));
  }

  public void testCliDriver_sample5() throws Exception {
    runTest("sample5", "sample5.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/sample5.q"));
  }

  public void testCliDriver_sample6() throws Exception {
    runTest("sample6", "sample6.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/sample6.q"));
  }

  public void testCliDriver_sample7() throws Exception {
    runTest("sample7", "sample7.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/sample7.q"));
  }

  public void testCliDriver_sample8() throws Exception {
    runTest("sample8", "sample8.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/sample8.q"));
  }

  public void testCliDriver_sample9() throws Exception {
    runTest("sample9", "sample9.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/sample9.q"));
  }

  public void testCliDriver_sample_islocalmode_hook() throws Exception {
    runTest("sample_islocalmode_hook", "sample_islocalmode_hook.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/sample_islocalmode_hook.q"));
  }

  public void testCliDriver_sample_islocalmode_hook_hadoop20() throws Exception {
    runTest("sample_islocalmode_hook_hadoop20", "sample_islocalmode_hook_hadoop20.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/sample_islocalmode_hook_hadoop20.q"));
  }

  public void testCliDriver_script_env_var1() throws Exception {
    runTest("script_env_var1", "script_env_var1.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/script_env_var1.q"));
  }

  public void testCliDriver_script_env_var2() throws Exception {
    runTest("script_env_var2", "script_env_var2.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/script_env_var2.q"));
  }

  public void testCliDriver_script_pipe() throws Exception {
    runTest("script_pipe", "script_pipe.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/script_pipe.q"));
  }

  public void testCliDriver_select_as_omitted() throws Exception {
    runTest("select_as_omitted", "select_as_omitted.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/select_as_omitted.q"));
  }

  public void testCliDriver_select_dummy_source() throws Exception {
    runTest("select_dummy_source", "select_dummy_source.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/select_dummy_source.q"));
  }

  public void testCliDriver_select_transform_hint() throws Exception {
    runTest("select_transform_hint", "select_transform_hint.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/select_transform_hint.q"));
  }

  public void testCliDriver_select_unquote_and() throws Exception {
    runTest("select_unquote_and", "select_unquote_and.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/select_unquote_and.q"));
  }

  public void testCliDriver_select_unquote_not() throws Exception {
    runTest("select_unquote_not", "select_unquote_not.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/select_unquote_not.q"));
  }

  public void testCliDriver_select_unquote_or() throws Exception {
    runTest("select_unquote_or", "select_unquote_or.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/select_unquote_or.q"));
  }

  public void testCliDriver_semicolon() throws Exception {
    runTest("semicolon", "semicolon.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/semicolon.q"));
  }

  public void testCliDriver_semijoin() throws Exception {
    runTest("semijoin", "semijoin.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/semijoin.q"));
  }

  public void testCliDriver_serde_regex() throws Exception {
    runTest("serde_regex", "serde_regex.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/serde_regex.q"));
  }

  public void testCliDriver_serde_reported_schema() throws Exception {
    runTest("serde_reported_schema", "serde_reported_schema.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/serde_reported_schema.q"));
  }

  public void testCliDriver_serde_user_properties() throws Exception {
    runTest("serde_user_properties", "serde_user_properties.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/serde_user_properties.q"));
  }

  public void testCliDriver_set_processor_namespaces() throws Exception {
    runTest("set_processor_namespaces", "set_processor_namespaces.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/set_processor_namespaces.q"));
  }

  public void testCliDriver_set_variable_sub() throws Exception {
    runTest("set_variable_sub", "set_variable_sub.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/set_variable_sub.q"));
  }

  public void testCliDriver_show_columns() throws Exception {
    runTest("show_columns", "show_columns.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/show_columns.q"));
  }

  public void testCliDriver_show_create_table_alter() throws Exception {
    runTest("show_create_table_alter", "show_create_table_alter.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/show_create_table_alter.q"));
  }

  public void testCliDriver_show_create_table_db_table() throws Exception {
    runTest("show_create_table_db_table", "show_create_table_db_table.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/show_create_table_db_table.q"));
  }

  public void testCliDriver_show_create_table_delimited() throws Exception {
    runTest("show_create_table_delimited", "show_create_table_delimited.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/show_create_table_delimited.q"));
  }

  public void testCliDriver_show_create_table_partitioned() throws Exception {
    runTest("show_create_table_partitioned", "show_create_table_partitioned.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/show_create_table_partitioned.q"));
  }

  public void testCliDriver_show_create_table_serde() throws Exception {
    runTest("show_create_table_serde", "show_create_table_serde.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/show_create_table_serde.q"));
  }

  public void testCliDriver_show_create_table_view() throws Exception {
    runTest("show_create_table_view", "show_create_table_view.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/show_create_table_view.q"));
  }

  public void testCliDriver_show_describe_func_quotes() throws Exception {
    runTest("show_describe_func_quotes", "show_describe_func_quotes.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/show_describe_func_quotes.q"));
  }

  public void testCliDriver_show_functions() throws Exception {
    runTest("show_functions", "show_functions.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/show_functions.q"));
  }

  public void testCliDriver_show_indexes_edge_cases() throws Exception {
    runTest("show_indexes_edge_cases", "show_indexes_edge_cases.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/show_indexes_edge_cases.q"));
  }

  public void testCliDriver_show_indexes_syntax() throws Exception {
    runTest("show_indexes_syntax", "show_indexes_syntax.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/show_indexes_syntax.q"));
  }

  public void testCliDriver_show_partitions() throws Exception {
    runTest("show_partitions", "show_partitions.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/show_partitions.q"));
  }

  public void testCliDriver_show_roles() throws Exception {
    runTest("show_roles", "show_roles.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/show_roles.q"));
  }

  public void testCliDriver_show_tables() throws Exception {
    runTest("show_tables", "show_tables.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/show_tables.q"));
  }

  public void testCliDriver_show_tablestatus() throws Exception {
    runTest("show_tablestatus", "show_tablestatus.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/show_tablestatus.q"));
  }

  public void testCliDriver_show_tblproperties() throws Exception {
    runTest("show_tblproperties", "show_tblproperties.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/show_tblproperties.q"));
  }

  public void testCliDriver_showparts() throws Exception {
    runTest("showparts", "showparts.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/showparts.q"));
  }

  public void testCliDriver_skewjoin() throws Exception {
    runTest("skewjoin", "skewjoin.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/skewjoin.q"));
  }

  public void testCliDriver_skewjoin_noskew() throws Exception {
    runTest("skewjoin_noskew", "skewjoin_noskew.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/skewjoin_noskew.q"));
  }

  public void testCliDriver_skewjoin_union_remove_1() throws Exception {
    runTest("skewjoin_union_remove_1", "skewjoin_union_remove_1.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/skewjoin_union_remove_1.q"));
  }

  public void testCliDriver_skewjoin_union_remove_2() throws Exception {
    runTest("skewjoin_union_remove_2", "skewjoin_union_remove_2.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/skewjoin_union_remove_2.q"));
  }

  public void testCliDriver_skewjoinopt1() throws Exception {
    runTest("skewjoinopt1", "skewjoinopt1.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/skewjoinopt1.q"));
  }

  public void testCliDriver_skewjoinopt10() throws Exception {
    runTest("skewjoinopt10", "skewjoinopt10.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/skewjoinopt10.q"));
  }

  public void testCliDriver_skewjoinopt11() throws Exception {
    runTest("skewjoinopt11", "skewjoinopt11.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/skewjoinopt11.q"));
  }

  public void testCliDriver_skewjoinopt12() throws Exception {
    runTest("skewjoinopt12", "skewjoinopt12.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/skewjoinopt12.q"));
  }

  public void testCliDriver_skewjoinopt13() throws Exception {
    runTest("skewjoinopt13", "skewjoinopt13.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/skewjoinopt13.q"));
  }

  public void testCliDriver_skewjoinopt14() throws Exception {
    runTest("skewjoinopt14", "skewjoinopt14.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/skewjoinopt14.q"));
  }

  public void testCliDriver_skewjoinopt15() throws Exception {
    runTest("skewjoinopt15", "skewjoinopt15.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/skewjoinopt15.q"));
  }

  public void testCliDriver_skewjoinopt16() throws Exception {
    runTest("skewjoinopt16", "skewjoinopt16.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/skewjoinopt16.q"));
  }

  public void testCliDriver_skewjoinopt17() throws Exception {
    runTest("skewjoinopt17", "skewjoinopt17.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/skewjoinopt17.q"));
  }

  public void testCliDriver_skewjoinopt18() throws Exception {
    runTest("skewjoinopt18", "skewjoinopt18.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/skewjoinopt18.q"));
  }

  public void testCliDriver_skewjoinopt19() throws Exception {
    runTest("skewjoinopt19", "skewjoinopt19.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/skewjoinopt19.q"));
  }

  public void testCliDriver_skewjoinopt2() throws Exception {
    runTest("skewjoinopt2", "skewjoinopt2.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/skewjoinopt2.q"));
  }

  public void testCliDriver_skewjoinopt20() throws Exception {
    runTest("skewjoinopt20", "skewjoinopt20.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/skewjoinopt20.q"));
  }

  public void testCliDriver_skewjoinopt3() throws Exception {
    runTest("skewjoinopt3", "skewjoinopt3.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/skewjoinopt3.q"));
  }

  public void testCliDriver_skewjoinopt4() throws Exception {
    runTest("skewjoinopt4", "skewjoinopt4.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/skewjoinopt4.q"));
  }

  public void testCliDriver_skewjoinopt5() throws Exception {
    runTest("skewjoinopt5", "skewjoinopt5.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/skewjoinopt5.q"));
  }

  public void testCliDriver_skewjoinopt6() throws Exception {
    runTest("skewjoinopt6", "skewjoinopt6.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/skewjoinopt6.q"));
  }

  public void testCliDriver_skewjoinopt7() throws Exception {
    runTest("skewjoinopt7", "skewjoinopt7.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/skewjoinopt7.q"));
  }

  public void testCliDriver_skewjoinopt8() throws Exception {
    runTest("skewjoinopt8", "skewjoinopt8.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/skewjoinopt8.q"));
  }

  public void testCliDriver_skewjoinopt9() throws Exception {
    runTest("skewjoinopt9", "skewjoinopt9.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/skewjoinopt9.q"));
  }

  public void testCliDriver_smb_mapjoin9() throws Exception {
    runTest("smb_mapjoin9", "smb_mapjoin9.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/smb_mapjoin9.q"));
  }

  public void testCliDriver_smb_mapjoin_1() throws Exception {
    runTest("smb_mapjoin_1", "smb_mapjoin_1.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/smb_mapjoin_1.q"));
  }

  public void testCliDriver_smb_mapjoin_10() throws Exception {
    runTest("smb_mapjoin_10", "smb_mapjoin_10.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/smb_mapjoin_10.q"));
  }

  public void testCliDriver_smb_mapjoin_11() throws Exception {
    runTest("smb_mapjoin_11", "smb_mapjoin_11.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/smb_mapjoin_11.q"));
  }

  public void testCliDriver_smb_mapjoin_12() throws Exception {
    runTest("smb_mapjoin_12", "smb_mapjoin_12.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/smb_mapjoin_12.q"));
  }

  public void testCliDriver_smb_mapjoin_13() throws Exception {
    runTest("smb_mapjoin_13", "smb_mapjoin_13.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/smb_mapjoin_13.q"));
  }

  public void testCliDriver_smb_mapjoin_14() throws Exception {
    runTest("smb_mapjoin_14", "smb_mapjoin_14.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/smb_mapjoin_14.q"));
  }

  public void testCliDriver_smb_mapjoin_15() throws Exception {
    runTest("smb_mapjoin_15", "smb_mapjoin_15.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/smb_mapjoin_15.q"));
  }

  public void testCliDriver_smb_mapjoin_16() throws Exception {
    runTest("smb_mapjoin_16", "smb_mapjoin_16.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/smb_mapjoin_16.q"));
  }

  public void testCliDriver_smb_mapjoin_17() throws Exception {
    runTest("smb_mapjoin_17", "smb_mapjoin_17.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/smb_mapjoin_17.q"));
  }

  public void testCliDriver_smb_mapjoin_18() throws Exception {
    runTest("smb_mapjoin_18", "smb_mapjoin_18.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/smb_mapjoin_18.q"));
  }

  public void testCliDriver_smb_mapjoin_19() throws Exception {
    runTest("smb_mapjoin_19", "smb_mapjoin_19.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/smb_mapjoin_19.q"));
  }

  public void testCliDriver_smb_mapjoin_2() throws Exception {
    runTest("smb_mapjoin_2", "smb_mapjoin_2.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/smb_mapjoin_2.q"));
  }

  public void testCliDriver_smb_mapjoin_20() throws Exception {
    runTest("smb_mapjoin_20", "smb_mapjoin_20.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/smb_mapjoin_20.q"));
  }

  public void testCliDriver_smb_mapjoin_21() throws Exception {
    runTest("smb_mapjoin_21", "smb_mapjoin_21.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/smb_mapjoin_21.q"));
  }

  public void testCliDriver_smb_mapjoin_22() throws Exception {
    runTest("smb_mapjoin_22", "smb_mapjoin_22.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/smb_mapjoin_22.q"));
  }

  public void testCliDriver_smb_mapjoin_25() throws Exception {
    runTest("smb_mapjoin_25", "smb_mapjoin_25.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/smb_mapjoin_25.q"));
  }

  public void testCliDriver_smb_mapjoin_3() throws Exception {
    runTest("smb_mapjoin_3", "smb_mapjoin_3.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/smb_mapjoin_3.q"));
  }

  public void testCliDriver_smb_mapjoin_4() throws Exception {
    runTest("smb_mapjoin_4", "smb_mapjoin_4.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/smb_mapjoin_4.q"));
  }

  public void testCliDriver_smb_mapjoin_5() throws Exception {
    runTest("smb_mapjoin_5", "smb_mapjoin_5.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/smb_mapjoin_5.q"));
  }

  public void testCliDriver_smb_mapjoin_6() throws Exception {
    runTest("smb_mapjoin_6", "smb_mapjoin_6.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/smb_mapjoin_6.q"));
  }

  public void testCliDriver_smb_mapjoin_7() throws Exception {
    runTest("smb_mapjoin_7", "smb_mapjoin_7.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/smb_mapjoin_7.q"));
  }

  public void testCliDriver_sort() throws Exception {
    runTest("sort", "sort.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/sort.q"));
  }

  public void testCliDriver_sort_merge_join_desc_1() throws Exception {
    runTest("sort_merge_join_desc_1", "sort_merge_join_desc_1.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/sort_merge_join_desc_1.q"));
  }

  public void testCliDriver_sort_merge_join_desc_2() throws Exception {
    runTest("sort_merge_join_desc_2", "sort_merge_join_desc_2.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/sort_merge_join_desc_2.q"));
  }

  public void testCliDriver_sort_merge_join_desc_3() throws Exception {
    runTest("sort_merge_join_desc_3", "sort_merge_join_desc_3.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/sort_merge_join_desc_3.q"));
  }

  public void testCliDriver_sort_merge_join_desc_4() throws Exception {
    runTest("sort_merge_join_desc_4", "sort_merge_join_desc_4.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/sort_merge_join_desc_4.q"));
  }

  public void testCliDriver_sort_merge_join_desc_5() throws Exception {
    runTest("sort_merge_join_desc_5", "sort_merge_join_desc_5.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/sort_merge_join_desc_5.q"));
  }

  public void testCliDriver_sort_merge_join_desc_6() throws Exception {
    runTest("sort_merge_join_desc_6", "sort_merge_join_desc_6.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/sort_merge_join_desc_6.q"));
  }

  public void testCliDriver_sort_merge_join_desc_7() throws Exception {
    runTest("sort_merge_join_desc_7", "sort_merge_join_desc_7.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/sort_merge_join_desc_7.q"));
  }

  public void testCliDriver_source() throws Exception {
    runTest("source", "source.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/source.q"));
  }

  public void testCliDriver_split() throws Exception {
    runTest("split", "split.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/split.q"));
  }

  public void testCliDriver_split_sample() throws Exception {
    runTest("split_sample", "split_sample.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/split_sample.q"));
  }

  public void testCliDriver_stats0() throws Exception {
    runTest("stats0", "stats0.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/stats0.q"));
  }

  public void testCliDriver_stats1() throws Exception {
    runTest("stats1", "stats1.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/stats1.q"));
  }

  public void testCliDriver_stats10() throws Exception {
    runTest("stats10", "stats10.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/stats10.q"));
  }

  public void testCliDriver_stats11() throws Exception {
    runTest("stats11", "stats11.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/stats11.q"));
  }

  public void testCliDriver_stats12() throws Exception {
    runTest("stats12", "stats12.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/stats12.q"));
  }

  public void testCliDriver_stats13() throws Exception {
    runTest("stats13", "stats13.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/stats13.q"));
  }

  public void testCliDriver_stats14() throws Exception {
    runTest("stats14", "stats14.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/stats14.q"));
  }

  public void testCliDriver_stats15() throws Exception {
    runTest("stats15", "stats15.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/stats15.q"));
  }

  public void testCliDriver_stats16() throws Exception {
    runTest("stats16", "stats16.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/stats16.q"));
  }

  public void testCliDriver_stats18() throws Exception {
    runTest("stats18", "stats18.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/stats18.q"));
  }

  public void testCliDriver_stats19() throws Exception {
    runTest("stats19", "stats19.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/stats19.q"));
  }

  public void testCliDriver_stats2() throws Exception {
    runTest("stats2", "stats2.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/stats2.q"));
  }

  public void testCliDriver_stats20() throws Exception {
    runTest("stats20", "stats20.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/stats20.q"));
  }

  public void testCliDriver_stats3() throws Exception {
    runTest("stats3", "stats3.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/stats3.q"));
  }

  public void testCliDriver_stats4() throws Exception {
    runTest("stats4", "stats4.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/stats4.q"));
  }

  public void testCliDriver_stats5() throws Exception {
    runTest("stats5", "stats5.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/stats5.q"));
  }

  public void testCliDriver_stats6() throws Exception {
    runTest("stats6", "stats6.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/stats6.q"));
  }

  public void testCliDriver_stats7() throws Exception {
    runTest("stats7", "stats7.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/stats7.q"));
  }

  public void testCliDriver_stats8() throws Exception {
    runTest("stats8", "stats8.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/stats8.q"));
  }

  public void testCliDriver_stats9() throws Exception {
    runTest("stats9", "stats9.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/stats9.q"));
  }

  public void testCliDriver_stats_aggregator_error_1() throws Exception {
    runTest("stats_aggregator_error_1", "stats_aggregator_error_1.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/stats_aggregator_error_1.q"));
  }

  public void testCliDriver_stats_empty_dyn_part() throws Exception {
    runTest("stats_empty_dyn_part", "stats_empty_dyn_part.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/stats_empty_dyn_part.q"));
  }

  public void testCliDriver_stats_empty_partition() throws Exception {
    runTest("stats_empty_partition", "stats_empty_partition.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/stats_empty_partition.q"));
  }

  public void testCliDriver_stats_invalidation() throws Exception {
    runTest("stats_invalidation", "stats_invalidation.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/stats_invalidation.q"));
  }

  public void testCliDriver_stats_list_bucket() throws Exception {
    runTest("stats_list_bucket", "stats_list_bucket.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/stats_list_bucket.q"));
  }

  public void testCliDriver_stats_noscan_1() throws Exception {
    runTest("stats_noscan_1", "stats_noscan_1.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/stats_noscan_1.q"));
  }

  public void testCliDriver_stats_noscan_2() throws Exception {
    runTest("stats_noscan_2", "stats_noscan_2.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/stats_noscan_2.q"));
  }

  public void testCliDriver_stats_only_null() throws Exception {
    runTest("stats_only_null", "stats_only_null.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/stats_only_null.q"));
  }

  public void testCliDriver_stats_partscan_1() throws Exception {
    runTest("stats_partscan_1", "stats_partscan_1.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/stats_partscan_1.q"));
  }

  public void testCliDriver_stats_partscan_1_23() throws Exception {
    runTest("stats_partscan_1_23", "stats_partscan_1_23.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/stats_partscan_1_23.q"));
  }

  public void testCliDriver_stats_publisher_error_1() throws Exception {
    runTest("stats_publisher_error_1", "stats_publisher_error_1.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/stats_publisher_error_1.q"));
  }

  public void testCliDriver_statsfs() throws Exception {
    runTest("statsfs", "statsfs.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/statsfs.q"));
  }

  public void testCliDriver_str_to_map() throws Exception {
    runTest("str_to_map", "str_to_map.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/str_to_map.q"));
  }

  public void testCliDriver_subq() throws Exception {
    runTest("subq", "subq.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/subq.q"));
  }

  public void testCliDriver_subq2() throws Exception {
    runTest("subq2", "subq2.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/subq2.q"));
  }

  public void testCliDriver_subq_where_serialization() throws Exception {
    runTest("subq_where_serialization", "subq_where_serialization.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/subq_where_serialization.q"));
  }

  public void testCliDriver_subquery_alias() throws Exception {
    runTest("subquery_alias", "subquery_alias.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/subquery_alias.q"));
  }

  public void testCliDriver_subquery_exists() throws Exception {
    runTest("subquery_exists", "subquery_exists.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/subquery_exists.q"));
  }

  public void testCliDriver_subquery_exists_having() throws Exception {
    runTest("subquery_exists_having", "subquery_exists_having.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/subquery_exists_having.q"));
  }

  public void testCliDriver_subquery_in() throws Exception {
    runTest("subquery_in", "subquery_in.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/subquery_in.q"));
  }

  public void testCliDriver_subquery_in_having() throws Exception {
    runTest("subquery_in_having", "subquery_in_having.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/subquery_in_having.q"));
  }

  public void testCliDriver_subquery_multiinsert() throws Exception {
    runTest("subquery_multiinsert", "subquery_multiinsert.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/subquery_multiinsert.q"));
  }

  public void testCliDriver_subquery_notexists() throws Exception {
    runTest("subquery_notexists", "subquery_notexists.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/subquery_notexists.q"));
  }

  public void testCliDriver_subquery_notexists_having() throws Exception {
    runTest("subquery_notexists_having", "subquery_notexists_having.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/subquery_notexists_having.q"));
  }

  public void testCliDriver_subquery_notin() throws Exception {
    runTest("subquery_notin", "subquery_notin.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/subquery_notin.q"));
  }

  public void testCliDriver_subquery_notin_having() throws Exception {
    runTest("subquery_notin_having", "subquery_notin_having.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/subquery_notin_having.q"));
  }

  public void testCliDriver_subquery_unqualcolumnrefs() throws Exception {
    runTest("subquery_unqualcolumnrefs", "subquery_unqualcolumnrefs.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/subquery_unqualcolumnrefs.q"));
  }

  public void testCliDriver_subquery_views() throws Exception {
    runTest("subquery_views", "subquery_views.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/subquery_views.q"));
  }

  public void testCliDriver_symlink_text_input_format() throws Exception {
    runTest("symlink_text_input_format", "symlink_text_input_format.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/symlink_text_input_format.q"));
  }

  public void testCliDriver_table_access_keys_stats() throws Exception {
    runTest("table_access_keys_stats", "table_access_keys_stats.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/table_access_keys_stats.q"));
  }

  public void testCliDriver_tablename_with_select() throws Exception {
    runTest("tablename_with_select", "tablename_with_select.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/tablename_with_select.q"));
  }

  public void testCliDriver_test_boolean_whereclause() throws Exception {
    runTest("test_boolean_whereclause", "test_boolean_whereclause.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/test_boolean_whereclause.q"));
  }

  public void testCliDriver_timestamp_1() throws Exception {
    runTest("timestamp_1", "timestamp_1.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/timestamp_1.q"));
  }

  public void testCliDriver_timestamp_2() throws Exception {
    runTest("timestamp_2", "timestamp_2.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/timestamp_2.q"));
  }

  public void testCliDriver_timestamp_3() throws Exception {
    runTest("timestamp_3", "timestamp_3.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/timestamp_3.q"));
  }

  public void testCliDriver_timestamp_comparison() throws Exception {
    runTest("timestamp_comparison", "timestamp_comparison.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/timestamp_comparison.q"));
  }

  public void testCliDriver_timestamp_lazy() throws Exception {
    runTest("timestamp_lazy", "timestamp_lazy.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/timestamp_lazy.q"));
  }

  public void testCliDriver_timestamp_null() throws Exception {
    runTest("timestamp_null", "timestamp_null.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/timestamp_null.q"));
  }

  public void testCliDriver_timestamp_udf() throws Exception {
    runTest("timestamp_udf", "timestamp_udf.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/timestamp_udf.q"));
  }

  public void testCliDriver_touch() throws Exception {
    runTest("touch", "touch.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/touch.q"));
  }

  public void testCliDriver_transform1() throws Exception {
    runTest("transform1", "transform1.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/transform1.q"));
  }

  public void testCliDriver_transform2() throws Exception {
    runTest("transform2", "transform2.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/transform2.q"));
  }

  public void testCliDriver_transform_ppr1() throws Exception {
    runTest("transform_ppr1", "transform_ppr1.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/transform_ppr1.q"));
  }

  public void testCliDriver_transform_ppr2() throws Exception {
    runTest("transform_ppr2", "transform_ppr2.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/transform_ppr2.q"));
  }

  public void testCliDriver_truncate_column() throws Exception {
    runTest("truncate_column", "truncate_column.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/truncate_column.q"));
  }

  public void testCliDriver_truncate_column_list_bucket() throws Exception {
    runTest("truncate_column_list_bucket", "truncate_column_list_bucket.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/truncate_column_list_bucket.q"));
  }

  public void testCliDriver_truncate_column_merge() throws Exception {
    runTest("truncate_column_merge", "truncate_column_merge.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/truncate_column_merge.q"));
  }

  public void testCliDriver_truncate_table() throws Exception {
    runTest("truncate_table", "truncate_table.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/truncate_table.q"));
  }

  public void testCliDriver_type_cast_1() throws Exception {
    runTest("type_cast_1", "type_cast_1.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/type_cast_1.q"));
  }

  public void testCliDriver_type_conversions_1() throws Exception {
    runTest("type_conversions_1", "type_conversions_1.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/type_conversions_1.q"));
  }

  public void testCliDriver_type_widening() throws Exception {
    runTest("type_widening", "type_widening.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/type_widening.q"));
  }

  public void testCliDriver_udaf_collect_set() throws Exception {
    runTest("udaf_collect_set", "udaf_collect_set.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udaf_collect_set.q"));
  }

  public void testCliDriver_udaf_context_ngrams() throws Exception {
    runTest("udaf_context_ngrams", "udaf_context_ngrams.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udaf_context_ngrams.q"));
  }

  public void testCliDriver_udaf_corr() throws Exception {
    runTest("udaf_corr", "udaf_corr.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udaf_corr.q"));
  }

  public void testCliDriver_udaf_covar_pop() throws Exception {
    runTest("udaf_covar_pop", "udaf_covar_pop.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udaf_covar_pop.q"));
  }

  public void testCliDriver_udaf_covar_samp() throws Exception {
    runTest("udaf_covar_samp", "udaf_covar_samp.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udaf_covar_samp.q"));
  }

  public void testCliDriver_udaf_histogram_numeric() throws Exception {
    runTest("udaf_histogram_numeric", "udaf_histogram_numeric.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udaf_histogram_numeric.q"));
  }

  public void testCliDriver_udaf_ngrams() throws Exception {
    runTest("udaf_ngrams", "udaf_ngrams.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udaf_ngrams.q"));
  }

  public void testCliDriver_udaf_number_format() throws Exception {
    runTest("udaf_number_format", "udaf_number_format.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udaf_number_format.q"));
  }

  public void testCliDriver_udaf_percentile() throws Exception {
    runTest("udaf_percentile", "udaf_percentile.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udaf_percentile.q"));
  }

  public void testCliDriver_udaf_percentile_approx_20() throws Exception {
    runTest("udaf_percentile_approx_20", "udaf_percentile_approx_20.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udaf_percentile_approx_20.q"));
  }

  public void testCliDriver_udaf_percentile_approx_23() throws Exception {
    runTest("udaf_percentile_approx_23", "udaf_percentile_approx_23.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udaf_percentile_approx_23.q"));
  }

  public void testCliDriver_udaf_sum_list() throws Exception {
    runTest("udaf_sum_list", "udaf_sum_list.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udaf_sum_list.q"));
  }

  public void testCliDriver_udf1() throws Exception {
    runTest("udf1", "udf1.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf1.q"));
  }

  public void testCliDriver_udf2() throws Exception {
    runTest("udf2", "udf2.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf2.q"));
  }

  public void testCliDriver_udf3() throws Exception {
    runTest("udf3", "udf3.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf3.q"));
  }

  public void testCliDriver_udf4() throws Exception {
    runTest("udf4", "udf4.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf4.q"));
  }

  public void testCliDriver_udf5() throws Exception {
    runTest("udf5", "udf5.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf5.q"));
  }

  public void testCliDriver_udf6() throws Exception {
    runTest("udf6", "udf6.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf6.q"));
  }

  public void testCliDriver_udf7() throws Exception {
    runTest("udf7", "udf7.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf7.q"));
  }

  public void testCliDriver_udf8() throws Exception {
    runTest("udf8", "udf8.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf8.q"));
  }

  public void testCliDriver_udf9() throws Exception {
    runTest("udf9", "udf9.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf9.q"));
  }

  public void testCliDriver_udf_10_trims() throws Exception {
    runTest("udf_10_trims", "udf_10_trims.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf_10_trims.q"));
  }

  public void testCliDriver_udf_E() throws Exception {
    runTest("udf_E", "udf_E.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf_E.q"));
  }

  public void testCliDriver_udf_PI() throws Exception {
    runTest("udf_PI", "udf_PI.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf_PI.q"));
  }

  public void testCliDriver_udf_abs() throws Exception {
    runTest("udf_abs", "udf_abs.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf_abs.q"));
  }

  public void testCliDriver_udf_acos() throws Exception {
    runTest("udf_acos", "udf_acos.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf_acos.q"));
  }

  public void testCliDriver_udf_add() throws Exception {
    runTest("udf_add", "udf_add.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf_add.q"));
  }

  public void testCliDriver_udf_array() throws Exception {
    runTest("udf_array", "udf_array.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf_array.q"));
  }

  public void testCliDriver_udf_array_contains() throws Exception {
    runTest("udf_array_contains", "udf_array_contains.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf_array_contains.q"));
  }

  public void testCliDriver_udf_ascii() throws Exception {
    runTest("udf_ascii", "udf_ascii.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf_ascii.q"));
  }

  public void testCliDriver_udf_asin() throws Exception {
    runTest("udf_asin", "udf_asin.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf_asin.q"));
  }

  public void testCliDriver_udf_atan() throws Exception {
    runTest("udf_atan", "udf_atan.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf_atan.q"));
  }

  public void testCliDriver_udf_avg() throws Exception {
    runTest("udf_avg", "udf_avg.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf_avg.q"));
  }

  public void testCliDriver_udf_between() throws Exception {
    runTest("udf_between", "udf_between.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf_between.q"));
  }

  public void testCliDriver_udf_bigint() throws Exception {
    runTest("udf_bigint", "udf_bigint.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf_bigint.q"));
  }

  public void testCliDriver_udf_bin() throws Exception {
    runTest("udf_bin", "udf_bin.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf_bin.q"));
  }

  public void testCliDriver_udf_bitmap_and() throws Exception {
    runTest("udf_bitmap_and", "udf_bitmap_and.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf_bitmap_and.q"));
  }

  public void testCliDriver_udf_bitmap_empty() throws Exception {
    runTest("udf_bitmap_empty", "udf_bitmap_empty.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf_bitmap_empty.q"));
  }

  public void testCliDriver_udf_bitmap_or() throws Exception {
    runTest("udf_bitmap_or", "udf_bitmap_or.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf_bitmap_or.q"));
  }

  public void testCliDriver_udf_bitwise_and() throws Exception {
    runTest("udf_bitwise_and", "udf_bitwise_and.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf_bitwise_and.q"));
  }

  public void testCliDriver_udf_bitwise_not() throws Exception {
    runTest("udf_bitwise_not", "udf_bitwise_not.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf_bitwise_not.q"));
  }

  public void testCliDriver_udf_bitwise_or() throws Exception {
    runTest("udf_bitwise_or", "udf_bitwise_or.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf_bitwise_or.q"));
  }

  public void testCliDriver_udf_bitwise_xor() throws Exception {
    runTest("udf_bitwise_xor", "udf_bitwise_xor.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf_bitwise_xor.q"));
  }

  public void testCliDriver_udf_boolean() throws Exception {
    runTest("udf_boolean", "udf_boolean.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf_boolean.q"));
  }

  public void testCliDriver_udf_case() throws Exception {
    runTest("udf_case", "udf_case.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf_case.q"));
  }

  public void testCliDriver_udf_case_column_pruning() throws Exception {
    runTest("udf_case_column_pruning", "udf_case_column_pruning.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf_case_column_pruning.q"));
  }

  public void testCliDriver_udf_case_thrift() throws Exception {
    runTest("udf_case_thrift", "udf_case_thrift.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf_case_thrift.q"));
  }

  public void testCliDriver_udf_ceil() throws Exception {
    runTest("udf_ceil", "udf_ceil.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf_ceil.q"));
  }

  public void testCliDriver_udf_ceiling() throws Exception {
    runTest("udf_ceiling", "udf_ceiling.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf_ceiling.q"));
  }

  public void testCliDriver_udf_coalesce() throws Exception {
    runTest("udf_coalesce", "udf_coalesce.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf_coalesce.q"));
  }

  public void testCliDriver_udf_compare_java_string() throws Exception {
    runTest("udf_compare_java_string", "udf_compare_java_string.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf_compare_java_string.q"));
  }

  public void testCliDriver_udf_concat() throws Exception {
    runTest("udf_concat", "udf_concat.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf_concat.q"));
  }

  public void testCliDriver_udf_concat_insert1() throws Exception {
    runTest("udf_concat_insert1", "udf_concat_insert1.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf_concat_insert1.q"));
  }

  public void testCliDriver_udf_concat_insert2() throws Exception {
    runTest("udf_concat_insert2", "udf_concat_insert2.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf_concat_insert2.q"));
  }

  public void testCliDriver_udf_concat_ws() throws Exception {
    runTest("udf_concat_ws", "udf_concat_ws.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf_concat_ws.q"));
  }

  public void testCliDriver_udf_context_aware() throws Exception {
    runTest("udf_context_aware", "udf_context_aware.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf_context_aware.q"));
  }

  public void testCliDriver_udf_conv() throws Exception {
    runTest("udf_conv", "udf_conv.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf_conv.q"));
  }

  public void testCliDriver_udf_cos() throws Exception {
    runTest("udf_cos", "udf_cos.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf_cos.q"));
  }

  public void testCliDriver_udf_count() throws Exception {
    runTest("udf_count", "udf_count.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf_count.q"));
  }

  public void testCliDriver_udf_current_database() throws Exception {
    runTest("udf_current_database", "udf_current_database.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf_current_database.q"));
  }

  public void testCliDriver_udf_date_add() throws Exception {
    runTest("udf_date_add", "udf_date_add.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf_date_add.q"));
  }

  public void testCliDriver_udf_date_sub() throws Exception {
    runTest("udf_date_sub", "udf_date_sub.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf_date_sub.q"));
  }

  public void testCliDriver_udf_datediff() throws Exception {
    runTest("udf_datediff", "udf_datediff.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf_datediff.q"));
  }

  public void testCliDriver_udf_day() throws Exception {
    runTest("udf_day", "udf_day.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf_day.q"));
  }

  public void testCliDriver_udf_dayofmonth() throws Exception {
    runTest("udf_dayofmonth", "udf_dayofmonth.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf_dayofmonth.q"));
  }

  public void testCliDriver_udf_degrees() throws Exception {
    runTest("udf_degrees", "udf_degrees.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf_degrees.q"));
  }

  public void testCliDriver_udf_div() throws Exception {
    runTest("udf_div", "udf_div.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf_div.q"));
  }

  public void testCliDriver_udf_divide() throws Exception {
    runTest("udf_divide", "udf_divide.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf_divide.q"));
  }

  public void testCliDriver_udf_double() throws Exception {
    runTest("udf_double", "udf_double.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf_double.q"));
  }

  public void testCliDriver_udf_elt() throws Exception {
    runTest("udf_elt", "udf_elt.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf_elt.q"));
  }

  public void testCliDriver_udf_equal() throws Exception {
    runTest("udf_equal", "udf_equal.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf_equal.q"));
  }

  public void testCliDriver_udf_exp() throws Exception {
    runTest("udf_exp", "udf_exp.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf_exp.q"));
  }

  public void testCliDriver_udf_explode() throws Exception {
    runTest("udf_explode", "udf_explode.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf_explode.q"));
  }

  public void testCliDriver_udf_field() throws Exception {
    runTest("udf_field", "udf_field.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf_field.q"));
  }

  public void testCliDriver_udf_find_in_set() throws Exception {
    runTest("udf_find_in_set", "udf_find_in_set.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf_find_in_set.q"));
  }

  public void testCliDriver_udf_float() throws Exception {
    runTest("udf_float", "udf_float.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf_float.q"));
  }

  public void testCliDriver_udf_floor() throws Exception {
    runTest("udf_floor", "udf_floor.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf_floor.q"));
  }

  public void testCliDriver_udf_format_number() throws Exception {
    runTest("udf_format_number", "udf_format_number.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf_format_number.q"));
  }

  public void testCliDriver_udf_from_unixtime() throws Exception {
    runTest("udf_from_unixtime", "udf_from_unixtime.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf_from_unixtime.q"));
  }

  public void testCliDriver_udf_get_json_object() throws Exception {
    runTest("udf_get_json_object", "udf_get_json_object.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf_get_json_object.q"));
  }

  public void testCliDriver_udf_greaterthan() throws Exception {
    runTest("udf_greaterthan", "udf_greaterthan.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf_greaterthan.q"));
  }

  public void testCliDriver_udf_greaterthanorequal() throws Exception {
    runTest("udf_greaterthanorequal", "udf_greaterthanorequal.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf_greaterthanorequal.q"));
  }

  public void testCliDriver_udf_hash() throws Exception {
    runTest("udf_hash", "udf_hash.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf_hash.q"));
  }

  public void testCliDriver_udf_hex() throws Exception {
    runTest("udf_hex", "udf_hex.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf_hex.q"));
  }

  public void testCliDriver_udf_hour() throws Exception {
    runTest("udf_hour", "udf_hour.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf_hour.q"));
  }

  public void testCliDriver_udf_if() throws Exception {
    runTest("udf_if", "udf_if.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf_if.q"));
  }

  public void testCliDriver_udf_in() throws Exception {
    runTest("udf_in", "udf_in.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf_in.q"));
  }

  public void testCliDriver_udf_in_file() throws Exception {
    runTest("udf_in_file", "udf_in_file.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf_in_file.q"));
  }

  public void testCliDriver_udf_index() throws Exception {
    runTest("udf_index", "udf_index.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf_index.q"));
  }

  public void testCliDriver_udf_inline() throws Exception {
    runTest("udf_inline", "udf_inline.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf_inline.q"));
  }

  public void testCliDriver_udf_instr() throws Exception {
    runTest("udf_instr", "udf_instr.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf_instr.q"));
  }

  public void testCliDriver_udf_int() throws Exception {
    runTest("udf_int", "udf_int.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf_int.q"));
  }

  public void testCliDriver_udf_isnotnull() throws Exception {
    runTest("udf_isnotnull", "udf_isnotnull.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf_isnotnull.q"));
  }

  public void testCliDriver_udf_isnull() throws Exception {
    runTest("udf_isnull", "udf_isnull.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf_isnull.q"));
  }

  public void testCliDriver_udf_isnull_isnotnull() throws Exception {
    runTest("udf_isnull_isnotnull", "udf_isnull_isnotnull.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf_isnull_isnotnull.q"));
  }

  public void testCliDriver_udf_java_method() throws Exception {
    runTest("udf_java_method", "udf_java_method.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf_java_method.q"));
  }

  public void testCliDriver_udf_lcase() throws Exception {
    runTest("udf_lcase", "udf_lcase.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf_lcase.q"));
  }

  public void testCliDriver_udf_length() throws Exception {
    runTest("udf_length", "udf_length.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf_length.q"));
  }

  public void testCliDriver_udf_lessthan() throws Exception {
    runTest("udf_lessthan", "udf_lessthan.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf_lessthan.q"));
  }

  public void testCliDriver_udf_lessthanorequal() throws Exception {
    runTest("udf_lessthanorequal", "udf_lessthanorequal.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf_lessthanorequal.q"));
  }

  public void testCliDriver_udf_like() throws Exception {
    runTest("udf_like", "udf_like.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf_like.q"));
  }

  public void testCliDriver_udf_ln() throws Exception {
    runTest("udf_ln", "udf_ln.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf_ln.q"));
  }

  public void testCliDriver_udf_locate() throws Exception {
    runTest("udf_locate", "udf_locate.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf_locate.q"));
  }

  public void testCliDriver_udf_log() throws Exception {
    runTest("udf_log", "udf_log.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf_log.q"));
  }

  public void testCliDriver_udf_log10() throws Exception {
    runTest("udf_log10", "udf_log10.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf_log10.q"));
  }

  public void testCliDriver_udf_log2() throws Exception {
    runTest("udf_log2", "udf_log2.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf_log2.q"));
  }

  public void testCliDriver_udf_logic_java_boolean() throws Exception {
    runTest("udf_logic_java_boolean", "udf_logic_java_boolean.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf_logic_java_boolean.q"));
  }

  public void testCliDriver_udf_lower() throws Exception {
    runTest("udf_lower", "udf_lower.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf_lower.q"));
  }

  public void testCliDriver_udf_lpad() throws Exception {
    runTest("udf_lpad", "udf_lpad.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf_lpad.q"));
  }

  public void testCliDriver_udf_ltrim() throws Exception {
    runTest("udf_ltrim", "udf_ltrim.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf_ltrim.q"));
  }

  public void testCliDriver_udf_map() throws Exception {
    runTest("udf_map", "udf_map.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf_map.q"));
  }

  public void testCliDriver_udf_map_keys() throws Exception {
    runTest("udf_map_keys", "udf_map_keys.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf_map_keys.q"));
  }

  public void testCliDriver_udf_map_values() throws Exception {
    runTest("udf_map_values", "udf_map_values.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf_map_values.q"));
  }

  public void testCliDriver_udf_max() throws Exception {
    runTest("udf_max", "udf_max.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf_max.q"));
  }

  public void testCliDriver_udf_min() throws Exception {
    runTest("udf_min", "udf_min.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf_min.q"));
  }

  public void testCliDriver_udf_minute() throws Exception {
    runTest("udf_minute", "udf_minute.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf_minute.q"));
  }

  public void testCliDriver_udf_modulo() throws Exception {
    runTest("udf_modulo", "udf_modulo.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf_modulo.q"));
  }

  public void testCliDriver_udf_month() throws Exception {
    runTest("udf_month", "udf_month.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf_month.q"));
  }

  public void testCliDriver_udf_named_struct() throws Exception {
    runTest("udf_named_struct", "udf_named_struct.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf_named_struct.q"));
  }

  public void testCliDriver_udf_negative() throws Exception {
    runTest("udf_negative", "udf_negative.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf_negative.q"));
  }

  public void testCliDriver_udf_not() throws Exception {
    runTest("udf_not", "udf_not.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf_not.q"));
  }

  public void testCliDriver_udf_notequal() throws Exception {
    runTest("udf_notequal", "udf_notequal.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf_notequal.q"));
  }

  public void testCliDriver_udf_notop() throws Exception {
    runTest("udf_notop", "udf_notop.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf_notop.q"));
  }

  public void testCliDriver_udf_nvl() throws Exception {
    runTest("udf_nvl", "udf_nvl.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf_nvl.q"));
  }

  public void testCliDriver_udf_or() throws Exception {
    runTest("udf_or", "udf_or.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf_or.q"));
  }

  public void testCliDriver_udf_parse_url() throws Exception {
    runTest("udf_parse_url", "udf_parse_url.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf_parse_url.q"));
  }

  public void testCliDriver_udf_percentile() throws Exception {
    runTest("udf_percentile", "udf_percentile.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf_percentile.q"));
  }

  public void testCliDriver_udf_pmod() throws Exception {
    runTest("udf_pmod", "udf_pmod.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf_pmod.q"));
  }

  public void testCliDriver_udf_positive() throws Exception {
    runTest("udf_positive", "udf_positive.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf_positive.q"));
  }

  public void testCliDriver_udf_pow() throws Exception {
    runTest("udf_pow", "udf_pow.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf_pow.q"));
  }

  public void testCliDriver_udf_power() throws Exception {
    runTest("udf_power", "udf_power.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf_power.q"));
  }

  public void testCliDriver_udf_printf() throws Exception {
    runTest("udf_printf", "udf_printf.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf_printf.q"));
  }

  public void testCliDriver_udf_radians() throws Exception {
    runTest("udf_radians", "udf_radians.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf_radians.q"));
  }

  public void testCliDriver_udf_rand() throws Exception {
    runTest("udf_rand", "udf_rand.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf_rand.q"));
  }

  public void testCliDriver_udf_reflect() throws Exception {
    runTest("udf_reflect", "udf_reflect.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf_reflect.q"));
  }

  public void testCliDriver_udf_reflect2() throws Exception {
    runTest("udf_reflect2", "udf_reflect2.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf_reflect2.q"));
  }

  public void testCliDriver_udf_regexp() throws Exception {
    runTest("udf_regexp", "udf_regexp.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf_regexp.q"));
  }

  public void testCliDriver_udf_regexp_extract() throws Exception {
    runTest("udf_regexp_extract", "udf_regexp_extract.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf_regexp_extract.q"));
  }

  public void testCliDriver_udf_regexp_replace() throws Exception {
    runTest("udf_regexp_replace", "udf_regexp_replace.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf_regexp_replace.q"));
  }

  public void testCliDriver_udf_repeat() throws Exception {
    runTest("udf_repeat", "udf_repeat.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf_repeat.q"));
  }

  public void testCliDriver_udf_reverse() throws Exception {
    runTest("udf_reverse", "udf_reverse.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf_reverse.q"));
  }

  public void testCliDriver_udf_rlike() throws Exception {
    runTest("udf_rlike", "udf_rlike.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf_rlike.q"));
  }

  public void testCliDriver_udf_round() throws Exception {
    runTest("udf_round", "udf_round.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf_round.q"));
  }

  public void testCliDriver_udf_round_2() throws Exception {
    runTest("udf_round_2", "udf_round_2.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf_round_2.q"));
  }

  public void testCliDriver_udf_round_3() throws Exception {
    runTest("udf_round_3", "udf_round_3.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf_round_3.q"));
  }

  public void testCliDriver_udf_rpad() throws Exception {
    runTest("udf_rpad", "udf_rpad.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf_rpad.q"));
  }

  public void testCliDriver_udf_rtrim() throws Exception {
    runTest("udf_rtrim", "udf_rtrim.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf_rtrim.q"));
  }

  public void testCliDriver_udf_second() throws Exception {
    runTest("udf_second", "udf_second.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf_second.q"));
  }

  public void testCliDriver_udf_sentences() throws Exception {
    runTest("udf_sentences", "udf_sentences.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf_sentences.q"));
  }

  public void testCliDriver_udf_sign() throws Exception {
    runTest("udf_sign", "udf_sign.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf_sign.q"));
  }

  public void testCliDriver_udf_sin() throws Exception {
    runTest("udf_sin", "udf_sin.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf_sin.q"));
  }

  public void testCliDriver_udf_size() throws Exception {
    runTest("udf_size", "udf_size.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf_size.q"));
  }

  public void testCliDriver_udf_smallint() throws Exception {
    runTest("udf_smallint", "udf_smallint.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf_smallint.q"));
  }

  public void testCliDriver_udf_sort_array() throws Exception {
    runTest("udf_sort_array", "udf_sort_array.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf_sort_array.q"));
  }

  public void testCliDriver_udf_space() throws Exception {
    runTest("udf_space", "udf_space.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf_space.q"));
  }

  public void testCliDriver_udf_split() throws Exception {
    runTest("udf_split", "udf_split.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf_split.q"));
  }

  public void testCliDriver_udf_sqrt() throws Exception {
    runTest("udf_sqrt", "udf_sqrt.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf_sqrt.q"));
  }

  public void testCliDriver_udf_std() throws Exception {
    runTest("udf_std", "udf_std.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf_std.q"));
  }

  public void testCliDriver_udf_stddev() throws Exception {
    runTest("udf_stddev", "udf_stddev.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf_stddev.q"));
  }

  public void testCliDriver_udf_stddev_pop() throws Exception {
    runTest("udf_stddev_pop", "udf_stddev_pop.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf_stddev_pop.q"));
  }

  public void testCliDriver_udf_stddev_samp() throws Exception {
    runTest("udf_stddev_samp", "udf_stddev_samp.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf_stddev_samp.q"));
  }

  public void testCliDriver_udf_string() throws Exception {
    runTest("udf_string", "udf_string.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf_string.q"));
  }

  public void testCliDriver_udf_struct() throws Exception {
    runTest("udf_struct", "udf_struct.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf_struct.q"));
  }

  public void testCliDriver_udf_substr() throws Exception {
    runTest("udf_substr", "udf_substr.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf_substr.q"));
  }

  public void testCliDriver_udf_substring() throws Exception {
    runTest("udf_substring", "udf_substring.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf_substring.q"));
  }

  public void testCliDriver_udf_subtract() throws Exception {
    runTest("udf_subtract", "udf_subtract.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf_subtract.q"));
  }

  public void testCliDriver_udf_sum() throws Exception {
    runTest("udf_sum", "udf_sum.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf_sum.q"));
  }

  public void testCliDriver_udf_tan() throws Exception {
    runTest("udf_tan", "udf_tan.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf_tan.q"));
  }

  public void testCliDriver_udf_testlength() throws Exception {
    runTest("udf_testlength", "udf_testlength.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf_testlength.q"));
  }

  public void testCliDriver_udf_testlength2() throws Exception {
    runTest("udf_testlength2", "udf_testlength2.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf_testlength2.q"));
  }

  public void testCliDriver_udf_tinyint() throws Exception {
    runTest("udf_tinyint", "udf_tinyint.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf_tinyint.q"));
  }

  public void testCliDriver_udf_to_boolean() throws Exception {
    runTest("udf_to_boolean", "udf_to_boolean.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf_to_boolean.q"));
  }

  public void testCliDriver_udf_to_byte() throws Exception {
    runTest("udf_to_byte", "udf_to_byte.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf_to_byte.q"));
  }

  public void testCliDriver_udf_to_date() throws Exception {
    runTest("udf_to_date", "udf_to_date.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf_to_date.q"));
  }

  public void testCliDriver_udf_to_double() throws Exception {
    runTest("udf_to_double", "udf_to_double.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf_to_double.q"));
  }

  public void testCliDriver_udf_to_float() throws Exception {
    runTest("udf_to_float", "udf_to_float.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf_to_float.q"));
  }

  public void testCliDriver_udf_to_long() throws Exception {
    runTest("udf_to_long", "udf_to_long.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf_to_long.q"));
  }

  public void testCliDriver_udf_to_short() throws Exception {
    runTest("udf_to_short", "udf_to_short.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf_to_short.q"));
  }

  public void testCliDriver_udf_to_string() throws Exception {
    runTest("udf_to_string", "udf_to_string.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf_to_string.q"));
  }

  public void testCliDriver_udf_to_unix_timestamp() throws Exception {
    runTest("udf_to_unix_timestamp", "udf_to_unix_timestamp.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf_to_unix_timestamp.q"));
  }

  public void testCliDriver_udf_translate() throws Exception {
    runTest("udf_translate", "udf_translate.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf_translate.q"));
  }

  public void testCliDriver_udf_trim() throws Exception {
    runTest("udf_trim", "udf_trim.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf_trim.q"));
  }

  public void testCliDriver_udf_ucase() throws Exception {
    runTest("udf_ucase", "udf_ucase.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf_ucase.q"));
  }

  public void testCliDriver_udf_unhex() throws Exception {
    runTest("udf_unhex", "udf_unhex.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf_unhex.q"));
  }

  public void testCliDriver_udf_union() throws Exception {
    runTest("udf_union", "udf_union.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf_union.q"));
  }

  public void testCliDriver_udf_unix_timestamp() throws Exception {
    runTest("udf_unix_timestamp", "udf_unix_timestamp.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf_unix_timestamp.q"));
  }

  public void testCliDriver_udf_upper() throws Exception {
    runTest("udf_upper", "udf_upper.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf_upper.q"));
  }

  public void testCliDriver_udf_var_pop() throws Exception {
    runTest("udf_var_pop", "udf_var_pop.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf_var_pop.q"));
  }

  public void testCliDriver_udf_var_samp() throws Exception {
    runTest("udf_var_samp", "udf_var_samp.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf_var_samp.q"));
  }

  public void testCliDriver_udf_variance() throws Exception {
    runTest("udf_variance", "udf_variance.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf_variance.q"));
  }

  public void testCliDriver_udf_weekofyear() throws Exception {
    runTest("udf_weekofyear", "udf_weekofyear.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf_weekofyear.q"));
  }

  public void testCliDriver_udf_when() throws Exception {
    runTest("udf_when", "udf_when.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf_when.q"));
  }

  public void testCliDriver_udf_xpath() throws Exception {
    runTest("udf_xpath", "udf_xpath.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf_xpath.q"));
  }

  public void testCliDriver_udf_xpath_boolean() throws Exception {
    runTest("udf_xpath_boolean", "udf_xpath_boolean.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf_xpath_boolean.q"));
  }

  public void testCliDriver_udf_xpath_double() throws Exception {
    runTest("udf_xpath_double", "udf_xpath_double.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf_xpath_double.q"));
  }

  public void testCliDriver_udf_xpath_float() throws Exception {
    runTest("udf_xpath_float", "udf_xpath_float.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf_xpath_float.q"));
  }

  public void testCliDriver_udf_xpath_int() throws Exception {
    runTest("udf_xpath_int", "udf_xpath_int.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf_xpath_int.q"));
  }

  public void testCliDriver_udf_xpath_long() throws Exception {
    runTest("udf_xpath_long", "udf_xpath_long.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf_xpath_long.q"));
  }

  public void testCliDriver_udf_xpath_short() throws Exception {
    runTest("udf_xpath_short", "udf_xpath_short.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf_xpath_short.q"));
  }

  public void testCliDriver_udf_xpath_string() throws Exception {
    runTest("udf_xpath_string", "udf_xpath_string.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udf_xpath_string.q"));
  }

  public void testCliDriver_udtf_explode() throws Exception {
    runTest("udtf_explode", "udtf_explode.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udtf_explode.q"));
  }

  public void testCliDriver_udtf_json_tuple() throws Exception {
    runTest("udtf_json_tuple", "udtf_json_tuple.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udtf_json_tuple.q"));
  }

  public void testCliDriver_udtf_parse_url_tuple() throws Exception {
    runTest("udtf_parse_url_tuple", "udtf_parse_url_tuple.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udtf_parse_url_tuple.q"));
  }

  public void testCliDriver_udtf_posexplode() throws Exception {
    runTest("udtf_posexplode", "udtf_posexplode.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udtf_posexplode.q"));
  }

  public void testCliDriver_udtf_stack() throws Exception {
    runTest("udtf_stack", "udtf_stack.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/udtf_stack.q"));
  }

  public void testCliDriver_unicode_notation() throws Exception {
    runTest("unicode_notation", "unicode_notation.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/unicode_notation.q"));
  }

  public void testCliDriver_union() throws Exception {
    runTest("union", "union.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/union.q"));
  }

  public void testCliDriver_union10() throws Exception {
    runTest("union10", "union10.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/union10.q"));
  }

  public void testCliDriver_union11() throws Exception {
    runTest("union11", "union11.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/union11.q"));
  }

  public void testCliDriver_union12() throws Exception {
    runTest("union12", "union12.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/union12.q"));
  }

  public void testCliDriver_union13() throws Exception {
    runTest("union13", "union13.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/union13.q"));
  }

  public void testCliDriver_union14() throws Exception {
    runTest("union14", "union14.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/union14.q"));
  }

  public void testCliDriver_union15() throws Exception {
    runTest("union15", "union15.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/union15.q"));
  }

  public void testCliDriver_union16() throws Exception {
    runTest("union16", "union16.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/union16.q"));
  }

  public void testCliDriver_union17() throws Exception {
    runTest("union17", "union17.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/union17.q"));
  }

  public void testCliDriver_union18() throws Exception {
    runTest("union18", "union18.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/union18.q"));
  }

  public void testCliDriver_union19() throws Exception {
    runTest("union19", "union19.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/union19.q"));
  }

  public void testCliDriver_union2() throws Exception {
    runTest("union2", "union2.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/union2.q"));
  }

  public void testCliDriver_union20() throws Exception {
    runTest("union20", "union20.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/union20.q"));
  }

  public void testCliDriver_union21() throws Exception {
    runTest("union21", "union21.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/union21.q"));
  }

  public void testCliDriver_union22() throws Exception {
    runTest("union22", "union22.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/union22.q"));
  }

  public void testCliDriver_union23() throws Exception {
    runTest("union23", "union23.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/union23.q"));
  }

  public void testCliDriver_union24() throws Exception {
    runTest("union24", "union24.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/union24.q"));
  }

  public void testCliDriver_union25() throws Exception {
    runTest("union25", "union25.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/union25.q"));
  }

  public void testCliDriver_union26() throws Exception {
    runTest("union26", "union26.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/union26.q"));
  }

  public void testCliDriver_union27() throws Exception {
    runTest("union27", "union27.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/union27.q"));
  }

  public void testCliDriver_union28() throws Exception {
    runTest("union28", "union28.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/union28.q"));
  }

  public void testCliDriver_union29() throws Exception {
    runTest("union29", "union29.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/union29.q"));
  }

  public void testCliDriver_union3() throws Exception {
    runTest("union3", "union3.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/union3.q"));
  }

  public void testCliDriver_union30() throws Exception {
    runTest("union30", "union30.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/union30.q"));
  }

  public void testCliDriver_union31() throws Exception {
    runTest("union31", "union31.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/union31.q"));
  }

  public void testCliDriver_union32() throws Exception {
    runTest("union32", "union32.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/union32.q"));
  }

  public void testCliDriver_union33() throws Exception {
    runTest("union33", "union33.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/union33.q"));
  }

  public void testCliDriver_union34() throws Exception {
    runTest("union34", "union34.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/union34.q"));
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

  public void testCliDriver_union_date() throws Exception {
    runTest("union_date", "union_date.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/union_date.q"));
  }

  public void testCliDriver_union_lateralview() throws Exception {
    runTest("union_lateralview", "union_lateralview.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/union_lateralview.q"));
  }

  public void testCliDriver_union_null() throws Exception {
    runTest("union_null", "union_null.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/union_null.q"));
  }

  public void testCliDriver_union_ppr() throws Exception {
    runTest("union_ppr", "union_ppr.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/union_ppr.q"));
  }

  public void testCliDriver_union_remove_1() throws Exception {
    runTest("union_remove_1", "union_remove_1.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/union_remove_1.q"));
  }

  public void testCliDriver_union_remove_10() throws Exception {
    runTest("union_remove_10", "union_remove_10.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/union_remove_10.q"));
  }

  public void testCliDriver_union_remove_11() throws Exception {
    runTest("union_remove_11", "union_remove_11.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/union_remove_11.q"));
  }

  public void testCliDriver_union_remove_12() throws Exception {
    runTest("union_remove_12", "union_remove_12.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/union_remove_12.q"));
  }

  public void testCliDriver_union_remove_13() throws Exception {
    runTest("union_remove_13", "union_remove_13.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/union_remove_13.q"));
  }

  public void testCliDriver_union_remove_14() throws Exception {
    runTest("union_remove_14", "union_remove_14.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/union_remove_14.q"));
  }

  public void testCliDriver_union_remove_15() throws Exception {
    runTest("union_remove_15", "union_remove_15.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/union_remove_15.q"));
  }

  public void testCliDriver_union_remove_16() throws Exception {
    runTest("union_remove_16", "union_remove_16.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/union_remove_16.q"));
  }

  public void testCliDriver_union_remove_17() throws Exception {
    runTest("union_remove_17", "union_remove_17.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/union_remove_17.q"));
  }

  public void testCliDriver_union_remove_18() throws Exception {
    runTest("union_remove_18", "union_remove_18.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/union_remove_18.q"));
  }

  public void testCliDriver_union_remove_19() throws Exception {
    runTest("union_remove_19", "union_remove_19.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/union_remove_19.q"));
  }

  public void testCliDriver_union_remove_2() throws Exception {
    runTest("union_remove_2", "union_remove_2.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/union_remove_2.q"));
  }

  public void testCliDriver_union_remove_20() throws Exception {
    runTest("union_remove_20", "union_remove_20.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/union_remove_20.q"));
  }

  public void testCliDriver_union_remove_21() throws Exception {
    runTest("union_remove_21", "union_remove_21.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/union_remove_21.q"));
  }

  public void testCliDriver_union_remove_22() throws Exception {
    runTest("union_remove_22", "union_remove_22.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/union_remove_22.q"));
  }

  public void testCliDriver_union_remove_23() throws Exception {
    runTest("union_remove_23", "union_remove_23.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/union_remove_23.q"));
  }

  public void testCliDriver_union_remove_24() throws Exception {
    runTest("union_remove_24", "union_remove_24.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/union_remove_24.q"));
  }

  public void testCliDriver_union_remove_3() throws Exception {
    runTest("union_remove_3", "union_remove_3.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/union_remove_3.q"));
  }

  public void testCliDriver_union_remove_4() throws Exception {
    runTest("union_remove_4", "union_remove_4.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/union_remove_4.q"));
  }

  public void testCliDriver_union_remove_5() throws Exception {
    runTest("union_remove_5", "union_remove_5.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/union_remove_5.q"));
  }

  public void testCliDriver_union_remove_6() throws Exception {
    runTest("union_remove_6", "union_remove_6.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/union_remove_6.q"));
  }

  public void testCliDriver_union_remove_7() throws Exception {
    runTest("union_remove_7", "union_remove_7.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/union_remove_7.q"));
  }

  public void testCliDriver_union_remove_8() throws Exception {
    runTest("union_remove_8", "union_remove_8.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/union_remove_8.q"));
  }

  public void testCliDriver_union_remove_9() throws Exception {
    runTest("union_remove_9", "union_remove_9.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/union_remove_9.q"));
  }

  public void testCliDriver_union_script() throws Exception {
    runTest("union_script", "union_script.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/union_script.q"));
  }

  public void testCliDriver_union_top_level() throws Exception {
    runTest("union_top_level", "union_top_level.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/union_top_level.q"));
  }

  public void testCliDriver_union_view() throws Exception {
    runTest("union_view", "union_view.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/union_view.q"));
  }

  public void testCliDriver_uniquejoin() throws Exception {
    runTest("uniquejoin", "uniquejoin.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/uniquejoin.q"));
  }

  public void testCliDriver_unset_table_view_property() throws Exception {
    runTest("unset_table_view_property", "unset_table_view_property.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/unset_table_view_property.q"));
  }

  public void testCliDriver_updateAccessTime() throws Exception {
    runTest("updateAccessTime", "updateAccessTime.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/updateAccessTime.q"));
  }

  public void testCliDriver_varchar_1() throws Exception {
    runTest("varchar_1", "varchar_1.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/varchar_1.q"));
  }

  public void testCliDriver_varchar_2() throws Exception {
    runTest("varchar_2", "varchar_2.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/varchar_2.q"));
  }

  public void testCliDriver_varchar_cast() throws Exception {
    runTest("varchar_cast", "varchar_cast.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/varchar_cast.q"));
  }

  public void testCliDriver_varchar_comparison() throws Exception {
    runTest("varchar_comparison", "varchar_comparison.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/varchar_comparison.q"));
  }

  public void testCliDriver_varchar_join1() throws Exception {
    runTest("varchar_join1", "varchar_join1.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/varchar_join1.q"));
  }

  public void testCliDriver_varchar_nested_types() throws Exception {
    runTest("varchar_nested_types", "varchar_nested_types.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/varchar_nested_types.q"));
  }

  public void testCliDriver_varchar_serde() throws Exception {
    runTest("varchar_serde", "varchar_serde.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/varchar_serde.q"));
  }

  public void testCliDriver_varchar_udf1() throws Exception {
    runTest("varchar_udf1", "varchar_udf1.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/varchar_udf1.q"));
  }

  public void testCliDriver_varchar_union1() throws Exception {
    runTest("varchar_union1", "varchar_union1.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/varchar_union1.q"));
  }

  public void testCliDriver_vector_between_in() throws Exception {
    runTest("vector_between_in", "vector_between_in.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/vector_between_in.q"));
  }

  public void testCliDriver_vector_coalesce() throws Exception {
    runTest("vector_coalesce", "vector_coalesce.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/vector_coalesce.q"));
  }

  public void testCliDriver_vector_decimal_aggregate() throws Exception {
    runTest("vector_decimal_aggregate", "vector_decimal_aggregate.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/vector_decimal_aggregate.q"));
  }

  public void testCliDriver_vector_decimal_cast() throws Exception {
    runTest("vector_decimal_cast", "vector_decimal_cast.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/vector_decimal_cast.q"));
  }

  public void testCliDriver_vector_decimal_expressions() throws Exception {
    runTest("vector_decimal_expressions", "vector_decimal_expressions.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/vector_decimal_expressions.q"));
  }

  public void testCliDriver_vector_decimal_mapjoin() throws Exception {
    runTest("vector_decimal_mapjoin", "vector_decimal_mapjoin.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/vector_decimal_mapjoin.q"));
  }

  public void testCliDriver_vector_decimal_math_funcs() throws Exception {
    runTest("vector_decimal_math_funcs", "vector_decimal_math_funcs.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/vector_decimal_math_funcs.q"));
  }

  public void testCliDriver_vector_left_outer_join() throws Exception {
    runTest("vector_left_outer_join", "vector_left_outer_join.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/vector_left_outer_join.q"));
  }

  public void testCliDriver_vector_non_string_partition() throws Exception {
    runTest("vector_non_string_partition", "vector_non_string_partition.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/vector_non_string_partition.q"));
  }

  public void testCliDriver_vectorization_0() throws Exception {
    runTest("vectorization_0", "vectorization_0.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/vectorization_0.q"));
  }

  public void testCliDriver_vectorization_1() throws Exception {
    runTest("vectorization_1", "vectorization_1.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/vectorization_1.q"));
  }

  public void testCliDriver_vectorization_10() throws Exception {
    runTest("vectorization_10", "vectorization_10.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/vectorization_10.q"));
  }

  public void testCliDriver_vectorization_11() throws Exception {
    runTest("vectorization_11", "vectorization_11.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/vectorization_11.q"));
  }

  public void testCliDriver_vectorization_12() throws Exception {
    runTest("vectorization_12", "vectorization_12.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/vectorization_12.q"));
  }

  public void testCliDriver_vectorization_13() throws Exception {
    runTest("vectorization_13", "vectorization_13.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/vectorization_13.q"));
  }

  public void testCliDriver_vectorization_14() throws Exception {
    runTest("vectorization_14", "vectorization_14.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/vectorization_14.q"));
  }

  public void testCliDriver_vectorization_15() throws Exception {
    runTest("vectorization_15", "vectorization_15.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/vectorization_15.q"));
  }

  public void testCliDriver_vectorization_16() throws Exception {
    runTest("vectorization_16", "vectorization_16.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/vectorization_16.q"));
  }

  public void testCliDriver_vectorization_2() throws Exception {
    runTest("vectorization_2", "vectorization_2.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/vectorization_2.q"));
  }

  public void testCliDriver_vectorization_3() throws Exception {
    runTest("vectorization_3", "vectorization_3.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/vectorization_3.q"));
  }

  public void testCliDriver_vectorization_4() throws Exception {
    runTest("vectorization_4", "vectorization_4.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/vectorization_4.q"));
  }

  public void testCliDriver_vectorization_5() throws Exception {
    runTest("vectorization_5", "vectorization_5.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/vectorization_5.q"));
  }

  public void testCliDriver_vectorization_6() throws Exception {
    runTest("vectorization_6", "vectorization_6.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/vectorization_6.q"));
  }

  public void testCliDriver_vectorization_7() throws Exception {
    runTest("vectorization_7", "vectorization_7.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/vectorization_7.q"));
  }

  public void testCliDriver_vectorization_8() throws Exception {
    runTest("vectorization_8", "vectorization_8.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/vectorization_8.q"));
  }

  public void testCliDriver_vectorization_9() throws Exception {
    runTest("vectorization_9", "vectorization_9.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/vectorization_9.q"));
  }

  public void testCliDriver_vectorization_decimal_date() throws Exception {
    runTest("vectorization_decimal_date", "vectorization_decimal_date.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/vectorization_decimal_date.q"));
  }

  public void testCliDriver_vectorization_div0() throws Exception {
    runTest("vectorization_div0", "vectorization_div0.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/vectorization_div0.q"));
  }

  public void testCliDriver_vectorization_limit() throws Exception {
    runTest("vectorization_limit", "vectorization_limit.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/vectorization_limit.q"));
  }

  public void testCliDriver_vectorization_nested_udf() throws Exception {
    runTest("vectorization_nested_udf", "vectorization_nested_udf.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/vectorization_nested_udf.q"));
  }

  public void testCliDriver_vectorization_not() throws Exception {
    runTest("vectorization_not", "vectorization_not.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/vectorization_not.q"));
  }

  public void testCliDriver_vectorization_part() throws Exception {
    runTest("vectorization_part", "vectorization_part.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/vectorization_part.q"));
  }

  public void testCliDriver_vectorization_part_project() throws Exception {
    runTest("vectorization_part_project", "vectorization_part_project.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/vectorization_part_project.q"));
  }

  public void testCliDriver_vectorization_pushdown() throws Exception {
    runTest("vectorization_pushdown", "vectorization_pushdown.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/vectorization_pushdown.q"));
  }

  public void testCliDriver_vectorization_short_regress() throws Exception {
    runTest("vectorization_short_regress", "vectorization_short_regress.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/vectorization_short_regress.q"));
  }

  public void testCliDriver_vectorized_bucketmapjoin1() throws Exception {
    runTest("vectorized_bucketmapjoin1", "vectorized_bucketmapjoin1.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/vectorized_bucketmapjoin1.q"));
  }

  public void testCliDriver_vectorized_case() throws Exception {
    runTest("vectorized_case", "vectorized_case.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/vectorized_case.q"));
  }

  public void testCliDriver_vectorized_casts() throws Exception {
    runTest("vectorized_casts", "vectorized_casts.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/vectorized_casts.q"));
  }

  public void testCliDriver_vectorized_context() throws Exception {
    runTest("vectorized_context", "vectorized_context.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/vectorized_context.q"));
  }

  public void testCliDriver_vectorized_date_funcs() throws Exception {
    runTest("vectorized_date_funcs", "vectorized_date_funcs.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/vectorized_date_funcs.q"));
  }

  public void testCliDriver_vectorized_distinct_gby() throws Exception {
    runTest("vectorized_distinct_gby", "vectorized_distinct_gby.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/vectorized_distinct_gby.q"));
  }

  public void testCliDriver_vectorized_mapjoin() throws Exception {
    runTest("vectorized_mapjoin", "vectorized_mapjoin.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/vectorized_mapjoin.q"));
  }

  public void testCliDriver_vectorized_math_funcs() throws Exception {
    runTest("vectorized_math_funcs", "vectorized_math_funcs.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/vectorized_math_funcs.q"));
  }

  public void testCliDriver_vectorized_nested_mapjoin() throws Exception {
    runTest("vectorized_nested_mapjoin", "vectorized_nested_mapjoin.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/vectorized_nested_mapjoin.q"));
  }

  public void testCliDriver_vectorized_rcfile_columnar() throws Exception {
    runTest("vectorized_rcfile_columnar", "vectorized_rcfile_columnar.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/vectorized_rcfile_columnar.q"));
  }

  public void testCliDriver_vectorized_shufflejoin() throws Exception {
    runTest("vectorized_shufflejoin", "vectorized_shufflejoin.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/vectorized_shufflejoin.q"));
  }

  public void testCliDriver_vectorized_string_funcs() throws Exception {
    runTest("vectorized_string_funcs", "vectorized_string_funcs.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/vectorized_string_funcs.q"));
  }

  public void testCliDriver_vectorized_timestamp_funcs() throws Exception {
    runTest("vectorized_timestamp_funcs", "vectorized_timestamp_funcs.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/vectorized_timestamp_funcs.q"));
  }

  public void testCliDriver_view() throws Exception {
    runTest("view", "view.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/view.q"));
  }

  public void testCliDriver_view_cast() throws Exception {
    runTest("view_cast", "view_cast.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/view_cast.q"));
  }

  public void testCliDriver_view_inputs() throws Exception {
    runTest("view_inputs", "view_inputs.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/view_inputs.q"));
  }

  public void testCliDriver_virtual_column() throws Exception {
    runTest("virtual_column", "virtual_column.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/virtual_column.q"));
  }

  public void testCliDriver_windowing() throws Exception {
    runTest("windowing", "windowing.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/windowing.q"));
  }

  public void testCliDriver_windowing_adjust_rowcontainer_sz() throws Exception {
    runTest("windowing_adjust_rowcontainer_sz", "windowing_adjust_rowcontainer_sz.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/windowing_adjust_rowcontainer_sz.q"));
  }

  public void testCliDriver_windowing_columnPruning() throws Exception {
    runTest("windowing_columnPruning", "windowing_columnPruning.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/windowing_columnPruning.q"));
  }

  public void testCliDriver_windowing_expressions() throws Exception {
    runTest("windowing_expressions", "windowing_expressions.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/windowing_expressions.q"));
  }

  public void testCliDriver_windowing_multipartitioning() throws Exception {
    runTest("windowing_multipartitioning", "windowing_multipartitioning.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/windowing_multipartitioning.q"));
  }

  public void testCliDriver_windowing_navfn() throws Exception {
    runTest("windowing_navfn", "windowing_navfn.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/windowing_navfn.q"));
  }

  public void testCliDriver_windowing_ntile() throws Exception {
    runTest("windowing_ntile", "windowing_ntile.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/windowing_ntile.q"));
  }

  public void testCliDriver_windowing_rank() throws Exception {
    runTest("windowing_rank", "windowing_rank.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/windowing_rank.q"));
  }

  public void testCliDriver_windowing_udaf() throws Exception {
    runTest("windowing_udaf", "windowing_udaf.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/windowing_udaf.q"));
  }

  public void testCliDriver_windowing_udaf2() throws Exception {
    runTest("windowing_udaf2", "windowing_udaf2.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/windowing_udaf2.q"));
  }

  public void testCliDriver_windowing_windowspec() throws Exception {
    runTest("windowing_windowspec", "windowing_windowspec.q", (HIVE_ROOT + "ql/src/test/queries/clientpositive/windowing_windowspec.q"));
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
