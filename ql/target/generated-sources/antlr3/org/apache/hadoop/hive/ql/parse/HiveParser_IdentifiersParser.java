// $ANTLR 3.4 IdentifiersParser.g 2014-07-19 17:12:11

package org.apache.hadoop.hive.ql.parse;

import java.util.Collection;
import java.util.HashMap;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;


/**
   Licensed to the Apache Software Foundation (ASF) under one or more 
   contributor license agreements.  See the NOTICE file distributed with 
   this work for additional information regarding copyright ownership.
   The ASF licenses this file to You under the Apache License, Version 2.0
   (the "License"); you may not use this file except in compliance with 
   the License.  You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
*/
@SuppressWarnings({"all", "warnings", "unchecked"})
public class HiveParser_IdentifiersParser extends Parser {
    public static final int EOF=-1;
    public static final int AMPERSAND=4;
    public static final int BITWISEOR=5;
    public static final int BITWISEXOR=6;
    public static final int BigintLiteral=7;
    public static final int ByteLengthLiteral=8;
    public static final int COLON=9;
    public static final int COMMA=10;
    public static final int COMMENT=11;
    public static final int CharSetLiteral=12;
    public static final int CharSetName=13;
    public static final int DIV=14;
    public static final int DIVIDE=15;
    public static final int DOLLAR=16;
    public static final int DOT=17;
    public static final int DecimalLiteral=18;
    public static final int Digit=19;
    public static final int EQUAL=20;
    public static final int EQUAL_NS=21;
    public static final int Exponent=22;
    public static final int GREATERTHAN=23;
    public static final int GREATERTHANOREQUALTO=24;
    public static final int HexDigit=25;
    public static final int Identifier=26;
    public static final int KW_ADD=27;
    public static final int KW_ADMIN=28;
    public static final int KW_AFTER=29;
    public static final int KW_ALL=30;
    public static final int KW_ALTER=31;
    public static final int KW_ANALYZE=32;
    public static final int KW_AND=33;
    public static final int KW_ARCHIVE=34;
    public static final int KW_ARRAY=35;
    public static final int KW_AS=36;
    public static final int KW_ASC=37;
    public static final int KW_BEFORE=38;
    public static final int KW_BETWEEN=39;
    public static final int KW_BIGINT=40;
    public static final int KW_BINARY=41;
    public static final int KW_BOOLEAN=42;
    public static final int KW_BOTH=43;
    public static final int KW_BUCKET=44;
    public static final int KW_BUCKETS=45;
    public static final int KW_BY=46;
    public static final int KW_CASCADE=47;
    public static final int KW_CASE=48;
    public static final int KW_CAST=49;
    public static final int KW_CHANGE=50;
    public static final int KW_CHAR=51;
    public static final int KW_CLUSTER=52;
    public static final int KW_CLUSTERED=53;
    public static final int KW_CLUSTERSTATUS=54;
    public static final int KW_COLLECTION=55;
    public static final int KW_COLUMN=56;
    public static final int KW_COLUMNS=57;
    public static final int KW_COMMENT=58;
    public static final int KW_COMPACT=59;
    public static final int KW_COMPACTIONS=60;
    public static final int KW_COMPUTE=61;
    public static final int KW_CONCATENATE=62;
    public static final int KW_CONTINUE=63;
    public static final int KW_CREATE=64;
    public static final int KW_CROSS=65;
    public static final int KW_CUBE=66;
    public static final int KW_CURRENT=67;
    public static final int KW_CURSOR=68;
    public static final int KW_DATA=69;
    public static final int KW_DATABASE=70;
    public static final int KW_DATABASES=71;
    public static final int KW_DATE=72;
    public static final int KW_DATETIME=73;
    public static final int KW_DBPROPERTIES=74;
    public static final int KW_DECIMAL=75;
    public static final int KW_DEFAULT=76;
    public static final int KW_DEFERRED=77;
    public static final int KW_DEFINED=78;
    public static final int KW_DELETE=79;
    public static final int KW_DELIMITED=80;
    public static final int KW_DEPENDENCY=81;
    public static final int KW_DESC=82;
    public static final int KW_DESCRIBE=83;
    public static final int KW_DIRECTORIES=84;
    public static final int KW_DIRECTORY=85;
    public static final int KW_DISABLE=86;
    public static final int KW_DISTINCT=87;
    public static final int KW_DISTRIBUTE=88;
    public static final int KW_DOUBLE=89;
    public static final int KW_DROP=90;
    public static final int KW_ELEM_TYPE=91;
    public static final int KW_ELSE=92;
    public static final int KW_ENABLE=93;
    public static final int KW_END=94;
    public static final int KW_ESCAPED=95;
    public static final int KW_EXCHANGE=96;
    public static final int KW_EXCLUSIVE=97;
    public static final int KW_EXISTS=98;
    public static final int KW_EXPLAIN=99;
    public static final int KW_EXPORT=100;
    public static final int KW_EXTENDED=101;
    public static final int KW_EXTERNAL=102;
    public static final int KW_FALSE=103;
    public static final int KW_FETCH=104;
    public static final int KW_FIELDS=105;
    public static final int KW_FILE=106;
    public static final int KW_FILEFORMAT=107;
    public static final int KW_FIRST=108;
    public static final int KW_FLOAT=109;
    public static final int KW_FOLLOWING=110;
    public static final int KW_FOR=111;
    public static final int KW_FORMAT=112;
    public static final int KW_FORMATTED=113;
    public static final int KW_FROM=114;
    public static final int KW_FULL=115;
    public static final int KW_FUNCTION=116;
    public static final int KW_FUNCTIONS=117;
    public static final int KW_GRANT=118;
    public static final int KW_GROUP=119;
    public static final int KW_GROUPING=120;
    public static final int KW_HAVING=121;
    public static final int KW_HOLD_DDLTIME=122;
    public static final int KW_IDXPROPERTIES=123;
    public static final int KW_IF=124;
    public static final int KW_IGNORE=125;
    public static final int KW_IMPORT=126;
    public static final int KW_IN=127;
    public static final int KW_INDEX=128;
    public static final int KW_INDEXES=129;
    public static final int KW_INNER=130;
    public static final int KW_INPATH=131;
    public static final int KW_INPUTDRIVER=132;
    public static final int KW_INPUTFORMAT=133;
    public static final int KW_INSERT=134;
    public static final int KW_INT=135;
    public static final int KW_INTERSECT=136;
    public static final int KW_INTO=137;
    public static final int KW_IS=138;
    public static final int KW_ITEMS=139;
    public static final int KW_JAR=140;
    public static final int KW_JOIN=141;
    public static final int KW_KEYS=142;
    public static final int KW_KEY_TYPE=143;
    public static final int KW_LATERAL=144;
    public static final int KW_LEFT=145;
    public static final int KW_LESS=146;
    public static final int KW_LIKE=147;
    public static final int KW_LIMIT=148;
    public static final int KW_LINES=149;
    public static final int KW_LOAD=150;
    public static final int KW_LOCAL=151;
    public static final int KW_LOCATION=152;
    public static final int KW_LOCK=153;
    public static final int KW_LOCKS=154;
    public static final int KW_LOGICAL=155;
    public static final int KW_LONG=156;
    public static final int KW_MACRO=157;
    public static final int KW_MAP=158;
    public static final int KW_MAPJOIN=159;
    public static final int KW_MATERIALIZED=160;
    public static final int KW_MINUS=161;
    public static final int KW_MORE=162;
    public static final int KW_MSCK=163;
    public static final int KW_NONE=164;
    public static final int KW_NOSCAN=165;
    public static final int KW_NOT=166;
    public static final int KW_NO_DROP=167;
    public static final int KW_NULL=168;
    public static final int KW_OF=169;
    public static final int KW_OFFLINE=170;
    public static final int KW_ON=171;
    public static final int KW_OPTION=172;
    public static final int KW_OR=173;
    public static final int KW_ORCFILE=174;
    public static final int KW_ORDER=175;
    public static final int KW_OUT=176;
    public static final int KW_OUTER=177;
    public static final int KW_OUTPUTDRIVER=178;
    public static final int KW_OUTPUTFORMAT=179;
    public static final int KW_OVER=180;
    public static final int KW_OVERWRITE=181;
    public static final int KW_OWNER=182;
    public static final int KW_PARQUETFILE=183;
    public static final int KW_PARTIALSCAN=184;
    public static final int KW_PARTITION=185;
    public static final int KW_PARTITIONED=186;
    public static final int KW_PARTITIONS=187;
    public static final int KW_PERCENT=188;
    public static final int KW_PLUS=189;
    public static final int KW_PRECEDING=190;
    public static final int KW_PRESERVE=191;
    public static final int KW_PRETTY=192;
    public static final int KW_PRINCIPALS=193;
    public static final int KW_PROCEDURE=194;
    public static final int KW_PROTECTION=195;
    public static final int KW_PURGE=196;
    public static final int KW_RANGE=197;
    public static final int KW_RCFILE=198;
    public static final int KW_READ=199;
    public static final int KW_READONLY=200;
    public static final int KW_READS=201;
    public static final int KW_REBUILD=202;
    public static final int KW_RECORDREADER=203;
    public static final int KW_RECORDWRITER=204;
    public static final int KW_REDUCE=205;
    public static final int KW_REGEXP=206;
    public static final int KW_RENAME=207;
    public static final int KW_REPAIR=208;
    public static final int KW_REPLACE=209;
    public static final int KW_RESTRICT=210;
    public static final int KW_REVOKE=211;
    public static final int KW_RIGHT=212;
    public static final int KW_RLIKE=213;
    public static final int KW_ROLE=214;
    public static final int KW_ROLES=215;
    public static final int KW_ROLLUP=216;
    public static final int KW_ROW=217;
    public static final int KW_ROWS=218;
    public static final int KW_SCHEMA=219;
    public static final int KW_SCHEMAS=220;
    public static final int KW_SELECT=221;
    public static final int KW_SEMI=222;
    public static final int KW_SEQUENCEFILE=223;
    public static final int KW_SERDE=224;
    public static final int KW_SERDEPROPERTIES=225;
    public static final int KW_SET=226;
    public static final int KW_SETS=227;
    public static final int KW_SHARED=228;
    public static final int KW_SHOW=229;
    public static final int KW_SHOW_DATABASE=230;
    public static final int KW_SKEWED=231;
    public static final int KW_SMALLINT=232;
    public static final int KW_SORT=233;
    public static final int KW_SORTED=234;
    public static final int KW_SSL=235;
    public static final int KW_STATISTICS=236;
    public static final int KW_STORED=237;
    public static final int KW_STREAMTABLE=238;
    public static final int KW_STRING=239;
    public static final int KW_STRUCT=240;
    public static final int KW_TABLE=241;
    public static final int KW_TABLES=242;
    public static final int KW_TABLESAMPLE=243;
    public static final int KW_TBLPROPERTIES=244;
    public static final int KW_TEMPORARY=245;
    public static final int KW_TERMINATED=246;
    public static final int KW_TEXTFILE=247;
    public static final int KW_THEN=248;
    public static final int KW_TIMESTAMP=249;
    public static final int KW_TINYINT=250;
    public static final int KW_TO=251;
    public static final int KW_TOUCH=252;
    public static final int KW_TRANSACTIONS=253;
    public static final int KW_TRANSFORM=254;
    public static final int KW_TRIGGER=255;
    public static final int KW_TRUE=256;
    public static final int KW_TRUNCATE=257;
    public static final int KW_UNARCHIVE=258;
    public static final int KW_UNBOUNDED=259;
    public static final int KW_UNDO=260;
    public static final int KW_UNION=261;
    public static final int KW_UNIONTYPE=262;
    public static final int KW_UNIQUEJOIN=263;
    public static final int KW_UNLOCK=264;
    public static final int KW_UNSET=265;
    public static final int KW_UNSIGNED=266;
    public static final int KW_UPDATE=267;
    public static final int KW_USE=268;
    public static final int KW_USER=269;
    public static final int KW_USING=270;
    public static final int KW_UTC=271;
    public static final int KW_UTCTIMESTAMP=272;
    public static final int KW_VALUE_TYPE=273;
    public static final int KW_VARCHAR=274;
    public static final int KW_VIEW=275;
    public static final int KW_WHEN=276;
    public static final int KW_WHERE=277;
    public static final int KW_WHILE=278;
    public static final int KW_WINDOW=279;
    public static final int KW_WITH=280;
    public static final int LCURLY=281;
    public static final int LESSTHAN=282;
    public static final int LESSTHANOREQUALTO=283;
    public static final int LPAREN=284;
    public static final int LSQUARE=285;
    public static final int Letter=286;
    public static final int MINUS=287;
    public static final int MOD=288;
    public static final int NOTEQUAL=289;
    public static final int Number=290;
    public static final int PLUS=291;
    public static final int QUESTION=292;
    public static final int QuotedIdentifier=293;
    public static final int RCURLY=294;
    public static final int RPAREN=295;
    public static final int RSQUARE=296;
    public static final int RegexComponent=297;
    public static final int SEMICOLON=298;
    public static final int STAR=299;
    public static final int SmallintLiteral=300;
    public static final int StringLiteral=301;
    public static final int TILDE=302;
    public static final int TinyintLiteral=303;
    public static final int WS=304;
    public static final int TOK_ALIASLIST=580;
    public static final int TOK_ALLCOLREF=581;
    public static final int TOK_ALTERDATABASE_OWNER=582;
    public static final int TOK_ALTERDATABASE_PROPERTIES=583;
    public static final int TOK_ALTERINDEX_PROPERTIES=584;
    public static final int TOK_ALTERINDEX_REBUILD=585;
    public static final int TOK_ALTERTABLE_ADDCOLS=586;
    public static final int TOK_ALTERTABLE_ADDPARTS=587;
    public static final int TOK_ALTERTABLE_ARCHIVE=588;
    public static final int TOK_ALTERTABLE_CHANGECOL_AFTER_POSITION=589;
    public static final int TOK_ALTERTABLE_CLUSTER_SORT=590;
    public static final int TOK_ALTERTABLE_DROPPARTS=591;
    public static final int TOK_ALTERTABLE_FILEFORMAT=592;
    public static final int TOK_ALTERTABLE_LOCATION=593;
    public static final int TOK_ALTERTABLE_MERGEFILES=594;
    public static final int TOK_ALTERTABLE_PARTCOLTYPE=595;
    public static final int TOK_ALTERTABLE_PARTITION=596;
    public static final int TOK_ALTERTABLE_PROPERTIES=597;
    public static final int TOK_ALTERTABLE_PROTECTMODE=598;
    public static final int TOK_ALTERTABLE_RENAME=599;
    public static final int TOK_ALTERTABLE_RENAMECOL=600;
    public static final int TOK_ALTERTABLE_RENAMEPART=601;
    public static final int TOK_ALTERTABLE_REPLACECOLS=602;
    public static final int TOK_ALTERTABLE_SERDEPROPERTIES=603;
    public static final int TOK_ALTERTABLE_SERIALIZER=604;
    public static final int TOK_ALTERTABLE_SKEWED=605;
    public static final int TOK_ALTERTABLE_TOUCH=606;
    public static final int TOK_ALTERTABLE_UNARCHIVE=607;
    public static final int TOK_ALTERTBLPART_SKEWED_LOCATION=608;
    public static final int TOK_ALTERVIEW_ADDPARTS=609;
    public static final int TOK_ALTERVIEW_AS=610;
    public static final int TOK_ALTERVIEW_DROPPARTS=611;
    public static final int TOK_ALTERVIEW_PROPERTIES=612;
    public static final int TOK_ALTERVIEW_RENAME=613;
    public static final int TOK_ANALYZE=614;
    public static final int TOK_ARCHIVE=615;
    public static final int TOK_BIGINT=616;
    public static final int TOK_BINARY=617;
    public static final int TOK_BOOLEAN=618;
    public static final int TOK_CASCADE=619;
    public static final int TOK_CHAR=620;
    public static final int TOK_CHARSETLITERAL=621;
    public static final int TOK_CLUSTERBY=622;
    public static final int TOK_COLTYPELIST=623;
    public static final int TOK_COMPACT=624;
    public static final int TOK_CREATEDATABASE=625;
    public static final int TOK_CREATEFUNCTION=626;
    public static final int TOK_CREATEINDEX=627;
    public static final int TOK_CREATEINDEX_INDEXTBLNAME=628;
    public static final int TOK_CREATEMACRO=629;
    public static final int TOK_CREATEROLE=630;
    public static final int TOK_CREATETABLE=631;
    public static final int TOK_CREATEVIEW=632;
    public static final int TOK_CROSSJOIN=633;
    public static final int TOK_CTE=634;
    public static final int TOK_CUBE_GROUPBY=635;
    public static final int TOK_DATABASECOMMENT=636;
    public static final int TOK_DATABASELOCATION=637;
    public static final int TOK_DATABASEPROPERTIES=638;
    public static final int TOK_DATE=639;
    public static final int TOK_DATELITERAL=640;
    public static final int TOK_DATETIME=641;
    public static final int TOK_DBPROPLIST=642;
    public static final int TOK_DB_TYPE=643;
    public static final int TOK_DECIMAL=644;
    public static final int TOK_DEFERRED_REBUILDINDEX=645;
    public static final int TOK_DESCDATABASE=646;
    public static final int TOK_DESCFUNCTION=647;
    public static final int TOK_DESCTABLE=648;
    public static final int TOK_DESTINATION=649;
    public static final int TOK_DIR=650;
    public static final int TOK_DISABLE=651;
    public static final int TOK_DISTRIBUTEBY=652;
    public static final int TOK_DOUBLE=653;
    public static final int TOK_DROPDATABASE=654;
    public static final int TOK_DROPFUNCTION=655;
    public static final int TOK_DROPINDEX=656;
    public static final int TOK_DROPMACRO=657;
    public static final int TOK_DROPROLE=658;
    public static final int TOK_DROPTABLE=659;
    public static final int TOK_DROPTABLE_PROPERTIES=660;
    public static final int TOK_DROPVIEW=661;
    public static final int TOK_DROPVIEW_PROPERTIES=662;
    public static final int TOK_ENABLE=663;
    public static final int TOK_EXCHANGEPARTITION=664;
    public static final int TOK_EXPLAIN=665;
    public static final int TOK_EXPLIST=666;
    public static final int TOK_EXPORT=667;
    public static final int TOK_FALSE=668;
    public static final int TOK_FILE=669;
    public static final int TOK_FILEFORMAT_GENERIC=670;
    public static final int TOK_FLOAT=671;
    public static final int TOK_FROM=672;
    public static final int TOK_FULLOUTERJOIN=673;
    public static final int TOK_FUNCTION=674;
    public static final int TOK_FUNCTIONDI=675;
    public static final int TOK_FUNCTIONSTAR=676;
    public static final int TOK_GRANT=677;
    public static final int TOK_GRANT_ROLE=678;
    public static final int TOK_GRANT_WITH_ADMIN_OPTION=679;
    public static final int TOK_GRANT_WITH_OPTION=680;
    public static final int TOK_GROUP=681;
    public static final int TOK_GROUPBY=682;
    public static final int TOK_GROUPING_SETS=683;
    public static final int TOK_GROUPING_SETS_EXPRESSION=684;
    public static final int TOK_HAVING=685;
    public static final int TOK_HINT=686;
    public static final int TOK_HINTARGLIST=687;
    public static final int TOK_HINTLIST=688;
    public static final int TOK_HOLD_DDLTIME=689;
    public static final int TOK_IFEXISTS=690;
    public static final int TOK_IFNOTEXISTS=691;
    public static final int TOK_IGNOREPROTECTION=692;
    public static final int TOK_IMPORT=693;
    public static final int TOK_INDEXCOMMENT=694;
    public static final int TOK_INDEXPROPERTIES=695;
    public static final int TOK_INDEXPROPLIST=696;
    public static final int TOK_INSERT=697;
    public static final int TOK_INSERT_INTO=698;
    public static final int TOK_INT=699;
    public static final int TOK_ISNOTNULL=700;
    public static final int TOK_ISNULL=701;
    public static final int TOK_JAR=702;
    public static final int TOK_JOIN=703;
    public static final int TOK_LATERAL_VIEW=704;
    public static final int TOK_LATERAL_VIEW_OUTER=705;
    public static final int TOK_LEFTOUTERJOIN=706;
    public static final int TOK_LEFTSEMIJOIN=707;
    public static final int TOK_LENGTH=708;
    public static final int TOK_LIKETABLE=709;
    public static final int TOK_LIMIT=710;
    public static final int TOK_LIST=711;
    public static final int TOK_LOAD=712;
    public static final int TOK_LOCAL_DIR=713;
    public static final int TOK_LOCKDB=714;
    public static final int TOK_LOCKTABLE=715;
    public static final int TOK_MAP=716;
    public static final int TOK_MAPJOIN=717;
    public static final int TOK_MSCK=718;
    public static final int TOK_NOT_CLUSTERED=719;
    public static final int TOK_NOT_SORTED=720;
    public static final int TOK_NO_DROP=721;
    public static final int TOK_NULL=722;
    public static final int TOK_OFFLINE=723;
    public static final int TOK_OP_ADD=724;
    public static final int TOK_OP_AND=725;
    public static final int TOK_OP_BITAND=726;
    public static final int TOK_OP_BITNOT=727;
    public static final int TOK_OP_BITOR=728;
    public static final int TOK_OP_BITXOR=729;
    public static final int TOK_OP_DIV=730;
    public static final int TOK_OP_EQ=731;
    public static final int TOK_OP_GE=732;
    public static final int TOK_OP_GT=733;
    public static final int TOK_OP_LE=734;
    public static final int TOK_OP_LIKE=735;
    public static final int TOK_OP_LT=736;
    public static final int TOK_OP_MOD=737;
    public static final int TOK_OP_MUL=738;
    public static final int TOK_OP_NE=739;
    public static final int TOK_OP_NOT=740;
    public static final int TOK_OP_OR=741;
    public static final int TOK_OP_SUB=742;
    public static final int TOK_ORDERBY=743;
    public static final int TOK_ORREPLACE=744;
    public static final int TOK_PARTITIONINGSPEC=745;
    public static final int TOK_PARTITIONLOCATION=746;
    public static final int TOK_PARTSPEC=747;
    public static final int TOK_PARTVAL=748;
    public static final int TOK_PERCENT=749;
    public static final int TOK_PRINCIPAL_NAME=750;
    public static final int TOK_PRIVILEGE=751;
    public static final int TOK_PRIVILEGE_LIST=752;
    public static final int TOK_PRIV_ALL=753;
    public static final int TOK_PRIV_ALTER_DATA=754;
    public static final int TOK_PRIV_ALTER_METADATA=755;
    public static final int TOK_PRIV_CREATE=756;
    public static final int TOK_PRIV_DELETE=757;
    public static final int TOK_PRIV_DROP=758;
    public static final int TOK_PRIV_INDEX=759;
    public static final int TOK_PRIV_INSERT=760;
    public static final int TOK_PRIV_LOCK=761;
    public static final int TOK_PRIV_OBJECT=762;
    public static final int TOK_PRIV_OBJECT_COL=763;
    public static final int TOK_PRIV_SELECT=764;
    public static final int TOK_PRIV_SHOW_DATABASE=765;
    public static final int TOK_PTBLFUNCTION=766;
    public static final int TOK_QUERY=767;
    public static final int TOK_READONLY=768;
    public static final int TOK_RECORDREADER=769;
    public static final int TOK_RECORDWRITER=770;
    public static final int TOK_RESOURCE_ALL=771;
    public static final int TOK_RESOURCE_LIST=772;
    public static final int TOK_RESOURCE_URI=773;
    public static final int TOK_RESTRICT=774;
    public static final int TOK_REVOKE=775;
    public static final int TOK_REVOKE_ROLE=776;
    public static final int TOK_RIGHTOUTERJOIN=777;
    public static final int TOK_ROLE=778;
    public static final int TOK_ROLLUP_GROUPBY=779;
    public static final int TOK_ROWCOUNT=780;
    public static final int TOK_SELECT=781;
    public static final int TOK_SELECTDI=782;
    public static final int TOK_SELEXPR=783;
    public static final int TOK_SERDE=784;
    public static final int TOK_SERDENAME=785;
    public static final int TOK_SERDEPROPS=786;
    public static final int TOK_SHOWCOLUMNS=787;
    public static final int TOK_SHOWDATABASES=788;
    public static final int TOK_SHOWDBLOCKS=789;
    public static final int TOK_SHOWFUNCTIONS=790;
    public static final int TOK_SHOWINDEXES=791;
    public static final int TOK_SHOWLOCKS=792;
    public static final int TOK_SHOWPARTITIONS=793;
    public static final int TOK_SHOWTABLES=794;
    public static final int TOK_SHOW_COMPACTIONS=795;
    public static final int TOK_SHOW_CREATETABLE=796;
    public static final int TOK_SHOW_GRANT=797;
    public static final int TOK_SHOW_ROLES=798;
    public static final int TOK_SHOW_ROLE_GRANT=799;
    public static final int TOK_SHOW_ROLE_PRINCIPALS=800;
    public static final int TOK_SHOW_SET_ROLE=801;
    public static final int TOK_SHOW_TABLESTATUS=802;
    public static final int TOK_SHOW_TBLPROPERTIES=803;
    public static final int TOK_SHOW_TRANSACTIONS=804;
    public static final int TOK_SKEWED_LOCATIONS=805;
    public static final int TOK_SKEWED_LOCATION_LIST=806;
    public static final int TOK_SKEWED_LOCATION_MAP=807;
    public static final int TOK_SMALLINT=808;
    public static final int TOK_SORTBY=809;
    public static final int TOK_STORAGEHANDLER=810;
    public static final int TOK_STOREDASDIRS=811;
    public static final int TOK_STREAMTABLE=812;
    public static final int TOK_STRING=813;
    public static final int TOK_STRINGLITERALSEQUENCE=814;
    public static final int TOK_STRUCT=815;
    public static final int TOK_SUBQUERY=816;
    public static final int TOK_SUBQUERY_EXPR=817;
    public static final int TOK_SUBQUERY_OP=818;
    public static final int TOK_SUBQUERY_OP_NOTEXISTS=819;
    public static final int TOK_SUBQUERY_OP_NOTIN=820;
    public static final int TOK_SWITCHDATABASE=821;
    public static final int TOK_TAB=822;
    public static final int TOK_TABALIAS=823;
    public static final int TOK_TABCOL=824;
    public static final int TOK_TABCOLLIST=825;
    public static final int TOK_TABCOLNAME=826;
    public static final int TOK_TABCOLVALUE=827;
    public static final int TOK_TABCOLVALUES=828;
    public static final int TOK_TABCOLVALUE_PAIR=829;
    public static final int TOK_TABLEBUCKETS=830;
    public static final int TOK_TABLEBUCKETSAMPLE=831;
    public static final int TOK_TABLECOMMENT=832;
    public static final int TOK_TABLEFILEFORMAT=833;
    public static final int TOK_TABLELOCATION=834;
    public static final int TOK_TABLEPARTCOLS=835;
    public static final int TOK_TABLEPROPERTIES=836;
    public static final int TOK_TABLEPROPERTY=837;
    public static final int TOK_TABLEPROPLIST=838;
    public static final int TOK_TABLEROWFORMAT=839;
    public static final int TOK_TABLEROWFORMATCOLLITEMS=840;
    public static final int TOK_TABLEROWFORMATFIELD=841;
    public static final int TOK_TABLEROWFORMATLINES=842;
    public static final int TOK_TABLEROWFORMATMAPKEYS=843;
    public static final int TOK_TABLEROWFORMATNULL=844;
    public static final int TOK_TABLESERIALIZER=845;
    public static final int TOK_TABLESKEWED=846;
    public static final int TOK_TABLESPLITSAMPLE=847;
    public static final int TOK_TABLE_OR_COL=848;
    public static final int TOK_TABLE_PARTITION=849;
    public static final int TOK_TABLE_TYPE=850;
    public static final int TOK_TABNAME=851;
    public static final int TOK_TABREF=852;
    public static final int TOK_TABSORTCOLNAMEASC=853;
    public static final int TOK_TABSORTCOLNAMEDESC=854;
    public static final int TOK_TABSRC=855;
    public static final int TOK_TABTYPE=856;
    public static final int TOK_TBLORCFILE=857;
    public static final int TOK_TBLPARQUETFILE=858;
    public static final int TOK_TBLRCFILE=859;
    public static final int TOK_TBLSEQUENCEFILE=860;
    public static final int TOK_TBLTEXTFILE=861;
    public static final int TOK_TEMPORARY=862;
    public static final int TOK_TIMESTAMP=863;
    public static final int TOK_TINYINT=864;
    public static final int TOK_TMP_FILE=865;
    public static final int TOK_TRANSFORM=866;
    public static final int TOK_TRUE=867;
    public static final int TOK_TRUNCATETABLE=868;
    public static final int TOK_UNION=869;
    public static final int TOK_UNIONTYPE=870;
    public static final int TOK_UNIQUEJOIN=871;
    public static final int TOK_UNLOCKDB=872;
    public static final int TOK_UNLOCKTABLE=873;
    public static final int TOK_USER=874;
    public static final int TOK_USERSCRIPTCOLNAMES=875;
    public static final int TOK_USERSCRIPTCOLSCHEMA=876;
    public static final int TOK_VARCHAR=877;
    public static final int TOK_VIEWPARTCOLS=878;
    public static final int TOK_WHERE=879;
    public static final int TOK_WINDOWDEF=880;
    public static final int TOK_WINDOWRANGE=881;
    public static final int TOK_WINDOWSPEC=882;
    public static final int TOK_WINDOWVALUES=883;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators
    public HiveParser gHiveParser;
    public HiveParser gParent;


    public HiveParser_IdentifiersParser(TokenStream input, HiveParser gHiveParser) {
        this(input, new RecognizerSharedState(), gHiveParser);
    }
    public HiveParser_IdentifiersParser(TokenStream input, RecognizerSharedState state, HiveParser gHiveParser) {
        super(input, state);
        this.gHiveParser = gHiveParser;
        gParent = gHiveParser;
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return HiveParser.tokenNames; }
    public String getGrammarFileName() { return "IdentifiersParser.g"; }


      @Override
      public Object recoverFromMismatchedSet(IntStream input,
          RecognitionException re, BitSet follow) throws RecognitionException {
        throw re;
      }
      @Override
      public void displayRecognitionError(String[] tokenNames,
          RecognitionException e) {
        gParent.errors.add(new ParseError(gParent, e, tokenNames));
      }


    public static class groupByClause_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "groupByClause"
    // IdentifiersParser.g:49:1: groupByClause : KW_GROUP KW_BY groupByExpression ( COMMA groupByExpression )* ( (rollup= KW_WITH KW_ROLLUP ) | (cube= KW_WITH KW_CUBE ) )? (sets= KW_GROUPING KW_SETS LPAREN groupingSetExpression ( COMMA groupingSetExpression )* RPAREN )? -> {rollup != null}? ^( TOK_ROLLUP_GROUPBY ( groupByExpression )+ ) -> {cube != null}? ^( TOK_CUBE_GROUPBY ( groupByExpression )+ ) -> {sets != null}? ^( TOK_GROUPING_SETS ( groupByExpression )+ ( groupingSetExpression )+ ) -> ^( TOK_GROUPBY ( groupByExpression )+ ) ;
    public final HiveParser_IdentifiersParser.groupByClause_return groupByClause() throws RecognitionException {
        HiveParser_IdentifiersParser.groupByClause_return retval = new HiveParser_IdentifiersParser.groupByClause_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token rollup=null;
        Token cube=null;
        Token sets=null;
        Token KW_GROUP1=null;
        Token KW_BY2=null;
        Token COMMA4=null;
        Token KW_ROLLUP6=null;
        Token KW_CUBE7=null;
        Token KW_SETS8=null;
        Token LPAREN9=null;
        Token COMMA11=null;
        Token RPAREN13=null;
        HiveParser_IdentifiersParser.groupByExpression_return groupByExpression3 =null;

        HiveParser_IdentifiersParser.groupByExpression_return groupByExpression5 =null;

        HiveParser_IdentifiersParser.groupingSetExpression_return groupingSetExpression10 =null;

        HiveParser_IdentifiersParser.groupingSetExpression_return groupingSetExpression12 =null;


        CommonTree rollup_tree=null;
        CommonTree cube_tree=null;
        CommonTree sets_tree=null;
        CommonTree KW_GROUP1_tree=null;
        CommonTree KW_BY2_tree=null;
        CommonTree COMMA4_tree=null;
        CommonTree KW_ROLLUP6_tree=null;
        CommonTree KW_CUBE7_tree=null;
        CommonTree KW_SETS8_tree=null;
        CommonTree LPAREN9_tree=null;
        CommonTree COMMA11_tree=null;
        CommonTree RPAREN13_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_KW_GROUPING=new RewriteRuleTokenStream(adaptor,"token KW_GROUPING");
        RewriteRuleTokenStream stream_KW_CUBE=new RewriteRuleTokenStream(adaptor,"token KW_CUBE");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_KW_ROLLUP=new RewriteRuleTokenStream(adaptor,"token KW_ROLLUP");
        RewriteRuleTokenStream stream_KW_WITH=new RewriteRuleTokenStream(adaptor,"token KW_WITH");
        RewriteRuleTokenStream stream_KW_GROUP=new RewriteRuleTokenStream(adaptor,"token KW_GROUP");
        RewriteRuleTokenStream stream_KW_SETS=new RewriteRuleTokenStream(adaptor,"token KW_SETS");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleTokenStream stream_KW_BY=new RewriteRuleTokenStream(adaptor,"token KW_BY");
        RewriteRuleSubtreeStream stream_groupingSetExpression=new RewriteRuleSubtreeStream(adaptor,"rule groupingSetExpression");
        RewriteRuleSubtreeStream stream_groupByExpression=new RewriteRuleSubtreeStream(adaptor,"rule groupByExpression");
         gParent.pushMsg("group by clause", state); 
        try {
            // IdentifiersParser.g:52:5: ( KW_GROUP KW_BY groupByExpression ( COMMA groupByExpression )* ( (rollup= KW_WITH KW_ROLLUP ) | (cube= KW_WITH KW_CUBE ) )? (sets= KW_GROUPING KW_SETS LPAREN groupingSetExpression ( COMMA groupingSetExpression )* RPAREN )? -> {rollup != null}? ^( TOK_ROLLUP_GROUPBY ( groupByExpression )+ ) -> {cube != null}? ^( TOK_CUBE_GROUPBY ( groupByExpression )+ ) -> {sets != null}? ^( TOK_GROUPING_SETS ( groupByExpression )+ ( groupingSetExpression )+ ) -> ^( TOK_GROUPBY ( groupByExpression )+ ) )
            // IdentifiersParser.g:53:5: KW_GROUP KW_BY groupByExpression ( COMMA groupByExpression )* ( (rollup= KW_WITH KW_ROLLUP ) | (cube= KW_WITH KW_CUBE ) )? (sets= KW_GROUPING KW_SETS LPAREN groupingSetExpression ( COMMA groupingSetExpression )* RPAREN )?
            {
            KW_GROUP1=(Token)match(input,KW_GROUP,FOLLOW_KW_GROUP_in_groupByClause72); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_GROUP.add(KW_GROUP1);


            KW_BY2=(Token)match(input,KW_BY,FOLLOW_KW_BY_in_groupByClause74); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_BY.add(KW_BY2);


            pushFollow(FOLLOW_groupByExpression_in_groupByClause80);
            groupByExpression3=groupByExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_groupByExpression.add(groupByExpression3.getTree());

            // IdentifiersParser.g:55:5: ( COMMA groupByExpression )*
            loop1:
            do {
                int alt1=2;
                switch ( input.LA(1) ) {
                case COMMA:
                    {
                    alt1=1;
                    }
                    break;

                }

                switch (alt1) {
            	case 1 :
            	    // IdentifiersParser.g:55:7: COMMA groupByExpression
            	    {
            	    COMMA4=(Token)match(input,COMMA,FOLLOW_COMMA_in_groupByClause88); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA4);


            	    pushFollow(FOLLOW_groupByExpression_in_groupByClause90);
            	    groupByExpression5=groupByExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_groupByExpression.add(groupByExpression5.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            // IdentifiersParser.g:56:5: ( (rollup= KW_WITH KW_ROLLUP ) | (cube= KW_WITH KW_CUBE ) )?
            int alt2=3;
            switch ( input.LA(1) ) {
                case KW_WITH:
                    {
                    switch ( input.LA(2) ) {
                        case KW_ROLLUP:
                            {
                            alt2=1;
                            }
                            break;
                        case KW_CUBE:
                            {
                            alt2=2;
                            }
                            break;
                    }

                    }
                    break;
            }

            switch (alt2) {
                case 1 :
                    // IdentifiersParser.g:56:6: (rollup= KW_WITH KW_ROLLUP )
                    {
                    // IdentifiersParser.g:56:6: (rollup= KW_WITH KW_ROLLUP )
                    // IdentifiersParser.g:56:7: rollup= KW_WITH KW_ROLLUP
                    {
                    rollup=(Token)match(input,KW_WITH,FOLLOW_KW_WITH_in_groupByClause103); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_WITH.add(rollup);


                    KW_ROLLUP6=(Token)match(input,KW_ROLLUP,FOLLOW_KW_ROLLUP_in_groupByClause105); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_ROLLUP.add(KW_ROLLUP6);


                    }


                    }
                    break;
                case 2 :
                    // IdentifiersParser.g:56:35: (cube= KW_WITH KW_CUBE )
                    {
                    // IdentifiersParser.g:56:35: (cube= KW_WITH KW_CUBE )
                    // IdentifiersParser.g:56:36: cube= KW_WITH KW_CUBE
                    {
                    cube=(Token)match(input,KW_WITH,FOLLOW_KW_WITH_in_groupByClause113); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_WITH.add(cube);


                    KW_CUBE7=(Token)match(input,KW_CUBE,FOLLOW_KW_CUBE_in_groupByClause115); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_CUBE.add(KW_CUBE7);


                    }


                    }
                    break;

            }


            // IdentifiersParser.g:57:5: (sets= KW_GROUPING KW_SETS LPAREN groupingSetExpression ( COMMA groupingSetExpression )* RPAREN )?
            int alt4=2;
            switch ( input.LA(1) ) {
                case KW_GROUPING:
                    {
                    alt4=1;
                    }
                    break;
            }

            switch (alt4) {
                case 1 :
                    // IdentifiersParser.g:57:6: sets= KW_GROUPING KW_SETS LPAREN groupingSetExpression ( COMMA groupingSetExpression )* RPAREN
                    {
                    sets=(Token)match(input,KW_GROUPING,FOLLOW_KW_GROUPING_in_groupByClause128); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_GROUPING.add(sets);


                    KW_SETS8=(Token)match(input,KW_SETS,FOLLOW_KW_SETS_in_groupByClause130); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_SETS.add(KW_SETS8);


                    LPAREN9=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_groupByClause137); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN9);


                    pushFollow(FOLLOW_groupingSetExpression_in_groupByClause139);
                    groupingSetExpression10=groupingSetExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_groupingSetExpression.add(groupingSetExpression10.getTree());

                    // IdentifiersParser.g:58:34: ( COMMA groupingSetExpression )*
                    loop3:
                    do {
                        int alt3=2;
                        switch ( input.LA(1) ) {
                        case COMMA:
                            {
                            alt3=1;
                            }
                            break;

                        }

                        switch (alt3) {
                    	case 1 :
                    	    // IdentifiersParser.g:58:36: COMMA groupingSetExpression
                    	    {
                    	    COMMA11=(Token)match(input,COMMA,FOLLOW_COMMA_in_groupByClause143); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA11);


                    	    pushFollow(FOLLOW_groupingSetExpression_in_groupByClause145);
                    	    groupingSetExpression12=groupingSetExpression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_groupingSetExpression.add(groupingSetExpression12.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);


                    RPAREN13=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_groupByClause150); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN13);


                    }
                    break;

            }


            // AST REWRITE
            // elements: groupByExpression, groupByExpression, groupingSetExpression, groupByExpression, groupByExpression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 59:5: -> {rollup != null}? ^( TOK_ROLLUP_GROUPBY ( groupByExpression )+ )
            if (rollup != null) {
                // IdentifiersParser.g:59:26: ^( TOK_ROLLUP_GROUPBY ( groupByExpression )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(TOK_ROLLUP_GROUPBY, "TOK_ROLLUP_GROUPBY")
                , root_1);

                if ( !(stream_groupByExpression.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_groupByExpression.hasNext() ) {
                    adaptor.addChild(root_1, stream_groupByExpression.nextTree());

                }
                stream_groupByExpression.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            else // 60:5: -> {cube != null}? ^( TOK_CUBE_GROUPBY ( groupByExpression )+ )
            if (cube != null) {
                // IdentifiersParser.g:60:24: ^( TOK_CUBE_GROUPBY ( groupByExpression )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(TOK_CUBE_GROUPBY, "TOK_CUBE_GROUPBY")
                , root_1);

                if ( !(stream_groupByExpression.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_groupByExpression.hasNext() ) {
                    adaptor.addChild(root_1, stream_groupByExpression.nextTree());

                }
                stream_groupByExpression.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            else // 61:5: -> {sets != null}? ^( TOK_GROUPING_SETS ( groupByExpression )+ ( groupingSetExpression )+ )
            if (sets != null) {
                // IdentifiersParser.g:61:24: ^( TOK_GROUPING_SETS ( groupByExpression )+ ( groupingSetExpression )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(TOK_GROUPING_SETS, "TOK_GROUPING_SETS")
                , root_1);

                if ( !(stream_groupByExpression.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_groupByExpression.hasNext() ) {
                    adaptor.addChild(root_1, stream_groupByExpression.nextTree());

                }
                stream_groupByExpression.reset();

                if ( !(stream_groupingSetExpression.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_groupingSetExpression.hasNext() ) {
                    adaptor.addChild(root_1, stream_groupingSetExpression.nextTree());

                }
                stream_groupingSetExpression.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            else // 62:5: -> ^( TOK_GROUPBY ( groupByExpression )+ )
            {
                // IdentifiersParser.g:62:8: ^( TOK_GROUPBY ( groupByExpression )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(TOK_GROUPBY, "TOK_GROUPBY")
                , root_1);

                if ( !(stream_groupByExpression.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_groupByExpression.hasNext() ) {
                    adaptor.addChild(root_1, stream_groupByExpression.nextTree());

                }
                stream_groupByExpression.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) { gParent.popMsg(state); }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "groupByClause"


    public static class groupingSetExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "groupingSetExpression"
    // IdentifiersParser.g:65:1: groupingSetExpression : ( groupByExpression -> ^( TOK_GROUPING_SETS_EXPRESSION groupByExpression ) | LPAREN groupByExpression ( COMMA groupByExpression )* RPAREN -> ^( TOK_GROUPING_SETS_EXPRESSION ( groupByExpression )+ ) | LPAREN RPAREN -> ^( TOK_GROUPING_SETS_EXPRESSION ) );
    public final HiveParser_IdentifiersParser.groupingSetExpression_return groupingSetExpression() throws RecognitionException {
        HiveParser_IdentifiersParser.groupingSetExpression_return retval = new HiveParser_IdentifiersParser.groupingSetExpression_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token LPAREN15=null;
        Token COMMA17=null;
        Token RPAREN19=null;
        Token LPAREN20=null;
        Token RPAREN21=null;
        HiveParser_IdentifiersParser.groupByExpression_return groupByExpression14 =null;

        HiveParser_IdentifiersParser.groupByExpression_return groupByExpression16 =null;

        HiveParser_IdentifiersParser.groupByExpression_return groupByExpression18 =null;


        CommonTree LPAREN15_tree=null;
        CommonTree COMMA17_tree=null;
        CommonTree RPAREN19_tree=null;
        CommonTree LPAREN20_tree=null;
        CommonTree RPAREN21_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_groupByExpression=new RewriteRuleSubtreeStream(adaptor,"rule groupByExpression");
        gParent.pushMsg("grouping set expression", state); 
        try {
            // IdentifiersParser.g:68:4: ( groupByExpression -> ^( TOK_GROUPING_SETS_EXPRESSION groupByExpression ) | LPAREN groupByExpression ( COMMA groupByExpression )* RPAREN -> ^( TOK_GROUPING_SETS_EXPRESSION ( groupByExpression )+ ) | LPAREN RPAREN -> ^( TOK_GROUPING_SETS_EXPRESSION ) )
            int alt6=3;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // IdentifiersParser.g:69:4: groupByExpression
                    {
                    pushFollow(FOLLOW_groupByExpression_in_groupingSetExpression244);
                    groupByExpression14=groupByExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_groupByExpression.add(groupByExpression14.getTree());

                    // AST REWRITE
                    // elements: groupByExpression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 70:4: -> ^( TOK_GROUPING_SETS_EXPRESSION groupByExpression )
                    {
                        // IdentifiersParser.g:70:7: ^( TOK_GROUPING_SETS_EXPRESSION groupByExpression )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(TOK_GROUPING_SETS_EXPRESSION, "TOK_GROUPING_SETS_EXPRESSION")
                        , root_1);

                        adaptor.addChild(root_1, stream_groupByExpression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // IdentifiersParser.g:72:4: LPAREN groupByExpression ( COMMA groupByExpression )* RPAREN
                    {
                    LPAREN15=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_groupingSetExpression265); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN15);


                    pushFollow(FOLLOW_groupByExpression_in_groupingSetExpression271);
                    groupByExpression16=groupByExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_groupByExpression.add(groupByExpression16.getTree());

                    // IdentifiersParser.g:73:22: ( COMMA groupByExpression )*
                    loop5:
                    do {
                        int alt5=2;
                        switch ( input.LA(1) ) {
                        case COMMA:
                            {
                            alt5=1;
                            }
                            break;

                        }

                        switch (alt5) {
                    	case 1 :
                    	    // IdentifiersParser.g:73:23: COMMA groupByExpression
                    	    {
                    	    COMMA17=(Token)match(input,COMMA,FOLLOW_COMMA_in_groupingSetExpression274); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA17);


                    	    pushFollow(FOLLOW_groupByExpression_in_groupingSetExpression276);
                    	    groupByExpression18=groupByExpression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_groupByExpression.add(groupByExpression18.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    RPAREN19=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_groupingSetExpression283); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN19);


                    // AST REWRITE
                    // elements: groupByExpression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 75:4: -> ^( TOK_GROUPING_SETS_EXPRESSION ( groupByExpression )+ )
                    {
                        // IdentifiersParser.g:75:7: ^( TOK_GROUPING_SETS_EXPRESSION ( groupByExpression )+ )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(TOK_GROUPING_SETS_EXPRESSION, "TOK_GROUPING_SETS_EXPRESSION")
                        , root_1);

                        if ( !(stream_groupByExpression.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_groupByExpression.hasNext() ) {
                            adaptor.addChild(root_1, stream_groupByExpression.nextTree());

                        }
                        stream_groupByExpression.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 3 :
                    // IdentifiersParser.g:77:4: LPAREN RPAREN
                    {
                    LPAREN20=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_groupingSetExpression305); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN20);


                    RPAREN21=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_groupingSetExpression310); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN21);


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 79:4: -> ^( TOK_GROUPING_SETS_EXPRESSION )
                    {
                        // IdentifiersParser.g:79:7: ^( TOK_GROUPING_SETS_EXPRESSION )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(TOK_GROUPING_SETS_EXPRESSION, "TOK_GROUPING_SETS_EXPRESSION")
                        , root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) {gParent.popMsg(state); }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "groupingSetExpression"


    public static class groupByExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "groupByExpression"
    // IdentifiersParser.g:83:1: groupByExpression : expression ;
    public final HiveParser_IdentifiersParser.groupByExpression_return groupByExpression() throws RecognitionException {
        HiveParser_IdentifiersParser.groupByExpression_return retval = new HiveParser_IdentifiersParser.groupByExpression_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        HiveParser_IdentifiersParser.expression_return expression22 =null;



         gParent.pushMsg("group by expression", state); 
        try {
            // IdentifiersParser.g:86:5: ( expression )
            // IdentifiersParser.g:87:5: expression
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_expression_in_groupByExpression350);
            expression22=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression22.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) { gParent.popMsg(state); }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "groupByExpression"


    public static class havingClause_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "havingClause"
    // IdentifiersParser.g:90:1: havingClause : KW_HAVING havingCondition -> ^( TOK_HAVING havingCondition ) ;
    public final HiveParser_IdentifiersParser.havingClause_return havingClause() throws RecognitionException {
        HiveParser_IdentifiersParser.havingClause_return retval = new HiveParser_IdentifiersParser.havingClause_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token KW_HAVING23=null;
        HiveParser_IdentifiersParser.havingCondition_return havingCondition24 =null;


        CommonTree KW_HAVING23_tree=null;
        RewriteRuleTokenStream stream_KW_HAVING=new RewriteRuleTokenStream(adaptor,"token KW_HAVING");
        RewriteRuleSubtreeStream stream_havingCondition=new RewriteRuleSubtreeStream(adaptor,"rule havingCondition");
         gParent.pushMsg("having clause", state); 
        try {
            // IdentifiersParser.g:93:5: ( KW_HAVING havingCondition -> ^( TOK_HAVING havingCondition ) )
            // IdentifiersParser.g:94:5: KW_HAVING havingCondition
            {
            KW_HAVING23=(Token)match(input,KW_HAVING,FOLLOW_KW_HAVING_in_havingClause381); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_HAVING.add(KW_HAVING23);


            pushFollow(FOLLOW_havingCondition_in_havingClause383);
            havingCondition24=havingCondition();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_havingCondition.add(havingCondition24.getTree());

            // AST REWRITE
            // elements: havingCondition
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 94:31: -> ^( TOK_HAVING havingCondition )
            {
                // IdentifiersParser.g:94:34: ^( TOK_HAVING havingCondition )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(TOK_HAVING, "TOK_HAVING")
                , root_1);

                adaptor.addChild(root_1, stream_havingCondition.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) { gParent.popMsg(state); }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "havingClause"


    public static class havingCondition_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "havingCondition"
    // IdentifiersParser.g:97:1: havingCondition : expression ;
    public final HiveParser_IdentifiersParser.havingCondition_return havingCondition() throws RecognitionException {
        HiveParser_IdentifiersParser.havingCondition_return retval = new HiveParser_IdentifiersParser.havingCondition_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        HiveParser_IdentifiersParser.expression_return expression25 =null;



         gParent.pushMsg("having condition", state); 
        try {
            // IdentifiersParser.g:100:5: ( expression )
            // IdentifiersParser.g:101:5: expression
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_expression_in_havingCondition422);
            expression25=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression25.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) { gParent.popMsg(state); }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "havingCondition"


    public static class orderByClause_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "orderByClause"
    // IdentifiersParser.g:105:1: orderByClause : ( KW_ORDER KW_BY LPAREN columnRefOrder ( COMMA columnRefOrder )* RPAREN -> ^( TOK_ORDERBY ( columnRefOrder )+ ) | KW_ORDER KW_BY columnRefOrder ( COMMA columnRefOrder )* -> ^( TOK_ORDERBY ( columnRefOrder )+ ) );
    public final HiveParser_IdentifiersParser.orderByClause_return orderByClause() throws RecognitionException {
        HiveParser_IdentifiersParser.orderByClause_return retval = new HiveParser_IdentifiersParser.orderByClause_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token KW_ORDER26=null;
        Token KW_BY27=null;
        Token LPAREN28=null;
        Token COMMA30=null;
        Token RPAREN32=null;
        Token KW_ORDER33=null;
        Token KW_BY34=null;
        Token COMMA36=null;
        HiveParser.columnRefOrder_return columnRefOrder29 =null;

        HiveParser.columnRefOrder_return columnRefOrder31 =null;

        HiveParser.columnRefOrder_return columnRefOrder35 =null;

        HiveParser.columnRefOrder_return columnRefOrder37 =null;


        CommonTree KW_ORDER26_tree=null;
        CommonTree KW_BY27_tree=null;
        CommonTree LPAREN28_tree=null;
        CommonTree COMMA30_tree=null;
        CommonTree RPAREN32_tree=null;
        CommonTree KW_ORDER33_tree=null;
        CommonTree KW_BY34_tree=null;
        CommonTree COMMA36_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleTokenStream stream_KW_ORDER=new RewriteRuleTokenStream(adaptor,"token KW_ORDER");
        RewriteRuleTokenStream stream_KW_BY=new RewriteRuleTokenStream(adaptor,"token KW_BY");
        RewriteRuleSubtreeStream stream_columnRefOrder=new RewriteRuleSubtreeStream(adaptor,"rule columnRefOrder");
         gParent.pushMsg("order by clause", state); 
        try {
            // IdentifiersParser.g:108:5: ( KW_ORDER KW_BY LPAREN columnRefOrder ( COMMA columnRefOrder )* RPAREN -> ^( TOK_ORDERBY ( columnRefOrder )+ ) | KW_ORDER KW_BY columnRefOrder ( COMMA columnRefOrder )* -> ^( TOK_ORDERBY ( columnRefOrder )+ ) )
            int alt9=2;
            switch ( input.LA(1) ) {
            case KW_ORDER:
                {
                switch ( input.LA(2) ) {
                case KW_BY:
                    {
                    switch ( input.LA(3) ) {
                    case LPAREN:
                        {
                        alt9=1;
                        }
                        break;
                    case BigintLiteral:
                    case CharSetName:
                    case DecimalLiteral:
                    case Identifier:
                    case KW_ADD:
                    case KW_ADMIN:
                    case KW_AFTER:
                    case KW_ALL:
                    case KW_ALTER:
                    case KW_ANALYZE:
                    case KW_ARCHIVE:
                    case KW_ARRAY:
                    case KW_AS:
                    case KW_ASC:
                    case KW_BEFORE:
                    case KW_BETWEEN:
                    case KW_BIGINT:
                    case KW_BINARY:
                    case KW_BOOLEAN:
                    case KW_BOTH:
                    case KW_BUCKET:
                    case KW_BUCKETS:
                    case KW_BY:
                    case KW_CASCADE:
                    case KW_CASE:
                    case KW_CAST:
                    case KW_CHANGE:
                    case KW_CLUSTER:
                    case KW_CLUSTERED:
                    case KW_CLUSTERSTATUS:
                    case KW_COLLECTION:
                    case KW_COLUMNS:
                    case KW_COMMENT:
                    case KW_COMPACT:
                    case KW_COMPACTIONS:
                    case KW_COMPUTE:
                    case KW_CONCATENATE:
                    case KW_CONTINUE:
                    case KW_CREATE:
                    case KW_CUBE:
                    case KW_CURSOR:
                    case KW_DATA:
                    case KW_DATABASES:
                    case KW_DATE:
                    case KW_DATETIME:
                    case KW_DBPROPERTIES:
                    case KW_DECIMAL:
                    case KW_DEFAULT:
                    case KW_DEFERRED:
                    case KW_DEFINED:
                    case KW_DELETE:
                    case KW_DELIMITED:
                    case KW_DEPENDENCY:
                    case KW_DESC:
                    case KW_DESCRIBE:
                    case KW_DIRECTORIES:
                    case KW_DIRECTORY:
                    case KW_DISABLE:
                    case KW_DISTRIBUTE:
                    case KW_DOUBLE:
                    case KW_DROP:
                    case KW_ELEM_TYPE:
                    case KW_ENABLE:
                    case KW_ESCAPED:
                    case KW_EXCLUSIVE:
                    case KW_EXISTS:
                    case KW_EXPLAIN:
                    case KW_EXPORT:
                    case KW_EXTERNAL:
                    case KW_FALSE:
                    case KW_FETCH:
                    case KW_FIELDS:
                    case KW_FILE:
                    case KW_FILEFORMAT:
                    case KW_FIRST:
                    case KW_FLOAT:
                    case KW_FOR:
                    case KW_FORMAT:
                    case KW_FORMATTED:
                    case KW_FULL:
                    case KW_FUNCTIONS:
                    case KW_GRANT:
                    case KW_GROUP:
                    case KW_GROUPING:
                    case KW_HOLD_DDLTIME:
                    case KW_IDXPROPERTIES:
                    case KW_IF:
                    case KW_IGNORE:
                    case KW_IMPORT:
                    case KW_IN:
                    case KW_INDEX:
                    case KW_INDEXES:
                    case KW_INNER:
                    case KW_INPATH:
                    case KW_INPUTDRIVER:
                    case KW_INPUTFORMAT:
                    case KW_INSERT:
                    case KW_INT:
                    case KW_INTERSECT:
                    case KW_INTO:
                    case KW_IS:
                    case KW_ITEMS:
                    case KW_JAR:
                    case KW_KEYS:
                    case KW_KEY_TYPE:
                    case KW_LATERAL:
                    case KW_LEFT:
                    case KW_LIKE:
                    case KW_LIMIT:
                    case KW_LINES:
                    case KW_LOAD:
                    case KW_LOCAL:
                    case KW_LOCATION:
                    case KW_LOCK:
                    case KW_LOCKS:
                    case KW_LOGICAL:
                    case KW_LONG:
                    case KW_MAP:
                    case KW_MAPJOIN:
                    case KW_MATERIALIZED:
                    case KW_MINUS:
                    case KW_MSCK:
                    case KW_NONE:
                    case KW_NOSCAN:
                    case KW_NOT:
                    case KW_NO_DROP:
                    case KW_NULL:
                    case KW_OF:
                    case KW_OFFLINE:
                    case KW_OPTION:
                    case KW_ORCFILE:
                    case KW_ORDER:
                    case KW_OUT:
                    case KW_OUTER:
                    case KW_OUTPUTDRIVER:
                    case KW_OUTPUTFORMAT:
                    case KW_OVERWRITE:
                    case KW_OWNER:
                    case KW_PARQUETFILE:
                    case KW_PARTITION:
                    case KW_PARTITIONED:
                    case KW_PARTITIONS:
                    case KW_PERCENT:
                    case KW_PLUS:
                    case KW_PRETTY:
                    case KW_PRINCIPALS:
                    case KW_PROCEDURE:
                    case KW_PROTECTION:
                    case KW_PURGE:
                    case KW_RANGE:
                    case KW_RCFILE:
                    case KW_READ:
                    case KW_READONLY:
                    case KW_READS:
                    case KW_REBUILD:
                    case KW_RECORDREADER:
                    case KW_RECORDWRITER:
                    case KW_REGEXP:
                    case KW_RENAME:
                    case KW_REPAIR:
                    case KW_REPLACE:
                    case KW_RESTRICT:
                    case KW_REVOKE:
                    case KW_RIGHT:
                    case KW_RLIKE:
                    case KW_ROLE:
                    case KW_ROLES:
                    case KW_ROLLUP:
                    case KW_ROW:
                    case KW_ROWS:
                    case KW_SCHEMA:
                    case KW_SCHEMAS:
                    case KW_SEMI:
                    case KW_SEQUENCEFILE:
                    case KW_SERDE:
                    case KW_SERDEPROPERTIES:
                    case KW_SET:
                    case KW_SETS:
                    case KW_SHARED:
                    case KW_SHOW:
                    case KW_SHOW_DATABASE:
                    case KW_SKEWED:
                    case KW_SMALLINT:
                    case KW_SORT:
                    case KW_SORTED:
                    case KW_SSL:
                    case KW_STATISTICS:
                    case KW_STORED:
                    case KW_STREAMTABLE:
                    case KW_STRING:
                    case KW_STRUCT:
                    case KW_TABLE:
                    case KW_TABLES:
                    case KW_TBLPROPERTIES:
                    case KW_TEMPORARY:
                    case KW_TERMINATED:
                    case KW_TEXTFILE:
                    case KW_TIMESTAMP:
                    case KW_TINYINT:
                    case KW_TO:
                    case KW_TOUCH:
                    case KW_TRANSACTIONS:
                    case KW_TRIGGER:
                    case KW_TRUE:
                    case KW_TRUNCATE:
                    case KW_UNARCHIVE:
                    case KW_UNDO:
                    case KW_UNION:
                    case KW_UNIONTYPE:
                    case KW_UNLOCK:
                    case KW_UNSET:
                    case KW_UNSIGNED:
                    case KW_UPDATE:
                    case KW_USE:
                    case KW_USER:
                    case KW_USING:
                    case KW_UTC:
                    case KW_UTCTIMESTAMP:
                    case KW_VALUE_TYPE:
                    case KW_VIEW:
                    case KW_WHILE:
                    case KW_WITH:
                    case MINUS:
                    case Number:
                    case PLUS:
                    case SmallintLiteral:
                    case StringLiteral:
                    case TILDE:
                    case TinyintLiteral:
                        {
                        alt9=2;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 9, 2, input);

                        throw nvae;

                    }

                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;

                }

                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;

            }

            switch (alt9) {
                case 1 :
                    // IdentifiersParser.g:109:5: KW_ORDER KW_BY LPAREN columnRefOrder ( COMMA columnRefOrder )* RPAREN
                    {
                    KW_ORDER26=(Token)match(input,KW_ORDER,FOLLOW_KW_ORDER_in_orderByClause454); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_ORDER.add(KW_ORDER26);


                    KW_BY27=(Token)match(input,KW_BY,FOLLOW_KW_BY_in_orderByClause456); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_BY.add(KW_BY27);


                    LPAREN28=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_orderByClause462); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN28);


                    pushFollow(FOLLOW_columnRefOrder_in_orderByClause464);
                    columnRefOrder29=gHiveParser.columnRefOrder();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_columnRefOrder.add(columnRefOrder29.getTree());

                    // IdentifiersParser.g:111:5: ( COMMA columnRefOrder )*
                    loop7:
                    do {
                        int alt7=2;
                        switch ( input.LA(1) ) {
                        case COMMA:
                            {
                            alt7=1;
                            }
                            break;

                        }

                        switch (alt7) {
                    	case 1 :
                    	    // IdentifiersParser.g:111:7: COMMA columnRefOrder
                    	    {
                    	    COMMA30=(Token)match(input,COMMA,FOLLOW_COMMA_in_orderByClause472); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA30);


                    	    pushFollow(FOLLOW_columnRefOrder_in_orderByClause474);
                    	    columnRefOrder31=gHiveParser.columnRefOrder();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_columnRefOrder.add(columnRefOrder31.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);


                    RPAREN32=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_orderByClause478); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN32);


                    // AST REWRITE
                    // elements: columnRefOrder
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 111:37: -> ^( TOK_ORDERBY ( columnRefOrder )+ )
                    {
                        // IdentifiersParser.g:111:40: ^( TOK_ORDERBY ( columnRefOrder )+ )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(TOK_ORDERBY, "TOK_ORDERBY")
                        , root_1);

                        if ( !(stream_columnRefOrder.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_columnRefOrder.hasNext() ) {
                            adaptor.addChild(root_1, stream_columnRefOrder.nextTree());

                        }
                        stream_columnRefOrder.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // IdentifiersParser.g:113:5: KW_ORDER KW_BY columnRefOrder ( COMMA columnRefOrder )*
                    {
                    KW_ORDER33=(Token)match(input,KW_ORDER,FOLLOW_KW_ORDER_in_orderByClause499); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_ORDER.add(KW_ORDER33);


                    KW_BY34=(Token)match(input,KW_BY,FOLLOW_KW_BY_in_orderByClause501); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_BY.add(KW_BY34);


                    pushFollow(FOLLOW_columnRefOrder_in_orderByClause507);
                    columnRefOrder35=gHiveParser.columnRefOrder();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_columnRefOrder.add(columnRefOrder35.getTree());

                    // IdentifiersParser.g:115:5: ( COMMA columnRefOrder )*
                    loop8:
                    do {
                        int alt8=2;
                        switch ( input.LA(1) ) {
                        case COMMA:
                            {
                            alt8=1;
                            }
                            break;

                        }

                        switch (alt8) {
                    	case 1 :
                    	    // IdentifiersParser.g:115:7: COMMA columnRefOrder
                    	    {
                    	    COMMA36=(Token)match(input,COMMA,FOLLOW_COMMA_in_orderByClause515); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA36);


                    	    pushFollow(FOLLOW_columnRefOrder_in_orderByClause517);
                    	    columnRefOrder37=gHiveParser.columnRefOrder();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_columnRefOrder.add(columnRefOrder37.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);


                    // AST REWRITE
                    // elements: columnRefOrder
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 115:30: -> ^( TOK_ORDERBY ( columnRefOrder )+ )
                    {
                        // IdentifiersParser.g:115:33: ^( TOK_ORDERBY ( columnRefOrder )+ )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(TOK_ORDERBY, "TOK_ORDERBY")
                        , root_1);

                        if ( !(stream_columnRefOrder.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_columnRefOrder.hasNext() ) {
                            adaptor.addChild(root_1, stream_columnRefOrder.nextTree());

                        }
                        stream_columnRefOrder.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) { gParent.popMsg(state); }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "orderByClause"


    public static class clusterByClause_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "clusterByClause"
    // IdentifiersParser.g:118:1: clusterByClause : ( KW_CLUSTER KW_BY LPAREN expression ( COMMA expression )* RPAREN -> ^( TOK_CLUSTERBY ( expression )+ ) | KW_CLUSTER KW_BY expression ( ( COMMA )=> COMMA expression )* -> ^( TOK_CLUSTERBY ( expression )+ ) );
    public final HiveParser_IdentifiersParser.clusterByClause_return clusterByClause() throws RecognitionException {
        HiveParser_IdentifiersParser.clusterByClause_return retval = new HiveParser_IdentifiersParser.clusterByClause_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token KW_CLUSTER38=null;
        Token KW_BY39=null;
        Token LPAREN40=null;
        Token COMMA42=null;
        Token RPAREN44=null;
        Token KW_CLUSTER45=null;
        Token KW_BY46=null;
        Token COMMA48=null;
        HiveParser_IdentifiersParser.expression_return expression41 =null;

        HiveParser_IdentifiersParser.expression_return expression43 =null;

        HiveParser_IdentifiersParser.expression_return expression47 =null;

        HiveParser_IdentifiersParser.expression_return expression49 =null;


        CommonTree KW_CLUSTER38_tree=null;
        CommonTree KW_BY39_tree=null;
        CommonTree LPAREN40_tree=null;
        CommonTree COMMA42_tree=null;
        CommonTree RPAREN44_tree=null;
        CommonTree KW_CLUSTER45_tree=null;
        CommonTree KW_BY46_tree=null;
        CommonTree COMMA48_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_KW_CLUSTER=new RewriteRuleTokenStream(adaptor,"token KW_CLUSTER");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleTokenStream stream_KW_BY=new RewriteRuleTokenStream(adaptor,"token KW_BY");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
         gParent.pushMsg("cluster by clause", state); 
        try {
            // IdentifiersParser.g:121:5: ( KW_CLUSTER KW_BY LPAREN expression ( COMMA expression )* RPAREN -> ^( TOK_CLUSTERBY ( expression )+ ) | KW_CLUSTER KW_BY expression ( ( COMMA )=> COMMA expression )* -> ^( TOK_CLUSTERBY ( expression )+ ) )
            int alt12=2;
            switch ( input.LA(1) ) {
            case KW_CLUSTER:
                {
                switch ( input.LA(2) ) {
                case KW_BY:
                    {
                    switch ( input.LA(3) ) {
                    case LPAREN:
                        {
                        alt12=1;
                        }
                        break;
                    case BigintLiteral:
                    case CharSetName:
                    case DecimalLiteral:
                    case Identifier:
                    case KW_ADD:
                    case KW_ADMIN:
                    case KW_AFTER:
                    case KW_ALL:
                    case KW_ALTER:
                    case KW_ANALYZE:
                    case KW_ARCHIVE:
                    case KW_ARRAY:
                    case KW_AS:
                    case KW_ASC:
                    case KW_BEFORE:
                    case KW_BETWEEN:
                    case KW_BIGINT:
                    case KW_BINARY:
                    case KW_BOOLEAN:
                    case KW_BOTH:
                    case KW_BUCKET:
                    case KW_BUCKETS:
                    case KW_BY:
                    case KW_CASCADE:
                    case KW_CASE:
                    case KW_CAST:
                    case KW_CHANGE:
                    case KW_CLUSTER:
                    case KW_CLUSTERED:
                    case KW_CLUSTERSTATUS:
                    case KW_COLLECTION:
                    case KW_COLUMNS:
                    case KW_COMMENT:
                    case KW_COMPACT:
                    case KW_COMPACTIONS:
                    case KW_COMPUTE:
                    case KW_CONCATENATE:
                    case KW_CONTINUE:
                    case KW_CREATE:
                    case KW_CUBE:
                    case KW_CURSOR:
                    case KW_DATA:
                    case KW_DATABASES:
                    case KW_DATE:
                    case KW_DATETIME:
                    case KW_DBPROPERTIES:
                    case KW_DECIMAL:
                    case KW_DEFAULT:
                    case KW_DEFERRED:
                    case KW_DEFINED:
                    case KW_DELETE:
                    case KW_DELIMITED:
                    case KW_DEPENDENCY:
                    case KW_DESC:
                    case KW_DESCRIBE:
                    case KW_DIRECTORIES:
                    case KW_DIRECTORY:
                    case KW_DISABLE:
                    case KW_DISTRIBUTE:
                    case KW_DOUBLE:
                    case KW_DROP:
                    case KW_ELEM_TYPE:
                    case KW_ENABLE:
                    case KW_ESCAPED:
                    case KW_EXCLUSIVE:
                    case KW_EXISTS:
                    case KW_EXPLAIN:
                    case KW_EXPORT:
                    case KW_EXTERNAL:
                    case KW_FALSE:
                    case KW_FETCH:
                    case KW_FIELDS:
                    case KW_FILE:
                    case KW_FILEFORMAT:
                    case KW_FIRST:
                    case KW_FLOAT:
                    case KW_FOR:
                    case KW_FORMAT:
                    case KW_FORMATTED:
                    case KW_FULL:
                    case KW_FUNCTIONS:
                    case KW_GRANT:
                    case KW_GROUP:
                    case KW_GROUPING:
                    case KW_HOLD_DDLTIME:
                    case KW_IDXPROPERTIES:
                    case KW_IF:
                    case KW_IGNORE:
                    case KW_IMPORT:
                    case KW_IN:
                    case KW_INDEX:
                    case KW_INDEXES:
                    case KW_INNER:
                    case KW_INPATH:
                    case KW_INPUTDRIVER:
                    case KW_INPUTFORMAT:
                    case KW_INSERT:
                    case KW_INT:
                    case KW_INTERSECT:
                    case KW_INTO:
                    case KW_IS:
                    case KW_ITEMS:
                    case KW_JAR:
                    case KW_KEYS:
                    case KW_KEY_TYPE:
                    case KW_LATERAL:
                    case KW_LEFT:
                    case KW_LIKE:
                    case KW_LIMIT:
                    case KW_LINES:
                    case KW_LOAD:
                    case KW_LOCAL:
                    case KW_LOCATION:
                    case KW_LOCK:
                    case KW_LOCKS:
                    case KW_LOGICAL:
                    case KW_LONG:
                    case KW_MAP:
                    case KW_MAPJOIN:
                    case KW_MATERIALIZED:
                    case KW_MINUS:
                    case KW_MSCK:
                    case KW_NONE:
                    case KW_NOSCAN:
                    case KW_NOT:
                    case KW_NO_DROP:
                    case KW_NULL:
                    case KW_OF:
                    case KW_OFFLINE:
                    case KW_OPTION:
                    case KW_ORCFILE:
                    case KW_ORDER:
                    case KW_OUT:
                    case KW_OUTER:
                    case KW_OUTPUTDRIVER:
                    case KW_OUTPUTFORMAT:
                    case KW_OVERWRITE:
                    case KW_OWNER:
                    case KW_PARQUETFILE:
                    case KW_PARTITION:
                    case KW_PARTITIONED:
                    case KW_PARTITIONS:
                    case KW_PERCENT:
                    case KW_PLUS:
                    case KW_PRETTY:
                    case KW_PRINCIPALS:
                    case KW_PROCEDURE:
                    case KW_PROTECTION:
                    case KW_PURGE:
                    case KW_RANGE:
                    case KW_RCFILE:
                    case KW_READ:
                    case KW_READONLY:
                    case KW_READS:
                    case KW_REBUILD:
                    case KW_RECORDREADER:
                    case KW_RECORDWRITER:
                    case KW_REGEXP:
                    case KW_RENAME:
                    case KW_REPAIR:
                    case KW_REPLACE:
                    case KW_RESTRICT:
                    case KW_REVOKE:
                    case KW_RIGHT:
                    case KW_RLIKE:
                    case KW_ROLE:
                    case KW_ROLES:
                    case KW_ROLLUP:
                    case KW_ROW:
                    case KW_ROWS:
                    case KW_SCHEMA:
                    case KW_SCHEMAS:
                    case KW_SEMI:
                    case KW_SEQUENCEFILE:
                    case KW_SERDE:
                    case KW_SERDEPROPERTIES:
                    case KW_SET:
                    case KW_SETS:
                    case KW_SHARED:
                    case KW_SHOW:
                    case KW_SHOW_DATABASE:
                    case KW_SKEWED:
                    case KW_SMALLINT:
                    case KW_SORT:
                    case KW_SORTED:
                    case KW_SSL:
                    case KW_STATISTICS:
                    case KW_STORED:
                    case KW_STREAMTABLE:
                    case KW_STRING:
                    case KW_STRUCT:
                    case KW_TABLE:
                    case KW_TABLES:
                    case KW_TBLPROPERTIES:
                    case KW_TEMPORARY:
                    case KW_TERMINATED:
                    case KW_TEXTFILE:
                    case KW_TIMESTAMP:
                    case KW_TINYINT:
                    case KW_TO:
                    case KW_TOUCH:
                    case KW_TRANSACTIONS:
                    case KW_TRIGGER:
                    case KW_TRUE:
                    case KW_TRUNCATE:
                    case KW_UNARCHIVE:
                    case KW_UNDO:
                    case KW_UNION:
                    case KW_UNIONTYPE:
                    case KW_UNLOCK:
                    case KW_UNSET:
                    case KW_UNSIGNED:
                    case KW_UPDATE:
                    case KW_USE:
                    case KW_USER:
                    case KW_USING:
                    case KW_UTC:
                    case KW_UTCTIMESTAMP:
                    case KW_VALUE_TYPE:
                    case KW_VIEW:
                    case KW_WHILE:
                    case KW_WITH:
                    case MINUS:
                    case Number:
                    case PLUS:
                    case SmallintLiteral:
                    case StringLiteral:
                    case TILDE:
                    case TinyintLiteral:
                        {
                        alt12=2;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 12, 2, input);

                        throw nvae;

                    }

                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 1, input);

                    throw nvae;

                }

                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;

            }

            switch (alt12) {
                case 1 :
                    // IdentifiersParser.g:122:5: KW_CLUSTER KW_BY LPAREN expression ( COMMA expression )* RPAREN
                    {
                    KW_CLUSTER38=(Token)match(input,KW_CLUSTER,FOLLOW_KW_CLUSTER_in_clusterByClause559); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_CLUSTER.add(KW_CLUSTER38);


                    KW_BY39=(Token)match(input,KW_BY,FOLLOW_KW_BY_in_clusterByClause561); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_BY.add(KW_BY39);


                    LPAREN40=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_clusterByClause567); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN40);


                    pushFollow(FOLLOW_expression_in_clusterByClause569);
                    expression41=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression41.getTree());

                    // IdentifiersParser.g:123:23: ( COMMA expression )*
                    loop10:
                    do {
                        int alt10=2;
                        switch ( input.LA(1) ) {
                        case COMMA:
                            {
                            alt10=1;
                            }
                            break;

                        }

                        switch (alt10) {
                    	case 1 :
                    	    // IdentifiersParser.g:123:24: COMMA expression
                    	    {
                    	    COMMA42=(Token)match(input,COMMA,FOLLOW_COMMA_in_clusterByClause572); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA42);


                    	    pushFollow(FOLLOW_expression_in_clusterByClause574);
                    	    expression43=expression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_expression.add(expression43.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);


                    RPAREN44=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_clusterByClause578); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN44);


                    // AST REWRITE
                    // elements: expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 123:50: -> ^( TOK_CLUSTERBY ( expression )+ )
                    {
                        // IdentifiersParser.g:123:53: ^( TOK_CLUSTERBY ( expression )+ )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(TOK_CLUSTERBY, "TOK_CLUSTERBY")
                        , root_1);

                        if ( !(stream_expression.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_expression.hasNext() ) {
                            adaptor.addChild(root_1, stream_expression.nextTree());

                        }
                        stream_expression.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // IdentifiersParser.g:125:5: KW_CLUSTER KW_BY expression ( ( COMMA )=> COMMA expression )*
                    {
                    KW_CLUSTER45=(Token)match(input,KW_CLUSTER,FOLLOW_KW_CLUSTER_in_clusterByClause599); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_CLUSTER.add(KW_CLUSTER45);


                    KW_BY46=(Token)match(input,KW_BY,FOLLOW_KW_BY_in_clusterByClause601); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_BY.add(KW_BY46);


                    pushFollow(FOLLOW_expression_in_clusterByClause607);
                    expression47=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression47.getTree());

                    // IdentifiersParser.g:127:5: ( ( COMMA )=> COMMA expression )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==COMMA) && (synpred1_IdentifiersParser())) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // IdentifiersParser.g:127:7: ( COMMA )=> COMMA expression
                    	    {
                    	    COMMA48=(Token)match(input,COMMA,FOLLOW_COMMA_in_clusterByClause619); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA48);


                    	    pushFollow(FOLLOW_expression_in_clusterByClause621);
                    	    expression49=expression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_expression.add(expression49.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);


                    // AST REWRITE
                    // elements: expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 127:36: -> ^( TOK_CLUSTERBY ( expression )+ )
                    {
                        // IdentifiersParser.g:127:39: ^( TOK_CLUSTERBY ( expression )+ )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(TOK_CLUSTERBY, "TOK_CLUSTERBY")
                        , root_1);

                        if ( !(stream_expression.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_expression.hasNext() ) {
                            adaptor.addChild(root_1, stream_expression.nextTree());

                        }
                        stream_expression.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) { gParent.popMsg(state); }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "clusterByClause"


    public static class partitionByClause_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "partitionByClause"
    // IdentifiersParser.g:130:1: partitionByClause : ( KW_PARTITION KW_BY LPAREN expression ( COMMA expression )* RPAREN -> ^( TOK_DISTRIBUTEBY ( expression )+ ) | KW_PARTITION KW_BY expression ( ( COMMA )=> COMMA expression )* -> ^( TOK_DISTRIBUTEBY ( expression )+ ) );
    public final HiveParser_IdentifiersParser.partitionByClause_return partitionByClause() throws RecognitionException {
        HiveParser_IdentifiersParser.partitionByClause_return retval = new HiveParser_IdentifiersParser.partitionByClause_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token KW_PARTITION50=null;
        Token KW_BY51=null;
        Token LPAREN52=null;
        Token COMMA54=null;
        Token RPAREN56=null;
        Token KW_PARTITION57=null;
        Token KW_BY58=null;
        Token COMMA60=null;
        HiveParser_IdentifiersParser.expression_return expression53 =null;

        HiveParser_IdentifiersParser.expression_return expression55 =null;

        HiveParser_IdentifiersParser.expression_return expression59 =null;

        HiveParser_IdentifiersParser.expression_return expression61 =null;


        CommonTree KW_PARTITION50_tree=null;
        CommonTree KW_BY51_tree=null;
        CommonTree LPAREN52_tree=null;
        CommonTree COMMA54_tree=null;
        CommonTree RPAREN56_tree=null;
        CommonTree KW_PARTITION57_tree=null;
        CommonTree KW_BY58_tree=null;
        CommonTree COMMA60_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_KW_PARTITION=new RewriteRuleTokenStream(adaptor,"token KW_PARTITION");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleTokenStream stream_KW_BY=new RewriteRuleTokenStream(adaptor,"token KW_BY");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
         gParent.pushMsg("partition by clause", state); 
        try {
            // IdentifiersParser.g:133:5: ( KW_PARTITION KW_BY LPAREN expression ( COMMA expression )* RPAREN -> ^( TOK_DISTRIBUTEBY ( expression )+ ) | KW_PARTITION KW_BY expression ( ( COMMA )=> COMMA expression )* -> ^( TOK_DISTRIBUTEBY ( expression )+ ) )
            int alt15=2;
            switch ( input.LA(1) ) {
            case KW_PARTITION:
                {
                switch ( input.LA(2) ) {
                case KW_BY:
                    {
                    switch ( input.LA(3) ) {
                    case LPAREN:
                        {
                        alt15=1;
                        }
                        break;
                    case BigintLiteral:
                    case CharSetName:
                    case DecimalLiteral:
                    case Identifier:
                    case KW_ADD:
                    case KW_ADMIN:
                    case KW_AFTER:
                    case KW_ALL:
                    case KW_ALTER:
                    case KW_ANALYZE:
                    case KW_ARCHIVE:
                    case KW_ARRAY:
                    case KW_AS:
                    case KW_ASC:
                    case KW_BEFORE:
                    case KW_BETWEEN:
                    case KW_BIGINT:
                    case KW_BINARY:
                    case KW_BOOLEAN:
                    case KW_BOTH:
                    case KW_BUCKET:
                    case KW_BUCKETS:
                    case KW_BY:
                    case KW_CASCADE:
                    case KW_CASE:
                    case KW_CAST:
                    case KW_CHANGE:
                    case KW_CLUSTER:
                    case KW_CLUSTERED:
                    case KW_CLUSTERSTATUS:
                    case KW_COLLECTION:
                    case KW_COLUMNS:
                    case KW_COMMENT:
                    case KW_COMPACT:
                    case KW_COMPACTIONS:
                    case KW_COMPUTE:
                    case KW_CONCATENATE:
                    case KW_CONTINUE:
                    case KW_CREATE:
                    case KW_CUBE:
                    case KW_CURSOR:
                    case KW_DATA:
                    case KW_DATABASES:
                    case KW_DATE:
                    case KW_DATETIME:
                    case KW_DBPROPERTIES:
                    case KW_DECIMAL:
                    case KW_DEFAULT:
                    case KW_DEFERRED:
                    case KW_DEFINED:
                    case KW_DELETE:
                    case KW_DELIMITED:
                    case KW_DEPENDENCY:
                    case KW_DESC:
                    case KW_DESCRIBE:
                    case KW_DIRECTORIES:
                    case KW_DIRECTORY:
                    case KW_DISABLE:
                    case KW_DISTRIBUTE:
                    case KW_DOUBLE:
                    case KW_DROP:
                    case KW_ELEM_TYPE:
                    case KW_ENABLE:
                    case KW_ESCAPED:
                    case KW_EXCLUSIVE:
                    case KW_EXISTS:
                    case KW_EXPLAIN:
                    case KW_EXPORT:
                    case KW_EXTERNAL:
                    case KW_FALSE:
                    case KW_FETCH:
                    case KW_FIELDS:
                    case KW_FILE:
                    case KW_FILEFORMAT:
                    case KW_FIRST:
                    case KW_FLOAT:
                    case KW_FOR:
                    case KW_FORMAT:
                    case KW_FORMATTED:
                    case KW_FULL:
                    case KW_FUNCTIONS:
                    case KW_GRANT:
                    case KW_GROUP:
                    case KW_GROUPING:
                    case KW_HOLD_DDLTIME:
                    case KW_IDXPROPERTIES:
                    case KW_IF:
                    case KW_IGNORE:
                    case KW_IMPORT:
                    case KW_IN:
                    case KW_INDEX:
                    case KW_INDEXES:
                    case KW_INNER:
                    case KW_INPATH:
                    case KW_INPUTDRIVER:
                    case KW_INPUTFORMAT:
                    case KW_INSERT:
                    case KW_INT:
                    case KW_INTERSECT:
                    case KW_INTO:
                    case KW_IS:
                    case KW_ITEMS:
                    case KW_JAR:
                    case KW_KEYS:
                    case KW_KEY_TYPE:
                    case KW_LATERAL:
                    case KW_LEFT:
                    case KW_LIKE:
                    case KW_LIMIT:
                    case KW_LINES:
                    case KW_LOAD:
                    case KW_LOCAL:
                    case KW_LOCATION:
                    case KW_LOCK:
                    case KW_LOCKS:
                    case KW_LOGICAL:
                    case KW_LONG:
                    case KW_MAP:
                    case KW_MAPJOIN:
                    case KW_MATERIALIZED:
                    case KW_MINUS:
                    case KW_MSCK:
                    case KW_NONE:
                    case KW_NOSCAN:
                    case KW_NOT:
                    case KW_NO_DROP:
                    case KW_NULL:
                    case KW_OF:
                    case KW_OFFLINE:
                    case KW_OPTION:
                    case KW_ORCFILE:
                    case KW_ORDER:
                    case KW_OUT:
                    case KW_OUTER:
                    case KW_OUTPUTDRIVER:
                    case KW_OUTPUTFORMAT:
                    case KW_OVERWRITE:
                    case KW_OWNER:
                    case KW_PARQUETFILE:
                    case KW_PARTITION:
                    case KW_PARTITIONED:
                    case KW_PARTITIONS:
                    case KW_PERCENT:
                    case KW_PLUS:
                    case KW_PRETTY:
                    case KW_PRINCIPALS:
                    case KW_PROCEDURE:
                    case KW_PROTECTION:
                    case KW_PURGE:
                    case KW_RANGE:
                    case KW_RCFILE:
                    case KW_READ:
                    case KW_READONLY:
                    case KW_READS:
                    case KW_REBUILD:
                    case KW_RECORDREADER:
                    case KW_RECORDWRITER:
                    case KW_REGEXP:
                    case KW_RENAME:
                    case KW_REPAIR:
                    case KW_REPLACE:
                    case KW_RESTRICT:
                    case KW_REVOKE:
                    case KW_RIGHT:
                    case KW_RLIKE:
                    case KW_ROLE:
                    case KW_ROLES:
                    case KW_ROLLUP:
                    case KW_ROW:
                    case KW_ROWS:
                    case KW_SCHEMA:
                    case KW_SCHEMAS:
                    case KW_SEMI:
                    case KW_SEQUENCEFILE:
                    case KW_SERDE:
                    case KW_SERDEPROPERTIES:
                    case KW_SET:
                    case KW_SETS:
                    case KW_SHARED:
                    case KW_SHOW:
                    case KW_SHOW_DATABASE:
                    case KW_SKEWED:
                    case KW_SMALLINT:
                    case KW_SORT:
                    case KW_SORTED:
                    case KW_SSL:
                    case KW_STATISTICS:
                    case KW_STORED:
                    case KW_STREAMTABLE:
                    case KW_STRING:
                    case KW_STRUCT:
                    case KW_TABLE:
                    case KW_TABLES:
                    case KW_TBLPROPERTIES:
                    case KW_TEMPORARY:
                    case KW_TERMINATED:
                    case KW_TEXTFILE:
                    case KW_TIMESTAMP:
                    case KW_TINYINT:
                    case KW_TO:
                    case KW_TOUCH:
                    case KW_TRANSACTIONS:
                    case KW_TRIGGER:
                    case KW_TRUE:
                    case KW_TRUNCATE:
                    case KW_UNARCHIVE:
                    case KW_UNDO:
                    case KW_UNION:
                    case KW_UNIONTYPE:
                    case KW_UNLOCK:
                    case KW_UNSET:
                    case KW_UNSIGNED:
                    case KW_UPDATE:
                    case KW_USE:
                    case KW_USER:
                    case KW_USING:
                    case KW_UTC:
                    case KW_UTCTIMESTAMP:
                    case KW_VALUE_TYPE:
                    case KW_VIEW:
                    case KW_WHILE:
                    case KW_WITH:
                    case MINUS:
                    case Number:
                    case PLUS:
                    case SmallintLiteral:
                    case StringLiteral:
                    case TILDE:
                    case TinyintLiteral:
                        {
                        alt15=2;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 15, 2, input);

                        throw nvae;

                    }

                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 1, input);

                    throw nvae;

                }

                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;

            }

            switch (alt15) {
                case 1 :
                    // IdentifiersParser.g:134:5: KW_PARTITION KW_BY LPAREN expression ( COMMA expression )* RPAREN
                    {
                    KW_PARTITION50=(Token)match(input,KW_PARTITION,FOLLOW_KW_PARTITION_in_partitionByClause665); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_PARTITION.add(KW_PARTITION50);


                    KW_BY51=(Token)match(input,KW_BY,FOLLOW_KW_BY_in_partitionByClause667); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_BY.add(KW_BY51);


                    LPAREN52=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_partitionByClause673); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN52);


                    pushFollow(FOLLOW_expression_in_partitionByClause675);
                    expression53=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression53.getTree());

                    // IdentifiersParser.g:135:23: ( COMMA expression )*
                    loop13:
                    do {
                        int alt13=2;
                        switch ( input.LA(1) ) {
                        case COMMA:
                            {
                            alt13=1;
                            }
                            break;

                        }

                        switch (alt13) {
                    	case 1 :
                    	    // IdentifiersParser.g:135:24: COMMA expression
                    	    {
                    	    COMMA54=(Token)match(input,COMMA,FOLLOW_COMMA_in_partitionByClause678); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA54);


                    	    pushFollow(FOLLOW_expression_in_partitionByClause680);
                    	    expression55=expression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_expression.add(expression55.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);


                    RPAREN56=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_partitionByClause684); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN56);


                    // AST REWRITE
                    // elements: expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 135:50: -> ^( TOK_DISTRIBUTEBY ( expression )+ )
                    {
                        // IdentifiersParser.g:135:53: ^( TOK_DISTRIBUTEBY ( expression )+ )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(TOK_DISTRIBUTEBY, "TOK_DISTRIBUTEBY")
                        , root_1);

                        if ( !(stream_expression.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_expression.hasNext() ) {
                            adaptor.addChild(root_1, stream_expression.nextTree());

                        }
                        stream_expression.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // IdentifiersParser.g:137:5: KW_PARTITION KW_BY expression ( ( COMMA )=> COMMA expression )*
                    {
                    KW_PARTITION57=(Token)match(input,KW_PARTITION,FOLLOW_KW_PARTITION_in_partitionByClause705); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_PARTITION.add(KW_PARTITION57);


                    KW_BY58=(Token)match(input,KW_BY,FOLLOW_KW_BY_in_partitionByClause707); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_BY.add(KW_BY58);


                    pushFollow(FOLLOW_expression_in_partitionByClause713);
                    expression59=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression59.getTree());

                    // IdentifiersParser.g:138:16: ( ( COMMA )=> COMMA expression )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==COMMA) && (synpred2_IdentifiersParser())) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // IdentifiersParser.g:138:17: ( COMMA )=> COMMA expression
                    	    {
                    	    COMMA60=(Token)match(input,COMMA,FOLLOW_COMMA_in_partitionByClause721); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA60);


                    	    pushFollow(FOLLOW_expression_in_partitionByClause723);
                    	    expression61=expression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_expression.add(expression61.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);


                    // AST REWRITE
                    // elements: expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 138:46: -> ^( TOK_DISTRIBUTEBY ( expression )+ )
                    {
                        // IdentifiersParser.g:138:49: ^( TOK_DISTRIBUTEBY ( expression )+ )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(TOK_DISTRIBUTEBY, "TOK_DISTRIBUTEBY")
                        , root_1);

                        if ( !(stream_expression.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_expression.hasNext() ) {
                            adaptor.addChild(root_1, stream_expression.nextTree());

                        }
                        stream_expression.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) { gParent.popMsg(state); }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "partitionByClause"


    public static class distributeByClause_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "distributeByClause"
    // IdentifiersParser.g:141:1: distributeByClause : ( KW_DISTRIBUTE KW_BY LPAREN expression ( COMMA expression )* RPAREN -> ^( TOK_DISTRIBUTEBY ( expression )+ ) | KW_DISTRIBUTE KW_BY expression ( ( COMMA )=> COMMA expression )* -> ^( TOK_DISTRIBUTEBY ( expression )+ ) );
    public final HiveParser_IdentifiersParser.distributeByClause_return distributeByClause() throws RecognitionException {
        HiveParser_IdentifiersParser.distributeByClause_return retval = new HiveParser_IdentifiersParser.distributeByClause_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token KW_DISTRIBUTE62=null;
        Token KW_BY63=null;
        Token LPAREN64=null;
        Token COMMA66=null;
        Token RPAREN68=null;
        Token KW_DISTRIBUTE69=null;
        Token KW_BY70=null;
        Token COMMA72=null;
        HiveParser_IdentifiersParser.expression_return expression65 =null;

        HiveParser_IdentifiersParser.expression_return expression67 =null;

        HiveParser_IdentifiersParser.expression_return expression71 =null;

        HiveParser_IdentifiersParser.expression_return expression73 =null;


        CommonTree KW_DISTRIBUTE62_tree=null;
        CommonTree KW_BY63_tree=null;
        CommonTree LPAREN64_tree=null;
        CommonTree COMMA66_tree=null;
        CommonTree RPAREN68_tree=null;
        CommonTree KW_DISTRIBUTE69_tree=null;
        CommonTree KW_BY70_tree=null;
        CommonTree COMMA72_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_KW_DISTRIBUTE=new RewriteRuleTokenStream(adaptor,"token KW_DISTRIBUTE");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleTokenStream stream_KW_BY=new RewriteRuleTokenStream(adaptor,"token KW_BY");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
         gParent.pushMsg("distribute by clause", state); 
        try {
            // IdentifiersParser.g:144:5: ( KW_DISTRIBUTE KW_BY LPAREN expression ( COMMA expression )* RPAREN -> ^( TOK_DISTRIBUTEBY ( expression )+ ) | KW_DISTRIBUTE KW_BY expression ( ( COMMA )=> COMMA expression )* -> ^( TOK_DISTRIBUTEBY ( expression )+ ) )
            int alt18=2;
            switch ( input.LA(1) ) {
            case KW_DISTRIBUTE:
                {
                switch ( input.LA(2) ) {
                case KW_BY:
                    {
                    switch ( input.LA(3) ) {
                    case LPAREN:
                        {
                        alt18=1;
                        }
                        break;
                    case BigintLiteral:
                    case CharSetName:
                    case DecimalLiteral:
                    case Identifier:
                    case KW_ADD:
                    case KW_ADMIN:
                    case KW_AFTER:
                    case KW_ALL:
                    case KW_ALTER:
                    case KW_ANALYZE:
                    case KW_ARCHIVE:
                    case KW_ARRAY:
                    case KW_AS:
                    case KW_ASC:
                    case KW_BEFORE:
                    case KW_BETWEEN:
                    case KW_BIGINT:
                    case KW_BINARY:
                    case KW_BOOLEAN:
                    case KW_BOTH:
                    case KW_BUCKET:
                    case KW_BUCKETS:
                    case KW_BY:
                    case KW_CASCADE:
                    case KW_CASE:
                    case KW_CAST:
                    case KW_CHANGE:
                    case KW_CLUSTER:
                    case KW_CLUSTERED:
                    case KW_CLUSTERSTATUS:
                    case KW_COLLECTION:
                    case KW_COLUMNS:
                    case KW_COMMENT:
                    case KW_COMPACT:
                    case KW_COMPACTIONS:
                    case KW_COMPUTE:
                    case KW_CONCATENATE:
                    case KW_CONTINUE:
                    case KW_CREATE:
                    case KW_CUBE:
                    case KW_CURSOR:
                    case KW_DATA:
                    case KW_DATABASES:
                    case KW_DATE:
                    case KW_DATETIME:
                    case KW_DBPROPERTIES:
                    case KW_DECIMAL:
                    case KW_DEFAULT:
                    case KW_DEFERRED:
                    case KW_DEFINED:
                    case KW_DELETE:
                    case KW_DELIMITED:
                    case KW_DEPENDENCY:
                    case KW_DESC:
                    case KW_DESCRIBE:
                    case KW_DIRECTORIES:
                    case KW_DIRECTORY:
                    case KW_DISABLE:
                    case KW_DISTRIBUTE:
                    case KW_DOUBLE:
                    case KW_DROP:
                    case KW_ELEM_TYPE:
                    case KW_ENABLE:
                    case KW_ESCAPED:
                    case KW_EXCLUSIVE:
                    case KW_EXISTS:
                    case KW_EXPLAIN:
                    case KW_EXPORT:
                    case KW_EXTERNAL:
                    case KW_FALSE:
                    case KW_FETCH:
                    case KW_FIELDS:
                    case KW_FILE:
                    case KW_FILEFORMAT:
                    case KW_FIRST:
                    case KW_FLOAT:
                    case KW_FOR:
                    case KW_FORMAT:
                    case KW_FORMATTED:
                    case KW_FULL:
                    case KW_FUNCTIONS:
                    case KW_GRANT:
                    case KW_GROUP:
                    case KW_GROUPING:
                    case KW_HOLD_DDLTIME:
                    case KW_IDXPROPERTIES:
                    case KW_IF:
                    case KW_IGNORE:
                    case KW_IMPORT:
                    case KW_IN:
                    case KW_INDEX:
                    case KW_INDEXES:
                    case KW_INNER:
                    case KW_INPATH:
                    case KW_INPUTDRIVER:
                    case KW_INPUTFORMAT:
                    case KW_INSERT:
                    case KW_INT:
                    case KW_INTERSECT:
                    case KW_INTO:
                    case KW_IS:
                    case KW_ITEMS:
                    case KW_JAR:
                    case KW_KEYS:
                    case KW_KEY_TYPE:
                    case KW_LATERAL:
                    case KW_LEFT:
                    case KW_LIKE:
                    case KW_LIMIT:
                    case KW_LINES:
                    case KW_LOAD:
                    case KW_LOCAL:
                    case KW_LOCATION:
                    case KW_LOCK:
                    case KW_LOCKS:
                    case KW_LOGICAL:
                    case KW_LONG:
                    case KW_MAP:
                    case KW_MAPJOIN:
                    case KW_MATERIALIZED:
                    case KW_MINUS:
                    case KW_MSCK:
                    case KW_NONE:
                    case KW_NOSCAN:
                    case KW_NOT:
                    case KW_NO_DROP:
                    case KW_NULL:
                    case KW_OF:
                    case KW_OFFLINE:
                    case KW_OPTION:
                    case KW_ORCFILE:
                    case KW_ORDER:
                    case KW_OUT:
                    case KW_OUTER:
                    case KW_OUTPUTDRIVER:
                    case KW_OUTPUTFORMAT:
                    case KW_OVERWRITE:
                    case KW_OWNER:
                    case KW_PARQUETFILE:
                    case KW_PARTITION:
                    case KW_PARTITIONED:
                    case KW_PARTITIONS:
                    case KW_PERCENT:
                    case KW_PLUS:
                    case KW_PRETTY:
                    case KW_PRINCIPALS:
                    case KW_PROCEDURE:
                    case KW_PROTECTION:
                    case KW_PURGE:
                    case KW_RANGE:
                    case KW_RCFILE:
                    case KW_READ:
                    case KW_READONLY:
                    case KW_READS:
                    case KW_REBUILD:
                    case KW_RECORDREADER:
                    case KW_RECORDWRITER:
                    case KW_REGEXP:
                    case KW_RENAME:
                    case KW_REPAIR:
                    case KW_REPLACE:
                    case KW_RESTRICT:
                    case KW_REVOKE:
                    case KW_RIGHT:
                    case KW_RLIKE:
                    case KW_ROLE:
                    case KW_ROLES:
                    case KW_ROLLUP:
                    case KW_ROW:
                    case KW_ROWS:
                    case KW_SCHEMA:
                    case KW_SCHEMAS:
                    case KW_SEMI:
                    case KW_SEQUENCEFILE:
                    case KW_SERDE:
                    case KW_SERDEPROPERTIES:
                    case KW_SET:
                    case KW_SETS:
                    case KW_SHARED:
                    case KW_SHOW:
                    case KW_SHOW_DATABASE:
                    case KW_SKEWED:
                    case KW_SMALLINT:
                    case KW_SORT:
                    case KW_SORTED:
                    case KW_SSL:
                    case KW_STATISTICS:
                    case KW_STORED:
                    case KW_STREAMTABLE:
                    case KW_STRING:
                    case KW_STRUCT:
                    case KW_TABLE:
                    case KW_TABLES:
                    case KW_TBLPROPERTIES:
                    case KW_TEMPORARY:
                    case KW_TERMINATED:
                    case KW_TEXTFILE:
                    case KW_TIMESTAMP:
                    case KW_TINYINT:
                    case KW_TO:
                    case KW_TOUCH:
                    case KW_TRANSACTIONS:
                    case KW_TRIGGER:
                    case KW_TRUE:
                    case KW_TRUNCATE:
                    case KW_UNARCHIVE:
                    case KW_UNDO:
                    case KW_UNION:
                    case KW_UNIONTYPE:
                    case KW_UNLOCK:
                    case KW_UNSET:
                    case KW_UNSIGNED:
                    case KW_UPDATE:
                    case KW_USE:
                    case KW_USER:
                    case KW_USING:
                    case KW_UTC:
                    case KW_UTCTIMESTAMP:
                    case KW_VALUE_TYPE:
                    case KW_VIEW:
                    case KW_WHILE:
                    case KW_WITH:
                    case MINUS:
                    case Number:
                    case PLUS:
                    case SmallintLiteral:
                    case StringLiteral:
                    case TILDE:
                    case TinyintLiteral:
                        {
                        alt18=2;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 18, 2, input);

                        throw nvae;

                    }

                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 1, input);

                    throw nvae;

                }

                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;

            }

            switch (alt18) {
                case 1 :
                    // IdentifiersParser.g:145:5: KW_DISTRIBUTE KW_BY LPAREN expression ( COMMA expression )* RPAREN
                    {
                    KW_DISTRIBUTE62=(Token)match(input,KW_DISTRIBUTE,FOLLOW_KW_DISTRIBUTE_in_distributeByClause765); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_DISTRIBUTE.add(KW_DISTRIBUTE62);


                    KW_BY63=(Token)match(input,KW_BY,FOLLOW_KW_BY_in_distributeByClause767); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_BY.add(KW_BY63);


                    LPAREN64=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_distributeByClause773); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN64);


                    pushFollow(FOLLOW_expression_in_distributeByClause775);
                    expression65=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression65.getTree());

                    // IdentifiersParser.g:146:23: ( COMMA expression )*
                    loop16:
                    do {
                        int alt16=2;
                        switch ( input.LA(1) ) {
                        case COMMA:
                            {
                            alt16=1;
                            }
                            break;

                        }

                        switch (alt16) {
                    	case 1 :
                    	    // IdentifiersParser.g:146:24: COMMA expression
                    	    {
                    	    COMMA66=(Token)match(input,COMMA,FOLLOW_COMMA_in_distributeByClause778); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA66);


                    	    pushFollow(FOLLOW_expression_in_distributeByClause780);
                    	    expression67=expression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_expression.add(expression67.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);


                    RPAREN68=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_distributeByClause784); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN68);


                    // AST REWRITE
                    // elements: expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 146:50: -> ^( TOK_DISTRIBUTEBY ( expression )+ )
                    {
                        // IdentifiersParser.g:146:53: ^( TOK_DISTRIBUTEBY ( expression )+ )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(TOK_DISTRIBUTEBY, "TOK_DISTRIBUTEBY")
                        , root_1);

                        if ( !(stream_expression.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_expression.hasNext() ) {
                            adaptor.addChild(root_1, stream_expression.nextTree());

                        }
                        stream_expression.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // IdentifiersParser.g:148:5: KW_DISTRIBUTE KW_BY expression ( ( COMMA )=> COMMA expression )*
                    {
                    KW_DISTRIBUTE69=(Token)match(input,KW_DISTRIBUTE,FOLLOW_KW_DISTRIBUTE_in_distributeByClause805); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_DISTRIBUTE.add(KW_DISTRIBUTE69);


                    KW_BY70=(Token)match(input,KW_BY,FOLLOW_KW_BY_in_distributeByClause807); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_BY.add(KW_BY70);


                    pushFollow(FOLLOW_expression_in_distributeByClause813);
                    expression71=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression71.getTree());

                    // IdentifiersParser.g:149:16: ( ( COMMA )=> COMMA expression )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==COMMA) && (synpred3_IdentifiersParser())) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // IdentifiersParser.g:149:17: ( COMMA )=> COMMA expression
                    	    {
                    	    COMMA72=(Token)match(input,COMMA,FOLLOW_COMMA_in_distributeByClause821); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA72);


                    	    pushFollow(FOLLOW_expression_in_distributeByClause823);
                    	    expression73=expression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_expression.add(expression73.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);


                    // AST REWRITE
                    // elements: expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 149:46: -> ^( TOK_DISTRIBUTEBY ( expression )+ )
                    {
                        // IdentifiersParser.g:149:49: ^( TOK_DISTRIBUTEBY ( expression )+ )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(TOK_DISTRIBUTEBY, "TOK_DISTRIBUTEBY")
                        , root_1);

                        if ( !(stream_expression.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_expression.hasNext() ) {
                            adaptor.addChild(root_1, stream_expression.nextTree());

                        }
                        stream_expression.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) { gParent.popMsg(state); }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "distributeByClause"


    public static class sortByClause_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "sortByClause"
    // IdentifiersParser.g:152:1: sortByClause : ( KW_SORT KW_BY LPAREN columnRefOrder ( COMMA columnRefOrder )* RPAREN -> ^( TOK_SORTBY ( columnRefOrder )+ ) | KW_SORT KW_BY columnRefOrder ( ( COMMA )=> COMMA columnRefOrder )* -> ^( TOK_SORTBY ( columnRefOrder )+ ) );
    public final HiveParser_IdentifiersParser.sortByClause_return sortByClause() throws RecognitionException {
        HiveParser_IdentifiersParser.sortByClause_return retval = new HiveParser_IdentifiersParser.sortByClause_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token KW_SORT74=null;
        Token KW_BY75=null;
        Token LPAREN76=null;
        Token COMMA78=null;
        Token RPAREN80=null;
        Token KW_SORT81=null;
        Token KW_BY82=null;
        Token COMMA84=null;
        HiveParser.columnRefOrder_return columnRefOrder77 =null;

        HiveParser.columnRefOrder_return columnRefOrder79 =null;

        HiveParser.columnRefOrder_return columnRefOrder83 =null;

        HiveParser.columnRefOrder_return columnRefOrder85 =null;


        CommonTree KW_SORT74_tree=null;
        CommonTree KW_BY75_tree=null;
        CommonTree LPAREN76_tree=null;
        CommonTree COMMA78_tree=null;
        CommonTree RPAREN80_tree=null;
        CommonTree KW_SORT81_tree=null;
        CommonTree KW_BY82_tree=null;
        CommonTree COMMA84_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleTokenStream stream_KW_SORT=new RewriteRuleTokenStream(adaptor,"token KW_SORT");
        RewriteRuleTokenStream stream_KW_BY=new RewriteRuleTokenStream(adaptor,"token KW_BY");
        RewriteRuleSubtreeStream stream_columnRefOrder=new RewriteRuleSubtreeStream(adaptor,"rule columnRefOrder");
         gParent.pushMsg("sort by clause", state); 
        try {
            // IdentifiersParser.g:155:5: ( KW_SORT KW_BY LPAREN columnRefOrder ( COMMA columnRefOrder )* RPAREN -> ^( TOK_SORTBY ( columnRefOrder )+ ) | KW_SORT KW_BY columnRefOrder ( ( COMMA )=> COMMA columnRefOrder )* -> ^( TOK_SORTBY ( columnRefOrder )+ ) )
            int alt21=2;
            switch ( input.LA(1) ) {
            case KW_SORT:
                {
                switch ( input.LA(2) ) {
                case KW_BY:
                    {
                    switch ( input.LA(3) ) {
                    case LPAREN:
                        {
                        alt21=1;
                        }
                        break;
                    case BigintLiteral:
                    case CharSetName:
                    case DecimalLiteral:
                    case Identifier:
                    case KW_ADD:
                    case KW_ADMIN:
                    case KW_AFTER:
                    case KW_ALL:
                    case KW_ALTER:
                    case KW_ANALYZE:
                    case KW_ARCHIVE:
                    case KW_ARRAY:
                    case KW_AS:
                    case KW_ASC:
                    case KW_BEFORE:
                    case KW_BETWEEN:
                    case KW_BIGINT:
                    case KW_BINARY:
                    case KW_BOOLEAN:
                    case KW_BOTH:
                    case KW_BUCKET:
                    case KW_BUCKETS:
                    case KW_BY:
                    case KW_CASCADE:
                    case KW_CASE:
                    case KW_CAST:
                    case KW_CHANGE:
                    case KW_CLUSTER:
                    case KW_CLUSTERED:
                    case KW_CLUSTERSTATUS:
                    case KW_COLLECTION:
                    case KW_COLUMNS:
                    case KW_COMMENT:
                    case KW_COMPACT:
                    case KW_COMPACTIONS:
                    case KW_COMPUTE:
                    case KW_CONCATENATE:
                    case KW_CONTINUE:
                    case KW_CREATE:
                    case KW_CUBE:
                    case KW_CURSOR:
                    case KW_DATA:
                    case KW_DATABASES:
                    case KW_DATE:
                    case KW_DATETIME:
                    case KW_DBPROPERTIES:
                    case KW_DECIMAL:
                    case KW_DEFAULT:
                    case KW_DEFERRED:
                    case KW_DEFINED:
                    case KW_DELETE:
                    case KW_DELIMITED:
                    case KW_DEPENDENCY:
                    case KW_DESC:
                    case KW_DESCRIBE:
                    case KW_DIRECTORIES:
                    case KW_DIRECTORY:
                    case KW_DISABLE:
                    case KW_DISTRIBUTE:
                    case KW_DOUBLE:
                    case KW_DROP:
                    case KW_ELEM_TYPE:
                    case KW_ENABLE:
                    case KW_ESCAPED:
                    case KW_EXCLUSIVE:
                    case KW_EXISTS:
                    case KW_EXPLAIN:
                    case KW_EXPORT:
                    case KW_EXTERNAL:
                    case KW_FALSE:
                    case KW_FETCH:
                    case KW_FIELDS:
                    case KW_FILE:
                    case KW_FILEFORMAT:
                    case KW_FIRST:
                    case KW_FLOAT:
                    case KW_FOR:
                    case KW_FORMAT:
                    case KW_FORMATTED:
                    case KW_FULL:
                    case KW_FUNCTIONS:
                    case KW_GRANT:
                    case KW_GROUP:
                    case KW_GROUPING:
                    case KW_HOLD_DDLTIME:
                    case KW_IDXPROPERTIES:
                    case KW_IF:
                    case KW_IGNORE:
                    case KW_IMPORT:
                    case KW_IN:
                    case KW_INDEX:
                    case KW_INDEXES:
                    case KW_INNER:
                    case KW_INPATH:
                    case KW_INPUTDRIVER:
                    case KW_INPUTFORMAT:
                    case KW_INSERT:
                    case KW_INT:
                    case KW_INTERSECT:
                    case KW_INTO:
                    case KW_IS:
                    case KW_ITEMS:
                    case KW_JAR:
                    case KW_KEYS:
                    case KW_KEY_TYPE:
                    case KW_LATERAL:
                    case KW_LEFT:
                    case KW_LIKE:
                    case KW_LIMIT:
                    case KW_LINES:
                    case KW_LOAD:
                    case KW_LOCAL:
                    case KW_LOCATION:
                    case KW_LOCK:
                    case KW_LOCKS:
                    case KW_LOGICAL:
                    case KW_LONG:
                    case KW_MAP:
                    case KW_MAPJOIN:
                    case KW_MATERIALIZED:
                    case KW_MINUS:
                    case KW_MSCK:
                    case KW_NONE:
                    case KW_NOSCAN:
                    case KW_NOT:
                    case KW_NO_DROP:
                    case KW_NULL:
                    case KW_OF:
                    case KW_OFFLINE:
                    case KW_OPTION:
                    case KW_ORCFILE:
                    case KW_ORDER:
                    case KW_OUT:
                    case KW_OUTER:
                    case KW_OUTPUTDRIVER:
                    case KW_OUTPUTFORMAT:
                    case KW_OVERWRITE:
                    case KW_OWNER:
                    case KW_PARQUETFILE:
                    case KW_PARTITION:
                    case KW_PARTITIONED:
                    case KW_PARTITIONS:
                    case KW_PERCENT:
                    case KW_PLUS:
                    case KW_PRETTY:
                    case KW_PRINCIPALS:
                    case KW_PROCEDURE:
                    case KW_PROTECTION:
                    case KW_PURGE:
                    case KW_RANGE:
                    case KW_RCFILE:
                    case KW_READ:
                    case KW_READONLY:
                    case KW_READS:
                    case KW_REBUILD:
                    case KW_RECORDREADER:
                    case KW_RECORDWRITER:
                    case KW_REGEXP:
                    case KW_RENAME:
                    case KW_REPAIR:
                    case KW_REPLACE:
                    case KW_RESTRICT:
                    case KW_REVOKE:
                    case KW_RIGHT:
                    case KW_RLIKE:
                    case KW_ROLE:
                    case KW_ROLES:
                    case KW_ROLLUP:
                    case KW_ROW:
                    case KW_ROWS:
                    case KW_SCHEMA:
                    case KW_SCHEMAS:
                    case KW_SEMI:
                    case KW_SEQUENCEFILE:
                    case KW_SERDE:
                    case KW_SERDEPROPERTIES:
                    case KW_SET:
                    case KW_SETS:
                    case KW_SHARED:
                    case KW_SHOW:
                    case KW_SHOW_DATABASE:
                    case KW_SKEWED:
                    case KW_SMALLINT:
                    case KW_SORT:
                    case KW_SORTED:
                    case KW_SSL:
                    case KW_STATISTICS:
                    case KW_STORED:
                    case KW_STREAMTABLE:
                    case KW_STRING:
                    case KW_STRUCT:
                    case KW_TABLE:
                    case KW_TABLES:
                    case KW_TBLPROPERTIES:
                    case KW_TEMPORARY:
                    case KW_TERMINATED:
                    case KW_TEXTFILE:
                    case KW_TIMESTAMP:
                    case KW_TINYINT:
                    case KW_TO:
                    case KW_TOUCH:
                    case KW_TRANSACTIONS:
                    case KW_TRIGGER:
                    case KW_TRUE:
                    case KW_TRUNCATE:
                    case KW_UNARCHIVE:
                    case KW_UNDO:
                    case KW_UNION:
                    case KW_UNIONTYPE:
                    case KW_UNLOCK:
                    case KW_UNSET:
                    case KW_UNSIGNED:
                    case KW_UPDATE:
                    case KW_USE:
                    case KW_USER:
                    case KW_USING:
                    case KW_UTC:
                    case KW_UTCTIMESTAMP:
                    case KW_VALUE_TYPE:
                    case KW_VIEW:
                    case KW_WHILE:
                    case KW_WITH:
                    case MINUS:
                    case Number:
                    case PLUS:
                    case SmallintLiteral:
                    case StringLiteral:
                    case TILDE:
                    case TinyintLiteral:
                        {
                        alt21=2;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 21, 2, input);

                        throw nvae;

                    }

                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 21, 1, input);

                    throw nvae;

                }

                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;

            }

            switch (alt21) {
                case 1 :
                    // IdentifiersParser.g:156:5: KW_SORT KW_BY LPAREN columnRefOrder ( COMMA columnRefOrder )* RPAREN
                    {
                    KW_SORT74=(Token)match(input,KW_SORT,FOLLOW_KW_SORT_in_sortByClause865); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_SORT.add(KW_SORT74);


                    KW_BY75=(Token)match(input,KW_BY,FOLLOW_KW_BY_in_sortByClause867); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_BY.add(KW_BY75);


                    LPAREN76=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_sortByClause873); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN76);


                    pushFollow(FOLLOW_columnRefOrder_in_sortByClause875);
                    columnRefOrder77=gHiveParser.columnRefOrder();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_columnRefOrder.add(columnRefOrder77.getTree());

                    // IdentifiersParser.g:158:5: ( COMMA columnRefOrder )*
                    loop19:
                    do {
                        int alt19=2;
                        switch ( input.LA(1) ) {
                        case COMMA:
                            {
                            alt19=1;
                            }
                            break;

                        }

                        switch (alt19) {
                    	case 1 :
                    	    // IdentifiersParser.g:158:7: COMMA columnRefOrder
                    	    {
                    	    COMMA78=(Token)match(input,COMMA,FOLLOW_COMMA_in_sortByClause883); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA78);


                    	    pushFollow(FOLLOW_columnRefOrder_in_sortByClause885);
                    	    columnRefOrder79=gHiveParser.columnRefOrder();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_columnRefOrder.add(columnRefOrder79.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);


                    RPAREN80=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_sortByClause889); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN80);


                    // AST REWRITE
                    // elements: columnRefOrder
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 158:37: -> ^( TOK_SORTBY ( columnRefOrder )+ )
                    {
                        // IdentifiersParser.g:158:40: ^( TOK_SORTBY ( columnRefOrder )+ )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(TOK_SORTBY, "TOK_SORTBY")
                        , root_1);

                        if ( !(stream_columnRefOrder.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_columnRefOrder.hasNext() ) {
                            adaptor.addChild(root_1, stream_columnRefOrder.nextTree());

                        }
                        stream_columnRefOrder.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // IdentifiersParser.g:160:5: KW_SORT KW_BY columnRefOrder ( ( COMMA )=> COMMA columnRefOrder )*
                    {
                    KW_SORT81=(Token)match(input,KW_SORT,FOLLOW_KW_SORT_in_sortByClause910); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_SORT.add(KW_SORT81);


                    KW_BY82=(Token)match(input,KW_BY,FOLLOW_KW_BY_in_sortByClause912); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_BY.add(KW_BY82);


                    pushFollow(FOLLOW_columnRefOrder_in_sortByClause918);
                    columnRefOrder83=gHiveParser.columnRefOrder();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_columnRefOrder.add(columnRefOrder83.getTree());

                    // IdentifiersParser.g:162:5: ( ( COMMA )=> COMMA columnRefOrder )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==COMMA) && (synpred4_IdentifiersParser())) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // IdentifiersParser.g:162:7: ( COMMA )=> COMMA columnRefOrder
                    	    {
                    	    COMMA84=(Token)match(input,COMMA,FOLLOW_COMMA_in_sortByClause931); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA84);


                    	    pushFollow(FOLLOW_columnRefOrder_in_sortByClause933);
                    	    columnRefOrder85=gHiveParser.columnRefOrder();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_columnRefOrder.add(columnRefOrder85.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);


                    // AST REWRITE
                    // elements: columnRefOrder
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 162:40: -> ^( TOK_SORTBY ( columnRefOrder )+ )
                    {
                        // IdentifiersParser.g:162:43: ^( TOK_SORTBY ( columnRefOrder )+ )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(TOK_SORTBY, "TOK_SORTBY")
                        , root_1);

                        if ( !(stream_columnRefOrder.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_columnRefOrder.hasNext() ) {
                            adaptor.addChild(root_1, stream_columnRefOrder.nextTree());

                        }
                        stream_columnRefOrder.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) { gParent.popMsg(state); }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "sortByClause"


    public static class function_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "function"
    // IdentifiersParser.g:166:1: function : functionName LPAREN ( (star= STAR ) | (dist= KW_DISTINCT )? ( selectExpression ( COMMA selectExpression )* )? ) RPAREN ( KW_OVER ws= window_specification )? -> {$star != null}? ^( TOK_FUNCTIONSTAR functionName ( $ws)? ) -> {$dist == null}? ^( TOK_FUNCTION functionName ( ( selectExpression )+ )? ( $ws)? ) -> ^( TOK_FUNCTIONDI functionName ( ( selectExpression )+ )? ) ;
    public final HiveParser_IdentifiersParser.function_return function() throws RecognitionException {
        HiveParser_IdentifiersParser.function_return retval = new HiveParser_IdentifiersParser.function_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token star=null;
        Token dist=null;
        Token LPAREN87=null;
        Token COMMA89=null;
        Token RPAREN91=null;
        Token KW_OVER92=null;
        HiveParser_SelectClauseParser.window_specification_return ws =null;

        HiveParser_IdentifiersParser.functionName_return functionName86 =null;

        HiveParser_SelectClauseParser.selectExpression_return selectExpression88 =null;

        HiveParser_SelectClauseParser.selectExpression_return selectExpression90 =null;


        CommonTree star_tree=null;
        CommonTree dist_tree=null;
        CommonTree LPAREN87_tree=null;
        CommonTree COMMA89_tree=null;
        CommonTree RPAREN91_tree=null;
        CommonTree KW_OVER92_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_STAR=new RewriteRuleTokenStream(adaptor,"token STAR");
        RewriteRuleTokenStream stream_KW_OVER=new RewriteRuleTokenStream(adaptor,"token KW_OVER");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_KW_DISTINCT=new RewriteRuleTokenStream(adaptor,"token KW_DISTINCT");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_window_specification=new RewriteRuleSubtreeStream(adaptor,"rule window_specification");
        RewriteRuleSubtreeStream stream_selectExpression=new RewriteRuleSubtreeStream(adaptor,"rule selectExpression");
        RewriteRuleSubtreeStream stream_functionName=new RewriteRuleSubtreeStream(adaptor,"rule functionName");
         gParent.pushMsg("function specification", state); 
        try {
            // IdentifiersParser.g:169:5: ( functionName LPAREN ( (star= STAR ) | (dist= KW_DISTINCT )? ( selectExpression ( COMMA selectExpression )* )? ) RPAREN ( KW_OVER ws= window_specification )? -> {$star != null}? ^( TOK_FUNCTIONSTAR functionName ( $ws)? ) -> {$dist == null}? ^( TOK_FUNCTION functionName ( ( selectExpression )+ )? ( $ws)? ) -> ^( TOK_FUNCTIONDI functionName ( ( selectExpression )+ )? ) )
            // IdentifiersParser.g:170:5: functionName LPAREN ( (star= STAR ) | (dist= KW_DISTINCT )? ( selectExpression ( COMMA selectExpression )* )? ) RPAREN ( KW_OVER ws= window_specification )?
            {
            pushFollow(FOLLOW_functionName_in_function976);
            functionName86=functionName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_functionName.add(functionName86.getTree());

            LPAREN87=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_function982); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN87);


            // IdentifiersParser.g:172:7: ( (star= STAR ) | (dist= KW_DISTINCT )? ( selectExpression ( COMMA selectExpression )* )? )
            int alt25=2;
            switch ( input.LA(1) ) {
            case STAR:
                {
                alt25=1;
                }
                break;
            case BigintLiteral:
            case CharSetName:
            case DecimalLiteral:
            case Identifier:
            case KW_ADD:
            case KW_ADMIN:
            case KW_AFTER:
            case KW_ALL:
            case KW_ALTER:
            case KW_ANALYZE:
            case KW_ARCHIVE:
            case KW_ARRAY:
            case KW_AS:
            case KW_ASC:
            case KW_BEFORE:
            case KW_BETWEEN:
            case KW_BIGINT:
            case KW_BINARY:
            case KW_BOOLEAN:
            case KW_BOTH:
            case KW_BUCKET:
            case KW_BUCKETS:
            case KW_BY:
            case KW_CASCADE:
            case KW_CASE:
            case KW_CAST:
            case KW_CHANGE:
            case KW_CLUSTER:
            case KW_CLUSTERED:
            case KW_CLUSTERSTATUS:
            case KW_COLLECTION:
            case KW_COLUMNS:
            case KW_COMMENT:
            case KW_COMPACT:
            case KW_COMPACTIONS:
            case KW_COMPUTE:
            case KW_CONCATENATE:
            case KW_CONTINUE:
            case KW_CREATE:
            case KW_CUBE:
            case KW_CURSOR:
            case KW_DATA:
            case KW_DATABASES:
            case KW_DATE:
            case KW_DATETIME:
            case KW_DBPROPERTIES:
            case KW_DECIMAL:
            case KW_DEFAULT:
            case KW_DEFERRED:
            case KW_DEFINED:
            case KW_DELETE:
            case KW_DELIMITED:
            case KW_DEPENDENCY:
            case KW_DESC:
            case KW_DESCRIBE:
            case KW_DIRECTORIES:
            case KW_DIRECTORY:
            case KW_DISABLE:
            case KW_DISTINCT:
            case KW_DISTRIBUTE:
            case KW_DOUBLE:
            case KW_DROP:
            case KW_ELEM_TYPE:
            case KW_ENABLE:
            case KW_ESCAPED:
            case KW_EXCLUSIVE:
            case KW_EXISTS:
            case KW_EXPLAIN:
            case KW_EXPORT:
            case KW_EXTERNAL:
            case KW_FALSE:
            case KW_FETCH:
            case KW_FIELDS:
            case KW_FILE:
            case KW_FILEFORMAT:
            case KW_FIRST:
            case KW_FLOAT:
            case KW_FOR:
            case KW_FORMAT:
            case KW_FORMATTED:
            case KW_FULL:
            case KW_FUNCTIONS:
            case KW_GRANT:
            case KW_GROUP:
            case KW_GROUPING:
            case KW_HOLD_DDLTIME:
            case KW_IDXPROPERTIES:
            case KW_IF:
            case KW_IGNORE:
            case KW_IMPORT:
            case KW_IN:
            case KW_INDEX:
            case KW_INDEXES:
            case KW_INNER:
            case KW_INPATH:
            case KW_INPUTDRIVER:
            case KW_INPUTFORMAT:
            case KW_INSERT:
            case KW_INT:
            case KW_INTERSECT:
            case KW_INTO:
            case KW_IS:
            case KW_ITEMS:
            case KW_JAR:
            case KW_KEYS:
            case KW_KEY_TYPE:
            case KW_LATERAL:
            case KW_LEFT:
            case KW_LIKE:
            case KW_LIMIT:
            case KW_LINES:
            case KW_LOAD:
            case KW_LOCAL:
            case KW_LOCATION:
            case KW_LOCK:
            case KW_LOCKS:
            case KW_LOGICAL:
            case KW_LONG:
            case KW_MAP:
            case KW_MAPJOIN:
            case KW_MATERIALIZED:
            case KW_MINUS:
            case KW_MSCK:
            case KW_NONE:
            case KW_NOSCAN:
            case KW_NOT:
            case KW_NO_DROP:
            case KW_NULL:
            case KW_OF:
            case KW_OFFLINE:
            case KW_OPTION:
            case KW_ORCFILE:
            case KW_ORDER:
            case KW_OUT:
            case KW_OUTER:
            case KW_OUTPUTDRIVER:
            case KW_OUTPUTFORMAT:
            case KW_OVERWRITE:
            case KW_OWNER:
            case KW_PARQUETFILE:
            case KW_PARTITION:
            case KW_PARTITIONED:
            case KW_PARTITIONS:
            case KW_PERCENT:
            case KW_PLUS:
            case KW_PRETTY:
            case KW_PRINCIPALS:
            case KW_PROCEDURE:
            case KW_PROTECTION:
            case KW_PURGE:
            case KW_RANGE:
            case KW_RCFILE:
            case KW_READ:
            case KW_READONLY:
            case KW_READS:
            case KW_REBUILD:
            case KW_RECORDREADER:
            case KW_RECORDWRITER:
            case KW_REGEXP:
            case KW_RENAME:
            case KW_REPAIR:
            case KW_REPLACE:
            case KW_RESTRICT:
            case KW_REVOKE:
            case KW_RIGHT:
            case KW_RLIKE:
            case KW_ROLE:
            case KW_ROLES:
            case KW_ROLLUP:
            case KW_ROW:
            case KW_ROWS:
            case KW_SCHEMA:
            case KW_SCHEMAS:
            case KW_SEMI:
            case KW_SEQUENCEFILE:
            case KW_SERDE:
            case KW_SERDEPROPERTIES:
            case KW_SET:
            case KW_SETS:
            case KW_SHARED:
            case KW_SHOW:
            case KW_SHOW_DATABASE:
            case KW_SKEWED:
            case KW_SMALLINT:
            case KW_SORT:
            case KW_SORTED:
            case KW_SSL:
            case KW_STATISTICS:
            case KW_STORED:
            case KW_STREAMTABLE:
            case KW_STRING:
            case KW_STRUCT:
            case KW_TABLE:
            case KW_TABLES:
            case KW_TBLPROPERTIES:
            case KW_TEMPORARY:
            case KW_TERMINATED:
            case KW_TEXTFILE:
            case KW_TIMESTAMP:
            case KW_TINYINT:
            case KW_TO:
            case KW_TOUCH:
            case KW_TRANSACTIONS:
            case KW_TRIGGER:
            case KW_TRUE:
            case KW_TRUNCATE:
            case KW_UNARCHIVE:
            case KW_UNDO:
            case KW_UNION:
            case KW_UNIONTYPE:
            case KW_UNLOCK:
            case KW_UNSET:
            case KW_UNSIGNED:
            case KW_UPDATE:
            case KW_USE:
            case KW_USER:
            case KW_USING:
            case KW_UTC:
            case KW_UTCTIMESTAMP:
            case KW_VALUE_TYPE:
            case KW_VIEW:
            case KW_WHILE:
            case KW_WITH:
            case LPAREN:
            case MINUS:
            case Number:
            case PLUS:
            case RPAREN:
            case SmallintLiteral:
            case StringLiteral:
            case TILDE:
            case TinyintLiteral:
                {
                alt25=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;

            }

            switch (alt25) {
                case 1 :
                    // IdentifiersParser.g:173:9: (star= STAR )
                    {
                    // IdentifiersParser.g:173:9: (star= STAR )
                    // IdentifiersParser.g:173:10: star= STAR
                    {
                    star=(Token)match(input,STAR,FOLLOW_STAR_in_function1003); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_STAR.add(star);


                    }


                    }
                    break;
                case 2 :
                    // IdentifiersParser.g:174:11: (dist= KW_DISTINCT )? ( selectExpression ( COMMA selectExpression )* )?
                    {
                    // IdentifiersParser.g:174:11: (dist= KW_DISTINCT )?
                    int alt22=2;
                    switch ( input.LA(1) ) {
                        case KW_DISTINCT:
                            {
                            alt22=1;
                            }
                            break;
                    }

                    switch (alt22) {
                        case 1 :
                            // IdentifiersParser.g:174:12: dist= KW_DISTINCT
                            {
                            dist=(Token)match(input,KW_DISTINCT,FOLLOW_KW_DISTINCT_in_function1019); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_KW_DISTINCT.add(dist);


                            }
                            break;

                    }


                    // IdentifiersParser.g:174:31: ( selectExpression ( COMMA selectExpression )* )?
                    int alt24=2;
                    switch ( input.LA(1) ) {
                        case BigintLiteral:
                        case CharSetName:
                        case DecimalLiteral:
                        case Identifier:
                        case KW_ADD:
                        case KW_ADMIN:
                        case KW_AFTER:
                        case KW_ALL:
                        case KW_ALTER:
                        case KW_ANALYZE:
                        case KW_ARCHIVE:
                        case KW_ARRAY:
                        case KW_AS:
                        case KW_ASC:
                        case KW_BEFORE:
                        case KW_BETWEEN:
                        case KW_BIGINT:
                        case KW_BINARY:
                        case KW_BOOLEAN:
                        case KW_BOTH:
                        case KW_BUCKET:
                        case KW_BUCKETS:
                        case KW_BY:
                        case KW_CASCADE:
                        case KW_CASE:
                        case KW_CAST:
                        case KW_CHANGE:
                        case KW_CLUSTER:
                        case KW_CLUSTERED:
                        case KW_CLUSTERSTATUS:
                        case KW_COLLECTION:
                        case KW_COLUMNS:
                        case KW_COMMENT:
                        case KW_COMPACT:
                        case KW_COMPACTIONS:
                        case KW_COMPUTE:
                        case KW_CONCATENATE:
                        case KW_CONTINUE:
                        case KW_CREATE:
                        case KW_CUBE:
                        case KW_CURSOR:
                        case KW_DATA:
                        case KW_DATABASES:
                        case KW_DATE:
                        case KW_DATETIME:
                        case KW_DBPROPERTIES:
                        case KW_DECIMAL:
                        case KW_DEFAULT:
                        case KW_DEFERRED:
                        case KW_DEFINED:
                        case KW_DELETE:
                        case KW_DELIMITED:
                        case KW_DEPENDENCY:
                        case KW_DESC:
                        case KW_DESCRIBE:
                        case KW_DIRECTORIES:
                        case KW_DIRECTORY:
                        case KW_DISABLE:
                        case KW_DISTRIBUTE:
                        case KW_DOUBLE:
                        case KW_DROP:
                        case KW_ELEM_TYPE:
                        case KW_ENABLE:
                        case KW_ESCAPED:
                        case KW_EXCLUSIVE:
                        case KW_EXISTS:
                        case KW_EXPLAIN:
                        case KW_EXPORT:
                        case KW_EXTERNAL:
                        case KW_FALSE:
                        case KW_FETCH:
                        case KW_FIELDS:
                        case KW_FILE:
                        case KW_FILEFORMAT:
                        case KW_FIRST:
                        case KW_FLOAT:
                        case KW_FOR:
                        case KW_FORMAT:
                        case KW_FORMATTED:
                        case KW_FULL:
                        case KW_FUNCTIONS:
                        case KW_GRANT:
                        case KW_GROUP:
                        case KW_GROUPING:
                        case KW_HOLD_DDLTIME:
                        case KW_IDXPROPERTIES:
                        case KW_IF:
                        case KW_IGNORE:
                        case KW_IMPORT:
                        case KW_IN:
                        case KW_INDEX:
                        case KW_INDEXES:
                        case KW_INNER:
                        case KW_INPATH:
                        case KW_INPUTDRIVER:
                        case KW_INPUTFORMAT:
                        case KW_INSERT:
                        case KW_INT:
                        case KW_INTERSECT:
                        case KW_INTO:
                        case KW_IS:
                        case KW_ITEMS:
                        case KW_JAR:
                        case KW_KEYS:
                        case KW_KEY_TYPE:
                        case KW_LATERAL:
                        case KW_LEFT:
                        case KW_LIKE:
                        case KW_LIMIT:
                        case KW_LINES:
                        case KW_LOAD:
                        case KW_LOCAL:
                        case KW_LOCATION:
                        case KW_LOCK:
                        case KW_LOCKS:
                        case KW_LOGICAL:
                        case KW_LONG:
                        case KW_MAP:
                        case KW_MAPJOIN:
                        case KW_MATERIALIZED:
                        case KW_MINUS:
                        case KW_MSCK:
                        case KW_NONE:
                        case KW_NOSCAN:
                        case KW_NOT:
                        case KW_NO_DROP:
                        case KW_NULL:
                        case KW_OF:
                        case KW_OFFLINE:
                        case KW_OPTION:
                        case KW_ORCFILE:
                        case KW_ORDER:
                        case KW_OUT:
                        case KW_OUTER:
                        case KW_OUTPUTDRIVER:
                        case KW_OUTPUTFORMAT:
                        case KW_OVERWRITE:
                        case KW_OWNER:
                        case KW_PARQUETFILE:
                        case KW_PARTITION:
                        case KW_PARTITIONED:
                        case KW_PARTITIONS:
                        case KW_PERCENT:
                        case KW_PLUS:
                        case KW_PRETTY:
                        case KW_PRINCIPALS:
                        case KW_PROCEDURE:
                        case KW_PROTECTION:
                        case KW_PURGE:
                        case KW_RANGE:
                        case KW_RCFILE:
                        case KW_READ:
                        case KW_READONLY:
                        case KW_READS:
                        case KW_REBUILD:
                        case KW_RECORDREADER:
                        case KW_RECORDWRITER:
                        case KW_REGEXP:
                        case KW_RENAME:
                        case KW_REPAIR:
                        case KW_REPLACE:
                        case KW_RESTRICT:
                        case KW_REVOKE:
                        case KW_RIGHT:
                        case KW_RLIKE:
                        case KW_ROLE:
                        case KW_ROLES:
                        case KW_ROLLUP:
                        case KW_ROW:
                        case KW_ROWS:
                        case KW_SCHEMA:
                        case KW_SCHEMAS:
                        case KW_SEMI:
                        case KW_SEQUENCEFILE:
                        case KW_SERDE:
                        case KW_SERDEPROPERTIES:
                        case KW_SET:
                        case KW_SETS:
                        case KW_SHARED:
                        case KW_SHOW:
                        case KW_SHOW_DATABASE:
                        case KW_SKEWED:
                        case KW_SMALLINT:
                        case KW_SORT:
                        case KW_SORTED:
                        case KW_SSL:
                        case KW_STATISTICS:
                        case KW_STORED:
                        case KW_STREAMTABLE:
                        case KW_STRING:
                        case KW_STRUCT:
                        case KW_TABLE:
                        case KW_TABLES:
                        case KW_TBLPROPERTIES:
                        case KW_TEMPORARY:
                        case KW_TERMINATED:
                        case KW_TEXTFILE:
                        case KW_TIMESTAMP:
                        case KW_TINYINT:
                        case KW_TO:
                        case KW_TOUCH:
                        case KW_TRANSACTIONS:
                        case KW_TRIGGER:
                        case KW_TRUE:
                        case KW_TRUNCATE:
                        case KW_UNARCHIVE:
                        case KW_UNDO:
                        case KW_UNION:
                        case KW_UNIONTYPE:
                        case KW_UNLOCK:
                        case KW_UNSET:
                        case KW_UNSIGNED:
                        case KW_UPDATE:
                        case KW_USE:
                        case KW_USER:
                        case KW_USING:
                        case KW_UTC:
                        case KW_UTCTIMESTAMP:
                        case KW_VALUE_TYPE:
                        case KW_VIEW:
                        case KW_WHILE:
                        case KW_WITH:
                        case LPAREN:
                        case MINUS:
                        case Number:
                        case PLUS:
                        case STAR:
                        case SmallintLiteral:
                        case StringLiteral:
                        case TILDE:
                        case TinyintLiteral:
                            {
                            alt24=1;
                            }
                            break;
                    }

                    switch (alt24) {
                        case 1 :
                            // IdentifiersParser.g:174:32: selectExpression ( COMMA selectExpression )*
                            {
                            pushFollow(FOLLOW_selectExpression_in_function1024);
                            selectExpression88=gHiveParser.selectExpression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_selectExpression.add(selectExpression88.getTree());

                            // IdentifiersParser.g:174:49: ( COMMA selectExpression )*
                            loop23:
                            do {
                                int alt23=2;
                                switch ( input.LA(1) ) {
                                case COMMA:
                                    {
                                    alt23=1;
                                    }
                                    break;

                                }

                                switch (alt23) {
                            	case 1 :
                            	    // IdentifiersParser.g:174:50: COMMA selectExpression
                            	    {
                            	    COMMA89=(Token)match(input,COMMA,FOLLOW_COMMA_in_function1027); if (state.failed) return retval; 
                            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA89);


                            	    pushFollow(FOLLOW_selectExpression_in_function1029);
                            	    selectExpression90=gHiveParser.selectExpression();

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) stream_selectExpression.add(selectExpression90.getTree());

                            	    }
                            	    break;

                            	default :
                            	    break loop23;
                                }
                            } while (true);


                            }
                            break;

                    }


                    }
                    break;

            }


            RPAREN91=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_function1047); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN91);


            // IdentifiersParser.g:176:12: ( KW_OVER ws= window_specification )?
            int alt26=2;
            alt26 = dfa26.predict(input);
            switch (alt26) {
                case 1 :
                    // IdentifiersParser.g:176:13: KW_OVER ws= window_specification
                    {
                    KW_OVER92=(Token)match(input,KW_OVER,FOLLOW_KW_OVER_in_function1050); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_OVER.add(KW_OVER92);


                    pushFollow(FOLLOW_window_specification_in_function1054);
                    ws=gHiveParser.window_specification();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_window_specification.add(ws.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: selectExpression, functionName, functionName, selectExpression, ws, ws, functionName
            // token labels: 
            // rule labels: retval, ws
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_ws=new RewriteRuleSubtreeStream(adaptor,"rule ws",ws!=null?ws.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 177:12: -> {$star != null}? ^( TOK_FUNCTIONSTAR functionName ( $ws)? )
            if (star != null) {
                // IdentifiersParser.g:177:32: ^( TOK_FUNCTIONSTAR functionName ( $ws)? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(TOK_FUNCTIONSTAR, "TOK_FUNCTIONSTAR")
                , root_1);

                adaptor.addChild(root_1, stream_functionName.nextTree());

                // IdentifiersParser.g:177:65: ( $ws)?
                if ( stream_ws.hasNext() ) {
                    adaptor.addChild(root_1, stream_ws.nextTree());

                }
                stream_ws.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            else // 178:12: -> {$dist == null}? ^( TOK_FUNCTION functionName ( ( selectExpression )+ )? ( $ws)? )
            if (dist == null) {
                // IdentifiersParser.g:178:32: ^( TOK_FUNCTION functionName ( ( selectExpression )+ )? ( $ws)? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(TOK_FUNCTION, "TOK_FUNCTION")
                , root_1);

                adaptor.addChild(root_1, stream_functionName.nextTree());

                // IdentifiersParser.g:178:60: ( ( selectExpression )+ )?
                if ( stream_selectExpression.hasNext() ) {
                    if ( !(stream_selectExpression.hasNext()) ) {
                        throw new RewriteEarlyExitException();
                    }
                    while ( stream_selectExpression.hasNext() ) {
                        adaptor.addChild(root_1, stream_selectExpression.nextTree());

                    }
                    stream_selectExpression.reset();

                }
                stream_selectExpression.reset();

                // IdentifiersParser.g:178:82: ( $ws)?
                if ( stream_ws.hasNext() ) {
                    adaptor.addChild(root_1, stream_ws.nextTree());

                }
                stream_ws.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            else // 179:29: -> ^( TOK_FUNCTIONDI functionName ( ( selectExpression )+ )? )
            {
                // IdentifiersParser.g:179:32: ^( TOK_FUNCTIONDI functionName ( ( selectExpression )+ )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(TOK_FUNCTIONDI, "TOK_FUNCTIONDI")
                , root_1);

                adaptor.addChild(root_1, stream_functionName.nextTree());

                // IdentifiersParser.g:179:62: ( ( selectExpression )+ )?
                if ( stream_selectExpression.hasNext() ) {
                    if ( !(stream_selectExpression.hasNext()) ) {
                        throw new RewriteEarlyExitException();
                    }
                    while ( stream_selectExpression.hasNext() ) {
                        adaptor.addChild(root_1, stream_selectExpression.nextTree());

                    }
                    stream_selectExpression.reset();

                }
                stream_selectExpression.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) { gParent.popMsg(state); }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "function"


    public static class functionName_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "functionName"
    // IdentifiersParser.g:182:1: functionName : ( KW_IF | KW_ARRAY | KW_MAP | KW_STRUCT | KW_UNIONTYPE | functionIdentifier );
    public final HiveParser_IdentifiersParser.functionName_return functionName() throws RecognitionException {
        HiveParser_IdentifiersParser.functionName_return retval = new HiveParser_IdentifiersParser.functionName_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token KW_IF93=null;
        Token KW_ARRAY94=null;
        Token KW_MAP95=null;
        Token KW_STRUCT96=null;
        Token KW_UNIONTYPE97=null;
        HiveParser_IdentifiersParser.functionIdentifier_return functionIdentifier98 =null;


        CommonTree KW_IF93_tree=null;
        CommonTree KW_ARRAY94_tree=null;
        CommonTree KW_MAP95_tree=null;
        CommonTree KW_STRUCT96_tree=null;
        CommonTree KW_UNIONTYPE97_tree=null;

         gParent.pushMsg("function name", state); 
        try {
            // IdentifiersParser.g:185:5: ( KW_IF | KW_ARRAY | KW_MAP | KW_STRUCT | KW_UNIONTYPE | functionIdentifier )
            int alt27=6;
            switch ( input.LA(1) ) {
            case KW_IF:
                {
                alt27=1;
                }
                break;
            case KW_ARRAY:
                {
                alt27=2;
                }
                break;
            case KW_MAP:
                {
                alt27=3;
                }
                break;
            case KW_STRUCT:
                {
                alt27=4;
                }
                break;
            case KW_UNIONTYPE:
                {
                alt27=5;
                }
                break;
            case Identifier:
            case KW_ADD:
            case KW_ADMIN:
            case KW_AFTER:
            case KW_ALL:
            case KW_ALTER:
            case KW_ANALYZE:
            case KW_ARCHIVE:
            case KW_AS:
            case KW_ASC:
            case KW_BEFORE:
            case KW_BETWEEN:
            case KW_BIGINT:
            case KW_BINARY:
            case KW_BOOLEAN:
            case KW_BOTH:
            case KW_BUCKET:
            case KW_BUCKETS:
            case KW_BY:
            case KW_CASCADE:
            case KW_CHANGE:
            case KW_CLUSTER:
            case KW_CLUSTERED:
            case KW_CLUSTERSTATUS:
            case KW_COLLECTION:
            case KW_COLUMNS:
            case KW_COMMENT:
            case KW_COMPACT:
            case KW_COMPACTIONS:
            case KW_COMPUTE:
            case KW_CONCATENATE:
            case KW_CONTINUE:
            case KW_CREATE:
            case KW_CUBE:
            case KW_CURSOR:
            case KW_DATA:
            case KW_DATABASES:
            case KW_DATE:
            case KW_DATETIME:
            case KW_DBPROPERTIES:
            case KW_DECIMAL:
            case KW_DEFAULT:
            case KW_DEFERRED:
            case KW_DEFINED:
            case KW_DELETE:
            case KW_DELIMITED:
            case KW_DEPENDENCY:
            case KW_DESC:
            case KW_DESCRIBE:
            case KW_DIRECTORIES:
            case KW_DIRECTORY:
            case KW_DISABLE:
            case KW_DISTRIBUTE:
            case KW_DOUBLE:
            case KW_DROP:
            case KW_ELEM_TYPE:
            case KW_ENABLE:
            case KW_ESCAPED:
            case KW_EXCLUSIVE:
            case KW_EXISTS:
            case KW_EXPLAIN:
            case KW_EXPORT:
            case KW_EXTERNAL:
            case KW_FALSE:
            case KW_FETCH:
            case KW_FIELDS:
            case KW_FILE:
            case KW_FILEFORMAT:
            case KW_FIRST:
            case KW_FLOAT:
            case KW_FOR:
            case KW_FORMAT:
            case KW_FORMATTED:
            case KW_FULL:
            case KW_FUNCTIONS:
            case KW_GRANT:
            case KW_GROUP:
            case KW_GROUPING:
            case KW_HOLD_DDLTIME:
            case KW_IDXPROPERTIES:
            case KW_IGNORE:
            case KW_IMPORT:
            case KW_IN:
            case KW_INDEX:
            case KW_INDEXES:
            case KW_INNER:
            case KW_INPATH:
            case KW_INPUTDRIVER:
            case KW_INPUTFORMAT:
            case KW_INSERT:
            case KW_INT:
            case KW_INTERSECT:
            case KW_INTO:
            case KW_IS:
            case KW_ITEMS:
            case KW_JAR:
            case KW_KEYS:
            case KW_KEY_TYPE:
            case KW_LATERAL:
            case KW_LEFT:
            case KW_LIKE:
            case KW_LIMIT:
            case KW_LINES:
            case KW_LOAD:
            case KW_LOCAL:
            case KW_LOCATION:
            case KW_LOCK:
            case KW_LOCKS:
            case KW_LOGICAL:
            case KW_LONG:
            case KW_MAPJOIN:
            case KW_MATERIALIZED:
            case KW_MINUS:
            case KW_MSCK:
            case KW_NONE:
            case KW_NOSCAN:
            case KW_NO_DROP:
            case KW_NULL:
            case KW_OF:
            case KW_OFFLINE:
            case KW_OPTION:
            case KW_ORCFILE:
            case KW_ORDER:
            case KW_OUT:
            case KW_OUTER:
            case KW_OUTPUTDRIVER:
            case KW_OUTPUTFORMAT:
            case KW_OVERWRITE:
            case KW_OWNER:
            case KW_PARQUETFILE:
            case KW_PARTITION:
            case KW_PARTITIONED:
            case KW_PARTITIONS:
            case KW_PERCENT:
            case KW_PLUS:
            case KW_PRETTY:
            case KW_PRINCIPALS:
            case KW_PROCEDURE:
            case KW_PROTECTION:
            case KW_PURGE:
            case KW_RANGE:
            case KW_RCFILE:
            case KW_READ:
            case KW_READONLY:
            case KW_READS:
            case KW_REBUILD:
            case KW_RECORDREADER:
            case KW_RECORDWRITER:
            case KW_REGEXP:
            case KW_RENAME:
            case KW_REPAIR:
            case KW_REPLACE:
            case KW_RESTRICT:
            case KW_REVOKE:
            case KW_RIGHT:
            case KW_RLIKE:
            case KW_ROLE:
            case KW_ROLES:
            case KW_ROLLUP:
            case KW_ROW:
            case KW_ROWS:
            case KW_SCHEMA:
            case KW_SCHEMAS:
            case KW_SEMI:
            case KW_SEQUENCEFILE:
            case KW_SERDE:
            case KW_SERDEPROPERTIES:
            case KW_SET:
            case KW_SETS:
            case KW_SHARED:
            case KW_SHOW:
            case KW_SHOW_DATABASE:
            case KW_SKEWED:
            case KW_SMALLINT:
            case KW_SORT:
            case KW_SORTED:
            case KW_SSL:
            case KW_STATISTICS:
            case KW_STORED:
            case KW_STREAMTABLE:
            case KW_STRING:
            case KW_TABLE:
            case KW_TABLES:
            case KW_TBLPROPERTIES:
            case KW_TEMPORARY:
            case KW_TERMINATED:
            case KW_TEXTFILE:
            case KW_TIMESTAMP:
            case KW_TINYINT:
            case KW_TO:
            case KW_TOUCH:
            case KW_TRANSACTIONS:
            case KW_TRIGGER:
            case KW_TRUE:
            case KW_TRUNCATE:
            case KW_UNARCHIVE:
            case KW_UNDO:
            case KW_UNION:
            case KW_UNLOCK:
            case KW_UNSET:
            case KW_UNSIGNED:
            case KW_UPDATE:
            case KW_USE:
            case KW_USER:
            case KW_USING:
            case KW_UTC:
            case KW_UTCTIMESTAMP:
            case KW_VALUE_TYPE:
            case KW_VIEW:
            case KW_WHILE:
            case KW_WITH:
                {
                alt27=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;

            }

            switch (alt27) {
                case 1 :
                    // IdentifiersParser.g:186:5: KW_IF
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    KW_IF93=(Token)match(input,KW_IF,FOLLOW_KW_IF_in_functionName1186); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    KW_IF93_tree = 
                    (CommonTree)adaptor.create(KW_IF93)
                    ;
                    adaptor.addChild(root_0, KW_IF93_tree);
                    }

                    }
                    break;
                case 2 :
                    // IdentifiersParser.g:186:13: KW_ARRAY
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    KW_ARRAY94=(Token)match(input,KW_ARRAY,FOLLOW_KW_ARRAY_in_functionName1190); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    KW_ARRAY94_tree = 
                    (CommonTree)adaptor.create(KW_ARRAY94)
                    ;
                    adaptor.addChild(root_0, KW_ARRAY94_tree);
                    }

                    }
                    break;
                case 3 :
                    // IdentifiersParser.g:186:24: KW_MAP
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    KW_MAP95=(Token)match(input,KW_MAP,FOLLOW_KW_MAP_in_functionName1194); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    KW_MAP95_tree = 
                    (CommonTree)adaptor.create(KW_MAP95)
                    ;
                    adaptor.addChild(root_0, KW_MAP95_tree);
                    }

                    }
                    break;
                case 4 :
                    // IdentifiersParser.g:186:33: KW_STRUCT
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    KW_STRUCT96=(Token)match(input,KW_STRUCT,FOLLOW_KW_STRUCT_in_functionName1198); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    KW_STRUCT96_tree = 
                    (CommonTree)adaptor.create(KW_STRUCT96)
                    ;
                    adaptor.addChild(root_0, KW_STRUCT96_tree);
                    }

                    }
                    break;
                case 5 :
                    // IdentifiersParser.g:186:45: KW_UNIONTYPE
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    KW_UNIONTYPE97=(Token)match(input,KW_UNIONTYPE,FOLLOW_KW_UNIONTYPE_in_functionName1202); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    KW_UNIONTYPE97_tree = 
                    (CommonTree)adaptor.create(KW_UNIONTYPE97)
                    ;
                    adaptor.addChild(root_0, KW_UNIONTYPE97_tree);
                    }

                    }
                    break;
                case 6 :
                    // IdentifiersParser.g:186:60: functionIdentifier
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_functionIdentifier_in_functionName1206);
                    functionIdentifier98=functionIdentifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, functionIdentifier98.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) { gParent.popMsg(state); }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "functionName"


    public static class castExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "castExpression"
    // IdentifiersParser.g:189:1: castExpression : KW_CAST LPAREN expression KW_AS primitiveType RPAREN -> ^( TOK_FUNCTION primitiveType expression ) ;
    public final HiveParser_IdentifiersParser.castExpression_return castExpression() throws RecognitionException {
        HiveParser_IdentifiersParser.castExpression_return retval = new HiveParser_IdentifiersParser.castExpression_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token KW_CAST99=null;
        Token LPAREN100=null;
        Token KW_AS102=null;
        Token RPAREN104=null;
        HiveParser_IdentifiersParser.expression_return expression101 =null;

        HiveParser.primitiveType_return primitiveType103 =null;


        CommonTree KW_CAST99_tree=null;
        CommonTree LPAREN100_tree=null;
        CommonTree KW_AS102_tree=null;
        CommonTree RPAREN104_tree=null;
        RewriteRuleTokenStream stream_KW_AS=new RewriteRuleTokenStream(adaptor,"token KW_AS");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_KW_CAST=new RewriteRuleTokenStream(adaptor,"token KW_CAST");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_primitiveType=new RewriteRuleSubtreeStream(adaptor,"rule primitiveType");
         gParent.pushMsg("cast expression", state); 
        try {
            // IdentifiersParser.g:192:5: ( KW_CAST LPAREN expression KW_AS primitiveType RPAREN -> ^( TOK_FUNCTION primitiveType expression ) )
            // IdentifiersParser.g:193:5: KW_CAST LPAREN expression KW_AS primitiveType RPAREN
            {
            KW_CAST99=(Token)match(input,KW_CAST,FOLLOW_KW_CAST_in_castExpression1237); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_CAST.add(KW_CAST99);


            LPAREN100=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_castExpression1243); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN100);


            pushFollow(FOLLOW_expression_in_castExpression1255);
            expression101=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(expression101.getTree());

            KW_AS102=(Token)match(input,KW_AS,FOLLOW_KW_AS_in_castExpression1267); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_AS.add(KW_AS102);


            pushFollow(FOLLOW_primitiveType_in_castExpression1279);
            primitiveType103=gHiveParser.primitiveType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_primitiveType.add(primitiveType103.getTree());

            RPAREN104=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_castExpression1285); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN104);


            // AST REWRITE
            // elements: primitiveType, expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 198:12: -> ^( TOK_FUNCTION primitiveType expression )
            {
                // IdentifiersParser.g:198:15: ^( TOK_FUNCTION primitiveType expression )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(TOK_FUNCTION, "TOK_FUNCTION")
                , root_1);

                adaptor.addChild(root_1, stream_primitiveType.nextTree());

                adaptor.addChild(root_1, stream_expression.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) { gParent.popMsg(state); }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "castExpression"


    public static class caseExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "caseExpression"
    // IdentifiersParser.g:201:1: caseExpression : KW_CASE expression ( KW_WHEN expression KW_THEN expression )+ ( KW_ELSE expression )? KW_END -> ^( TOK_FUNCTION KW_CASE ( expression )* ) ;
    public final HiveParser_IdentifiersParser.caseExpression_return caseExpression() throws RecognitionException {
        HiveParser_IdentifiersParser.caseExpression_return retval = new HiveParser_IdentifiersParser.caseExpression_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token KW_CASE105=null;
        Token KW_WHEN107=null;
        Token KW_THEN109=null;
        Token KW_ELSE111=null;
        Token KW_END113=null;
        HiveParser_IdentifiersParser.expression_return expression106 =null;

        HiveParser_IdentifiersParser.expression_return expression108 =null;

        HiveParser_IdentifiersParser.expression_return expression110 =null;

        HiveParser_IdentifiersParser.expression_return expression112 =null;


        CommonTree KW_CASE105_tree=null;
        CommonTree KW_WHEN107_tree=null;
        CommonTree KW_THEN109_tree=null;
        CommonTree KW_ELSE111_tree=null;
        CommonTree KW_END113_tree=null;
        RewriteRuleTokenStream stream_KW_THEN=new RewriteRuleTokenStream(adaptor,"token KW_THEN");
        RewriteRuleTokenStream stream_KW_CASE=new RewriteRuleTokenStream(adaptor,"token KW_CASE");
        RewriteRuleTokenStream stream_KW_WHEN=new RewriteRuleTokenStream(adaptor,"token KW_WHEN");
        RewriteRuleTokenStream stream_KW_END=new RewriteRuleTokenStream(adaptor,"token KW_END");
        RewriteRuleTokenStream stream_KW_ELSE=new RewriteRuleTokenStream(adaptor,"token KW_ELSE");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
         gParent.pushMsg("case expression", state); 
        try {
            // IdentifiersParser.g:204:5: ( KW_CASE expression ( KW_WHEN expression KW_THEN expression )+ ( KW_ELSE expression )? KW_END -> ^( TOK_FUNCTION KW_CASE ( expression )* ) )
            // IdentifiersParser.g:205:5: KW_CASE expression ( KW_WHEN expression KW_THEN expression )+ ( KW_ELSE expression )? KW_END
            {
            KW_CASE105=(Token)match(input,KW_CASE,FOLLOW_KW_CASE_in_caseExpression1326); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_CASE.add(KW_CASE105);


            pushFollow(FOLLOW_expression_in_caseExpression1328);
            expression106=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(expression106.getTree());

            // IdentifiersParser.g:206:5: ( KW_WHEN expression KW_THEN expression )+
            int cnt28=0;
            loop28:
            do {
                int alt28=2;
                switch ( input.LA(1) ) {
                case KW_WHEN:
                    {
                    alt28=1;
                    }
                    break;

                }

                switch (alt28) {
            	case 1 :
            	    // IdentifiersParser.g:206:6: KW_WHEN expression KW_THEN expression
            	    {
            	    KW_WHEN107=(Token)match(input,KW_WHEN,FOLLOW_KW_WHEN_in_caseExpression1335); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_KW_WHEN.add(KW_WHEN107);


            	    pushFollow(FOLLOW_expression_in_caseExpression1337);
            	    expression108=expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_expression.add(expression108.getTree());

            	    KW_THEN109=(Token)match(input,KW_THEN,FOLLOW_KW_THEN_in_caseExpression1339); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_KW_THEN.add(KW_THEN109);


            	    pushFollow(FOLLOW_expression_in_caseExpression1341);
            	    expression110=expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_expression.add(expression110.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt28 >= 1 ) break loop28;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(28, input);
                        throw eee;
                }
                cnt28++;
            } while (true);


            // IdentifiersParser.g:207:5: ( KW_ELSE expression )?
            int alt29=2;
            switch ( input.LA(1) ) {
                case KW_ELSE:
                    {
                    alt29=1;
                    }
                    break;
            }

            switch (alt29) {
                case 1 :
                    // IdentifiersParser.g:207:6: KW_ELSE expression
                    {
                    KW_ELSE111=(Token)match(input,KW_ELSE,FOLLOW_KW_ELSE_in_caseExpression1350); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_ELSE.add(KW_ELSE111);


                    pushFollow(FOLLOW_expression_in_caseExpression1352);
                    expression112=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression112.getTree());

                    }
                    break;

            }


            KW_END113=(Token)match(input,KW_END,FOLLOW_KW_END_in_caseExpression1360); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_END.add(KW_END113);


            // AST REWRITE
            // elements: expression, KW_CASE
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 208:12: -> ^( TOK_FUNCTION KW_CASE ( expression )* )
            {
                // IdentifiersParser.g:208:15: ^( TOK_FUNCTION KW_CASE ( expression )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(TOK_FUNCTION, "TOK_FUNCTION")
                , root_1);

                adaptor.addChild(root_1, 
                stream_KW_CASE.nextNode()
                );

                // IdentifiersParser.g:208:38: ( expression )*
                while ( stream_expression.hasNext() ) {
                    adaptor.addChild(root_1, stream_expression.nextTree());

                }
                stream_expression.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) { gParent.popMsg(state); }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "caseExpression"


    public static class whenExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "whenExpression"
    // IdentifiersParser.g:211:1: whenExpression : KW_CASE ( KW_WHEN expression KW_THEN expression )+ ( KW_ELSE expression )? KW_END -> ^( TOK_FUNCTION KW_WHEN ( expression )* ) ;
    public final HiveParser_IdentifiersParser.whenExpression_return whenExpression() throws RecognitionException {
        HiveParser_IdentifiersParser.whenExpression_return retval = new HiveParser_IdentifiersParser.whenExpression_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token KW_CASE114=null;
        Token KW_WHEN115=null;
        Token KW_THEN117=null;
        Token KW_ELSE119=null;
        Token KW_END121=null;
        HiveParser_IdentifiersParser.expression_return expression116 =null;

        HiveParser_IdentifiersParser.expression_return expression118 =null;

        HiveParser_IdentifiersParser.expression_return expression120 =null;


        CommonTree KW_CASE114_tree=null;
        CommonTree KW_WHEN115_tree=null;
        CommonTree KW_THEN117_tree=null;
        CommonTree KW_ELSE119_tree=null;
        CommonTree KW_END121_tree=null;
        RewriteRuleTokenStream stream_KW_THEN=new RewriteRuleTokenStream(adaptor,"token KW_THEN");
        RewriteRuleTokenStream stream_KW_CASE=new RewriteRuleTokenStream(adaptor,"token KW_CASE");
        RewriteRuleTokenStream stream_KW_WHEN=new RewriteRuleTokenStream(adaptor,"token KW_WHEN");
        RewriteRuleTokenStream stream_KW_END=new RewriteRuleTokenStream(adaptor,"token KW_END");
        RewriteRuleTokenStream stream_KW_ELSE=new RewriteRuleTokenStream(adaptor,"token KW_ELSE");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
         gParent.pushMsg("case expression", state); 
        try {
            // IdentifiersParser.g:214:5: ( KW_CASE ( KW_WHEN expression KW_THEN expression )+ ( KW_ELSE expression )? KW_END -> ^( TOK_FUNCTION KW_WHEN ( expression )* ) )
            // IdentifiersParser.g:215:5: KW_CASE ( KW_WHEN expression KW_THEN expression )+ ( KW_ELSE expression )? KW_END
            {
            KW_CASE114=(Token)match(input,KW_CASE,FOLLOW_KW_CASE_in_whenExpression1402); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_CASE.add(KW_CASE114);


            // IdentifiersParser.g:216:6: ( KW_WHEN expression KW_THEN expression )+
            int cnt30=0;
            loop30:
            do {
                int alt30=2;
                switch ( input.LA(1) ) {
                case KW_WHEN:
                    {
                    alt30=1;
                    }
                    break;

                }

                switch (alt30) {
            	case 1 :
            	    // IdentifiersParser.g:216:8: KW_WHEN expression KW_THEN expression
            	    {
            	    KW_WHEN115=(Token)match(input,KW_WHEN,FOLLOW_KW_WHEN_in_whenExpression1411); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_KW_WHEN.add(KW_WHEN115);


            	    pushFollow(FOLLOW_expression_in_whenExpression1413);
            	    expression116=expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_expression.add(expression116.getTree());

            	    KW_THEN117=(Token)match(input,KW_THEN,FOLLOW_KW_THEN_in_whenExpression1415); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_KW_THEN.add(KW_THEN117);


            	    pushFollow(FOLLOW_expression_in_whenExpression1417);
            	    expression118=expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_expression.add(expression118.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt30 >= 1 ) break loop30;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(30, input);
                        throw eee;
                }
                cnt30++;
            } while (true);


            // IdentifiersParser.g:217:5: ( KW_ELSE expression )?
            int alt31=2;
            switch ( input.LA(1) ) {
                case KW_ELSE:
                    {
                    alt31=1;
                    }
                    break;
            }

            switch (alt31) {
                case 1 :
                    // IdentifiersParser.g:217:6: KW_ELSE expression
                    {
                    KW_ELSE119=(Token)match(input,KW_ELSE,FOLLOW_KW_ELSE_in_whenExpression1426); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_ELSE.add(KW_ELSE119);


                    pushFollow(FOLLOW_expression_in_whenExpression1428);
                    expression120=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression120.getTree());

                    }
                    break;

            }


            KW_END121=(Token)match(input,KW_END,FOLLOW_KW_END_in_whenExpression1436); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_END.add(KW_END121);


            // AST REWRITE
            // elements: expression, KW_WHEN
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 218:12: -> ^( TOK_FUNCTION KW_WHEN ( expression )* )
            {
                // IdentifiersParser.g:218:15: ^( TOK_FUNCTION KW_WHEN ( expression )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(TOK_FUNCTION, "TOK_FUNCTION")
                , root_1);

                adaptor.addChild(root_1, 
                stream_KW_WHEN.nextNode()
                );

                // IdentifiersParser.g:218:38: ( expression )*
                while ( stream_expression.hasNext() ) {
                    adaptor.addChild(root_1, stream_expression.nextTree());

                }
                stream_expression.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) { gParent.popMsg(state); }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "whenExpression"


    public static class constant_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "constant"
    // IdentifiersParser.g:221:1: constant : ( Number | dateLiteral | StringLiteral | stringLiteralSequence | BigintLiteral | SmallintLiteral | TinyintLiteral | DecimalLiteral | charSetStringLiteral | booleanValue );
    public final HiveParser_IdentifiersParser.constant_return constant() throws RecognitionException {
        HiveParser_IdentifiersParser.constant_return retval = new HiveParser_IdentifiersParser.constant_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token Number122=null;
        Token StringLiteral124=null;
        Token BigintLiteral126=null;
        Token SmallintLiteral127=null;
        Token TinyintLiteral128=null;
        Token DecimalLiteral129=null;
        HiveParser_IdentifiersParser.dateLiteral_return dateLiteral123 =null;

        HiveParser_IdentifiersParser.stringLiteralSequence_return stringLiteralSequence125 =null;

        HiveParser_IdentifiersParser.charSetStringLiteral_return charSetStringLiteral130 =null;

        HiveParser_IdentifiersParser.booleanValue_return booleanValue131 =null;


        CommonTree Number122_tree=null;
        CommonTree StringLiteral124_tree=null;
        CommonTree BigintLiteral126_tree=null;
        CommonTree SmallintLiteral127_tree=null;
        CommonTree TinyintLiteral128_tree=null;
        CommonTree DecimalLiteral129_tree=null;

         gParent.pushMsg("constant", state); 
        try {
            // IdentifiersParser.g:224:5: ( Number | dateLiteral | StringLiteral | stringLiteralSequence | BigintLiteral | SmallintLiteral | TinyintLiteral | DecimalLiteral | charSetStringLiteral | booleanValue )
            int alt32=10;
            alt32 = dfa32.predict(input);
            switch (alt32) {
                case 1 :
                    // IdentifiersParser.g:225:5: Number
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    Number122=(Token)match(input,Number,FOLLOW_Number_in_constant1478); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Number122_tree = 
                    (CommonTree)adaptor.create(Number122)
                    ;
                    adaptor.addChild(root_0, Number122_tree);
                    }

                    }
                    break;
                case 2 :
                    // IdentifiersParser.g:226:7: dateLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_dateLiteral_in_constant1486);
                    dateLiteral123=dateLiteral();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dateLiteral123.getTree());

                    }
                    break;
                case 3 :
                    // IdentifiersParser.g:227:7: StringLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    StringLiteral124=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_constant1494); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    StringLiteral124_tree = 
                    (CommonTree)adaptor.create(StringLiteral124)
                    ;
                    adaptor.addChild(root_0, StringLiteral124_tree);
                    }

                    }
                    break;
                case 4 :
                    // IdentifiersParser.g:228:7: stringLiteralSequence
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_stringLiteralSequence_in_constant1502);
                    stringLiteralSequence125=stringLiteralSequence();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringLiteralSequence125.getTree());

                    }
                    break;
                case 5 :
                    // IdentifiersParser.g:229:7: BigintLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    BigintLiteral126=(Token)match(input,BigintLiteral,FOLLOW_BigintLiteral_in_constant1510); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    BigintLiteral126_tree = 
                    (CommonTree)adaptor.create(BigintLiteral126)
                    ;
                    adaptor.addChild(root_0, BigintLiteral126_tree);
                    }

                    }
                    break;
                case 6 :
                    // IdentifiersParser.g:230:7: SmallintLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    SmallintLiteral127=(Token)match(input,SmallintLiteral,FOLLOW_SmallintLiteral_in_constant1518); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SmallintLiteral127_tree = 
                    (CommonTree)adaptor.create(SmallintLiteral127)
                    ;
                    adaptor.addChild(root_0, SmallintLiteral127_tree);
                    }

                    }
                    break;
                case 7 :
                    // IdentifiersParser.g:231:7: TinyintLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    TinyintLiteral128=(Token)match(input,TinyintLiteral,FOLLOW_TinyintLiteral_in_constant1526); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    TinyintLiteral128_tree = 
                    (CommonTree)adaptor.create(TinyintLiteral128)
                    ;
                    adaptor.addChild(root_0, TinyintLiteral128_tree);
                    }

                    }
                    break;
                case 8 :
                    // IdentifiersParser.g:232:7: DecimalLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    DecimalLiteral129=(Token)match(input,DecimalLiteral,FOLLOW_DecimalLiteral_in_constant1534); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DecimalLiteral129_tree = 
                    (CommonTree)adaptor.create(DecimalLiteral129)
                    ;
                    adaptor.addChild(root_0, DecimalLiteral129_tree);
                    }

                    }
                    break;
                case 9 :
                    // IdentifiersParser.g:233:7: charSetStringLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_charSetStringLiteral_in_constant1542);
                    charSetStringLiteral130=charSetStringLiteral();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, charSetStringLiteral130.getTree());

                    }
                    break;
                case 10 :
                    // IdentifiersParser.g:234:7: booleanValue
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_booleanValue_in_constant1550);
                    booleanValue131=booleanValue();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, booleanValue131.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) { gParent.popMsg(state); }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "constant"


    public static class stringLiteralSequence_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stringLiteralSequence"
    // IdentifiersParser.g:237:1: stringLiteralSequence : StringLiteral ( StringLiteral )+ -> ^( TOK_STRINGLITERALSEQUENCE StringLiteral ( StringLiteral )+ ) ;
    public final HiveParser_IdentifiersParser.stringLiteralSequence_return stringLiteralSequence() throws RecognitionException {
        HiveParser_IdentifiersParser.stringLiteralSequence_return retval = new HiveParser_IdentifiersParser.stringLiteralSequence_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token StringLiteral132=null;
        Token StringLiteral133=null;

        CommonTree StringLiteral132_tree=null;
        CommonTree StringLiteral133_tree=null;
        RewriteRuleTokenStream stream_StringLiteral=new RewriteRuleTokenStream(adaptor,"token StringLiteral");

        try {
            // IdentifiersParser.g:238:5: ( StringLiteral ( StringLiteral )+ -> ^( TOK_STRINGLITERALSEQUENCE StringLiteral ( StringLiteral )+ ) )
            // IdentifiersParser.g:239:5: StringLiteral ( StringLiteral )+
            {
            StringLiteral132=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_stringLiteralSequence1571); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_StringLiteral.add(StringLiteral132);


            // IdentifiersParser.g:239:19: ( StringLiteral )+
            int cnt33=0;
            loop33:
            do {
                int alt33=2;
                alt33 = dfa33.predict(input);
                switch (alt33) {
            	case 1 :
            	    // IdentifiersParser.g:239:19: StringLiteral
            	    {
            	    StringLiteral133=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_stringLiteralSequence1573); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_StringLiteral.add(StringLiteral133);


            	    }
            	    break;

            	default :
            	    if ( cnt33 >= 1 ) break loop33;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(33, input);
                        throw eee;
                }
                cnt33++;
            } while (true);


            // AST REWRITE
            // elements: StringLiteral, StringLiteral
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 239:34: -> ^( TOK_STRINGLITERALSEQUENCE StringLiteral ( StringLiteral )+ )
            {
                // IdentifiersParser.g:239:37: ^( TOK_STRINGLITERALSEQUENCE StringLiteral ( StringLiteral )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(TOK_STRINGLITERALSEQUENCE, "TOK_STRINGLITERALSEQUENCE")
                , root_1);

                adaptor.addChild(root_1, 
                stream_StringLiteral.nextNode()
                );

                if ( !(stream_StringLiteral.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_StringLiteral.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_StringLiteral.nextNode()
                    );

                }
                stream_StringLiteral.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "stringLiteralSequence"


    public static class charSetStringLiteral_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "charSetStringLiteral"
    // IdentifiersParser.g:242:1: charSetStringLiteral : csName= CharSetName csLiteral= CharSetLiteral -> ^( TOK_CHARSETLITERAL $csName $csLiteral) ;
    public final HiveParser_IdentifiersParser.charSetStringLiteral_return charSetStringLiteral() throws RecognitionException {
        HiveParser_IdentifiersParser.charSetStringLiteral_return retval = new HiveParser_IdentifiersParser.charSetStringLiteral_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token csName=null;
        Token csLiteral=null;

        CommonTree csName_tree=null;
        CommonTree csLiteral_tree=null;
        RewriteRuleTokenStream stream_CharSetLiteral=new RewriteRuleTokenStream(adaptor,"token CharSetLiteral");
        RewriteRuleTokenStream stream_CharSetName=new RewriteRuleTokenStream(adaptor,"token CharSetName");

         gParent.pushMsg("character string literal", state); 
        try {
            // IdentifiersParser.g:245:5: (csName= CharSetName csLiteral= CharSetLiteral -> ^( TOK_CHARSETLITERAL $csName $csLiteral) )
            // IdentifiersParser.g:246:5: csName= CharSetName csLiteral= CharSetLiteral
            {
            csName=(Token)match(input,CharSetName,FOLLOW_CharSetName_in_charSetStringLiteral1618); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CharSetName.add(csName);


            csLiteral=(Token)match(input,CharSetLiteral,FOLLOW_CharSetLiteral_in_charSetStringLiteral1622); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CharSetLiteral.add(csLiteral);


            // AST REWRITE
            // elements: csLiteral, csName
            // token labels: csName, csLiteral
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleTokenStream stream_csName=new RewriteRuleTokenStream(adaptor,"token csName",csName);
            RewriteRuleTokenStream stream_csLiteral=new RewriteRuleTokenStream(adaptor,"token csLiteral",csLiteral);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 246:49: -> ^( TOK_CHARSETLITERAL $csName $csLiteral)
            {
                // IdentifiersParser.g:246:52: ^( TOK_CHARSETLITERAL $csName $csLiteral)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(TOK_CHARSETLITERAL, "TOK_CHARSETLITERAL")
                , root_1);

                adaptor.addChild(root_1, stream_csName.nextNode());

                adaptor.addChild(root_1, stream_csLiteral.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) { gParent.popMsg(state); }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "charSetStringLiteral"


    public static class dateLiteral_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "dateLiteral"
    // IdentifiersParser.g:249:1: dateLiteral : KW_DATE StringLiteral ->;
    public final HiveParser_IdentifiersParser.dateLiteral_return dateLiteral() throws RecognitionException {
        HiveParser_IdentifiersParser.dateLiteral_return retval = new HiveParser_IdentifiersParser.dateLiteral_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token KW_DATE134=null;
        Token StringLiteral135=null;

        CommonTree KW_DATE134_tree=null;
        CommonTree StringLiteral135_tree=null;
        RewriteRuleTokenStream stream_StringLiteral=new RewriteRuleTokenStream(adaptor,"token StringLiteral");
        RewriteRuleTokenStream stream_KW_DATE=new RewriteRuleTokenStream(adaptor,"token KW_DATE");

        try {
            // IdentifiersParser.g:250:5: ( KW_DATE StringLiteral ->)
            // IdentifiersParser.g:251:5: KW_DATE StringLiteral
            {
            KW_DATE134=(Token)match(input,KW_DATE,FOLLOW_KW_DATE_in_dateLiteral1655); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_DATE.add(KW_DATE134);


            StringLiteral135=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_dateLiteral1657); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_StringLiteral.add(StringLiteral135);


            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 251:27: ->
            {
                adaptor.addChild(root_0, 
                      // Create DateLiteral token, but with the text of the string value
                      // This makes the dateLiteral more consistent with the other type literals.
                      adaptor.create(TOK_DATELITERAL, (StringLiteral135!=null?StringLiteral135.getText():null))
                    );

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "dateLiteral"


    public static class expression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expression"
    // IdentifiersParser.g:259:1: expression : precedenceOrExpression ;
    public final HiveParser_IdentifiersParser.expression_return expression() throws RecognitionException {
        HiveParser_IdentifiersParser.expression_return retval = new HiveParser_IdentifiersParser.expression_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        HiveParser_IdentifiersParser.precedenceOrExpression_return precedenceOrExpression136 =null;



         gParent.pushMsg("expression specification", state); 
        try {
            // IdentifiersParser.g:262:5: ( precedenceOrExpression )
            // IdentifiersParser.g:263:5: precedenceOrExpression
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_precedenceOrExpression_in_expression1696);
            precedenceOrExpression136=precedenceOrExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, precedenceOrExpression136.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) { gParent.popMsg(state); }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expression"


    public static class atomExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "atomExpression"
    // IdentifiersParser.g:266:1: atomExpression : ( KW_NULL -> TOK_NULL | dateLiteral | constant | castExpression | caseExpression | whenExpression | ( functionName LPAREN )=> function | tableOrColumn | LPAREN ! expression RPAREN !);
    public final HiveParser_IdentifiersParser.atomExpression_return atomExpression() throws RecognitionException {
        HiveParser_IdentifiersParser.atomExpression_return retval = new HiveParser_IdentifiersParser.atomExpression_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token KW_NULL137=null;
        Token LPAREN145=null;
        Token RPAREN147=null;
        HiveParser_IdentifiersParser.dateLiteral_return dateLiteral138 =null;

        HiveParser_IdentifiersParser.constant_return constant139 =null;

        HiveParser_IdentifiersParser.castExpression_return castExpression140 =null;

        HiveParser_IdentifiersParser.caseExpression_return caseExpression141 =null;

        HiveParser_IdentifiersParser.whenExpression_return whenExpression142 =null;

        HiveParser_IdentifiersParser.function_return function143 =null;

        HiveParser_FromClauseParser.tableOrColumn_return tableOrColumn144 =null;

        HiveParser_IdentifiersParser.expression_return expression146 =null;


        CommonTree KW_NULL137_tree=null;
        CommonTree LPAREN145_tree=null;
        CommonTree RPAREN147_tree=null;
        RewriteRuleTokenStream stream_KW_NULL=new RewriteRuleTokenStream(adaptor,"token KW_NULL");

        try {
            // IdentifiersParser.g:267:5: ( KW_NULL -> TOK_NULL | dateLiteral | constant | castExpression | caseExpression | whenExpression | ( functionName LPAREN )=> function | tableOrColumn | LPAREN ! expression RPAREN !)
            int alt34=9;
            alt34 = dfa34.predict(input);
            switch (alt34) {
                case 1 :
                    // IdentifiersParser.g:268:5: KW_NULL
                    {
                    KW_NULL137=(Token)match(input,KW_NULL,FOLLOW_KW_NULL_in_atomExpression1717); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_NULL.add(KW_NULL137);


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 268:13: -> TOK_NULL
                    {
                        adaptor.addChild(root_0, 
                        (CommonTree)adaptor.create(TOK_NULL, "TOK_NULL")
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // IdentifiersParser.g:269:7: dateLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_dateLiteral_in_atomExpression1729);
                    dateLiteral138=dateLiteral();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dateLiteral138.getTree());

                    }
                    break;
                case 3 :
                    // IdentifiersParser.g:270:7: constant
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_constant_in_atomExpression1737);
                    constant139=constant();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, constant139.getTree());

                    }
                    break;
                case 4 :
                    // IdentifiersParser.g:271:7: castExpression
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_castExpression_in_atomExpression1745);
                    castExpression140=castExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, castExpression140.getTree());

                    }
                    break;
                case 5 :
                    // IdentifiersParser.g:272:7: caseExpression
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_caseExpression_in_atomExpression1753);
                    caseExpression141=caseExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, caseExpression141.getTree());

                    }
                    break;
                case 6 :
                    // IdentifiersParser.g:273:7: whenExpression
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_whenExpression_in_atomExpression1761);
                    whenExpression142=whenExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, whenExpression142.getTree());

                    }
                    break;
                case 7 :
                    // IdentifiersParser.g:274:7: ( functionName LPAREN )=> function
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_function_in_atomExpression1777);
                    function143=function();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, function143.getTree());

                    }
                    break;
                case 8 :
                    // IdentifiersParser.g:275:7: tableOrColumn
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_tableOrColumn_in_atomExpression1785);
                    tableOrColumn144=gHiveParser.tableOrColumn();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, tableOrColumn144.getTree());

                    }
                    break;
                case 9 :
                    // IdentifiersParser.g:276:7: LPAREN ! expression RPAREN !
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    LPAREN145=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_atomExpression1793); if (state.failed) return retval;

                    pushFollow(FOLLOW_expression_in_atomExpression1796);
                    expression146=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression146.getTree());

                    RPAREN147=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_atomExpression1798); if (state.failed) return retval;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "atomExpression"


    public static class precedenceFieldExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "precedenceFieldExpression"
    // IdentifiersParser.g:280:1: precedenceFieldExpression : atomExpression ( ( LSQUARE ^ expression RSQUARE !) | ( DOT ^ identifier ) )* ;
    public final HiveParser_IdentifiersParser.precedenceFieldExpression_return precedenceFieldExpression() throws RecognitionException {
        HiveParser_IdentifiersParser.precedenceFieldExpression_return retval = new HiveParser_IdentifiersParser.precedenceFieldExpression_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token LSQUARE149=null;
        Token RSQUARE151=null;
        Token DOT152=null;
        HiveParser_IdentifiersParser.atomExpression_return atomExpression148 =null;

        HiveParser_IdentifiersParser.expression_return expression150 =null;

        HiveParser_IdentifiersParser.identifier_return identifier153 =null;


        CommonTree LSQUARE149_tree=null;
        CommonTree RSQUARE151_tree=null;
        CommonTree DOT152_tree=null;

        try {
            // IdentifiersParser.g:281:5: ( atomExpression ( ( LSQUARE ^ expression RSQUARE !) | ( DOT ^ identifier ) )* )
            // IdentifiersParser.g:282:5: atomExpression ( ( LSQUARE ^ expression RSQUARE !) | ( DOT ^ identifier ) )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_atomExpression_in_precedenceFieldExpression1821);
            atomExpression148=atomExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, atomExpression148.getTree());

            // IdentifiersParser.g:282:20: ( ( LSQUARE ^ expression RSQUARE !) | ( DOT ^ identifier ) )*
            loop35:
            do {
                int alt35=3;
                alt35 = dfa35.predict(input);
                switch (alt35) {
            	case 1 :
            	    // IdentifiersParser.g:282:21: ( LSQUARE ^ expression RSQUARE !)
            	    {
            	    // IdentifiersParser.g:282:21: ( LSQUARE ^ expression RSQUARE !)
            	    // IdentifiersParser.g:282:22: LSQUARE ^ expression RSQUARE !
            	    {
            	    LSQUARE149=(Token)match(input,LSQUARE,FOLLOW_LSQUARE_in_precedenceFieldExpression1825); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    LSQUARE149_tree = 
            	    (CommonTree)adaptor.create(LSQUARE149)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(LSQUARE149_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_expression_in_precedenceFieldExpression1828);
            	    expression150=expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression150.getTree());

            	    RSQUARE151=(Token)match(input,RSQUARE,FOLLOW_RSQUARE_in_precedenceFieldExpression1830); if (state.failed) return retval;

            	    }


            	    }
            	    break;
            	case 2 :
            	    // IdentifiersParser.g:282:54: ( DOT ^ identifier )
            	    {
            	    // IdentifiersParser.g:282:54: ( DOT ^ identifier )
            	    // IdentifiersParser.g:282:55: DOT ^ identifier
            	    {
            	    DOT152=(Token)match(input,DOT,FOLLOW_DOT_in_precedenceFieldExpression1837); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    DOT152_tree = 
            	    (CommonTree)adaptor.create(DOT152)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(DOT152_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_identifier_in_precedenceFieldExpression1840);
            	    identifier153=identifier();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier153.getTree());

            	    }


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "precedenceFieldExpression"


    public static class precedenceUnaryOperator_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "precedenceUnaryOperator"
    // IdentifiersParser.g:285:1: precedenceUnaryOperator : ( PLUS | MINUS | TILDE );
    public final HiveParser_IdentifiersParser.precedenceUnaryOperator_return precedenceUnaryOperator() throws RecognitionException {
        HiveParser_IdentifiersParser.precedenceUnaryOperator_return retval = new HiveParser_IdentifiersParser.precedenceUnaryOperator_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set154=null;

        CommonTree set154_tree=null;

        try {
            // IdentifiersParser.g:286:5: ( PLUS | MINUS | TILDE )
            // IdentifiersParser.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            set154=(Token)input.LT(1);

            if ( input.LA(1)==MINUS||input.LA(1)==PLUS||input.LA(1)==TILDE ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(set154)
                );
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "precedenceUnaryOperator"


    public static class nullCondition_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "nullCondition"
    // IdentifiersParser.g:290:1: nullCondition : ( KW_NULL -> ^( TOK_ISNULL ) | KW_NOT KW_NULL -> ^( TOK_ISNOTNULL ) );
    public final HiveParser_IdentifiersParser.nullCondition_return nullCondition() throws RecognitionException {
        HiveParser_IdentifiersParser.nullCondition_return retval = new HiveParser_IdentifiersParser.nullCondition_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token KW_NULL155=null;
        Token KW_NOT156=null;
        Token KW_NULL157=null;

        CommonTree KW_NULL155_tree=null;
        CommonTree KW_NOT156_tree=null;
        CommonTree KW_NULL157_tree=null;
        RewriteRuleTokenStream stream_KW_NULL=new RewriteRuleTokenStream(adaptor,"token KW_NULL");
        RewriteRuleTokenStream stream_KW_NOT=new RewriteRuleTokenStream(adaptor,"token KW_NOT");

        try {
            // IdentifiersParser.g:291:5: ( KW_NULL -> ^( TOK_ISNULL ) | KW_NOT KW_NULL -> ^( TOK_ISNOTNULL ) )
            int alt36=2;
            switch ( input.LA(1) ) {
            case KW_NULL:
                {
                alt36=1;
                }
                break;
            case KW_NOT:
                {
                alt36=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;

            }

            switch (alt36) {
                case 1 :
                    // IdentifiersParser.g:292:5: KW_NULL
                    {
                    KW_NULL155=(Token)match(input,KW_NULL,FOLLOW_KW_NULL_in_nullCondition1893); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_NULL.add(KW_NULL155);


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 292:13: -> ^( TOK_ISNULL )
                    {
                        // IdentifiersParser.g:292:16: ^( TOK_ISNULL )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(TOK_ISNULL, "TOK_ISNULL")
                        , root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // IdentifiersParser.g:293:7: KW_NOT KW_NULL
                    {
                    KW_NOT156=(Token)match(input,KW_NOT,FOLLOW_KW_NOT_in_nullCondition1907); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_NOT.add(KW_NOT156);


                    KW_NULL157=(Token)match(input,KW_NULL,FOLLOW_KW_NULL_in_nullCondition1909); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_NULL.add(KW_NULL157);


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 293:22: -> ^( TOK_ISNOTNULL )
                    {
                        // IdentifiersParser.g:293:25: ^( TOK_ISNOTNULL )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(TOK_ISNOTNULL, "TOK_ISNOTNULL")
                        , root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "nullCondition"


    public static class precedenceUnaryPrefixExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "precedenceUnaryPrefixExpression"
    // IdentifiersParser.g:296:1: precedenceUnaryPrefixExpression : ( precedenceUnaryOperator ^)* precedenceFieldExpression ;
    public final HiveParser_IdentifiersParser.precedenceUnaryPrefixExpression_return precedenceUnaryPrefixExpression() throws RecognitionException {
        HiveParser_IdentifiersParser.precedenceUnaryPrefixExpression_return retval = new HiveParser_IdentifiersParser.precedenceUnaryPrefixExpression_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        HiveParser_IdentifiersParser.precedenceUnaryOperator_return precedenceUnaryOperator158 =null;

        HiveParser_IdentifiersParser.precedenceFieldExpression_return precedenceFieldExpression159 =null;



        try {
            // IdentifiersParser.g:297:5: ( ( precedenceUnaryOperator ^)* precedenceFieldExpression )
            // IdentifiersParser.g:298:5: ( precedenceUnaryOperator ^)* precedenceFieldExpression
            {
            root_0 = (CommonTree)adaptor.nil();


            // IdentifiersParser.g:298:5: ( precedenceUnaryOperator ^)*
            loop37:
            do {
                int alt37=2;
                switch ( input.LA(1) ) {
                case MINUS:
                case PLUS:
                case TILDE:
                    {
                    alt37=1;
                    }
                    break;

                }

                switch (alt37) {
            	case 1 :
            	    // IdentifiersParser.g:298:6: precedenceUnaryOperator ^
            	    {
            	    pushFollow(FOLLOW_precedenceUnaryOperator_in_precedenceUnaryPrefixExpression1937);
            	    precedenceUnaryOperator158=precedenceUnaryOperator();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(precedenceUnaryOperator158.getTree(), root_0);

            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);


            pushFollow(FOLLOW_precedenceFieldExpression_in_precedenceUnaryPrefixExpression1942);
            precedenceFieldExpression159=precedenceFieldExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, precedenceFieldExpression159.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "precedenceUnaryPrefixExpression"


    public static class precedenceUnarySuffixExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "precedenceUnarySuffixExpression"
    // IdentifiersParser.g:301:1: precedenceUnarySuffixExpression : precedenceUnaryPrefixExpression (a= KW_IS nullCondition )? -> {$a != null}? ^( TOK_FUNCTION nullCondition precedenceUnaryPrefixExpression ) -> precedenceUnaryPrefixExpression ;
    public final HiveParser_IdentifiersParser.precedenceUnarySuffixExpression_return precedenceUnarySuffixExpression() throws RecognitionException {
        HiveParser_IdentifiersParser.precedenceUnarySuffixExpression_return retval = new HiveParser_IdentifiersParser.precedenceUnarySuffixExpression_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token a=null;
        HiveParser_IdentifiersParser.precedenceUnaryPrefixExpression_return precedenceUnaryPrefixExpression160 =null;

        HiveParser_IdentifiersParser.nullCondition_return nullCondition161 =null;


        CommonTree a_tree=null;
        RewriteRuleTokenStream stream_KW_IS=new RewriteRuleTokenStream(adaptor,"token KW_IS");
        RewriteRuleSubtreeStream stream_precedenceUnaryPrefixExpression=new RewriteRuleSubtreeStream(adaptor,"rule precedenceUnaryPrefixExpression");
        RewriteRuleSubtreeStream stream_nullCondition=new RewriteRuleSubtreeStream(adaptor,"rule nullCondition");
        try {
            // IdentifiersParser.g:302:5: ( precedenceUnaryPrefixExpression (a= KW_IS nullCondition )? -> {$a != null}? ^( TOK_FUNCTION nullCondition precedenceUnaryPrefixExpression ) -> precedenceUnaryPrefixExpression )
            // IdentifiersParser.g:302:7: precedenceUnaryPrefixExpression (a= KW_IS nullCondition )?
            {
            pushFollow(FOLLOW_precedenceUnaryPrefixExpression_in_precedenceUnarySuffixExpression1959);
            precedenceUnaryPrefixExpression160=precedenceUnaryPrefixExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_precedenceUnaryPrefixExpression.add(precedenceUnaryPrefixExpression160.getTree());

            // IdentifiersParser.g:302:39: (a= KW_IS nullCondition )?
            int alt38=2;
            alt38 = dfa38.predict(input);
            switch (alt38) {
                case 1 :
                    // IdentifiersParser.g:302:40: a= KW_IS nullCondition
                    {
                    a=(Token)match(input,KW_IS,FOLLOW_KW_IS_in_precedenceUnarySuffixExpression1964); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_IS.add(a);


                    pushFollow(FOLLOW_nullCondition_in_precedenceUnarySuffixExpression1966);
                    nullCondition161=nullCondition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_nullCondition.add(nullCondition161.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: precedenceUnaryPrefixExpression, precedenceUnaryPrefixExpression, nullCondition
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 303:5: -> {$a != null}? ^( TOK_FUNCTION nullCondition precedenceUnaryPrefixExpression )
            if (a != null) {
                // IdentifiersParser.g:303:22: ^( TOK_FUNCTION nullCondition precedenceUnaryPrefixExpression )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(TOK_FUNCTION, "TOK_FUNCTION")
                , root_1);

                adaptor.addChild(root_1, stream_nullCondition.nextTree());

                adaptor.addChild(root_1, stream_precedenceUnaryPrefixExpression.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            else // 304:5: -> precedenceUnaryPrefixExpression
            {
                adaptor.addChild(root_0, stream_precedenceUnaryPrefixExpression.nextTree());

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "precedenceUnarySuffixExpression"


    public static class precedenceBitwiseXorOperator_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "precedenceBitwiseXorOperator"
    // IdentifiersParser.g:308:1: precedenceBitwiseXorOperator : BITWISEXOR ;
    public final HiveParser_IdentifiersParser.precedenceBitwiseXorOperator_return precedenceBitwiseXorOperator() throws RecognitionException {
        HiveParser_IdentifiersParser.precedenceBitwiseXorOperator_return retval = new HiveParser_IdentifiersParser.precedenceBitwiseXorOperator_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token BITWISEXOR162=null;

        CommonTree BITWISEXOR162_tree=null;

        try {
            // IdentifiersParser.g:309:5: ( BITWISEXOR )
            // IdentifiersParser.g:310:5: BITWISEXOR
            {
            root_0 = (CommonTree)adaptor.nil();


            BITWISEXOR162=(Token)match(input,BITWISEXOR,FOLLOW_BITWISEXOR_in_precedenceBitwiseXorOperator2014); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            BITWISEXOR162_tree = 
            (CommonTree)adaptor.create(BITWISEXOR162)
            ;
            adaptor.addChild(root_0, BITWISEXOR162_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "precedenceBitwiseXorOperator"


    public static class precedenceBitwiseXorExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "precedenceBitwiseXorExpression"
    // IdentifiersParser.g:313:1: precedenceBitwiseXorExpression : precedenceUnarySuffixExpression ( precedenceBitwiseXorOperator ^ precedenceUnarySuffixExpression )* ;
    public final HiveParser_IdentifiersParser.precedenceBitwiseXorExpression_return precedenceBitwiseXorExpression() throws RecognitionException {
        HiveParser_IdentifiersParser.precedenceBitwiseXorExpression_return retval = new HiveParser_IdentifiersParser.precedenceBitwiseXorExpression_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        HiveParser_IdentifiersParser.precedenceUnarySuffixExpression_return precedenceUnarySuffixExpression163 =null;

        HiveParser_IdentifiersParser.precedenceBitwiseXorOperator_return precedenceBitwiseXorOperator164 =null;

        HiveParser_IdentifiersParser.precedenceUnarySuffixExpression_return precedenceUnarySuffixExpression165 =null;



        try {
            // IdentifiersParser.g:314:5: ( precedenceUnarySuffixExpression ( precedenceBitwiseXorOperator ^ precedenceUnarySuffixExpression )* )
            // IdentifiersParser.g:315:5: precedenceUnarySuffixExpression ( precedenceBitwiseXorOperator ^ precedenceUnarySuffixExpression )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_precedenceUnarySuffixExpression_in_precedenceBitwiseXorExpression2035);
            precedenceUnarySuffixExpression163=precedenceUnarySuffixExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, precedenceUnarySuffixExpression163.getTree());

            // IdentifiersParser.g:315:37: ( precedenceBitwiseXorOperator ^ precedenceUnarySuffixExpression )*
            loop39:
            do {
                int alt39=2;
                alt39 = dfa39.predict(input);
                switch (alt39) {
            	case 1 :
            	    // IdentifiersParser.g:315:38: precedenceBitwiseXorOperator ^ precedenceUnarySuffixExpression
            	    {
            	    pushFollow(FOLLOW_precedenceBitwiseXorOperator_in_precedenceBitwiseXorExpression2038);
            	    precedenceBitwiseXorOperator164=precedenceBitwiseXorOperator();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(precedenceBitwiseXorOperator164.getTree(), root_0);

            	    pushFollow(FOLLOW_precedenceUnarySuffixExpression_in_precedenceBitwiseXorExpression2041);
            	    precedenceUnarySuffixExpression165=precedenceUnarySuffixExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, precedenceUnarySuffixExpression165.getTree());

            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "precedenceBitwiseXorExpression"


    public static class precedenceStarOperator_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "precedenceStarOperator"
    // IdentifiersParser.g:319:1: precedenceStarOperator : ( STAR | DIVIDE | MOD | DIV );
    public final HiveParser_IdentifiersParser.precedenceStarOperator_return precedenceStarOperator() throws RecognitionException {
        HiveParser_IdentifiersParser.precedenceStarOperator_return retval = new HiveParser_IdentifiersParser.precedenceStarOperator_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set166=null;

        CommonTree set166_tree=null;

        try {
            // IdentifiersParser.g:320:5: ( STAR | DIVIDE | MOD | DIV )
            // IdentifiersParser.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            set166=(Token)input.LT(1);

            if ( (input.LA(1) >= DIV && input.LA(1) <= DIVIDE)||input.LA(1)==MOD||input.LA(1)==STAR ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(set166)
                );
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "precedenceStarOperator"


    public static class precedenceStarExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "precedenceStarExpression"
    // IdentifiersParser.g:324:1: precedenceStarExpression : precedenceBitwiseXorExpression ( precedenceStarOperator ^ precedenceBitwiseXorExpression )* ;
    public final HiveParser_IdentifiersParser.precedenceStarExpression_return precedenceStarExpression() throws RecognitionException {
        HiveParser_IdentifiersParser.precedenceStarExpression_return retval = new HiveParser_IdentifiersParser.precedenceStarExpression_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        HiveParser_IdentifiersParser.precedenceBitwiseXorExpression_return precedenceBitwiseXorExpression167 =null;

        HiveParser_IdentifiersParser.precedenceStarOperator_return precedenceStarOperator168 =null;

        HiveParser_IdentifiersParser.precedenceBitwiseXorExpression_return precedenceBitwiseXorExpression169 =null;



        try {
            // IdentifiersParser.g:325:5: ( precedenceBitwiseXorExpression ( precedenceStarOperator ^ precedenceBitwiseXorExpression )* )
            // IdentifiersParser.g:326:5: precedenceBitwiseXorExpression ( precedenceStarOperator ^ precedenceBitwiseXorExpression )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_precedenceBitwiseXorExpression_in_precedenceStarExpression2098);
            precedenceBitwiseXorExpression167=precedenceBitwiseXorExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, precedenceBitwiseXorExpression167.getTree());

            // IdentifiersParser.g:326:36: ( precedenceStarOperator ^ precedenceBitwiseXorExpression )*
            loop40:
            do {
                int alt40=2;
                alt40 = dfa40.predict(input);
                switch (alt40) {
            	case 1 :
            	    // IdentifiersParser.g:326:37: precedenceStarOperator ^ precedenceBitwiseXorExpression
            	    {
            	    pushFollow(FOLLOW_precedenceStarOperator_in_precedenceStarExpression2101);
            	    precedenceStarOperator168=precedenceStarOperator();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(precedenceStarOperator168.getTree(), root_0);

            	    pushFollow(FOLLOW_precedenceBitwiseXorExpression_in_precedenceStarExpression2104);
            	    precedenceBitwiseXorExpression169=precedenceBitwiseXorExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, precedenceBitwiseXorExpression169.getTree());

            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "precedenceStarExpression"


    public static class precedencePlusOperator_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "precedencePlusOperator"
    // IdentifiersParser.g:330:1: precedencePlusOperator : ( PLUS | MINUS );
    public final HiveParser_IdentifiersParser.precedencePlusOperator_return precedencePlusOperator() throws RecognitionException {
        HiveParser_IdentifiersParser.precedencePlusOperator_return retval = new HiveParser_IdentifiersParser.precedencePlusOperator_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set170=null;

        CommonTree set170_tree=null;

        try {
            // IdentifiersParser.g:331:5: ( PLUS | MINUS )
            // IdentifiersParser.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            set170=(Token)input.LT(1);

            if ( input.LA(1)==MINUS||input.LA(1)==PLUS ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(set170)
                );
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "precedencePlusOperator"


    public static class precedencePlusExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "precedencePlusExpression"
    // IdentifiersParser.g:335:1: precedencePlusExpression : precedenceStarExpression ( precedencePlusOperator ^ precedenceStarExpression )* ;
    public final HiveParser_IdentifiersParser.precedencePlusExpression_return precedencePlusExpression() throws RecognitionException {
        HiveParser_IdentifiersParser.precedencePlusExpression_return retval = new HiveParser_IdentifiersParser.precedencePlusExpression_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        HiveParser_IdentifiersParser.precedenceStarExpression_return precedenceStarExpression171 =null;

        HiveParser_IdentifiersParser.precedencePlusOperator_return precedencePlusOperator172 =null;

        HiveParser_IdentifiersParser.precedenceStarExpression_return precedenceStarExpression173 =null;



        try {
            // IdentifiersParser.g:336:5: ( precedenceStarExpression ( precedencePlusOperator ^ precedenceStarExpression )* )
            // IdentifiersParser.g:337:5: precedenceStarExpression ( precedencePlusOperator ^ precedenceStarExpression )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_precedenceStarExpression_in_precedencePlusExpression2153);
            precedenceStarExpression171=precedenceStarExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, precedenceStarExpression171.getTree());

            // IdentifiersParser.g:337:30: ( precedencePlusOperator ^ precedenceStarExpression )*
            loop41:
            do {
                int alt41=2;
                switch ( input.LA(1) ) {
                case MINUS:
                case PLUS:
                    {
                    alt41=1;
                    }
                    break;

                }

                switch (alt41) {
            	case 1 :
            	    // IdentifiersParser.g:337:31: precedencePlusOperator ^ precedenceStarExpression
            	    {
            	    pushFollow(FOLLOW_precedencePlusOperator_in_precedencePlusExpression2156);
            	    precedencePlusOperator172=precedencePlusOperator();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(precedencePlusOperator172.getTree(), root_0);

            	    pushFollow(FOLLOW_precedenceStarExpression_in_precedencePlusExpression2159);
            	    precedenceStarExpression173=precedenceStarExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, precedenceStarExpression173.getTree());

            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "precedencePlusExpression"


    public static class precedenceAmpersandOperator_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "precedenceAmpersandOperator"
    // IdentifiersParser.g:341:1: precedenceAmpersandOperator : AMPERSAND ;
    public final HiveParser_IdentifiersParser.precedenceAmpersandOperator_return precedenceAmpersandOperator() throws RecognitionException {
        HiveParser_IdentifiersParser.precedenceAmpersandOperator_return retval = new HiveParser_IdentifiersParser.precedenceAmpersandOperator_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token AMPERSAND174=null;

        CommonTree AMPERSAND174_tree=null;

        try {
            // IdentifiersParser.g:342:5: ( AMPERSAND )
            // IdentifiersParser.g:343:5: AMPERSAND
            {
            root_0 = (CommonTree)adaptor.nil();


            AMPERSAND174=(Token)match(input,AMPERSAND,FOLLOW_AMPERSAND_in_precedenceAmpersandOperator2183); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            AMPERSAND174_tree = 
            (CommonTree)adaptor.create(AMPERSAND174)
            ;
            adaptor.addChild(root_0, AMPERSAND174_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "precedenceAmpersandOperator"


    public static class precedenceAmpersandExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "precedenceAmpersandExpression"
    // IdentifiersParser.g:346:1: precedenceAmpersandExpression : precedencePlusExpression ( precedenceAmpersandOperator ^ precedencePlusExpression )* ;
    public final HiveParser_IdentifiersParser.precedenceAmpersandExpression_return precedenceAmpersandExpression() throws RecognitionException {
        HiveParser_IdentifiersParser.precedenceAmpersandExpression_return retval = new HiveParser_IdentifiersParser.precedenceAmpersandExpression_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        HiveParser_IdentifiersParser.precedencePlusExpression_return precedencePlusExpression175 =null;

        HiveParser_IdentifiersParser.precedenceAmpersandOperator_return precedenceAmpersandOperator176 =null;

        HiveParser_IdentifiersParser.precedencePlusExpression_return precedencePlusExpression177 =null;



        try {
            // IdentifiersParser.g:347:5: ( precedencePlusExpression ( precedenceAmpersandOperator ^ precedencePlusExpression )* )
            // IdentifiersParser.g:348:5: precedencePlusExpression ( precedenceAmpersandOperator ^ precedencePlusExpression )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_precedencePlusExpression_in_precedenceAmpersandExpression2204);
            precedencePlusExpression175=precedencePlusExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, precedencePlusExpression175.getTree());

            // IdentifiersParser.g:348:30: ( precedenceAmpersandOperator ^ precedencePlusExpression )*
            loop42:
            do {
                int alt42=2;
                switch ( input.LA(1) ) {
                case AMPERSAND:
                    {
                    alt42=1;
                    }
                    break;

                }

                switch (alt42) {
            	case 1 :
            	    // IdentifiersParser.g:348:31: precedenceAmpersandOperator ^ precedencePlusExpression
            	    {
            	    pushFollow(FOLLOW_precedenceAmpersandOperator_in_precedenceAmpersandExpression2207);
            	    precedenceAmpersandOperator176=precedenceAmpersandOperator();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(precedenceAmpersandOperator176.getTree(), root_0);

            	    pushFollow(FOLLOW_precedencePlusExpression_in_precedenceAmpersandExpression2210);
            	    precedencePlusExpression177=precedencePlusExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, precedencePlusExpression177.getTree());

            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "precedenceAmpersandExpression"


    public static class precedenceBitwiseOrOperator_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "precedenceBitwiseOrOperator"
    // IdentifiersParser.g:352:1: precedenceBitwiseOrOperator : BITWISEOR ;
    public final HiveParser_IdentifiersParser.precedenceBitwiseOrOperator_return precedenceBitwiseOrOperator() throws RecognitionException {
        HiveParser_IdentifiersParser.precedenceBitwiseOrOperator_return retval = new HiveParser_IdentifiersParser.precedenceBitwiseOrOperator_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token BITWISEOR178=null;

        CommonTree BITWISEOR178_tree=null;

        try {
            // IdentifiersParser.g:353:5: ( BITWISEOR )
            // IdentifiersParser.g:354:5: BITWISEOR
            {
            root_0 = (CommonTree)adaptor.nil();


            BITWISEOR178=(Token)match(input,BITWISEOR,FOLLOW_BITWISEOR_in_precedenceBitwiseOrOperator2234); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            BITWISEOR178_tree = 
            (CommonTree)adaptor.create(BITWISEOR178)
            ;
            adaptor.addChild(root_0, BITWISEOR178_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "precedenceBitwiseOrOperator"


    public static class precedenceBitwiseOrExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "precedenceBitwiseOrExpression"
    // IdentifiersParser.g:357:1: precedenceBitwiseOrExpression : precedenceAmpersandExpression ( precedenceBitwiseOrOperator ^ precedenceAmpersandExpression )* ;
    public final HiveParser_IdentifiersParser.precedenceBitwiseOrExpression_return precedenceBitwiseOrExpression() throws RecognitionException {
        HiveParser_IdentifiersParser.precedenceBitwiseOrExpression_return retval = new HiveParser_IdentifiersParser.precedenceBitwiseOrExpression_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        HiveParser_IdentifiersParser.precedenceAmpersandExpression_return precedenceAmpersandExpression179 =null;

        HiveParser_IdentifiersParser.precedenceBitwiseOrOperator_return precedenceBitwiseOrOperator180 =null;

        HiveParser_IdentifiersParser.precedenceAmpersandExpression_return precedenceAmpersandExpression181 =null;



        try {
            // IdentifiersParser.g:358:5: ( precedenceAmpersandExpression ( precedenceBitwiseOrOperator ^ precedenceAmpersandExpression )* )
            // IdentifiersParser.g:359:5: precedenceAmpersandExpression ( precedenceBitwiseOrOperator ^ precedenceAmpersandExpression )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_precedenceAmpersandExpression_in_precedenceBitwiseOrExpression2255);
            precedenceAmpersandExpression179=precedenceAmpersandExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, precedenceAmpersandExpression179.getTree());

            // IdentifiersParser.g:359:35: ( precedenceBitwiseOrOperator ^ precedenceAmpersandExpression )*
            loop43:
            do {
                int alt43=2;
                switch ( input.LA(1) ) {
                case BITWISEOR:
                    {
                    alt43=1;
                    }
                    break;

                }

                switch (alt43) {
            	case 1 :
            	    // IdentifiersParser.g:359:36: precedenceBitwiseOrOperator ^ precedenceAmpersandExpression
            	    {
            	    pushFollow(FOLLOW_precedenceBitwiseOrOperator_in_precedenceBitwiseOrExpression2258);
            	    precedenceBitwiseOrOperator180=precedenceBitwiseOrOperator();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(precedenceBitwiseOrOperator180.getTree(), root_0);

            	    pushFollow(FOLLOW_precedenceAmpersandExpression_in_precedenceBitwiseOrExpression2261);
            	    precedenceAmpersandExpression181=precedenceAmpersandExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, precedenceAmpersandExpression181.getTree());

            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "precedenceBitwiseOrExpression"


    public static class precedenceEqualNegatableOperator_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "precedenceEqualNegatableOperator"
    // IdentifiersParser.g:364:1: precedenceEqualNegatableOperator : ( KW_LIKE | KW_RLIKE | KW_REGEXP );
    public final HiveParser_IdentifiersParser.precedenceEqualNegatableOperator_return precedenceEqualNegatableOperator() throws RecognitionException {
        HiveParser_IdentifiersParser.precedenceEqualNegatableOperator_return retval = new HiveParser_IdentifiersParser.precedenceEqualNegatableOperator_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set182=null;

        CommonTree set182_tree=null;

        try {
            // IdentifiersParser.g:365:5: ( KW_LIKE | KW_RLIKE | KW_REGEXP )
            // IdentifiersParser.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            set182=(Token)input.LT(1);

            if ( input.LA(1)==KW_LIKE||input.LA(1)==KW_REGEXP||input.LA(1)==KW_RLIKE ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(set182)
                );
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "precedenceEqualNegatableOperator"


    public static class precedenceEqualOperator_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "precedenceEqualOperator"
    // IdentifiersParser.g:369:1: precedenceEqualOperator : ( precedenceEqualNegatableOperator | EQUAL | EQUAL_NS | NOTEQUAL | LESSTHANOREQUALTO | LESSTHAN | GREATERTHANOREQUALTO | GREATERTHAN );
    public final HiveParser_IdentifiersParser.precedenceEqualOperator_return precedenceEqualOperator() throws RecognitionException {
        HiveParser_IdentifiersParser.precedenceEqualOperator_return retval = new HiveParser_IdentifiersParser.precedenceEqualOperator_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token EQUAL184=null;
        Token EQUAL_NS185=null;
        Token NOTEQUAL186=null;
        Token LESSTHANOREQUALTO187=null;
        Token LESSTHAN188=null;
        Token GREATERTHANOREQUALTO189=null;
        Token GREATERTHAN190=null;
        HiveParser_IdentifiersParser.precedenceEqualNegatableOperator_return precedenceEqualNegatableOperator183 =null;


        CommonTree EQUAL184_tree=null;
        CommonTree EQUAL_NS185_tree=null;
        CommonTree NOTEQUAL186_tree=null;
        CommonTree LESSTHANOREQUALTO187_tree=null;
        CommonTree LESSTHAN188_tree=null;
        CommonTree GREATERTHANOREQUALTO189_tree=null;
        CommonTree GREATERTHAN190_tree=null;

        try {
            // IdentifiersParser.g:370:5: ( precedenceEqualNegatableOperator | EQUAL | EQUAL_NS | NOTEQUAL | LESSTHANOREQUALTO | LESSTHAN | GREATERTHANOREQUALTO | GREATERTHAN )
            int alt44=8;
            switch ( input.LA(1) ) {
            case KW_LIKE:
            case KW_REGEXP:
            case KW_RLIKE:
                {
                alt44=1;
                }
                break;
            case EQUAL:
                {
                alt44=2;
                }
                break;
            case EQUAL_NS:
                {
                alt44=3;
                }
                break;
            case NOTEQUAL:
                {
                alt44=4;
                }
                break;
            case LESSTHANOREQUALTO:
                {
                alt44=5;
                }
                break;
            case LESSTHAN:
                {
                alt44=6;
                }
                break;
            case GREATERTHANOREQUALTO:
                {
                alt44=7;
                }
                break;
            case GREATERTHAN:
                {
                alt44=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;

            }

            switch (alt44) {
                case 1 :
                    // IdentifiersParser.g:371:5: precedenceEqualNegatableOperator
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_precedenceEqualNegatableOperator_in_precedenceEqualOperator2315);
                    precedenceEqualNegatableOperator183=precedenceEqualNegatableOperator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, precedenceEqualNegatableOperator183.getTree());

                    }
                    break;
                case 2 :
                    // IdentifiersParser.g:371:40: EQUAL
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    EQUAL184=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_precedenceEqualOperator2319); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    EQUAL184_tree = 
                    (CommonTree)adaptor.create(EQUAL184)
                    ;
                    adaptor.addChild(root_0, EQUAL184_tree);
                    }

                    }
                    break;
                case 3 :
                    // IdentifiersParser.g:371:48: EQUAL_NS
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    EQUAL_NS185=(Token)match(input,EQUAL_NS,FOLLOW_EQUAL_NS_in_precedenceEqualOperator2323); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    EQUAL_NS185_tree = 
                    (CommonTree)adaptor.create(EQUAL_NS185)
                    ;
                    adaptor.addChild(root_0, EQUAL_NS185_tree);
                    }

                    }
                    break;
                case 4 :
                    // IdentifiersParser.g:371:59: NOTEQUAL
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    NOTEQUAL186=(Token)match(input,NOTEQUAL,FOLLOW_NOTEQUAL_in_precedenceEqualOperator2327); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NOTEQUAL186_tree = 
                    (CommonTree)adaptor.create(NOTEQUAL186)
                    ;
                    adaptor.addChild(root_0, NOTEQUAL186_tree);
                    }

                    }
                    break;
                case 5 :
                    // IdentifiersParser.g:371:70: LESSTHANOREQUALTO
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    LESSTHANOREQUALTO187=(Token)match(input,LESSTHANOREQUALTO,FOLLOW_LESSTHANOREQUALTO_in_precedenceEqualOperator2331); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LESSTHANOREQUALTO187_tree = 
                    (CommonTree)adaptor.create(LESSTHANOREQUALTO187)
                    ;
                    adaptor.addChild(root_0, LESSTHANOREQUALTO187_tree);
                    }

                    }
                    break;
                case 6 :
                    // IdentifiersParser.g:371:90: LESSTHAN
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    LESSTHAN188=(Token)match(input,LESSTHAN,FOLLOW_LESSTHAN_in_precedenceEqualOperator2335); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LESSTHAN188_tree = 
                    (CommonTree)adaptor.create(LESSTHAN188)
                    ;
                    adaptor.addChild(root_0, LESSTHAN188_tree);
                    }

                    }
                    break;
                case 7 :
                    // IdentifiersParser.g:371:101: GREATERTHANOREQUALTO
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    GREATERTHANOREQUALTO189=(Token)match(input,GREATERTHANOREQUALTO,FOLLOW_GREATERTHANOREQUALTO_in_precedenceEqualOperator2339); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    GREATERTHANOREQUALTO189_tree = 
                    (CommonTree)adaptor.create(GREATERTHANOREQUALTO189)
                    ;
                    adaptor.addChild(root_0, GREATERTHANOREQUALTO189_tree);
                    }

                    }
                    break;
                case 8 :
                    // IdentifiersParser.g:371:124: GREATERTHAN
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    GREATERTHAN190=(Token)match(input,GREATERTHAN,FOLLOW_GREATERTHAN_in_precedenceEqualOperator2343); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    GREATERTHAN190_tree = 
                    (CommonTree)adaptor.create(GREATERTHAN190)
                    ;
                    adaptor.addChild(root_0, GREATERTHAN190_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "precedenceEqualOperator"


    public static class subQueryExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "subQueryExpression"
    // IdentifiersParser.g:374:1: subQueryExpression : LPAREN ! selectStatement[true] RPAREN !;
    public final HiveParser_IdentifiersParser.subQueryExpression_return subQueryExpression() throws RecognitionException {
        HiveParser_IdentifiersParser.subQueryExpression_return retval = new HiveParser_IdentifiersParser.subQueryExpression_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token LPAREN191=null;
        Token RPAREN193=null;
        HiveParser.selectStatement_return selectStatement192 =null;


        CommonTree LPAREN191_tree=null;
        CommonTree RPAREN193_tree=null;

        try {
            // IdentifiersParser.g:375:5: ( LPAREN ! selectStatement[true] RPAREN !)
            // IdentifiersParser.g:376:5: LPAREN ! selectStatement[true] RPAREN !
            {
            root_0 = (CommonTree)adaptor.nil();


            LPAREN191=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_subQueryExpression2366); if (state.failed) return retval;

            pushFollow(FOLLOW_selectStatement_in_subQueryExpression2369);
            selectStatement192=gHiveParser.selectStatement(true);

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, selectStatement192.getTree());

            RPAREN193=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_subQueryExpression2372); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "subQueryExpression"


    public static class precedenceEqualExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "precedenceEqualExpression"
    // IdentifiersParser.g:379:1: precedenceEqualExpression : ( (left= precedenceBitwiseOrExpression -> $left) ( ( KW_NOT precedenceEqualNegatableOperator notExpr= precedenceBitwiseOrExpression ) -> ^( KW_NOT ^( precedenceEqualNegatableOperator $precedenceEqualExpression $notExpr) ) | ( precedenceEqualOperator equalExpr= precedenceBitwiseOrExpression ) -> ^( precedenceEqualOperator $precedenceEqualExpression $equalExpr) | ( KW_NOT KW_IN LPAREN KW_SELECT )=> ( KW_NOT KW_IN subQueryExpression ) -> ^( KW_NOT ^( TOK_SUBQUERY_EXPR ^( TOK_SUBQUERY_OP KW_IN ) subQueryExpression $precedenceEqualExpression) ) | ( KW_NOT KW_IN expressions ) -> ^( KW_NOT ^( TOK_FUNCTION KW_IN $precedenceEqualExpression expressions ) ) | ( KW_IN LPAREN KW_SELECT )=> ( KW_IN subQueryExpression ) -> ^( TOK_SUBQUERY_EXPR ^( TOK_SUBQUERY_OP KW_IN ) subQueryExpression $precedenceEqualExpression) | ( KW_IN expressions ) -> ^( TOK_FUNCTION KW_IN $precedenceEqualExpression expressions ) | ( KW_NOT KW_BETWEEN (min= precedenceBitwiseOrExpression ) KW_AND (max= precedenceBitwiseOrExpression ) ) -> ^( TOK_FUNCTION Identifier[\"between\"] KW_TRUE $left $min $max) | ( KW_BETWEEN (min= precedenceBitwiseOrExpression ) KW_AND (max= precedenceBitwiseOrExpression ) ) -> ^( TOK_FUNCTION Identifier[\"between\"] KW_FALSE $left $min $max) )* | ( KW_EXISTS LPAREN KW_SELECT )=> ( KW_EXISTS subQueryExpression ) -> ^( TOK_SUBQUERY_EXPR ^( TOK_SUBQUERY_OP KW_EXISTS ) subQueryExpression ) );
    public final HiveParser_IdentifiersParser.precedenceEqualExpression_return precedenceEqualExpression() throws RecognitionException {
        HiveParser_IdentifiersParser.precedenceEqualExpression_return retval = new HiveParser_IdentifiersParser.precedenceEqualExpression_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token KW_NOT194=null;
        Token KW_NOT197=null;
        Token KW_IN198=null;
        Token KW_NOT200=null;
        Token KW_IN201=null;
        Token KW_IN203=null;
        Token KW_IN205=null;
        Token KW_NOT207=null;
        Token KW_BETWEEN208=null;
        Token KW_AND209=null;
        Token KW_BETWEEN210=null;
        Token KW_AND211=null;
        Token KW_EXISTS212=null;
        HiveParser_IdentifiersParser.precedenceBitwiseOrExpression_return left =null;

        HiveParser_IdentifiersParser.precedenceBitwiseOrExpression_return notExpr =null;

        HiveParser_IdentifiersParser.precedenceBitwiseOrExpression_return equalExpr =null;

        HiveParser_IdentifiersParser.precedenceBitwiseOrExpression_return min =null;

        HiveParser_IdentifiersParser.precedenceBitwiseOrExpression_return max =null;

        HiveParser_IdentifiersParser.precedenceEqualNegatableOperator_return precedenceEqualNegatableOperator195 =null;

        HiveParser_IdentifiersParser.precedenceEqualOperator_return precedenceEqualOperator196 =null;

        HiveParser_IdentifiersParser.subQueryExpression_return subQueryExpression199 =null;

        HiveParser_IdentifiersParser.expressions_return expressions202 =null;

        HiveParser_IdentifiersParser.subQueryExpression_return subQueryExpression204 =null;

        HiveParser_IdentifiersParser.expressions_return expressions206 =null;

        HiveParser_IdentifiersParser.subQueryExpression_return subQueryExpression213 =null;


        CommonTree KW_NOT194_tree=null;
        CommonTree KW_NOT197_tree=null;
        CommonTree KW_IN198_tree=null;
        CommonTree KW_NOT200_tree=null;
        CommonTree KW_IN201_tree=null;
        CommonTree KW_IN203_tree=null;
        CommonTree KW_IN205_tree=null;
        CommonTree KW_NOT207_tree=null;
        CommonTree KW_BETWEEN208_tree=null;
        CommonTree KW_AND209_tree=null;
        CommonTree KW_BETWEEN210_tree=null;
        CommonTree KW_AND211_tree=null;
        CommonTree KW_EXISTS212_tree=null;
        RewriteRuleTokenStream stream_KW_IN=new RewriteRuleTokenStream(adaptor,"token KW_IN");
        RewriteRuleTokenStream stream_KW_BETWEEN=new RewriteRuleTokenStream(adaptor,"token KW_BETWEEN");
        RewriteRuleTokenStream stream_KW_AND=new RewriteRuleTokenStream(adaptor,"token KW_AND");
        RewriteRuleTokenStream stream_KW_EXISTS=new RewriteRuleTokenStream(adaptor,"token KW_EXISTS");
        RewriteRuleTokenStream stream_KW_NOT=new RewriteRuleTokenStream(adaptor,"token KW_NOT");
        RewriteRuleSubtreeStream stream_subQueryExpression=new RewriteRuleSubtreeStream(adaptor,"rule subQueryExpression");
        RewriteRuleSubtreeStream stream_precedenceEqualNegatableOperator=new RewriteRuleSubtreeStream(adaptor,"rule precedenceEqualNegatableOperator");
        RewriteRuleSubtreeStream stream_precedenceEqualOperator=new RewriteRuleSubtreeStream(adaptor,"rule precedenceEqualOperator");
        RewriteRuleSubtreeStream stream_precedenceBitwiseOrExpression=new RewriteRuleSubtreeStream(adaptor,"rule precedenceBitwiseOrExpression");
        RewriteRuleSubtreeStream stream_expressions=new RewriteRuleSubtreeStream(adaptor,"rule expressions");
        try {
            // IdentifiersParser.g:380:5: ( (left= precedenceBitwiseOrExpression -> $left) ( ( KW_NOT precedenceEqualNegatableOperator notExpr= precedenceBitwiseOrExpression ) -> ^( KW_NOT ^( precedenceEqualNegatableOperator $precedenceEqualExpression $notExpr) ) | ( precedenceEqualOperator equalExpr= precedenceBitwiseOrExpression ) -> ^( precedenceEqualOperator $precedenceEqualExpression $equalExpr) | ( KW_NOT KW_IN LPAREN KW_SELECT )=> ( KW_NOT KW_IN subQueryExpression ) -> ^( KW_NOT ^( TOK_SUBQUERY_EXPR ^( TOK_SUBQUERY_OP KW_IN ) subQueryExpression $precedenceEqualExpression) ) | ( KW_NOT KW_IN expressions ) -> ^( KW_NOT ^( TOK_FUNCTION KW_IN $precedenceEqualExpression expressions ) ) | ( KW_IN LPAREN KW_SELECT )=> ( KW_IN subQueryExpression ) -> ^( TOK_SUBQUERY_EXPR ^( TOK_SUBQUERY_OP KW_IN ) subQueryExpression $precedenceEqualExpression) | ( KW_IN expressions ) -> ^( TOK_FUNCTION KW_IN $precedenceEqualExpression expressions ) | ( KW_NOT KW_BETWEEN (min= precedenceBitwiseOrExpression ) KW_AND (max= precedenceBitwiseOrExpression ) ) -> ^( TOK_FUNCTION Identifier[\"between\"] KW_TRUE $left $min $max) | ( KW_BETWEEN (min= precedenceBitwiseOrExpression ) KW_AND (max= precedenceBitwiseOrExpression ) ) -> ^( TOK_FUNCTION Identifier[\"between\"] KW_FALSE $left $min $max) )* | ( KW_EXISTS LPAREN KW_SELECT )=> ( KW_EXISTS subQueryExpression ) -> ^( TOK_SUBQUERY_EXPR ^( TOK_SUBQUERY_OP KW_EXISTS ) subQueryExpression ) )
            int alt46=2;
            alt46 = dfa46.predict(input);
            switch (alt46) {
                case 1 :
                    // IdentifiersParser.g:381:5: (left= precedenceBitwiseOrExpression -> $left) ( ( KW_NOT precedenceEqualNegatableOperator notExpr= precedenceBitwiseOrExpression ) -> ^( KW_NOT ^( precedenceEqualNegatableOperator $precedenceEqualExpression $notExpr) ) | ( precedenceEqualOperator equalExpr= precedenceBitwiseOrExpression ) -> ^( precedenceEqualOperator $precedenceEqualExpression $equalExpr) | ( KW_NOT KW_IN LPAREN KW_SELECT )=> ( KW_NOT KW_IN subQueryExpression ) -> ^( KW_NOT ^( TOK_SUBQUERY_EXPR ^( TOK_SUBQUERY_OP KW_IN ) subQueryExpression $precedenceEqualExpression) ) | ( KW_NOT KW_IN expressions ) -> ^( KW_NOT ^( TOK_FUNCTION KW_IN $precedenceEqualExpression expressions ) ) | ( KW_IN LPAREN KW_SELECT )=> ( KW_IN subQueryExpression ) -> ^( TOK_SUBQUERY_EXPR ^( TOK_SUBQUERY_OP KW_IN ) subQueryExpression $precedenceEqualExpression) | ( KW_IN expressions ) -> ^( TOK_FUNCTION KW_IN $precedenceEqualExpression expressions ) | ( KW_NOT KW_BETWEEN (min= precedenceBitwiseOrExpression ) KW_AND (max= precedenceBitwiseOrExpression ) ) -> ^( TOK_FUNCTION Identifier[\"between\"] KW_TRUE $left $min $max) | ( KW_BETWEEN (min= precedenceBitwiseOrExpression ) KW_AND (max= precedenceBitwiseOrExpression ) ) -> ^( TOK_FUNCTION Identifier[\"between\"] KW_FALSE $left $min $max) )*
                    {
                    // IdentifiersParser.g:381:5: (left= precedenceBitwiseOrExpression -> $left)
                    // IdentifiersParser.g:381:6: left= precedenceBitwiseOrExpression
                    {
                    pushFollow(FOLLOW_precedenceBitwiseOrExpression_in_precedenceEqualExpression2400);
                    left=precedenceBitwiseOrExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_precedenceBitwiseOrExpression.add(left.getTree());

                    // AST REWRITE
                    // elements: left
                    // token labels: 
                    // rule labels: retval, left
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_left=new RewriteRuleSubtreeStream(adaptor,"rule left",left!=null?left.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 381:41: -> $left
                    {
                        adaptor.addChild(root_0, stream_left.nextTree());

                    }


                    retval.tree = root_0;
                    }

                    }


                    // IdentifiersParser.g:382:5: ( ( KW_NOT precedenceEqualNegatableOperator notExpr= precedenceBitwiseOrExpression ) -> ^( KW_NOT ^( precedenceEqualNegatableOperator $precedenceEqualExpression $notExpr) ) | ( precedenceEqualOperator equalExpr= precedenceBitwiseOrExpression ) -> ^( precedenceEqualOperator $precedenceEqualExpression $equalExpr) | ( KW_NOT KW_IN LPAREN KW_SELECT )=> ( KW_NOT KW_IN subQueryExpression ) -> ^( KW_NOT ^( TOK_SUBQUERY_EXPR ^( TOK_SUBQUERY_OP KW_IN ) subQueryExpression $precedenceEqualExpression) ) | ( KW_NOT KW_IN expressions ) -> ^( KW_NOT ^( TOK_FUNCTION KW_IN $precedenceEqualExpression expressions ) ) | ( KW_IN LPAREN KW_SELECT )=> ( KW_IN subQueryExpression ) -> ^( TOK_SUBQUERY_EXPR ^( TOK_SUBQUERY_OP KW_IN ) subQueryExpression $precedenceEqualExpression) | ( KW_IN expressions ) -> ^( TOK_FUNCTION KW_IN $precedenceEqualExpression expressions ) | ( KW_NOT KW_BETWEEN (min= precedenceBitwiseOrExpression ) KW_AND (max= precedenceBitwiseOrExpression ) ) -> ^( TOK_FUNCTION Identifier[\"between\"] KW_TRUE $left $min $max) | ( KW_BETWEEN (min= precedenceBitwiseOrExpression ) KW_AND (max= precedenceBitwiseOrExpression ) ) -> ^( TOK_FUNCTION Identifier[\"between\"] KW_FALSE $left $min $max) )*
                    loop45:
                    do {
                        int alt45=9;
                        alt45 = dfa45.predict(input);
                        switch (alt45) {
                    	case 1 :
                    	    // IdentifiersParser.g:383:8: ( KW_NOT precedenceEqualNegatableOperator notExpr= precedenceBitwiseOrExpression )
                    	    {
                    	    // IdentifiersParser.g:383:8: ( KW_NOT precedenceEqualNegatableOperator notExpr= precedenceBitwiseOrExpression )
                    	    // IdentifiersParser.g:383:9: KW_NOT precedenceEqualNegatableOperator notExpr= precedenceBitwiseOrExpression
                    	    {
                    	    KW_NOT194=(Token)match(input,KW_NOT,FOLLOW_KW_NOT_in_precedenceEqualExpression2422); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_KW_NOT.add(KW_NOT194);


                    	    pushFollow(FOLLOW_precedenceEqualNegatableOperator_in_precedenceEqualExpression2424);
                    	    precedenceEqualNegatableOperator195=precedenceEqualNegatableOperator();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_precedenceEqualNegatableOperator.add(precedenceEqualNegatableOperator195.getTree());

                    	    pushFollow(FOLLOW_precedenceBitwiseOrExpression_in_precedenceEqualExpression2428);
                    	    notExpr=precedenceBitwiseOrExpression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_precedenceBitwiseOrExpression.add(notExpr.getTree());

                    	    }


                    	    // AST REWRITE
                    	    // elements: KW_NOT, precedenceEqualExpression, precedenceEqualNegatableOperator, notExpr
                    	    // token labels: 
                    	    // rule labels: retval, notExpr
                    	    // token list labels: 
                    	    // rule list labels: 
                    	    // wildcard labels: 
                    	    if ( state.backtracking==0 ) {

                    	    retval.tree = root_0;
                    	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    	    RewriteRuleSubtreeStream stream_notExpr=new RewriteRuleSubtreeStream(adaptor,"rule notExpr",notExpr!=null?notExpr.tree:null);

                    	    root_0 = (CommonTree)adaptor.nil();
                    	    // 384:8: -> ^( KW_NOT ^( precedenceEqualNegatableOperator $precedenceEqualExpression $notExpr) )
                    	    {
                    	        // IdentifiersParser.g:384:11: ^( KW_NOT ^( precedenceEqualNegatableOperator $precedenceEqualExpression $notExpr) )
                    	        {
                    	        CommonTree root_1 = (CommonTree)adaptor.nil();
                    	        root_1 = (CommonTree)adaptor.becomeRoot(
                    	        stream_KW_NOT.nextNode()
                    	        , root_1);

                    	        // IdentifiersParser.g:384:20: ^( precedenceEqualNegatableOperator $precedenceEqualExpression $notExpr)
                    	        {
                    	        CommonTree root_2 = (CommonTree)adaptor.nil();
                    	        root_2 = (CommonTree)adaptor.becomeRoot(stream_precedenceEqualNegatableOperator.nextNode(), root_2);

                    	        adaptor.addChild(root_2, stream_retval.nextTree());

                    	        adaptor.addChild(root_2, stream_notExpr.nextTree());

                    	        adaptor.addChild(root_1, root_2);
                    	        }

                    	        adaptor.addChild(root_0, root_1);
                    	        }

                    	    }


                    	    retval.tree = root_0;
                    	    }

                    	    }
                    	    break;
                    	case 2 :
                    	    // IdentifiersParser.g:385:7: ( precedenceEqualOperator equalExpr= precedenceBitwiseOrExpression )
                    	    {
                    	    // IdentifiersParser.g:385:7: ( precedenceEqualOperator equalExpr= precedenceBitwiseOrExpression )
                    	    // IdentifiersParser.g:385:8: precedenceEqualOperator equalExpr= precedenceBitwiseOrExpression
                    	    {
                    	    pushFollow(FOLLOW_precedenceEqualOperator_in_precedenceEqualExpression2461);
                    	    precedenceEqualOperator196=precedenceEqualOperator();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_precedenceEqualOperator.add(precedenceEqualOperator196.getTree());

                    	    pushFollow(FOLLOW_precedenceBitwiseOrExpression_in_precedenceEqualExpression2465);
                    	    equalExpr=precedenceBitwiseOrExpression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_precedenceBitwiseOrExpression.add(equalExpr.getTree());

                    	    }


                    	    // AST REWRITE
                    	    // elements: equalExpr, precedenceEqualOperator, precedenceEqualExpression
                    	    // token labels: 
                    	    // rule labels: equalExpr, retval
                    	    // token list labels: 
                    	    // rule list labels: 
                    	    // wildcard labels: 
                    	    if ( state.backtracking==0 ) {

                    	    retval.tree = root_0;
                    	    RewriteRuleSubtreeStream stream_equalExpr=new RewriteRuleSubtreeStream(adaptor,"rule equalExpr",equalExpr!=null?equalExpr.tree:null);
                    	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    	    root_0 = (CommonTree)adaptor.nil();
                    	    // 386:8: -> ^( precedenceEqualOperator $precedenceEqualExpression $equalExpr)
                    	    {
                    	        // IdentifiersParser.g:386:11: ^( precedenceEqualOperator $precedenceEqualExpression $equalExpr)
                    	        {
                    	        CommonTree root_1 = (CommonTree)adaptor.nil();
                    	        root_1 = (CommonTree)adaptor.becomeRoot(stream_precedenceEqualOperator.nextNode(), root_1);

                    	        adaptor.addChild(root_1, stream_retval.nextTree());

                    	        adaptor.addChild(root_1, stream_equalExpr.nextTree());

                    	        adaptor.addChild(root_0, root_1);
                    	        }

                    	    }


                    	    retval.tree = root_0;
                    	    }

                    	    }
                    	    break;
                    	case 3 :
                    	    // IdentifiersParser.g:387:7: ( KW_NOT KW_IN LPAREN KW_SELECT )=> ( KW_NOT KW_IN subQueryExpression )
                    	    {
                    	    // IdentifiersParser.g:387:42: ( KW_NOT KW_IN subQueryExpression )
                    	    // IdentifiersParser.g:387:43: KW_NOT KW_IN subQueryExpression
                    	    {
                    	    KW_NOT197=(Token)match(input,KW_NOT,FOLLOW_KW_NOT_in_precedenceEqualExpression2506); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_KW_NOT.add(KW_NOT197);


                    	    KW_IN198=(Token)match(input,KW_IN,FOLLOW_KW_IN_in_precedenceEqualExpression2508); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_KW_IN.add(KW_IN198);


                    	    pushFollow(FOLLOW_subQueryExpression_in_precedenceEqualExpression2510);
                    	    subQueryExpression199=subQueryExpression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_subQueryExpression.add(subQueryExpression199.getTree());

                    	    }


                    	    // AST REWRITE
                    	    // elements: subQueryExpression, KW_IN, KW_NOT, precedenceEqualExpression
                    	    // token labels: 
                    	    // rule labels: retval
                    	    // token list labels: 
                    	    // rule list labels: 
                    	    // wildcard labels: 
                    	    if ( state.backtracking==0 ) {

                    	    retval.tree = root_0;
                    	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    	    root_0 = (CommonTree)adaptor.nil();
                    	    // 388:8: -> ^( KW_NOT ^( TOK_SUBQUERY_EXPR ^( TOK_SUBQUERY_OP KW_IN ) subQueryExpression $precedenceEqualExpression) )
                    	    {
                    	        // IdentifiersParser.g:388:11: ^( KW_NOT ^( TOK_SUBQUERY_EXPR ^( TOK_SUBQUERY_OP KW_IN ) subQueryExpression $precedenceEqualExpression) )
                    	        {
                    	        CommonTree root_1 = (CommonTree)adaptor.nil();
                    	        root_1 = (CommonTree)adaptor.becomeRoot(
                    	        stream_KW_NOT.nextNode()
                    	        , root_1);

                    	        // IdentifiersParser.g:388:20: ^( TOK_SUBQUERY_EXPR ^( TOK_SUBQUERY_OP KW_IN ) subQueryExpression $precedenceEqualExpression)
                    	        {
                    	        CommonTree root_2 = (CommonTree)adaptor.nil();
                    	        root_2 = (CommonTree)adaptor.becomeRoot(
                    	        (CommonTree)adaptor.create(TOK_SUBQUERY_EXPR, "TOK_SUBQUERY_EXPR")
                    	        , root_2);

                    	        // IdentifiersParser.g:388:40: ^( TOK_SUBQUERY_OP KW_IN )
                    	        {
                    	        CommonTree root_3 = (CommonTree)adaptor.nil();
                    	        root_3 = (CommonTree)adaptor.becomeRoot(
                    	        (CommonTree)adaptor.create(TOK_SUBQUERY_OP, "TOK_SUBQUERY_OP")
                    	        , root_3);

                    	        adaptor.addChild(root_3, 
                    	        stream_KW_IN.nextNode()
                    	        );

                    	        adaptor.addChild(root_2, root_3);
                    	        }

                    	        adaptor.addChild(root_2, stream_subQueryExpression.nextTree());

                    	        adaptor.addChild(root_2, stream_retval.nextTree());

                    	        adaptor.addChild(root_1, root_2);
                    	        }

                    	        adaptor.addChild(root_0, root_1);
                    	        }

                    	    }


                    	    retval.tree = root_0;
                    	    }

                    	    }
                    	    break;
                    	case 4 :
                    	    // IdentifiersParser.g:389:7: ( KW_NOT KW_IN expressions )
                    	    {
                    	    // IdentifiersParser.g:389:7: ( KW_NOT KW_IN expressions )
                    	    // IdentifiersParser.g:389:8: KW_NOT KW_IN expressions
                    	    {
                    	    KW_NOT200=(Token)match(input,KW_NOT,FOLLOW_KW_NOT_in_precedenceEqualExpression2549); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_KW_NOT.add(KW_NOT200);


                    	    KW_IN201=(Token)match(input,KW_IN,FOLLOW_KW_IN_in_precedenceEqualExpression2551); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_KW_IN.add(KW_IN201);


                    	    pushFollow(FOLLOW_expressions_in_precedenceEqualExpression2553);
                    	    expressions202=expressions();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_expressions.add(expressions202.getTree());

                    	    }


                    	    // AST REWRITE
                    	    // elements: expressions, KW_NOT, precedenceEqualExpression, KW_IN
                    	    // token labels: 
                    	    // rule labels: retval
                    	    // token list labels: 
                    	    // rule list labels: 
                    	    // wildcard labels: 
                    	    if ( state.backtracking==0 ) {

                    	    retval.tree = root_0;
                    	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    	    root_0 = (CommonTree)adaptor.nil();
                    	    // 390:8: -> ^( KW_NOT ^( TOK_FUNCTION KW_IN $precedenceEqualExpression expressions ) )
                    	    {
                    	        // IdentifiersParser.g:390:11: ^( KW_NOT ^( TOK_FUNCTION KW_IN $precedenceEqualExpression expressions ) )
                    	        {
                    	        CommonTree root_1 = (CommonTree)adaptor.nil();
                    	        root_1 = (CommonTree)adaptor.becomeRoot(
                    	        stream_KW_NOT.nextNode()
                    	        , root_1);

                    	        // IdentifiersParser.g:390:20: ^( TOK_FUNCTION KW_IN $precedenceEqualExpression expressions )
                    	        {
                    	        CommonTree root_2 = (CommonTree)adaptor.nil();
                    	        root_2 = (CommonTree)adaptor.becomeRoot(
                    	        (CommonTree)adaptor.create(TOK_FUNCTION, "TOK_FUNCTION")
                    	        , root_2);

                    	        adaptor.addChild(root_2, 
                    	        stream_KW_IN.nextNode()
                    	        );

                    	        adaptor.addChild(root_2, stream_retval.nextTree());

                    	        adaptor.addChild(root_2, stream_expressions.nextTree());

                    	        adaptor.addChild(root_1, root_2);
                    	        }

                    	        adaptor.addChild(root_0, root_1);
                    	        }

                    	    }


                    	    retval.tree = root_0;
                    	    }

                    	    }
                    	    break;
                    	case 5 :
                    	    // IdentifiersParser.g:391:7: ( KW_IN LPAREN KW_SELECT )=> ( KW_IN subQueryExpression )
                    	    {
                    	    // IdentifiersParser.g:391:35: ( KW_IN subQueryExpression )
                    	    // IdentifiersParser.g:391:36: KW_IN subQueryExpression
                    	    {
                    	    KW_IN203=(Token)match(input,KW_IN,FOLLOW_KW_IN_in_precedenceEqualExpression2597); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_KW_IN.add(KW_IN203);


                    	    pushFollow(FOLLOW_subQueryExpression_in_precedenceEqualExpression2599);
                    	    subQueryExpression204=subQueryExpression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_subQueryExpression.add(subQueryExpression204.getTree());

                    	    }


                    	    // AST REWRITE
                    	    // elements: subQueryExpression, KW_IN, precedenceEqualExpression
                    	    // token labels: 
                    	    // rule labels: retval
                    	    // token list labels: 
                    	    // rule list labels: 
                    	    // wildcard labels: 
                    	    if ( state.backtracking==0 ) {

                    	    retval.tree = root_0;
                    	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    	    root_0 = (CommonTree)adaptor.nil();
                    	    // 392:8: -> ^( TOK_SUBQUERY_EXPR ^( TOK_SUBQUERY_OP KW_IN ) subQueryExpression $precedenceEqualExpression)
                    	    {
                    	        // IdentifiersParser.g:392:11: ^( TOK_SUBQUERY_EXPR ^( TOK_SUBQUERY_OP KW_IN ) subQueryExpression $precedenceEqualExpression)
                    	        {
                    	        CommonTree root_1 = (CommonTree)adaptor.nil();
                    	        root_1 = (CommonTree)adaptor.becomeRoot(
                    	        (CommonTree)adaptor.create(TOK_SUBQUERY_EXPR, "TOK_SUBQUERY_EXPR")
                    	        , root_1);

                    	        // IdentifiersParser.g:392:31: ^( TOK_SUBQUERY_OP KW_IN )
                    	        {
                    	        CommonTree root_2 = (CommonTree)adaptor.nil();
                    	        root_2 = (CommonTree)adaptor.becomeRoot(
                    	        (CommonTree)adaptor.create(TOK_SUBQUERY_OP, "TOK_SUBQUERY_OP")
                    	        , root_2);

                    	        adaptor.addChild(root_2, 
                    	        stream_KW_IN.nextNode()
                    	        );

                    	        adaptor.addChild(root_1, root_2);
                    	        }

                    	        adaptor.addChild(root_1, stream_subQueryExpression.nextTree());

                    	        adaptor.addChild(root_1, stream_retval.nextTree());

                    	        adaptor.addChild(root_0, root_1);
                    	        }

                    	    }


                    	    retval.tree = root_0;
                    	    }

                    	    }
                    	    break;
                    	case 6 :
                    	    // IdentifiersParser.g:393:7: ( KW_IN expressions )
                    	    {
                    	    // IdentifiersParser.g:393:7: ( KW_IN expressions )
                    	    // IdentifiersParser.g:393:8: KW_IN expressions
                    	    {
                    	    KW_IN205=(Token)match(input,KW_IN,FOLLOW_KW_IN_in_precedenceEqualExpression2634); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_KW_IN.add(KW_IN205);


                    	    pushFollow(FOLLOW_expressions_in_precedenceEqualExpression2636);
                    	    expressions206=expressions();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_expressions.add(expressions206.getTree());

                    	    }


                    	    // AST REWRITE
                    	    // elements: precedenceEqualExpression, KW_IN, expressions
                    	    // token labels: 
                    	    // rule labels: retval
                    	    // token list labels: 
                    	    // rule list labels: 
                    	    // wildcard labels: 
                    	    if ( state.backtracking==0 ) {

                    	    retval.tree = root_0;
                    	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    	    root_0 = (CommonTree)adaptor.nil();
                    	    // 394:8: -> ^( TOK_FUNCTION KW_IN $precedenceEqualExpression expressions )
                    	    {
                    	        // IdentifiersParser.g:394:11: ^( TOK_FUNCTION KW_IN $precedenceEqualExpression expressions )
                    	        {
                    	        CommonTree root_1 = (CommonTree)adaptor.nil();
                    	        root_1 = (CommonTree)adaptor.becomeRoot(
                    	        (CommonTree)adaptor.create(TOK_FUNCTION, "TOK_FUNCTION")
                    	        , root_1);

                    	        adaptor.addChild(root_1, 
                    	        stream_KW_IN.nextNode()
                    	        );

                    	        adaptor.addChild(root_1, stream_retval.nextTree());

                    	        adaptor.addChild(root_1, stream_expressions.nextTree());

                    	        adaptor.addChild(root_0, root_1);
                    	        }

                    	    }


                    	    retval.tree = root_0;
                    	    }

                    	    }
                    	    break;
                    	case 7 :
                    	    // IdentifiersParser.g:395:7: ( KW_NOT KW_BETWEEN (min= precedenceBitwiseOrExpression ) KW_AND (max= precedenceBitwiseOrExpression ) )
                    	    {
                    	    // IdentifiersParser.g:395:7: ( KW_NOT KW_BETWEEN (min= precedenceBitwiseOrExpression ) KW_AND (max= precedenceBitwiseOrExpression ) )
                    	    // IdentifiersParser.g:395:9: KW_NOT KW_BETWEEN (min= precedenceBitwiseOrExpression ) KW_AND (max= precedenceBitwiseOrExpression )
                    	    {
                    	    KW_NOT207=(Token)match(input,KW_NOT,FOLLOW_KW_NOT_in_precedenceEqualExpression2667); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_KW_NOT.add(KW_NOT207);


                    	    KW_BETWEEN208=(Token)match(input,KW_BETWEEN,FOLLOW_KW_BETWEEN_in_precedenceEqualExpression2669); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_KW_BETWEEN.add(KW_BETWEEN208);


                    	    // IdentifiersParser.g:395:27: (min= precedenceBitwiseOrExpression )
                    	    // IdentifiersParser.g:395:28: min= precedenceBitwiseOrExpression
                    	    {
                    	    pushFollow(FOLLOW_precedenceBitwiseOrExpression_in_precedenceEqualExpression2674);
                    	    min=precedenceBitwiseOrExpression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_precedenceBitwiseOrExpression.add(min.getTree());

                    	    }


                    	    KW_AND209=(Token)match(input,KW_AND,FOLLOW_KW_AND_in_precedenceEqualExpression2677); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_KW_AND.add(KW_AND209);


                    	    // IdentifiersParser.g:395:70: (max= precedenceBitwiseOrExpression )
                    	    // IdentifiersParser.g:395:71: max= precedenceBitwiseOrExpression
                    	    {
                    	    pushFollow(FOLLOW_precedenceBitwiseOrExpression_in_precedenceEqualExpression2682);
                    	    max=precedenceBitwiseOrExpression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_precedenceBitwiseOrExpression.add(max.getTree());

                    	    }


                    	    }


                    	    // AST REWRITE
                    	    // elements: max, min, left
                    	    // token labels: 
                    	    // rule labels: min, retval, max, left
                    	    // token list labels: 
                    	    // rule list labels: 
                    	    // wildcard labels: 
                    	    if ( state.backtracking==0 ) {

                    	    retval.tree = root_0;
                    	    RewriteRuleSubtreeStream stream_min=new RewriteRuleSubtreeStream(adaptor,"rule min",min!=null?min.tree:null);
                    	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    	    RewriteRuleSubtreeStream stream_max=new RewriteRuleSubtreeStream(adaptor,"rule max",max!=null?max.tree:null);
                    	    RewriteRuleSubtreeStream stream_left=new RewriteRuleSubtreeStream(adaptor,"rule left",left!=null?left.tree:null);

                    	    root_0 = (CommonTree)adaptor.nil();
                    	    // 396:8: -> ^( TOK_FUNCTION Identifier[\"between\"] KW_TRUE $left $min $max)
                    	    {
                    	        // IdentifiersParser.g:396:11: ^( TOK_FUNCTION Identifier[\"between\"] KW_TRUE $left $min $max)
                    	        {
                    	        CommonTree root_1 = (CommonTree)adaptor.nil();
                    	        root_1 = (CommonTree)adaptor.becomeRoot(
                    	        (CommonTree)adaptor.create(TOK_FUNCTION, "TOK_FUNCTION")
                    	        , root_1);

                    	        adaptor.addChild(root_1, 
                    	        (CommonTree)adaptor.create(Identifier, "between")
                    	        );

                    	        adaptor.addChild(root_1, 
                    	        (CommonTree)adaptor.create(KW_TRUE, "KW_TRUE")
                    	        );

                    	        adaptor.addChild(root_1, stream_left.nextTree());

                    	        adaptor.addChild(root_1, stream_min.nextTree());

                    	        adaptor.addChild(root_1, stream_max.nextTree());

                    	        adaptor.addChild(root_0, root_1);
                    	        }

                    	    }


                    	    retval.tree = root_0;
                    	    }

                    	    }
                    	    break;
                    	case 8 :
                    	    // IdentifiersParser.g:397:7: ( KW_BETWEEN (min= precedenceBitwiseOrExpression ) KW_AND (max= precedenceBitwiseOrExpression ) )
                    	    {
                    	    // IdentifiersParser.g:397:7: ( KW_BETWEEN (min= precedenceBitwiseOrExpression ) KW_AND (max= precedenceBitwiseOrExpression ) )
                    	    // IdentifiersParser.g:397:9: KW_BETWEEN (min= precedenceBitwiseOrExpression ) KW_AND (max= precedenceBitwiseOrExpression )
                    	    {
                    	    KW_BETWEEN210=(Token)match(input,KW_BETWEEN,FOLLOW_KW_BETWEEN_in_precedenceEqualExpression2722); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_KW_BETWEEN.add(KW_BETWEEN210);


                    	    // IdentifiersParser.g:397:20: (min= precedenceBitwiseOrExpression )
                    	    // IdentifiersParser.g:397:21: min= precedenceBitwiseOrExpression
                    	    {
                    	    pushFollow(FOLLOW_precedenceBitwiseOrExpression_in_precedenceEqualExpression2727);
                    	    min=precedenceBitwiseOrExpression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_precedenceBitwiseOrExpression.add(min.getTree());

                    	    }


                    	    KW_AND211=(Token)match(input,KW_AND,FOLLOW_KW_AND_in_precedenceEqualExpression2730); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_KW_AND.add(KW_AND211);


                    	    // IdentifiersParser.g:397:63: (max= precedenceBitwiseOrExpression )
                    	    // IdentifiersParser.g:397:64: max= precedenceBitwiseOrExpression
                    	    {
                    	    pushFollow(FOLLOW_precedenceBitwiseOrExpression_in_precedenceEqualExpression2735);
                    	    max=precedenceBitwiseOrExpression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_precedenceBitwiseOrExpression.add(max.getTree());

                    	    }


                    	    }


                    	    // AST REWRITE
                    	    // elements: max, min, left
                    	    // token labels: 
                    	    // rule labels: min, retval, max, left
                    	    // token list labels: 
                    	    // rule list labels: 
                    	    // wildcard labels: 
                    	    if ( state.backtracking==0 ) {

                    	    retval.tree = root_0;
                    	    RewriteRuleSubtreeStream stream_min=new RewriteRuleSubtreeStream(adaptor,"rule min",min!=null?min.tree:null);
                    	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    	    RewriteRuleSubtreeStream stream_max=new RewriteRuleSubtreeStream(adaptor,"rule max",max!=null?max.tree:null);
                    	    RewriteRuleSubtreeStream stream_left=new RewriteRuleSubtreeStream(adaptor,"rule left",left!=null?left.tree:null);

                    	    root_0 = (CommonTree)adaptor.nil();
                    	    // 398:8: -> ^( TOK_FUNCTION Identifier[\"between\"] KW_FALSE $left $min $max)
                    	    {
                    	        // IdentifiersParser.g:398:11: ^( TOK_FUNCTION Identifier[\"between\"] KW_FALSE $left $min $max)
                    	        {
                    	        CommonTree root_1 = (CommonTree)adaptor.nil();
                    	        root_1 = (CommonTree)adaptor.becomeRoot(
                    	        (CommonTree)adaptor.create(TOK_FUNCTION, "TOK_FUNCTION")
                    	        , root_1);

                    	        adaptor.addChild(root_1, 
                    	        (CommonTree)adaptor.create(Identifier, "between")
                    	        );

                    	        adaptor.addChild(root_1, 
                    	        (CommonTree)adaptor.create(KW_FALSE, "KW_FALSE")
                    	        );

                    	        adaptor.addChild(root_1, stream_left.nextTree());

                    	        adaptor.addChild(root_1, stream_min.nextTree());

                    	        adaptor.addChild(root_1, stream_max.nextTree());

                    	        adaptor.addChild(root_0, root_1);
                    	        }

                    	    }


                    	    retval.tree = root_0;
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop45;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // IdentifiersParser.g:400:7: ( KW_EXISTS LPAREN KW_SELECT )=> ( KW_EXISTS subQueryExpression )
                    {
                    // IdentifiersParser.g:400:38: ( KW_EXISTS subQueryExpression )
                    // IdentifiersParser.g:400:39: KW_EXISTS subQueryExpression
                    {
                    KW_EXISTS212=(Token)match(input,KW_EXISTS,FOLLOW_KW_EXISTS_in_precedenceEqualExpression2790); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_EXISTS.add(KW_EXISTS212);


                    pushFollow(FOLLOW_subQueryExpression_in_precedenceEqualExpression2792);
                    subQueryExpression213=subQueryExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_subQueryExpression.add(subQueryExpression213.getTree());

                    }


                    // AST REWRITE
                    // elements: subQueryExpression, KW_EXISTS
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 400:69: -> ^( TOK_SUBQUERY_EXPR ^( TOK_SUBQUERY_OP KW_EXISTS ) subQueryExpression )
                    {
                        // IdentifiersParser.g:400:72: ^( TOK_SUBQUERY_EXPR ^( TOK_SUBQUERY_OP KW_EXISTS ) subQueryExpression )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(TOK_SUBQUERY_EXPR, "TOK_SUBQUERY_EXPR")
                        , root_1);

                        // IdentifiersParser.g:400:92: ^( TOK_SUBQUERY_OP KW_EXISTS )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(TOK_SUBQUERY_OP, "TOK_SUBQUERY_OP")
                        , root_2);

                        adaptor.addChild(root_2, 
                        stream_KW_EXISTS.nextNode()
                        );

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_1, stream_subQueryExpression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "precedenceEqualExpression"


    public static class expressions_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expressions"
    // IdentifiersParser.g:403:1: expressions : LPAREN expression ( COMMA expression )* RPAREN -> ( expression )* ;
    public final HiveParser_IdentifiersParser.expressions_return expressions() throws RecognitionException {
        HiveParser_IdentifiersParser.expressions_return retval = new HiveParser_IdentifiersParser.expressions_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token LPAREN214=null;
        Token COMMA216=null;
        Token RPAREN218=null;
        HiveParser_IdentifiersParser.expression_return expression215 =null;

        HiveParser_IdentifiersParser.expression_return expression217 =null;


        CommonTree LPAREN214_tree=null;
        CommonTree COMMA216_tree=null;
        CommonTree RPAREN218_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // IdentifiersParser.g:404:5: ( LPAREN expression ( COMMA expression )* RPAREN -> ( expression )* )
            // IdentifiersParser.g:405:5: LPAREN expression ( COMMA expression )* RPAREN
            {
            LPAREN214=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_expressions2828); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN214);


            pushFollow(FOLLOW_expression_in_expressions2830);
            expression215=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(expression215.getTree());

            // IdentifiersParser.g:405:23: ( COMMA expression )*
            loop47:
            do {
                int alt47=2;
                switch ( input.LA(1) ) {
                case COMMA:
                    {
                    alt47=1;
                    }
                    break;

                }

                switch (alt47) {
            	case 1 :
            	    // IdentifiersParser.g:405:24: COMMA expression
            	    {
            	    COMMA216=(Token)match(input,COMMA,FOLLOW_COMMA_in_expressions2833); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA216);


            	    pushFollow(FOLLOW_expression_in_expressions2835);
            	    expression217=expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_expression.add(expression217.getTree());

            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);


            RPAREN218=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_expressions2839); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN218);


            // AST REWRITE
            // elements: expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 405:50: -> ( expression )*
            {
                // IdentifiersParser.g:405:53: ( expression )*
                while ( stream_expression.hasNext() ) {
                    adaptor.addChild(root_0, stream_expression.nextTree());

                }
                stream_expression.reset();

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expressions"


    public static class precedenceNotOperator_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "precedenceNotOperator"
    // IdentifiersParser.g:408:1: precedenceNotOperator : KW_NOT ;
    public final HiveParser_IdentifiersParser.precedenceNotOperator_return precedenceNotOperator() throws RecognitionException {
        HiveParser_IdentifiersParser.precedenceNotOperator_return retval = new HiveParser_IdentifiersParser.precedenceNotOperator_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token KW_NOT219=null;

        CommonTree KW_NOT219_tree=null;

        try {
            // IdentifiersParser.g:409:5: ( KW_NOT )
            // IdentifiersParser.g:410:5: KW_NOT
            {
            root_0 = (CommonTree)adaptor.nil();


            KW_NOT219=(Token)match(input,KW_NOT,FOLLOW_KW_NOT_in_precedenceNotOperator2865); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            KW_NOT219_tree = 
            (CommonTree)adaptor.create(KW_NOT219)
            ;
            adaptor.addChild(root_0, KW_NOT219_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "precedenceNotOperator"


    public static class precedenceNotExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "precedenceNotExpression"
    // IdentifiersParser.g:413:1: precedenceNotExpression : ( precedenceNotOperator ^)* precedenceEqualExpression ;
    public final HiveParser_IdentifiersParser.precedenceNotExpression_return precedenceNotExpression() throws RecognitionException {
        HiveParser_IdentifiersParser.precedenceNotExpression_return retval = new HiveParser_IdentifiersParser.precedenceNotExpression_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        HiveParser_IdentifiersParser.precedenceNotOperator_return precedenceNotOperator220 =null;

        HiveParser_IdentifiersParser.precedenceEqualExpression_return precedenceEqualExpression221 =null;



        try {
            // IdentifiersParser.g:414:5: ( ( precedenceNotOperator ^)* precedenceEqualExpression )
            // IdentifiersParser.g:415:5: ( precedenceNotOperator ^)* precedenceEqualExpression
            {
            root_0 = (CommonTree)adaptor.nil();


            // IdentifiersParser.g:415:5: ( precedenceNotOperator ^)*
            loop48:
            do {
                int alt48=2;
                switch ( input.LA(1) ) {
                case KW_NOT:
                    {
                    alt48=1;
                    }
                    break;

                }

                switch (alt48) {
            	case 1 :
            	    // IdentifiersParser.g:415:6: precedenceNotOperator ^
            	    {
            	    pushFollow(FOLLOW_precedenceNotOperator_in_precedenceNotExpression2887);
            	    precedenceNotOperator220=precedenceNotOperator();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(precedenceNotOperator220.getTree(), root_0);

            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);


            pushFollow(FOLLOW_precedenceEqualExpression_in_precedenceNotExpression2892);
            precedenceEqualExpression221=precedenceEqualExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, precedenceEqualExpression221.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "precedenceNotExpression"


    public static class precedenceAndOperator_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "precedenceAndOperator"
    // IdentifiersParser.g:419:1: precedenceAndOperator : KW_AND ;
    public final HiveParser_IdentifiersParser.precedenceAndOperator_return precedenceAndOperator() throws RecognitionException {
        HiveParser_IdentifiersParser.precedenceAndOperator_return retval = new HiveParser_IdentifiersParser.precedenceAndOperator_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token KW_AND222=null;

        CommonTree KW_AND222_tree=null;

        try {
            // IdentifiersParser.g:420:5: ( KW_AND )
            // IdentifiersParser.g:421:5: KW_AND
            {
            root_0 = (CommonTree)adaptor.nil();


            KW_AND222=(Token)match(input,KW_AND,FOLLOW_KW_AND_in_precedenceAndOperator2914); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            KW_AND222_tree = 
            (CommonTree)adaptor.create(KW_AND222)
            ;
            adaptor.addChild(root_0, KW_AND222_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "precedenceAndOperator"


    public static class precedenceAndExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "precedenceAndExpression"
    // IdentifiersParser.g:424:1: precedenceAndExpression : precedenceNotExpression ( precedenceAndOperator ^ precedenceNotExpression )* ;
    public final HiveParser_IdentifiersParser.precedenceAndExpression_return precedenceAndExpression() throws RecognitionException {
        HiveParser_IdentifiersParser.precedenceAndExpression_return retval = new HiveParser_IdentifiersParser.precedenceAndExpression_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        HiveParser_IdentifiersParser.precedenceNotExpression_return precedenceNotExpression223 =null;

        HiveParser_IdentifiersParser.precedenceAndOperator_return precedenceAndOperator224 =null;

        HiveParser_IdentifiersParser.precedenceNotExpression_return precedenceNotExpression225 =null;



        try {
            // IdentifiersParser.g:425:5: ( precedenceNotExpression ( precedenceAndOperator ^ precedenceNotExpression )* )
            // IdentifiersParser.g:426:5: precedenceNotExpression ( precedenceAndOperator ^ precedenceNotExpression )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_precedenceNotExpression_in_precedenceAndExpression2935);
            precedenceNotExpression223=precedenceNotExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, precedenceNotExpression223.getTree());

            // IdentifiersParser.g:426:29: ( precedenceAndOperator ^ precedenceNotExpression )*
            loop49:
            do {
                int alt49=2;
                switch ( input.LA(1) ) {
                case KW_AND:
                    {
                    alt49=1;
                    }
                    break;

                }

                switch (alt49) {
            	case 1 :
            	    // IdentifiersParser.g:426:30: precedenceAndOperator ^ precedenceNotExpression
            	    {
            	    pushFollow(FOLLOW_precedenceAndOperator_in_precedenceAndExpression2938);
            	    precedenceAndOperator224=precedenceAndOperator();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(precedenceAndOperator224.getTree(), root_0);

            	    pushFollow(FOLLOW_precedenceNotExpression_in_precedenceAndExpression2941);
            	    precedenceNotExpression225=precedenceNotExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, precedenceNotExpression225.getTree());

            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "precedenceAndExpression"


    public static class precedenceOrOperator_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "precedenceOrOperator"
    // IdentifiersParser.g:430:1: precedenceOrOperator : KW_OR ;
    public final HiveParser_IdentifiersParser.precedenceOrOperator_return precedenceOrOperator() throws RecognitionException {
        HiveParser_IdentifiersParser.precedenceOrOperator_return retval = new HiveParser_IdentifiersParser.precedenceOrOperator_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token KW_OR226=null;

        CommonTree KW_OR226_tree=null;

        try {
            // IdentifiersParser.g:431:5: ( KW_OR )
            // IdentifiersParser.g:432:5: KW_OR
            {
            root_0 = (CommonTree)adaptor.nil();


            KW_OR226=(Token)match(input,KW_OR,FOLLOW_KW_OR_in_precedenceOrOperator2965); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            KW_OR226_tree = 
            (CommonTree)adaptor.create(KW_OR226)
            ;
            adaptor.addChild(root_0, KW_OR226_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "precedenceOrOperator"


    public static class precedenceOrExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "precedenceOrExpression"
    // IdentifiersParser.g:435:1: precedenceOrExpression : precedenceAndExpression ( precedenceOrOperator ^ precedenceAndExpression )* ;
    public final HiveParser_IdentifiersParser.precedenceOrExpression_return precedenceOrExpression() throws RecognitionException {
        HiveParser_IdentifiersParser.precedenceOrExpression_return retval = new HiveParser_IdentifiersParser.precedenceOrExpression_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        HiveParser_IdentifiersParser.precedenceAndExpression_return precedenceAndExpression227 =null;

        HiveParser_IdentifiersParser.precedenceOrOperator_return precedenceOrOperator228 =null;

        HiveParser_IdentifiersParser.precedenceAndExpression_return precedenceAndExpression229 =null;



        try {
            // IdentifiersParser.g:436:5: ( precedenceAndExpression ( precedenceOrOperator ^ precedenceAndExpression )* )
            // IdentifiersParser.g:437:5: precedenceAndExpression ( precedenceOrOperator ^ precedenceAndExpression )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_precedenceAndExpression_in_precedenceOrExpression2986);
            precedenceAndExpression227=precedenceAndExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, precedenceAndExpression227.getTree());

            // IdentifiersParser.g:437:29: ( precedenceOrOperator ^ precedenceAndExpression )*
            loop50:
            do {
                int alt50=2;
                switch ( input.LA(1) ) {
                case KW_OR:
                    {
                    alt50=1;
                    }
                    break;

                }

                switch (alt50) {
            	case 1 :
            	    // IdentifiersParser.g:437:30: precedenceOrOperator ^ precedenceAndExpression
            	    {
            	    pushFollow(FOLLOW_precedenceOrOperator_in_precedenceOrExpression2989);
            	    precedenceOrOperator228=precedenceOrOperator();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(precedenceOrOperator228.getTree(), root_0);

            	    pushFollow(FOLLOW_precedenceAndExpression_in_precedenceOrExpression2992);
            	    precedenceAndExpression229=precedenceAndExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, precedenceAndExpression229.getTree());

            	    }
            	    break;

            	default :
            	    break loop50;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "precedenceOrExpression"


    public static class booleanValue_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "booleanValue"
    // IdentifiersParser.g:441:1: booleanValue : ( KW_TRUE ^| KW_FALSE ^);
    public final HiveParser_IdentifiersParser.booleanValue_return booleanValue() throws RecognitionException {
        HiveParser_IdentifiersParser.booleanValue_return retval = new HiveParser_IdentifiersParser.booleanValue_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token KW_TRUE230=null;
        Token KW_FALSE231=null;

        CommonTree KW_TRUE230_tree=null;
        CommonTree KW_FALSE231_tree=null;

        try {
            // IdentifiersParser.g:442:5: ( KW_TRUE ^| KW_FALSE ^)
            int alt51=2;
            switch ( input.LA(1) ) {
            case KW_TRUE:
                {
                alt51=1;
                }
                break;
            case KW_FALSE:
                {
                alt51=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;

            }

            switch (alt51) {
                case 1 :
                    // IdentifiersParser.g:443:5: KW_TRUE ^
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    KW_TRUE230=(Token)match(input,KW_TRUE,FOLLOW_KW_TRUE_in_booleanValue3016); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    KW_TRUE230_tree = 
                    (CommonTree)adaptor.create(KW_TRUE230)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(KW_TRUE230_tree, root_0);
                    }

                    }
                    break;
                case 2 :
                    // IdentifiersParser.g:443:16: KW_FALSE ^
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    KW_FALSE231=(Token)match(input,KW_FALSE,FOLLOW_KW_FALSE_in_booleanValue3021); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    KW_FALSE231_tree = 
                    (CommonTree)adaptor.create(KW_FALSE231)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(KW_FALSE231_tree, root_0);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "booleanValue"


    public static class tableOrPartition_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "tableOrPartition"
    // IdentifiersParser.g:446:1: tableOrPartition : tableName ( partitionSpec )? -> ^( TOK_TAB tableName ( partitionSpec )? ) ;
    public final HiveParser_IdentifiersParser.tableOrPartition_return tableOrPartition() throws RecognitionException {
        HiveParser_IdentifiersParser.tableOrPartition_return retval = new HiveParser_IdentifiersParser.tableOrPartition_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        HiveParser_FromClauseParser.tableName_return tableName232 =null;

        HiveParser_IdentifiersParser.partitionSpec_return partitionSpec233 =null;


        RewriteRuleSubtreeStream stream_tableName=new RewriteRuleSubtreeStream(adaptor,"rule tableName");
        RewriteRuleSubtreeStream stream_partitionSpec=new RewriteRuleSubtreeStream(adaptor,"rule partitionSpec");
        try {
            // IdentifiersParser.g:447:4: ( tableName ( partitionSpec )? -> ^( TOK_TAB tableName ( partitionSpec )? ) )
            // IdentifiersParser.g:448:4: tableName ( partitionSpec )?
            {
            pushFollow(FOLLOW_tableName_in_tableOrPartition3041);
            tableName232=gHiveParser.tableName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_tableName.add(tableName232.getTree());

            // IdentifiersParser.g:448:14: ( partitionSpec )?
            int alt52=2;
            switch ( input.LA(1) ) {
                case KW_PARTITION:
                    {
                    alt52=1;
                    }
                    break;
            }

            switch (alt52) {
                case 1 :
                    // IdentifiersParser.g:448:14: partitionSpec
                    {
                    pushFollow(FOLLOW_partitionSpec_in_tableOrPartition3043);
                    partitionSpec233=partitionSpec();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_partitionSpec.add(partitionSpec233.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: partitionSpec, tableName
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 448:29: -> ^( TOK_TAB tableName ( partitionSpec )? )
            {
                // IdentifiersParser.g:448:32: ^( TOK_TAB tableName ( partitionSpec )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(TOK_TAB, "TOK_TAB")
                , root_1);

                adaptor.addChild(root_1, stream_tableName.nextTree());

                // IdentifiersParser.g:448:52: ( partitionSpec )?
                if ( stream_partitionSpec.hasNext() ) {
                    adaptor.addChild(root_1, stream_partitionSpec.nextTree());

                }
                stream_partitionSpec.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "tableOrPartition"


    public static class partitionSpec_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "partitionSpec"
    // IdentifiersParser.g:451:1: partitionSpec : KW_PARTITION LPAREN partitionVal ( COMMA partitionVal )* RPAREN -> ^( TOK_PARTSPEC ( partitionVal )+ ) ;
    public final HiveParser_IdentifiersParser.partitionSpec_return partitionSpec() throws RecognitionException {
        HiveParser_IdentifiersParser.partitionSpec_return retval = new HiveParser_IdentifiersParser.partitionSpec_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token KW_PARTITION234=null;
        Token LPAREN235=null;
        Token COMMA237=null;
        Token RPAREN239=null;
        HiveParser_IdentifiersParser.partitionVal_return partitionVal236 =null;

        HiveParser_IdentifiersParser.partitionVal_return partitionVal238 =null;


        CommonTree KW_PARTITION234_tree=null;
        CommonTree LPAREN235_tree=null;
        CommonTree COMMA237_tree=null;
        CommonTree RPAREN239_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_KW_PARTITION=new RewriteRuleTokenStream(adaptor,"token KW_PARTITION");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_partitionVal=new RewriteRuleSubtreeStream(adaptor,"rule partitionVal");
        try {
            // IdentifiersParser.g:452:5: ( KW_PARTITION LPAREN partitionVal ( COMMA partitionVal )* RPAREN -> ^( TOK_PARTSPEC ( partitionVal )+ ) )
            // IdentifiersParser.g:453:5: KW_PARTITION LPAREN partitionVal ( COMMA partitionVal )* RPAREN
            {
            KW_PARTITION234=(Token)match(input,KW_PARTITION,FOLLOW_KW_PARTITION_in_partitionSpec3075); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_PARTITION.add(KW_PARTITION234);


            LPAREN235=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_partitionSpec3082); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN235);


            pushFollow(FOLLOW_partitionVal_in_partitionSpec3084);
            partitionVal236=partitionVal();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_partitionVal.add(partitionVal236.getTree());

            // IdentifiersParser.g:454:26: ( COMMA partitionVal )*
            loop53:
            do {
                int alt53=2;
                switch ( input.LA(1) ) {
                case COMMA:
                    {
                    alt53=1;
                    }
                    break;

                }

                switch (alt53) {
            	case 1 :
            	    // IdentifiersParser.g:454:27: COMMA partitionVal
            	    {
            	    COMMA237=(Token)match(input,COMMA,FOLLOW_COMMA_in_partitionSpec3087); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA237);


            	    pushFollow(FOLLOW_partitionVal_in_partitionSpec3090);
            	    partitionVal238=partitionVal();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_partitionVal.add(partitionVal238.getTree());

            	    }
            	    break;

            	default :
            	    break loop53;
                }
            } while (true);


            RPAREN239=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_partitionSpec3095); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN239);


            // AST REWRITE
            // elements: partitionVal
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 454:57: -> ^( TOK_PARTSPEC ( partitionVal )+ )
            {
                // IdentifiersParser.g:454:60: ^( TOK_PARTSPEC ( partitionVal )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(TOK_PARTSPEC, "TOK_PARTSPEC")
                , root_1);

                if ( !(stream_partitionVal.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_partitionVal.hasNext() ) {
                    adaptor.addChild(root_1, stream_partitionVal.nextTree());

                }
                stream_partitionVal.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "partitionSpec"


    public static class partitionVal_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "partitionVal"
    // IdentifiersParser.g:457:1: partitionVal : identifier ( EQUAL constant )? -> ^( TOK_PARTVAL identifier ( constant )? ) ;
    public final HiveParser_IdentifiersParser.partitionVal_return partitionVal() throws RecognitionException {
        HiveParser_IdentifiersParser.partitionVal_return retval = new HiveParser_IdentifiersParser.partitionVal_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token EQUAL241=null;
        HiveParser_IdentifiersParser.identifier_return identifier240 =null;

        HiveParser_IdentifiersParser.constant_return constant242 =null;


        CommonTree EQUAL241_tree=null;
        RewriteRuleTokenStream stream_EQUAL=new RewriteRuleTokenStream(adaptor,"token EQUAL");
        RewriteRuleSubtreeStream stream_constant=new RewriteRuleSubtreeStream(adaptor,"rule constant");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // IdentifiersParser.g:458:5: ( identifier ( EQUAL constant )? -> ^( TOK_PARTVAL identifier ( constant )? ) )
            // IdentifiersParser.g:459:5: identifier ( EQUAL constant )?
            {
            pushFollow(FOLLOW_identifier_in_partitionVal3126);
            identifier240=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier240.getTree());

            // IdentifiersParser.g:459:16: ( EQUAL constant )?
            int alt54=2;
            switch ( input.LA(1) ) {
                case EQUAL:
                    {
                    alt54=1;
                    }
                    break;
            }

            switch (alt54) {
                case 1 :
                    // IdentifiersParser.g:459:17: EQUAL constant
                    {
                    EQUAL241=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_partitionVal3129); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EQUAL.add(EQUAL241);


                    pushFollow(FOLLOW_constant_in_partitionVal3131);
                    constant242=constant();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_constant.add(constant242.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: constant, identifier
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 459:34: -> ^( TOK_PARTVAL identifier ( constant )? )
            {
                // IdentifiersParser.g:459:37: ^( TOK_PARTVAL identifier ( constant )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(TOK_PARTVAL, "TOK_PARTVAL")
                , root_1);

                adaptor.addChild(root_1, stream_identifier.nextTree());

                // IdentifiersParser.g:459:62: ( constant )?
                if ( stream_constant.hasNext() ) {
                    adaptor.addChild(root_1, stream_constant.nextTree());

                }
                stream_constant.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "partitionVal"


    public static class dropPartitionSpec_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "dropPartitionSpec"
    // IdentifiersParser.g:462:1: dropPartitionSpec : KW_PARTITION LPAREN dropPartitionVal ( COMMA dropPartitionVal )* RPAREN -> ^( TOK_PARTSPEC ( dropPartitionVal )+ ) ;
    public final HiveParser_IdentifiersParser.dropPartitionSpec_return dropPartitionSpec() throws RecognitionException {
        HiveParser_IdentifiersParser.dropPartitionSpec_return retval = new HiveParser_IdentifiersParser.dropPartitionSpec_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token KW_PARTITION243=null;
        Token LPAREN244=null;
        Token COMMA246=null;
        Token RPAREN248=null;
        HiveParser_IdentifiersParser.dropPartitionVal_return dropPartitionVal245 =null;

        HiveParser_IdentifiersParser.dropPartitionVal_return dropPartitionVal247 =null;


        CommonTree KW_PARTITION243_tree=null;
        CommonTree LPAREN244_tree=null;
        CommonTree COMMA246_tree=null;
        CommonTree RPAREN248_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_KW_PARTITION=new RewriteRuleTokenStream(adaptor,"token KW_PARTITION");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_dropPartitionVal=new RewriteRuleSubtreeStream(adaptor,"rule dropPartitionVal");
        try {
            // IdentifiersParser.g:463:5: ( KW_PARTITION LPAREN dropPartitionVal ( COMMA dropPartitionVal )* RPAREN -> ^( TOK_PARTSPEC ( dropPartitionVal )+ ) )
            // IdentifiersParser.g:464:5: KW_PARTITION LPAREN dropPartitionVal ( COMMA dropPartitionVal )* RPAREN
            {
            KW_PARTITION243=(Token)match(input,KW_PARTITION,FOLLOW_KW_PARTITION_in_dropPartitionSpec3165); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_PARTITION.add(KW_PARTITION243);


            LPAREN244=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_dropPartitionSpec3172); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN244);


            pushFollow(FOLLOW_dropPartitionVal_in_dropPartitionSpec3174);
            dropPartitionVal245=dropPartitionVal();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_dropPartitionVal.add(dropPartitionVal245.getTree());

            // IdentifiersParser.g:465:30: ( COMMA dropPartitionVal )*
            loop55:
            do {
                int alt55=2;
                switch ( input.LA(1) ) {
                case COMMA:
                    {
                    alt55=1;
                    }
                    break;

                }

                switch (alt55) {
            	case 1 :
            	    // IdentifiersParser.g:465:31: COMMA dropPartitionVal
            	    {
            	    COMMA246=(Token)match(input,COMMA,FOLLOW_COMMA_in_dropPartitionSpec3177); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA246);


            	    pushFollow(FOLLOW_dropPartitionVal_in_dropPartitionSpec3180);
            	    dropPartitionVal247=dropPartitionVal();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_dropPartitionVal.add(dropPartitionVal247.getTree());

            	    }
            	    break;

            	default :
            	    break loop55;
                }
            } while (true);


            RPAREN248=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_dropPartitionSpec3185); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN248);


            // AST REWRITE
            // elements: dropPartitionVal
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 465:65: -> ^( TOK_PARTSPEC ( dropPartitionVal )+ )
            {
                // IdentifiersParser.g:465:68: ^( TOK_PARTSPEC ( dropPartitionVal )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(TOK_PARTSPEC, "TOK_PARTSPEC")
                , root_1);

                if ( !(stream_dropPartitionVal.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_dropPartitionVal.hasNext() ) {
                    adaptor.addChild(root_1, stream_dropPartitionVal.nextTree());

                }
                stream_dropPartitionVal.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "dropPartitionSpec"


    public static class dropPartitionVal_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "dropPartitionVal"
    // IdentifiersParser.g:468:1: dropPartitionVal : identifier dropPartitionOperator constant -> ^( TOK_PARTVAL identifier dropPartitionOperator constant ) ;
    public final HiveParser_IdentifiersParser.dropPartitionVal_return dropPartitionVal() throws RecognitionException {
        HiveParser_IdentifiersParser.dropPartitionVal_return retval = new HiveParser_IdentifiersParser.dropPartitionVal_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        HiveParser_IdentifiersParser.identifier_return identifier249 =null;

        HiveParser_IdentifiersParser.dropPartitionOperator_return dropPartitionOperator250 =null;

        HiveParser_IdentifiersParser.constant_return constant251 =null;


        RewriteRuleSubtreeStream stream_dropPartitionOperator=new RewriteRuleSubtreeStream(adaptor,"rule dropPartitionOperator");
        RewriteRuleSubtreeStream stream_constant=new RewriteRuleSubtreeStream(adaptor,"rule constant");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // IdentifiersParser.g:469:5: ( identifier dropPartitionOperator constant -> ^( TOK_PARTVAL identifier dropPartitionOperator constant ) )
            // IdentifiersParser.g:470:5: identifier dropPartitionOperator constant
            {
            pushFollow(FOLLOW_identifier_in_dropPartitionVal3216);
            identifier249=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier249.getTree());

            pushFollow(FOLLOW_dropPartitionOperator_in_dropPartitionVal3218);
            dropPartitionOperator250=dropPartitionOperator();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_dropPartitionOperator.add(dropPartitionOperator250.getTree());

            pushFollow(FOLLOW_constant_in_dropPartitionVal3220);
            constant251=constant();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_constant.add(constant251.getTree());

            // AST REWRITE
            // elements: constant, identifier, dropPartitionOperator
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 470:47: -> ^( TOK_PARTVAL identifier dropPartitionOperator constant )
            {
                // IdentifiersParser.g:470:50: ^( TOK_PARTVAL identifier dropPartitionOperator constant )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(TOK_PARTVAL, "TOK_PARTVAL")
                , root_1);

                adaptor.addChild(root_1, stream_identifier.nextTree());

                adaptor.addChild(root_1, stream_dropPartitionOperator.nextTree());

                adaptor.addChild(root_1, stream_constant.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "dropPartitionVal"


    public static class dropPartitionOperator_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "dropPartitionOperator"
    // IdentifiersParser.g:473:1: dropPartitionOperator : ( EQUAL | NOTEQUAL | LESSTHANOREQUALTO | LESSTHAN | GREATERTHANOREQUALTO | GREATERTHAN );
    public final HiveParser_IdentifiersParser.dropPartitionOperator_return dropPartitionOperator() throws RecognitionException {
        HiveParser_IdentifiersParser.dropPartitionOperator_return retval = new HiveParser_IdentifiersParser.dropPartitionOperator_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set252=null;

        CommonTree set252_tree=null;

        try {
            // IdentifiersParser.g:474:5: ( EQUAL | NOTEQUAL | LESSTHANOREQUALTO | LESSTHAN | GREATERTHANOREQUALTO | GREATERTHAN )
            // IdentifiersParser.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            set252=(Token)input.LT(1);

            if ( input.LA(1)==EQUAL||(input.LA(1) >= GREATERTHAN && input.LA(1) <= GREATERTHANOREQUALTO)||(input.LA(1) >= LESSTHAN && input.LA(1) <= LESSTHANOREQUALTO)||input.LA(1)==NOTEQUAL ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(set252)
                );
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "dropPartitionOperator"


    public static class sysFuncNames_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "sysFuncNames"
    // IdentifiersParser.g:478:1: sysFuncNames : ( KW_AND | KW_OR | KW_NOT | KW_LIKE | KW_IF | KW_CASE | KW_WHEN | KW_TINYINT | KW_SMALLINT | KW_INT | KW_BIGINT | KW_FLOAT | KW_DOUBLE | KW_BOOLEAN | KW_STRING | KW_BINARY | KW_ARRAY | KW_MAP | KW_STRUCT | KW_UNIONTYPE | EQUAL | EQUAL_NS | NOTEQUAL | LESSTHANOREQUALTO | LESSTHAN | GREATERTHANOREQUALTO | GREATERTHAN | DIVIDE | PLUS | MINUS | STAR | MOD | DIV | AMPERSAND | TILDE | BITWISEOR | BITWISEXOR | KW_RLIKE | KW_REGEXP | KW_IN | KW_BETWEEN );
    public final HiveParser_IdentifiersParser.sysFuncNames_return sysFuncNames() throws RecognitionException {
        HiveParser_IdentifiersParser.sysFuncNames_return retval = new HiveParser_IdentifiersParser.sysFuncNames_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set253=null;

        CommonTree set253_tree=null;

        try {
            // IdentifiersParser.g:479:5: ( KW_AND | KW_OR | KW_NOT | KW_LIKE | KW_IF | KW_CASE | KW_WHEN | KW_TINYINT | KW_SMALLINT | KW_INT | KW_BIGINT | KW_FLOAT | KW_DOUBLE | KW_BOOLEAN | KW_STRING | KW_BINARY | KW_ARRAY | KW_MAP | KW_STRUCT | KW_UNIONTYPE | EQUAL | EQUAL_NS | NOTEQUAL | LESSTHANOREQUALTO | LESSTHAN | GREATERTHANOREQUALTO | GREATERTHAN | DIVIDE | PLUS | MINUS | STAR | MOD | DIV | AMPERSAND | TILDE | BITWISEOR | BITWISEXOR | KW_RLIKE | KW_REGEXP | KW_IN | KW_BETWEEN )
            // IdentifiersParser.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            set253=(Token)input.LT(1);

            if ( (input.LA(1) >= AMPERSAND && input.LA(1) <= BITWISEXOR)||(input.LA(1) >= DIV && input.LA(1) <= DIVIDE)||(input.LA(1) >= EQUAL && input.LA(1) <= EQUAL_NS)||(input.LA(1) >= GREATERTHAN && input.LA(1) <= GREATERTHANOREQUALTO)||input.LA(1)==KW_AND||input.LA(1)==KW_ARRAY||(input.LA(1) >= KW_BETWEEN && input.LA(1) <= KW_BOOLEAN)||input.LA(1)==KW_CASE||input.LA(1)==KW_DOUBLE||input.LA(1)==KW_FLOAT||input.LA(1)==KW_IF||input.LA(1)==KW_IN||input.LA(1)==KW_INT||input.LA(1)==KW_LIKE||input.LA(1)==KW_MAP||input.LA(1)==KW_NOT||input.LA(1)==KW_OR||input.LA(1)==KW_REGEXP||input.LA(1)==KW_RLIKE||input.LA(1)==KW_SMALLINT||(input.LA(1) >= KW_STRING && input.LA(1) <= KW_STRUCT)||input.LA(1)==KW_TINYINT||input.LA(1)==KW_UNIONTYPE||input.LA(1)==KW_WHEN||(input.LA(1) >= LESSTHAN && input.LA(1) <= LESSTHANOREQUALTO)||(input.LA(1) >= MINUS && input.LA(1) <= NOTEQUAL)||input.LA(1)==PLUS||input.LA(1)==STAR||input.LA(1)==TILDE ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(set253)
                );
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "sysFuncNames"


    public static class descFuncNames_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "descFuncNames"
    // IdentifiersParser.g:523:1: descFuncNames : ( sysFuncNames | StringLiteral | functionIdentifier );
    public final HiveParser_IdentifiersParser.descFuncNames_return descFuncNames() throws RecognitionException {
        HiveParser_IdentifiersParser.descFuncNames_return retval = new HiveParser_IdentifiersParser.descFuncNames_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token StringLiteral255=null;
        HiveParser_IdentifiersParser.sysFuncNames_return sysFuncNames254 =null;

        HiveParser_IdentifiersParser.functionIdentifier_return functionIdentifier256 =null;


        CommonTree StringLiteral255_tree=null;

        try {
            // IdentifiersParser.g:524:5: ( sysFuncNames | StringLiteral | functionIdentifier )
            int alt56=3;
            switch ( input.LA(1) ) {
            case AMPERSAND:
            case BITWISEOR:
            case BITWISEXOR:
            case DIV:
            case DIVIDE:
            case EQUAL:
            case EQUAL_NS:
            case GREATERTHAN:
            case GREATERTHANOREQUALTO:
            case KW_AND:
            case KW_ARRAY:
            case KW_BETWEEN:
            case KW_BIGINT:
            case KW_BINARY:
            case KW_BOOLEAN:
            case KW_CASE:
            case KW_DOUBLE:
            case KW_FLOAT:
            case KW_IF:
            case KW_IN:
            case KW_INT:
            case KW_LIKE:
            case KW_MAP:
            case KW_NOT:
            case KW_OR:
            case KW_REGEXP:
            case KW_RLIKE:
            case KW_SMALLINT:
            case KW_STRING:
            case KW_STRUCT:
            case KW_TINYINT:
            case KW_UNIONTYPE:
            case KW_WHEN:
            case LESSTHAN:
            case LESSTHANOREQUALTO:
            case MINUS:
            case MOD:
            case NOTEQUAL:
            case PLUS:
            case STAR:
            case TILDE:
                {
                alt56=1;
                }
                break;
            case StringLiteral:
                {
                alt56=2;
                }
                break;
            case Identifier:
            case KW_ADD:
            case KW_ADMIN:
            case KW_AFTER:
            case KW_ALL:
            case KW_ALTER:
            case KW_ANALYZE:
            case KW_ARCHIVE:
            case KW_AS:
            case KW_ASC:
            case KW_BEFORE:
            case KW_BOTH:
            case KW_BUCKET:
            case KW_BUCKETS:
            case KW_BY:
            case KW_CASCADE:
            case KW_CHANGE:
            case KW_CLUSTER:
            case KW_CLUSTERED:
            case KW_CLUSTERSTATUS:
            case KW_COLLECTION:
            case KW_COLUMNS:
            case KW_COMMENT:
            case KW_COMPACT:
            case KW_COMPACTIONS:
            case KW_COMPUTE:
            case KW_CONCATENATE:
            case KW_CONTINUE:
            case KW_CREATE:
            case KW_CUBE:
            case KW_CURSOR:
            case KW_DATA:
            case KW_DATABASES:
            case KW_DATE:
            case KW_DATETIME:
            case KW_DBPROPERTIES:
            case KW_DECIMAL:
            case KW_DEFAULT:
            case KW_DEFERRED:
            case KW_DEFINED:
            case KW_DELETE:
            case KW_DELIMITED:
            case KW_DEPENDENCY:
            case KW_DESC:
            case KW_DESCRIBE:
            case KW_DIRECTORIES:
            case KW_DIRECTORY:
            case KW_DISABLE:
            case KW_DISTRIBUTE:
            case KW_DROP:
            case KW_ELEM_TYPE:
            case KW_ENABLE:
            case KW_ESCAPED:
            case KW_EXCLUSIVE:
            case KW_EXISTS:
            case KW_EXPLAIN:
            case KW_EXPORT:
            case KW_EXTERNAL:
            case KW_FALSE:
            case KW_FETCH:
            case KW_FIELDS:
            case KW_FILE:
            case KW_FILEFORMAT:
            case KW_FIRST:
            case KW_FOR:
            case KW_FORMAT:
            case KW_FORMATTED:
            case KW_FULL:
            case KW_FUNCTIONS:
            case KW_GRANT:
            case KW_GROUP:
            case KW_GROUPING:
            case KW_HOLD_DDLTIME:
            case KW_IDXPROPERTIES:
            case KW_IGNORE:
            case KW_IMPORT:
            case KW_INDEX:
            case KW_INDEXES:
            case KW_INNER:
            case KW_INPATH:
            case KW_INPUTDRIVER:
            case KW_INPUTFORMAT:
            case KW_INSERT:
            case KW_INTERSECT:
            case KW_INTO:
            case KW_IS:
            case KW_ITEMS:
            case KW_JAR:
            case KW_KEYS:
            case KW_KEY_TYPE:
            case KW_LATERAL:
            case KW_LEFT:
            case KW_LIMIT:
            case KW_LINES:
            case KW_LOAD:
            case KW_LOCAL:
            case KW_LOCATION:
            case KW_LOCK:
            case KW_LOCKS:
            case KW_LOGICAL:
            case KW_LONG:
            case KW_MAPJOIN:
            case KW_MATERIALIZED:
            case KW_MINUS:
            case KW_MSCK:
            case KW_NONE:
            case KW_NOSCAN:
            case KW_NO_DROP:
            case KW_NULL:
            case KW_OF:
            case KW_OFFLINE:
            case KW_OPTION:
            case KW_ORCFILE:
            case KW_ORDER:
            case KW_OUT:
            case KW_OUTER:
            case KW_OUTPUTDRIVER:
            case KW_OUTPUTFORMAT:
            case KW_OVERWRITE:
            case KW_OWNER:
            case KW_PARQUETFILE:
            case KW_PARTITION:
            case KW_PARTITIONED:
            case KW_PARTITIONS:
            case KW_PERCENT:
            case KW_PLUS:
            case KW_PRETTY:
            case KW_PRINCIPALS:
            case KW_PROCEDURE:
            case KW_PROTECTION:
            case KW_PURGE:
            case KW_RANGE:
            case KW_RCFILE:
            case KW_READ:
            case KW_READONLY:
            case KW_READS:
            case KW_REBUILD:
            case KW_RECORDREADER:
            case KW_RECORDWRITER:
            case KW_RENAME:
            case KW_REPAIR:
            case KW_REPLACE:
            case KW_RESTRICT:
            case KW_REVOKE:
            case KW_RIGHT:
            case KW_ROLE:
            case KW_ROLES:
            case KW_ROLLUP:
            case KW_ROW:
            case KW_ROWS:
            case KW_SCHEMA:
            case KW_SCHEMAS:
            case KW_SEMI:
            case KW_SEQUENCEFILE:
            case KW_SERDE:
            case KW_SERDEPROPERTIES:
            case KW_SET:
            case KW_SETS:
            case KW_SHARED:
            case KW_SHOW:
            case KW_SHOW_DATABASE:
            case KW_SKEWED:
            case KW_SORT:
            case KW_SORTED:
            case KW_SSL:
            case KW_STATISTICS:
            case KW_STORED:
            case KW_STREAMTABLE:
            case KW_TABLE:
            case KW_TABLES:
            case KW_TBLPROPERTIES:
            case KW_TEMPORARY:
            case KW_TERMINATED:
            case KW_TEXTFILE:
            case KW_TIMESTAMP:
            case KW_TO:
            case KW_TOUCH:
            case KW_TRANSACTIONS:
            case KW_TRIGGER:
            case KW_TRUE:
            case KW_TRUNCATE:
            case KW_UNARCHIVE:
            case KW_UNDO:
            case KW_UNION:
            case KW_UNLOCK:
            case KW_UNSET:
            case KW_UNSIGNED:
            case KW_UPDATE:
            case KW_USE:
            case KW_USER:
            case KW_USING:
            case KW_UTC:
            case KW_UTCTIMESTAMP:
            case KW_VALUE_TYPE:
            case KW_VIEW:
            case KW_WHILE:
            case KW_WITH:
                {
                alt56=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;

            }

            switch (alt56) {
                case 1 :
                    // IdentifiersParser.g:525:7: sysFuncNames
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_sysFuncNames_in_descFuncNames3639);
                    sysFuncNames254=sysFuncNames();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, sysFuncNames254.getTree());

                    }
                    break;
                case 2 :
                    // IdentifiersParser.g:526:7: StringLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    StringLiteral255=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_descFuncNames3647); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    StringLiteral255_tree = 
                    (CommonTree)adaptor.create(StringLiteral255)
                    ;
                    adaptor.addChild(root_0, StringLiteral255_tree);
                    }

                    }
                    break;
                case 3 :
                    // IdentifiersParser.g:527:7: functionIdentifier
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_functionIdentifier_in_descFuncNames3655);
                    functionIdentifier256=functionIdentifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, functionIdentifier256.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "descFuncNames"


    public static class identifier_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "identifier"
    // IdentifiersParser.g:530:1: identifier : ( Identifier | nonReserved -> Identifier[$nonReserved.text] );
    public final HiveParser_IdentifiersParser.identifier_return identifier() throws RecognitionException {
        HiveParser_IdentifiersParser.identifier_return retval = new HiveParser_IdentifiersParser.identifier_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token Identifier257=null;
        HiveParser_IdentifiersParser.nonReserved_return nonReserved258 =null;


        CommonTree Identifier257_tree=null;
        RewriteRuleSubtreeStream stream_nonReserved=new RewriteRuleSubtreeStream(adaptor,"rule nonReserved");
        try {
            // IdentifiersParser.g:531:5: ( Identifier | nonReserved -> Identifier[$nonReserved.text] )
            int alt57=2;
            switch ( input.LA(1) ) {
            case Identifier:
                {
                alt57=1;
                }
                break;
            case KW_ADD:
            case KW_ADMIN:
            case KW_AFTER:
            case KW_ALL:
            case KW_ALTER:
            case KW_ANALYZE:
            case KW_ARCHIVE:
            case KW_ARRAY:
            case KW_AS:
            case KW_ASC:
            case KW_BEFORE:
            case KW_BETWEEN:
            case KW_BIGINT:
            case KW_BINARY:
            case KW_BOOLEAN:
            case KW_BOTH:
            case KW_BUCKET:
            case KW_BUCKETS:
            case KW_BY:
            case KW_CASCADE:
            case KW_CHANGE:
            case KW_CLUSTER:
            case KW_CLUSTERED:
            case KW_CLUSTERSTATUS:
            case KW_COLLECTION:
            case KW_COLUMNS:
            case KW_COMMENT:
            case KW_COMPACT:
            case KW_COMPACTIONS:
            case KW_COMPUTE:
            case KW_CONCATENATE:
            case KW_CONTINUE:
            case KW_CREATE:
            case KW_CUBE:
            case KW_CURSOR:
            case KW_DATA:
            case KW_DATABASES:
            case KW_DATE:
            case KW_DATETIME:
            case KW_DBPROPERTIES:
            case KW_DECIMAL:
            case KW_DEFAULT:
            case KW_DEFERRED:
            case KW_DEFINED:
            case KW_DELETE:
            case KW_DELIMITED:
            case KW_DEPENDENCY:
            case KW_DESC:
            case KW_DESCRIBE:
            case KW_DIRECTORIES:
            case KW_DIRECTORY:
            case KW_DISABLE:
            case KW_DISTRIBUTE:
            case KW_DOUBLE:
            case KW_DROP:
            case KW_ELEM_TYPE:
            case KW_ENABLE:
            case KW_ESCAPED:
            case KW_EXCLUSIVE:
            case KW_EXISTS:
            case KW_EXPLAIN:
            case KW_EXPORT:
            case KW_EXTERNAL:
            case KW_FALSE:
            case KW_FETCH:
            case KW_FIELDS:
            case KW_FILE:
            case KW_FILEFORMAT:
            case KW_FIRST:
            case KW_FLOAT:
            case KW_FOR:
            case KW_FORMAT:
            case KW_FORMATTED:
            case KW_FULL:
            case KW_FUNCTIONS:
            case KW_GRANT:
            case KW_GROUP:
            case KW_GROUPING:
            case KW_HOLD_DDLTIME:
            case KW_IDXPROPERTIES:
            case KW_IGNORE:
            case KW_IMPORT:
            case KW_IN:
            case KW_INDEX:
            case KW_INDEXES:
            case KW_INNER:
            case KW_INPATH:
            case KW_INPUTDRIVER:
            case KW_INPUTFORMAT:
            case KW_INSERT:
            case KW_INT:
            case KW_INTERSECT:
            case KW_INTO:
            case KW_IS:
            case KW_ITEMS:
            case KW_JAR:
            case KW_KEYS:
            case KW_KEY_TYPE:
            case KW_LATERAL:
            case KW_LEFT:
            case KW_LIKE:
            case KW_LIMIT:
            case KW_LINES:
            case KW_LOAD:
            case KW_LOCAL:
            case KW_LOCATION:
            case KW_LOCK:
            case KW_LOCKS:
            case KW_LOGICAL:
            case KW_LONG:
            case KW_MAPJOIN:
            case KW_MATERIALIZED:
            case KW_MINUS:
            case KW_MSCK:
            case KW_NONE:
            case KW_NOSCAN:
            case KW_NO_DROP:
            case KW_NULL:
            case KW_OF:
            case KW_OFFLINE:
            case KW_OPTION:
            case KW_ORCFILE:
            case KW_ORDER:
            case KW_OUT:
            case KW_OUTER:
            case KW_OUTPUTDRIVER:
            case KW_OUTPUTFORMAT:
            case KW_OVERWRITE:
            case KW_OWNER:
            case KW_PARQUETFILE:
            case KW_PARTITION:
            case KW_PARTITIONED:
            case KW_PARTITIONS:
            case KW_PERCENT:
            case KW_PLUS:
            case KW_PRETTY:
            case KW_PRINCIPALS:
            case KW_PROCEDURE:
            case KW_PROTECTION:
            case KW_PURGE:
            case KW_RANGE:
            case KW_RCFILE:
            case KW_READ:
            case KW_READONLY:
            case KW_READS:
            case KW_REBUILD:
            case KW_RECORDREADER:
            case KW_RECORDWRITER:
            case KW_REGEXP:
            case KW_RENAME:
            case KW_REPAIR:
            case KW_REPLACE:
            case KW_RESTRICT:
            case KW_REVOKE:
            case KW_RIGHT:
            case KW_RLIKE:
            case KW_ROLE:
            case KW_ROLES:
            case KW_ROLLUP:
            case KW_ROW:
            case KW_ROWS:
            case KW_SCHEMA:
            case KW_SCHEMAS:
            case KW_SEMI:
            case KW_SEQUENCEFILE:
            case KW_SERDE:
            case KW_SERDEPROPERTIES:
            case KW_SET:
            case KW_SETS:
            case KW_SHARED:
            case KW_SHOW:
            case KW_SHOW_DATABASE:
            case KW_SKEWED:
            case KW_SMALLINT:
            case KW_SORT:
            case KW_SORTED:
            case KW_SSL:
            case KW_STATISTICS:
            case KW_STORED:
            case KW_STREAMTABLE:
            case KW_STRING:
            case KW_STRUCT:
            case KW_TABLE:
            case KW_TABLES:
            case KW_TBLPROPERTIES:
            case KW_TEMPORARY:
            case KW_TERMINATED:
            case KW_TEXTFILE:
            case KW_TIMESTAMP:
            case KW_TINYINT:
            case KW_TO:
            case KW_TOUCH:
            case KW_TRANSACTIONS:
            case KW_TRIGGER:
            case KW_TRUE:
            case KW_TRUNCATE:
            case KW_UNARCHIVE:
            case KW_UNDO:
            case KW_UNION:
            case KW_UNIONTYPE:
            case KW_UNLOCK:
            case KW_UNSET:
            case KW_UNSIGNED:
            case KW_UPDATE:
            case KW_USE:
            case KW_USER:
            case KW_USING:
            case KW_UTC:
            case KW_UTCTIMESTAMP:
            case KW_VALUE_TYPE:
            case KW_VIEW:
            case KW_WHILE:
            case KW_WITH:
                {
                alt57=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;

            }

            switch (alt57) {
                case 1 :
                    // IdentifiersParser.g:532:5: Identifier
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    Identifier257=(Token)match(input,Identifier,FOLLOW_Identifier_in_identifier3676); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Identifier257_tree = 
                    (CommonTree)adaptor.create(Identifier257)
                    ;
                    adaptor.addChild(root_0, Identifier257_tree);
                    }

                    }
                    break;
                case 2 :
                    // IdentifiersParser.g:533:7: nonReserved
                    {
                    pushFollow(FOLLOW_nonReserved_in_identifier3684);
                    nonReserved258=nonReserved();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_nonReserved.add(nonReserved258.getTree());

                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 533:19: -> Identifier[$nonReserved.text]
                    {
                        adaptor.addChild(root_0, 
                        (CommonTree)adaptor.create(Identifier, (nonReserved258!=null?input.toString(nonReserved258.start,nonReserved258.stop):null))
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "identifier"


    public static class functionIdentifier_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "functionIdentifier"
    // IdentifiersParser.g:536:1: functionIdentifier : (db= identifier DOT fn= identifier -> Identifier[$db.text + \".\" + $fn.text] | identifier );
    public final HiveParser_IdentifiersParser.functionIdentifier_return functionIdentifier() throws RecognitionException {
        HiveParser_IdentifiersParser.functionIdentifier_return retval = new HiveParser_IdentifiersParser.functionIdentifier_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token DOT259=null;
        HiveParser_IdentifiersParser.identifier_return db =null;

        HiveParser_IdentifiersParser.identifier_return fn =null;

        HiveParser_IdentifiersParser.identifier_return identifier260 =null;


        CommonTree DOT259_tree=null;
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
         gParent.pushMsg("function identifier", state); 
        try {
            // IdentifiersParser.g:539:5: (db= identifier DOT fn= identifier -> Identifier[$db.text + \".\" + $fn.text] | identifier )
            int alt58=2;
            switch ( input.LA(1) ) {
            case Identifier:
                {
                switch ( input.LA(2) ) {
                case DOT:
                    {
                    alt58=1;
                    }
                    break;
                case EOF:
                case KW_AS:
                case LPAREN:
                    {
                    alt58=2;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 58, 1, input);

                    throw nvae;

                }

                }
                break;
            case KW_ADD:
            case KW_ADMIN:
            case KW_AFTER:
            case KW_ALL:
            case KW_ALTER:
            case KW_ANALYZE:
            case KW_ARCHIVE:
            case KW_ARRAY:
            case KW_AS:
            case KW_ASC:
            case KW_BEFORE:
            case KW_BETWEEN:
            case KW_BIGINT:
            case KW_BINARY:
            case KW_BOOLEAN:
            case KW_BOTH:
            case KW_BUCKET:
            case KW_BUCKETS:
            case KW_BY:
            case KW_CASCADE:
            case KW_CHANGE:
            case KW_CLUSTER:
            case KW_CLUSTERED:
            case KW_CLUSTERSTATUS:
            case KW_COLLECTION:
            case KW_COLUMNS:
            case KW_COMMENT:
            case KW_COMPACT:
            case KW_COMPACTIONS:
            case KW_COMPUTE:
            case KW_CONCATENATE:
            case KW_CONTINUE:
            case KW_CREATE:
            case KW_CUBE:
            case KW_CURSOR:
            case KW_DATA:
            case KW_DATABASES:
            case KW_DATE:
            case KW_DATETIME:
            case KW_DBPROPERTIES:
            case KW_DECIMAL:
            case KW_DEFAULT:
            case KW_DEFERRED:
            case KW_DEFINED:
            case KW_DELETE:
            case KW_DELIMITED:
            case KW_DEPENDENCY:
            case KW_DESC:
            case KW_DESCRIBE:
            case KW_DIRECTORIES:
            case KW_DIRECTORY:
            case KW_DISABLE:
            case KW_DISTRIBUTE:
            case KW_DOUBLE:
            case KW_DROP:
            case KW_ELEM_TYPE:
            case KW_ENABLE:
            case KW_ESCAPED:
            case KW_EXCLUSIVE:
            case KW_EXISTS:
            case KW_EXPLAIN:
            case KW_EXPORT:
            case KW_EXTERNAL:
            case KW_FALSE:
            case KW_FETCH:
            case KW_FIELDS:
            case KW_FILE:
            case KW_FILEFORMAT:
            case KW_FIRST:
            case KW_FLOAT:
            case KW_FOR:
            case KW_FORMAT:
            case KW_FORMATTED:
            case KW_FULL:
            case KW_FUNCTIONS:
            case KW_GRANT:
            case KW_GROUP:
            case KW_GROUPING:
            case KW_HOLD_DDLTIME:
            case KW_IDXPROPERTIES:
            case KW_IGNORE:
            case KW_IMPORT:
            case KW_IN:
            case KW_INDEX:
            case KW_INDEXES:
            case KW_INNER:
            case KW_INPATH:
            case KW_INPUTDRIVER:
            case KW_INPUTFORMAT:
            case KW_INSERT:
            case KW_INT:
            case KW_INTERSECT:
            case KW_INTO:
            case KW_IS:
            case KW_ITEMS:
            case KW_JAR:
            case KW_KEYS:
            case KW_KEY_TYPE:
            case KW_LATERAL:
            case KW_LEFT:
            case KW_LIKE:
            case KW_LIMIT:
            case KW_LINES:
            case KW_LOAD:
            case KW_LOCAL:
            case KW_LOCATION:
            case KW_LOCK:
            case KW_LOCKS:
            case KW_LOGICAL:
            case KW_LONG:
            case KW_MAPJOIN:
            case KW_MATERIALIZED:
            case KW_MINUS:
            case KW_MSCK:
            case KW_NONE:
            case KW_NOSCAN:
            case KW_NO_DROP:
            case KW_NULL:
            case KW_OF:
            case KW_OFFLINE:
            case KW_OPTION:
            case KW_ORCFILE:
            case KW_ORDER:
            case KW_OUT:
            case KW_OUTER:
            case KW_OUTPUTDRIVER:
            case KW_OUTPUTFORMAT:
            case KW_OVERWRITE:
            case KW_OWNER:
            case KW_PARQUETFILE:
            case KW_PARTITION:
            case KW_PARTITIONED:
            case KW_PARTITIONS:
            case KW_PERCENT:
            case KW_PLUS:
            case KW_PRETTY:
            case KW_PRINCIPALS:
            case KW_PROCEDURE:
            case KW_PROTECTION:
            case KW_PURGE:
            case KW_RANGE:
            case KW_RCFILE:
            case KW_READ:
            case KW_READONLY:
            case KW_READS:
            case KW_REBUILD:
            case KW_RECORDREADER:
            case KW_RECORDWRITER:
            case KW_REGEXP:
            case KW_RENAME:
            case KW_REPAIR:
            case KW_REPLACE:
            case KW_RESTRICT:
            case KW_REVOKE:
            case KW_RIGHT:
            case KW_RLIKE:
            case KW_ROLE:
            case KW_ROLES:
            case KW_ROLLUP:
            case KW_ROW:
            case KW_ROWS:
            case KW_SCHEMA:
            case KW_SCHEMAS:
            case KW_SEMI:
            case KW_SEQUENCEFILE:
            case KW_SERDE:
            case KW_SERDEPROPERTIES:
            case KW_SET:
            case KW_SETS:
            case KW_SHARED:
            case KW_SHOW:
            case KW_SHOW_DATABASE:
            case KW_SKEWED:
            case KW_SMALLINT:
            case KW_SORT:
            case KW_SORTED:
            case KW_SSL:
            case KW_STATISTICS:
            case KW_STORED:
            case KW_STREAMTABLE:
            case KW_STRING:
            case KW_STRUCT:
            case KW_TABLE:
            case KW_TABLES:
            case KW_TBLPROPERTIES:
            case KW_TEMPORARY:
            case KW_TERMINATED:
            case KW_TEXTFILE:
            case KW_TIMESTAMP:
            case KW_TINYINT:
            case KW_TO:
            case KW_TOUCH:
            case KW_TRANSACTIONS:
            case KW_TRIGGER:
            case KW_TRUE:
            case KW_TRUNCATE:
            case KW_UNARCHIVE:
            case KW_UNDO:
            case KW_UNION:
            case KW_UNIONTYPE:
            case KW_UNLOCK:
            case KW_UNSET:
            case KW_UNSIGNED:
            case KW_UPDATE:
            case KW_USE:
            case KW_USER:
            case KW_USING:
            case KW_UTC:
            case KW_UTCTIMESTAMP:
            case KW_VALUE_TYPE:
            case KW_VIEW:
            case KW_WHILE:
            case KW_WITH:
                {
                switch ( input.LA(2) ) {
                case DOT:
                    {
                    alt58=1;
                    }
                    break;
                case EOF:
                case KW_AS:
                case LPAREN:
                    {
                    alt58=2;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 58, 2, input);

                    throw nvae;

                }

                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;

            }

            switch (alt58) {
                case 1 :
                    // IdentifiersParser.g:539:7: db= identifier DOT fn= identifier
                    {
                    pushFollow(FOLLOW_identifier_in_functionIdentifier3718);
                    db=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(db.getTree());

                    DOT259=(Token)match(input,DOT,FOLLOW_DOT_in_functionIdentifier3720); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DOT.add(DOT259);


                    pushFollow(FOLLOW_identifier_in_functionIdentifier3724);
                    fn=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(fn.getTree());

                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 540:5: -> Identifier[$db.text + \".\" + $fn.text]
                    {
                        adaptor.addChild(root_0, 
                        (CommonTree)adaptor.create(Identifier, (db!=null?input.toString(db.start,db.stop):null) + "." + (fn!=null?input.toString(fn.start,fn.stop):null))
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // IdentifiersParser.g:542:5: identifier
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_identifier_in_functionIdentifier3745);
                    identifier260=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier260.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) { gParent.popMsg(state); }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "functionIdentifier"


    public static class nonReserved_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "nonReserved"
    // IdentifiersParser.g:545:1: nonReserved : ( KW_TRUE | KW_FALSE | KW_LIKE | KW_EXISTS | KW_ASC | KW_DESC | KW_ORDER | KW_GROUP | KW_BY | KW_AS | KW_INSERT | KW_OVERWRITE | KW_OUTER | KW_LEFT | KW_RIGHT | KW_FULL | KW_PARTITION | KW_PARTITIONS | KW_TABLE | KW_TABLES | KW_COLUMNS | KW_INDEX | KW_INDEXES | KW_REBUILD | KW_FUNCTIONS | KW_SHOW | KW_MSCK | KW_REPAIR | KW_DIRECTORY | KW_LOCAL | KW_USING | KW_CLUSTER | KW_DISTRIBUTE | KW_SORT | KW_UNION | KW_LOAD | KW_EXPORT | KW_IMPORT | KW_DATA | KW_INPATH | KW_IS | KW_NULL | KW_CREATE | KW_EXTERNAL | KW_ALTER | KW_CHANGE | KW_FIRST | KW_AFTER | KW_DESCRIBE | KW_DROP | KW_RENAME | KW_IGNORE | KW_PROTECTION | KW_TO | KW_COMMENT | KW_BOOLEAN | KW_TINYINT | KW_SMALLINT | KW_INT | KW_BIGINT | KW_FLOAT | KW_DOUBLE | KW_DATE | KW_DATETIME | KW_TIMESTAMP | KW_DECIMAL | KW_STRING | KW_ARRAY | KW_STRUCT | KW_UNIONTYPE | KW_PARTITIONED | KW_CLUSTERED | KW_SORTED | KW_INTO | KW_BUCKETS | KW_ROW | KW_ROWS | KW_FORMAT | KW_DELIMITED | KW_FIELDS | KW_TERMINATED | KW_ESCAPED | KW_COLLECTION | KW_ITEMS | KW_KEYS | KW_KEY_TYPE | KW_LINES | KW_STORED | KW_FILEFORMAT | KW_SEQUENCEFILE | KW_TEXTFILE | KW_RCFILE | KW_ORCFILE | KW_PARQUETFILE | KW_INPUTFORMAT | KW_OUTPUTFORMAT | KW_INPUTDRIVER | KW_OUTPUTDRIVER | KW_OFFLINE | KW_ENABLE | KW_DISABLE | KW_READONLY | KW_NO_DROP | KW_LOCATION | KW_BUCKET | KW_OUT | KW_OF | KW_PERCENT | KW_ADD | KW_REPLACE | KW_RLIKE | KW_REGEXP | KW_TEMPORARY | KW_EXPLAIN | KW_FORMATTED | KW_PRETTY | KW_DEPENDENCY | KW_LOGICAL | KW_SERDE | KW_WITH | KW_DEFERRED | KW_SERDEPROPERTIES | KW_DBPROPERTIES | KW_LIMIT | KW_SET | KW_UNSET | KW_TBLPROPERTIES | KW_IDXPROPERTIES | KW_VALUE_TYPE | KW_ELEM_TYPE | KW_MAPJOIN | KW_STREAMTABLE | KW_HOLD_DDLTIME | KW_CLUSTERSTATUS | KW_UTC | KW_UTCTIMESTAMP | KW_LONG | KW_DELETE | KW_PLUS | KW_MINUS | KW_FETCH | KW_INTERSECT | KW_VIEW | KW_IN | KW_DATABASES | KW_MATERIALIZED | KW_SCHEMA | KW_SCHEMAS | KW_GRANT | KW_REVOKE | KW_SSL | KW_UNDO | KW_LOCK | KW_LOCKS | KW_UNLOCK | KW_SHARED | KW_EXCLUSIVE | KW_PROCEDURE | KW_UNSIGNED | KW_WHILE | KW_READ | KW_READS | KW_PURGE | KW_RANGE | KW_ANALYZE | KW_BEFORE | KW_BETWEEN | KW_BOTH | KW_BINARY | KW_CONTINUE | KW_CURSOR | KW_TRIGGER | KW_RECORDREADER | KW_RECORDWRITER | KW_SEMI | KW_LATERAL | KW_TOUCH | KW_ARCHIVE | KW_UNARCHIVE | KW_COMPUTE | KW_STATISTICS | KW_USE | KW_OPTION | KW_CONCATENATE | KW_SHOW_DATABASE | KW_UPDATE | KW_RESTRICT | KW_CASCADE | KW_SKEWED | KW_ROLLUP | KW_CUBE | KW_DIRECTORIES | KW_FOR | KW_GROUPING | KW_SETS | KW_TRUNCATE | KW_NOSCAN | KW_USER | KW_ROLE | KW_ROLES | KW_INNER | KW_DEFINED | KW_ADMIN | KW_JAR | KW_FILE | KW_OWNER | KW_PRINCIPALS | KW_ALL | KW_DEFAULT | KW_NONE | KW_COMPACT | KW_COMPACTIONS | KW_TRANSACTIONS );
    public final HiveParser_IdentifiersParser.nonReserved_return nonReserved() throws RecognitionException {
        HiveParser_IdentifiersParser.nonReserved_return retval = new HiveParser_IdentifiersParser.nonReserved_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set261=null;

        CommonTree set261_tree=null;

        try {
            // IdentifiersParser.g:546:5: ( KW_TRUE | KW_FALSE | KW_LIKE | KW_EXISTS | KW_ASC | KW_DESC | KW_ORDER | KW_GROUP | KW_BY | KW_AS | KW_INSERT | KW_OVERWRITE | KW_OUTER | KW_LEFT | KW_RIGHT | KW_FULL | KW_PARTITION | KW_PARTITIONS | KW_TABLE | KW_TABLES | KW_COLUMNS | KW_INDEX | KW_INDEXES | KW_REBUILD | KW_FUNCTIONS | KW_SHOW | KW_MSCK | KW_REPAIR | KW_DIRECTORY | KW_LOCAL | KW_USING | KW_CLUSTER | KW_DISTRIBUTE | KW_SORT | KW_UNION | KW_LOAD | KW_EXPORT | KW_IMPORT | KW_DATA | KW_INPATH | KW_IS | KW_NULL | KW_CREATE | KW_EXTERNAL | KW_ALTER | KW_CHANGE | KW_FIRST | KW_AFTER | KW_DESCRIBE | KW_DROP | KW_RENAME | KW_IGNORE | KW_PROTECTION | KW_TO | KW_COMMENT | KW_BOOLEAN | KW_TINYINT | KW_SMALLINT | KW_INT | KW_BIGINT | KW_FLOAT | KW_DOUBLE | KW_DATE | KW_DATETIME | KW_TIMESTAMP | KW_DECIMAL | KW_STRING | KW_ARRAY | KW_STRUCT | KW_UNIONTYPE | KW_PARTITIONED | KW_CLUSTERED | KW_SORTED | KW_INTO | KW_BUCKETS | KW_ROW | KW_ROWS | KW_FORMAT | KW_DELIMITED | KW_FIELDS | KW_TERMINATED | KW_ESCAPED | KW_COLLECTION | KW_ITEMS | KW_KEYS | KW_KEY_TYPE | KW_LINES | KW_STORED | KW_FILEFORMAT | KW_SEQUENCEFILE | KW_TEXTFILE | KW_RCFILE | KW_ORCFILE | KW_PARQUETFILE | KW_INPUTFORMAT | KW_OUTPUTFORMAT | KW_INPUTDRIVER | KW_OUTPUTDRIVER | KW_OFFLINE | KW_ENABLE | KW_DISABLE | KW_READONLY | KW_NO_DROP | KW_LOCATION | KW_BUCKET | KW_OUT | KW_OF | KW_PERCENT | KW_ADD | KW_REPLACE | KW_RLIKE | KW_REGEXP | KW_TEMPORARY | KW_EXPLAIN | KW_FORMATTED | KW_PRETTY | KW_DEPENDENCY | KW_LOGICAL | KW_SERDE | KW_WITH | KW_DEFERRED | KW_SERDEPROPERTIES | KW_DBPROPERTIES | KW_LIMIT | KW_SET | KW_UNSET | KW_TBLPROPERTIES | KW_IDXPROPERTIES | KW_VALUE_TYPE | KW_ELEM_TYPE | KW_MAPJOIN | KW_STREAMTABLE | KW_HOLD_DDLTIME | KW_CLUSTERSTATUS | KW_UTC | KW_UTCTIMESTAMP | KW_LONG | KW_DELETE | KW_PLUS | KW_MINUS | KW_FETCH | KW_INTERSECT | KW_VIEW | KW_IN | KW_DATABASES | KW_MATERIALIZED | KW_SCHEMA | KW_SCHEMAS | KW_GRANT | KW_REVOKE | KW_SSL | KW_UNDO | KW_LOCK | KW_LOCKS | KW_UNLOCK | KW_SHARED | KW_EXCLUSIVE | KW_PROCEDURE | KW_UNSIGNED | KW_WHILE | KW_READ | KW_READS | KW_PURGE | KW_RANGE | KW_ANALYZE | KW_BEFORE | KW_BETWEEN | KW_BOTH | KW_BINARY | KW_CONTINUE | KW_CURSOR | KW_TRIGGER | KW_RECORDREADER | KW_RECORDWRITER | KW_SEMI | KW_LATERAL | KW_TOUCH | KW_ARCHIVE | KW_UNARCHIVE | KW_COMPUTE | KW_STATISTICS | KW_USE | KW_OPTION | KW_CONCATENATE | KW_SHOW_DATABASE | KW_UPDATE | KW_RESTRICT | KW_CASCADE | KW_SKEWED | KW_ROLLUP | KW_CUBE | KW_DIRECTORIES | KW_FOR | KW_GROUPING | KW_SETS | KW_TRUNCATE | KW_NOSCAN | KW_USER | KW_ROLE | KW_ROLES | KW_INNER | KW_DEFINED | KW_ADMIN | KW_JAR | KW_FILE | KW_OWNER | KW_PRINCIPALS | KW_ALL | KW_DEFAULT | KW_NONE | KW_COMPACT | KW_COMPACTIONS | KW_TRANSACTIONS )
            // IdentifiersParser.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            set261=(Token)input.LT(1);

            if ( (input.LA(1) >= KW_ADD && input.LA(1) <= KW_ANALYZE)||(input.LA(1) >= KW_ARCHIVE && input.LA(1) <= KW_CASCADE)||input.LA(1)==KW_CHANGE||(input.LA(1) >= KW_CLUSTER && input.LA(1) <= KW_COLLECTION)||(input.LA(1) >= KW_COLUMNS && input.LA(1) <= KW_CREATE)||input.LA(1)==KW_CUBE||(input.LA(1) >= KW_CURSOR && input.LA(1) <= KW_DATA)||(input.LA(1) >= KW_DATABASES && input.LA(1) <= KW_DISABLE)||(input.LA(1) >= KW_DISTRIBUTE && input.LA(1) <= KW_ELEM_TYPE)||input.LA(1)==KW_ENABLE||input.LA(1)==KW_ESCAPED||(input.LA(1) >= KW_EXCLUSIVE && input.LA(1) <= KW_EXPORT)||(input.LA(1) >= KW_EXTERNAL && input.LA(1) <= KW_FLOAT)||(input.LA(1) >= KW_FOR && input.LA(1) <= KW_FORMATTED)||input.LA(1)==KW_FULL||(input.LA(1) >= KW_FUNCTIONS && input.LA(1) <= KW_GROUPING)||(input.LA(1) >= KW_HOLD_DDLTIME && input.LA(1) <= KW_IDXPROPERTIES)||(input.LA(1) >= KW_IGNORE && input.LA(1) <= KW_JAR)||(input.LA(1) >= KW_KEYS && input.LA(1) <= KW_LEFT)||(input.LA(1) >= KW_LIKE && input.LA(1) <= KW_LONG)||(input.LA(1) >= KW_MAPJOIN && input.LA(1) <= KW_MINUS)||(input.LA(1) >= KW_MSCK && input.LA(1) <= KW_NOSCAN)||(input.LA(1) >= KW_NO_DROP && input.LA(1) <= KW_OFFLINE)||input.LA(1)==KW_OPTION||(input.LA(1) >= KW_ORCFILE && input.LA(1) <= KW_OUTPUTFORMAT)||(input.LA(1) >= KW_OVERWRITE && input.LA(1) <= KW_PARQUETFILE)||(input.LA(1) >= KW_PARTITION && input.LA(1) <= KW_PLUS)||(input.LA(1) >= KW_PRETTY && input.LA(1) <= KW_RECORDWRITER)||(input.LA(1) >= KW_REGEXP && input.LA(1) <= KW_SCHEMAS)||(input.LA(1) >= KW_SEMI && input.LA(1) <= KW_TABLES)||(input.LA(1) >= KW_TBLPROPERTIES && input.LA(1) <= KW_TEXTFILE)||(input.LA(1) >= KW_TIMESTAMP && input.LA(1) <= KW_TRANSACTIONS)||(input.LA(1) >= KW_TRIGGER && input.LA(1) <= KW_UNARCHIVE)||(input.LA(1) >= KW_UNDO && input.LA(1) <= KW_UNIONTYPE)||(input.LA(1) >= KW_UNLOCK && input.LA(1) <= KW_VALUE_TYPE)||input.LA(1)==KW_VIEW||input.LA(1)==KW_WHILE||input.LA(1)==KW_WITH ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(set261)
                );
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "nonReserved"

    // $ANTLR start synpred1_IdentifiersParser
    public final void synpred1_IdentifiersParser_fragment() throws RecognitionException {
        // IdentifiersParser.g:127:7: ( COMMA )
        // IdentifiersParser.g:127:8: COMMA
        {
        match(input,COMMA,FOLLOW_COMMA_in_synpred1_IdentifiersParser616); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred1_IdentifiersParser

    // $ANTLR start synpred2_IdentifiersParser
    public final void synpred2_IdentifiersParser_fragment() throws RecognitionException {
        // IdentifiersParser.g:138:17: ( COMMA )
        // IdentifiersParser.g:138:18: COMMA
        {
        match(input,COMMA,FOLLOW_COMMA_in_synpred2_IdentifiersParser717); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred2_IdentifiersParser

    // $ANTLR start synpred3_IdentifiersParser
    public final void synpred3_IdentifiersParser_fragment() throws RecognitionException {
        // IdentifiersParser.g:149:17: ( COMMA )
        // IdentifiersParser.g:149:18: COMMA
        {
        match(input,COMMA,FOLLOW_COMMA_in_synpred3_IdentifiersParser817); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred3_IdentifiersParser

    // $ANTLR start synpred4_IdentifiersParser
    public final void synpred4_IdentifiersParser_fragment() throws RecognitionException {
        // IdentifiersParser.g:162:7: ( COMMA )
        // IdentifiersParser.g:162:8: COMMA
        {
        match(input,COMMA,FOLLOW_COMMA_in_synpred4_IdentifiersParser927); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred4_IdentifiersParser

    // $ANTLR start synpred5_IdentifiersParser
    public final void synpred5_IdentifiersParser_fragment() throws RecognitionException {
        // IdentifiersParser.g:274:7: ( functionName LPAREN )
        // IdentifiersParser.g:274:8: functionName LPAREN
        {
        pushFollow(FOLLOW_functionName_in_synpred5_IdentifiersParser1770);
        functionName();

        state._fsp--;
        if (state.failed) return ;

        match(input,LPAREN,FOLLOW_LPAREN_in_synpred5_IdentifiersParser1772); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred5_IdentifiersParser

    // $ANTLR start synpred6_IdentifiersParser
    public final void synpred6_IdentifiersParser_fragment() throws RecognitionException {
        // IdentifiersParser.g:387:7: ( KW_NOT KW_IN LPAREN KW_SELECT )
        // IdentifiersParser.g:387:8: KW_NOT KW_IN LPAREN KW_SELECT
        {
        match(input,KW_NOT,FOLLOW_KW_NOT_in_synpred6_IdentifiersParser2494); if (state.failed) return ;

        match(input,KW_IN,FOLLOW_KW_IN_in_synpred6_IdentifiersParser2496); if (state.failed) return ;

        match(input,LPAREN,FOLLOW_LPAREN_in_synpred6_IdentifiersParser2498); if (state.failed) return ;

        match(input,KW_SELECT,FOLLOW_KW_SELECT_in_synpred6_IdentifiersParser2500); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred6_IdentifiersParser

    // $ANTLR start synpred7_IdentifiersParser
    public final void synpred7_IdentifiersParser_fragment() throws RecognitionException {
        // IdentifiersParser.g:391:7: ( KW_IN LPAREN KW_SELECT )
        // IdentifiersParser.g:391:8: KW_IN LPAREN KW_SELECT
        {
        match(input,KW_IN,FOLLOW_KW_IN_in_synpred7_IdentifiersParser2587); if (state.failed) return ;

        match(input,LPAREN,FOLLOW_LPAREN_in_synpred7_IdentifiersParser2589); if (state.failed) return ;

        match(input,KW_SELECT,FOLLOW_KW_SELECT_in_synpred7_IdentifiersParser2591); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred7_IdentifiersParser

    // $ANTLR start synpred8_IdentifiersParser
    public final void synpred8_IdentifiersParser_fragment() throws RecognitionException {
        // IdentifiersParser.g:400:7: ( KW_EXISTS LPAREN KW_SELECT )
        // IdentifiersParser.g:400:8: KW_EXISTS LPAREN KW_SELECT
        {
        match(input,KW_EXISTS,FOLLOW_KW_EXISTS_in_synpred8_IdentifiersParser2781); if (state.failed) return ;

        match(input,LPAREN,FOLLOW_LPAREN_in_synpred8_IdentifiersParser2783); if (state.failed) return ;

        match(input,KW_SELECT,FOLLOW_KW_SELECT_in_synpred8_IdentifiersParser2785); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred8_IdentifiersParser

    // Delegated rules

    public final boolean synpred4_IdentifiersParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_IdentifiersParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred6_IdentifiersParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_IdentifiersParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred7_IdentifiersParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_IdentifiersParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_IdentifiersParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_IdentifiersParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_IdentifiersParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_IdentifiersParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_IdentifiersParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_IdentifiersParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred8_IdentifiersParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_IdentifiersParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_IdentifiersParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_IdentifiersParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA6 dfa6 = new DFA6(this);
    protected DFA26 dfa26 = new DFA26(this);
    protected DFA32 dfa32 = new DFA32(this);
    protected DFA33 dfa33 = new DFA33(this);
    protected DFA34 dfa34 = new DFA34(this);
    protected DFA35 dfa35 = new DFA35(this);
    protected DFA38 dfa38 = new DFA38(this);
    protected DFA39 dfa39 = new DFA39(this);
    protected DFA40 dfa40 = new DFA40(this);
    protected DFA46 dfa46 = new DFA46(this);
    protected DFA45 dfa45 = new DFA45(this);
    static final String DFA6_eotS =
        "\u021b\uffff";
    static final String DFA6_eofS =
        "\u021b\uffff";
    static final String DFA6_minS =
        "\1\7\26\uffff\1\7\2\uffff\2\7\10\4\1\14\2\4\1\u011c\1\7\1\u011c"+
        "\1\4\1\u011c\4\4\1\7\1\4\u01e9\uffff";
    static final String DFA6_maxS =
        "\1\u012f\26\uffff\1\u012f\2\uffff\2\u012f\1\u012b\1\u012d\1\u012b"+
        "\1\u012d\4\u012b\1\14\2\u012b\1\u011c\1\u012f\1\u011c\1\u012b\1"+
        "\u011c\4\u012b\1\u012f\1\u012b\u01e9\uffff";
    static final String DFA6_acceptS =
        "\1\uffff\1\1\27\uffff\1\3\30\uffff\105\1\1\uffff\1\2\3\1\1\uffff"+
        "\25\1\1\uffff\26\1\1\uffff\27\1\1\uffff\26\1\1\uffff\26\1\1\uffff"+
        "\26\1\1\uffff\26\1\1\uffff\30\1\2\uffff\27\1\2\uffff\35\1\1\uffff"+
        "\25\1\1\uffff\3\1\1\uffff\25\1\1\uffff\2\1\1\uffff\25\1\1\uffff"+
        "\2\1\1\uffff\25\1\1\uffff\2\1\1\uffff\25\1\1\uffff\32\1\1\uffff"+
        "\25\1\1\uffff";
    static final String DFA6_specialS =
        "\u021b\uffff}>";
    static final String[] DFA6_transitionS = {
            "\1\1\5\uffff\1\1\4\uffff\1\1\7\uffff\7\1\1\uffff\21\1\1\uffff"+
            "\4\1\1\uffff\10\1\1\uffff\1\1\1\uffff\2\1\1\uffff\20\1\1\uffff"+
            "\4\1\1\uffff\1\1\1\uffff\1\1\1\uffff\4\1\1\uffff\10\1\1\uffff"+
            "\3\1\1\uffff\1\1\1\uffff\4\1\1\uffff\23\1\1\uffff\4\1\1\uffff"+
            "\12\1\1\uffff\4\1\1\uffff\10\1\1\uffff\1\1\1\uffff\6\1\1\uffff"+
            "\3\1\1\uffff\5\1\2\uffff\15\1\1\uffff\17\1\1\uffff\25\1\1\uffff"+
            "\4\1\1\uffff\5\1\1\uffff\4\1\1\uffff\3\1\1\uffff\12\1\1\uffff"+
            "\1\1\2\uffff\1\1\1\uffff\1\1\3\uffff\1\27\2\uffff\1\1\2\uffff"+
            "\2\1\10\uffff\4\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\40\5\uffff\1\44\4\uffff\1\43\7\uffff\1\56\6\61\1\uffff\1"+
            "\61\1\52\14\61\1\50\1\47\1\61\1\uffff\4\61\1\uffff\10\61\1\uffff"+
            "\1\61\1\uffff\2\61\1\uffff\1\61\1\35\16\61\1\uffff\4\61\1\uffff"+
            "\1\61\1\uffff\1\61\1\uffff\1\61\1\57\2\61\1\uffff\1\61\1\46"+
            "\6\61\1\uffff\3\61\1\uffff\1\61\1\uffff\4\61\1\uffff\2\61\1"+
            "\51\20\61\1\uffff\4\61\1\uffff\12\61\1\uffff\1\53\3\61\1\uffff"+
            "\3\61\1\32\1\61\1\34\2\61\1\uffff\1\61\1\uffff\6\61\1\uffff"+
            "\3\61\1\uffff\5\61\2\uffff\15\61\1\uffff\17\61\1\uffff\22\61"+
            "\1\54\2\61\1\uffff\4\61\1\uffff\5\61\1\uffff\1\61\1\45\2\61"+
            "\1\uffff\2\61\1\55\1\uffff\12\61\1\uffff\1\61\2\uffff\1\61\1"+
            "\uffff\1\61\3\uffff\1\60\2\uffff\1\33\2\uffff\1\36\1\33\3\uffff"+
            "\1\31\4\uffff\1\41\1\37\1\33\1\42",
            "",
            "",
            "\1\67\5\uffff\1\73\4\uffff\1\72\7\uffff\1\105\6\110\1\uffff"+
            "\1\110\1\101\14\110\1\77\1\76\1\110\1\uffff\4\110\1\uffff\10"+
            "\110\1\uffff\1\110\1\uffff\2\110\1\uffff\1\110\1\64\16\110\1"+
            "\uffff\4\110\1\uffff\1\110\1\uffff\1\110\1\uffff\1\110\1\106"+
            "\2\110\1\uffff\1\110\1\75\6\110\1\uffff\3\110\1\uffff\1\110"+
            "\1\uffff\4\110\1\uffff\2\110\1\100\20\110\1\uffff\4\110\1\uffff"+
            "\12\110\1\uffff\1\102\3\110\1\uffff\3\110\1\111\1\110\1\63\2"+
            "\110\1\uffff\1\110\1\uffff\6\110\1\uffff\3\110\1\uffff\5\110"+
            "\2\uffff\15\110\1\uffff\17\110\1\uffff\22\110\1\103\2\110\1"+
            "\uffff\4\110\1\uffff\5\110\1\uffff\1\110\1\74\2\110\1\uffff"+
            "\2\110\1\104\1\uffff\12\110\1\uffff\1\110\2\uffff\1\110\1\uffff"+
            "\1\110\3\uffff\1\107\2\uffff\1\62\2\uffff\1\65\1\62\10\uffff"+
            "\1\70\1\66\1\62\1\71",
            "\1\116\5\uffff\1\122\4\uffff\1\121\7\uffff\1\134\6\135\1\uffff"+
            "\1\135\1\130\14\135\1\126\1\125\1\135\1\uffff\4\135\1\uffff"+
            "\10\135\1\uffff\1\135\1\uffff\2\135\1\uffff\1\135\1\113\16\135"+
            "\1\uffff\4\135\1\uffff\1\135\1\uffff\1\135\1\uffff\4\135\1\uffff"+
            "\1\135\1\124\6\135\1\uffff\3\135\1\uffff\1\135\1\uffff\4\135"+
            "\1\uffff\2\135\1\127\20\135\1\uffff\4\135\1\uffff\12\135\1\uffff"+
            "\1\131\3\135\1\uffff\3\135\1\uffff\1\135\1\112\2\135\1\uffff"+
            "\1\135\1\uffff\6\135\1\uffff\3\135\1\uffff\5\135\2\uffff\15"+
            "\135\1\uffff\17\135\1\uffff\22\135\1\132\2\135\1\uffff\4\135"+
            "\1\uffff\5\135\1\uffff\1\135\1\123\2\135\1\uffff\2\135\1\133"+
            "\1\uffff\12\135\1\uffff\1\135\2\uffff\1\135\1\uffff\1\135\3"+
            "\uffff\1\136\2\uffff\1\137\2\uffff\1\114\1\137\10\uffff\1\117"+
            "\1\115\1\137\1\120",
            "\1\146\1\147\1\143\3\uffff\1\170\3\uffff\2\144\1\uffff\1\141"+
            "\2\uffff\1\152\1\153\1\uffff\1\160\1\157\10\uffff\1\163\5\uffff"+
            "\1\162\127\uffff\1\161\12\uffff\1\142\10\uffff\1\151\22\uffff"+
            "\1\150\6\uffff\1\164\40\uffff\1\151\6\uffff\1\151\104\uffff"+
            "\1\156\1\155\1\166\1\140\1\uffff\1\145\1\144\1\154\1\uffff\1"+
            "\145\3\uffff\1\165\3\uffff\1\144",
            "\1\u0082\1\u0083\1\177\3\uffff\1\170\3\uffff\2\u0080\1\uffff"+
            "\1\172\2\uffff\1\u0086\1\u0087\1\uffff\1\u008c\1\u008b\10\uffff"+
            "\1\u008f\5\uffff\1\u008e\127\uffff\1\u008d\12\uffff\1\176\10"+
            "\uffff\1\u0085\22\uffff\1\u0084\6\uffff\1\u0090\40\uffff\1\u0085"+
            "\6\uffff\1\u0085\104\uffff\1\u008a\1\u0089\1\173\1\175\1\uffff"+
            "\1\u0081\1\u0080\1\u0088\1\uffff\1\u0081\3\uffff\1\u0091\3\uffff"+
            "\1\u0080\1\uffff\1\171",
            "\1\u0099\1\u009a\1\u0096\3\uffff\1\170\3\uffff\2\u0097\1\uffff"+
            "\1\u0094\2\uffff\1\u009d\1\u009e\1\uffff\1\u00a3\1\u00a2\10"+
            "\uffff\1\u00a6\5\uffff\1\u00a5\127\uffff\1\u00a4\12\uffff\1"+
            "\u0095\10\uffff\1\u009c\22\uffff\1\u009b\6\uffff\1\u00a7\40"+
            "\uffff\1\u009c\6\uffff\1\u009c\104\uffff\1\u00a1\1\u00a0\1\uffff"+
            "\1\u0093\1\uffff\1\u0098\1\u0097\1\u009f\1\uffff\1\u0098\3\uffff"+
            "\1\u00a8\3\uffff\1\u0097",
            "\1\u00b0\1\u00b1\1\u00ad\3\uffff\1\170\3\uffff\2\u00ae\1\uffff"+
            "\1\u00ab\2\uffff\1\u00b4\1\u00b5\1\uffff\1\u00ba\1\u00b9\10"+
            "\uffff\1\u00bd\5\uffff\1\u00bc\127\uffff\1\u00bb\12\uffff\1"+
            "\u00ac\10\uffff\1\u00b3\22\uffff\1\u00b2\6\uffff\1\u00be\40"+
            "\uffff\1\u00b3\6\uffff\1\u00b3\104\uffff\1\u00b8\1\u00b7\1\uffff"+
            "\1\u00aa\1\uffff\1\u00af\1\u00ae\1\u00b6\1\uffff\1\u00af\3\uffff"+
            "\1\u00bf\3\uffff\1\u00ae\1\uffff\1\u00c0",
            "\1\u00c8\1\u00c9\1\u00c5\3\uffff\1\170\3\uffff\2\u00c6\1\uffff"+
            "\1\u00c3\2\uffff\1\u00cc\1\u00cd\1\uffff\1\u00d2\1\u00d1\10"+
            "\uffff\1\u00d5\5\uffff\1\u00d4\127\uffff\1\u00d3\12\uffff\1"+
            "\u00c4\10\uffff\1\u00cb\22\uffff\1\u00ca\6\uffff\1\u00d6\40"+
            "\uffff\1\u00cb\6\uffff\1\u00cb\104\uffff\1\u00d0\1\u00cf\1\uffff"+
            "\1\u00c2\1\uffff\1\u00c7\1\u00c6\1\u00ce\1\uffff\1\u00c7\3\uffff"+
            "\1\u00d7\3\uffff\1\u00c6",
            "\1\u00df\1\u00e0\1\u00dc\3\uffff\1\170\3\uffff\2\u00dd\1\uffff"+
            "\1\u00da\2\uffff\1\u00e3\1\u00e4\1\uffff\1\u00e9\1\u00e8\10"+
            "\uffff\1\u00ec\5\uffff\1\u00eb\127\uffff\1\u00ea\12\uffff\1"+
            "\u00db\10\uffff\1\u00e2\22\uffff\1\u00e1\6\uffff\1\u00ed\40"+
            "\uffff\1\u00e2\6\uffff\1\u00e2\104\uffff\1\u00e7\1\u00e6\1\uffff"+
            "\1\u00d9\1\uffff\1\u00de\1\u00dd\1\u00e5\1\uffff\1\u00de\3\uffff"+
            "\1\u00ee\3\uffff\1\u00dd",
            "\1\u00f6\1\u00f7\1\u00f3\3\uffff\1\170\3\uffff\2\u00f4\1\uffff"+
            "\1\u00f1\2\uffff\1\u00fa\1\u00fb\1\uffff\1\u0100\1\u00ff\10"+
            "\uffff\1\u0103\5\uffff\1\u0102\127\uffff\1\u0101\12\uffff\1"+
            "\u00f2\10\uffff\1\u00f9\22\uffff\1\u00f8\6\uffff\1\u0104\40"+
            "\uffff\1\u00f9\6\uffff\1\u00f9\104\uffff\1\u00fe\1\u00fd\1\uffff"+
            "\1\u00f0\1\uffff\1\u00f5\1\u00f4\1\u00fc\1\uffff\1\u00f5\3\uffff"+
            "\1\u0105\3\uffff\1\u00f4",
            "\1\u010d\1\u010e\1\u010a\3\uffff\1\170\3\uffff\2\u010b\1\uffff"+
            "\1\u0108\2\uffff\1\u0111\1\u0112\1\uffff\1\u0117\1\u0116\10"+
            "\uffff\1\u011a\5\uffff\1\u0119\127\uffff\1\u0118\12\uffff\1"+
            "\u0109\10\uffff\1\u0110\22\uffff\1\u010f\6\uffff\1\u011b\40"+
            "\uffff\1\u0110\6\uffff\1\u0110\104\uffff\1\u0115\1\u0114\1\uffff"+
            "\1\u0107\1\uffff\1\u010c\1\u010b\1\u0113\1\uffff\1\u010c\3\uffff"+
            "\1\u011c\3\uffff\1\u010b",
            "\1\u011e",
            "\1\u0125\1\u0126\1\u0122\3\uffff\1\170\3\uffff\2\u0123\1\uffff"+
            "\1\u0120\2\uffff\1\u0129\1\u012a\1\uffff\1\u012f\1\u012e\10"+
            "\uffff\1\u0132\5\uffff\1\u0131\127\uffff\1\u0130\12\uffff\1"+
            "\u0121\10\uffff\1\u0128\22\uffff\1\u0127\6\uffff\1\u0133\40"+
            "\uffff\1\u0128\6\uffff\1\u0128\104\uffff\1\u012d\1\u012c\1\u0135"+
            "\1\u011f\1\uffff\1\u0124\1\u0123\1\u012b\1\uffff\1\u0124\3\uffff"+
            "\1\u0134\3\uffff\1\u0123",
            "\1\u013e\1\u013f\1\u013b\3\uffff\1\170\3\uffff\2\u013c\1\uffff"+
            "\1\u0139\2\uffff\1\u0142\1\u0143\1\uffff\1\u0148\1\u0147\10"+
            "\uffff\1\u014b\5\uffff\1\u014a\127\uffff\1\u0149\12\uffff\1"+
            "\u013a\10\uffff\1\u0141\22\uffff\1\u0140\6\uffff\1\u014c\40"+
            "\uffff\1\u0141\6\uffff\1\u0141\104\uffff\1\u0146\1\u0145\1\u014e"+
            "\1\u0138\1\uffff\1\u013d\1\u013c\1\u0144\1\uffff\1\u013d\3\uffff"+
            "\1\u014d\3\uffff\1\u013c",
            "\1\u0151",
            "\1\u0158\5\uffff\1\u015c\4\uffff\1\u015b\7\uffff\1\u0166\6"+
            "\u0169\1\uffff\1\u0169\1\u0162\14\u0169\1\u0160\1\u015f\1\u0169"+
            "\1\uffff\4\u0169\1\uffff\10\u0169\1\uffff\1\u0169\1\uffff\2"+
            "\u0169\1\uffff\1\u0169\1\u0155\16\u0169\1\uffff\4\u0169\1\uffff"+
            "\1\u0169\1\uffff\1\u0169\1\uffff\1\u0169\1\u0167\2\u0169\1\uffff"+
            "\1\u0169\1\u015e\6\u0169\1\uffff\3\u0169\1\uffff\1\u0169\1\uffff"+
            "\4\u0169\1\uffff\2\u0169\1\u0161\20\u0169\1\uffff\4\u0169\1"+
            "\uffff\12\u0169\1\uffff\1\u0163\3\u0169\1\uffff\3\u0169\1\u0152"+
            "\1\u0169\1\u0154\2\u0169\1\uffff\1\u0169\1\uffff\6\u0169\1\uffff"+
            "\3\u0169\1\uffff\5\u0169\2\uffff\15\u0169\1\uffff\17\u0169\1"+
            "\uffff\22\u0169\1\u0164\2\u0169\1\uffff\4\u0169\1\uffff\5\u0169"+
            "\1\uffff\1\u0169\1\u015d\2\u0169\1\uffff\2\u0169\1\u0165\1\uffff"+
            "\12\u0169\1\uffff\1\u0169\1\u016a\1\uffff\1\u0169\1\uffff\1"+
            "\u0169\3\uffff\1\u0168\2\uffff\1\u0153\2\uffff\1\u0156\1\u0153"+
            "\10\uffff\1\u0159\1\u0157\1\u0153\1\u015a",
            "\1\u016b",
            "\1\u0174\1\u0175\1\u0171\3\uffff\1\170\3\uffff\2\u0172\1\uffff"+
            "\1\u016d\2\uffff\1\u0178\1\u0179\1\uffff\1\u017e\1\u017d\10"+
            "\uffff\1\u0181\5\uffff\1\u0180\127\uffff\1\u017f\12\uffff\1"+
            "\u0170\10\uffff\1\u0177\22\uffff\1\u0176\6\uffff\1\u0182\40"+
            "\uffff\1\u0177\6\uffff\1\u0177\104\uffff\1\u017c\1\u017b\1\u016c"+
            "\1\u016f\1\uffff\1\u0173\1\u0172\1\u017a\1\uffff\1\u0173\3\uffff"+
            "\1\u0183\3\uffff\1\u0172",
            "\1\u0185",
            "\1\u018e\1\u018f\1\u018b\3\uffff\1\170\3\uffff\2\u018c\1\uffff"+
            "\1\u0187\2\uffff\1\u0192\1\u0193\1\uffff\1\u0198\1\u0197\10"+
            "\uffff\1\u019b\5\uffff\1\u019a\127\uffff\1\u0199\12\uffff\1"+
            "\u018a\10\uffff\1\u0191\22\uffff\1\u0190\6\uffff\1\u019c\40"+
            "\uffff\1\u0191\6\uffff\1\u0191\104\uffff\1\u0196\1\u0195\1\u0186"+
            "\1\u0189\1\uffff\1\u018d\1\u018c\1\u0194\1\uffff\1\u018d\3\uffff"+
            "\1\u019d\3\uffff\1\u018c",
            "\1\u01a7\1\u01a8\1\u01a4\3\uffff\1\170\3\uffff\2\u01a5\1\uffff"+
            "\1\u01a0\2\uffff\1\u01ab\1\u01ac\1\uffff\1\u01b1\1\u01b0\10"+
            "\uffff\1\u01b4\5\uffff\1\u01b3\127\uffff\1\u01b2\12\uffff\1"+
            "\u01a3\10\uffff\1\u01aa\22\uffff\1\u01a9\6\uffff\1\u01b5\40"+
            "\uffff\1\u01aa\6\uffff\1\u01aa\104\uffff\1\u01af\1\u01ae\1\u019f"+
            "\1\u01a2\1\uffff\1\u01a6\1\u01a5\1\u01ad\1\uffff\1\u01a6\3\uffff"+
            "\1\u01b6\3\uffff\1\u01a5",
            "\1\u01c0\1\u01c1\1\u01bd\3\uffff\1\170\3\uffff\2\u01be\1\uffff"+
            "\1\u01b8\2\uffff\1\u01c4\1\u01c5\1\uffff\1\u01ca\1\u01c9\10"+
            "\uffff\1\u01cd\5\uffff\1\u01cc\127\uffff\1\u01cb\12\uffff\1"+
            "\u01bc\10\uffff\1\u01c3\22\uffff\1\u01c2\6\uffff\1\u01ce\40"+
            "\uffff\1\u01c3\6\uffff\1\u01c3\104\uffff\1\u01c8\1\u01c7\1\u01b9"+
            "\1\u01bb\1\uffff\1\u01bf\1\u01be\1\u01c6\1\uffff\1\u01bf\3\uffff"+
            "\1\u01cf\3\uffff\1\u01be",
            "\1\u01d9\1\u01da\1\u01d6\3\uffff\1\170\3\uffff\2\u01d7\1\uffff"+
            "\1\u01d1\2\uffff\1\u01dd\1\u01de\1\uffff\1\u01e3\1\u01e2\10"+
            "\uffff\1\u01e6\5\uffff\1\u01e5\127\uffff\1\u01e4\12\uffff\1"+
            "\u01d5\10\uffff\1\u01dc\22\uffff\1\u01db\6\uffff\1\u01e7\40"+
            "\uffff\1\u01dc\6\uffff\1\u01dc\104\uffff\1\u01e1\1\u01e0\1\u01d2"+
            "\1\u01d4\1\uffff\1\u01d8\1\u01d7\1\u01df\1\uffff\1\u01d8\3\uffff"+
            "\1\u01e8\3\uffff\1\u01d7",
            "\1\u01f0\5\uffff\1\u01f4\4\uffff\1\u01f3\7\uffff\1\u01fe\6"+
            "\u0201\1\uffff\1\u0201\1\u01fa\14\u0201\1\u01f8\1\u01f7\1\u0201"+
            "\1\uffff\4\u0201\1\uffff\10\u0201\1\uffff\1\u0201\1\uffff\2"+
            "\u0201\1\uffff\1\u0201\1\u01ed\16\u0201\1\uffff\4\u0201\1\uffff"+
            "\1\u0201\1\uffff\1\u0201\1\uffff\1\u0201\1\u01ff\2\u0201\1\uffff"+
            "\1\u0201\1\u01f6\6\u0201\1\uffff\3\u0201\1\uffff\1\u0201\1\uffff"+
            "\4\u0201\1\uffff\2\u0201\1\u01f9\20\u0201\1\uffff\4\u0201\1"+
            "\uffff\12\u0201\1\uffff\1\u01fb\3\u0201\1\uffff\3\u0201\1\u01ea"+
            "\1\u0201\1\u01ec\2\u0201\1\uffff\1\u0201\1\uffff\6\u0201\1\uffff"+
            "\3\u0201\1\uffff\5\u0201\2\uffff\15\u0201\1\uffff\17\u0201\1"+
            "\uffff\22\u0201\1\u01fc\2\u0201\1\uffff\4\u0201\1\uffff\5\u0201"+
            "\1\uffff\1\u0201\1\u01f5\2\u0201\1\uffff\2\u0201\1\u01fd\1\uffff"+
            "\12\u0201\1\uffff\1\u0201\2\uffff\1\u0201\1\uffff\1\u0201\3"+
            "\uffff\1\u0200\2\uffff\1\u01eb\2\uffff\1\u01ee\1\u01eb\10\uffff"+
            "\1\u01f1\1\u01ef\1\u01eb\1\u01f2",
            "\1\u020a\1\u020b\1\u0207\3\uffff\1\170\3\uffff\2\u0208\1\uffff"+
            "\1\u0202\2\uffff\1\u020e\1\u020f\1\uffff\1\u0214\1\u0213\10"+
            "\uffff\1\u0217\5\uffff\1\u0216\127\uffff\1\u0215\12\uffff\1"+
            "\u0206\10\uffff\1\u020d\22\uffff\1\u020c\6\uffff\1\u0218\40"+
            "\uffff\1\u020d\6\uffff\1\u020d\104\uffff\1\u0212\1\u0211\1\u0203"+
            "\1\u0205\1\uffff\1\u0209\1\u0208\1\u0210\1\uffff\1\u0209\3\uffff"+
            "\1\u0219\3\uffff\1\u0208",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
    static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
    static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
    static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
    static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
    static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
    static final short[][] DFA6_transition;

    static {
        int numStates = DFA6_transitionS.length;
        DFA6_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
        }
    }

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = DFA6_eot;
            this.eof = DFA6_eof;
            this.min = DFA6_min;
            this.max = DFA6_max;
            this.accept = DFA6_accept;
            this.special = DFA6_special;
            this.transition = DFA6_transition;
        }
        public String getDescription() {
            return "65:1: groupingSetExpression : ( groupByExpression -> ^( TOK_GROUPING_SETS_EXPRESSION groupByExpression ) | LPAREN groupByExpression ( COMMA groupByExpression )* RPAREN -> ^( TOK_GROUPING_SETS_EXPRESSION ( groupByExpression )+ ) | LPAREN RPAREN -> ^( TOK_GROUPING_SETS_EXPRESSION ) );";
        }
    }
    static final String DFA26_eotS =
        "\101\uffff";
    static final String DFA26_eofS =
        "\1\2\100\uffff";
    static final String DFA26_minS =
        "\1\4\100\uffff";
    static final String DFA26_maxS =
        "\1\u012b\100\uffff";
    static final String DFA26_acceptS =
        "\1\uffff\1\1\1\2\76\uffff";
    static final String DFA26_specialS =
        "\101\uffff}>";
    static final String[] DFA26_transitionS = {
            "\3\2\3\uffff\1\2\3\uffff\2\2\1\uffff\1\2\2\uffff\2\2\1\uffff"+
            "\2\2\1\uffff\26\2\2\uffff\1\2\1\uffff\4\2\1\uffff\12\2\1\uffff"+
            "\2\2\1\uffff\20\2\1\uffff\10\2\1\uffff\4\2\1\uffff\10\2\1\uffff"+
            "\5\2\1\uffff\7\2\1\uffff\25\2\1\uffff\12\2\1\uffff\4\2\1\uffff"+
            "\10\2\1\uffff\10\2\1\1\3\2\1\uffff\5\2\2\uffff\63\2\1\uffff"+
            "\12\2\1\uffff\4\2\1\uffff\3\2\1\uffff\12\2\1\uffff\6\2\1\uffff"+
            "\2\2\1\uffff\1\2\1\uffff\3\2\1\uffff\1\2\3\uffff\2\2\2\uffff"+
            "\1\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA26_eot = DFA.unpackEncodedString(DFA26_eotS);
    static final short[] DFA26_eof = DFA.unpackEncodedString(DFA26_eofS);
    static final char[] DFA26_min = DFA.unpackEncodedStringToUnsignedChars(DFA26_minS);
    static final char[] DFA26_max = DFA.unpackEncodedStringToUnsignedChars(DFA26_maxS);
    static final short[] DFA26_accept = DFA.unpackEncodedString(DFA26_acceptS);
    static final short[] DFA26_special = DFA.unpackEncodedString(DFA26_specialS);
    static final short[][] DFA26_transition;

    static {
        int numStates = DFA26_transitionS.length;
        DFA26_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA26_transition[i] = DFA.unpackEncodedString(DFA26_transitionS[i]);
        }
    }

    class DFA26 extends DFA {

        public DFA26(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 26;
            this.eot = DFA26_eot;
            this.eof = DFA26_eof;
            this.min = DFA26_min;
            this.max = DFA26_max;
            this.accept = DFA26_accept;
            this.special = DFA26_special;
            this.transition = DFA26_transition;
        }
        public String getDescription() {
            return "176:12: ( KW_OVER ws= window_specification )?";
        }
    }
    static final String DFA32_eotS =
        "\113\uffff";
    static final String DFA32_eofS =
        "\3\uffff\1\13\107\uffff";
    static final String DFA32_minS =
        "\1\7\2\uffff\1\4\107\uffff";
    static final String DFA32_maxS =
        "\1\u012f\2\uffff\1\u012d\107\uffff";
    static final String DFA32_acceptS =
        "\1\uffff\1\1\1\2\1\uffff\1\5\1\6\1\7\1\10\1\11\1\12\1\uffff\1\3"+
        "\76\uffff\1\4";
    static final String DFA32_specialS =
        "\113\uffff}>";
    static final String[] DFA32_transitionS = {
            "\1\4\5\uffff\1\10\4\uffff\1\7\65\uffff\1\2\36\uffff\1\11\u0098"+
            "\uffff\1\11\41\uffff\1\1\11\uffff\1\5\1\3\1\uffff\1\6",
            "",
            "",
            "\3\13\3\uffff\1\13\3\uffff\2\13\1\uffff\1\13\2\uffff\2\13\1"+
            "\uffff\2\13\1\uffff\26\13\2\uffff\1\13\1\uffff\4\13\1\uffff"+
            "\12\13\1\uffff\2\13\1\uffff\20\13\1\uffff\10\13\1\uffff\4\13"+
            "\1\uffff\10\13\1\uffff\5\13\1\uffff\7\13\1\uffff\25\13\1\uffff"+
            "\12\13\1\uffff\4\13\1\uffff\10\13\1\uffff\10\13\1\uffff\3\13"+
            "\1\uffff\5\13\2\uffff\63\13\1\uffff\12\13\1\uffff\4\13\1\uffff"+
            "\3\13\1\uffff\12\13\1\uffff\6\13\1\uffff\2\13\1\uffff\1\13\1"+
            "\uffff\3\13\1\uffff\1\13\3\uffff\2\13\2\uffff\1\13\1\uffff\1"+
            "\112",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA32_eot = DFA.unpackEncodedString(DFA32_eotS);
    static final short[] DFA32_eof = DFA.unpackEncodedString(DFA32_eofS);
    static final char[] DFA32_min = DFA.unpackEncodedStringToUnsignedChars(DFA32_minS);
    static final char[] DFA32_max = DFA.unpackEncodedStringToUnsignedChars(DFA32_maxS);
    static final short[] DFA32_accept = DFA.unpackEncodedString(DFA32_acceptS);
    static final short[] DFA32_special = DFA.unpackEncodedString(DFA32_specialS);
    static final short[][] DFA32_transition;

    static {
        int numStates = DFA32_transitionS.length;
        DFA32_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA32_transition[i] = DFA.unpackEncodedString(DFA32_transitionS[i]);
        }
    }

    class DFA32 extends DFA {

        public DFA32(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 32;
            this.eot = DFA32_eot;
            this.eof = DFA32_eof;
            this.min = DFA32_min;
            this.max = DFA32_max;
            this.accept = DFA32_accept;
            this.special = DFA32_special;
            this.transition = DFA32_transition;
        }
        public String getDescription() {
            return "221:1: constant : ( Number | dateLiteral | StringLiteral | stringLiteralSequence | BigintLiteral | SmallintLiteral | TinyintLiteral | DecimalLiteral | charSetStringLiteral | booleanValue );";
        }
    }
    static final String DFA33_eotS =
        "\101\uffff";
    static final String DFA33_eofS =
        "\1\1\100\uffff";
    static final String DFA33_minS =
        "\1\4\100\uffff";
    static final String DFA33_maxS =
        "\1\u012d\100\uffff";
    static final String DFA33_acceptS =
        "\1\uffff\1\2\76\uffff\1\1";
    static final String DFA33_specialS =
        "\101\uffff}>";
    static final String[] DFA33_transitionS = {
            "\3\1\3\uffff\1\1\3\uffff\2\1\1\uffff\1\1\2\uffff\2\1\1\uffff"+
            "\2\1\1\uffff\26\1\2\uffff\1\1\1\uffff\4\1\1\uffff\12\1\1\uffff"+
            "\2\1\1\uffff\20\1\1\uffff\10\1\1\uffff\4\1\1\uffff\10\1\1\uffff"+
            "\5\1\1\uffff\7\1\1\uffff\25\1\1\uffff\12\1\1\uffff\4\1\1\uffff"+
            "\10\1\1\uffff\10\1\1\uffff\3\1\1\uffff\5\1\2\uffff\63\1\1\uffff"+
            "\12\1\1\uffff\4\1\1\uffff\3\1\1\uffff\12\1\1\uffff\6\1\1\uffff"+
            "\2\1\1\uffff\1\1\1\uffff\3\1\1\uffff\1\1\3\uffff\2\1\2\uffff"+
            "\1\1\1\uffff\1\100",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA33_eot = DFA.unpackEncodedString(DFA33_eotS);
    static final short[] DFA33_eof = DFA.unpackEncodedString(DFA33_eofS);
    static final char[] DFA33_min = DFA.unpackEncodedStringToUnsignedChars(DFA33_minS);
    static final char[] DFA33_max = DFA.unpackEncodedStringToUnsignedChars(DFA33_maxS);
    static final short[] DFA33_accept = DFA.unpackEncodedString(DFA33_acceptS);
    static final short[] DFA33_special = DFA.unpackEncodedString(DFA33_specialS);
    static final short[][] DFA33_transition;

    static {
        int numStates = DFA33_transitionS.length;
        DFA33_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA33_transition[i] = DFA.unpackEncodedString(DFA33_transitionS[i]);
        }
    }

    class DFA33 extends DFA {

        public DFA33(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 33;
            this.eot = DFA33_eot;
            this.eof = DFA33_eof;
            this.min = DFA33_min;
            this.max = DFA33_max;
            this.accept = DFA33_accept;
            this.special = DFA33_special;
            this.transition = DFA33_transition;
        }
        public String getDescription() {
            return "()+ loopback of 239:19: ( StringLiteral )+";
        }
    }
    static final String DFA34_eotS =
        "\u0282\uffff";
    static final String DFA34_eofS =
        "\1\uffff\1\26\1\131\7\uffff\2\3\3\uffff\1\131\1\uffff\4\131\u026d"+
        "\uffff";
    static final String DFA34_minS =
        "\1\7\2\4\7\uffff\2\4\1\uffff\1\7\1\uffff\1\4\1\uffff\4\4\2\uffff"+
        "\1\32\77\uffff\1\32\100\uffff\1\32\77\uffff\1\32\130\uffff\1\32"+
        "\77\uffff\1\32\77\uffff\1\32\76\uffff\1\32\77\uffff\1\32\77\uffff"+
        "\22\0";
    static final String DFA34_maxS =
        "\1\u012f\1\u012b\1\u012d\7\uffff\2\u012b\1\uffff\1\u012f\1\uffff"+
        "\1\u012b\1\uffff\4\u012b\2\uffff\1\u0118\77\uffff\1\u0118\100\uffff"+
        "\1\u0118\77\uffff\1\u0118\130\uffff\1\u0118\77\uffff\1\u0118\77"+
        "\uffff\1\u0118\76\uffff\1\u0118\77\uffff\1\u0118\77\uffff\22\0";
    static final String DFA34_acceptS =
        "\3\uffff\1\3\10\uffff\1\4\1\uffff\1\7\1\uffff\1\7\4\uffff\1\11\1"+
        "\1\76\uffff\1\7\1\2\1\uffff\1\7\1\10\174\uffff\1\7\77\uffff\1\7"+
        "\1\5\27\uffff\1\6\1\7\77\uffff\1\7\77\uffff\1\7\100\uffff\1\7\77"+
        "\uffff\1\7\120\uffff";
    static final String DFA34_specialS =
        "\1\0\1\1\1\2\7\uffff\1\3\1\4\3\uffff\1\5\1\uffff\1\6\1\7\1\10\1"+
        "\11\u025b\uffff\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23"+
        "\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33}>";
    static final String[] DFA34_transitionS = {
            "\1\3\5\uffff\1\3\4\uffff\1\3\7\uffff\1\23\6\24\1\uffff\1\24"+
            "\1\17\14\24\1\15\1\14\1\24\1\uffff\4\24\1\uffff\10\24\1\uffff"+
            "\1\24\1\uffff\2\24\1\uffff\1\24\1\2\16\24\1\uffff\4\24\1\uffff"+
            "\1\24\1\uffff\1\24\1\uffff\4\24\1\uffff\1\24\1\13\6\24\1\uffff"+
            "\3\24\1\uffff\1\24\1\uffff\4\24\1\uffff\2\24\1\16\20\24\1\uffff"+
            "\4\24\1\uffff\12\24\1\uffff\1\20\3\24\1\uffff\3\24\1\uffff\1"+
            "\24\1\1\2\24\1\uffff\1\24\1\uffff\6\24\1\uffff\3\24\1\uffff"+
            "\5\24\2\uffff\15\24\1\uffff\17\24\1\uffff\22\24\1\21\2\24\1"+
            "\uffff\4\24\1\uffff\5\24\1\uffff\1\24\1\12\2\24\1\uffff\2\24"+
            "\1\22\1\uffff\12\24\1\uffff\1\24\2\uffff\1\24\1\uffff\1\24\3"+
            "\uffff\1\25\5\uffff\1\3\11\uffff\2\3\1\uffff\1\3",
            "\3\26\3\uffff\1\26\3\uffff\2\26\1\uffff\1\27\2\uffff\2\26\1"+
            "\uffff\2\26\1\uffff\26\26\2\uffff\1\26\1\uffff\4\26\1\uffff"+
            "\12\26\1\uffff\2\26\1\uffff\20\26\1\uffff\10\26\1\uffff\4\26"+
            "\1\uffff\10\26\1\uffff\5\26\1\uffff\7\26\1\uffff\25\26\1\uffff"+
            "\12\26\1\uffff\4\26\1\uffff\10\26\1\uffff\10\26\1\uffff\3\26"+
            "\1\uffff\5\26\2\uffff\63\26\1\uffff\12\26\1\uffff\4\26\1\uffff"+
            "\3\26\1\uffff\12\26\1\uffff\6\26\1\uffff\2\26\1\125\1\26\1\uffff"+
            "\3\26\1\uffff\1\26\3\uffff\2\26\2\uffff\1\26",
            "\3\131\3\uffff\1\131\3\uffff\2\131\1\uffff\1\127\2\uffff\2"+
            "\131\1\uffff\2\131\1\uffff\26\131\2\uffff\1\131\1\uffff\4\131"+
            "\1\uffff\12\131\1\uffff\2\131\1\uffff\20\131\1\uffff\10\131"+
            "\1\uffff\4\131\1\uffff\10\131\1\uffff\5\131\1\uffff\7\131\1"+
            "\uffff\25\131\1\uffff\12\131\1\uffff\4\131\1\uffff\10\131\1"+
            "\uffff\10\131\1\uffff\3\131\1\uffff\5\131\2\uffff\63\131\1\uffff"+
            "\12\131\1\uffff\4\131\1\uffff\3\131\1\uffff\12\131\1\uffff\6"+
            "\131\1\uffff\2\131\1\130\1\131\1\uffff\3\131\1\uffff\1\131\3"+
            "\uffff\2\131\2\uffff\1\131\1\uffff\1\126",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\3\3\3\uffff\1\3\3\uffff\2\3\1\uffff\1\u0098\2\uffff\2\3\1"+
            "\uffff\2\3\1\uffff\26\3\2\uffff\1\3\1\uffff\4\3\1\uffff\12\3"+
            "\1\uffff\2\3\1\uffff\20\3\1\uffff\10\3\1\uffff\4\3\1\uffff\10"+
            "\3\1\uffff\5\3\1\uffff\7\3\1\uffff\25\3\1\uffff\12\3\1\uffff"+
            "\4\3\1\uffff\10\3\1\uffff\10\3\1\uffff\3\3\1\uffff\5\3\2\uffff"+
            "\63\3\1\uffff\12\3\1\uffff\4\3\1\uffff\3\3\1\uffff\12\3\1\uffff"+
            "\6\3\1\uffff\2\3\1\u00d6\1\3\1\uffff\3\3\1\uffff\1\3\3\uffff"+
            "\2\3\2\uffff\1\3",
            "\3\3\3\uffff\1\3\3\uffff\2\3\1\uffff\1\u00d8\2\uffff\2\3\1"+
            "\uffff\2\3\1\uffff\26\3\2\uffff\1\3\1\uffff\4\3\1\uffff\12\3"+
            "\1\uffff\2\3\1\uffff\20\3\1\uffff\10\3\1\uffff\4\3\1\uffff\10"+
            "\3\1\uffff\5\3\1\uffff\7\3\1\uffff\25\3\1\uffff\12\3\1\uffff"+
            "\4\3\1\uffff\10\3\1\uffff\10\3\1\uffff\3\3\1\uffff\5\3\2\uffff"+
            "\63\3\1\uffff\12\3\1\uffff\4\3\1\uffff\3\3\1\uffff\12\3\1\uffff"+
            "\6\3\1\uffff\2\3\1\u0116\1\3\1\uffff\3\3\1\uffff\1\3\3\uffff"+
            "\2\3\2\uffff\1\3",
            "",
            "\1\u0117\5\uffff\1\u0117\4\uffff\1\u0117\7\uffff\7\u0117\1"+
            "\uffff\21\u0117\1\uffff\4\u0117\1\uffff\10\u0117\1\uffff\1\u0117"+
            "\1\uffff\2\u0117\1\uffff\20\u0117\1\uffff\4\u0117\1\uffff\1"+
            "\u0117\1\uffff\1\u0117\1\uffff\4\u0117\1\uffff\10\u0117\1\uffff"+
            "\3\u0117\1\uffff\1\u0117\1\uffff\4\u0117\1\uffff\23\u0117\1"+
            "\uffff\4\u0117\1\uffff\12\u0117\1\uffff\4\u0117\1\uffff\10\u0117"+
            "\1\uffff\1\u0117\1\uffff\6\u0117\1\uffff\3\u0117\1\uffff\5\u0117"+
            "\2\uffff\15\u0117\1\uffff\17\u0117\1\uffff\25\u0117\1\uffff"+
            "\4\u0117\1\uffff\5\u0117\1\uffff\4\u0117\1\uffff\3\u0117\1\uffff"+
            "\12\u0117\1\uffff\1\u0117\1\u012f\1\uffff\1\u0117\1\uffff\1"+
            "\u0117\3\uffff\1\u0117\2\uffff\1\u0117\2\uffff\2\u0117\10\uffff"+
            "\4\u0117",
            "",
            "\3\131\3\uffff\1\131\3\uffff\2\131\1\uffff\1\u0131\2\uffff"+
            "\2\131\1\uffff\2\131\1\uffff\26\131\2\uffff\1\131\1\uffff\4"+
            "\131\1\uffff\12\131\1\uffff\2\131\1\uffff\20\131\1\uffff\10"+
            "\131\1\uffff\4\131\1\uffff\10\131\1\uffff\5\131\1\uffff\7\131"+
            "\1\uffff\25\131\1\uffff\12\131\1\uffff\4\131\1\uffff\10\131"+
            "\1\uffff\10\131\1\uffff\3\131\1\uffff\5\131\2\uffff\63\131\1"+
            "\uffff\12\131\1\uffff\4\131\1\uffff\3\131\1\uffff\12\131\1\uffff"+
            "\6\131\1\uffff\2\131\1\u0130\1\131\1\uffff\3\131\1\uffff\1\131"+
            "\3\uffff\2\131\2\uffff\1\131",
            "",
            "\3\131\3\uffff\1\131\3\uffff\2\131\1\uffff\1\u0171\2\uffff"+
            "\2\131\1\uffff\2\131\1\uffff\26\131\2\uffff\1\131\1\uffff\4"+
            "\131\1\uffff\12\131\1\uffff\2\131\1\uffff\20\131\1\uffff\10"+
            "\131\1\uffff\4\131\1\uffff\10\131\1\uffff\5\131\1\uffff\7\131"+
            "\1\uffff\25\131\1\uffff\12\131\1\uffff\4\131\1\uffff\10\131"+
            "\1\uffff\10\131\1\uffff\3\131\1\uffff\5\131\2\uffff\63\131\1"+
            "\uffff\12\131\1\uffff\4\131\1\uffff\3\131\1\uffff\12\131\1\uffff"+
            "\6\131\1\uffff\2\131\1\u0170\1\131\1\uffff\3\131\1\uffff\1\131"+
            "\3\uffff\2\131\2\uffff\1\131",
            "\3\131\3\uffff\1\131\3\uffff\2\131\1\uffff\1\u01b1\2\uffff"+
            "\2\131\1\uffff\2\131\1\uffff\26\131\2\uffff\1\131\1\uffff\4"+
            "\131\1\uffff\12\131\1\uffff\2\131\1\uffff\20\131\1\uffff\10"+
            "\131\1\uffff\4\131\1\uffff\10\131\1\uffff\5\131\1\uffff\7\131"+
            "\1\uffff\25\131\1\uffff\12\131\1\uffff\4\131\1\uffff\10\131"+
            "\1\uffff\10\131\1\uffff\3\131\1\uffff\5\131\2\uffff\63\131\1"+
            "\uffff\12\131\1\uffff\4\131\1\uffff\3\131\1\uffff\12\131\1\uffff"+
            "\6\131\1\uffff\2\131\1\u01b0\1\131\1\uffff\3\131\1\uffff\1\131"+
            "\3\uffff\2\131\2\uffff\1\131",
            "\3\131\3\uffff\1\131\3\uffff\2\131\1\uffff\1\u01f0\2\uffff"+
            "\2\131\1\uffff\2\131\1\uffff\26\131\2\uffff\1\131\1\uffff\4"+
            "\131\1\uffff\12\131\1\uffff\2\131\1\uffff\20\131\1\uffff\10"+
            "\131\1\uffff\4\131\1\uffff\10\131\1\uffff\5\131\1\uffff\7\131"+
            "\1\uffff\25\131\1\uffff\12\131\1\uffff\4\131\1\uffff\10\131"+
            "\1\uffff\10\131\1\uffff\3\131\1\uffff\5\131\2\uffff\63\131\1"+
            "\uffff\12\131\1\uffff\4\131\1\uffff\3\131\1\uffff\12\131\1\uffff"+
            "\6\131\1\uffff\2\131\1\u01f1\1\131\1\uffff\3\131\1\uffff\1\131"+
            "\3\uffff\2\131\2\uffff\1\131",
            "\3\131\3\uffff\1\131\3\uffff\2\131\1\uffff\1\u0230\2\uffff"+
            "\2\131\1\uffff\2\131\1\uffff\26\131\2\uffff\1\131\1\uffff\4"+
            "\131\1\uffff\12\131\1\uffff\2\131\1\uffff\20\131\1\uffff\10"+
            "\131\1\uffff\4\131\1\uffff\10\131\1\uffff\5\131\1\uffff\7\131"+
            "\1\uffff\25\131\1\uffff\12\131\1\uffff\4\131\1\uffff\10\131"+
            "\1\uffff\10\131\1\uffff\3\131\1\uffff\5\131\2\uffff\63\131\1"+
            "\uffff\12\131\1\uffff\4\131\1\uffff\3\131\1\uffff\12\131\1\uffff"+
            "\6\131\1\uffff\2\131\1\u0231\1\131\1\uffff\3\131\1\uffff\1\131"+
            "\3\uffff\2\131\2\uffff\1\131",
            "",
            "",
            "\1\u0270\6\u0271\1\uffff\16\u0271\2\uffff\1\u0271\1\uffff\4"+
            "\u0271\1\uffff\10\u0271\1\uffff\1\u0271\1\uffff\2\u0271\1\uffff"+
            "\20\u0271\1\uffff\4\u0271\1\uffff\1\u0271\1\uffff\1\u0271\1"+
            "\uffff\4\u0271\1\uffff\10\u0271\1\uffff\3\u0271\1\uffff\1\u0271"+
            "\1\uffff\4\u0271\1\uffff\2\u0271\1\uffff\20\u0271\1\uffff\4"+
            "\u0271\1\uffff\12\u0271\2\uffff\3\u0271\1\uffff\3\u0271\1\uffff"+
            "\4\u0271\1\uffff\1\u0271\1\uffff\6\u0271\1\uffff\3\u0271\1\uffff"+
            "\5\u0271\2\uffff\15\u0271\1\uffff\17\u0271\1\uffff\25\u0271"+
            "\1\uffff\4\u0271\1\uffff\5\u0271\1\uffff\4\u0271\1\uffff\3\u0271"+
            "\1\uffff\12\u0271\1\uffff\1\u0271\2\uffff\1\u0271\1\uffff\1"+
            "\u0271",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0272\6\u0273\1\uffff\16\u0273\2\uffff\1\u0273\1\uffff\4"+
            "\u0273\1\uffff\10\u0273\1\uffff\1\u0273\1\uffff\2\u0273\1\uffff"+
            "\20\u0273\1\uffff\4\u0273\1\uffff\1\u0273\1\uffff\1\u0273\1"+
            "\uffff\4\u0273\1\uffff\10\u0273\1\uffff\3\u0273\1\uffff\1\u0273"+
            "\1\uffff\4\u0273\1\uffff\2\u0273\1\uffff\20\u0273\1\uffff\4"+
            "\u0273\1\uffff\12\u0273\2\uffff\3\u0273\1\uffff\3\u0273\1\uffff"+
            "\4\u0273\1\uffff\1\u0273\1\uffff\6\u0273\1\uffff\3\u0273\1\uffff"+
            "\5\u0273\2\uffff\15\u0273\1\uffff\17\u0273\1\uffff\25\u0273"+
            "\1\uffff\4\u0273\1\uffff\5\u0273\1\uffff\4\u0273\1\uffff\3\u0273"+
            "\1\uffff\12\u0273\1\uffff\1\u0273\2\uffff\1\u0273\1\uffff\1"+
            "\u0273",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0274\6\u0275\1\uffff\16\u0275\2\uffff\1\u0275\1\uffff\4"+
            "\u0275\1\uffff\10\u0275\1\uffff\1\u0275\1\uffff\2\u0275\1\uffff"+
            "\20\u0275\1\uffff\4\u0275\1\uffff\1\u0275\1\uffff\1\u0275\1"+
            "\uffff\4\u0275\1\uffff\10\u0275\1\uffff\3\u0275\1\uffff\1\u0275"+
            "\1\uffff\4\u0275\1\uffff\2\u0275\1\uffff\20\u0275\1\uffff\4"+
            "\u0275\1\uffff\12\u0275\2\uffff\3\u0275\1\uffff\3\u0275\1\uffff"+
            "\4\u0275\1\uffff\1\u0275\1\uffff\6\u0275\1\uffff\3\u0275\1\uffff"+
            "\5\u0275\2\uffff\15\u0275\1\uffff\17\u0275\1\uffff\25\u0275"+
            "\1\uffff\4\u0275\1\uffff\5\u0275\1\uffff\4\u0275\1\uffff\3\u0275"+
            "\1\uffff\12\u0275\1\uffff\1\u0275\2\uffff\1\u0275\1\uffff\1"+
            "\u0275",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0276\6\u0277\1\uffff\16\u0277\2\uffff\1\u0277\1\uffff\4"+
            "\u0277\1\uffff\10\u0277\1\uffff\1\u0277\1\uffff\2\u0277\1\uffff"+
            "\20\u0277\1\uffff\4\u0277\1\uffff\1\u0277\1\uffff\1\u0277\1"+
            "\uffff\4\u0277\1\uffff\10\u0277\1\uffff\3\u0277\1\uffff\1\u0277"+
            "\1\uffff\4\u0277\1\uffff\2\u0277\1\uffff\20\u0277\1\uffff\4"+
            "\u0277\1\uffff\12\u0277\2\uffff\3\u0277\1\uffff\3\u0277\1\uffff"+
            "\4\u0277\1\uffff\1\u0277\1\uffff\6\u0277\1\uffff\3\u0277\1\uffff"+
            "\5\u0277\2\uffff\15\u0277\1\uffff\17\u0277\1\uffff\25\u0277"+
            "\1\uffff\4\u0277\1\uffff\5\u0277\1\uffff\4\u0277\1\uffff\3\u0277"+
            "\1\uffff\12\u0277\1\uffff\1\u0277\2\uffff\1\u0277\1\uffff\1"+
            "\u0277",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0278\6\u0279\1\uffff\16\u0279\2\uffff\1\u0279\1\uffff\4"+
            "\u0279\1\uffff\10\u0279\1\uffff\1\u0279\1\uffff\2\u0279\1\uffff"+
            "\20\u0279\1\uffff\4\u0279\1\uffff\1\u0279\1\uffff\1\u0279\1"+
            "\uffff\4\u0279\1\uffff\10\u0279\1\uffff\3\u0279\1\uffff\1\u0279"+
            "\1\uffff\4\u0279\1\uffff\2\u0279\1\uffff\20\u0279\1\uffff\4"+
            "\u0279\1\uffff\12\u0279\2\uffff\3\u0279\1\uffff\3\u0279\1\uffff"+
            "\4\u0279\1\uffff\1\u0279\1\uffff\6\u0279\1\uffff\3\u0279\1\uffff"+
            "\5\u0279\2\uffff\15\u0279\1\uffff\17\u0279\1\uffff\25\u0279"+
            "\1\uffff\4\u0279\1\uffff\5\u0279\1\uffff\4\u0279\1\uffff\3\u0279"+
            "\1\uffff\12\u0279\1\uffff\1\u0279\2\uffff\1\u0279\1\uffff\1"+
            "\u0279",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u027a\6\u027b\1\uffff\16\u027b\2\uffff\1\u027b\1\uffff\4"+
            "\u027b\1\uffff\10\u027b\1\uffff\1\u027b\1\uffff\2\u027b\1\uffff"+
            "\20\u027b\1\uffff\4\u027b\1\uffff\1\u027b\1\uffff\1\u027b\1"+
            "\uffff\4\u027b\1\uffff\10\u027b\1\uffff\3\u027b\1\uffff\1\u027b"+
            "\1\uffff\4\u027b\1\uffff\2\u027b\1\uffff\20\u027b\1\uffff\4"+
            "\u027b\1\uffff\12\u027b\2\uffff\3\u027b\1\uffff\3\u027b\1\uffff"+
            "\4\u027b\1\uffff\1\u027b\1\uffff\6\u027b\1\uffff\3\u027b\1\uffff"+
            "\5\u027b\2\uffff\15\u027b\1\uffff\17\u027b\1\uffff\25\u027b"+
            "\1\uffff\4\u027b\1\uffff\5\u027b\1\uffff\4\u027b\1\uffff\3\u027b"+
            "\1\uffff\12\u027b\1\uffff\1\u027b\2\uffff\1\u027b\1\uffff\1"+
            "\u027b",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u027c\6\u027d\1\uffff\16\u027d\2\uffff\1\u027d\1\uffff\4"+
            "\u027d\1\uffff\10\u027d\1\uffff\1\u027d\1\uffff\2\u027d\1\uffff"+
            "\20\u027d\1\uffff\4\u027d\1\uffff\1\u027d\1\uffff\1\u027d\1"+
            "\uffff\4\u027d\1\uffff\10\u027d\1\uffff\3\u027d\1\uffff\1\u027d"+
            "\1\uffff\4\u027d\1\uffff\2\u027d\1\uffff\20\u027d\1\uffff\4"+
            "\u027d\1\uffff\12\u027d\2\uffff\3\u027d\1\uffff\3\u027d\1\uffff"+
            "\4\u027d\1\uffff\1\u027d\1\uffff\6\u027d\1\uffff\3\u027d\1\uffff"+
            "\5\u027d\2\uffff\15\u027d\1\uffff\17\u027d\1\uffff\25\u027d"+
            "\1\uffff\4\u027d\1\uffff\5\u027d\1\uffff\4\u027d\1\uffff\3\u027d"+
            "\1\uffff\12\u027d\1\uffff\1\u027d\2\uffff\1\u027d\1\uffff\1"+
            "\u027d",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u027e\6\u027f\1\uffff\16\u027f\2\uffff\1\u027f\1\uffff\4"+
            "\u027f\1\uffff\10\u027f\1\uffff\1\u027f\1\uffff\2\u027f\1\uffff"+
            "\20\u027f\1\uffff\4\u027f\1\uffff\1\u027f\1\uffff\1\u027f\1"+
            "\uffff\4\u027f\1\uffff\10\u027f\1\uffff\3\u027f\1\uffff\1\u027f"+
            "\1\uffff\4\u027f\1\uffff\2\u027f\1\uffff\20\u027f\1\uffff\4"+
            "\u027f\1\uffff\12\u027f\2\uffff\3\u027f\1\uffff\3\u027f\1\uffff"+
            "\4\u027f\1\uffff\1\u027f\1\uffff\6\u027f\1\uffff\3\u027f\1\uffff"+
            "\5\u027f\2\uffff\15\u027f\1\uffff\17\u027f\1\uffff\25\u027f"+
            "\1\uffff\4\u027f\1\uffff\5\u027f\1\uffff\4\u027f\1\uffff\3\u027f"+
            "\1\uffff\12\u027f\1\uffff\1\u027f\2\uffff\1\u027f\1\uffff\1"+
            "\u027f",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0280\6\u0281\1\uffff\16\u0281\2\uffff\1\u0281\1\uffff\4"+
            "\u0281\1\uffff\10\u0281\1\uffff\1\u0281\1\uffff\2\u0281\1\uffff"+
            "\20\u0281\1\uffff\4\u0281\1\uffff\1\u0281\1\uffff\1\u0281\1"+
            "\uffff\4\u0281\1\uffff\10\u0281\1\uffff\3\u0281\1\uffff\1\u0281"+
            "\1\uffff\4\u0281\1\uffff\2\u0281\1\uffff\20\u0281\1\uffff\4"+
            "\u0281\1\uffff\12\u0281\2\uffff\3\u0281\1\uffff\3\u0281\1\uffff"+
            "\4\u0281\1\uffff\1\u0281\1\uffff\6\u0281\1\uffff\3\u0281\1\uffff"+
            "\5\u0281\2\uffff\15\u0281\1\uffff\17\u0281\1\uffff\25\u0281"+
            "\1\uffff\4\u0281\1\uffff\5\u0281\1\uffff\4\u0281\1\uffff\3\u0281"+
            "\1\uffff\12\u0281\1\uffff\1\u0281\2\uffff\1\u0281\1\uffff\1"+
            "\u0281",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff"
    };

    static final short[] DFA34_eot = DFA.unpackEncodedString(DFA34_eotS);
    static final short[] DFA34_eof = DFA.unpackEncodedString(DFA34_eofS);
    static final char[] DFA34_min = DFA.unpackEncodedStringToUnsignedChars(DFA34_minS);
    static final char[] DFA34_max = DFA.unpackEncodedStringToUnsignedChars(DFA34_maxS);
    static final short[] DFA34_accept = DFA.unpackEncodedString(DFA34_acceptS);
    static final short[] DFA34_special = DFA.unpackEncodedString(DFA34_specialS);
    static final short[][] DFA34_transition;

    static {
        int numStates = DFA34_transitionS.length;
        DFA34_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA34_transition[i] = DFA.unpackEncodedString(DFA34_transitionS[i]);
        }
    }

    class DFA34 extends DFA {

        public DFA34(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 34;
            this.eot = DFA34_eot;
            this.eof = DFA34_eof;
            this.min = DFA34_min;
            this.max = DFA34_max;
            this.accept = DFA34_accept;
            this.special = DFA34_special;
            this.transition = DFA34_transition;
        }
        public String getDescription() {
            return "266:1: atomExpression : ( KW_NULL -> TOK_NULL | dateLiteral | constant | castExpression | caseExpression | whenExpression | ( functionName LPAREN )=> function | tableOrColumn | LPAREN ! expression RPAREN !);";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA34_0 = input.LA(1);

                         
                        int index34_0 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (LA34_0==KW_NULL) ) {s = 1;}

                        else if ( (LA34_0==KW_DATE) ) {s = 2;}

                        else if ( (LA34_0==BigintLiteral||LA34_0==CharSetName||LA34_0==DecimalLiteral||LA34_0==Number||(LA34_0 >= SmallintLiteral && LA34_0 <= StringLiteral)||LA34_0==TinyintLiteral) ) {s = 3;}

                        else if ( (LA34_0==KW_TRUE) ) {s = 10;}

                        else if ( (LA34_0==KW_FALSE) ) {s = 11;}

                        else if ( (LA34_0==KW_CAST) ) {s = 12;}

                        else if ( (LA34_0==KW_CASE) ) {s = 13;}

                        else if ( (LA34_0==KW_IF) && (synpred5_IdentifiersParser())) {s = 14;}

                        else if ( (LA34_0==KW_ARRAY) ) {s = 15;}

                        else if ( (LA34_0==KW_MAP) && (synpred5_IdentifiersParser())) {s = 16;}

                        else if ( (LA34_0==KW_STRUCT) ) {s = 17;}

                        else if ( (LA34_0==KW_UNIONTYPE) ) {s = 18;}

                        else if ( (LA34_0==Identifier) ) {s = 19;}

                        else if ( ((LA34_0 >= KW_ADD && LA34_0 <= KW_ANALYZE)||LA34_0==KW_ARCHIVE||(LA34_0 >= KW_AS && LA34_0 <= KW_CASCADE)||LA34_0==KW_CHANGE||(LA34_0 >= KW_CLUSTER && LA34_0 <= KW_COLLECTION)||(LA34_0 >= KW_COLUMNS && LA34_0 <= KW_CREATE)||LA34_0==KW_CUBE||(LA34_0 >= KW_CURSOR && LA34_0 <= KW_DATA)||LA34_0==KW_DATABASES||(LA34_0 >= KW_DATETIME && LA34_0 <= KW_DISABLE)||(LA34_0 >= KW_DISTRIBUTE && LA34_0 <= KW_ELEM_TYPE)||LA34_0==KW_ENABLE||LA34_0==KW_ESCAPED||(LA34_0 >= KW_EXCLUSIVE && LA34_0 <= KW_EXPORT)||LA34_0==KW_EXTERNAL||(LA34_0 >= KW_FETCH && LA34_0 <= KW_FLOAT)||(LA34_0 >= KW_FOR && LA34_0 <= KW_FORMATTED)||LA34_0==KW_FULL||(LA34_0 >= KW_FUNCTIONS && LA34_0 <= KW_GROUPING)||(LA34_0 >= KW_HOLD_DDLTIME && LA34_0 <= KW_IDXPROPERTIES)||(LA34_0 >= KW_IGNORE && LA34_0 <= KW_JAR)||(LA34_0 >= KW_KEYS && LA34_0 <= KW_LEFT)||(LA34_0 >= KW_LIKE && LA34_0 <= KW_LONG)||(LA34_0 >= KW_MAPJOIN && LA34_0 <= KW_MINUS)||(LA34_0 >= KW_MSCK && LA34_0 <= KW_NOSCAN)||LA34_0==KW_NO_DROP||(LA34_0 >= KW_OF && LA34_0 <= KW_OFFLINE)||LA34_0==KW_OPTION||(LA34_0 >= KW_ORCFILE && LA34_0 <= KW_OUTPUTFORMAT)||(LA34_0 >= KW_OVERWRITE && LA34_0 <= KW_PARQUETFILE)||(LA34_0 >= KW_PARTITION && LA34_0 <= KW_PLUS)||(LA34_0 >= KW_PRETTY && LA34_0 <= KW_RECORDWRITER)||(LA34_0 >= KW_REGEXP && LA34_0 <= KW_SCHEMAS)||(LA34_0 >= KW_SEMI && LA34_0 <= KW_STRING)||(LA34_0 >= KW_TABLE && LA34_0 <= KW_TABLES)||(LA34_0 >= KW_TBLPROPERTIES && LA34_0 <= KW_TEXTFILE)||(LA34_0 >= KW_TIMESTAMP && LA34_0 <= KW_TRANSACTIONS)||LA34_0==KW_TRIGGER||(LA34_0 >= KW_TRUNCATE && LA34_0 <= KW_UNARCHIVE)||(LA34_0 >= KW_UNDO && LA34_0 <= KW_UNION)||(LA34_0 >= KW_UNLOCK && LA34_0 <= KW_VALUE_TYPE)||LA34_0==KW_VIEW||LA34_0==KW_WHILE||LA34_0==KW_WITH) ) {s = 20;}

                        else if ( (LA34_0==LPAREN) ) {s = 21;}

                         
                        input.seek(index34_0);

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA34_1 = input.LA(1);

                         
                        int index34_1 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (LA34_1==EOF||(LA34_1 >= AMPERSAND && LA34_1 <= BITWISEXOR)||LA34_1==COMMA||(LA34_1 >= DIV && LA34_1 <= DIVIDE)||(LA34_1 >= EQUAL && LA34_1 <= EQUAL_NS)||(LA34_1 >= GREATERTHAN && LA34_1 <= GREATERTHANOREQUALTO)||(LA34_1 >= Identifier && LA34_1 <= KW_CASCADE)||LA34_1==KW_CHANGE||(LA34_1 >= KW_CLUSTER && LA34_1 <= KW_COLLECTION)||(LA34_1 >= KW_COLUMNS && LA34_1 <= KW_CUBE)||(LA34_1 >= KW_CURSOR && LA34_1 <= KW_DATA)||(LA34_1 >= KW_DATABASES && LA34_1 <= KW_DISABLE)||(LA34_1 >= KW_DISTRIBUTE && LA34_1 <= KW_ESCAPED)||(LA34_1 >= KW_EXCLUSIVE && LA34_1 <= KW_EXPORT)||(LA34_1 >= KW_EXTERNAL && LA34_1 <= KW_FLOAT)||(LA34_1 >= KW_FOR && LA34_1 <= KW_FULL)||(LA34_1 >= KW_FUNCTIONS && LA34_1 <= KW_IDXPROPERTIES)||(LA34_1 >= KW_IGNORE && LA34_1 <= KW_LEFT)||(LA34_1 >= KW_LIKE && LA34_1 <= KW_LONG)||(LA34_1 >= KW_MAP && LA34_1 <= KW_MINUS)||(LA34_1 >= KW_MSCK && LA34_1 <= KW_OFFLINE)||(LA34_1 >= KW_OPTION && LA34_1 <= KW_OUTPUTFORMAT)||(LA34_1 >= KW_OVERWRITE && LA34_1 <= KW_PARQUETFILE)||(LA34_1 >= KW_PARTITION && LA34_1 <= KW_PLUS)||(LA34_1 >= KW_PRETTY && LA34_1 <= KW_TABLES)||(LA34_1 >= KW_TBLPROPERTIES && LA34_1 <= KW_TRANSACTIONS)||(LA34_1 >= KW_TRIGGER && LA34_1 <= KW_UNARCHIVE)||(LA34_1 >= KW_UNDO && LA34_1 <= KW_UNIONTYPE)||(LA34_1 >= KW_UNLOCK && LA34_1 <= KW_VALUE_TYPE)||(LA34_1 >= KW_VIEW && LA34_1 <= KW_WITH)||(LA34_1 >= LESSTHAN && LA34_1 <= LESSTHANOREQUALTO)||LA34_1==LSQUARE||(LA34_1 >= MINUS && LA34_1 <= NOTEQUAL)||LA34_1==PLUS||(LA34_1 >= RPAREN && LA34_1 <= RSQUARE)||LA34_1==STAR) ) {s = 22;}

                        else if ( (LA34_1==DOT) ) {s = 23;}

                        else if ( (LA34_1==LPAREN) && (synpred5_IdentifiersParser())) {s = 85;}

                         
                        input.seek(index34_1);

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA34_2 = input.LA(1);

                         
                        int index34_2 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (LA34_2==StringLiteral) ) {s = 86;}

                        else if ( (LA34_2==DOT) ) {s = 87;}

                        else if ( (LA34_2==LPAREN) && (synpred5_IdentifiersParser())) {s = 88;}

                        else if ( (LA34_2==EOF||(LA34_2 >= AMPERSAND && LA34_2 <= BITWISEXOR)||LA34_2==COMMA||(LA34_2 >= DIV && LA34_2 <= DIVIDE)||(LA34_2 >= EQUAL && LA34_2 <= EQUAL_NS)||(LA34_2 >= GREATERTHAN && LA34_2 <= GREATERTHANOREQUALTO)||(LA34_2 >= Identifier && LA34_2 <= KW_CASCADE)||LA34_2==KW_CHANGE||(LA34_2 >= KW_CLUSTER && LA34_2 <= KW_COLLECTION)||(LA34_2 >= KW_COLUMNS && LA34_2 <= KW_CUBE)||(LA34_2 >= KW_CURSOR && LA34_2 <= KW_DATA)||(LA34_2 >= KW_DATABASES && LA34_2 <= KW_DISABLE)||(LA34_2 >= KW_DISTRIBUTE && LA34_2 <= KW_ESCAPED)||(LA34_2 >= KW_EXCLUSIVE && LA34_2 <= KW_EXPORT)||(LA34_2 >= KW_EXTERNAL && LA34_2 <= KW_FLOAT)||(LA34_2 >= KW_FOR && LA34_2 <= KW_FULL)||(LA34_2 >= KW_FUNCTIONS && LA34_2 <= KW_IDXPROPERTIES)||(LA34_2 >= KW_IGNORE && LA34_2 <= KW_LEFT)||(LA34_2 >= KW_LIKE && LA34_2 <= KW_LONG)||(LA34_2 >= KW_MAP && LA34_2 <= KW_MINUS)||(LA34_2 >= KW_MSCK && LA34_2 <= KW_OFFLINE)||(LA34_2 >= KW_OPTION && LA34_2 <= KW_OUTPUTFORMAT)||(LA34_2 >= KW_OVERWRITE && LA34_2 <= KW_PARQUETFILE)||(LA34_2 >= KW_PARTITION && LA34_2 <= KW_PLUS)||(LA34_2 >= KW_PRETTY && LA34_2 <= KW_TABLES)||(LA34_2 >= KW_TBLPROPERTIES && LA34_2 <= KW_TRANSACTIONS)||(LA34_2 >= KW_TRIGGER && LA34_2 <= KW_UNARCHIVE)||(LA34_2 >= KW_UNDO && LA34_2 <= KW_UNIONTYPE)||(LA34_2 >= KW_UNLOCK && LA34_2 <= KW_VALUE_TYPE)||(LA34_2 >= KW_VIEW && LA34_2 <= KW_WITH)||(LA34_2 >= LESSTHAN && LA34_2 <= LESSTHANOREQUALTO)||LA34_2==LSQUARE||(LA34_2 >= MINUS && LA34_2 <= NOTEQUAL)||LA34_2==PLUS||(LA34_2 >= RPAREN && LA34_2 <= RSQUARE)||LA34_2==STAR) ) {s = 89;}

                         
                        input.seek(index34_2);

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA34_10 = input.LA(1);

                         
                        int index34_10 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (LA34_10==EOF||(LA34_10 >= AMPERSAND && LA34_10 <= BITWISEXOR)||LA34_10==COMMA||(LA34_10 >= DIV && LA34_10 <= DIVIDE)||(LA34_10 >= EQUAL && LA34_10 <= EQUAL_NS)||(LA34_10 >= GREATERTHAN && LA34_10 <= GREATERTHANOREQUALTO)||(LA34_10 >= Identifier && LA34_10 <= KW_CASCADE)||LA34_10==KW_CHANGE||(LA34_10 >= KW_CLUSTER && LA34_10 <= KW_COLLECTION)||(LA34_10 >= KW_COLUMNS && LA34_10 <= KW_CUBE)||(LA34_10 >= KW_CURSOR && LA34_10 <= KW_DATA)||(LA34_10 >= KW_DATABASES && LA34_10 <= KW_DISABLE)||(LA34_10 >= KW_DISTRIBUTE && LA34_10 <= KW_ESCAPED)||(LA34_10 >= KW_EXCLUSIVE && LA34_10 <= KW_EXPORT)||(LA34_10 >= KW_EXTERNAL && LA34_10 <= KW_FLOAT)||(LA34_10 >= KW_FOR && LA34_10 <= KW_FULL)||(LA34_10 >= KW_FUNCTIONS && LA34_10 <= KW_IDXPROPERTIES)||(LA34_10 >= KW_IGNORE && LA34_10 <= KW_LEFT)||(LA34_10 >= KW_LIKE && LA34_10 <= KW_LONG)||(LA34_10 >= KW_MAP && LA34_10 <= KW_MINUS)||(LA34_10 >= KW_MSCK && LA34_10 <= KW_OFFLINE)||(LA34_10 >= KW_OPTION && LA34_10 <= KW_OUTPUTFORMAT)||(LA34_10 >= KW_OVERWRITE && LA34_10 <= KW_PARQUETFILE)||(LA34_10 >= KW_PARTITION && LA34_10 <= KW_PLUS)||(LA34_10 >= KW_PRETTY && LA34_10 <= KW_TABLES)||(LA34_10 >= KW_TBLPROPERTIES && LA34_10 <= KW_TRANSACTIONS)||(LA34_10 >= KW_TRIGGER && LA34_10 <= KW_UNARCHIVE)||(LA34_10 >= KW_UNDO && LA34_10 <= KW_UNIONTYPE)||(LA34_10 >= KW_UNLOCK && LA34_10 <= KW_VALUE_TYPE)||(LA34_10 >= KW_VIEW && LA34_10 <= KW_WITH)||(LA34_10 >= LESSTHAN && LA34_10 <= LESSTHANOREQUALTO)||LA34_10==LSQUARE||(LA34_10 >= MINUS && LA34_10 <= NOTEQUAL)||LA34_10==PLUS||(LA34_10 >= RPAREN && LA34_10 <= RSQUARE)||LA34_10==STAR) ) {s = 3;}

                        else if ( (LA34_10==DOT) ) {s = 152;}

                        else if ( (LA34_10==LPAREN) && (synpred5_IdentifiersParser())) {s = 214;}

                         
                        input.seek(index34_10);

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA34_11 = input.LA(1);

                         
                        int index34_11 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (LA34_11==EOF||(LA34_11 >= AMPERSAND && LA34_11 <= BITWISEXOR)||LA34_11==COMMA||(LA34_11 >= DIV && LA34_11 <= DIVIDE)||(LA34_11 >= EQUAL && LA34_11 <= EQUAL_NS)||(LA34_11 >= GREATERTHAN && LA34_11 <= GREATERTHANOREQUALTO)||(LA34_11 >= Identifier && LA34_11 <= KW_CASCADE)||LA34_11==KW_CHANGE||(LA34_11 >= KW_CLUSTER && LA34_11 <= KW_COLLECTION)||(LA34_11 >= KW_COLUMNS && LA34_11 <= KW_CUBE)||(LA34_11 >= KW_CURSOR && LA34_11 <= KW_DATA)||(LA34_11 >= KW_DATABASES && LA34_11 <= KW_DISABLE)||(LA34_11 >= KW_DISTRIBUTE && LA34_11 <= KW_ESCAPED)||(LA34_11 >= KW_EXCLUSIVE && LA34_11 <= KW_EXPORT)||(LA34_11 >= KW_EXTERNAL && LA34_11 <= KW_FLOAT)||(LA34_11 >= KW_FOR && LA34_11 <= KW_FULL)||(LA34_11 >= KW_FUNCTIONS && LA34_11 <= KW_IDXPROPERTIES)||(LA34_11 >= KW_IGNORE && LA34_11 <= KW_LEFT)||(LA34_11 >= KW_LIKE && LA34_11 <= KW_LONG)||(LA34_11 >= KW_MAP && LA34_11 <= KW_MINUS)||(LA34_11 >= KW_MSCK && LA34_11 <= KW_OFFLINE)||(LA34_11 >= KW_OPTION && LA34_11 <= KW_OUTPUTFORMAT)||(LA34_11 >= KW_OVERWRITE && LA34_11 <= KW_PARQUETFILE)||(LA34_11 >= KW_PARTITION && LA34_11 <= KW_PLUS)||(LA34_11 >= KW_PRETTY && LA34_11 <= KW_TABLES)||(LA34_11 >= KW_TBLPROPERTIES && LA34_11 <= KW_TRANSACTIONS)||(LA34_11 >= KW_TRIGGER && LA34_11 <= KW_UNARCHIVE)||(LA34_11 >= KW_UNDO && LA34_11 <= KW_UNIONTYPE)||(LA34_11 >= KW_UNLOCK && LA34_11 <= KW_VALUE_TYPE)||(LA34_11 >= KW_VIEW && LA34_11 <= KW_WITH)||(LA34_11 >= LESSTHAN && LA34_11 <= LESSTHANOREQUALTO)||LA34_11==LSQUARE||(LA34_11 >= MINUS && LA34_11 <= NOTEQUAL)||LA34_11==PLUS||(LA34_11 >= RPAREN && LA34_11 <= RSQUARE)||LA34_11==STAR) ) {s = 3;}

                        else if ( (LA34_11==DOT) ) {s = 216;}

                        else if ( (LA34_11==LPAREN) && (synpred5_IdentifiersParser())) {s = 278;}

                         
                        input.seek(index34_11);

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA34_15 = input.LA(1);

                         
                        int index34_15 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (LA34_15==LPAREN) && (synpred5_IdentifiersParser())) {s = 304;}

                        else if ( (LA34_15==DOT) ) {s = 305;}

                        else if ( (LA34_15==EOF||(LA34_15 >= AMPERSAND && LA34_15 <= BITWISEXOR)||LA34_15==COMMA||(LA34_15 >= DIV && LA34_15 <= DIVIDE)||(LA34_15 >= EQUAL && LA34_15 <= EQUAL_NS)||(LA34_15 >= GREATERTHAN && LA34_15 <= GREATERTHANOREQUALTO)||(LA34_15 >= Identifier && LA34_15 <= KW_CASCADE)||LA34_15==KW_CHANGE||(LA34_15 >= KW_CLUSTER && LA34_15 <= KW_COLLECTION)||(LA34_15 >= KW_COLUMNS && LA34_15 <= KW_CUBE)||(LA34_15 >= KW_CURSOR && LA34_15 <= KW_DATA)||(LA34_15 >= KW_DATABASES && LA34_15 <= KW_DISABLE)||(LA34_15 >= KW_DISTRIBUTE && LA34_15 <= KW_ESCAPED)||(LA34_15 >= KW_EXCLUSIVE && LA34_15 <= KW_EXPORT)||(LA34_15 >= KW_EXTERNAL && LA34_15 <= KW_FLOAT)||(LA34_15 >= KW_FOR && LA34_15 <= KW_FULL)||(LA34_15 >= KW_FUNCTIONS && LA34_15 <= KW_IDXPROPERTIES)||(LA34_15 >= KW_IGNORE && LA34_15 <= KW_LEFT)||(LA34_15 >= KW_LIKE && LA34_15 <= KW_LONG)||(LA34_15 >= KW_MAP && LA34_15 <= KW_MINUS)||(LA34_15 >= KW_MSCK && LA34_15 <= KW_OFFLINE)||(LA34_15 >= KW_OPTION && LA34_15 <= KW_OUTPUTFORMAT)||(LA34_15 >= KW_OVERWRITE && LA34_15 <= KW_PARQUETFILE)||(LA34_15 >= KW_PARTITION && LA34_15 <= KW_PLUS)||(LA34_15 >= KW_PRETTY && LA34_15 <= KW_TABLES)||(LA34_15 >= KW_TBLPROPERTIES && LA34_15 <= KW_TRANSACTIONS)||(LA34_15 >= KW_TRIGGER && LA34_15 <= KW_UNARCHIVE)||(LA34_15 >= KW_UNDO && LA34_15 <= KW_UNIONTYPE)||(LA34_15 >= KW_UNLOCK && LA34_15 <= KW_VALUE_TYPE)||(LA34_15 >= KW_VIEW && LA34_15 <= KW_WITH)||(LA34_15 >= LESSTHAN && LA34_15 <= LESSTHANOREQUALTO)||LA34_15==LSQUARE||(LA34_15 >= MINUS && LA34_15 <= NOTEQUAL)||LA34_15==PLUS||(LA34_15 >= RPAREN && LA34_15 <= RSQUARE)||LA34_15==STAR) ) {s = 89;}

                         
                        input.seek(index34_15);

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA34_17 = input.LA(1);

                         
                        int index34_17 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (LA34_17==LPAREN) && (synpred5_IdentifiersParser())) {s = 368;}

                        else if ( (LA34_17==DOT) ) {s = 369;}

                        else if ( (LA34_17==EOF||(LA34_17 >= AMPERSAND && LA34_17 <= BITWISEXOR)||LA34_17==COMMA||(LA34_17 >= DIV && LA34_17 <= DIVIDE)||(LA34_17 >= EQUAL && LA34_17 <= EQUAL_NS)||(LA34_17 >= GREATERTHAN && LA34_17 <= GREATERTHANOREQUALTO)||(LA34_17 >= Identifier && LA34_17 <= KW_CASCADE)||LA34_17==KW_CHANGE||(LA34_17 >= KW_CLUSTER && LA34_17 <= KW_COLLECTION)||(LA34_17 >= KW_COLUMNS && LA34_17 <= KW_CUBE)||(LA34_17 >= KW_CURSOR && LA34_17 <= KW_DATA)||(LA34_17 >= KW_DATABASES && LA34_17 <= KW_DISABLE)||(LA34_17 >= KW_DISTRIBUTE && LA34_17 <= KW_ESCAPED)||(LA34_17 >= KW_EXCLUSIVE && LA34_17 <= KW_EXPORT)||(LA34_17 >= KW_EXTERNAL && LA34_17 <= KW_FLOAT)||(LA34_17 >= KW_FOR && LA34_17 <= KW_FULL)||(LA34_17 >= KW_FUNCTIONS && LA34_17 <= KW_IDXPROPERTIES)||(LA34_17 >= KW_IGNORE && LA34_17 <= KW_LEFT)||(LA34_17 >= KW_LIKE && LA34_17 <= KW_LONG)||(LA34_17 >= KW_MAP && LA34_17 <= KW_MINUS)||(LA34_17 >= KW_MSCK && LA34_17 <= KW_OFFLINE)||(LA34_17 >= KW_OPTION && LA34_17 <= KW_OUTPUTFORMAT)||(LA34_17 >= KW_OVERWRITE && LA34_17 <= KW_PARQUETFILE)||(LA34_17 >= KW_PARTITION && LA34_17 <= KW_PLUS)||(LA34_17 >= KW_PRETTY && LA34_17 <= KW_TABLES)||(LA34_17 >= KW_TBLPROPERTIES && LA34_17 <= KW_TRANSACTIONS)||(LA34_17 >= KW_TRIGGER && LA34_17 <= KW_UNARCHIVE)||(LA34_17 >= KW_UNDO && LA34_17 <= KW_UNIONTYPE)||(LA34_17 >= KW_UNLOCK && LA34_17 <= KW_VALUE_TYPE)||(LA34_17 >= KW_VIEW && LA34_17 <= KW_WITH)||(LA34_17 >= LESSTHAN && LA34_17 <= LESSTHANOREQUALTO)||LA34_17==LSQUARE||(LA34_17 >= MINUS && LA34_17 <= NOTEQUAL)||LA34_17==PLUS||(LA34_17 >= RPAREN && LA34_17 <= RSQUARE)||LA34_17==STAR) ) {s = 89;}

                         
                        input.seek(index34_17);

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA34_18 = input.LA(1);

                         
                        int index34_18 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (LA34_18==LPAREN) && (synpred5_IdentifiersParser())) {s = 432;}

                        else if ( (LA34_18==DOT) ) {s = 433;}

                        else if ( (LA34_18==EOF||(LA34_18 >= AMPERSAND && LA34_18 <= BITWISEXOR)||LA34_18==COMMA||(LA34_18 >= DIV && LA34_18 <= DIVIDE)||(LA34_18 >= EQUAL && LA34_18 <= EQUAL_NS)||(LA34_18 >= GREATERTHAN && LA34_18 <= GREATERTHANOREQUALTO)||(LA34_18 >= Identifier && LA34_18 <= KW_CASCADE)||LA34_18==KW_CHANGE||(LA34_18 >= KW_CLUSTER && LA34_18 <= KW_COLLECTION)||(LA34_18 >= KW_COLUMNS && LA34_18 <= KW_CUBE)||(LA34_18 >= KW_CURSOR && LA34_18 <= KW_DATA)||(LA34_18 >= KW_DATABASES && LA34_18 <= KW_DISABLE)||(LA34_18 >= KW_DISTRIBUTE && LA34_18 <= KW_ESCAPED)||(LA34_18 >= KW_EXCLUSIVE && LA34_18 <= KW_EXPORT)||(LA34_18 >= KW_EXTERNAL && LA34_18 <= KW_FLOAT)||(LA34_18 >= KW_FOR && LA34_18 <= KW_FULL)||(LA34_18 >= KW_FUNCTIONS && LA34_18 <= KW_IDXPROPERTIES)||(LA34_18 >= KW_IGNORE && LA34_18 <= KW_LEFT)||(LA34_18 >= KW_LIKE && LA34_18 <= KW_LONG)||(LA34_18 >= KW_MAP && LA34_18 <= KW_MINUS)||(LA34_18 >= KW_MSCK && LA34_18 <= KW_OFFLINE)||(LA34_18 >= KW_OPTION && LA34_18 <= KW_OUTPUTFORMAT)||(LA34_18 >= KW_OVERWRITE && LA34_18 <= KW_PARQUETFILE)||(LA34_18 >= KW_PARTITION && LA34_18 <= KW_PLUS)||(LA34_18 >= KW_PRETTY && LA34_18 <= KW_TABLES)||(LA34_18 >= KW_TBLPROPERTIES && LA34_18 <= KW_TRANSACTIONS)||(LA34_18 >= KW_TRIGGER && LA34_18 <= KW_UNARCHIVE)||(LA34_18 >= KW_UNDO && LA34_18 <= KW_UNIONTYPE)||(LA34_18 >= KW_UNLOCK && LA34_18 <= KW_VALUE_TYPE)||(LA34_18 >= KW_VIEW && LA34_18 <= KW_WITH)||(LA34_18 >= LESSTHAN && LA34_18 <= LESSTHANOREQUALTO)||LA34_18==LSQUARE||(LA34_18 >= MINUS && LA34_18 <= NOTEQUAL)||LA34_18==PLUS||(LA34_18 >= RPAREN && LA34_18 <= RSQUARE)||LA34_18==STAR) ) {s = 89;}

                         
                        input.seek(index34_18);

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA34_19 = input.LA(1);

                         
                        int index34_19 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (LA34_19==DOT) ) {s = 496;}

                        else if ( (LA34_19==LPAREN) && (synpred5_IdentifiersParser())) {s = 497;}

                        else if ( (LA34_19==EOF||(LA34_19 >= AMPERSAND && LA34_19 <= BITWISEXOR)||LA34_19==COMMA||(LA34_19 >= DIV && LA34_19 <= DIVIDE)||(LA34_19 >= EQUAL && LA34_19 <= EQUAL_NS)||(LA34_19 >= GREATERTHAN && LA34_19 <= GREATERTHANOREQUALTO)||(LA34_19 >= Identifier && LA34_19 <= KW_CASCADE)||LA34_19==KW_CHANGE||(LA34_19 >= KW_CLUSTER && LA34_19 <= KW_COLLECTION)||(LA34_19 >= KW_COLUMNS && LA34_19 <= KW_CUBE)||(LA34_19 >= KW_CURSOR && LA34_19 <= KW_DATA)||(LA34_19 >= KW_DATABASES && LA34_19 <= KW_DISABLE)||(LA34_19 >= KW_DISTRIBUTE && LA34_19 <= KW_ESCAPED)||(LA34_19 >= KW_EXCLUSIVE && LA34_19 <= KW_EXPORT)||(LA34_19 >= KW_EXTERNAL && LA34_19 <= KW_FLOAT)||(LA34_19 >= KW_FOR && LA34_19 <= KW_FULL)||(LA34_19 >= KW_FUNCTIONS && LA34_19 <= KW_IDXPROPERTIES)||(LA34_19 >= KW_IGNORE && LA34_19 <= KW_LEFT)||(LA34_19 >= KW_LIKE && LA34_19 <= KW_LONG)||(LA34_19 >= KW_MAP && LA34_19 <= KW_MINUS)||(LA34_19 >= KW_MSCK && LA34_19 <= KW_OFFLINE)||(LA34_19 >= KW_OPTION && LA34_19 <= KW_OUTPUTFORMAT)||(LA34_19 >= KW_OVERWRITE && LA34_19 <= KW_PARQUETFILE)||(LA34_19 >= KW_PARTITION && LA34_19 <= KW_PLUS)||(LA34_19 >= KW_PRETTY && LA34_19 <= KW_TABLES)||(LA34_19 >= KW_TBLPROPERTIES && LA34_19 <= KW_TRANSACTIONS)||(LA34_19 >= KW_TRIGGER && LA34_19 <= KW_UNARCHIVE)||(LA34_19 >= KW_UNDO && LA34_19 <= KW_UNIONTYPE)||(LA34_19 >= KW_UNLOCK && LA34_19 <= KW_VALUE_TYPE)||(LA34_19 >= KW_VIEW && LA34_19 <= KW_WITH)||(LA34_19 >= LESSTHAN && LA34_19 <= LESSTHANOREQUALTO)||LA34_19==LSQUARE||(LA34_19 >= MINUS && LA34_19 <= NOTEQUAL)||LA34_19==PLUS||(LA34_19 >= RPAREN && LA34_19 <= RSQUARE)||LA34_19==STAR) ) {s = 89;}

                         
                        input.seek(index34_19);

                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA34_20 = input.LA(1);

                         
                        int index34_20 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (LA34_20==DOT) ) {s = 560;}

                        else if ( (LA34_20==LPAREN) && (synpred5_IdentifiersParser())) {s = 561;}

                        else if ( (LA34_20==EOF||(LA34_20 >= AMPERSAND && LA34_20 <= BITWISEXOR)||LA34_20==COMMA||(LA34_20 >= DIV && LA34_20 <= DIVIDE)||(LA34_20 >= EQUAL && LA34_20 <= EQUAL_NS)||(LA34_20 >= GREATERTHAN && LA34_20 <= GREATERTHANOREQUALTO)||(LA34_20 >= Identifier && LA34_20 <= KW_CASCADE)||LA34_20==KW_CHANGE||(LA34_20 >= KW_CLUSTER && LA34_20 <= KW_COLLECTION)||(LA34_20 >= KW_COLUMNS && LA34_20 <= KW_CUBE)||(LA34_20 >= KW_CURSOR && LA34_20 <= KW_DATA)||(LA34_20 >= KW_DATABASES && LA34_20 <= KW_DISABLE)||(LA34_20 >= KW_DISTRIBUTE && LA34_20 <= KW_ESCAPED)||(LA34_20 >= KW_EXCLUSIVE && LA34_20 <= KW_EXPORT)||(LA34_20 >= KW_EXTERNAL && LA34_20 <= KW_FLOAT)||(LA34_20 >= KW_FOR && LA34_20 <= KW_FULL)||(LA34_20 >= KW_FUNCTIONS && LA34_20 <= KW_IDXPROPERTIES)||(LA34_20 >= KW_IGNORE && LA34_20 <= KW_LEFT)||(LA34_20 >= KW_LIKE && LA34_20 <= KW_LONG)||(LA34_20 >= KW_MAP && LA34_20 <= KW_MINUS)||(LA34_20 >= KW_MSCK && LA34_20 <= KW_OFFLINE)||(LA34_20 >= KW_OPTION && LA34_20 <= KW_OUTPUTFORMAT)||(LA34_20 >= KW_OVERWRITE && LA34_20 <= KW_PARQUETFILE)||(LA34_20 >= KW_PARTITION && LA34_20 <= KW_PLUS)||(LA34_20 >= KW_PRETTY && LA34_20 <= KW_TABLES)||(LA34_20 >= KW_TBLPROPERTIES && LA34_20 <= KW_TRANSACTIONS)||(LA34_20 >= KW_TRIGGER && LA34_20 <= KW_UNARCHIVE)||(LA34_20 >= KW_UNDO && LA34_20 <= KW_UNIONTYPE)||(LA34_20 >= KW_UNLOCK && LA34_20 <= KW_VALUE_TYPE)||(LA34_20 >= KW_VIEW && LA34_20 <= KW_WITH)||(LA34_20 >= LESSTHAN && LA34_20 <= LESSTHANOREQUALTO)||LA34_20==LSQUARE||(LA34_20 >= MINUS && LA34_20 <= NOTEQUAL)||LA34_20==PLUS||(LA34_20 >= RPAREN && LA34_20 <= RSQUARE)||LA34_20==STAR) ) {s = 89;}

                         
                        input.seek(index34_20);

                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA34_624 = input.LA(1);

                         
                        int index34_624 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (true) ) {s = 22;}

                        else if ( (synpred5_IdentifiersParser()) ) {s = 561;}

                         
                        input.seek(index34_624);

                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA34_625 = input.LA(1);

                         
                        int index34_625 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (true) ) {s = 22;}

                        else if ( (synpred5_IdentifiersParser()) ) {s = 561;}

                         
                        input.seek(index34_625);

                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA34_626 = input.LA(1);

                         
                        int index34_626 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred5_IdentifiersParser()) ) {s = 561;}

                        else if ( (true) ) {s = 89;}

                         
                        input.seek(index34_626);

                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA34_627 = input.LA(1);

                         
                        int index34_627 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred5_IdentifiersParser()) ) {s = 561;}

                        else if ( (true) ) {s = 89;}

                         
                        input.seek(index34_627);

                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA34_628 = input.LA(1);

                         
                        int index34_628 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (true) ) {s = 3;}

                        else if ( (synpred5_IdentifiersParser()) ) {s = 561;}

                         
                        input.seek(index34_628);

                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA34_629 = input.LA(1);

                         
                        int index34_629 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (true) ) {s = 3;}

                        else if ( (synpred5_IdentifiersParser()) ) {s = 561;}

                         
                        input.seek(index34_629);

                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA34_630 = input.LA(1);

                         
                        int index34_630 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (true) ) {s = 3;}

                        else if ( (synpred5_IdentifiersParser()) ) {s = 561;}

                         
                        input.seek(index34_630);

                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA34_631 = input.LA(1);

                         
                        int index34_631 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (true) ) {s = 3;}

                        else if ( (synpred5_IdentifiersParser()) ) {s = 561;}

                         
                        input.seek(index34_631);

                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA34_632 = input.LA(1);

                         
                        int index34_632 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred5_IdentifiersParser()) ) {s = 561;}

                        else if ( (true) ) {s = 89;}

                         
                        input.seek(index34_632);

                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA34_633 = input.LA(1);

                         
                        int index34_633 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred5_IdentifiersParser()) ) {s = 561;}

                        else if ( (true) ) {s = 89;}

                         
                        input.seek(index34_633);

                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA34_634 = input.LA(1);

                         
                        int index34_634 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred5_IdentifiersParser()) ) {s = 561;}

                        else if ( (true) ) {s = 89;}

                         
                        input.seek(index34_634);

                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA34_635 = input.LA(1);

                         
                        int index34_635 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred5_IdentifiersParser()) ) {s = 561;}

                        else if ( (true) ) {s = 89;}

                         
                        input.seek(index34_635);

                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA34_636 = input.LA(1);

                         
                        int index34_636 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred5_IdentifiersParser()) ) {s = 561;}

                        else if ( (true) ) {s = 89;}

                         
                        input.seek(index34_636);

                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA34_637 = input.LA(1);

                         
                        int index34_637 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred5_IdentifiersParser()) ) {s = 561;}

                        else if ( (true) ) {s = 89;}

                         
                        input.seek(index34_637);

                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA34_638 = input.LA(1);

                         
                        int index34_638 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred5_IdentifiersParser()) ) {s = 561;}

                        else if ( (true) ) {s = 89;}

                         
                        input.seek(index34_638);

                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA34_639 = input.LA(1);

                         
                        int index34_639 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred5_IdentifiersParser()) ) {s = 561;}

                        else if ( (true) ) {s = 89;}

                         
                        input.seek(index34_639);

                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA34_640 = input.LA(1);

                         
                        int index34_640 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred5_IdentifiersParser()) ) {s = 561;}

                        else if ( (true) ) {s = 89;}

                         
                        input.seek(index34_640);

                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA34_641 = input.LA(1);

                         
                        int index34_641 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred5_IdentifiersParser()) ) {s = 561;}

                        else if ( (true) ) {s = 89;}

                         
                        input.seek(index34_641);

                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}

            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 34, _s, input);
            error(nvae);
            throw nvae;
        }

    }
    static final String DFA35_eotS =
        "\100\uffff";
    static final String DFA35_eofS =
        "\1\1\77\uffff";
    static final String DFA35_minS =
        "\1\4\77\uffff";
    static final String DFA35_maxS =
        "\1\u012b\77\uffff";
    static final String DFA35_acceptS =
        "\1\uffff\1\3\74\uffff\1\1\1\2";
    static final String DFA35_specialS =
        "\100\uffff}>";
    static final String[] DFA35_transitionS = {
            "\3\1\3\uffff\1\1\3\uffff\2\1\1\uffff\1\77\2\uffff\2\1\1\uffff"+
            "\2\1\1\uffff\26\1\2\uffff\1\1\1\uffff\4\1\1\uffff\12\1\1\uffff"+
            "\2\1\1\uffff\20\1\1\uffff\10\1\1\uffff\4\1\1\uffff\10\1\1\uffff"+
            "\5\1\1\uffff\7\1\1\uffff\25\1\1\uffff\12\1\1\uffff\4\1\1\uffff"+
            "\10\1\1\uffff\10\1\1\uffff\3\1\1\uffff\5\1\2\uffff\63\1\1\uffff"+
            "\12\1\1\uffff\4\1\1\uffff\3\1\1\uffff\12\1\1\uffff\6\1\1\uffff"+
            "\2\1\1\uffff\1\76\1\uffff\3\1\1\uffff\1\1\3\uffff\2\1\2\uffff"+
            "\1\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA35_eot = DFA.unpackEncodedString(DFA35_eotS);
    static final short[] DFA35_eof = DFA.unpackEncodedString(DFA35_eofS);
    static final char[] DFA35_min = DFA.unpackEncodedStringToUnsignedChars(DFA35_minS);
    static final char[] DFA35_max = DFA.unpackEncodedStringToUnsignedChars(DFA35_maxS);
    static final short[] DFA35_accept = DFA.unpackEncodedString(DFA35_acceptS);
    static final short[] DFA35_special = DFA.unpackEncodedString(DFA35_specialS);
    static final short[][] DFA35_transition;

    static {
        int numStates = DFA35_transitionS.length;
        DFA35_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA35_transition[i] = DFA.unpackEncodedString(DFA35_transitionS[i]);
        }
    }

    class DFA35 extends DFA {

        public DFA35(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 35;
            this.eot = DFA35_eot;
            this.eof = DFA35_eof;
            this.min = DFA35_min;
            this.max = DFA35_max;
            this.accept = DFA35_accept;
            this.special = DFA35_special;
            this.transition = DFA35_transition;
        }
        public String getDescription() {
            return "()* loopback of 282:20: ( ( LSQUARE ^ expression RSQUARE !) | ( DOT ^ identifier ) )*";
        }
    }
    static final String DFA38_eotS =
        "\123\uffff";
    static final String DFA38_eofS =
        "\2\2\121\uffff";
    static final String DFA38_minS =
        "\1\4\1\12\121\uffff";
    static final String DFA38_maxS =
        "\1\u012b\1\u0127\121\uffff";
    static final String DFA38_acceptS =
        "\2\uffff\1\2\73\uffff\1\1\24\uffff";
    static final String DFA38_specialS =
        "\123\uffff}>";
    static final String[] DFA38_transitionS = {
            "\3\2\3\uffff\1\2\3\uffff\2\2\4\uffff\2\2\1\uffff\2\2\1\uffff"+
            "\26\2\2\uffff\1\2\1\uffff\4\2\1\uffff\12\2\1\uffff\2\2\1\uffff"+
            "\20\2\1\uffff\10\2\1\uffff\4\2\1\uffff\10\2\1\uffff\5\2\1\uffff"+
            "\7\2\1\uffff\15\2\1\1\7\2\1\uffff\12\2\1\uffff\4\2\1\uffff\10"+
            "\2\1\uffff\10\2\1\uffff\3\2\1\uffff\5\2\2\uffff\63\2\1\uffff"+
            "\12\2\1\uffff\4\2\1\uffff\3\2\1\uffff\12\2\1\uffff\6\2\1\uffff"+
            "\2\2\3\uffff\3\2\1\uffff\1\2\3\uffff\2\2\2\uffff\1\2",
            "\1\2\51\uffff\1\2\43\uffff\1\2\31\uffff\1\2\4\uffff\1\2\1\uffff"+
            "\1\2\14\uffff\1\2\11\uffff\1\2\3\uffff\1\2\11\uffff\1\2\7\uffff"+
            "\1\76\1\uffff\1\76\6\uffff\1\2\35\uffff\1\2\17\uffff\1\2\13"+
            "\uffff\1\2\33\uffff\1\2\17\uffff\1\2\1\uffff\1\2\17\uffff\1"+
            "\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA38_eot = DFA.unpackEncodedString(DFA38_eotS);
    static final short[] DFA38_eof = DFA.unpackEncodedString(DFA38_eofS);
    static final char[] DFA38_min = DFA.unpackEncodedStringToUnsignedChars(DFA38_minS);
    static final char[] DFA38_max = DFA.unpackEncodedStringToUnsignedChars(DFA38_maxS);
    static final short[] DFA38_accept = DFA.unpackEncodedString(DFA38_acceptS);
    static final short[] DFA38_special = DFA.unpackEncodedString(DFA38_specialS);
    static final short[][] DFA38_transition;

    static {
        int numStates = DFA38_transitionS.length;
        DFA38_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA38_transition[i] = DFA.unpackEncodedString(DFA38_transitionS[i]);
        }
    }

    class DFA38 extends DFA {

        public DFA38(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 38;
            this.eot = DFA38_eot;
            this.eof = DFA38_eof;
            this.min = DFA38_min;
            this.max = DFA38_max;
            this.accept = DFA38_accept;
            this.special = DFA38_special;
            this.transition = DFA38_transition;
        }
        public String getDescription() {
            return "302:39: (a= KW_IS nullCondition )?";
        }
    }
    static final String DFA39_eotS =
        "\75\uffff";
    static final String DFA39_eofS =
        "\1\1\74\uffff";
    static final String DFA39_minS =
        "\1\4\74\uffff";
    static final String DFA39_maxS =
        "\1\u012b\74\uffff";
    static final String DFA39_acceptS =
        "\1\uffff\1\2\72\uffff\1\1";
    static final String DFA39_specialS =
        "\75\uffff}>";
    static final String[] DFA39_transitionS = {
            "\2\1\1\74\3\uffff\1\1\3\uffff\2\1\4\uffff\2\1\1\uffff\2\1\1"+
            "\uffff\26\1\2\uffff\1\1\1\uffff\4\1\1\uffff\12\1\1\uffff\2\1"+
            "\1\uffff\20\1\1\uffff\10\1\1\uffff\4\1\1\uffff\10\1\1\uffff"+
            "\5\1\1\uffff\7\1\1\uffff\25\1\1\uffff\12\1\1\uffff\4\1\1\uffff"+
            "\10\1\1\uffff\10\1\1\uffff\3\1\1\uffff\5\1\2\uffff\63\1\1\uffff"+
            "\12\1\1\uffff\4\1\1\uffff\3\1\1\uffff\12\1\1\uffff\6\1\1\uffff"+
            "\2\1\3\uffff\3\1\1\uffff\1\1\3\uffff\2\1\2\uffff\1\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA39_eot = DFA.unpackEncodedString(DFA39_eotS);
    static final short[] DFA39_eof = DFA.unpackEncodedString(DFA39_eofS);
    static final char[] DFA39_min = DFA.unpackEncodedStringToUnsignedChars(DFA39_minS);
    static final char[] DFA39_max = DFA.unpackEncodedStringToUnsignedChars(DFA39_maxS);
    static final short[] DFA39_accept = DFA.unpackEncodedString(DFA39_acceptS);
    static final short[] DFA39_special = DFA.unpackEncodedString(DFA39_specialS);
    static final short[][] DFA39_transition;

    static {
        int numStates = DFA39_transitionS.length;
        DFA39_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA39_transition[i] = DFA.unpackEncodedString(DFA39_transitionS[i]);
        }
    }

    class DFA39 extends DFA {

        public DFA39(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 39;
            this.eot = DFA39_eot;
            this.eof = DFA39_eof;
            this.min = DFA39_min;
            this.max = DFA39_max;
            this.accept = DFA39_accept;
            this.special = DFA39_special;
            this.transition = DFA39_transition;
        }
        public String getDescription() {
            return "()* loopback of 315:37: ( precedenceBitwiseXorOperator ^ precedenceUnarySuffixExpression )*";
        }
    }
    static final String DFA40_eotS =
        "\74\uffff";
    static final String DFA40_eofS =
        "\1\1\73\uffff";
    static final String DFA40_minS =
        "\1\4\73\uffff";
    static final String DFA40_maxS =
        "\1\u012b\73\uffff";
    static final String DFA40_acceptS =
        "\1\uffff\1\2\71\uffff\1\1";
    static final String DFA40_specialS =
        "\74\uffff}>";
    static final String[] DFA40_transitionS = {
            "\2\1\4\uffff\1\1\3\uffff\2\73\4\uffff\2\1\1\uffff\2\1\1\uffff"+
            "\26\1\2\uffff\1\1\1\uffff\4\1\1\uffff\12\1\1\uffff\2\1\1\uffff"+
            "\20\1\1\uffff\10\1\1\uffff\4\1\1\uffff\10\1\1\uffff\5\1\1\uffff"+
            "\7\1\1\uffff\25\1\1\uffff\12\1\1\uffff\4\1\1\uffff\10\1\1\uffff"+
            "\10\1\1\uffff\3\1\1\uffff\5\1\2\uffff\63\1\1\uffff\12\1\1\uffff"+
            "\4\1\1\uffff\3\1\1\uffff\12\1\1\uffff\6\1\1\uffff\2\1\3\uffff"+
            "\1\1\1\73\1\1\1\uffff\1\1\3\uffff\2\1\2\uffff\1\73",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA40_eot = DFA.unpackEncodedString(DFA40_eotS);
    static final short[] DFA40_eof = DFA.unpackEncodedString(DFA40_eofS);
    static final char[] DFA40_min = DFA.unpackEncodedStringToUnsignedChars(DFA40_minS);
    static final char[] DFA40_max = DFA.unpackEncodedStringToUnsignedChars(DFA40_maxS);
    static final short[] DFA40_accept = DFA.unpackEncodedString(DFA40_acceptS);
    static final short[] DFA40_special = DFA.unpackEncodedString(DFA40_specialS);
    static final short[][] DFA40_transition;

    static {
        int numStates = DFA40_transitionS.length;
        DFA40_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA40_transition[i] = DFA.unpackEncodedString(DFA40_transitionS[i]);
        }
    }

    class DFA40 extends DFA {

        public DFA40(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 40;
            this.eot = DFA40_eot;
            this.eof = DFA40_eof;
            this.min = DFA40_min;
            this.max = DFA40_max;
            this.accept = DFA40_accept;
            this.special = DFA40_special;
            this.transition = DFA40_transition;
        }
        public String getDescription() {
            return "()* loopback of 326:36: ( precedenceStarOperator ^ precedenceBitwiseXorExpression )*";
        }
    }
    static final String DFA46_eotS =
        "\165\uffff";
    static final String DFA46_eofS =
        "\25\uffff\1\1\137\uffff";
    static final String DFA46_minS =
        "\1\7\24\uffff\1\4\3\uffff\1\7\121\uffff\1\0\11\uffff";
    static final String DFA46_maxS =
        "\1\u012f\24\uffff\1\u012b\3\uffff\1\u012f\121\uffff\1\0\11\uffff";
    static final String DFA46_acceptS =
        "\1\uffff\1\1\161\uffff\2\2";
    static final String DFA46_specialS =
        "\31\uffff\1\0\121\uffff\1\1\11\uffff}>";
    static final String[] DFA46_transitionS = {
            "\1\1\5\uffff\1\1\4\uffff\1\1\7\uffff\7\1\1\uffff\21\1\1\uffff"+
            "\4\1\1\uffff\10\1\1\uffff\1\1\1\uffff\2\1\1\uffff\20\1\1\uffff"+
            "\4\1\1\uffff\1\1\1\uffff\1\1\1\uffff\1\1\1\25\2\1\1\uffff\10"+
            "\1\1\uffff\3\1\1\uffff\1\1\1\uffff\4\1\1\uffff\23\1\1\uffff"+
            "\4\1\1\uffff\12\1\1\uffff\4\1\1\uffff\3\1\1\uffff\4\1\1\uffff"+
            "\1\1\1\uffff\6\1\1\uffff\3\1\1\uffff\5\1\2\uffff\15\1\1\uffff"+
            "\17\1\1\uffff\25\1\1\uffff\4\1\1\uffff\5\1\1\uffff\4\1\1\uffff"+
            "\3\1\1\uffff\12\1\1\uffff\1\1\2\uffff\1\1\1\uffff\1\1\3\uffff"+
            "\1\1\2\uffff\1\1\2\uffff\2\1\10\uffff\4\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\3\1\3\uffff\1\1\3\uffff\2\1\1\uffff\1\1\2\uffff\2\1\1\uffff"+
            "\2\1\1\uffff\26\1\2\uffff\1\1\1\uffff\4\1\1\uffff\12\1\1\uffff"+
            "\2\1\1\uffff\20\1\1\uffff\10\1\1\uffff\4\1\1\uffff\10\1\1\uffff"+
            "\5\1\1\uffff\7\1\1\uffff\25\1\1\uffff\12\1\1\uffff\4\1\1\uffff"+
            "\10\1\1\uffff\10\1\1\uffff\3\1\1\uffff\5\1\2\uffff\63\1\1\uffff"+
            "\12\1\1\uffff\4\1\1\uffff\3\1\1\uffff\12\1\1\uffff\6\1\1\uffff"+
            "\2\1\1\31\1\1\1\uffff\3\1\1\uffff\1\1\3\uffff\2\1\2\uffff\1"+
            "\1",
            "",
            "",
            "",
            "\1\1\5\uffff\1\1\4\uffff\1\1\7\uffff\7\1\1\uffff\21\1\1\uffff"+
            "\4\1\1\uffff\10\1\1\uffff\1\1\1\uffff\2\1\1\uffff\25\1\1\uffff"+
            "\1\1\1\uffff\1\1\1\uffff\4\1\1\uffff\10\1\1\uffff\3\1\1\uffff"+
            "\1\1\1\uffff\4\1\1\uffff\23\1\1\uffff\4\1\1\uffff\12\1\1\uffff"+
            "\1\153\3\1\1\uffff\10\1\1\uffff\1\1\1\uffff\6\1\1\uffff\3\1"+
            "\1\uffff\5\1\2\uffff\15\1\1\164\17\1\1\163\25\1\1\uffff\4\1"+
            "\1\uffff\5\1\1\uffff\4\1\1\uffff\3\1\1\uffff\12\1\1\uffff\1"+
            "\1\2\uffff\1\1\1\uffff\1\1\3\uffff\1\1\2\uffff\1\1\2\uffff\2"+
            "\1\3\uffff\1\1\3\uffff\5\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA46_eot = DFA.unpackEncodedString(DFA46_eotS);
    static final short[] DFA46_eof = DFA.unpackEncodedString(DFA46_eofS);
    static final char[] DFA46_min = DFA.unpackEncodedStringToUnsignedChars(DFA46_minS);
    static final char[] DFA46_max = DFA.unpackEncodedStringToUnsignedChars(DFA46_maxS);
    static final short[] DFA46_accept = DFA.unpackEncodedString(DFA46_acceptS);
    static final short[] DFA46_special = DFA.unpackEncodedString(DFA46_specialS);
    static final short[][] DFA46_transition;

    static {
        int numStates = DFA46_transitionS.length;
        DFA46_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA46_transition[i] = DFA.unpackEncodedString(DFA46_transitionS[i]);
        }
    }

    class DFA46 extends DFA {

        public DFA46(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 46;
            this.eot = DFA46_eot;
            this.eof = DFA46_eof;
            this.min = DFA46_min;
            this.max = DFA46_max;
            this.accept = DFA46_accept;
            this.special = DFA46_special;
            this.transition = DFA46_transition;
        }
        public String getDescription() {
            return "379:1: precedenceEqualExpression : ( (left= precedenceBitwiseOrExpression -> $left) ( ( KW_NOT precedenceEqualNegatableOperator notExpr= precedenceBitwiseOrExpression ) -> ^( KW_NOT ^( precedenceEqualNegatableOperator $precedenceEqualExpression $notExpr) ) | ( precedenceEqualOperator equalExpr= precedenceBitwiseOrExpression ) -> ^( precedenceEqualOperator $precedenceEqualExpression $equalExpr) | ( KW_NOT KW_IN LPAREN KW_SELECT )=> ( KW_NOT KW_IN subQueryExpression ) -> ^( KW_NOT ^( TOK_SUBQUERY_EXPR ^( TOK_SUBQUERY_OP KW_IN ) subQueryExpression $precedenceEqualExpression) ) | ( KW_NOT KW_IN expressions ) -> ^( KW_NOT ^( TOK_FUNCTION KW_IN $precedenceEqualExpression expressions ) ) | ( KW_IN LPAREN KW_SELECT )=> ( KW_IN subQueryExpression ) -> ^( TOK_SUBQUERY_EXPR ^( TOK_SUBQUERY_OP KW_IN ) subQueryExpression $precedenceEqualExpression) | ( KW_IN expressions ) -> ^( TOK_FUNCTION KW_IN $precedenceEqualExpression expressions ) | ( KW_NOT KW_BETWEEN (min= precedenceBitwiseOrExpression ) KW_AND (max= precedenceBitwiseOrExpression ) ) -> ^( TOK_FUNCTION Identifier[\"between\"] KW_TRUE $left $min $max) | ( KW_BETWEEN (min= precedenceBitwiseOrExpression ) KW_AND (max= precedenceBitwiseOrExpression ) ) -> ^( TOK_FUNCTION Identifier[\"between\"] KW_FALSE $left $min $max) )* | ( KW_EXISTS LPAREN KW_SELECT )=> ( KW_EXISTS subQueryExpression ) -> ^( TOK_SUBQUERY_EXPR ^( TOK_SUBQUERY_OP KW_EXISTS ) subQueryExpression ) );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA46_25 = input.LA(1);

                         
                        int index46_25 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (LA46_25==BigintLiteral||LA46_25==CharSetName||LA46_25==DecimalLiteral||(LA46_25 >= Identifier && LA46_25 <= KW_ANALYZE)||(LA46_25 >= KW_ARCHIVE && LA46_25 <= KW_CHANGE)||(LA46_25 >= KW_CLUSTER && LA46_25 <= KW_COLLECTION)||(LA46_25 >= KW_COLUMNS && LA46_25 <= KW_CREATE)||LA46_25==KW_CUBE||(LA46_25 >= KW_CURSOR && LA46_25 <= KW_DATA)||(LA46_25 >= KW_DATABASES && LA46_25 <= KW_ELEM_TYPE)||LA46_25==KW_ENABLE||LA46_25==KW_ESCAPED||(LA46_25 >= KW_EXCLUSIVE && LA46_25 <= KW_EXPORT)||(LA46_25 >= KW_EXTERNAL && LA46_25 <= KW_FLOAT)||(LA46_25 >= KW_FOR && LA46_25 <= KW_FORMATTED)||LA46_25==KW_FULL||(LA46_25 >= KW_FUNCTIONS && LA46_25 <= KW_GROUPING)||(LA46_25 >= KW_HOLD_DDLTIME && LA46_25 <= KW_JAR)||(LA46_25 >= KW_KEYS && LA46_25 <= KW_LEFT)||(LA46_25 >= KW_LIKE && LA46_25 <= KW_LONG)||(LA46_25 >= KW_MAPJOIN && LA46_25 <= KW_MINUS)||(LA46_25 >= KW_MSCK && LA46_25 <= KW_OFFLINE)||LA46_25==KW_OPTION||(LA46_25 >= KW_ORCFILE && LA46_25 <= KW_OUTPUTFORMAT)||(LA46_25 >= KW_OVERWRITE && LA46_25 <= KW_PARQUETFILE)||(LA46_25 >= KW_PARTITION && LA46_25 <= KW_PLUS)||(LA46_25 >= KW_PRETTY && LA46_25 <= KW_RECORDWRITER)||(LA46_25 >= KW_REGEXP && LA46_25 <= KW_SCHEMAS)||(LA46_25 >= KW_SEMI && LA46_25 <= KW_TABLES)||(LA46_25 >= KW_TBLPROPERTIES && LA46_25 <= KW_TEXTFILE)||(LA46_25 >= KW_TIMESTAMP && LA46_25 <= KW_TRANSACTIONS)||(LA46_25 >= KW_TRIGGER && LA46_25 <= KW_UNARCHIVE)||(LA46_25 >= KW_UNDO && LA46_25 <= KW_UNIONTYPE)||(LA46_25 >= KW_UNLOCK && LA46_25 <= KW_VALUE_TYPE)||LA46_25==KW_VIEW||LA46_25==KW_WHILE||LA46_25==KW_WITH||LA46_25==LPAREN||LA46_25==MINUS||(LA46_25 >= Number && LA46_25 <= PLUS)||LA46_25==RPAREN||(LA46_25 >= STAR && LA46_25 <= TinyintLiteral)) ) {s = 1;}

                        else if ( (LA46_25==KW_MAP) ) {s = 107;}

                        else if ( (LA46_25==KW_SELECT) && (synpred8_IdentifiersParser())) {s = 115;}

                        else if ( (LA46_25==KW_REDUCE) && (synpred8_IdentifiersParser())) {s = 116;}

                         
                        input.seek(index46_25);

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA46_107 = input.LA(1);

                         
                        int index46_107 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (true) ) {s = 1;}

                        else if ( (synpred8_IdentifiersParser()) ) {s = 116;}

                         
                        input.seek(index46_107);

                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}

            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 46, _s, input);
            error(nvae);
            throw nvae;
        }

    }
    static final String DFA45_eotS =
        "\u03a5\uffff";
    static final String DFA45_eofS =
        "\1\1\53\uffff\1\1\1\uffff\1\1\7\uffff\1\1\5\uffff\1\57\1\uffff\4"+
        "\57\1\uffff\2\57\1\uffff\2\57\u035d\uffff";
    static final String DFA45_minS =
        "\1\12\53\uffff\1\7\1\47\1\12\7\uffff\1\7\5\uffff\1\4\1\uffff\4\4"+
        "\1\uffff\2\4\1\uffff\2\4\1\uffff\1\7\26\uffff\1\u011c\25\uffff\1"+
        "\7\4\uffff\1\4\1\uffff\4\4\1\uffff\2\4\1\uffff\2\4\1\uffff\1\7\u0279"+
        "\uffff\1\0\1\uffff\1\0\u00a0\uffff";
    static final String DFA45_maxS =
        "\1\u0128\53\uffff\1\u012f\1\u00d5\1\u0127\7\uffff\1\u012f\5\uffff"+
        "\1\u012b\1\uffff\4\u012b\1\uffff\2\u012b\1\uffff\2\u012b\1\uffff"+
        "\1\u012f\26\uffff\1\u011c\25\uffff\1\u012f\4\uffff\1\u012b\1\uffff"+
        "\4\u012b\1\uffff\2\u012b\1\uffff\2\u012b\1\uffff\1\u012f\u0279\uffff"+
        "\1\0\1\uffff\1\0\u00a0\uffff";
    static final String DFA45_acceptS =
        "\1\uffff\1\11\55\uffff\1\2\61\uffff\1\7\1\1\47\uffff\1\10\24\uffff"+
        "\1\2\100\uffff\1\2\100\uffff\1\2\100\uffff\1\2\100\uffff\1\2\u0081"+
        "\uffff\1\2\100\uffff\1\2\100\uffff\2\2\126\uffff\1\2\3\uffff\1\5"+
        "\1\uffff\1\5\1\6\u0099\uffff\1\10\2\uffff\1\3\1\4";
    static final String DFA45_specialS =
        "\166\uffff\1\0\u028b\uffff\1\1\1\uffff\1\2\u00a0\uffff}>";
    static final String[] DFA45_transitionS = {
            "\1\1\11\uffff\2\57\1\uffff\2\57\1\uffff\15\1\1\66\10\1\2\uffff"+
            "\1\1\1\uffff\4\1\1\uffff\12\1\1\uffff\2\1\1\uffff\20\1\1\uffff"+
            "\10\1\1\uffff\4\1\1\uffff\10\1\1\uffff\5\1\1\uffff\7\1\1\uffff"+
            "\2\1\1\56\22\1\1\uffff\1\54\11\1\1\uffff\4\1\1\uffff\3\1\1\55"+
            "\4\1\1\uffff\10\1\1\uffff\3\1\1\uffff\5\1\2\uffff\16\1\1\54"+
            "\6\1\1\54\35\1\1\uffff\12\1\1\uffff\4\1\1\uffff\3\1\1\uffff"+
            "\12\1\1\uffff\6\1\1\uffff\2\57\5\uffff\1\57\5\uffff\2\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\57\2\uffff\1\1\2\uffff\1\57\4\uffff\1\57\7\uffff\7\57\1"+
            "\uffff\21\57\1\uffff\1\77\3\57\1\uffff\10\57\1\uffff\1\57\1"+
            "\uffff\2\57\1\uffff\20\57\1\uffff\1\100\3\57\1\uffff\1\57\1"+
            "\uffff\1\57\1\uffff\4\57\1\uffff\10\57\1\uffff\3\57\1\1\1\57"+
            "\1\uffff\2\57\1\74\1\57\1\1\14\57\1\107\6\57\1\uffff\2\57\1"+
            "\106\1\57\1\uffff\1\57\1\103\10\57\1\uffff\1\111\3\57\1\uffff"+
            "\3\57\1\uffff\4\57\1\uffff\1\57\1\uffff\1\57\1\76\4\57\1\uffff"+
            "\3\57\1\uffff\5\57\2\uffff\15\57\1\1\17\57\1\1\13\57\1\101\11"+
            "\57\1\uffff\4\57\1\uffff\5\57\1\uffff\4\57\1\uffff\1\57\1\104"+
            "\1\57\1\uffff\12\57\1\uffff\1\57\1\uffff\1\1\1\57\1\1\1\57\3"+
            "\uffff\1\57\2\uffff\1\57\2\uffff\2\57\3\uffff\1\1\4\uffff\4"+
            "\57",
            "\1\141\127\uffff\1\140\23\uffff\1\142\72\uffff\1\142\6\uffff"+
            "\1\142",
            "\1\1\51\uffff\1\1\43\uffff\1\1\31\uffff\1\1\4\uffff\1\1\1\uffff"+
            "\1\1\14\uffff\1\1\11\uffff\1\1\3\uffff\1\1\11\uffff\1\1\20\uffff"+
            "\1\1\35\uffff\1\1\17\uffff\1\1\13\uffff\1\1\33\uffff\1\1\17"+
            "\uffff\1\1\1\uffff\1\1\4\uffff\1\166\12\uffff\1\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u008a\2\uffff\1\1\2\uffff\1\u008a\4\uffff\1\u008a\7\uffff"+
            "\7\u008a\1\uffff\21\u008a\1\uffff\1\176\3\u008a\1\uffff\10\u008a"+
            "\1\uffff\1\u008a\1\uffff\2\u008a\1\uffff\20\u008a\1\uffff\1"+
            "\177\3\u008a\1\uffff\1\u008a\1\uffff\1\u008a\1\uffff\4\u008a"+
            "\1\uffff\10\u008a\1\uffff\3\u008a\1\1\1\u008a\1\uffff\2\u008a"+
            "\1\173\1\u008a\1\1\14\u008a\1\u0086\6\u008a\1\uffff\2\u008a"+
            "\1\u0085\1\u008a\1\uffff\1\u008a\1\u0082\10\u008a\1\uffff\1"+
            "\u0088\3\u008a\1\uffff\3\u008a\1\uffff\4\u008a\1\uffff\1\u008a"+
            "\1\uffff\1\u008a\1\175\4\u008a\1\uffff\3\u008a\1\uffff\5\u008a"+
            "\2\uffff\15\u008a\1\1\17\u008a\1\1\13\u008a\1\u0080\11\u008a"+
            "\1\uffff\4\u008a\1\uffff\5\u008a\1\uffff\4\u008a\1\uffff\1\u008a"+
            "\1\u0083\1\u008a\1\uffff\12\u008a\1\uffff\1\u008a\1\uffff\1"+
            "\1\1\u008a\1\1\1\u008a\3\uffff\1\u008a\2\uffff\1\u008a\2\uffff"+
            "\2\u008a\3\uffff\1\1\4\uffff\4\u008a",
            "",
            "",
            "",
            "",
            "",
            "\3\57\3\uffff\1\57\3\uffff\2\57\1\uffff\1\57\2\uffff\2\57\1"+
            "\uffff\2\57\1\uffff\24\57\1\u009f\1\57\2\uffff\1\57\1\uffff"+
            "\4\57\1\uffff\12\57\1\uffff\2\57\1\uffff\20\57\1\uffff\10\57"+
            "\1\uffff\4\57\1\uffff\10\57\1\uffff\5\57\1\uffff\7\57\1\uffff"+
            "\25\57\1\uffff\12\57\1\uffff\4\57\1\uffff\10\57\1\uffff\10\57"+
            "\1\uffff\3\57\1\uffff\5\57\2\uffff\63\57\1\uffff\12\57\1\uffff"+
            "\4\57\1\uffff\3\57\1\uffff\12\57\1\uffff\6\57\1\uffff\4\57\1"+
            "\uffff\3\57\1\uffff\1\57\3\uffff\2\57\2\uffff\1\57",
            "",
            "\3\57\3\uffff\1\57\3\uffff\2\57\1\uffff\1\57\2\uffff\2\57\1"+
            "\uffff\2\57\1\uffff\24\57\1\u00e0\1\57\2\uffff\1\57\1\uffff"+
            "\4\57\1\uffff\12\57\1\uffff\2\57\1\uffff\20\57\1\uffff\10\57"+
            "\1\uffff\4\57\1\uffff\10\57\1\uffff\5\57\1\uffff\7\57\1\uffff"+
            "\25\57\1\uffff\12\57\1\uffff\4\57\1\uffff\10\57\1\uffff\10\57"+
            "\1\uffff\3\57\1\uffff\5\57\2\uffff\63\57\1\uffff\12\57\1\uffff"+
            "\4\57\1\uffff\3\57\1\uffff\12\57\1\uffff\6\57\1\uffff\4\57\1"+
            "\uffff\3\57\1\uffff\1\57\3\uffff\2\57\2\uffff\1\57",
            "\3\57\3\uffff\1\57\3\uffff\2\57\1\uffff\1\57\2\uffff\2\57\1"+
            "\uffff\2\57\1\uffff\24\57\1\u0121\1\57\2\uffff\1\57\1\uffff"+
            "\4\57\1\uffff\12\57\1\uffff\2\57\1\uffff\20\57\1\uffff\10\57"+
            "\1\uffff\4\57\1\uffff\10\57\1\uffff\5\57\1\uffff\7\57\1\uffff"+
            "\25\57\1\uffff\12\57\1\uffff\4\57\1\uffff\10\57\1\uffff\10\57"+
            "\1\uffff\3\57\1\uffff\5\57\2\uffff\63\57\1\uffff\12\57\1\uffff"+
            "\4\57\1\uffff\3\57\1\uffff\12\57\1\uffff\6\57\1\uffff\4\57\1"+
            "\uffff\3\57\1\uffff\1\57\3\uffff\2\57\2\uffff\1\57",
            "\3\57\3\uffff\1\57\3\uffff\2\57\1\uffff\1\57\2\uffff\2\57\1"+
            "\uffff\2\57\1\uffff\24\57\1\u0162\1\57\2\uffff\1\57\1\uffff"+
            "\4\57\1\uffff\12\57\1\uffff\2\57\1\uffff\20\57\1\uffff\10\57"+
            "\1\uffff\4\57\1\uffff\10\57\1\uffff\5\57\1\uffff\7\57\1\uffff"+
            "\25\57\1\uffff\12\57\1\uffff\4\57\1\uffff\10\57\1\uffff\10\57"+
            "\1\uffff\3\57\1\uffff\5\57\2\uffff\63\57\1\uffff\12\57\1\uffff"+
            "\4\57\1\uffff\3\57\1\uffff\12\57\1\uffff\6\57\1\uffff\4\57\1"+
            "\uffff\3\57\1\uffff\1\57\3\uffff\2\57\2\uffff\1\57",
            "\3\57\3\uffff\1\57\3\uffff\2\57\1\uffff\1\57\2\uffff\2\57\1"+
            "\uffff\2\57\1\uffff\24\57\1\u01a3\1\57\2\uffff\1\57\1\uffff"+
            "\4\57\1\uffff\12\57\1\uffff\2\57\1\uffff\20\57\1\uffff\10\57"+
            "\1\uffff\4\57\1\uffff\10\57\1\uffff\5\57\1\uffff\7\57\1\uffff"+
            "\25\57\1\uffff\12\57\1\uffff\4\57\1\uffff\10\57\1\uffff\10\57"+
            "\1\uffff\3\57\1\uffff\5\57\2\uffff\63\57\1\uffff\12\57\1\uffff"+
            "\4\57\1\uffff\3\57\1\uffff\12\57\1\uffff\6\57\1\uffff\4\57\1"+
            "\uffff\3\57\1\uffff\1\57\3\uffff\2\57\2\uffff\1\57",
            "",
            "\3\57\3\uffff\1\57\3\uffff\2\57\1\uffff\1\57\2\uffff\2\57\1"+
            "\uffff\2\57\1\uffff\26\57\2\uffff\1\57\1\uffff\4\57\1\uffff"+
            "\12\57\1\uffff\2\57\1\uffff\20\57\1\uffff\10\57\1\uffff\4\57"+
            "\1\uffff\10\57\1\uffff\5\57\1\uffff\7\57\1\uffff\25\57\1\uffff"+
            "\12\57\1\uffff\4\57\1\uffff\10\57\1\uffff\10\57\1\uffff\3\57"+
            "\1\uffff\5\57\2\uffff\63\57\1\uffff\12\57\1\uffff\4\57\1\uffff"+
            "\3\57\1\uffff\12\57\1\uffff\6\57\1\uffff\4\57\1\uffff\3\57\1"+
            "\1\1\57\3\uffff\2\57\2\uffff\1\57",
            "\3\57\3\uffff\1\57\3\uffff\2\57\1\uffff\1\57\2\uffff\2\57\1"+
            "\uffff\2\57\1\uffff\4\57\1\u0225\21\57\2\uffff\1\57\1\uffff"+
            "\4\57\1\uffff\12\57\1\uffff\2\57\1\uffff\20\57\1\uffff\10\57"+
            "\1\uffff\4\57\1\uffff\10\57\1\uffff\5\57\1\uffff\7\57\1\uffff"+
            "\25\57\1\uffff\12\57\1\uffff\4\57\1\uffff\10\57\1\uffff\10\57"+
            "\1\uffff\3\57\1\uffff\5\57\2\uffff\63\57\1\uffff\12\57\1\uffff"+
            "\4\57\1\uffff\3\57\1\uffff\12\57\1\uffff\6\57\1\uffff\4\57\1"+
            "\uffff\3\57\1\uffff\1\57\3\uffff\2\57\2\uffff\1\57",
            "",
            "\3\57\3\uffff\1\57\3\uffff\2\57\1\uffff\1\57\2\uffff\2\57\1"+
            "\uffff\2\57\1\uffff\26\57\2\uffff\1\57\1\uffff\4\57\1\uffff"+
            "\12\57\1\uffff\2\57\1\uffff\20\57\1\uffff\10\57\1\uffff\4\57"+
            "\1\uffff\10\57\1\uffff\5\57\1\uffff\7\57\1\uffff\25\57\1\uffff"+
            "\12\57\1\uffff\4\57\1\uffff\10\57\1\uffff\10\57\1\uffff\3\57"+
            "\1\uffff\5\57\2\uffff\63\57\1\uffff\12\57\1\uffff\4\57\1\uffff"+
            "\3\57\1\uffff\12\57\1\uffff\1\u0266\5\57\1\uffff\4\57\1\uffff"+
            "\3\57\1\uffff\1\57\3\uffff\2\57\2\uffff\1\57",
            "\3\57\3\uffff\1\57\3\uffff\2\57\1\uffff\1\57\2\uffff\2\57\1"+
            "\uffff\2\57\1\uffff\26\57\2\uffff\1\57\1\uffff\4\57\1\uffff"+
            "\12\57\1\uffff\2\57\1\uffff\20\57\1\uffff\10\57\1\uffff\4\57"+
            "\1\uffff\10\57\1\uffff\5\57\1\uffff\7\57\1\uffff\14\57\1\u02a8"+
            "\10\57\1\uffff\12\57\1\uffff\4\57\1\uffff\10\57\1\uffff\10\57"+
            "\1\uffff\1\u02a7\2\57\1\uffff\5\57\2\uffff\63\57\1\uffff\12"+
            "\57\1\uffff\4\57\1\uffff\3\57\1\uffff\12\57\1\uffff\6\57\1\uffff"+
            "\4\57\1\uffff\3\57\1\uffff\1\57\3\uffff\2\57\2\uffff\1\57",
            "",
            "\1\1\5\uffff\1\1\4\uffff\1\1\7\uffff\7\1\1\uffff\21\1\1\uffff"+
            "\4\1\1\uffff\10\1\1\uffff\1\1\1\uffff\2\1\1\uffff\20\1\1\uffff"+
            "\4\1\1\uffff\1\1\1\uffff\1\1\1\uffff\4\1\1\uffff\10\1\1\uffff"+
            "\3\1\1\uffff\1\1\1\uffff\4\1\1\uffff\23\1\1\uffff\4\1\1\uffff"+
            "\12\1\1\uffff\4\1\1\uffff\10\1\1\uffff\1\1\1\uffff\6\1\1\uffff"+
            "\3\1\1\uffff\5\1\2\uffff\15\1\1\uffff\17\1\1\uffff\25\1\1\uffff"+
            "\4\1\1\uffff\5\1\1\uffff\4\1\1\uffff\3\1\1\uffff\12\1\1\uffff"+
            "\1\1\2\uffff\1\1\1\uffff\1\1\3\uffff\1\u02ff\2\uffff\1\1\2\uffff"+
            "\2\1\7\uffff\5\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0302",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0306\5\uffff\1\u0306\4\uffff\1\u0306\7\uffff\7\u0306\1"+
            "\uffff\21\u0306\1\uffff\4\u0306\1\uffff\10\u0306\1\uffff\1\u0306"+
            "\1\uffff\2\u0306\1\uffff\20\u0306\1\uffff\4\u0306\1\uffff\1"+
            "\u0306\1\uffff\1\u0306\1\uffff\4\u0306\1\uffff\10\u0306\1\uffff"+
            "\3\u0306\1\uffff\1\u0306\1\uffff\4\u0306\1\uffff\23\u0306\1"+
            "\uffff\4\u0306\1\uffff\12\u0306\1\uffff\1\u0304\3\u0306\1\uffff"+
            "\10\u0306\1\uffff\1\u0306\1\uffff\6\u0306\1\uffff\3\u0306\1"+
            "\uffff\5\u0306\2\uffff\15\u0306\1\u0305\17\u0306\1\u0303\25"+
            "\u0306\1\uffff\4\u0306\1\uffff\5\u0306\1\uffff\4\u0306\1\uffff"+
            "\3\u0306\1\uffff\12\u0306\1\uffff\1\u0306\2\uffff\1\u0306\1"+
            "\uffff\1\u0306\3\uffff\1\u0306\2\uffff\1\u0306\2\uffff\2\u0306"+
            "\10\uffff\4\u0306",
            "",
            "",
            "",
            "",
            "\3\u008a\7\uffff\2\u008a\1\uffff\1\u008a\17\uffff\1\u008a\14"+
            "\uffff\1\1\133\uffff\1\u008a\u0091\uffff\2\u008a\1\uffff\2\u008a"+
            "\2\uffff\1\u008a\7\uffff\1\u008a",
            "",
            "\3\u008a\7\uffff\2\u008a\1\uffff\1\u008a\17\uffff\1\u008a\14"+
            "\uffff\1\1\133\uffff\1\u008a\u0091\uffff\2\u008a\1\uffff\2\u008a"+
            "\2\uffff\1\u008a\7\uffff\1\u008a",
            "\3\u008a\7\uffff\2\u008a\1\uffff\1\u008a\17\uffff\1\u008a\14"+
            "\uffff\1\1\133\uffff\1\u008a\u0091\uffff\2\u008a\1\uffff\2\u008a"+
            "\2\uffff\1\u008a\7\uffff\1\u008a",
            "\3\u008a\7\uffff\2\u008a\1\uffff\1\u008a\17\uffff\1\u008a\14"+
            "\uffff\1\1\133\uffff\1\u008a\u0091\uffff\2\u008a\1\uffff\2\u008a"+
            "\2\uffff\1\u008a\7\uffff\1\u008a",
            "\3\u008a\7\uffff\2\u008a\1\uffff\1\u008a\17\uffff\1\u008a\14"+
            "\uffff\1\1\133\uffff\1\u008a\u0091\uffff\2\u008a\1\uffff\2\u008a"+
            "\2\uffff\1\u008a\7\uffff\1\u008a",
            "",
            "\3\u008a\7\uffff\2\u008a\1\uffff\1\u008a\17\uffff\1\u008a\150"+
            "\uffff\1\u008a\u0091\uffff\2\u008a\1\uffff\2\u008a\1\uffff\1"+
            "\1\1\u008a\7\uffff\1\u008a",
            "\3\u008a\7\uffff\2\u008a\1\uffff\1\u008a\14\uffff\1\1\2\uffff"+
            "\1\u008a\150\uffff\1\u008a\u0091\uffff\2\u008a\1\uffff\2\u008a"+
            "\2\uffff\1\u008a\7\uffff\1\u008a",
            "",
            "\3\u008a\7\uffff\2\u008a\1\uffff\1\u008a\17\uffff\1\u008a\150"+
            "\uffff\1\u008a\u0088\uffff\1\1\10\uffff\2\u008a\1\uffff\2\u008a"+
            "\2\uffff\1\u008a\7\uffff\1\u008a",
            "\3\u008a\7\uffff\2\u008a\1\uffff\1\u008a\17\uffff\1\u008a\147"+
            "\uffff\1\1\1\u008a\52\uffff\1\1\146\uffff\2\u008a\1\uffff\2"+
            "\u008a\2\uffff\1\u008a\7\uffff\1\u008a",
            "",
            "\1\1\5\uffff\1\1\4\uffff\1\1\7\uffff\7\1\1\uffff\21\1\1\uffff"+
            "\4\1\1\uffff\10\1\1\uffff\1\1\1\uffff\2\1\1\uffff\20\1\1\uffff"+
            "\4\1\1\uffff\1\1\1\uffff\1\1\1\uffff\4\1\1\uffff\10\1\1\uffff"+
            "\3\1\1\uffff\1\1\1\uffff\4\1\1\uffff\23\1\1\uffff\4\1\1\uffff"+
            "\12\1\1\uffff\4\1\1\uffff\10\1\1\uffff\1\1\1\uffff\6\1\1\uffff"+
            "\3\1\1\uffff\5\1\2\uffff\15\1\1\uffff\17\1\1\uffff\25\1\1\uffff"+
            "\4\1\1\uffff\5\1\1\uffff\4\1\1\uffff\3\1\1\uffff\12\1\1\uffff"+
            "\1\1\2\uffff\1\1\1\uffff\1\1\3\uffff\1\u03a0\2\uffff\1\1\2\uffff"+
            "\2\1\7\uffff\5\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA45_eot = DFA.unpackEncodedString(DFA45_eotS);
    static final short[] DFA45_eof = DFA.unpackEncodedString(DFA45_eofS);
    static final char[] DFA45_min = DFA.unpackEncodedStringToUnsignedChars(DFA45_minS);
    static final char[] DFA45_max = DFA.unpackEncodedStringToUnsignedChars(DFA45_maxS);
    static final short[] DFA45_accept = DFA.unpackEncodedString(DFA45_acceptS);
    static final short[] DFA45_special = DFA.unpackEncodedString(DFA45_specialS);
    static final short[][] DFA45_transition;

    static {
        int numStates = DFA45_transitionS.length;
        DFA45_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA45_transition[i] = DFA.unpackEncodedString(DFA45_transitionS[i]);
        }
    }

    class DFA45 extends DFA {

        public DFA45(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 45;
            this.eot = DFA45_eot;
            this.eof = DFA45_eof;
            this.min = DFA45_min;
            this.max = DFA45_max;
            this.accept = DFA45_accept;
            this.special = DFA45_special;
            this.transition = DFA45_transition;
        }
        public String getDescription() {
            return "()* loopback of 382:5: ( ( KW_NOT precedenceEqualNegatableOperator notExpr= precedenceBitwiseOrExpression ) -> ^( KW_NOT ^( precedenceEqualNegatableOperator $precedenceEqualExpression $notExpr) ) | ( precedenceEqualOperator equalExpr= precedenceBitwiseOrExpression ) -> ^( precedenceEqualOperator $precedenceEqualExpression $equalExpr) | ( KW_NOT KW_IN LPAREN KW_SELECT )=> ( KW_NOT KW_IN subQueryExpression ) -> ^( KW_NOT ^( TOK_SUBQUERY_EXPR ^( TOK_SUBQUERY_OP KW_IN ) subQueryExpression $precedenceEqualExpression) ) | ( KW_NOT KW_IN expressions ) -> ^( KW_NOT ^( TOK_FUNCTION KW_IN $precedenceEqualExpression expressions ) ) | ( KW_IN LPAREN KW_SELECT )=> ( KW_IN subQueryExpression ) -> ^( TOK_SUBQUERY_EXPR ^( TOK_SUBQUERY_OP KW_IN ) subQueryExpression $precedenceEqualExpression) | ( KW_IN expressions ) -> ^( TOK_FUNCTION KW_IN $precedenceEqualExpression expressions ) | ( KW_NOT KW_BETWEEN (min= precedenceBitwiseOrExpression ) KW_AND (max= precedenceBitwiseOrExpression ) ) -> ^( TOK_FUNCTION Identifier[\"between\"] KW_TRUE $left $min $max) | ( KW_BETWEEN (min= precedenceBitwiseOrExpression ) KW_AND (max= precedenceBitwiseOrExpression ) ) -> ^( TOK_FUNCTION Identifier[\"between\"] KW_FALSE $left $min $max) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA45_118 = input.LA(1);

                         
                        int index45_118 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (LA45_118==KW_SELECT) && (synpred7_IdentifiersParser())) {s = 771;}

                        else if ( (LA45_118==KW_MAP) ) {s = 772;}

                        else if ( (LA45_118==KW_REDUCE) && (synpred7_IdentifiersParser())) {s = 773;}

                        else if ( (LA45_118==BigintLiteral||LA45_118==CharSetName||LA45_118==DecimalLiteral||(LA45_118 >= Identifier && LA45_118 <= KW_ANALYZE)||(LA45_118 >= KW_ARCHIVE && LA45_118 <= KW_CHANGE)||(LA45_118 >= KW_CLUSTER && LA45_118 <= KW_COLLECTION)||(LA45_118 >= KW_COLUMNS && LA45_118 <= KW_CREATE)||LA45_118==KW_CUBE||(LA45_118 >= KW_CURSOR && LA45_118 <= KW_DATA)||(LA45_118 >= KW_DATABASES && LA45_118 <= KW_DISABLE)||(LA45_118 >= KW_DISTRIBUTE && LA45_118 <= KW_ELEM_TYPE)||LA45_118==KW_ENABLE||LA45_118==KW_ESCAPED||(LA45_118 >= KW_EXCLUSIVE && LA45_118 <= KW_EXPORT)||(LA45_118 >= KW_EXTERNAL && LA45_118 <= KW_FLOAT)||(LA45_118 >= KW_FOR && LA45_118 <= KW_FORMATTED)||LA45_118==KW_FULL||(LA45_118 >= KW_FUNCTIONS && LA45_118 <= KW_GROUPING)||(LA45_118 >= KW_HOLD_DDLTIME && LA45_118 <= KW_JAR)||(LA45_118 >= KW_KEYS && LA45_118 <= KW_LEFT)||(LA45_118 >= KW_LIKE && LA45_118 <= KW_LONG)||(LA45_118 >= KW_MAPJOIN && LA45_118 <= KW_MINUS)||(LA45_118 >= KW_MSCK && LA45_118 <= KW_OFFLINE)||LA45_118==KW_OPTION||(LA45_118 >= KW_ORCFILE && LA45_118 <= KW_OUTPUTFORMAT)||(LA45_118 >= KW_OVERWRITE && LA45_118 <= KW_PARQUETFILE)||(LA45_118 >= KW_PARTITION && LA45_118 <= KW_PLUS)||(LA45_118 >= KW_PRETTY && LA45_118 <= KW_RECORDWRITER)||(LA45_118 >= KW_REGEXP && LA45_118 <= KW_SCHEMAS)||(LA45_118 >= KW_SEMI && LA45_118 <= KW_TABLES)||(LA45_118 >= KW_TBLPROPERTIES && LA45_118 <= KW_TEXTFILE)||(LA45_118 >= KW_TIMESTAMP && LA45_118 <= KW_TRANSACTIONS)||(LA45_118 >= KW_TRIGGER && LA45_118 <= KW_UNARCHIVE)||(LA45_118 >= KW_UNDO && LA45_118 <= KW_UNIONTYPE)||(LA45_118 >= KW_UNLOCK && LA45_118 <= KW_VALUE_TYPE)||LA45_118==KW_VIEW||LA45_118==KW_WHILE||LA45_118==KW_WITH||LA45_118==LPAREN||LA45_118==MINUS||(LA45_118 >= Number && LA45_118 <= PLUS)||(LA45_118 >= SmallintLiteral && LA45_118 <= TinyintLiteral)) ) {s = 774;}

                         
                        input.seek(index45_118);

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA45_770 = input.LA(1);

                         
                        int index45_770 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred6_IdentifiersParser()) ) {s = 931;}

                        else if ( (true) ) {s = 932;}

                         
                        input.seek(index45_770);

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA45_772 = input.LA(1);

                         
                        int index45_772 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred7_IdentifiersParser()) ) {s = 773;}

                        else if ( (true) ) {s = 774;}

                         
                        input.seek(index45_772);

                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}

            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 45, _s, input);
            error(nvae);
            throw nvae;
        }

    }
 

    public static final BitSet FOLLOW_KW_GROUP_in_groupByClause72 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_KW_BY_in_groupByClause74 = new BitSet(new long[]{0xFEF7FFFDFC042080L,0xFDEBBFDEAF7FFFB5L,0x3EEFD7FBDFFBDFFFL,0xBEF7FFFFDFFFDFFFL,0x0000F00C914BFF77L});
    public static final BitSet FOLLOW_groupByExpression_in_groupByClause80 = new BitSet(new long[]{0x0000000000000402L,0x0100000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_COMMA_in_groupByClause88 = new BitSet(new long[]{0xFEF7FFFDFC042080L,0xFDEBBFDEAF7FFFB5L,0x3EEFD7FBDFFBDFFFL,0xBEF7FFFFDFFFDFFFL,0x0000F00C914BFF77L});
    public static final BitSet FOLLOW_groupByExpression_in_groupByClause90 = new BitSet(new long[]{0x0000000000000402L,0x0100000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_KW_WITH_in_groupByClause103 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_KW_ROLLUP_in_groupByClause105 = new BitSet(new long[]{0x0000000000000002L,0x0100000000000000L});
    public static final BitSet FOLLOW_KW_WITH_in_groupByClause113 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_KW_CUBE_in_groupByClause115 = new BitSet(new long[]{0x0000000000000002L,0x0100000000000000L});
    public static final BitSet FOLLOW_KW_GROUPING_in_groupByClause128 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_KW_SETS_in_groupByClause130 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_LPAREN_in_groupByClause137 = new BitSet(new long[]{0xFEF7FFFDFC042080L,0xFDEBBFDEAF7FFFB5L,0x3EEFD7FBDFFBDFFFL,0xBEF7FFFFDFFFDFFFL,0x0000F00C914BFF77L});
    public static final BitSet FOLLOW_groupingSetExpression_in_groupByClause139 = new BitSet(new long[]{0x0000000000000400L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_COMMA_in_groupByClause143 = new BitSet(new long[]{0xFEF7FFFDFC042080L,0xFDEBBFDEAF7FFFB5L,0x3EEFD7FBDFFBDFFFL,0xBEF7FFFFDFFFDFFFL,0x0000F00C914BFF77L});
    public static final BitSet FOLLOW_groupingSetExpression_in_groupByClause145 = new BitSet(new long[]{0x0000000000000400L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_RPAREN_in_groupByClause150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_groupByExpression_in_groupingSetExpression244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_groupingSetExpression265 = new BitSet(new long[]{0xFEF7FFFDFC042080L,0xFDEBBFDEAF7FFFB5L,0x3EEFD7FBDFFBDFFFL,0xBEF7FFFFDFFFDFFFL,0x0000F00C914BFF77L});
    public static final BitSet FOLLOW_groupByExpression_in_groupingSetExpression271 = new BitSet(new long[]{0x0000000000000400L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_COMMA_in_groupingSetExpression274 = new BitSet(new long[]{0xFEF7FFFDFC042080L,0xFDEBBFDEAF7FFFB5L,0x3EEFD7FBDFFBDFFFL,0xBEF7FFFFDFFFDFFFL,0x0000F00C914BFF77L});
    public static final BitSet FOLLOW_groupByExpression_in_groupingSetExpression276 = new BitSet(new long[]{0x0000000000000400L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_RPAREN_in_groupingSetExpression283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_groupingSetExpression305 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_RPAREN_in_groupingSetExpression310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_groupByExpression350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_HAVING_in_havingClause381 = new BitSet(new long[]{0xFEF7FFFDFC042080L,0xFDEBBFDEAF7FFFB5L,0x3EEFD7FBDFFBDFFFL,0xBEF7FFFFDFFFDFFFL,0x0000F00C914BFF77L});
    public static final BitSet FOLLOW_havingCondition_in_havingClause383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_havingCondition422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_ORDER_in_orderByClause454 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_KW_BY_in_orderByClause456 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_LPAREN_in_orderByClause462 = new BitSet(new long[]{0xFEF7FFFDFC042080L,0xFDEBBFDEAF7FFFB5L,0x3EEFD7FBDFFBDFFFL,0xBEF7FFFFDFFFDFFFL,0x0000F00C914BFF77L});
    public static final BitSet FOLLOW_columnRefOrder_in_orderByClause464 = new BitSet(new long[]{0x0000000000000400L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_COMMA_in_orderByClause472 = new BitSet(new long[]{0xFEF7FFFDFC042080L,0xFDEBBFDEAF7FFFB5L,0x3EEFD7FBDFFBDFFFL,0xBEF7FFFFDFFFDFFFL,0x0000F00C914BFF77L});
    public static final BitSet FOLLOW_columnRefOrder_in_orderByClause474 = new BitSet(new long[]{0x0000000000000400L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_RPAREN_in_orderByClause478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_ORDER_in_orderByClause499 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_KW_BY_in_orderByClause501 = new BitSet(new long[]{0xFEF7FFFDFC042080L,0xFDEBBFDEAF7FFFB5L,0x3EEFD7FBDFFBDFFFL,0xBEF7FFFFDFFFDFFFL,0x0000F00C914BFF77L});
    public static final BitSet FOLLOW_columnRefOrder_in_orderByClause507 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_orderByClause515 = new BitSet(new long[]{0xFEF7FFFDFC042080L,0xFDEBBFDEAF7FFFB5L,0x3EEFD7FBDFFBDFFFL,0xBEF7FFFFDFFFDFFFL,0x0000F00C914BFF77L});
    public static final BitSet FOLLOW_columnRefOrder_in_orderByClause517 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_KW_CLUSTER_in_clusterByClause559 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_KW_BY_in_clusterByClause561 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_LPAREN_in_clusterByClause567 = new BitSet(new long[]{0xFEF7FFFDFC042080L,0xFDEBBFDEAF7FFFB5L,0x3EEFD7FBDFFBDFFFL,0xBEF7FFFFDFFFDFFFL,0x0000F00C914BFF77L});
    public static final BitSet FOLLOW_expression_in_clusterByClause569 = new BitSet(new long[]{0x0000000000000400L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_COMMA_in_clusterByClause572 = new BitSet(new long[]{0xFEF7FFFDFC042080L,0xFDEBBFDEAF7FFFB5L,0x3EEFD7FBDFFBDFFFL,0xBEF7FFFFDFFFDFFFL,0x0000F00C914BFF77L});
    public static final BitSet FOLLOW_expression_in_clusterByClause574 = new BitSet(new long[]{0x0000000000000400L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_RPAREN_in_clusterByClause578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_CLUSTER_in_clusterByClause599 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_KW_BY_in_clusterByClause601 = new BitSet(new long[]{0xFEF7FFFDFC042080L,0xFDEBBFDEAF7FFFB5L,0x3EEFD7FBDFFBDFFFL,0xBEF7FFFFDFFFDFFFL,0x0000F00C914BFF77L});
    public static final BitSet FOLLOW_expression_in_clusterByClause607 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_clusterByClause619 = new BitSet(new long[]{0xFEF7FFFDFC042080L,0xFDEBBFDEAF7FFFB5L,0x3EEFD7FBDFFBDFFFL,0xBEF7FFFFDFFFDFFFL,0x0000F00C914BFF77L});
    public static final BitSet FOLLOW_expression_in_clusterByClause621 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_KW_PARTITION_in_partitionByClause665 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_KW_BY_in_partitionByClause667 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_LPAREN_in_partitionByClause673 = new BitSet(new long[]{0xFEF7FFFDFC042080L,0xFDEBBFDEAF7FFFB5L,0x3EEFD7FBDFFBDFFFL,0xBEF7FFFFDFFFDFFFL,0x0000F00C914BFF77L});
    public static final BitSet FOLLOW_expression_in_partitionByClause675 = new BitSet(new long[]{0x0000000000000400L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_COMMA_in_partitionByClause678 = new BitSet(new long[]{0xFEF7FFFDFC042080L,0xFDEBBFDEAF7FFFB5L,0x3EEFD7FBDFFBDFFFL,0xBEF7FFFFDFFFDFFFL,0x0000F00C914BFF77L});
    public static final BitSet FOLLOW_expression_in_partitionByClause680 = new BitSet(new long[]{0x0000000000000400L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_RPAREN_in_partitionByClause684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_PARTITION_in_partitionByClause705 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_KW_BY_in_partitionByClause707 = new BitSet(new long[]{0xFEF7FFFDFC042080L,0xFDEBBFDEAF7FFFB5L,0x3EEFD7FBDFFBDFFFL,0xBEF7FFFFDFFFDFFFL,0x0000F00C914BFF77L});
    public static final BitSet FOLLOW_expression_in_partitionByClause713 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_partitionByClause721 = new BitSet(new long[]{0xFEF7FFFDFC042080L,0xFDEBBFDEAF7FFFB5L,0x3EEFD7FBDFFBDFFFL,0xBEF7FFFFDFFFDFFFL,0x0000F00C914BFF77L});
    public static final BitSet FOLLOW_expression_in_partitionByClause723 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_KW_DISTRIBUTE_in_distributeByClause765 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_KW_BY_in_distributeByClause767 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_LPAREN_in_distributeByClause773 = new BitSet(new long[]{0xFEF7FFFDFC042080L,0xFDEBBFDEAF7FFFB5L,0x3EEFD7FBDFFBDFFFL,0xBEF7FFFFDFFFDFFFL,0x0000F00C914BFF77L});
    public static final BitSet FOLLOW_expression_in_distributeByClause775 = new BitSet(new long[]{0x0000000000000400L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_COMMA_in_distributeByClause778 = new BitSet(new long[]{0xFEF7FFFDFC042080L,0xFDEBBFDEAF7FFFB5L,0x3EEFD7FBDFFBDFFFL,0xBEF7FFFFDFFFDFFFL,0x0000F00C914BFF77L});
    public static final BitSet FOLLOW_expression_in_distributeByClause780 = new BitSet(new long[]{0x0000000000000400L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_RPAREN_in_distributeByClause784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_DISTRIBUTE_in_distributeByClause805 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_KW_BY_in_distributeByClause807 = new BitSet(new long[]{0xFEF7FFFDFC042080L,0xFDEBBFDEAF7FFFB5L,0x3EEFD7FBDFFBDFFFL,0xBEF7FFFFDFFFDFFFL,0x0000F00C914BFF77L});
    public static final BitSet FOLLOW_expression_in_distributeByClause813 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_distributeByClause821 = new BitSet(new long[]{0xFEF7FFFDFC042080L,0xFDEBBFDEAF7FFFB5L,0x3EEFD7FBDFFBDFFFL,0xBEF7FFFFDFFFDFFFL,0x0000F00C914BFF77L});
    public static final BitSet FOLLOW_expression_in_distributeByClause823 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_KW_SORT_in_sortByClause865 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_KW_BY_in_sortByClause867 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_LPAREN_in_sortByClause873 = new BitSet(new long[]{0xFEF7FFFDFC042080L,0xFDEBBFDEAF7FFFB5L,0x3EEFD7FBDFFBDFFFL,0xBEF7FFFFDFFFDFFFL,0x0000F00C914BFF77L});
    public static final BitSet FOLLOW_columnRefOrder_in_sortByClause875 = new BitSet(new long[]{0x0000000000000400L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_COMMA_in_sortByClause883 = new BitSet(new long[]{0xFEF7FFFDFC042080L,0xFDEBBFDEAF7FFFB5L,0x3EEFD7FBDFFBDFFFL,0xBEF7FFFFDFFFDFFFL,0x0000F00C914BFF77L});
    public static final BitSet FOLLOW_columnRefOrder_in_sortByClause885 = new BitSet(new long[]{0x0000000000000400L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_RPAREN_in_sortByClause889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_SORT_in_sortByClause910 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_KW_BY_in_sortByClause912 = new BitSet(new long[]{0xFEF7FFFDFC042080L,0xFDEBBFDEAF7FFFB5L,0x3EEFD7FBDFFBDFFFL,0xBEF7FFFFDFFFDFFFL,0x0000F00C914BFF77L});
    public static final BitSet FOLLOW_columnRefOrder_in_sortByClause918 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_sortByClause931 = new BitSet(new long[]{0xFEF7FFFDFC042080L,0xFDEBBFDEAF7FFFB5L,0x3EEFD7FBDFFBDFFFL,0xBEF7FFFFDFFFDFFFL,0x0000F00C914BFF77L});
    public static final BitSet FOLLOW_columnRefOrder_in_sortByClause933 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_functionName_in_function976 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_LPAREN_in_function982 = new BitSet(new long[]{0xFEF7FFFDFC042080L,0xFDEBBFDEAFFFFFB5L,0x3EEFD7FBDFFBDFFFL,0xBEF7FFFFDFFFDFFFL,0x0000F88C914BFF77L});
    public static final BitSet FOLLOW_STAR_in_function1003 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_KW_DISTINCT_in_function1019 = new BitSet(new long[]{0xFEF7FFFDFC042080L,0xFDEBBFDEAF7FFFB5L,0x3EEFD7FBDFFBDFFFL,0xBEF7FFFFDFFFDFFFL,0x0000F88C914BFF77L});
    public static final BitSet FOLLOW_selectExpression_in_function1024 = new BitSet(new long[]{0x0000000000000400L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_COMMA_in_function1027 = new BitSet(new long[]{0xFEF7FFFDFC042080L,0xFDEBBFDEAF7FFFB5L,0x3EEFD7FBDFFBDFFFL,0xBEF7FFFFDFFFDFFFL,0x0000F80C914BFF77L});
    public static final BitSet FOLLOW_selectExpression_in_function1029 = new BitSet(new long[]{0x0000000000000400L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_RPAREN_in_function1047 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_KW_OVER_in_function1050 = new BitSet(new long[]{0x0000000004000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_window_specification_in_function1054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_IF_in_functionName1186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_ARRAY_in_functionName1190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_MAP_in_functionName1194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_STRUCT_in_functionName1198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_UNIONTYPE_in_functionName1202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionIdentifier_in_functionName1206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_CAST_in_castExpression1237 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_LPAREN_in_castExpression1243 = new BitSet(new long[]{0xFEF7FFFDFC042080L,0xFDEBBFDEAF7FFFB5L,0x3EEFD7FBDFFBDFFFL,0xBEF7FFFFDFFFDFFFL,0x0000F00C914BFF77L});
    public static final BitSet FOLLOW_expression_in_castExpression1255 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_KW_AS_in_castExpression1267 = new BitSet(new long[]{0x0008070000000000L,0x0000200002000B00L,0x0000000000000080L,0x0600810000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_primitiveType_in_castExpression1279 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_RPAREN_in_castExpression1285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_CASE_in_caseExpression1326 = new BitSet(new long[]{0xFEF7FFFDFC042080L,0xFDEBBFDEAF7FFFB5L,0x3EEFD7FBDFFBDFFFL,0xBEF7FFFFDFFFDFFFL,0x0000F00C914BFF77L});
    public static final BitSet FOLLOW_expression_in_caseExpression1328 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_KW_WHEN_in_caseExpression1335 = new BitSet(new long[]{0xFEF7FFFDFC042080L,0xFDEBBFDEAF7FFFB5L,0x3EEFD7FBDFFBDFFFL,0xBEF7FFFFDFFFDFFFL,0x0000F00C914BFF77L});
    public static final BitSet FOLLOW_expression_in_caseExpression1337 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_KW_THEN_in_caseExpression1339 = new BitSet(new long[]{0xFEF7FFFDFC042080L,0xFDEBBFDEAF7FFFB5L,0x3EEFD7FBDFFBDFFFL,0xBEF7FFFFDFFFDFFFL,0x0000F00C914BFF77L});
    public static final BitSet FOLLOW_expression_in_caseExpression1341 = new BitSet(new long[]{0x0000000000000000L,0x0000000050000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_KW_ELSE_in_caseExpression1350 = new BitSet(new long[]{0xFEF7FFFDFC042080L,0xFDEBBFDEAF7FFFB5L,0x3EEFD7FBDFFBDFFFL,0xBEF7FFFFDFFFDFFFL,0x0000F00C914BFF77L});
    public static final BitSet FOLLOW_expression_in_caseExpression1352 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_KW_END_in_caseExpression1360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_CASE_in_whenExpression1402 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_KW_WHEN_in_whenExpression1411 = new BitSet(new long[]{0xFEF7FFFDFC042080L,0xFDEBBFDEAF7FFFB5L,0x3EEFD7FBDFFBDFFFL,0xBEF7FFFFDFFFDFFFL,0x0000F00C914BFF77L});
    public static final BitSet FOLLOW_expression_in_whenExpression1413 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_KW_THEN_in_whenExpression1415 = new BitSet(new long[]{0xFEF7FFFDFC042080L,0xFDEBBFDEAF7FFFB5L,0x3EEFD7FBDFFBDFFFL,0xBEF7FFFFDFFFDFFFL,0x0000F00C914BFF77L});
    public static final BitSet FOLLOW_expression_in_whenExpression1417 = new BitSet(new long[]{0x0000000000000000L,0x0000000050000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_KW_ELSE_in_whenExpression1426 = new BitSet(new long[]{0xFEF7FFFDFC042080L,0xFDEBBFDEAF7FFFB5L,0x3EEFD7FBDFFBDFFFL,0xBEF7FFFFDFFFDFFFL,0x0000F00C914BFF77L});
    public static final BitSet FOLLOW_expression_in_whenExpression1428 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_KW_END_in_whenExpression1436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Number_in_constant1478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dateLiteral_in_constant1486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_constant1494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringLiteralSequence_in_constant1502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BigintLiteral_in_constant1510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SmallintLiteral_in_constant1518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TinyintLiteral_in_constant1526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DecimalLiteral_in_constant1534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_charSetStringLiteral_in_constant1542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanValue_in_constant1550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_stringLiteralSequence1571 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_StringLiteral_in_stringLiteralSequence1573 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_CharSetName_in_charSetStringLiteral1618 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_CharSetLiteral_in_charSetStringLiteral1622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_DATE_in_dateLiteral1655 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_StringLiteral_in_dateLiteral1657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_precedenceOrExpression_in_expression1696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_NULL_in_atomExpression1717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dateLiteral_in_atomExpression1729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constant_in_atomExpression1737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_castExpression_in_atomExpression1745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_caseExpression_in_atomExpression1753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whenExpression_in_atomExpression1761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_in_atomExpression1777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tableOrColumn_in_atomExpression1785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_atomExpression1793 = new BitSet(new long[]{0xFEF7FFFDFC042080L,0xFDEBBFDEAF7FFFB5L,0x3EEFD7FBDFFBDFFFL,0xBEF7FFFFDFFFDFFFL,0x0000F00C914BFF77L});
    public static final BitSet FOLLOW_expression_in_atomExpression1796 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_RPAREN_in_atomExpression1798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atomExpression_in_precedenceFieldExpression1821 = new BitSet(new long[]{0x0000000000020002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_LSQUARE_in_precedenceFieldExpression1825 = new BitSet(new long[]{0xFEF7FFFDFC042080L,0xFDEBBFDEAF7FFFB5L,0x3EEFD7FBDFFBDFFFL,0xBEF7FFFFDFFFDFFFL,0x0000F00C914BFF77L});
    public static final BitSet FOLLOW_expression_in_precedenceFieldExpression1828 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_RSQUARE_in_precedenceFieldExpression1830 = new BitSet(new long[]{0x0000000000020002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_DOT_in_precedenceFieldExpression1837 = new BitSet(new long[]{0xFEF4FFFDFC000000L,0xEDEBBFDEAF7FFFB5L,0x3EEFD7BB9FFBDFFFL,0xBEF7FFFFDFFFDFFFL,0x00000000014BFF77L});
    public static final BitSet FOLLOW_identifier_in_precedenceFieldExpression1840 = new BitSet(new long[]{0x0000000000020002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_KW_NULL_in_nullCondition1893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_NOT_in_nullCondition1907 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_KW_NULL_in_nullCondition1909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_precedenceUnaryOperator_in_precedenceUnaryPrefixExpression1937 = new BitSet(new long[]{0xFEF7FFFDFC042080L,0xFDEBBFDEAF7FFFB5L,0x3EEFD7BBDFFBDFFFL,0xBEF7FFFFDFFFDFFFL,0x0000F00C914BFF77L});
    public static final BitSet FOLLOW_precedenceFieldExpression_in_precedenceUnaryPrefixExpression1942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_precedenceUnaryPrefixExpression_in_precedenceUnarySuffixExpression1959 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_KW_IS_in_precedenceUnarySuffixExpression1964 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000014000000000L});
    public static final BitSet FOLLOW_nullCondition_in_precedenceUnarySuffixExpression1966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BITWISEXOR_in_precedenceBitwiseXorOperator2014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_precedenceUnarySuffixExpression_in_precedenceBitwiseXorExpression2035 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_precedenceBitwiseXorOperator_in_precedenceBitwiseXorExpression2038 = new BitSet(new long[]{0xFEF7FFFDFC042080L,0xFDEBBFDEAF7FFFB5L,0x3EEFD7BBDFFBDFFFL,0xBEF7FFFFDFFFDFFFL,0x0000F00C914BFF77L});
    public static final BitSet FOLLOW_precedenceUnarySuffixExpression_in_precedenceBitwiseXorExpression2041 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_precedenceBitwiseXorExpression_in_precedenceStarExpression2098 = new BitSet(new long[]{0x000000000000C002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000080100000000L});
    public static final BitSet FOLLOW_precedenceStarOperator_in_precedenceStarExpression2101 = new BitSet(new long[]{0xFEF7FFFDFC042080L,0xFDEBBFDEAF7FFFB5L,0x3EEFD7BBDFFBDFFFL,0xBEF7FFFFDFFFDFFFL,0x0000F00C914BFF77L});
    public static final BitSet FOLLOW_precedenceBitwiseXorExpression_in_precedenceStarExpression2104 = new BitSet(new long[]{0x000000000000C002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000080100000000L});
    public static final BitSet FOLLOW_precedenceStarExpression_in_precedencePlusExpression2153 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000880000000L});
    public static final BitSet FOLLOW_precedencePlusOperator_in_precedencePlusExpression2156 = new BitSet(new long[]{0xFEF7FFFDFC042080L,0xFDEBBFDEAF7FFFB5L,0x3EEFD7BBDFFBDFFFL,0xBEF7FFFFDFFFDFFFL,0x0000F00C914BFF77L});
    public static final BitSet FOLLOW_precedenceStarExpression_in_precedencePlusExpression2159 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000880000000L});
    public static final BitSet FOLLOW_AMPERSAND_in_precedenceAmpersandOperator2183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_precedencePlusExpression_in_precedenceAmpersandExpression2204 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_precedenceAmpersandOperator_in_precedenceAmpersandExpression2207 = new BitSet(new long[]{0xFEF7FFFDFC042080L,0xFDEBBFDEAF7FFFB5L,0x3EEFD7BBDFFBDFFFL,0xBEF7FFFFDFFFDFFFL,0x0000F00C914BFF77L});
    public static final BitSet FOLLOW_precedencePlusExpression_in_precedenceAmpersandExpression2210 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_BITWISEOR_in_precedenceBitwiseOrOperator2234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_precedenceAmpersandExpression_in_precedenceBitwiseOrExpression2255 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_precedenceBitwiseOrOperator_in_precedenceBitwiseOrExpression2258 = new BitSet(new long[]{0xFEF7FFFDFC042080L,0xFDEBBFDEAF7FFFB5L,0x3EEFD7BBDFFBDFFFL,0xBEF7FFFFDFFFDFFFL,0x0000F00C914BFF77L});
    public static final BitSet FOLLOW_precedenceAmpersandExpression_in_precedenceBitwiseOrExpression2261 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_precedenceEqualNegatableOperator_in_precedenceEqualOperator2315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQUAL_in_precedenceEqualOperator2319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQUAL_NS_in_precedenceEqualOperator2323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOTEQUAL_in_precedenceEqualOperator2327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LESSTHANOREQUALTO_in_precedenceEqualOperator2331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LESSTHAN_in_precedenceEqualOperator2335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GREATERTHANOREQUALTO_in_precedenceEqualOperator2339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GREATERTHAN_in_precedenceEqualOperator2343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_subQueryExpression2366 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000040000000L,0x0000000020002000L});
    public static final BitSet FOLLOW_selectStatement_in_subQueryExpression2369 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_RPAREN_in_subQueryExpression2372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_precedenceBitwiseOrExpression_in_precedenceEqualExpression2400 = new BitSet(new long[]{0x0000008001B00002L,0x8000000000000000L,0x0000004000080000L,0x0000000000204000L,0x000000020C000000L});
    public static final BitSet FOLLOW_KW_NOT_in_precedenceEqualExpression2422 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000080000L,0x0000000000204000L});
    public static final BitSet FOLLOW_precedenceEqualNegatableOperator_in_precedenceEqualExpression2424 = new BitSet(new long[]{0xFEF7FFFDFC042080L,0xFDEBBFDEAF7FFFB5L,0x3EEFD7BBDFFBDFFFL,0xBEF7FFFFDFFFDFFFL,0x0000F00C914BFF77L});
    public static final BitSet FOLLOW_precedenceBitwiseOrExpression_in_precedenceEqualExpression2428 = new BitSet(new long[]{0x0000008001B00002L,0x8000000000000000L,0x0000004000080000L,0x0000000000204000L,0x000000020C000000L});
    public static final BitSet FOLLOW_precedenceEqualOperator_in_precedenceEqualExpression2461 = new BitSet(new long[]{0xFEF7FFFDFC042080L,0xFDEBBFDEAF7FFFB5L,0x3EEFD7BBDFFBDFFFL,0xBEF7FFFFDFFFDFFFL,0x0000F00C914BFF77L});
    public static final BitSet FOLLOW_precedenceBitwiseOrExpression_in_precedenceEqualExpression2465 = new BitSet(new long[]{0x0000008001B00002L,0x8000000000000000L,0x0000004000080000L,0x0000000000204000L,0x000000020C000000L});
    public static final BitSet FOLLOW_KW_NOT_in_precedenceEqualExpression2506 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_KW_IN_in_precedenceEqualExpression2508 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_subQueryExpression_in_precedenceEqualExpression2510 = new BitSet(new long[]{0x0000008001B00002L,0x8000000000000000L,0x0000004000080000L,0x0000000000204000L,0x000000020C000000L});
    public static final BitSet FOLLOW_KW_NOT_in_precedenceEqualExpression2549 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_KW_IN_in_precedenceEqualExpression2551 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_expressions_in_precedenceEqualExpression2553 = new BitSet(new long[]{0x0000008001B00002L,0x8000000000000000L,0x0000004000080000L,0x0000000000204000L,0x000000020C000000L});
    public static final BitSet FOLLOW_KW_IN_in_precedenceEqualExpression2597 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_subQueryExpression_in_precedenceEqualExpression2599 = new BitSet(new long[]{0x0000008001B00002L,0x8000000000000000L,0x0000004000080000L,0x0000000000204000L,0x000000020C000000L});
    public static final BitSet FOLLOW_KW_IN_in_precedenceEqualExpression2634 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_expressions_in_precedenceEqualExpression2636 = new BitSet(new long[]{0x0000008001B00002L,0x8000000000000000L,0x0000004000080000L,0x0000000000204000L,0x000000020C000000L});
    public static final BitSet FOLLOW_KW_NOT_in_precedenceEqualExpression2667 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_KW_BETWEEN_in_precedenceEqualExpression2669 = new BitSet(new long[]{0xFEF7FFFDFC042080L,0xFDEBBFDEAF7FFFB5L,0x3EEFD7BBDFFBDFFFL,0xBEF7FFFFDFFFDFFFL,0x0000F00C914BFF77L});
    public static final BitSet FOLLOW_precedenceBitwiseOrExpression_in_precedenceEqualExpression2674 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_KW_AND_in_precedenceEqualExpression2677 = new BitSet(new long[]{0xFEF7FFFDFC042080L,0xFDEBBFDEAF7FFFB5L,0x3EEFD7BBDFFBDFFFL,0xBEF7FFFFDFFFDFFFL,0x0000F00C914BFF77L});
    public static final BitSet FOLLOW_precedenceBitwiseOrExpression_in_precedenceEqualExpression2682 = new BitSet(new long[]{0x0000008001B00002L,0x8000000000000000L,0x0000004000080000L,0x0000000000204000L,0x000000020C000000L});
    public static final BitSet FOLLOW_KW_BETWEEN_in_precedenceEqualExpression2722 = new BitSet(new long[]{0xFEF7FFFDFC042080L,0xFDEBBFDEAF7FFFB5L,0x3EEFD7BBDFFBDFFFL,0xBEF7FFFFDFFFDFFFL,0x0000F00C914BFF77L});
    public static final BitSet FOLLOW_precedenceBitwiseOrExpression_in_precedenceEqualExpression2727 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_KW_AND_in_precedenceEqualExpression2730 = new BitSet(new long[]{0xFEF7FFFDFC042080L,0xFDEBBFDEAF7FFFB5L,0x3EEFD7BBDFFBDFFFL,0xBEF7FFFFDFFFDFFFL,0x0000F00C914BFF77L});
    public static final BitSet FOLLOW_precedenceBitwiseOrExpression_in_precedenceEqualExpression2735 = new BitSet(new long[]{0x0000008001B00002L,0x8000000000000000L,0x0000004000080000L,0x0000000000204000L,0x000000020C000000L});
    public static final BitSet FOLLOW_KW_EXISTS_in_precedenceEqualExpression2790 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_subQueryExpression_in_precedenceEqualExpression2792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_expressions2828 = new BitSet(new long[]{0xFEF7FFFDFC042080L,0xFDEBBFDEAF7FFFB5L,0x3EEFD7FBDFFBDFFFL,0xBEF7FFFFDFFFDFFFL,0x0000F00C914BFF77L});
    public static final BitSet FOLLOW_expression_in_expressions2830 = new BitSet(new long[]{0x0000000000000400L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_COMMA_in_expressions2833 = new BitSet(new long[]{0xFEF7FFFDFC042080L,0xFDEBBFDEAF7FFFB5L,0x3EEFD7FBDFFBDFFFL,0xBEF7FFFFDFFFDFFFL,0x0000F00C914BFF77L});
    public static final BitSet FOLLOW_expression_in_expressions2835 = new BitSet(new long[]{0x0000000000000400L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_RPAREN_in_expressions2839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_NOT_in_precedenceNotOperator2865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_precedenceNotOperator_in_precedenceNotExpression2887 = new BitSet(new long[]{0xFEF7FFFDFC042080L,0xFDEBBFDEAF7FFFB5L,0x3EEFD7FBDFFBDFFFL,0xBEF7FFFFDFFFDFFFL,0x0000F00C914BFF77L});
    public static final BitSet FOLLOW_precedenceEqualExpression_in_precedenceNotExpression2892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_AND_in_precedenceAndOperator2914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_precedenceNotExpression_in_precedenceAndExpression2935 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_precedenceAndOperator_in_precedenceAndExpression2938 = new BitSet(new long[]{0xFEF7FFFDFC042080L,0xFDEBBFDEAF7FFFB5L,0x3EEFD7FBDFFBDFFFL,0xBEF7FFFFDFFFDFFFL,0x0000F00C914BFF77L});
    public static final BitSet FOLLOW_precedenceNotExpression_in_precedenceAndExpression2941 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_KW_OR_in_precedenceOrOperator2965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_precedenceAndExpression_in_precedenceOrExpression2986 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_precedenceOrOperator_in_precedenceOrExpression2989 = new BitSet(new long[]{0xFEF7FFFDFC042080L,0xFDEBBFDEAF7FFFB5L,0x3EEFD7FBDFFBDFFFL,0xBEF7FFFFDFFFDFFFL,0x0000F00C914BFF77L});
    public static final BitSet FOLLOW_precedenceAndExpression_in_precedenceOrExpression2992 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_KW_TRUE_in_booleanValue3016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_FALSE_in_booleanValue3021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tableName_in_tableOrPartition3041 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_partitionSpec_in_tableOrPartition3043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_PARTITION_in_partitionSpec3075 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_LPAREN_in_partitionSpec3082 = new BitSet(new long[]{0xFEF4FFFDFC000000L,0xEDEBBFDEAF7FFFB5L,0x3EEFD7BB9FFBDFFFL,0xBEF7FFFFDFFFDFFFL,0x00000000014BFF77L});
    public static final BitSet FOLLOW_partitionVal_in_partitionSpec3084 = new BitSet(new long[]{0x0000000000000400L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_COMMA_in_partitionSpec3087 = new BitSet(new long[]{0xFEF4FFFDFC000000L,0xEDEBBFDEAF7FFFB5L,0x3EEFD7BB9FFBDFFFL,0xBEF7FFFFDFFFDFFFL,0x00000000014BFF77L});
    public static final BitSet FOLLOW_partitionVal_in_partitionSpec3090 = new BitSet(new long[]{0x0000000000000400L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_RPAREN_in_partitionSpec3095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_partitionVal3126 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_EQUAL_in_partitionVal3129 = new BitSet(new long[]{0x0000000000042080L,0x0000008000000100L,0x0000000000000000L,0x0000000000000000L,0x0000B00400000001L});
    public static final BitSet FOLLOW_constant_in_partitionVal3131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_PARTITION_in_dropPartitionSpec3165 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_LPAREN_in_dropPartitionSpec3172 = new BitSet(new long[]{0xFEF4FFFDFC000000L,0xEDEBBFDEAF7FFFB5L,0x3EEFD7BB9FFBDFFFL,0xBEF7FFFFDFFFDFFFL,0x00000000014BFF77L});
    public static final BitSet FOLLOW_dropPartitionVal_in_dropPartitionSpec3174 = new BitSet(new long[]{0x0000000000000400L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_COMMA_in_dropPartitionSpec3177 = new BitSet(new long[]{0xFEF4FFFDFC000000L,0xEDEBBFDEAF7FFFB5L,0x3EEFD7BB9FFBDFFFL,0xBEF7FFFFDFFFDFFFL,0x00000000014BFF77L});
    public static final BitSet FOLLOW_dropPartitionVal_in_dropPartitionSpec3180 = new BitSet(new long[]{0x0000000000000400L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_RPAREN_in_dropPartitionSpec3185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_dropPartitionVal3216 = new BitSet(new long[]{0x0000000001900000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x000000020C000000L});
    public static final BitSet FOLLOW_dropPartitionOperator_in_dropPartitionVal3218 = new BitSet(new long[]{0x0000000000042080L,0x0000008000000100L,0x0000000000000000L,0x0000000000000000L,0x0000B00400000001L});
    public static final BitSet FOLLOW_constant_in_dropPartitionVal3220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sysFuncNames_in_descFuncNames3639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_descFuncNames3647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionIdentifier_in_descFuncNames3655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_identifier3676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nonReserved_in_identifier3684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_functionIdentifier3718 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_DOT_in_functionIdentifier3720 = new BitSet(new long[]{0xFEF4FFFDFC000000L,0xEDEBBFDEAF7FFFB5L,0x3EEFD7BB9FFBDFFFL,0xBEF7FFFFDFFFDFFFL,0x00000000014BFF77L});
    public static final BitSet FOLLOW_identifier_in_functionIdentifier3724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_functionIdentifier3745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMA_in_synpred1_IdentifiersParser616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMA_in_synpred2_IdentifiersParser717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMA_in_synpred3_IdentifiersParser817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMA_in_synpred4_IdentifiersParser927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionName_in_synpred5_IdentifiersParser1770 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_LPAREN_in_synpred5_IdentifiersParser1772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_NOT_in_synpred6_IdentifiersParser2494 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_KW_IN_in_synpred6_IdentifiersParser2496 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_LPAREN_in_synpred6_IdentifiersParser2498 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_KW_SELECT_in_synpred6_IdentifiersParser2500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_IN_in_synpred7_IdentifiersParser2587 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_LPAREN_in_synpred7_IdentifiersParser2589 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_KW_SELECT_in_synpred7_IdentifiersParser2591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_EXISTS_in_synpred8_IdentifiersParser2781 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_LPAREN_in_synpred8_IdentifiersParser2783 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_KW_SELECT_in_synpred8_IdentifiersParser2785 = new BitSet(new long[]{0x0000000000000002L});

}