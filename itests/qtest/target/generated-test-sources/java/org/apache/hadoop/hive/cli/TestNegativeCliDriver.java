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

public class TestNegativeCliDriver extends TestCase {

  private static final String HIVE_ROOT = QTestUtil.ensurePathEndsInSlash(System.getProperty("hive.root"));
  private static QTestUtil qt;

  static {
    MiniClusterType miniMR = MiniClusterType.valueForString("");

    try {
      String hadoopVer = "2.3.0";
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

  public TestNegativeCliDriver(String name) {
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
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("add_partition_with_whitelist.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_add_partition_with_whitelist"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("addpart1.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_addpart1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("alter_concatenate_indexed_table.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_alter_concatenate_indexed_table"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("alter_non_native.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_alter_non_native"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("alter_partition_coltype_2columns.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_alter_partition_coltype_2columns"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("alter_partition_coltype_invalidcolname.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_alter_partition_coltype_invalidcolname"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("alter_partition_coltype_invalidtype.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_alter_partition_coltype_invalidtype"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("alter_partition_invalidspec.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_alter_partition_invalidspec"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("alter_partition_nodrop.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_alter_partition_nodrop"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("alter_partition_nodrop_table.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_alter_partition_nodrop_table"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("alter_partition_offline.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_alter_partition_offline"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("alter_partition_with_whitelist.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_alter_partition_with_whitelist"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("alter_rename_partition_failure.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_alter_rename_partition_failure"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("alter_rename_partition_failure2.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_alter_rename_partition_failure2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("alter_rename_partition_failure3.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_alter_rename_partition_failure3"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("alter_table_add_partition.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_alter_table_add_partition"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("alter_table_wrong_regex.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_alter_table_wrong_regex"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("alter_view_as_select_not_exist.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_alter_view_as_select_not_exist"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("alter_view_as_select_with_partition.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_alter_view_as_select_with_partition"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("alter_view_failure.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_alter_view_failure"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("alter_view_failure2.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_alter_view_failure2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("alter_view_failure3.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_alter_view_failure3"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("alter_view_failure4.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_alter_view_failure4"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("alter_view_failure5.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_alter_view_failure5"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("alter_view_failure6.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_alter_view_failure6"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("alter_view_failure7.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_alter_view_failure7"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("alter_view_failure8.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_alter_view_failure8"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("alter_view_failure9.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_alter_view_failure9"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("altern1.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_altern1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("ambiguous_col.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_ambiguous_col"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("ambiguous_col0.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_ambiguous_col0"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("ambiguous_col1.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_ambiguous_col1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("ambiguous_col2.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_ambiguous_col2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("analyze.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_analyze"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("analyze1.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_analyze1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("analyze_non_existent_tbl.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_analyze_non_existent_tbl"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("analyze_view.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_analyze_view"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("archive1.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_archive1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("archive2.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_archive2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("archive3.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_archive3"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("archive4.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_archive4"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("archive5.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_archive5"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("archive_corrupt.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_archive_corrupt"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("archive_insert1.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_archive_insert1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("archive_insert2.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_archive_insert2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("archive_insert3.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_archive_insert3"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("archive_insert4.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_archive_insert4"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("archive_multi1.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_archive_multi1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("archive_multi2.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_archive_multi2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("archive_multi3.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_archive_multi3"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("archive_multi4.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_archive_multi4"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("archive_multi5.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_archive_multi5"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("archive_multi6.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_archive_multi6"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("archive_multi7.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_archive_multi7"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("archive_partspec1.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_archive_partspec1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("archive_partspec2.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_archive_partspec2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("archive_partspec3.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_archive_partspec3"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("archive_partspec4.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_archive_partspec4"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("archive_partspec5.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_archive_partspec5"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("authorization_addjar.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_authorization_addjar"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("authorization_addpartition.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_authorization_addpartition"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("authorization_alter_db_owner.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_authorization_alter_db_owner"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("authorization_alter_db_owner_default.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_authorization_alter_db_owner_default"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("authorization_cannot_create_all_role.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_authorization_cannot_create_all_role"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("authorization_cannot_create_default_role.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_authorization_cannot_create_default_role"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("authorization_cannot_create_none_role.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_authorization_cannot_create_none_role"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("authorization_caseinsensitivity.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_authorization_caseinsensitivity"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("authorization_create_func1.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_authorization_create_func1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("authorization_create_func2.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_authorization_create_func2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("authorization_create_macro1.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_authorization_create_macro1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("authorization_create_role_no_admin.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_authorization_create_role_no_admin"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("authorization_createview.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_authorization_createview"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("authorization_ctas.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_authorization_ctas"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("authorization_desc_table_nosel.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_authorization_desc_table_nosel"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("authorization_dfs.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_authorization_dfs"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("authorization_disallow_transform.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_authorization_disallow_transform"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("authorization_drop_db_cascade.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_authorization_drop_db_cascade"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("authorization_drop_db_empty.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_authorization_drop_db_empty"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("authorization_drop_role_no_admin.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_authorization_drop_role_no_admin"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("authorization_droppartition.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_authorization_droppartition"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("authorization_fail_1.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_authorization_fail_1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("authorization_fail_2.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_authorization_fail_2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("authorization_fail_3.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_authorization_fail_3"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("authorization_fail_4.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_authorization_fail_4"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("authorization_fail_5.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_authorization_fail_5"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("authorization_fail_6.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_authorization_fail_6"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("authorization_fail_7.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_authorization_fail_7"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("authorization_fail_create_db.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_authorization_fail_create_db"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("authorization_fail_drop_db.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_authorization_fail_drop_db"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("authorization_grant_table_allpriv.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_authorization_grant_table_allpriv"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("authorization_grant_table_dup.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_authorization_grant_table_dup"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("authorization_grant_table_fail1.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_authorization_grant_table_fail1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("authorization_grant_table_fail_nogrant.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_authorization_grant_table_fail_nogrant"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("authorization_insert_noinspriv.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_authorization_insert_noinspriv"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("authorization_insert_noselectpriv.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_authorization_insert_noselectpriv"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("authorization_invalid_priv_v1.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_authorization_invalid_priv_v1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("authorization_invalid_priv_v2.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_authorization_invalid_priv_v2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("authorization_not_owner_alter_tab_rename.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_authorization_not_owner_alter_tab_rename"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("authorization_not_owner_alter_tab_serdeprop.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_authorization_not_owner_alter_tab_serdeprop"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("authorization_not_owner_drop_tab.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_authorization_not_owner_drop_tab"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("authorization_not_owner_drop_view.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_authorization_not_owner_drop_view"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("authorization_part.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_authorization_part"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("authorization_priv_current_role_neg.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_authorization_priv_current_role_neg"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("authorization_public_create.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_authorization_public_create"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("authorization_public_drop.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_authorization_public_drop"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("authorization_revoke_table_fail1.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_authorization_revoke_table_fail1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("authorization_revoke_table_fail2.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_authorization_revoke_table_fail2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("authorization_role_cycles1.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_authorization_role_cycles1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("authorization_role_cycles2.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_authorization_role_cycles2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("authorization_role_grant.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_authorization_role_grant"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("authorization_rolehierarchy_privs.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_authorization_rolehierarchy_privs"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("authorization_select.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_authorization_select"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("authorization_select_view.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_authorization_select_view"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("authorization_set_role_neg1.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_authorization_set_role_neg1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("authorization_set_role_neg2.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_authorization_set_role_neg2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("authorization_show_parts_nosel.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_authorization_show_parts_nosel"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("authorization_show_role_principals_no_admin.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_authorization_show_role_principals_no_admin"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("authorization_show_role_principals_v1.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_authorization_show_role_principals_v1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("authorization_show_roles_no_admin.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_authorization_show_roles_no_admin"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("authorization_truncate.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_authorization_truncate"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("authorization_uri_add_partition.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_authorization_uri_add_partition"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("authorization_uri_alterpart_loc.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_authorization_uri_alterpart_loc"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("authorization_uri_altertab_setloc.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_authorization_uri_altertab_setloc"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("authorization_uri_create_table1.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_authorization_uri_create_table1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("authorization_uri_create_table_ext.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_authorization_uri_create_table_ext"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("authorization_uri_createdb.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_authorization_uri_createdb"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("authorization_uri_export.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_authorization_uri_export"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("authorization_uri_import.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_authorization_uri_import"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("authorization_uri_index.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_authorization_uri_index"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("authorization_uri_insert.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_authorization_uri_insert"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("authorization_uri_insert_local.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_authorization_uri_insert_local"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("authorization_uri_load_data.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_authorization_uri_load_data"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("authorize_create_tbl.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_authorize_create_tbl"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("authorize_grant_public.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_authorize_grant_public"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("authorize_revoke_public.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_authorize_revoke_public"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("autolocal1.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_autolocal1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("bad_exec_hooks.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_bad_exec_hooks"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("bad_indextype.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_bad_indextype"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("bad_sample_clause.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_bad_sample_clause"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("bucket_mapjoin_mismatch1.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_bucket_mapjoin_mismatch1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("bucket_mapjoin_wrong_table_metadata_1.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_bucket_mapjoin_wrong_table_metadata_1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("bucket_mapjoin_wrong_table_metadata_2.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_bucket_mapjoin_wrong_table_metadata_2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("cachingprintstream.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_cachingprintstream"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("clusterbydistributeby.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_clusterbydistributeby"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("clusterbyorderby.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_clusterbyorderby"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("clusterbysortby.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_clusterbysortby"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("clustern2.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_clustern2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("clustern3.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_clustern3"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("clustern4.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_clustern4"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("column_change_skewedcol_type1.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_column_change_skewedcol_type1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("column_rename1.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_column_rename1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("column_rename2.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_column_rename2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("column_rename3.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_column_rename3"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("column_rename4.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_column_rename4"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("column_rename5.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_column_rename5"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("columnstats_partlvl_dp.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_columnstats_partlvl_dp"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("columnstats_partlvl_incorrect_num_keys.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_columnstats_partlvl_incorrect_num_keys"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("columnstats_partlvl_invalid_values.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_columnstats_partlvl_invalid_values"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("columnstats_partlvl_multiple_part_clause.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_columnstats_partlvl_multiple_part_clause"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("columnstats_tbllvl.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_columnstats_tbllvl"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("columnstats_tbllvl_complex_type.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_columnstats_tbllvl_complex_type"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("columnstats_tbllvl_incorrect_column.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_columnstats_tbllvl_incorrect_column"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("compare_double_bigint.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_compare_double_bigint"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("compare_string_bigint.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_compare_string_bigint"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("compile_processor.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_compile_processor"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("compute_stats_long.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_compute_stats_long"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("create_function_nonexistent_class.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_create_function_nonexistent_class"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("create_function_nonexistent_db.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_create_function_nonexistent_db"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("create_function_nonudf_class.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_create_function_nonudf_class"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("create_insert_outputformat.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_create_insert_outputformat"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("create_or_replace_view1.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_create_or_replace_view1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("create_or_replace_view2.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_create_or_replace_view2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("create_or_replace_view3.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_create_or_replace_view3"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("create_or_replace_view4.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_create_or_replace_view4"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("create_or_replace_view5.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_create_or_replace_view5"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("create_or_replace_view6.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_create_or_replace_view6"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("create_or_replace_view7.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_create_or_replace_view7"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("create_or_replace_view8.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_create_or_replace_view8"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("create_skewed_table_col_name_value_no_mismatch.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_create_skewed_table_col_name_value_no_mismatch"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("create_skewed_table_dup_col_name.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_create_skewed_table_dup_col_name"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("create_skewed_table_failure_invalid_col_name.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_create_skewed_table_failure_invalid_col_name"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("create_table_failure1.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_create_table_failure1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("create_table_failure2.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_create_table_failure2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("create_table_failure3.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_create_table_failure3"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("create_table_failure4.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_create_table_failure4"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("create_table_wrong_regex.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_create_table_wrong_regex"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("create_udaf_failure.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_create_udaf_failure"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("create_unknown_genericudf.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_create_unknown_genericudf"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("create_unknown_udf_udaf.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_create_unknown_udf_udaf"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("create_view_failure1.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_create_view_failure1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("create_view_failure2.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_create_view_failure2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("create_view_failure3.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_create_view_failure3"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("create_view_failure4.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_create_view_failure4"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("create_view_failure5.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_create_view_failure5"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("create_view_failure6.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_create_view_failure6"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("create_view_failure7.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_create_view_failure7"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("create_view_failure8.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_create_view_failure8"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("create_view_failure9.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_create_view_failure9"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("ctas.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_ctas"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("cte_recursion.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_cte_recursion"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("cte_with_in_subquery.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_cte_with_in_subquery"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("database_create_already_exists.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_database_create_already_exists"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("database_create_invalid_name.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_database_create_invalid_name"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("database_drop_does_not_exist.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_database_drop_does_not_exist"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("database_drop_not_empty.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_database_drop_not_empty"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("database_drop_not_empty_restrict.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_database_drop_not_empty_restrict"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("database_switch_does_not_exist.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_database_switch_does_not_exist"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("date_literal2.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_date_literal2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("date_literal3.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_date_literal3"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("dbtxnmgr_nodblock.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_dbtxnmgr_nodblock"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("dbtxnmgr_nodbunlock.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_dbtxnmgr_nodbunlock"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("dbtxnmgr_notablelock.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_dbtxnmgr_notablelock"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("dbtxnmgr_notableunlock.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_dbtxnmgr_notableunlock"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("ddltime.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_ddltime"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("decimal_precision.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_decimal_precision"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("decimal_precision_1.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_decimal_precision_1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("default_partition_name.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_default_partition_name"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("deletejar.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_deletejar"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("desc_failure1.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_desc_failure1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("desc_failure2.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_desc_failure2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("desc_failure3.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_desc_failure3"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("describe_xpath1.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_describe_xpath1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("describe_xpath2.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_describe_xpath2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("describe_xpath3.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_describe_xpath3"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("describe_xpath4.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_describe_xpath4"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("disallow_incompatible_type_change_on1.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_disallow_incompatible_type_change_on1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("disallow_incompatible_type_change_on2.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_disallow_incompatible_type_change_on2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("drop_func_nonexistent.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_drop_func_nonexistent"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("drop_function_failure.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_drop_function_failure"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("drop_index_failure.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_drop_index_failure"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("drop_native_udf.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_drop_native_udf"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("drop_partition_failure.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_drop_partition_failure"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("drop_partition_filter_failure.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_drop_partition_filter_failure"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("drop_table_failure1.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_drop_table_failure1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("drop_table_failure2.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_drop_table_failure2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("drop_table_failure3.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_drop_table_failure3"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("drop_view_failure1.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_drop_view_failure1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("drop_view_failure2.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_drop_view_failure2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("duplicate_alias_in_transform.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_duplicate_alias_in_transform"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("duplicate_alias_in_transform_schema.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_duplicate_alias_in_transform_schema"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("duplicate_insert1.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_duplicate_insert1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("duplicate_insert2.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_duplicate_insert2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("duplicate_insert3.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_duplicate_insert3"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("dyn_part1.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_dyn_part1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("dyn_part2.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_dyn_part2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("dyn_part3.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_dyn_part3"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("dyn_part4.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_dyn_part4"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("dyn_part_max.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_dyn_part_max"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("dyn_part_max_per_node.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_dyn_part_max_per_node"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("dynamic_partitions_with_whitelist.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_dynamic_partitions_with_whitelist"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("exchange_partition_neg_incomplete_partition.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_exchange_partition_neg_incomplete_partition"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("exchange_partition_neg_partition_exists.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_exchange_partition_neg_partition_exists"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("exchange_partition_neg_partition_exists2.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_exchange_partition_neg_partition_exists2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("exchange_partition_neg_partition_exists3.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_exchange_partition_neg_partition_exists3"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("exchange_partition_neg_partition_missing.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_exchange_partition_neg_partition_missing"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("exchange_partition_neg_table_missing.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_exchange_partition_neg_table_missing"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("exchange_partition_neg_table_missing2.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_exchange_partition_neg_table_missing2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("exchange_partition_neg_test.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_exchange_partition_neg_test"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("exim_00_unsupported_schema.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_exim_00_unsupported_schema"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("exim_01_nonpart_over_loaded.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_exim_01_nonpart_over_loaded"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("exim_02_all_part_over_overlap.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_exim_02_all_part_over_overlap"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("exim_03_nonpart_noncompat_colschema.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_exim_03_nonpart_noncompat_colschema"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("exim_04_nonpart_noncompat_colnumber.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_exim_04_nonpart_noncompat_colnumber"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("exim_05_nonpart_noncompat_coltype.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_exim_05_nonpart_noncompat_coltype"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("exim_06_nonpart_noncompat_storage.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_exim_06_nonpart_noncompat_storage"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("exim_07_nonpart_noncompat_ifof.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_exim_07_nonpart_noncompat_ifof"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("exim_08_nonpart_noncompat_serde.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_exim_08_nonpart_noncompat_serde"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("exim_09_nonpart_noncompat_serdeparam.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_exim_09_nonpart_noncompat_serdeparam"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("exim_10_nonpart_noncompat_bucketing.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_exim_10_nonpart_noncompat_bucketing"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("exim_11_nonpart_noncompat_sorting.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_exim_11_nonpart_noncompat_sorting"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("exim_12_nonnative_export.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_exim_12_nonnative_export"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("exim_13_nonnative_import.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_exim_13_nonnative_import"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("exim_14_nonpart_part.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_exim_14_nonpart_part"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("exim_15_part_nonpart.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_exim_15_part_nonpart"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("exim_16_part_noncompat_schema.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_exim_16_part_noncompat_schema"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("exim_17_part_spec_underspec.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_exim_17_part_spec_underspec"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("exim_18_part_spec_missing.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_exim_18_part_spec_missing"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("exim_19_external_over_existing.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_exim_19_external_over_existing"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("exim_20_managed_location_over_existing.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_exim_20_managed_location_over_existing"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("exim_21_part_managed_external.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_exim_21_part_managed_external"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("exim_22_export_authfail.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_exim_22_export_authfail"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("exim_23_import_exist_authfail.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_exim_23_import_exist_authfail"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("exim_24_import_part_authfail.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_exim_24_import_part_authfail"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("exim_25_import_nonexist_authfail.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_exim_25_import_nonexist_authfail"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("external1.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_external1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("external2.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_external2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("fetchtask_ioexception.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_fetchtask_ioexception"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("fileformat_bad_class.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_fileformat_bad_class"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("fileformat_void_input.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_fileformat_void_input"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("fileformat_void_output.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_fileformat_void_output"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("fs_default_name1.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_fs_default_name1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("fs_default_name2.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_fs_default_name2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("genericFileFormat.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_genericFileFormat"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("groupby2_map_skew_multi_distinct.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_groupby2_map_skew_multi_distinct"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("groupby2_multi_distinct.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_groupby2_multi_distinct"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("groupby3_map_skew_multi_distinct.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_groupby3_map_skew_multi_distinct"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("groupby3_multi_distinct.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_groupby3_multi_distinct"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("groupby_cube1.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_groupby_cube1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("groupby_cube2.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_groupby_cube2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("groupby_grouping_id1.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_groupby_grouping_id1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("groupby_grouping_sets1.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_groupby_grouping_sets1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("groupby_grouping_sets2.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_groupby_grouping_sets2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("groupby_grouping_sets3.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_groupby_grouping_sets3"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("groupby_grouping_sets4.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_groupby_grouping_sets4"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("groupby_grouping_sets5.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_groupby_grouping_sets5"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("groupby_grouping_sets6.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_groupby_grouping_sets6"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("groupby_grouping_sets7.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_groupby_grouping_sets7"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("groupby_invalid_position.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_groupby_invalid_position"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("groupby_key.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_groupby_key"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("groupby_rollup1.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_groupby_rollup1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("groupby_rollup2.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_groupby_rollup2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("having1.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_having1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("illegal_partition_type.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_illegal_partition_type"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("illegal_partition_type2.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_illegal_partition_type2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("illegal_partition_type3.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_illegal_partition_type3"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("illegal_partition_type4.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_illegal_partition_type4"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("index_bitmap_no_map_aggr.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_index_bitmap_no_map_aggr"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("index_compact_entry_limit.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_index_compact_entry_limit"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("index_compact_size_limit.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_index_compact_size_limit"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("input1.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_input1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("input2.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_input2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("input4.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_input4"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("input41.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_input41"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("input_part0_neg.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_input_part0_neg"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("insert_into1.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_insert_into1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("insert_into2.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_insert_into2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("insert_into3.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_insert_into3"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("insert_into4.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_insert_into4"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("insert_into5.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_insert_into5"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("insert_into6.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_insert_into6"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("insert_view_failure.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_insert_view_failure"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("insertexternal1.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_insertexternal1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("insertover_dynapart_ifnotexists.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_insertover_dynapart_ifnotexists"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("invalid_arithmetic_type.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_invalid_arithmetic_type"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("invalid_avg_syntax.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_invalid_avg_syntax"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("invalid_cast_from_binary_1.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_invalid_cast_from_binary_1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("invalid_cast_from_binary_2.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_invalid_cast_from_binary_2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("invalid_cast_from_binary_3.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_invalid_cast_from_binary_3"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("invalid_cast_from_binary_4.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_invalid_cast_from_binary_4"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("invalid_cast_from_binary_5.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_invalid_cast_from_binary_5"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("invalid_cast_from_binary_6.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_invalid_cast_from_binary_6"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("invalid_cast_to_binary_1.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_invalid_cast_to_binary_1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("invalid_cast_to_binary_2.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_invalid_cast_to_binary_2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("invalid_cast_to_binary_3.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_invalid_cast_to_binary_3"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("invalid_cast_to_binary_4.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_invalid_cast_to_binary_4"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("invalid_cast_to_binary_5.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_invalid_cast_to_binary_5"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("invalid_cast_to_binary_6.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_invalid_cast_to_binary_6"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("invalid_char_length_1.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_invalid_char_length_1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("invalid_char_length_2.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_invalid_char_length_2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("invalid_char_length_3.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_invalid_char_length_3"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("invalid_config1.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_invalid_config1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("invalid_config2.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_invalid_config2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("invalid_create_tbl1.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_invalid_create_tbl1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("invalid_create_tbl2.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_invalid_create_tbl2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("invalid_mapjoin1.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_invalid_mapjoin1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("invalid_max_syntax.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_invalid_max_syntax"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("invalid_min_syntax.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_invalid_min_syntax"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("invalid_select_column.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_invalid_select_column"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("invalid_select_column_with_subquery.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_invalid_select_column_with_subquery"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("invalid_select_column_with_tablename.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_invalid_select_column_with_tablename"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("invalid_select_expression.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_invalid_select_expression"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("invalid_std_syntax.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_invalid_std_syntax"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("invalid_stddev_samp_syntax.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_invalid_stddev_samp_syntax"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("invalid_sum_syntax.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_invalid_sum_syntax"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("invalid_t_alter1.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_invalid_t_alter1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("invalid_t_alter2.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_invalid_t_alter2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("invalid_t_create2.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_invalid_t_create2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("invalid_t_transform.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_invalid_t_transform"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("invalid_tbl_name.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_invalid_tbl_name"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("invalid_var_samp_syntax.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_invalid_var_samp_syntax"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("invalid_varchar_length_1.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_invalid_varchar_length_1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("invalid_varchar_length_2.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_invalid_varchar_length_2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("invalid_varchar_length_3.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_invalid_varchar_length_3"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("invalid_variance_syntax.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_invalid_variance_syntax"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("invalidate_view1.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_invalidate_view1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("join2.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_join2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("join28.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_join28"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("join29.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_join29"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("join32.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_join32"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("join35.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_join35"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("join_alt_syntax_comma_on.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_join_alt_syntax_comma_on"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("join_cond_unqual_ambiguous.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_join_cond_unqual_ambiguous"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("join_cond_unqual_ambiguous_vc.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_join_cond_unqual_ambiguous_vc"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("join_nonexistent_part.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_join_nonexistent_part"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("joinneg.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_joinneg"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("lateral_view_alias.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_lateral_view_alias"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("lateral_view_join.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_lateral_view_join"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("limit_partition.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_limit_partition"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("limit_partition_stats.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_limit_partition_stats"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("line_terminator.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_line_terminator"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("load_exist_part_authfail.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_load_exist_part_authfail"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("load_non_native.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_load_non_native"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("load_nonpart_authfail.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_load_nonpart_authfail"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("load_part_authfail.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_load_part_authfail"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("load_part_nospec.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_load_part_nospec"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("load_stored_as_dirs.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_load_stored_as_dirs"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("load_view_failure.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_load_view_failure"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("load_wrong_fileformat.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_load_wrong_fileformat"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("load_wrong_fileformat_rc_seq.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_load_wrong_fileformat_rc_seq"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("load_wrong_fileformat_txt_seq.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_load_wrong_fileformat_txt_seq"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("load_wrong_noof_part.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_load_wrong_noof_part"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("local_mapred_error_cache.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_local_mapred_error_cache"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("lockneg1.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_lockneg1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("lockneg2.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_lockneg2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("lockneg3.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_lockneg3"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("lockneg4.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_lockneg4"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("lockneg5.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_lockneg5"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("lockneg_query_tbl_in_locked_db.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_lockneg_query_tbl_in_locked_db"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("lockneg_try_db_lock_conflict.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_lockneg_try_db_lock_conflict"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("lockneg_try_drop_locked_db.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_lockneg_try_drop_locked_db"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("lockneg_try_lock_db_in_use.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_lockneg_try_lock_db_in_use"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("macro_unused_parameter.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_macro_unused_parameter"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("merge_negative_1.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_merge_negative_1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("merge_negative_2.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_merge_negative_2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("merge_negative_3.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_merge_negative_3"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("nested_complex_neg.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_nested_complex_neg"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("no_matching_udf.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_no_matching_udf"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("nonkey_groupby.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_nonkey_groupby"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("nopart_insert.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_nopart_insert"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("nopart_load.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_nopart_load"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("notable_alias4.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_notable_alias4"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("orderby_invalid_position.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_orderby_invalid_position"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("orderby_position_unsupported.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_orderby_position_unsupported"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("orderbysortby.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_orderbysortby"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("parquet_char.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_parquet_char"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("parquet_date.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_parquet_date"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("parquet_decimal.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_parquet_decimal"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("parquet_timestamp.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_parquet_timestamp"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("parquet_varchar.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_parquet_varchar"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("part_col_complex_type.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_part_col_complex_type"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("protectmode_part.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_protectmode_part"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("protectmode_part1.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_protectmode_part1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("protectmode_part2.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_protectmode_part2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("protectmode_part_no_drop.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_protectmode_part_no_drop"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("protectmode_tbl1.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_protectmode_tbl1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("protectmode_tbl2.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_protectmode_tbl2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("protectmode_tbl3.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_protectmode_tbl3"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("protectmode_tbl4.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_protectmode_tbl4"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("protectmode_tbl5.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_protectmode_tbl5"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("protectmode_tbl6.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_protectmode_tbl6"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("protectmode_tbl7.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_protectmode_tbl7"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("protectmode_tbl8.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_protectmode_tbl8"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("protectmode_tbl_no_drop.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_protectmode_tbl_no_drop"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("ptf_negative_AggrFuncsWithNoGBYNoPartDef.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_ptf_negative_AggrFuncsWithNoGBYNoPartDef"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("ptf_negative_AmbiguousWindowDefn.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_ptf_negative_AmbiguousWindowDefn"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("ptf_negative_DistributeByOrderBy.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_ptf_negative_DistributeByOrderBy"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("ptf_negative_DuplicateWindowAlias.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_ptf_negative_DuplicateWindowAlias"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("ptf_negative_HavingLeadWithNoGBYNoWindowing.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_ptf_negative_HavingLeadWithNoGBYNoWindowing"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("ptf_negative_HavingLeadWithPTF.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_ptf_negative_HavingLeadWithPTF"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("ptf_negative_InvalidValueBoundary.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_ptf_negative_InvalidValueBoundary"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("ptf_negative_JoinWithAmbigousAlias.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_ptf_negative_JoinWithAmbigousAlias"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("ptf_negative_PartitionBySortBy.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_ptf_negative_PartitionBySortBy"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("ptf_negative_WhereWithRankCond.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_ptf_negative_WhereWithRankCond"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("ptf_window_boundaries.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_ptf_window_boundaries"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("ptf_window_boundaries2.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_ptf_window_boundaries2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("recursive_view.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_recursive_view"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("regex_col_1.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_regex_col_1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("regex_col_2.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_regex_col_2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("regex_col_groupby.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_regex_col_groupby"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("sa_fail_hook3.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_sa_fail_hook3"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("sample.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_sample"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("script_broken_pipe2.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_script_broken_pipe2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("script_broken_pipe3.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_script_broken_pipe3"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("script_error.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_script_error"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("select_charliteral.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_select_charliteral"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("select_udtf_alias.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_select_udtf_alias"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("semijoin1.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_semijoin1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("semijoin2.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_semijoin2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("semijoin3.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_semijoin3"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("semijoin4.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_semijoin4"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("serde_regex.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_serde_regex"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("serde_regex2.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_serde_regex2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("serde_regex3.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_serde_regex3"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("set_hiveconf_validation0.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_set_hiveconf_validation0"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("set_hiveconf_validation1.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_set_hiveconf_validation1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("set_hiveconf_validation2.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_set_hiveconf_validation2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("set_table_property.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_set_table_property"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("show_columns1.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_show_columns1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("show_columns2.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_show_columns2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("show_columns3.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_show_columns3"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("show_create_table_does_not_exist.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_show_create_table_does_not_exist"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("show_create_table_index.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_show_create_table_index"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("show_partitions1.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_show_partitions1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("show_tableproperties1.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_show_tableproperties1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("show_tables_bad1.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_show_tables_bad1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("show_tables_bad2.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_show_tables_bad2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("show_tables_bad_db1.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_show_tables_bad_db1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("show_tables_bad_db2.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_show_tables_bad_db2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("show_tablestatus.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_show_tablestatus"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("show_tablestatus_not_existing_part.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_show_tablestatus_not_existing_part"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("smb_bucketmapjoin.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_smb_bucketmapjoin"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("smb_mapjoin_14.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_smb_mapjoin_14"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("sortmerge_mapjoin_mismatch_1.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_sortmerge_mapjoin_mismatch_1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("split_sample_out_of_range.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_split_sample_out_of_range"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("split_sample_wrong_format.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_split_sample_wrong_format"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("split_sample_wrong_format2.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_split_sample_wrong_format2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("stats_aggregator_error_1.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_stats_aggregator_error_1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("stats_aggregator_error_2.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_stats_aggregator_error_2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("stats_noscan_non_native.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_stats_noscan_non_native"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("stats_partialscan_autogether.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_stats_partialscan_autogether"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("stats_partialscan_non_external.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_stats_partialscan_non_external"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("stats_partialscan_non_native.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_stats_partialscan_non_native"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("stats_partscan_norcfile.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_stats_partscan_norcfile"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("stats_publisher_error_1.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_stats_publisher_error_1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("stats_publisher_error_2.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_stats_publisher_error_2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("strict_join.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_strict_join"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("strict_orderby.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_strict_orderby"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("strict_pruning.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_strict_pruning"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("subq_insert.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_subq_insert"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("subquery_exists_implicit_gby.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_subquery_exists_implicit_gby"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("subquery_in_groupby.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_subquery_in_groupby"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("subquery_in_select.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_subquery_in_select"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("subquery_multiple_cols_in_select.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_subquery_multiple_cols_in_select"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("subquery_nested_subquery.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_subquery_nested_subquery"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("subquery_notexists_implicit_gby.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_subquery_notexists_implicit_gby"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("subquery_shared_alias.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_subquery_shared_alias"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("subquery_subquery_chain.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_subquery_subquery_chain"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("subquery_unqual_corr_expr.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_subquery_unqual_corr_expr"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("subquery_windowing_corr.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_subquery_windowing_corr"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("subquery_with_or_cond.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_subquery_with_or_cond"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("touch1.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_touch1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("touch2.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_touch2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("truncate_bucketed_column.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_truncate_bucketed_column"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("truncate_column_indexed_table.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_truncate_column_indexed_table"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("truncate_column_list_bucketing.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_truncate_column_list_bucketing"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("truncate_column_seqfile.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_truncate_column_seqfile"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("truncate_nonexistant_column.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_truncate_nonexistant_column"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("truncate_partition_column.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_truncate_partition_column"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("truncate_partition_column2.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_truncate_partition_column2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("truncate_table_failure1.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_truncate_table_failure1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("truncate_table_failure2.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_truncate_table_failure2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("truncate_table_failure3.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_truncate_table_failure3"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("truncate_table_failure4.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_truncate_table_failure4"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udaf_invalid_place.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_udaf_invalid_place"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_array_contains_wrong1.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_udf_array_contains_wrong1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_array_contains_wrong2.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_udf_array_contains_wrong2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_assert_true.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_udf_assert_true"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_assert_true2.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_udf_assert_true2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_coalesce.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_udf_coalesce"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_concat_ws_wrong1.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_udf_concat_ws_wrong1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_concat_ws_wrong2.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_udf_concat_ws_wrong2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_concat_ws_wrong3.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_udf_concat_ws_wrong3"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_elt_wrong_args_len.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_udf_elt_wrong_args_len"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_elt_wrong_type.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_udf_elt_wrong_type"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_field_wrong_args_len.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_udf_field_wrong_args_len"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_field_wrong_type.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_udf_field_wrong_type"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_format_number_wrong1.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_udf_format_number_wrong1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_format_number_wrong2.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_udf_format_number_wrong2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_format_number_wrong3.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_udf_format_number_wrong3"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_format_number_wrong4.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_udf_format_number_wrong4"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_format_number_wrong5.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_udf_format_number_wrong5"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_format_number_wrong6.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_udf_format_number_wrong6"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_format_number_wrong7.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_udf_format_number_wrong7"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_function_does_not_implement_udf.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_udf_function_does_not_implement_udf"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_if_not_bool.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_udf_if_not_bool"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_if_wrong_args_len.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_udf_if_wrong_args_len"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_in.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_udf_in"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_instr_wrong_args_len.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_udf_instr_wrong_args_len"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_instr_wrong_type.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_udf_instr_wrong_type"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_invalid.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_udf_invalid"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_locate_wrong_args_len.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_udf_locate_wrong_args_len"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_locate_wrong_type.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_udf_locate_wrong_type"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_map_keys_arg_num.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_udf_map_keys_arg_num"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_map_keys_arg_type.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_udf_map_keys_arg_type"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_map_values_arg_num.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_udf_map_values_arg_num"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_map_values_arg_type.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_udf_map_values_arg_type"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_max.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_udf_max"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_min.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_udf_min"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_nonexistent_resource.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_udf_nonexistent_resource"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_printf_wrong1.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_udf_printf_wrong1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_printf_wrong2.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_udf_printf_wrong2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_printf_wrong3.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_udf_printf_wrong3"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_printf_wrong4.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_udf_printf_wrong4"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_qualified_name.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_udf_qualified_name"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_reflect_neg.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_udf_reflect_neg"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_size_wrong_args_len.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_udf_size_wrong_args_len"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_size_wrong_type.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_udf_size_wrong_type"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_sort_array_wrong1.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_udf_sort_array_wrong1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_sort_array_wrong2.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_udf_sort_array_wrong2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_sort_array_wrong3.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_udf_sort_array_wrong3"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_test_error.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_udf_test_error"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_test_error_reduce.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_udf_test_error_reduce"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udf_when_type_wrong.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_udf_when_type_wrong"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udtf_explode_not_supported1.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_udtf_explode_not_supported1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udtf_explode_not_supported2.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_udtf_explode_not_supported2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udtf_explode_not_supported3.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_udtf_explode_not_supported3"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udtf_explode_not_supported4.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_udtf_explode_not_supported4"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udtf_invalid_place.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_udtf_invalid_place"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udtf_not_supported1.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_udtf_not_supported1"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("udtf_not_supported3.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_udtf_not_supported3"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("union2.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_union2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("union22.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_union22"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("union3.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_union3"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("uniquejoin.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_uniquejoin"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("uniquejoin2.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_uniquejoin2"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("uniquejoin3.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_uniquejoin3"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("unset_table_property.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_unset_table_property"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("unset_view_property.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_unset_view_property"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("windowing_invalid_udaf.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_windowing_invalid_udaf"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("windowing_leadlag_in_udaf.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_windowing_leadlag_in_udaf"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("windowing_ll_no_neg.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_windowing_ll_no_neg"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("windowing_ll_no_over.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_windowing_ll_no_over"));
    }
    if(qFilesToExecute.isEmpty() || qFilesToExecute.contains("wrong_column_type.q")) {
      suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_wrong_column_type"));
    }
    suite.addTest(new TestNegativeCliDriver("testNegativeCliDriver_shutdown"));
    return suite;
  }

  /**
   * Dummy last test. This is only meant to shutdown qt
   */
  public void testNegativeCliDriver_shutdown() {
    System.err.println ("Cleaning up " + "TestNegativeCliDriver");
  }

  static String debugHint = "\nSee ./ql/target/tmp/log/hive.log or ./itests/qtest/target/tmp/log/hive.log, "
     + "or check ./ql/target/surefire-reports or ./itests/qtest/target/surefire-reports/ for specific test cases logs.";

  public void testNegativeCliDriver_add_partition_with_whitelist() throws Exception {
    runTest("add_partition_with_whitelist", "add_partition_with_whitelist.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/add_partition_with_whitelist.q"));
  }

  public void testNegativeCliDriver_addpart1() throws Exception {
    runTest("addpart1", "addpart1.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/addpart1.q"));
  }

  public void testNegativeCliDriver_alter_concatenate_indexed_table() throws Exception {
    runTest("alter_concatenate_indexed_table", "alter_concatenate_indexed_table.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/alter_concatenate_indexed_table.q"));
  }

  public void testNegativeCliDriver_alter_non_native() throws Exception {
    runTest("alter_non_native", "alter_non_native.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/alter_non_native.q"));
  }

  public void testNegativeCliDriver_alter_partition_coltype_2columns() throws Exception {
    runTest("alter_partition_coltype_2columns", "alter_partition_coltype_2columns.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/alter_partition_coltype_2columns.q"));
  }

  public void testNegativeCliDriver_alter_partition_coltype_invalidcolname() throws Exception {
    runTest("alter_partition_coltype_invalidcolname", "alter_partition_coltype_invalidcolname.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/alter_partition_coltype_invalidcolname.q"));
  }

  public void testNegativeCliDriver_alter_partition_coltype_invalidtype() throws Exception {
    runTest("alter_partition_coltype_invalidtype", "alter_partition_coltype_invalidtype.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/alter_partition_coltype_invalidtype.q"));
  }

  public void testNegativeCliDriver_alter_partition_invalidspec() throws Exception {
    runTest("alter_partition_invalidspec", "alter_partition_invalidspec.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/alter_partition_invalidspec.q"));
  }

  public void testNegativeCliDriver_alter_partition_nodrop() throws Exception {
    runTest("alter_partition_nodrop", "alter_partition_nodrop.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/alter_partition_nodrop.q"));
  }

  public void testNegativeCliDriver_alter_partition_nodrop_table() throws Exception {
    runTest("alter_partition_nodrop_table", "alter_partition_nodrop_table.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/alter_partition_nodrop_table.q"));
  }

  public void testNegativeCliDriver_alter_partition_offline() throws Exception {
    runTest("alter_partition_offline", "alter_partition_offline.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/alter_partition_offline.q"));
  }

  public void testNegativeCliDriver_alter_partition_with_whitelist() throws Exception {
    runTest("alter_partition_with_whitelist", "alter_partition_with_whitelist.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/alter_partition_with_whitelist.q"));
  }

  public void testNegativeCliDriver_alter_rename_partition_failure() throws Exception {
    runTest("alter_rename_partition_failure", "alter_rename_partition_failure.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/alter_rename_partition_failure.q"));
  }

  public void testNegativeCliDriver_alter_rename_partition_failure2() throws Exception {
    runTest("alter_rename_partition_failure2", "alter_rename_partition_failure2.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/alter_rename_partition_failure2.q"));
  }

  public void testNegativeCliDriver_alter_rename_partition_failure3() throws Exception {
    runTest("alter_rename_partition_failure3", "alter_rename_partition_failure3.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/alter_rename_partition_failure3.q"));
  }

  public void testNegativeCliDriver_alter_table_add_partition() throws Exception {
    runTest("alter_table_add_partition", "alter_table_add_partition.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/alter_table_add_partition.q"));
  }

  public void testNegativeCliDriver_alter_table_wrong_regex() throws Exception {
    runTest("alter_table_wrong_regex", "alter_table_wrong_regex.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/alter_table_wrong_regex.q"));
  }

  public void testNegativeCliDriver_alter_view_as_select_not_exist() throws Exception {
    runTest("alter_view_as_select_not_exist", "alter_view_as_select_not_exist.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/alter_view_as_select_not_exist.q"));
  }

  public void testNegativeCliDriver_alter_view_as_select_with_partition() throws Exception {
    runTest("alter_view_as_select_with_partition", "alter_view_as_select_with_partition.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/alter_view_as_select_with_partition.q"));
  }

  public void testNegativeCliDriver_alter_view_failure() throws Exception {
    runTest("alter_view_failure", "alter_view_failure.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/alter_view_failure.q"));
  }

  public void testNegativeCliDriver_alter_view_failure2() throws Exception {
    runTest("alter_view_failure2", "alter_view_failure2.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/alter_view_failure2.q"));
  }

  public void testNegativeCliDriver_alter_view_failure3() throws Exception {
    runTest("alter_view_failure3", "alter_view_failure3.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/alter_view_failure3.q"));
  }

  public void testNegativeCliDriver_alter_view_failure4() throws Exception {
    runTest("alter_view_failure4", "alter_view_failure4.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/alter_view_failure4.q"));
  }

  public void testNegativeCliDriver_alter_view_failure5() throws Exception {
    runTest("alter_view_failure5", "alter_view_failure5.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/alter_view_failure5.q"));
  }

  public void testNegativeCliDriver_alter_view_failure6() throws Exception {
    runTest("alter_view_failure6", "alter_view_failure6.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/alter_view_failure6.q"));
  }

  public void testNegativeCliDriver_alter_view_failure7() throws Exception {
    runTest("alter_view_failure7", "alter_view_failure7.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/alter_view_failure7.q"));
  }

  public void testNegativeCliDriver_alter_view_failure8() throws Exception {
    runTest("alter_view_failure8", "alter_view_failure8.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/alter_view_failure8.q"));
  }

  public void testNegativeCliDriver_alter_view_failure9() throws Exception {
    runTest("alter_view_failure9", "alter_view_failure9.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/alter_view_failure9.q"));
  }

  public void testNegativeCliDriver_altern1() throws Exception {
    runTest("altern1", "altern1.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/altern1.q"));
  }

  public void testNegativeCliDriver_ambiguous_col() throws Exception {
    runTest("ambiguous_col", "ambiguous_col.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/ambiguous_col.q"));
  }

  public void testNegativeCliDriver_ambiguous_col0() throws Exception {
    runTest("ambiguous_col0", "ambiguous_col0.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/ambiguous_col0.q"));
  }

  public void testNegativeCliDriver_ambiguous_col1() throws Exception {
    runTest("ambiguous_col1", "ambiguous_col1.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/ambiguous_col1.q"));
  }

  public void testNegativeCliDriver_ambiguous_col2() throws Exception {
    runTest("ambiguous_col2", "ambiguous_col2.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/ambiguous_col2.q"));
  }

  public void testNegativeCliDriver_analyze() throws Exception {
    runTest("analyze", "analyze.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/analyze.q"));
  }

  public void testNegativeCliDriver_analyze1() throws Exception {
    runTest("analyze1", "analyze1.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/analyze1.q"));
  }

  public void testNegativeCliDriver_analyze_non_existent_tbl() throws Exception {
    runTest("analyze_non_existent_tbl", "analyze_non_existent_tbl.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/analyze_non_existent_tbl.q"));
  }

  public void testNegativeCliDriver_analyze_view() throws Exception {
    runTest("analyze_view", "analyze_view.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/analyze_view.q"));
  }

  public void testNegativeCliDriver_archive1() throws Exception {
    runTest("archive1", "archive1.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/archive1.q"));
  }

  public void testNegativeCliDriver_archive2() throws Exception {
    runTest("archive2", "archive2.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/archive2.q"));
  }

  public void testNegativeCliDriver_archive3() throws Exception {
    runTest("archive3", "archive3.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/archive3.q"));
  }

  public void testNegativeCliDriver_archive4() throws Exception {
    runTest("archive4", "archive4.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/archive4.q"));
  }

  public void testNegativeCliDriver_archive5() throws Exception {
    runTest("archive5", "archive5.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/archive5.q"));
  }

  public void testNegativeCliDriver_archive_corrupt() throws Exception {
    runTest("archive_corrupt", "archive_corrupt.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/archive_corrupt.q"));
  }

  public void testNegativeCliDriver_archive_insert1() throws Exception {
    runTest("archive_insert1", "archive_insert1.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/archive_insert1.q"));
  }

  public void testNegativeCliDriver_archive_insert2() throws Exception {
    runTest("archive_insert2", "archive_insert2.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/archive_insert2.q"));
  }

  public void testNegativeCliDriver_archive_insert3() throws Exception {
    runTest("archive_insert3", "archive_insert3.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/archive_insert3.q"));
  }

  public void testNegativeCliDriver_archive_insert4() throws Exception {
    runTest("archive_insert4", "archive_insert4.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/archive_insert4.q"));
  }

  public void testNegativeCliDriver_archive_multi1() throws Exception {
    runTest("archive_multi1", "archive_multi1.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/archive_multi1.q"));
  }

  public void testNegativeCliDriver_archive_multi2() throws Exception {
    runTest("archive_multi2", "archive_multi2.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/archive_multi2.q"));
  }

  public void testNegativeCliDriver_archive_multi3() throws Exception {
    runTest("archive_multi3", "archive_multi3.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/archive_multi3.q"));
  }

  public void testNegativeCliDriver_archive_multi4() throws Exception {
    runTest("archive_multi4", "archive_multi4.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/archive_multi4.q"));
  }

  public void testNegativeCliDriver_archive_multi5() throws Exception {
    runTest("archive_multi5", "archive_multi5.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/archive_multi5.q"));
  }

  public void testNegativeCliDriver_archive_multi6() throws Exception {
    runTest("archive_multi6", "archive_multi6.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/archive_multi6.q"));
  }

  public void testNegativeCliDriver_archive_multi7() throws Exception {
    runTest("archive_multi7", "archive_multi7.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/archive_multi7.q"));
  }

  public void testNegativeCliDriver_archive_partspec1() throws Exception {
    runTest("archive_partspec1", "archive_partspec1.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/archive_partspec1.q"));
  }

  public void testNegativeCliDriver_archive_partspec2() throws Exception {
    runTest("archive_partspec2", "archive_partspec2.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/archive_partspec2.q"));
  }

  public void testNegativeCliDriver_archive_partspec3() throws Exception {
    runTest("archive_partspec3", "archive_partspec3.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/archive_partspec3.q"));
  }

  public void testNegativeCliDriver_archive_partspec4() throws Exception {
    runTest("archive_partspec4", "archive_partspec4.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/archive_partspec4.q"));
  }

  public void testNegativeCliDriver_archive_partspec5() throws Exception {
    runTest("archive_partspec5", "archive_partspec5.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/archive_partspec5.q"));
  }

  public void testNegativeCliDriver_authorization_addjar() throws Exception {
    runTest("authorization_addjar", "authorization_addjar.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/authorization_addjar.q"));
  }

  public void testNegativeCliDriver_authorization_addpartition() throws Exception {
    runTest("authorization_addpartition", "authorization_addpartition.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/authorization_addpartition.q"));
  }

  public void testNegativeCliDriver_authorization_alter_db_owner() throws Exception {
    runTest("authorization_alter_db_owner", "authorization_alter_db_owner.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/authorization_alter_db_owner.q"));
  }

  public void testNegativeCliDriver_authorization_alter_db_owner_default() throws Exception {
    runTest("authorization_alter_db_owner_default", "authorization_alter_db_owner_default.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/authorization_alter_db_owner_default.q"));
  }

  public void testNegativeCliDriver_authorization_cannot_create_all_role() throws Exception {
    runTest("authorization_cannot_create_all_role", "authorization_cannot_create_all_role.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/authorization_cannot_create_all_role.q"));
  }

  public void testNegativeCliDriver_authorization_cannot_create_default_role() throws Exception {
    runTest("authorization_cannot_create_default_role", "authorization_cannot_create_default_role.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/authorization_cannot_create_default_role.q"));
  }

  public void testNegativeCliDriver_authorization_cannot_create_none_role() throws Exception {
    runTest("authorization_cannot_create_none_role", "authorization_cannot_create_none_role.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/authorization_cannot_create_none_role.q"));
  }

  public void testNegativeCliDriver_authorization_caseinsensitivity() throws Exception {
    runTest("authorization_caseinsensitivity", "authorization_caseinsensitivity.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/authorization_caseinsensitivity.q"));
  }

  public void testNegativeCliDriver_authorization_create_func1() throws Exception {
    runTest("authorization_create_func1", "authorization_create_func1.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/authorization_create_func1.q"));
  }

  public void testNegativeCliDriver_authorization_create_func2() throws Exception {
    runTest("authorization_create_func2", "authorization_create_func2.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/authorization_create_func2.q"));
  }

  public void testNegativeCliDriver_authorization_create_macro1() throws Exception {
    runTest("authorization_create_macro1", "authorization_create_macro1.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/authorization_create_macro1.q"));
  }

  public void testNegativeCliDriver_authorization_create_role_no_admin() throws Exception {
    runTest("authorization_create_role_no_admin", "authorization_create_role_no_admin.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/authorization_create_role_no_admin.q"));
  }

  public void testNegativeCliDriver_authorization_createview() throws Exception {
    runTest("authorization_createview", "authorization_createview.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/authorization_createview.q"));
  }

  public void testNegativeCliDriver_authorization_ctas() throws Exception {
    runTest("authorization_ctas", "authorization_ctas.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/authorization_ctas.q"));
  }

  public void testNegativeCliDriver_authorization_desc_table_nosel() throws Exception {
    runTest("authorization_desc_table_nosel", "authorization_desc_table_nosel.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/authorization_desc_table_nosel.q"));
  }

  public void testNegativeCliDriver_authorization_dfs() throws Exception {
    runTest("authorization_dfs", "authorization_dfs.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/authorization_dfs.q"));
  }

  public void testNegativeCliDriver_authorization_disallow_transform() throws Exception {
    runTest("authorization_disallow_transform", "authorization_disallow_transform.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/authorization_disallow_transform.q"));
  }

  public void testNegativeCliDriver_authorization_drop_db_cascade() throws Exception {
    runTest("authorization_drop_db_cascade", "authorization_drop_db_cascade.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/authorization_drop_db_cascade.q"));
  }

  public void testNegativeCliDriver_authorization_drop_db_empty() throws Exception {
    runTest("authorization_drop_db_empty", "authorization_drop_db_empty.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/authorization_drop_db_empty.q"));
  }

  public void testNegativeCliDriver_authorization_drop_role_no_admin() throws Exception {
    runTest("authorization_drop_role_no_admin", "authorization_drop_role_no_admin.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/authorization_drop_role_no_admin.q"));
  }

  public void testNegativeCliDriver_authorization_droppartition() throws Exception {
    runTest("authorization_droppartition", "authorization_droppartition.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/authorization_droppartition.q"));
  }

  public void testNegativeCliDriver_authorization_fail_1() throws Exception {
    runTest("authorization_fail_1", "authorization_fail_1.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/authorization_fail_1.q"));
  }

  public void testNegativeCliDriver_authorization_fail_2() throws Exception {
    runTest("authorization_fail_2", "authorization_fail_2.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/authorization_fail_2.q"));
  }

  public void testNegativeCliDriver_authorization_fail_3() throws Exception {
    runTest("authorization_fail_3", "authorization_fail_3.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/authorization_fail_3.q"));
  }

  public void testNegativeCliDriver_authorization_fail_4() throws Exception {
    runTest("authorization_fail_4", "authorization_fail_4.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/authorization_fail_4.q"));
  }

  public void testNegativeCliDriver_authorization_fail_5() throws Exception {
    runTest("authorization_fail_5", "authorization_fail_5.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/authorization_fail_5.q"));
  }

  public void testNegativeCliDriver_authorization_fail_6() throws Exception {
    runTest("authorization_fail_6", "authorization_fail_6.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/authorization_fail_6.q"));
  }

  public void testNegativeCliDriver_authorization_fail_7() throws Exception {
    runTest("authorization_fail_7", "authorization_fail_7.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/authorization_fail_7.q"));
  }

  public void testNegativeCliDriver_authorization_fail_create_db() throws Exception {
    runTest("authorization_fail_create_db", "authorization_fail_create_db.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/authorization_fail_create_db.q"));
  }

  public void testNegativeCliDriver_authorization_fail_drop_db() throws Exception {
    runTest("authorization_fail_drop_db", "authorization_fail_drop_db.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/authorization_fail_drop_db.q"));
  }

  public void testNegativeCliDriver_authorization_grant_table_allpriv() throws Exception {
    runTest("authorization_grant_table_allpriv", "authorization_grant_table_allpriv.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/authorization_grant_table_allpriv.q"));
  }

  public void testNegativeCliDriver_authorization_grant_table_dup() throws Exception {
    runTest("authorization_grant_table_dup", "authorization_grant_table_dup.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/authorization_grant_table_dup.q"));
  }

  public void testNegativeCliDriver_authorization_grant_table_fail1() throws Exception {
    runTest("authorization_grant_table_fail1", "authorization_grant_table_fail1.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/authorization_grant_table_fail1.q"));
  }

  public void testNegativeCliDriver_authorization_grant_table_fail_nogrant() throws Exception {
    runTest("authorization_grant_table_fail_nogrant", "authorization_grant_table_fail_nogrant.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/authorization_grant_table_fail_nogrant.q"));
  }

  public void testNegativeCliDriver_authorization_insert_noinspriv() throws Exception {
    runTest("authorization_insert_noinspriv", "authorization_insert_noinspriv.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/authorization_insert_noinspriv.q"));
  }

  public void testNegativeCliDriver_authorization_insert_noselectpriv() throws Exception {
    runTest("authorization_insert_noselectpriv", "authorization_insert_noselectpriv.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/authorization_insert_noselectpriv.q"));
  }

  public void testNegativeCliDriver_authorization_invalid_priv_v1() throws Exception {
    runTest("authorization_invalid_priv_v1", "authorization_invalid_priv_v1.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/authorization_invalid_priv_v1.q"));
  }

  public void testNegativeCliDriver_authorization_invalid_priv_v2() throws Exception {
    runTest("authorization_invalid_priv_v2", "authorization_invalid_priv_v2.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/authorization_invalid_priv_v2.q"));
  }

  public void testNegativeCliDriver_authorization_not_owner_alter_tab_rename() throws Exception {
    runTest("authorization_not_owner_alter_tab_rename", "authorization_not_owner_alter_tab_rename.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/authorization_not_owner_alter_tab_rename.q"));
  }

  public void testNegativeCliDriver_authorization_not_owner_alter_tab_serdeprop() throws Exception {
    runTest("authorization_not_owner_alter_tab_serdeprop", "authorization_not_owner_alter_tab_serdeprop.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/authorization_not_owner_alter_tab_serdeprop.q"));
  }

  public void testNegativeCliDriver_authorization_not_owner_drop_tab() throws Exception {
    runTest("authorization_not_owner_drop_tab", "authorization_not_owner_drop_tab.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/authorization_not_owner_drop_tab.q"));
  }

  public void testNegativeCliDriver_authorization_not_owner_drop_view() throws Exception {
    runTest("authorization_not_owner_drop_view", "authorization_not_owner_drop_view.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/authorization_not_owner_drop_view.q"));
  }

  public void testNegativeCliDriver_authorization_part() throws Exception {
    runTest("authorization_part", "authorization_part.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/authorization_part.q"));
  }

  public void testNegativeCliDriver_authorization_priv_current_role_neg() throws Exception {
    runTest("authorization_priv_current_role_neg", "authorization_priv_current_role_neg.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/authorization_priv_current_role_neg.q"));
  }

  public void testNegativeCliDriver_authorization_public_create() throws Exception {
    runTest("authorization_public_create", "authorization_public_create.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/authorization_public_create.q"));
  }

  public void testNegativeCliDriver_authorization_public_drop() throws Exception {
    runTest("authorization_public_drop", "authorization_public_drop.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/authorization_public_drop.q"));
  }

  public void testNegativeCliDriver_authorization_revoke_table_fail1() throws Exception {
    runTest("authorization_revoke_table_fail1", "authorization_revoke_table_fail1.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/authorization_revoke_table_fail1.q"));
  }

  public void testNegativeCliDriver_authorization_revoke_table_fail2() throws Exception {
    runTest("authorization_revoke_table_fail2", "authorization_revoke_table_fail2.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/authorization_revoke_table_fail2.q"));
  }

  public void testNegativeCliDriver_authorization_role_cycles1() throws Exception {
    runTest("authorization_role_cycles1", "authorization_role_cycles1.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/authorization_role_cycles1.q"));
  }

  public void testNegativeCliDriver_authorization_role_cycles2() throws Exception {
    runTest("authorization_role_cycles2", "authorization_role_cycles2.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/authorization_role_cycles2.q"));
  }

  public void testNegativeCliDriver_authorization_role_grant() throws Exception {
    runTest("authorization_role_grant", "authorization_role_grant.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/authorization_role_grant.q"));
  }

  public void testNegativeCliDriver_authorization_rolehierarchy_privs() throws Exception {
    runTest("authorization_rolehierarchy_privs", "authorization_rolehierarchy_privs.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/authorization_rolehierarchy_privs.q"));
  }

  public void testNegativeCliDriver_authorization_select() throws Exception {
    runTest("authorization_select", "authorization_select.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/authorization_select.q"));
  }

  public void testNegativeCliDriver_authorization_select_view() throws Exception {
    runTest("authorization_select_view", "authorization_select_view.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/authorization_select_view.q"));
  }

  public void testNegativeCliDriver_authorization_set_role_neg1() throws Exception {
    runTest("authorization_set_role_neg1", "authorization_set_role_neg1.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/authorization_set_role_neg1.q"));
  }

  public void testNegativeCliDriver_authorization_set_role_neg2() throws Exception {
    runTest("authorization_set_role_neg2", "authorization_set_role_neg2.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/authorization_set_role_neg2.q"));
  }

  public void testNegativeCliDriver_authorization_show_parts_nosel() throws Exception {
    runTest("authorization_show_parts_nosel", "authorization_show_parts_nosel.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/authorization_show_parts_nosel.q"));
  }

  public void testNegativeCliDriver_authorization_show_role_principals_no_admin() throws Exception {
    runTest("authorization_show_role_principals_no_admin", "authorization_show_role_principals_no_admin.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/authorization_show_role_principals_no_admin.q"));
  }

  public void testNegativeCliDriver_authorization_show_role_principals_v1() throws Exception {
    runTest("authorization_show_role_principals_v1", "authorization_show_role_principals_v1.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/authorization_show_role_principals_v1.q"));
  }

  public void testNegativeCliDriver_authorization_show_roles_no_admin() throws Exception {
    runTest("authorization_show_roles_no_admin", "authorization_show_roles_no_admin.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/authorization_show_roles_no_admin.q"));
  }

  public void testNegativeCliDriver_authorization_truncate() throws Exception {
    runTest("authorization_truncate", "authorization_truncate.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/authorization_truncate.q"));
  }

  public void testNegativeCliDriver_authorization_uri_add_partition() throws Exception {
    runTest("authorization_uri_add_partition", "authorization_uri_add_partition.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/authorization_uri_add_partition.q"));
  }

  public void testNegativeCliDriver_authorization_uri_alterpart_loc() throws Exception {
    runTest("authorization_uri_alterpart_loc", "authorization_uri_alterpart_loc.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/authorization_uri_alterpart_loc.q"));
  }

  public void testNegativeCliDriver_authorization_uri_altertab_setloc() throws Exception {
    runTest("authorization_uri_altertab_setloc", "authorization_uri_altertab_setloc.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/authorization_uri_altertab_setloc.q"));
  }

  public void testNegativeCliDriver_authorization_uri_create_table1() throws Exception {
    runTest("authorization_uri_create_table1", "authorization_uri_create_table1.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/authorization_uri_create_table1.q"));
  }

  public void testNegativeCliDriver_authorization_uri_create_table_ext() throws Exception {
    runTest("authorization_uri_create_table_ext", "authorization_uri_create_table_ext.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/authorization_uri_create_table_ext.q"));
  }

  public void testNegativeCliDriver_authorization_uri_createdb() throws Exception {
    runTest("authorization_uri_createdb", "authorization_uri_createdb.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/authorization_uri_createdb.q"));
  }

  public void testNegativeCliDriver_authorization_uri_export() throws Exception {
    runTest("authorization_uri_export", "authorization_uri_export.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/authorization_uri_export.q"));
  }

  public void testNegativeCliDriver_authorization_uri_import() throws Exception {
    runTest("authorization_uri_import", "authorization_uri_import.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/authorization_uri_import.q"));
  }

  public void testNegativeCliDriver_authorization_uri_index() throws Exception {
    runTest("authorization_uri_index", "authorization_uri_index.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/authorization_uri_index.q"));
  }

  public void testNegativeCliDriver_authorization_uri_insert() throws Exception {
    runTest("authorization_uri_insert", "authorization_uri_insert.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/authorization_uri_insert.q"));
  }

  public void testNegativeCliDriver_authorization_uri_insert_local() throws Exception {
    runTest("authorization_uri_insert_local", "authorization_uri_insert_local.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/authorization_uri_insert_local.q"));
  }

  public void testNegativeCliDriver_authorization_uri_load_data() throws Exception {
    runTest("authorization_uri_load_data", "authorization_uri_load_data.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/authorization_uri_load_data.q"));
  }

  public void testNegativeCliDriver_authorize_create_tbl() throws Exception {
    runTest("authorize_create_tbl", "authorize_create_tbl.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/authorize_create_tbl.q"));
  }

  public void testNegativeCliDriver_authorize_grant_public() throws Exception {
    runTest("authorize_grant_public", "authorize_grant_public.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/authorize_grant_public.q"));
  }

  public void testNegativeCliDriver_authorize_revoke_public() throws Exception {
    runTest("authorize_revoke_public", "authorize_revoke_public.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/authorize_revoke_public.q"));
  }

  public void testNegativeCliDriver_autolocal1() throws Exception {
    runTest("autolocal1", "autolocal1.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/autolocal1.q"));
  }

  public void testNegativeCliDriver_bad_exec_hooks() throws Exception {
    runTest("bad_exec_hooks", "bad_exec_hooks.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/bad_exec_hooks.q"));
  }

  public void testNegativeCliDriver_bad_indextype() throws Exception {
    runTest("bad_indextype", "bad_indextype.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/bad_indextype.q"));
  }

  public void testNegativeCliDriver_bad_sample_clause() throws Exception {
    runTest("bad_sample_clause", "bad_sample_clause.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/bad_sample_clause.q"));
  }

  public void testNegativeCliDriver_bucket_mapjoin_mismatch1() throws Exception {
    runTest("bucket_mapjoin_mismatch1", "bucket_mapjoin_mismatch1.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/bucket_mapjoin_mismatch1.q"));
  }

  public void testNegativeCliDriver_bucket_mapjoin_wrong_table_metadata_1() throws Exception {
    runTest("bucket_mapjoin_wrong_table_metadata_1", "bucket_mapjoin_wrong_table_metadata_1.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/bucket_mapjoin_wrong_table_metadata_1.q"));
  }

  public void testNegativeCliDriver_bucket_mapjoin_wrong_table_metadata_2() throws Exception {
    runTest("bucket_mapjoin_wrong_table_metadata_2", "bucket_mapjoin_wrong_table_metadata_2.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/bucket_mapjoin_wrong_table_metadata_2.q"));
  }

  public void testNegativeCliDriver_cachingprintstream() throws Exception {
    runTest("cachingprintstream", "cachingprintstream.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/cachingprintstream.q"));
  }

  public void testNegativeCliDriver_clusterbydistributeby() throws Exception {
    runTest("clusterbydistributeby", "clusterbydistributeby.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/clusterbydistributeby.q"));
  }

  public void testNegativeCliDriver_clusterbyorderby() throws Exception {
    runTest("clusterbyorderby", "clusterbyorderby.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/clusterbyorderby.q"));
  }

  public void testNegativeCliDriver_clusterbysortby() throws Exception {
    runTest("clusterbysortby", "clusterbysortby.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/clusterbysortby.q"));
  }

  public void testNegativeCliDriver_clustern2() throws Exception {
    runTest("clustern2", "clustern2.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/clustern2.q"));
  }

  public void testNegativeCliDriver_clustern3() throws Exception {
    runTest("clustern3", "clustern3.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/clustern3.q"));
  }

  public void testNegativeCliDriver_clustern4() throws Exception {
    runTest("clustern4", "clustern4.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/clustern4.q"));
  }

  public void testNegativeCliDriver_column_change_skewedcol_type1() throws Exception {
    runTest("column_change_skewedcol_type1", "column_change_skewedcol_type1.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/column_change_skewedcol_type1.q"));
  }

  public void testNegativeCliDriver_column_rename1() throws Exception {
    runTest("column_rename1", "column_rename1.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/column_rename1.q"));
  }

  public void testNegativeCliDriver_column_rename2() throws Exception {
    runTest("column_rename2", "column_rename2.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/column_rename2.q"));
  }

  public void testNegativeCliDriver_column_rename3() throws Exception {
    runTest("column_rename3", "column_rename3.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/column_rename3.q"));
  }

  public void testNegativeCliDriver_column_rename4() throws Exception {
    runTest("column_rename4", "column_rename4.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/column_rename4.q"));
  }

  public void testNegativeCliDriver_column_rename5() throws Exception {
    runTest("column_rename5", "column_rename5.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/column_rename5.q"));
  }

  public void testNegativeCliDriver_columnstats_partlvl_dp() throws Exception {
    runTest("columnstats_partlvl_dp", "columnstats_partlvl_dp.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/columnstats_partlvl_dp.q"));
  }

  public void testNegativeCliDriver_columnstats_partlvl_incorrect_num_keys() throws Exception {
    runTest("columnstats_partlvl_incorrect_num_keys", "columnstats_partlvl_incorrect_num_keys.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/columnstats_partlvl_incorrect_num_keys.q"));
  }

  public void testNegativeCliDriver_columnstats_partlvl_invalid_values() throws Exception {
    runTest("columnstats_partlvl_invalid_values", "columnstats_partlvl_invalid_values.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/columnstats_partlvl_invalid_values.q"));
  }

  public void testNegativeCliDriver_columnstats_partlvl_multiple_part_clause() throws Exception {
    runTest("columnstats_partlvl_multiple_part_clause", "columnstats_partlvl_multiple_part_clause.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/columnstats_partlvl_multiple_part_clause.q"));
  }

  public void testNegativeCliDriver_columnstats_tbllvl() throws Exception {
    runTest("columnstats_tbllvl", "columnstats_tbllvl.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/columnstats_tbllvl.q"));
  }

  public void testNegativeCliDriver_columnstats_tbllvl_complex_type() throws Exception {
    runTest("columnstats_tbllvl_complex_type", "columnstats_tbllvl_complex_type.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/columnstats_tbllvl_complex_type.q"));
  }

  public void testNegativeCliDriver_columnstats_tbllvl_incorrect_column() throws Exception {
    runTest("columnstats_tbllvl_incorrect_column", "columnstats_tbllvl_incorrect_column.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/columnstats_tbllvl_incorrect_column.q"));
  }

  public void testNegativeCliDriver_compare_double_bigint() throws Exception {
    runTest("compare_double_bigint", "compare_double_bigint.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/compare_double_bigint.q"));
  }

  public void testNegativeCliDriver_compare_string_bigint() throws Exception {
    runTest("compare_string_bigint", "compare_string_bigint.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/compare_string_bigint.q"));
  }

  public void testNegativeCliDriver_compile_processor() throws Exception {
    runTest("compile_processor", "compile_processor.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/compile_processor.q"));
  }

  public void testNegativeCliDriver_compute_stats_long() throws Exception {
    runTest("compute_stats_long", "compute_stats_long.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/compute_stats_long.q"));
  }

  public void testNegativeCliDriver_create_function_nonexistent_class() throws Exception {
    runTest("create_function_nonexistent_class", "create_function_nonexistent_class.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/create_function_nonexistent_class.q"));
  }

  public void testNegativeCliDriver_create_function_nonexistent_db() throws Exception {
    runTest("create_function_nonexistent_db", "create_function_nonexistent_db.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/create_function_nonexistent_db.q"));
  }

  public void testNegativeCliDriver_create_function_nonudf_class() throws Exception {
    runTest("create_function_nonudf_class", "create_function_nonudf_class.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/create_function_nonudf_class.q"));
  }

  public void testNegativeCliDriver_create_insert_outputformat() throws Exception {
    runTest("create_insert_outputformat", "create_insert_outputformat.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/create_insert_outputformat.q"));
  }

  public void testNegativeCliDriver_create_or_replace_view1() throws Exception {
    runTest("create_or_replace_view1", "create_or_replace_view1.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/create_or_replace_view1.q"));
  }

  public void testNegativeCliDriver_create_or_replace_view2() throws Exception {
    runTest("create_or_replace_view2", "create_or_replace_view2.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/create_or_replace_view2.q"));
  }

  public void testNegativeCliDriver_create_or_replace_view3() throws Exception {
    runTest("create_or_replace_view3", "create_or_replace_view3.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/create_or_replace_view3.q"));
  }

  public void testNegativeCliDriver_create_or_replace_view4() throws Exception {
    runTest("create_or_replace_view4", "create_or_replace_view4.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/create_or_replace_view4.q"));
  }

  public void testNegativeCliDriver_create_or_replace_view5() throws Exception {
    runTest("create_or_replace_view5", "create_or_replace_view5.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/create_or_replace_view5.q"));
  }

  public void testNegativeCliDriver_create_or_replace_view6() throws Exception {
    runTest("create_or_replace_view6", "create_or_replace_view6.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/create_or_replace_view6.q"));
  }

  public void testNegativeCliDriver_create_or_replace_view7() throws Exception {
    runTest("create_or_replace_view7", "create_or_replace_view7.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/create_or_replace_view7.q"));
  }

  public void testNegativeCliDriver_create_or_replace_view8() throws Exception {
    runTest("create_or_replace_view8", "create_or_replace_view8.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/create_or_replace_view8.q"));
  }

  public void testNegativeCliDriver_create_skewed_table_col_name_value_no_mismatch() throws Exception {
    runTest("create_skewed_table_col_name_value_no_mismatch", "create_skewed_table_col_name_value_no_mismatch.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/create_skewed_table_col_name_value_no_mismatch.q"));
  }

  public void testNegativeCliDriver_create_skewed_table_dup_col_name() throws Exception {
    runTest("create_skewed_table_dup_col_name", "create_skewed_table_dup_col_name.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/create_skewed_table_dup_col_name.q"));
  }

  public void testNegativeCliDriver_create_skewed_table_failure_invalid_col_name() throws Exception {
    runTest("create_skewed_table_failure_invalid_col_name", "create_skewed_table_failure_invalid_col_name.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/create_skewed_table_failure_invalid_col_name.q"));
  }

  public void testNegativeCliDriver_create_table_failure1() throws Exception {
    runTest("create_table_failure1", "create_table_failure1.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/create_table_failure1.q"));
  }

  public void testNegativeCliDriver_create_table_failure2() throws Exception {
    runTest("create_table_failure2", "create_table_failure2.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/create_table_failure2.q"));
  }

  public void testNegativeCliDriver_create_table_failure3() throws Exception {
    runTest("create_table_failure3", "create_table_failure3.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/create_table_failure3.q"));
  }

  public void testNegativeCliDriver_create_table_failure4() throws Exception {
    runTest("create_table_failure4", "create_table_failure4.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/create_table_failure4.q"));
  }

  public void testNegativeCliDriver_create_table_wrong_regex() throws Exception {
    runTest("create_table_wrong_regex", "create_table_wrong_regex.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/create_table_wrong_regex.q"));
  }

  public void testNegativeCliDriver_create_udaf_failure() throws Exception {
    runTest("create_udaf_failure", "create_udaf_failure.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/create_udaf_failure.q"));
  }

  public void testNegativeCliDriver_create_unknown_genericudf() throws Exception {
    runTest("create_unknown_genericudf", "create_unknown_genericudf.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/create_unknown_genericudf.q"));
  }

  public void testNegativeCliDriver_create_unknown_udf_udaf() throws Exception {
    runTest("create_unknown_udf_udaf", "create_unknown_udf_udaf.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/create_unknown_udf_udaf.q"));
  }

  public void testNegativeCliDriver_create_view_failure1() throws Exception {
    runTest("create_view_failure1", "create_view_failure1.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/create_view_failure1.q"));
  }

  public void testNegativeCliDriver_create_view_failure2() throws Exception {
    runTest("create_view_failure2", "create_view_failure2.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/create_view_failure2.q"));
  }

  public void testNegativeCliDriver_create_view_failure3() throws Exception {
    runTest("create_view_failure3", "create_view_failure3.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/create_view_failure3.q"));
  }

  public void testNegativeCliDriver_create_view_failure4() throws Exception {
    runTest("create_view_failure4", "create_view_failure4.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/create_view_failure4.q"));
  }

  public void testNegativeCliDriver_create_view_failure5() throws Exception {
    runTest("create_view_failure5", "create_view_failure5.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/create_view_failure5.q"));
  }

  public void testNegativeCliDriver_create_view_failure6() throws Exception {
    runTest("create_view_failure6", "create_view_failure6.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/create_view_failure6.q"));
  }

  public void testNegativeCliDriver_create_view_failure7() throws Exception {
    runTest("create_view_failure7", "create_view_failure7.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/create_view_failure7.q"));
  }

  public void testNegativeCliDriver_create_view_failure8() throws Exception {
    runTest("create_view_failure8", "create_view_failure8.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/create_view_failure8.q"));
  }

  public void testNegativeCliDriver_create_view_failure9() throws Exception {
    runTest("create_view_failure9", "create_view_failure9.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/create_view_failure9.q"));
  }

  public void testNegativeCliDriver_ctas() throws Exception {
    runTest("ctas", "ctas.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/ctas.q"));
  }

  public void testNegativeCliDriver_cte_recursion() throws Exception {
    runTest("cte_recursion", "cte_recursion.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/cte_recursion.q"));
  }

  public void testNegativeCliDriver_cte_with_in_subquery() throws Exception {
    runTest("cte_with_in_subquery", "cte_with_in_subquery.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/cte_with_in_subquery.q"));
  }

  public void testNegativeCliDriver_database_create_already_exists() throws Exception {
    runTest("database_create_already_exists", "database_create_already_exists.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/database_create_already_exists.q"));
  }

  public void testNegativeCliDriver_database_create_invalid_name() throws Exception {
    runTest("database_create_invalid_name", "database_create_invalid_name.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/database_create_invalid_name.q"));
  }

  public void testNegativeCliDriver_database_drop_does_not_exist() throws Exception {
    runTest("database_drop_does_not_exist", "database_drop_does_not_exist.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/database_drop_does_not_exist.q"));
  }

  public void testNegativeCliDriver_database_drop_not_empty() throws Exception {
    runTest("database_drop_not_empty", "database_drop_not_empty.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/database_drop_not_empty.q"));
  }

  public void testNegativeCliDriver_database_drop_not_empty_restrict() throws Exception {
    runTest("database_drop_not_empty_restrict", "database_drop_not_empty_restrict.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/database_drop_not_empty_restrict.q"));
  }

  public void testNegativeCliDriver_database_switch_does_not_exist() throws Exception {
    runTest("database_switch_does_not_exist", "database_switch_does_not_exist.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/database_switch_does_not_exist.q"));
  }

  public void testNegativeCliDriver_date_literal2() throws Exception {
    runTest("date_literal2", "date_literal2.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/date_literal2.q"));
  }

  public void testNegativeCliDriver_date_literal3() throws Exception {
    runTest("date_literal3", "date_literal3.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/date_literal3.q"));
  }

  public void testNegativeCliDriver_dbtxnmgr_nodblock() throws Exception {
    runTest("dbtxnmgr_nodblock", "dbtxnmgr_nodblock.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/dbtxnmgr_nodblock.q"));
  }

  public void testNegativeCliDriver_dbtxnmgr_nodbunlock() throws Exception {
    runTest("dbtxnmgr_nodbunlock", "dbtxnmgr_nodbunlock.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/dbtxnmgr_nodbunlock.q"));
  }

  public void testNegativeCliDriver_dbtxnmgr_notablelock() throws Exception {
    runTest("dbtxnmgr_notablelock", "dbtxnmgr_notablelock.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/dbtxnmgr_notablelock.q"));
  }

  public void testNegativeCliDriver_dbtxnmgr_notableunlock() throws Exception {
    runTest("dbtxnmgr_notableunlock", "dbtxnmgr_notableunlock.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/dbtxnmgr_notableunlock.q"));
  }

  public void testNegativeCliDriver_ddltime() throws Exception {
    runTest("ddltime", "ddltime.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/ddltime.q"));
  }

  public void testNegativeCliDriver_decimal_precision() throws Exception {
    runTest("decimal_precision", "decimal_precision.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/decimal_precision.q"));
  }

  public void testNegativeCliDriver_decimal_precision_1() throws Exception {
    runTest("decimal_precision_1", "decimal_precision_1.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/decimal_precision_1.q"));
  }

  public void testNegativeCliDriver_default_partition_name() throws Exception {
    runTest("default_partition_name", "default_partition_name.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/default_partition_name.q"));
  }

  public void testNegativeCliDriver_deletejar() throws Exception {
    runTest("deletejar", "deletejar.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/deletejar.q"));
  }

  public void testNegativeCliDriver_desc_failure1() throws Exception {
    runTest("desc_failure1", "desc_failure1.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/desc_failure1.q"));
  }

  public void testNegativeCliDriver_desc_failure2() throws Exception {
    runTest("desc_failure2", "desc_failure2.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/desc_failure2.q"));
  }

  public void testNegativeCliDriver_desc_failure3() throws Exception {
    runTest("desc_failure3", "desc_failure3.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/desc_failure3.q"));
  }

  public void testNegativeCliDriver_describe_xpath1() throws Exception {
    runTest("describe_xpath1", "describe_xpath1.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/describe_xpath1.q"));
  }

  public void testNegativeCliDriver_describe_xpath2() throws Exception {
    runTest("describe_xpath2", "describe_xpath2.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/describe_xpath2.q"));
  }

  public void testNegativeCliDriver_describe_xpath3() throws Exception {
    runTest("describe_xpath3", "describe_xpath3.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/describe_xpath3.q"));
  }

  public void testNegativeCliDriver_describe_xpath4() throws Exception {
    runTest("describe_xpath4", "describe_xpath4.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/describe_xpath4.q"));
  }

  public void testNegativeCliDriver_disallow_incompatible_type_change_on1() throws Exception {
    runTest("disallow_incompatible_type_change_on1", "disallow_incompatible_type_change_on1.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/disallow_incompatible_type_change_on1.q"));
  }

  public void testNegativeCliDriver_disallow_incompatible_type_change_on2() throws Exception {
    runTest("disallow_incompatible_type_change_on2", "disallow_incompatible_type_change_on2.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/disallow_incompatible_type_change_on2.q"));
  }

  public void testNegativeCliDriver_drop_func_nonexistent() throws Exception {
    runTest("drop_func_nonexistent", "drop_func_nonexistent.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/drop_func_nonexistent.q"));
  }

  public void testNegativeCliDriver_drop_function_failure() throws Exception {
    runTest("drop_function_failure", "drop_function_failure.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/drop_function_failure.q"));
  }

  public void testNegativeCliDriver_drop_index_failure() throws Exception {
    runTest("drop_index_failure", "drop_index_failure.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/drop_index_failure.q"));
  }

  public void testNegativeCliDriver_drop_native_udf() throws Exception {
    runTest("drop_native_udf", "drop_native_udf.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/drop_native_udf.q"));
  }

  public void testNegativeCliDriver_drop_partition_failure() throws Exception {
    runTest("drop_partition_failure", "drop_partition_failure.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/drop_partition_failure.q"));
  }

  public void testNegativeCliDriver_drop_partition_filter_failure() throws Exception {
    runTest("drop_partition_filter_failure", "drop_partition_filter_failure.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/drop_partition_filter_failure.q"));
  }

  public void testNegativeCliDriver_drop_table_failure1() throws Exception {
    runTest("drop_table_failure1", "drop_table_failure1.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/drop_table_failure1.q"));
  }

  public void testNegativeCliDriver_drop_table_failure2() throws Exception {
    runTest("drop_table_failure2", "drop_table_failure2.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/drop_table_failure2.q"));
  }

  public void testNegativeCliDriver_drop_table_failure3() throws Exception {
    runTest("drop_table_failure3", "drop_table_failure3.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/drop_table_failure3.q"));
  }

  public void testNegativeCliDriver_drop_view_failure1() throws Exception {
    runTest("drop_view_failure1", "drop_view_failure1.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/drop_view_failure1.q"));
  }

  public void testNegativeCliDriver_drop_view_failure2() throws Exception {
    runTest("drop_view_failure2", "drop_view_failure2.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/drop_view_failure2.q"));
  }

  public void testNegativeCliDriver_duplicate_alias_in_transform() throws Exception {
    runTest("duplicate_alias_in_transform", "duplicate_alias_in_transform.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/duplicate_alias_in_transform.q"));
  }

  public void testNegativeCliDriver_duplicate_alias_in_transform_schema() throws Exception {
    runTest("duplicate_alias_in_transform_schema", "duplicate_alias_in_transform_schema.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/duplicate_alias_in_transform_schema.q"));
  }

  public void testNegativeCliDriver_duplicate_insert1() throws Exception {
    runTest("duplicate_insert1", "duplicate_insert1.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/duplicate_insert1.q"));
  }

  public void testNegativeCliDriver_duplicate_insert2() throws Exception {
    runTest("duplicate_insert2", "duplicate_insert2.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/duplicate_insert2.q"));
  }

  public void testNegativeCliDriver_duplicate_insert3() throws Exception {
    runTest("duplicate_insert3", "duplicate_insert3.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/duplicate_insert3.q"));
  }

  public void testNegativeCliDriver_dyn_part1() throws Exception {
    runTest("dyn_part1", "dyn_part1.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/dyn_part1.q"));
  }

  public void testNegativeCliDriver_dyn_part2() throws Exception {
    runTest("dyn_part2", "dyn_part2.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/dyn_part2.q"));
  }

  public void testNegativeCliDriver_dyn_part3() throws Exception {
    runTest("dyn_part3", "dyn_part3.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/dyn_part3.q"));
  }

  public void testNegativeCliDriver_dyn_part4() throws Exception {
    runTest("dyn_part4", "dyn_part4.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/dyn_part4.q"));
  }

  public void testNegativeCliDriver_dyn_part_max() throws Exception {
    runTest("dyn_part_max", "dyn_part_max.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/dyn_part_max.q"));
  }

  public void testNegativeCliDriver_dyn_part_max_per_node() throws Exception {
    runTest("dyn_part_max_per_node", "dyn_part_max_per_node.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/dyn_part_max_per_node.q"));
  }

  public void testNegativeCliDriver_dynamic_partitions_with_whitelist() throws Exception {
    runTest("dynamic_partitions_with_whitelist", "dynamic_partitions_with_whitelist.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/dynamic_partitions_with_whitelist.q"));
  }

  public void testNegativeCliDriver_exchange_partition_neg_incomplete_partition() throws Exception {
    runTest("exchange_partition_neg_incomplete_partition", "exchange_partition_neg_incomplete_partition.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/exchange_partition_neg_incomplete_partition.q"));
  }

  public void testNegativeCliDriver_exchange_partition_neg_partition_exists() throws Exception {
    runTest("exchange_partition_neg_partition_exists", "exchange_partition_neg_partition_exists.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/exchange_partition_neg_partition_exists.q"));
  }

  public void testNegativeCliDriver_exchange_partition_neg_partition_exists2() throws Exception {
    runTest("exchange_partition_neg_partition_exists2", "exchange_partition_neg_partition_exists2.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/exchange_partition_neg_partition_exists2.q"));
  }

  public void testNegativeCliDriver_exchange_partition_neg_partition_exists3() throws Exception {
    runTest("exchange_partition_neg_partition_exists3", "exchange_partition_neg_partition_exists3.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/exchange_partition_neg_partition_exists3.q"));
  }

  public void testNegativeCliDriver_exchange_partition_neg_partition_missing() throws Exception {
    runTest("exchange_partition_neg_partition_missing", "exchange_partition_neg_partition_missing.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/exchange_partition_neg_partition_missing.q"));
  }

  public void testNegativeCliDriver_exchange_partition_neg_table_missing() throws Exception {
    runTest("exchange_partition_neg_table_missing", "exchange_partition_neg_table_missing.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/exchange_partition_neg_table_missing.q"));
  }

  public void testNegativeCliDriver_exchange_partition_neg_table_missing2() throws Exception {
    runTest("exchange_partition_neg_table_missing2", "exchange_partition_neg_table_missing2.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/exchange_partition_neg_table_missing2.q"));
  }

  public void testNegativeCliDriver_exchange_partition_neg_test() throws Exception {
    runTest("exchange_partition_neg_test", "exchange_partition_neg_test.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/exchange_partition_neg_test.q"));
  }

  public void testNegativeCliDriver_exim_00_unsupported_schema() throws Exception {
    runTest("exim_00_unsupported_schema", "exim_00_unsupported_schema.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/exim_00_unsupported_schema.q"));
  }

  public void testNegativeCliDriver_exim_01_nonpart_over_loaded() throws Exception {
    runTest("exim_01_nonpart_over_loaded", "exim_01_nonpart_over_loaded.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/exim_01_nonpart_over_loaded.q"));
  }

  public void testNegativeCliDriver_exim_02_all_part_over_overlap() throws Exception {
    runTest("exim_02_all_part_over_overlap", "exim_02_all_part_over_overlap.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/exim_02_all_part_over_overlap.q"));
  }

  public void testNegativeCliDriver_exim_03_nonpart_noncompat_colschema() throws Exception {
    runTest("exim_03_nonpart_noncompat_colschema", "exim_03_nonpart_noncompat_colschema.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/exim_03_nonpart_noncompat_colschema.q"));
  }

  public void testNegativeCliDriver_exim_04_nonpart_noncompat_colnumber() throws Exception {
    runTest("exim_04_nonpart_noncompat_colnumber", "exim_04_nonpart_noncompat_colnumber.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/exim_04_nonpart_noncompat_colnumber.q"));
  }

  public void testNegativeCliDriver_exim_05_nonpart_noncompat_coltype() throws Exception {
    runTest("exim_05_nonpart_noncompat_coltype", "exim_05_nonpart_noncompat_coltype.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/exim_05_nonpart_noncompat_coltype.q"));
  }

  public void testNegativeCliDriver_exim_06_nonpart_noncompat_storage() throws Exception {
    runTest("exim_06_nonpart_noncompat_storage", "exim_06_nonpart_noncompat_storage.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/exim_06_nonpart_noncompat_storage.q"));
  }

  public void testNegativeCliDriver_exim_07_nonpart_noncompat_ifof() throws Exception {
    runTest("exim_07_nonpart_noncompat_ifof", "exim_07_nonpart_noncompat_ifof.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/exim_07_nonpart_noncompat_ifof.q"));
  }

  public void testNegativeCliDriver_exim_08_nonpart_noncompat_serde() throws Exception {
    runTest("exim_08_nonpart_noncompat_serde", "exim_08_nonpart_noncompat_serde.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/exim_08_nonpart_noncompat_serde.q"));
  }

  public void testNegativeCliDriver_exim_09_nonpart_noncompat_serdeparam() throws Exception {
    runTest("exim_09_nonpart_noncompat_serdeparam", "exim_09_nonpart_noncompat_serdeparam.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/exim_09_nonpart_noncompat_serdeparam.q"));
  }

  public void testNegativeCliDriver_exim_10_nonpart_noncompat_bucketing() throws Exception {
    runTest("exim_10_nonpart_noncompat_bucketing", "exim_10_nonpart_noncompat_bucketing.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/exim_10_nonpart_noncompat_bucketing.q"));
  }

  public void testNegativeCliDriver_exim_11_nonpart_noncompat_sorting() throws Exception {
    runTest("exim_11_nonpart_noncompat_sorting", "exim_11_nonpart_noncompat_sorting.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/exim_11_nonpart_noncompat_sorting.q"));
  }

  public void testNegativeCliDriver_exim_12_nonnative_export() throws Exception {
    runTest("exim_12_nonnative_export", "exim_12_nonnative_export.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/exim_12_nonnative_export.q"));
  }

  public void testNegativeCliDriver_exim_13_nonnative_import() throws Exception {
    runTest("exim_13_nonnative_import", "exim_13_nonnative_import.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/exim_13_nonnative_import.q"));
  }

  public void testNegativeCliDriver_exim_14_nonpart_part() throws Exception {
    runTest("exim_14_nonpart_part", "exim_14_nonpart_part.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/exim_14_nonpart_part.q"));
  }

  public void testNegativeCliDriver_exim_15_part_nonpart() throws Exception {
    runTest("exim_15_part_nonpart", "exim_15_part_nonpart.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/exim_15_part_nonpart.q"));
  }

  public void testNegativeCliDriver_exim_16_part_noncompat_schema() throws Exception {
    runTest("exim_16_part_noncompat_schema", "exim_16_part_noncompat_schema.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/exim_16_part_noncompat_schema.q"));
  }

  public void testNegativeCliDriver_exim_17_part_spec_underspec() throws Exception {
    runTest("exim_17_part_spec_underspec", "exim_17_part_spec_underspec.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/exim_17_part_spec_underspec.q"));
  }

  public void testNegativeCliDriver_exim_18_part_spec_missing() throws Exception {
    runTest("exim_18_part_spec_missing", "exim_18_part_spec_missing.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/exim_18_part_spec_missing.q"));
  }

  public void testNegativeCliDriver_exim_19_external_over_existing() throws Exception {
    runTest("exim_19_external_over_existing", "exim_19_external_over_existing.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/exim_19_external_over_existing.q"));
  }

  public void testNegativeCliDriver_exim_20_managed_location_over_existing() throws Exception {
    runTest("exim_20_managed_location_over_existing", "exim_20_managed_location_over_existing.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/exim_20_managed_location_over_existing.q"));
  }

  public void testNegativeCliDriver_exim_21_part_managed_external() throws Exception {
    runTest("exim_21_part_managed_external", "exim_21_part_managed_external.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/exim_21_part_managed_external.q"));
  }

  public void testNegativeCliDriver_exim_22_export_authfail() throws Exception {
    runTest("exim_22_export_authfail", "exim_22_export_authfail.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/exim_22_export_authfail.q"));
  }

  public void testNegativeCliDriver_exim_23_import_exist_authfail() throws Exception {
    runTest("exim_23_import_exist_authfail", "exim_23_import_exist_authfail.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/exim_23_import_exist_authfail.q"));
  }

  public void testNegativeCliDriver_exim_24_import_part_authfail() throws Exception {
    runTest("exim_24_import_part_authfail", "exim_24_import_part_authfail.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/exim_24_import_part_authfail.q"));
  }

  public void testNegativeCliDriver_exim_25_import_nonexist_authfail() throws Exception {
    runTest("exim_25_import_nonexist_authfail", "exim_25_import_nonexist_authfail.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/exim_25_import_nonexist_authfail.q"));
  }

  public void testNegativeCliDriver_external1() throws Exception {
    runTest("external1", "external1.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/external1.q"));
  }

  public void testNegativeCliDriver_external2() throws Exception {
    runTest("external2", "external2.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/external2.q"));
  }

  public void testNegativeCliDriver_fetchtask_ioexception() throws Exception {
    runTest("fetchtask_ioexception", "fetchtask_ioexception.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/fetchtask_ioexception.q"));
  }

  public void testNegativeCliDriver_fileformat_bad_class() throws Exception {
    runTest("fileformat_bad_class", "fileformat_bad_class.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/fileformat_bad_class.q"));
  }

  public void testNegativeCliDriver_fileformat_void_input() throws Exception {
    runTest("fileformat_void_input", "fileformat_void_input.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/fileformat_void_input.q"));
  }

  public void testNegativeCliDriver_fileformat_void_output() throws Exception {
    runTest("fileformat_void_output", "fileformat_void_output.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/fileformat_void_output.q"));
  }

  public void testNegativeCliDriver_fs_default_name1() throws Exception {
    runTest("fs_default_name1", "fs_default_name1.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/fs_default_name1.q"));
  }

  public void testNegativeCliDriver_fs_default_name2() throws Exception {
    runTest("fs_default_name2", "fs_default_name2.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/fs_default_name2.q"));
  }

  public void testNegativeCliDriver_genericFileFormat() throws Exception {
    runTest("genericFileFormat", "genericFileFormat.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/genericFileFormat.q"));
  }

  public void testNegativeCliDriver_groupby2_map_skew_multi_distinct() throws Exception {
    runTest("groupby2_map_skew_multi_distinct", "groupby2_map_skew_multi_distinct.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/groupby2_map_skew_multi_distinct.q"));
  }

  public void testNegativeCliDriver_groupby2_multi_distinct() throws Exception {
    runTest("groupby2_multi_distinct", "groupby2_multi_distinct.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/groupby2_multi_distinct.q"));
  }

  public void testNegativeCliDriver_groupby3_map_skew_multi_distinct() throws Exception {
    runTest("groupby3_map_skew_multi_distinct", "groupby3_map_skew_multi_distinct.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/groupby3_map_skew_multi_distinct.q"));
  }

  public void testNegativeCliDriver_groupby3_multi_distinct() throws Exception {
    runTest("groupby3_multi_distinct", "groupby3_multi_distinct.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/groupby3_multi_distinct.q"));
  }

  public void testNegativeCliDriver_groupby_cube1() throws Exception {
    runTest("groupby_cube1", "groupby_cube1.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/groupby_cube1.q"));
  }

  public void testNegativeCliDriver_groupby_cube2() throws Exception {
    runTest("groupby_cube2", "groupby_cube2.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/groupby_cube2.q"));
  }

  public void testNegativeCliDriver_groupby_grouping_id1() throws Exception {
    runTest("groupby_grouping_id1", "groupby_grouping_id1.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/groupby_grouping_id1.q"));
  }

  public void testNegativeCliDriver_groupby_grouping_sets1() throws Exception {
    runTest("groupby_grouping_sets1", "groupby_grouping_sets1.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/groupby_grouping_sets1.q"));
  }

  public void testNegativeCliDriver_groupby_grouping_sets2() throws Exception {
    runTest("groupby_grouping_sets2", "groupby_grouping_sets2.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/groupby_grouping_sets2.q"));
  }

  public void testNegativeCliDriver_groupby_grouping_sets3() throws Exception {
    runTest("groupby_grouping_sets3", "groupby_grouping_sets3.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/groupby_grouping_sets3.q"));
  }

  public void testNegativeCliDriver_groupby_grouping_sets4() throws Exception {
    runTest("groupby_grouping_sets4", "groupby_grouping_sets4.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/groupby_grouping_sets4.q"));
  }

  public void testNegativeCliDriver_groupby_grouping_sets5() throws Exception {
    runTest("groupby_grouping_sets5", "groupby_grouping_sets5.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/groupby_grouping_sets5.q"));
  }

  public void testNegativeCliDriver_groupby_grouping_sets6() throws Exception {
    runTest("groupby_grouping_sets6", "groupby_grouping_sets6.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/groupby_grouping_sets6.q"));
  }

  public void testNegativeCliDriver_groupby_grouping_sets7() throws Exception {
    runTest("groupby_grouping_sets7", "groupby_grouping_sets7.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/groupby_grouping_sets7.q"));
  }

  public void testNegativeCliDriver_groupby_invalid_position() throws Exception {
    runTest("groupby_invalid_position", "groupby_invalid_position.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/groupby_invalid_position.q"));
  }

  public void testNegativeCliDriver_groupby_key() throws Exception {
    runTest("groupby_key", "groupby_key.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/groupby_key.q"));
  }

  public void testNegativeCliDriver_groupby_rollup1() throws Exception {
    runTest("groupby_rollup1", "groupby_rollup1.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/groupby_rollup1.q"));
  }

  public void testNegativeCliDriver_groupby_rollup2() throws Exception {
    runTest("groupby_rollup2", "groupby_rollup2.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/groupby_rollup2.q"));
  }

  public void testNegativeCliDriver_having1() throws Exception {
    runTest("having1", "having1.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/having1.q"));
  }

  public void testNegativeCliDriver_illegal_partition_type() throws Exception {
    runTest("illegal_partition_type", "illegal_partition_type.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/illegal_partition_type.q"));
  }

  public void testNegativeCliDriver_illegal_partition_type2() throws Exception {
    runTest("illegal_partition_type2", "illegal_partition_type2.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/illegal_partition_type2.q"));
  }

  public void testNegativeCliDriver_illegal_partition_type3() throws Exception {
    runTest("illegal_partition_type3", "illegal_partition_type3.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/illegal_partition_type3.q"));
  }

  public void testNegativeCliDriver_illegal_partition_type4() throws Exception {
    runTest("illegal_partition_type4", "illegal_partition_type4.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/illegal_partition_type4.q"));
  }

  public void testNegativeCliDriver_index_bitmap_no_map_aggr() throws Exception {
    runTest("index_bitmap_no_map_aggr", "index_bitmap_no_map_aggr.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/index_bitmap_no_map_aggr.q"));
  }

  public void testNegativeCliDriver_index_compact_entry_limit() throws Exception {
    runTest("index_compact_entry_limit", "index_compact_entry_limit.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/index_compact_entry_limit.q"));
  }

  public void testNegativeCliDriver_index_compact_size_limit() throws Exception {
    runTest("index_compact_size_limit", "index_compact_size_limit.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/index_compact_size_limit.q"));
  }

  public void testNegativeCliDriver_input1() throws Exception {
    runTest("input1", "input1.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/input1.q"));
  }

  public void testNegativeCliDriver_input2() throws Exception {
    runTest("input2", "input2.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/input2.q"));
  }

  public void testNegativeCliDriver_input4() throws Exception {
    runTest("input4", "input4.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/input4.q"));
  }

  public void testNegativeCliDriver_input41() throws Exception {
    runTest("input41", "input41.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/input41.q"));
  }

  public void testNegativeCliDriver_input_part0_neg() throws Exception {
    runTest("input_part0_neg", "input_part0_neg.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/input_part0_neg.q"));
  }

  public void testNegativeCliDriver_insert_into1() throws Exception {
    runTest("insert_into1", "insert_into1.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/insert_into1.q"));
  }

  public void testNegativeCliDriver_insert_into2() throws Exception {
    runTest("insert_into2", "insert_into2.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/insert_into2.q"));
  }

  public void testNegativeCliDriver_insert_into3() throws Exception {
    runTest("insert_into3", "insert_into3.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/insert_into3.q"));
  }

  public void testNegativeCliDriver_insert_into4() throws Exception {
    runTest("insert_into4", "insert_into4.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/insert_into4.q"));
  }

  public void testNegativeCliDriver_insert_into5() throws Exception {
    runTest("insert_into5", "insert_into5.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/insert_into5.q"));
  }

  public void testNegativeCliDriver_insert_into6() throws Exception {
    runTest("insert_into6", "insert_into6.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/insert_into6.q"));
  }

  public void testNegativeCliDriver_insert_view_failure() throws Exception {
    runTest("insert_view_failure", "insert_view_failure.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/insert_view_failure.q"));
  }

  public void testNegativeCliDriver_insertexternal1() throws Exception {
    runTest("insertexternal1", "insertexternal1.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/insertexternal1.q"));
  }

  public void testNegativeCliDriver_insertover_dynapart_ifnotexists() throws Exception {
    runTest("insertover_dynapart_ifnotexists", "insertover_dynapart_ifnotexists.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/insertover_dynapart_ifnotexists.q"));
  }

  public void testNegativeCliDriver_invalid_arithmetic_type() throws Exception {
    runTest("invalid_arithmetic_type", "invalid_arithmetic_type.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/invalid_arithmetic_type.q"));
  }

  public void testNegativeCliDriver_invalid_avg_syntax() throws Exception {
    runTest("invalid_avg_syntax", "invalid_avg_syntax.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/invalid_avg_syntax.q"));
  }

  public void testNegativeCliDriver_invalid_cast_from_binary_1() throws Exception {
    runTest("invalid_cast_from_binary_1", "invalid_cast_from_binary_1.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/invalid_cast_from_binary_1.q"));
  }

  public void testNegativeCliDriver_invalid_cast_from_binary_2() throws Exception {
    runTest("invalid_cast_from_binary_2", "invalid_cast_from_binary_2.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/invalid_cast_from_binary_2.q"));
  }

  public void testNegativeCliDriver_invalid_cast_from_binary_3() throws Exception {
    runTest("invalid_cast_from_binary_3", "invalid_cast_from_binary_3.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/invalid_cast_from_binary_3.q"));
  }

  public void testNegativeCliDriver_invalid_cast_from_binary_4() throws Exception {
    runTest("invalid_cast_from_binary_4", "invalid_cast_from_binary_4.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/invalid_cast_from_binary_4.q"));
  }

  public void testNegativeCliDriver_invalid_cast_from_binary_5() throws Exception {
    runTest("invalid_cast_from_binary_5", "invalid_cast_from_binary_5.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/invalid_cast_from_binary_5.q"));
  }

  public void testNegativeCliDriver_invalid_cast_from_binary_6() throws Exception {
    runTest("invalid_cast_from_binary_6", "invalid_cast_from_binary_6.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/invalid_cast_from_binary_6.q"));
  }

  public void testNegativeCliDriver_invalid_cast_to_binary_1() throws Exception {
    runTest("invalid_cast_to_binary_1", "invalid_cast_to_binary_1.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/invalid_cast_to_binary_1.q"));
  }

  public void testNegativeCliDriver_invalid_cast_to_binary_2() throws Exception {
    runTest("invalid_cast_to_binary_2", "invalid_cast_to_binary_2.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/invalid_cast_to_binary_2.q"));
  }

  public void testNegativeCliDriver_invalid_cast_to_binary_3() throws Exception {
    runTest("invalid_cast_to_binary_3", "invalid_cast_to_binary_3.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/invalid_cast_to_binary_3.q"));
  }

  public void testNegativeCliDriver_invalid_cast_to_binary_4() throws Exception {
    runTest("invalid_cast_to_binary_4", "invalid_cast_to_binary_4.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/invalid_cast_to_binary_4.q"));
  }

  public void testNegativeCliDriver_invalid_cast_to_binary_5() throws Exception {
    runTest("invalid_cast_to_binary_5", "invalid_cast_to_binary_5.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/invalid_cast_to_binary_5.q"));
  }

  public void testNegativeCliDriver_invalid_cast_to_binary_6() throws Exception {
    runTest("invalid_cast_to_binary_6", "invalid_cast_to_binary_6.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/invalid_cast_to_binary_6.q"));
  }

  public void testNegativeCliDriver_invalid_char_length_1() throws Exception {
    runTest("invalid_char_length_1", "invalid_char_length_1.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/invalid_char_length_1.q"));
  }

  public void testNegativeCliDriver_invalid_char_length_2() throws Exception {
    runTest("invalid_char_length_2", "invalid_char_length_2.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/invalid_char_length_2.q"));
  }

  public void testNegativeCliDriver_invalid_char_length_3() throws Exception {
    runTest("invalid_char_length_3", "invalid_char_length_3.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/invalid_char_length_3.q"));
  }

  public void testNegativeCliDriver_invalid_config1() throws Exception {
    runTest("invalid_config1", "invalid_config1.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/invalid_config1.q"));
  }

  public void testNegativeCliDriver_invalid_config2() throws Exception {
    runTest("invalid_config2", "invalid_config2.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/invalid_config2.q"));
  }

  public void testNegativeCliDriver_invalid_create_tbl1() throws Exception {
    runTest("invalid_create_tbl1", "invalid_create_tbl1.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/invalid_create_tbl1.q"));
  }

  public void testNegativeCliDriver_invalid_create_tbl2() throws Exception {
    runTest("invalid_create_tbl2", "invalid_create_tbl2.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/invalid_create_tbl2.q"));
  }

  public void testNegativeCliDriver_invalid_mapjoin1() throws Exception {
    runTest("invalid_mapjoin1", "invalid_mapjoin1.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/invalid_mapjoin1.q"));
  }

  public void testNegativeCliDriver_invalid_max_syntax() throws Exception {
    runTest("invalid_max_syntax", "invalid_max_syntax.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/invalid_max_syntax.q"));
  }

  public void testNegativeCliDriver_invalid_min_syntax() throws Exception {
    runTest("invalid_min_syntax", "invalid_min_syntax.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/invalid_min_syntax.q"));
  }

  public void testNegativeCliDriver_invalid_select_column() throws Exception {
    runTest("invalid_select_column", "invalid_select_column.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/invalid_select_column.q"));
  }

  public void testNegativeCliDriver_invalid_select_column_with_subquery() throws Exception {
    runTest("invalid_select_column_with_subquery", "invalid_select_column_with_subquery.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/invalid_select_column_with_subquery.q"));
  }

  public void testNegativeCliDriver_invalid_select_column_with_tablename() throws Exception {
    runTest("invalid_select_column_with_tablename", "invalid_select_column_with_tablename.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/invalid_select_column_with_tablename.q"));
  }

  public void testNegativeCliDriver_invalid_select_expression() throws Exception {
    runTest("invalid_select_expression", "invalid_select_expression.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/invalid_select_expression.q"));
  }

  public void testNegativeCliDriver_invalid_std_syntax() throws Exception {
    runTest("invalid_std_syntax", "invalid_std_syntax.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/invalid_std_syntax.q"));
  }

  public void testNegativeCliDriver_invalid_stddev_samp_syntax() throws Exception {
    runTest("invalid_stddev_samp_syntax", "invalid_stddev_samp_syntax.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/invalid_stddev_samp_syntax.q"));
  }

  public void testNegativeCliDriver_invalid_sum_syntax() throws Exception {
    runTest("invalid_sum_syntax", "invalid_sum_syntax.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/invalid_sum_syntax.q"));
  }

  public void testNegativeCliDriver_invalid_t_alter1() throws Exception {
    runTest("invalid_t_alter1", "invalid_t_alter1.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/invalid_t_alter1.q"));
  }

  public void testNegativeCliDriver_invalid_t_alter2() throws Exception {
    runTest("invalid_t_alter2", "invalid_t_alter2.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/invalid_t_alter2.q"));
  }

  public void testNegativeCliDriver_invalid_t_create2() throws Exception {
    runTest("invalid_t_create2", "invalid_t_create2.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/invalid_t_create2.q"));
  }

  public void testNegativeCliDriver_invalid_t_transform() throws Exception {
    runTest("invalid_t_transform", "invalid_t_transform.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/invalid_t_transform.q"));
  }

  public void testNegativeCliDriver_invalid_tbl_name() throws Exception {
    runTest("invalid_tbl_name", "invalid_tbl_name.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/invalid_tbl_name.q"));
  }

  public void testNegativeCliDriver_invalid_var_samp_syntax() throws Exception {
    runTest("invalid_var_samp_syntax", "invalid_var_samp_syntax.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/invalid_var_samp_syntax.q"));
  }

  public void testNegativeCliDriver_invalid_varchar_length_1() throws Exception {
    runTest("invalid_varchar_length_1", "invalid_varchar_length_1.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/invalid_varchar_length_1.q"));
  }

  public void testNegativeCliDriver_invalid_varchar_length_2() throws Exception {
    runTest("invalid_varchar_length_2", "invalid_varchar_length_2.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/invalid_varchar_length_2.q"));
  }

  public void testNegativeCliDriver_invalid_varchar_length_3() throws Exception {
    runTest("invalid_varchar_length_3", "invalid_varchar_length_3.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/invalid_varchar_length_3.q"));
  }

  public void testNegativeCliDriver_invalid_variance_syntax() throws Exception {
    runTest("invalid_variance_syntax", "invalid_variance_syntax.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/invalid_variance_syntax.q"));
  }

  public void testNegativeCliDriver_invalidate_view1() throws Exception {
    runTest("invalidate_view1", "invalidate_view1.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/invalidate_view1.q"));
  }

  public void testNegativeCliDriver_join2() throws Exception {
    runTest("join2", "join2.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/join2.q"));
  }

  public void testNegativeCliDriver_join28() throws Exception {
    runTest("join28", "join28.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/join28.q"));
  }

  public void testNegativeCliDriver_join29() throws Exception {
    runTest("join29", "join29.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/join29.q"));
  }

  public void testNegativeCliDriver_join32() throws Exception {
    runTest("join32", "join32.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/join32.q"));
  }

  public void testNegativeCliDriver_join35() throws Exception {
    runTest("join35", "join35.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/join35.q"));
  }

  public void testNegativeCliDriver_join_alt_syntax_comma_on() throws Exception {
    runTest("join_alt_syntax_comma_on", "join_alt_syntax_comma_on.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/join_alt_syntax_comma_on.q"));
  }

  public void testNegativeCliDriver_join_cond_unqual_ambiguous() throws Exception {
    runTest("join_cond_unqual_ambiguous", "join_cond_unqual_ambiguous.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/join_cond_unqual_ambiguous.q"));
  }

  public void testNegativeCliDriver_join_cond_unqual_ambiguous_vc() throws Exception {
    runTest("join_cond_unqual_ambiguous_vc", "join_cond_unqual_ambiguous_vc.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/join_cond_unqual_ambiguous_vc.q"));
  }

  public void testNegativeCliDriver_join_nonexistent_part() throws Exception {
    runTest("join_nonexistent_part", "join_nonexistent_part.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/join_nonexistent_part.q"));
  }

  public void testNegativeCliDriver_joinneg() throws Exception {
    runTest("joinneg", "joinneg.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/joinneg.q"));
  }

  public void testNegativeCliDriver_lateral_view_alias() throws Exception {
    runTest("lateral_view_alias", "lateral_view_alias.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/lateral_view_alias.q"));
  }

  public void testNegativeCliDriver_lateral_view_join() throws Exception {
    runTest("lateral_view_join", "lateral_view_join.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/lateral_view_join.q"));
  }

  public void testNegativeCliDriver_limit_partition() throws Exception {
    runTest("limit_partition", "limit_partition.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/limit_partition.q"));
  }

  public void testNegativeCliDriver_limit_partition_stats() throws Exception {
    runTest("limit_partition_stats", "limit_partition_stats.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/limit_partition_stats.q"));
  }

  public void testNegativeCliDriver_line_terminator() throws Exception {
    runTest("line_terminator", "line_terminator.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/line_terminator.q"));
  }

  public void testNegativeCliDriver_load_exist_part_authfail() throws Exception {
    runTest("load_exist_part_authfail", "load_exist_part_authfail.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/load_exist_part_authfail.q"));
  }

  public void testNegativeCliDriver_load_non_native() throws Exception {
    runTest("load_non_native", "load_non_native.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/load_non_native.q"));
  }

  public void testNegativeCliDriver_load_nonpart_authfail() throws Exception {
    runTest("load_nonpart_authfail", "load_nonpart_authfail.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/load_nonpart_authfail.q"));
  }

  public void testNegativeCliDriver_load_part_authfail() throws Exception {
    runTest("load_part_authfail", "load_part_authfail.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/load_part_authfail.q"));
  }

  public void testNegativeCliDriver_load_part_nospec() throws Exception {
    runTest("load_part_nospec", "load_part_nospec.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/load_part_nospec.q"));
  }

  public void testNegativeCliDriver_load_stored_as_dirs() throws Exception {
    runTest("load_stored_as_dirs", "load_stored_as_dirs.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/load_stored_as_dirs.q"));
  }

  public void testNegativeCliDriver_load_view_failure() throws Exception {
    runTest("load_view_failure", "load_view_failure.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/load_view_failure.q"));
  }

  public void testNegativeCliDriver_load_wrong_fileformat() throws Exception {
    runTest("load_wrong_fileformat", "load_wrong_fileformat.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/load_wrong_fileformat.q"));
  }

  public void testNegativeCliDriver_load_wrong_fileformat_rc_seq() throws Exception {
    runTest("load_wrong_fileformat_rc_seq", "load_wrong_fileformat_rc_seq.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/load_wrong_fileformat_rc_seq.q"));
  }

  public void testNegativeCliDriver_load_wrong_fileformat_txt_seq() throws Exception {
    runTest("load_wrong_fileformat_txt_seq", "load_wrong_fileformat_txt_seq.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/load_wrong_fileformat_txt_seq.q"));
  }

  public void testNegativeCliDriver_load_wrong_noof_part() throws Exception {
    runTest("load_wrong_noof_part", "load_wrong_noof_part.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/load_wrong_noof_part.q"));
  }

  public void testNegativeCliDriver_local_mapred_error_cache() throws Exception {
    runTest("local_mapred_error_cache", "local_mapred_error_cache.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/local_mapred_error_cache.q"));
  }

  public void testNegativeCliDriver_lockneg1() throws Exception {
    runTest("lockneg1", "lockneg1.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/lockneg1.q"));
  }

  public void testNegativeCliDriver_lockneg2() throws Exception {
    runTest("lockneg2", "lockneg2.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/lockneg2.q"));
  }

  public void testNegativeCliDriver_lockneg3() throws Exception {
    runTest("lockneg3", "lockneg3.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/lockneg3.q"));
  }

  public void testNegativeCliDriver_lockneg4() throws Exception {
    runTest("lockneg4", "lockneg4.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/lockneg4.q"));
  }

  public void testNegativeCliDriver_lockneg5() throws Exception {
    runTest("lockneg5", "lockneg5.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/lockneg5.q"));
  }

  public void testNegativeCliDriver_lockneg_query_tbl_in_locked_db() throws Exception {
    runTest("lockneg_query_tbl_in_locked_db", "lockneg_query_tbl_in_locked_db.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/lockneg_query_tbl_in_locked_db.q"));
  }

  public void testNegativeCliDriver_lockneg_try_db_lock_conflict() throws Exception {
    runTest("lockneg_try_db_lock_conflict", "lockneg_try_db_lock_conflict.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/lockneg_try_db_lock_conflict.q"));
  }

  public void testNegativeCliDriver_lockneg_try_drop_locked_db() throws Exception {
    runTest("lockneg_try_drop_locked_db", "lockneg_try_drop_locked_db.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/lockneg_try_drop_locked_db.q"));
  }

  public void testNegativeCliDriver_lockneg_try_lock_db_in_use() throws Exception {
    runTest("lockneg_try_lock_db_in_use", "lockneg_try_lock_db_in_use.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/lockneg_try_lock_db_in_use.q"));
  }

  public void testNegativeCliDriver_macro_unused_parameter() throws Exception {
    runTest("macro_unused_parameter", "macro_unused_parameter.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/macro_unused_parameter.q"));
  }

  public void testNegativeCliDriver_merge_negative_1() throws Exception {
    runTest("merge_negative_1", "merge_negative_1.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/merge_negative_1.q"));
  }

  public void testNegativeCliDriver_merge_negative_2() throws Exception {
    runTest("merge_negative_2", "merge_negative_2.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/merge_negative_2.q"));
  }

  public void testNegativeCliDriver_merge_negative_3() throws Exception {
    runTest("merge_negative_3", "merge_negative_3.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/merge_negative_3.q"));
  }

  public void testNegativeCliDriver_nested_complex_neg() throws Exception {
    runTest("nested_complex_neg", "nested_complex_neg.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/nested_complex_neg.q"));
  }

  public void testNegativeCliDriver_no_matching_udf() throws Exception {
    runTest("no_matching_udf", "no_matching_udf.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/no_matching_udf.q"));
  }

  public void testNegativeCliDriver_nonkey_groupby() throws Exception {
    runTest("nonkey_groupby", "nonkey_groupby.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/nonkey_groupby.q"));
  }

  public void testNegativeCliDriver_nopart_insert() throws Exception {
    runTest("nopart_insert", "nopart_insert.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/nopart_insert.q"));
  }

  public void testNegativeCliDriver_nopart_load() throws Exception {
    runTest("nopart_load", "nopart_load.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/nopart_load.q"));
  }

  public void testNegativeCliDriver_notable_alias4() throws Exception {
    runTest("notable_alias4", "notable_alias4.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/notable_alias4.q"));
  }

  public void testNegativeCliDriver_orderby_invalid_position() throws Exception {
    runTest("orderby_invalid_position", "orderby_invalid_position.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/orderby_invalid_position.q"));
  }

  public void testNegativeCliDriver_orderby_position_unsupported() throws Exception {
    runTest("orderby_position_unsupported", "orderby_position_unsupported.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/orderby_position_unsupported.q"));
  }

  public void testNegativeCliDriver_orderbysortby() throws Exception {
    runTest("orderbysortby", "orderbysortby.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/orderbysortby.q"));
  }

  public void testNegativeCliDriver_parquet_char() throws Exception {
    runTest("parquet_char", "parquet_char.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/parquet_char.q"));
  }

  public void testNegativeCliDriver_parquet_date() throws Exception {
    runTest("parquet_date", "parquet_date.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/parquet_date.q"));
  }

  public void testNegativeCliDriver_parquet_decimal() throws Exception {
    runTest("parquet_decimal", "parquet_decimal.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/parquet_decimal.q"));
  }

  public void testNegativeCliDriver_parquet_timestamp() throws Exception {
    runTest("parquet_timestamp", "parquet_timestamp.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/parquet_timestamp.q"));
  }

  public void testNegativeCliDriver_parquet_varchar() throws Exception {
    runTest("parquet_varchar", "parquet_varchar.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/parquet_varchar.q"));
  }

  public void testNegativeCliDriver_part_col_complex_type() throws Exception {
    runTest("part_col_complex_type", "part_col_complex_type.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/part_col_complex_type.q"));
  }

  public void testNegativeCliDriver_protectmode_part() throws Exception {
    runTest("protectmode_part", "protectmode_part.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/protectmode_part.q"));
  }

  public void testNegativeCliDriver_protectmode_part1() throws Exception {
    runTest("protectmode_part1", "protectmode_part1.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/protectmode_part1.q"));
  }

  public void testNegativeCliDriver_protectmode_part2() throws Exception {
    runTest("protectmode_part2", "protectmode_part2.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/protectmode_part2.q"));
  }

  public void testNegativeCliDriver_protectmode_part_no_drop() throws Exception {
    runTest("protectmode_part_no_drop", "protectmode_part_no_drop.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/protectmode_part_no_drop.q"));
  }

  public void testNegativeCliDriver_protectmode_tbl1() throws Exception {
    runTest("protectmode_tbl1", "protectmode_tbl1.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/protectmode_tbl1.q"));
  }

  public void testNegativeCliDriver_protectmode_tbl2() throws Exception {
    runTest("protectmode_tbl2", "protectmode_tbl2.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/protectmode_tbl2.q"));
  }

  public void testNegativeCliDriver_protectmode_tbl3() throws Exception {
    runTest("protectmode_tbl3", "protectmode_tbl3.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/protectmode_tbl3.q"));
  }

  public void testNegativeCliDriver_protectmode_tbl4() throws Exception {
    runTest("protectmode_tbl4", "protectmode_tbl4.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/protectmode_tbl4.q"));
  }

  public void testNegativeCliDriver_protectmode_tbl5() throws Exception {
    runTest("protectmode_tbl5", "protectmode_tbl5.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/protectmode_tbl5.q"));
  }

  public void testNegativeCliDriver_protectmode_tbl6() throws Exception {
    runTest("protectmode_tbl6", "protectmode_tbl6.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/protectmode_tbl6.q"));
  }

  public void testNegativeCliDriver_protectmode_tbl7() throws Exception {
    runTest("protectmode_tbl7", "protectmode_tbl7.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/protectmode_tbl7.q"));
  }

  public void testNegativeCliDriver_protectmode_tbl8() throws Exception {
    runTest("protectmode_tbl8", "protectmode_tbl8.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/protectmode_tbl8.q"));
  }

  public void testNegativeCliDriver_protectmode_tbl_no_drop() throws Exception {
    runTest("protectmode_tbl_no_drop", "protectmode_tbl_no_drop.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/protectmode_tbl_no_drop.q"));
  }

  public void testNegativeCliDriver_ptf_negative_AggrFuncsWithNoGBYNoPartDef() throws Exception {
    runTest("ptf_negative_AggrFuncsWithNoGBYNoPartDef", "ptf_negative_AggrFuncsWithNoGBYNoPartDef.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/ptf_negative_AggrFuncsWithNoGBYNoPartDef.q"));
  }

  public void testNegativeCliDriver_ptf_negative_AmbiguousWindowDefn() throws Exception {
    runTest("ptf_negative_AmbiguousWindowDefn", "ptf_negative_AmbiguousWindowDefn.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/ptf_negative_AmbiguousWindowDefn.q"));
  }

  public void testNegativeCliDriver_ptf_negative_DistributeByOrderBy() throws Exception {
    runTest("ptf_negative_DistributeByOrderBy", "ptf_negative_DistributeByOrderBy.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/ptf_negative_DistributeByOrderBy.q"));
  }

  public void testNegativeCliDriver_ptf_negative_DuplicateWindowAlias() throws Exception {
    runTest("ptf_negative_DuplicateWindowAlias", "ptf_negative_DuplicateWindowAlias.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/ptf_negative_DuplicateWindowAlias.q"));
  }

  public void testNegativeCliDriver_ptf_negative_HavingLeadWithNoGBYNoWindowing() throws Exception {
    runTest("ptf_negative_HavingLeadWithNoGBYNoWindowing", "ptf_negative_HavingLeadWithNoGBYNoWindowing.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/ptf_negative_HavingLeadWithNoGBYNoWindowing.q"));
  }

  public void testNegativeCliDriver_ptf_negative_HavingLeadWithPTF() throws Exception {
    runTest("ptf_negative_HavingLeadWithPTF", "ptf_negative_HavingLeadWithPTF.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/ptf_negative_HavingLeadWithPTF.q"));
  }

  public void testNegativeCliDriver_ptf_negative_InvalidValueBoundary() throws Exception {
    runTest("ptf_negative_InvalidValueBoundary", "ptf_negative_InvalidValueBoundary.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/ptf_negative_InvalidValueBoundary.q"));
  }

  public void testNegativeCliDriver_ptf_negative_JoinWithAmbigousAlias() throws Exception {
    runTest("ptf_negative_JoinWithAmbigousAlias", "ptf_negative_JoinWithAmbigousAlias.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/ptf_negative_JoinWithAmbigousAlias.q"));
  }

  public void testNegativeCliDriver_ptf_negative_PartitionBySortBy() throws Exception {
    runTest("ptf_negative_PartitionBySortBy", "ptf_negative_PartitionBySortBy.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/ptf_negative_PartitionBySortBy.q"));
  }

  public void testNegativeCliDriver_ptf_negative_WhereWithRankCond() throws Exception {
    runTest("ptf_negative_WhereWithRankCond", "ptf_negative_WhereWithRankCond.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/ptf_negative_WhereWithRankCond.q"));
  }

  public void testNegativeCliDriver_ptf_window_boundaries() throws Exception {
    runTest("ptf_window_boundaries", "ptf_window_boundaries.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/ptf_window_boundaries.q"));
  }

  public void testNegativeCliDriver_ptf_window_boundaries2() throws Exception {
    runTest("ptf_window_boundaries2", "ptf_window_boundaries2.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/ptf_window_boundaries2.q"));
  }

  public void testNegativeCliDriver_recursive_view() throws Exception {
    runTest("recursive_view", "recursive_view.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/recursive_view.q"));
  }

  public void testNegativeCliDriver_regex_col_1() throws Exception {
    runTest("regex_col_1", "regex_col_1.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/regex_col_1.q"));
  }

  public void testNegativeCliDriver_regex_col_2() throws Exception {
    runTest("regex_col_2", "regex_col_2.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/regex_col_2.q"));
  }

  public void testNegativeCliDriver_regex_col_groupby() throws Exception {
    runTest("regex_col_groupby", "regex_col_groupby.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/regex_col_groupby.q"));
  }

  public void testNegativeCliDriver_sa_fail_hook3() throws Exception {
    runTest("sa_fail_hook3", "sa_fail_hook3.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/sa_fail_hook3.q"));
  }

  public void testNegativeCliDriver_sample() throws Exception {
    runTest("sample", "sample.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/sample.q"));
  }

  public void testNegativeCliDriver_script_broken_pipe2() throws Exception {
    runTest("script_broken_pipe2", "script_broken_pipe2.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/script_broken_pipe2.q"));
  }

  public void testNegativeCliDriver_script_broken_pipe3() throws Exception {
    runTest("script_broken_pipe3", "script_broken_pipe3.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/script_broken_pipe3.q"));
  }

  public void testNegativeCliDriver_script_error() throws Exception {
    runTest("script_error", "script_error.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/script_error.q"));
  }

  public void testNegativeCliDriver_select_charliteral() throws Exception {
    runTest("select_charliteral", "select_charliteral.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/select_charliteral.q"));
  }

  public void testNegativeCliDriver_select_udtf_alias() throws Exception {
    runTest("select_udtf_alias", "select_udtf_alias.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/select_udtf_alias.q"));
  }

  public void testNegativeCliDriver_semijoin1() throws Exception {
    runTest("semijoin1", "semijoin1.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/semijoin1.q"));
  }

  public void testNegativeCliDriver_semijoin2() throws Exception {
    runTest("semijoin2", "semijoin2.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/semijoin2.q"));
  }

  public void testNegativeCliDriver_semijoin3() throws Exception {
    runTest("semijoin3", "semijoin3.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/semijoin3.q"));
  }

  public void testNegativeCliDriver_semijoin4() throws Exception {
    runTest("semijoin4", "semijoin4.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/semijoin4.q"));
  }

  public void testNegativeCliDriver_serde_regex() throws Exception {
    runTest("serde_regex", "serde_regex.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/serde_regex.q"));
  }

  public void testNegativeCliDriver_serde_regex2() throws Exception {
    runTest("serde_regex2", "serde_regex2.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/serde_regex2.q"));
  }

  public void testNegativeCliDriver_serde_regex3() throws Exception {
    runTest("serde_regex3", "serde_regex3.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/serde_regex3.q"));
  }

  public void testNegativeCliDriver_set_hiveconf_validation0() throws Exception {
    runTest("set_hiveconf_validation0", "set_hiveconf_validation0.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/set_hiveconf_validation0.q"));
  }

  public void testNegativeCliDriver_set_hiveconf_validation1() throws Exception {
    runTest("set_hiveconf_validation1", "set_hiveconf_validation1.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/set_hiveconf_validation1.q"));
  }

  public void testNegativeCliDriver_set_hiveconf_validation2() throws Exception {
    runTest("set_hiveconf_validation2", "set_hiveconf_validation2.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/set_hiveconf_validation2.q"));
  }

  public void testNegativeCliDriver_set_table_property() throws Exception {
    runTest("set_table_property", "set_table_property.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/set_table_property.q"));
  }

  public void testNegativeCliDriver_show_columns1() throws Exception {
    runTest("show_columns1", "show_columns1.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/show_columns1.q"));
  }

  public void testNegativeCliDriver_show_columns2() throws Exception {
    runTest("show_columns2", "show_columns2.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/show_columns2.q"));
  }

  public void testNegativeCliDriver_show_columns3() throws Exception {
    runTest("show_columns3", "show_columns3.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/show_columns3.q"));
  }

  public void testNegativeCliDriver_show_create_table_does_not_exist() throws Exception {
    runTest("show_create_table_does_not_exist", "show_create_table_does_not_exist.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/show_create_table_does_not_exist.q"));
  }

  public void testNegativeCliDriver_show_create_table_index() throws Exception {
    runTest("show_create_table_index", "show_create_table_index.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/show_create_table_index.q"));
  }

  public void testNegativeCliDriver_show_partitions1() throws Exception {
    runTest("show_partitions1", "show_partitions1.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/show_partitions1.q"));
  }

  public void testNegativeCliDriver_show_tableproperties1() throws Exception {
    runTest("show_tableproperties1", "show_tableproperties1.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/show_tableproperties1.q"));
  }

  public void testNegativeCliDriver_show_tables_bad1() throws Exception {
    runTest("show_tables_bad1", "show_tables_bad1.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/show_tables_bad1.q"));
  }

  public void testNegativeCliDriver_show_tables_bad2() throws Exception {
    runTest("show_tables_bad2", "show_tables_bad2.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/show_tables_bad2.q"));
  }

  public void testNegativeCliDriver_show_tables_bad_db1() throws Exception {
    runTest("show_tables_bad_db1", "show_tables_bad_db1.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/show_tables_bad_db1.q"));
  }

  public void testNegativeCliDriver_show_tables_bad_db2() throws Exception {
    runTest("show_tables_bad_db2", "show_tables_bad_db2.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/show_tables_bad_db2.q"));
  }

  public void testNegativeCliDriver_show_tablestatus() throws Exception {
    runTest("show_tablestatus", "show_tablestatus.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/show_tablestatus.q"));
  }

  public void testNegativeCliDriver_show_tablestatus_not_existing_part() throws Exception {
    runTest("show_tablestatus_not_existing_part", "show_tablestatus_not_existing_part.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/show_tablestatus_not_existing_part.q"));
  }

  public void testNegativeCliDriver_smb_bucketmapjoin() throws Exception {
    runTest("smb_bucketmapjoin", "smb_bucketmapjoin.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/smb_bucketmapjoin.q"));
  }

  public void testNegativeCliDriver_smb_mapjoin_14() throws Exception {
    runTest("smb_mapjoin_14", "smb_mapjoin_14.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/smb_mapjoin_14.q"));
  }

  public void testNegativeCliDriver_sortmerge_mapjoin_mismatch_1() throws Exception {
    runTest("sortmerge_mapjoin_mismatch_1", "sortmerge_mapjoin_mismatch_1.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/sortmerge_mapjoin_mismatch_1.q"));
  }

  public void testNegativeCliDriver_split_sample_out_of_range() throws Exception {
    runTest("split_sample_out_of_range", "split_sample_out_of_range.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/split_sample_out_of_range.q"));
  }

  public void testNegativeCliDriver_split_sample_wrong_format() throws Exception {
    runTest("split_sample_wrong_format", "split_sample_wrong_format.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/split_sample_wrong_format.q"));
  }

  public void testNegativeCliDriver_split_sample_wrong_format2() throws Exception {
    runTest("split_sample_wrong_format2", "split_sample_wrong_format2.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/split_sample_wrong_format2.q"));
  }

  public void testNegativeCliDriver_stats_aggregator_error_1() throws Exception {
    runTest("stats_aggregator_error_1", "stats_aggregator_error_1.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/stats_aggregator_error_1.q"));
  }

  public void testNegativeCliDriver_stats_aggregator_error_2() throws Exception {
    runTest("stats_aggregator_error_2", "stats_aggregator_error_2.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/stats_aggregator_error_2.q"));
  }

  public void testNegativeCliDriver_stats_noscan_non_native() throws Exception {
    runTest("stats_noscan_non_native", "stats_noscan_non_native.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/stats_noscan_non_native.q"));
  }

  public void testNegativeCliDriver_stats_partialscan_autogether() throws Exception {
    runTest("stats_partialscan_autogether", "stats_partialscan_autogether.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/stats_partialscan_autogether.q"));
  }

  public void testNegativeCliDriver_stats_partialscan_non_external() throws Exception {
    runTest("stats_partialscan_non_external", "stats_partialscan_non_external.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/stats_partialscan_non_external.q"));
  }

  public void testNegativeCliDriver_stats_partialscan_non_native() throws Exception {
    runTest("stats_partialscan_non_native", "stats_partialscan_non_native.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/stats_partialscan_non_native.q"));
  }

  public void testNegativeCliDriver_stats_partscan_norcfile() throws Exception {
    runTest("stats_partscan_norcfile", "stats_partscan_norcfile.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/stats_partscan_norcfile.q"));
  }

  public void testNegativeCliDriver_stats_publisher_error_1() throws Exception {
    runTest("stats_publisher_error_1", "stats_publisher_error_1.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/stats_publisher_error_1.q"));
  }

  public void testNegativeCliDriver_stats_publisher_error_2() throws Exception {
    runTest("stats_publisher_error_2", "stats_publisher_error_2.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/stats_publisher_error_2.q"));
  }

  public void testNegativeCliDriver_strict_join() throws Exception {
    runTest("strict_join", "strict_join.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/strict_join.q"));
  }

  public void testNegativeCliDriver_strict_orderby() throws Exception {
    runTest("strict_orderby", "strict_orderby.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/strict_orderby.q"));
  }

  public void testNegativeCliDriver_strict_pruning() throws Exception {
    runTest("strict_pruning", "strict_pruning.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/strict_pruning.q"));
  }

  public void testNegativeCliDriver_subq_insert() throws Exception {
    runTest("subq_insert", "subq_insert.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/subq_insert.q"));
  }

  public void testNegativeCliDriver_subquery_exists_implicit_gby() throws Exception {
    runTest("subquery_exists_implicit_gby", "subquery_exists_implicit_gby.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/subquery_exists_implicit_gby.q"));
  }

  public void testNegativeCliDriver_subquery_in_groupby() throws Exception {
    runTest("subquery_in_groupby", "subquery_in_groupby.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/subquery_in_groupby.q"));
  }

  public void testNegativeCliDriver_subquery_in_select() throws Exception {
    runTest("subquery_in_select", "subquery_in_select.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/subquery_in_select.q"));
  }

  public void testNegativeCliDriver_subquery_multiple_cols_in_select() throws Exception {
    runTest("subquery_multiple_cols_in_select", "subquery_multiple_cols_in_select.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/subquery_multiple_cols_in_select.q"));
  }

  public void testNegativeCliDriver_subquery_nested_subquery() throws Exception {
    runTest("subquery_nested_subquery", "subquery_nested_subquery.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/subquery_nested_subquery.q"));
  }

  public void testNegativeCliDriver_subquery_notexists_implicit_gby() throws Exception {
    runTest("subquery_notexists_implicit_gby", "subquery_notexists_implicit_gby.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/subquery_notexists_implicit_gby.q"));
  }

  public void testNegativeCliDriver_subquery_shared_alias() throws Exception {
    runTest("subquery_shared_alias", "subquery_shared_alias.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/subquery_shared_alias.q"));
  }

  public void testNegativeCliDriver_subquery_subquery_chain() throws Exception {
    runTest("subquery_subquery_chain", "subquery_subquery_chain.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/subquery_subquery_chain.q"));
  }

  public void testNegativeCliDriver_subquery_unqual_corr_expr() throws Exception {
    runTest("subquery_unqual_corr_expr", "subquery_unqual_corr_expr.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/subquery_unqual_corr_expr.q"));
  }

  public void testNegativeCliDriver_subquery_windowing_corr() throws Exception {
    runTest("subquery_windowing_corr", "subquery_windowing_corr.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/subquery_windowing_corr.q"));
  }

  public void testNegativeCliDriver_subquery_with_or_cond() throws Exception {
    runTest("subquery_with_or_cond", "subquery_with_or_cond.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/subquery_with_or_cond.q"));
  }

  public void testNegativeCliDriver_touch1() throws Exception {
    runTest("touch1", "touch1.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/touch1.q"));
  }

  public void testNegativeCliDriver_touch2() throws Exception {
    runTest("touch2", "touch2.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/touch2.q"));
  }

  public void testNegativeCliDriver_truncate_bucketed_column() throws Exception {
    runTest("truncate_bucketed_column", "truncate_bucketed_column.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/truncate_bucketed_column.q"));
  }

  public void testNegativeCliDriver_truncate_column_indexed_table() throws Exception {
    runTest("truncate_column_indexed_table", "truncate_column_indexed_table.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/truncate_column_indexed_table.q"));
  }

  public void testNegativeCliDriver_truncate_column_list_bucketing() throws Exception {
    runTest("truncate_column_list_bucketing", "truncate_column_list_bucketing.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/truncate_column_list_bucketing.q"));
  }

  public void testNegativeCliDriver_truncate_column_seqfile() throws Exception {
    runTest("truncate_column_seqfile", "truncate_column_seqfile.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/truncate_column_seqfile.q"));
  }

  public void testNegativeCliDriver_truncate_nonexistant_column() throws Exception {
    runTest("truncate_nonexistant_column", "truncate_nonexistant_column.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/truncate_nonexistant_column.q"));
  }

  public void testNegativeCliDriver_truncate_partition_column() throws Exception {
    runTest("truncate_partition_column", "truncate_partition_column.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/truncate_partition_column.q"));
  }

  public void testNegativeCliDriver_truncate_partition_column2() throws Exception {
    runTest("truncate_partition_column2", "truncate_partition_column2.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/truncate_partition_column2.q"));
  }

  public void testNegativeCliDriver_truncate_table_failure1() throws Exception {
    runTest("truncate_table_failure1", "truncate_table_failure1.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/truncate_table_failure1.q"));
  }

  public void testNegativeCliDriver_truncate_table_failure2() throws Exception {
    runTest("truncate_table_failure2", "truncate_table_failure2.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/truncate_table_failure2.q"));
  }

  public void testNegativeCliDriver_truncate_table_failure3() throws Exception {
    runTest("truncate_table_failure3", "truncate_table_failure3.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/truncate_table_failure3.q"));
  }

  public void testNegativeCliDriver_truncate_table_failure4() throws Exception {
    runTest("truncate_table_failure4", "truncate_table_failure4.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/truncate_table_failure4.q"));
  }

  public void testNegativeCliDriver_udaf_invalid_place() throws Exception {
    runTest("udaf_invalid_place", "udaf_invalid_place.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/udaf_invalid_place.q"));
  }

  public void testNegativeCliDriver_udf_array_contains_wrong1() throws Exception {
    runTest("udf_array_contains_wrong1", "udf_array_contains_wrong1.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/udf_array_contains_wrong1.q"));
  }

  public void testNegativeCliDriver_udf_array_contains_wrong2() throws Exception {
    runTest("udf_array_contains_wrong2", "udf_array_contains_wrong2.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/udf_array_contains_wrong2.q"));
  }

  public void testNegativeCliDriver_udf_assert_true() throws Exception {
    runTest("udf_assert_true", "udf_assert_true.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/udf_assert_true.q"));
  }

  public void testNegativeCliDriver_udf_assert_true2() throws Exception {
    runTest("udf_assert_true2", "udf_assert_true2.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/udf_assert_true2.q"));
  }

  public void testNegativeCliDriver_udf_coalesce() throws Exception {
    runTest("udf_coalesce", "udf_coalesce.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/udf_coalesce.q"));
  }

  public void testNegativeCliDriver_udf_concat_ws_wrong1() throws Exception {
    runTest("udf_concat_ws_wrong1", "udf_concat_ws_wrong1.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/udf_concat_ws_wrong1.q"));
  }

  public void testNegativeCliDriver_udf_concat_ws_wrong2() throws Exception {
    runTest("udf_concat_ws_wrong2", "udf_concat_ws_wrong2.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/udf_concat_ws_wrong2.q"));
  }

  public void testNegativeCliDriver_udf_concat_ws_wrong3() throws Exception {
    runTest("udf_concat_ws_wrong3", "udf_concat_ws_wrong3.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/udf_concat_ws_wrong3.q"));
  }

  public void testNegativeCliDriver_udf_elt_wrong_args_len() throws Exception {
    runTest("udf_elt_wrong_args_len", "udf_elt_wrong_args_len.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/udf_elt_wrong_args_len.q"));
  }

  public void testNegativeCliDriver_udf_elt_wrong_type() throws Exception {
    runTest("udf_elt_wrong_type", "udf_elt_wrong_type.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/udf_elt_wrong_type.q"));
  }

  public void testNegativeCliDriver_udf_field_wrong_args_len() throws Exception {
    runTest("udf_field_wrong_args_len", "udf_field_wrong_args_len.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/udf_field_wrong_args_len.q"));
  }

  public void testNegativeCliDriver_udf_field_wrong_type() throws Exception {
    runTest("udf_field_wrong_type", "udf_field_wrong_type.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/udf_field_wrong_type.q"));
  }

  public void testNegativeCliDriver_udf_format_number_wrong1() throws Exception {
    runTest("udf_format_number_wrong1", "udf_format_number_wrong1.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/udf_format_number_wrong1.q"));
  }

  public void testNegativeCliDriver_udf_format_number_wrong2() throws Exception {
    runTest("udf_format_number_wrong2", "udf_format_number_wrong2.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/udf_format_number_wrong2.q"));
  }

  public void testNegativeCliDriver_udf_format_number_wrong3() throws Exception {
    runTest("udf_format_number_wrong3", "udf_format_number_wrong3.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/udf_format_number_wrong3.q"));
  }

  public void testNegativeCliDriver_udf_format_number_wrong4() throws Exception {
    runTest("udf_format_number_wrong4", "udf_format_number_wrong4.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/udf_format_number_wrong4.q"));
  }

  public void testNegativeCliDriver_udf_format_number_wrong5() throws Exception {
    runTest("udf_format_number_wrong5", "udf_format_number_wrong5.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/udf_format_number_wrong5.q"));
  }

  public void testNegativeCliDriver_udf_format_number_wrong6() throws Exception {
    runTest("udf_format_number_wrong6", "udf_format_number_wrong6.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/udf_format_number_wrong6.q"));
  }

  public void testNegativeCliDriver_udf_format_number_wrong7() throws Exception {
    runTest("udf_format_number_wrong7", "udf_format_number_wrong7.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/udf_format_number_wrong7.q"));
  }

  public void testNegativeCliDriver_udf_function_does_not_implement_udf() throws Exception {
    runTest("udf_function_does_not_implement_udf", "udf_function_does_not_implement_udf.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/udf_function_does_not_implement_udf.q"));
  }

  public void testNegativeCliDriver_udf_if_not_bool() throws Exception {
    runTest("udf_if_not_bool", "udf_if_not_bool.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/udf_if_not_bool.q"));
  }

  public void testNegativeCliDriver_udf_if_wrong_args_len() throws Exception {
    runTest("udf_if_wrong_args_len", "udf_if_wrong_args_len.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/udf_if_wrong_args_len.q"));
  }

  public void testNegativeCliDriver_udf_in() throws Exception {
    runTest("udf_in", "udf_in.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/udf_in.q"));
  }

  public void testNegativeCliDriver_udf_instr_wrong_args_len() throws Exception {
    runTest("udf_instr_wrong_args_len", "udf_instr_wrong_args_len.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/udf_instr_wrong_args_len.q"));
  }

  public void testNegativeCliDriver_udf_instr_wrong_type() throws Exception {
    runTest("udf_instr_wrong_type", "udf_instr_wrong_type.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/udf_instr_wrong_type.q"));
  }

  public void testNegativeCliDriver_udf_invalid() throws Exception {
    runTest("udf_invalid", "udf_invalid.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/udf_invalid.q"));
  }

  public void testNegativeCliDriver_udf_locate_wrong_args_len() throws Exception {
    runTest("udf_locate_wrong_args_len", "udf_locate_wrong_args_len.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/udf_locate_wrong_args_len.q"));
  }

  public void testNegativeCliDriver_udf_locate_wrong_type() throws Exception {
    runTest("udf_locate_wrong_type", "udf_locate_wrong_type.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/udf_locate_wrong_type.q"));
  }

  public void testNegativeCliDriver_udf_map_keys_arg_num() throws Exception {
    runTest("udf_map_keys_arg_num", "udf_map_keys_arg_num.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/udf_map_keys_arg_num.q"));
  }

  public void testNegativeCliDriver_udf_map_keys_arg_type() throws Exception {
    runTest("udf_map_keys_arg_type", "udf_map_keys_arg_type.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/udf_map_keys_arg_type.q"));
  }

  public void testNegativeCliDriver_udf_map_values_arg_num() throws Exception {
    runTest("udf_map_values_arg_num", "udf_map_values_arg_num.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/udf_map_values_arg_num.q"));
  }

  public void testNegativeCliDriver_udf_map_values_arg_type() throws Exception {
    runTest("udf_map_values_arg_type", "udf_map_values_arg_type.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/udf_map_values_arg_type.q"));
  }

  public void testNegativeCliDriver_udf_max() throws Exception {
    runTest("udf_max", "udf_max.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/udf_max.q"));
  }

  public void testNegativeCliDriver_udf_min() throws Exception {
    runTest("udf_min", "udf_min.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/udf_min.q"));
  }

  public void testNegativeCliDriver_udf_nonexistent_resource() throws Exception {
    runTest("udf_nonexistent_resource", "udf_nonexistent_resource.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/udf_nonexistent_resource.q"));
  }

  public void testNegativeCliDriver_udf_printf_wrong1() throws Exception {
    runTest("udf_printf_wrong1", "udf_printf_wrong1.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/udf_printf_wrong1.q"));
  }

  public void testNegativeCliDriver_udf_printf_wrong2() throws Exception {
    runTest("udf_printf_wrong2", "udf_printf_wrong2.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/udf_printf_wrong2.q"));
  }

  public void testNegativeCliDriver_udf_printf_wrong3() throws Exception {
    runTest("udf_printf_wrong3", "udf_printf_wrong3.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/udf_printf_wrong3.q"));
  }

  public void testNegativeCliDriver_udf_printf_wrong4() throws Exception {
    runTest("udf_printf_wrong4", "udf_printf_wrong4.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/udf_printf_wrong4.q"));
  }

  public void testNegativeCliDriver_udf_qualified_name() throws Exception {
    runTest("udf_qualified_name", "udf_qualified_name.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/udf_qualified_name.q"));
  }

  public void testNegativeCliDriver_udf_reflect_neg() throws Exception {
    runTest("udf_reflect_neg", "udf_reflect_neg.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/udf_reflect_neg.q"));
  }

  public void testNegativeCliDriver_udf_size_wrong_args_len() throws Exception {
    runTest("udf_size_wrong_args_len", "udf_size_wrong_args_len.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/udf_size_wrong_args_len.q"));
  }

  public void testNegativeCliDriver_udf_size_wrong_type() throws Exception {
    runTest("udf_size_wrong_type", "udf_size_wrong_type.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/udf_size_wrong_type.q"));
  }

  public void testNegativeCliDriver_udf_sort_array_wrong1() throws Exception {
    runTest("udf_sort_array_wrong1", "udf_sort_array_wrong1.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/udf_sort_array_wrong1.q"));
  }

  public void testNegativeCliDriver_udf_sort_array_wrong2() throws Exception {
    runTest("udf_sort_array_wrong2", "udf_sort_array_wrong2.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/udf_sort_array_wrong2.q"));
  }

  public void testNegativeCliDriver_udf_sort_array_wrong3() throws Exception {
    runTest("udf_sort_array_wrong3", "udf_sort_array_wrong3.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/udf_sort_array_wrong3.q"));
  }

  public void testNegativeCliDriver_udf_test_error() throws Exception {
    runTest("udf_test_error", "udf_test_error.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/udf_test_error.q"));
  }

  public void testNegativeCliDriver_udf_test_error_reduce() throws Exception {
    runTest("udf_test_error_reduce", "udf_test_error_reduce.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/udf_test_error_reduce.q"));
  }

  public void testNegativeCliDriver_udf_when_type_wrong() throws Exception {
    runTest("udf_when_type_wrong", "udf_when_type_wrong.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/udf_when_type_wrong.q"));
  }

  public void testNegativeCliDriver_udtf_explode_not_supported1() throws Exception {
    runTest("udtf_explode_not_supported1", "udtf_explode_not_supported1.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/udtf_explode_not_supported1.q"));
  }

  public void testNegativeCliDriver_udtf_explode_not_supported2() throws Exception {
    runTest("udtf_explode_not_supported2", "udtf_explode_not_supported2.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/udtf_explode_not_supported2.q"));
  }

  public void testNegativeCliDriver_udtf_explode_not_supported3() throws Exception {
    runTest("udtf_explode_not_supported3", "udtf_explode_not_supported3.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/udtf_explode_not_supported3.q"));
  }

  public void testNegativeCliDriver_udtf_explode_not_supported4() throws Exception {
    runTest("udtf_explode_not_supported4", "udtf_explode_not_supported4.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/udtf_explode_not_supported4.q"));
  }

  public void testNegativeCliDriver_udtf_invalid_place() throws Exception {
    runTest("udtf_invalid_place", "udtf_invalid_place.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/udtf_invalid_place.q"));
  }

  public void testNegativeCliDriver_udtf_not_supported1() throws Exception {
    runTest("udtf_not_supported1", "udtf_not_supported1.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/udtf_not_supported1.q"));
  }

  public void testNegativeCliDriver_udtf_not_supported3() throws Exception {
    runTest("udtf_not_supported3", "udtf_not_supported3.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/udtf_not_supported3.q"));
  }

  public void testNegativeCliDriver_union2() throws Exception {
    runTest("union2", "union2.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/union2.q"));
  }

  public void testNegativeCliDriver_union22() throws Exception {
    runTest("union22", "union22.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/union22.q"));
  }

  public void testNegativeCliDriver_union3() throws Exception {
    runTest("union3", "union3.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/union3.q"));
  }

  public void testNegativeCliDriver_uniquejoin() throws Exception {
    runTest("uniquejoin", "uniquejoin.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/uniquejoin.q"));
  }

  public void testNegativeCliDriver_uniquejoin2() throws Exception {
    runTest("uniquejoin2", "uniquejoin2.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/uniquejoin2.q"));
  }

  public void testNegativeCliDriver_uniquejoin3() throws Exception {
    runTest("uniquejoin3", "uniquejoin3.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/uniquejoin3.q"));
  }

  public void testNegativeCliDriver_unset_table_property() throws Exception {
    runTest("unset_table_property", "unset_table_property.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/unset_table_property.q"));
  }

  public void testNegativeCliDriver_unset_view_property() throws Exception {
    runTest("unset_view_property", "unset_view_property.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/unset_view_property.q"));
  }

  public void testNegativeCliDriver_windowing_invalid_udaf() throws Exception {
    runTest("windowing_invalid_udaf", "windowing_invalid_udaf.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/windowing_invalid_udaf.q"));
  }

  public void testNegativeCliDriver_windowing_leadlag_in_udaf() throws Exception {
    runTest("windowing_leadlag_in_udaf", "windowing_leadlag_in_udaf.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/windowing_leadlag_in_udaf.q"));
  }

  public void testNegativeCliDriver_windowing_ll_no_neg() throws Exception {
    runTest("windowing_ll_no_neg", "windowing_ll_no_neg.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/windowing_ll_no_neg.q"));
  }

  public void testNegativeCliDriver_windowing_ll_no_over() throws Exception {
    runTest("windowing_ll_no_over", "windowing_ll_no_over.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/windowing_ll_no_over.q"));
  }

  public void testNegativeCliDriver_wrong_column_type() throws Exception {
    runTest("wrong_column_type", "wrong_column_type.q", (HIVE_ROOT + "ql/src/test/queries/clientnegative/wrong_column_type.q"));
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
