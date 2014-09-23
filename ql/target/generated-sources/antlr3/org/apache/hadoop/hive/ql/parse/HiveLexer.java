// $ANTLR 3.4 org/apache/hadoop/hive/ql/parse/HiveLexer.g 2014-07-19 17:12:08

package org.apache.hadoop.hive.ql.parse;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hive.conf.HiveConf;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

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
public class HiveLexer extends Lexer {
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

      private Configuration hiveConf;
      
      public void setHiveConf(Configuration hiveConf) {
        this.hiveConf = hiveConf;
      }
      
      protected boolean allowQuotedId() {
        String supportedQIds = HiveConf.getVar(hiveConf, HiveConf.ConfVars.HIVE_QUOTEDID_SUPPORT);
        return !"none".equals(supportedQIds);
      }


    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public HiveLexer() {} 
    public HiveLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public HiveLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "org/apache/hadoop/hive/ql/parse/HiveLexer.g"; }

    // $ANTLR start "KW_TRUE"
    public final void mKW_TRUE() throws RecognitionException {
        try {
            int _type = KW_TRUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:41:9: ( 'TRUE' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:41:11: 'TRUE'
            {
            match("TRUE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_TRUE"

    // $ANTLR start "KW_FALSE"
    public final void mKW_FALSE() throws RecognitionException {
        try {
            int _type = KW_FALSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:42:10: ( 'FALSE' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:42:12: 'FALSE'
            {
            match("FALSE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_FALSE"

    // $ANTLR start "KW_ALL"
    public final void mKW_ALL() throws RecognitionException {
        try {
            int _type = KW_ALL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:43:8: ( 'ALL' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:43:10: 'ALL'
            {
            match("ALL"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_ALL"

    // $ANTLR start "KW_NONE"
    public final void mKW_NONE() throws RecognitionException {
        try {
            int _type = KW_NONE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:44:8: ( 'NONE' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:44:10: 'NONE'
            {
            match("NONE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_NONE"

    // $ANTLR start "KW_DEFAULT"
    public final void mKW_DEFAULT() throws RecognitionException {
        try {
            int _type = KW_DEFAULT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:45:12: ( 'DEFAULT' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:45:14: 'DEFAULT'
            {
            match("DEFAULT"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_DEFAULT"

    // $ANTLR start "KW_AND"
    public final void mKW_AND() throws RecognitionException {
        try {
            int _type = KW_AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:46:8: ( 'AND' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:46:10: 'AND'
            {
            match("AND"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_AND"

    // $ANTLR start "KW_OR"
    public final void mKW_OR() throws RecognitionException {
        try {
            int _type = KW_OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:47:7: ( 'OR' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:47:9: 'OR'
            {
            match("OR"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_OR"

    // $ANTLR start "KW_NOT"
    public final void mKW_NOT() throws RecognitionException {
        try {
            int _type = KW_NOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:48:8: ( 'NOT' | '!' )
            int alt1=2;
            switch ( input.LA(1) ) {
            case 'N':
                {
                alt1=1;
                }
                break;
            case '!':
                {
                alt1=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }

            switch (alt1) {
                case 1 :
                    // org/apache/hadoop/hive/ql/parse/HiveLexer.g:48:10: 'NOT'
                    {
                    match("NOT"); 



                    }
                    break;
                case 2 :
                    // org/apache/hadoop/hive/ql/parse/HiveLexer.g:48:18: '!'
                    {
                    match('!'); 

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_NOT"

    // $ANTLR start "KW_LIKE"
    public final void mKW_LIKE() throws RecognitionException {
        try {
            int _type = KW_LIKE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:49:9: ( 'LIKE' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:49:11: 'LIKE'
            {
            match("LIKE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_LIKE"

    // $ANTLR start "KW_IF"
    public final void mKW_IF() throws RecognitionException {
        try {
            int _type = KW_IF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:51:7: ( 'IF' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:51:9: 'IF'
            {
            match("IF"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_IF"

    // $ANTLR start "KW_EXISTS"
    public final void mKW_EXISTS() throws RecognitionException {
        try {
            int _type = KW_EXISTS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:52:11: ( 'EXISTS' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:52:13: 'EXISTS'
            {
            match("EXISTS"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_EXISTS"

    // $ANTLR start "KW_ASC"
    public final void mKW_ASC() throws RecognitionException {
        try {
            int _type = KW_ASC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:54:8: ( 'ASC' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:54:10: 'ASC'
            {
            match("ASC"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_ASC"

    // $ANTLR start "KW_DESC"
    public final void mKW_DESC() throws RecognitionException {
        try {
            int _type = KW_DESC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:55:9: ( 'DESC' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:55:11: 'DESC'
            {
            match("DESC"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_DESC"

    // $ANTLR start "KW_ORDER"
    public final void mKW_ORDER() throws RecognitionException {
        try {
            int _type = KW_ORDER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:56:10: ( 'ORDER' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:56:12: 'ORDER'
            {
            match("ORDER"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_ORDER"

    // $ANTLR start "KW_GROUP"
    public final void mKW_GROUP() throws RecognitionException {
        try {
            int _type = KW_GROUP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:57:10: ( 'GROUP' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:57:12: 'GROUP'
            {
            match("GROUP"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_GROUP"

    // $ANTLR start "KW_BY"
    public final void mKW_BY() throws RecognitionException {
        try {
            int _type = KW_BY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:58:7: ( 'BY' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:58:9: 'BY'
            {
            match("BY"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_BY"

    // $ANTLR start "KW_HAVING"
    public final void mKW_HAVING() throws RecognitionException {
        try {
            int _type = KW_HAVING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:59:11: ( 'HAVING' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:59:13: 'HAVING'
            {
            match("HAVING"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_HAVING"

    // $ANTLR start "KW_WHERE"
    public final void mKW_WHERE() throws RecognitionException {
        try {
            int _type = KW_WHERE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:60:10: ( 'WHERE' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:60:12: 'WHERE'
            {
            match("WHERE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_WHERE"

    // $ANTLR start "KW_FROM"
    public final void mKW_FROM() throws RecognitionException {
        try {
            int _type = KW_FROM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:61:9: ( 'FROM' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:61:11: 'FROM'
            {
            match("FROM"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_FROM"

    // $ANTLR start "KW_AS"
    public final void mKW_AS() throws RecognitionException {
        try {
            int _type = KW_AS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:62:7: ( 'AS' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:62:9: 'AS'
            {
            match("AS"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_AS"

    // $ANTLR start "KW_SELECT"
    public final void mKW_SELECT() throws RecognitionException {
        try {
            int _type = KW_SELECT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:63:11: ( 'SELECT' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:63:13: 'SELECT'
            {
            match("SELECT"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_SELECT"

    // $ANTLR start "KW_DISTINCT"
    public final void mKW_DISTINCT() throws RecognitionException {
        try {
            int _type = KW_DISTINCT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:64:13: ( 'DISTINCT' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:64:15: 'DISTINCT'
            {
            match("DISTINCT"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_DISTINCT"

    // $ANTLR start "KW_INSERT"
    public final void mKW_INSERT() throws RecognitionException {
        try {
            int _type = KW_INSERT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:65:11: ( 'INSERT' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:65:13: 'INSERT'
            {
            match("INSERT"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_INSERT"

    // $ANTLR start "KW_OVERWRITE"
    public final void mKW_OVERWRITE() throws RecognitionException {
        try {
            int _type = KW_OVERWRITE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:66:14: ( 'OVERWRITE' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:66:16: 'OVERWRITE'
            {
            match("OVERWRITE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_OVERWRITE"

    // $ANTLR start "KW_OUTER"
    public final void mKW_OUTER() throws RecognitionException {
        try {
            int _type = KW_OUTER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:67:10: ( 'OUTER' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:67:12: 'OUTER'
            {
            match("OUTER"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_OUTER"

    // $ANTLR start "KW_UNIQUEJOIN"
    public final void mKW_UNIQUEJOIN() throws RecognitionException {
        try {
            int _type = KW_UNIQUEJOIN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:68:15: ( 'UNIQUEJOIN' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:68:17: 'UNIQUEJOIN'
            {
            match("UNIQUEJOIN"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_UNIQUEJOIN"

    // $ANTLR start "KW_PRESERVE"
    public final void mKW_PRESERVE() throws RecognitionException {
        try {
            int _type = KW_PRESERVE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:69:13: ( 'PRESERVE' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:69:15: 'PRESERVE'
            {
            match("PRESERVE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_PRESERVE"

    // $ANTLR start "KW_JOIN"
    public final void mKW_JOIN() throws RecognitionException {
        try {
            int _type = KW_JOIN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:70:9: ( 'JOIN' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:70:11: 'JOIN'
            {
            match("JOIN"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_JOIN"

    // $ANTLR start "KW_LEFT"
    public final void mKW_LEFT() throws RecognitionException {
        try {
            int _type = KW_LEFT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:71:9: ( 'LEFT' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:71:11: 'LEFT'
            {
            match("LEFT"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_LEFT"

    // $ANTLR start "KW_RIGHT"
    public final void mKW_RIGHT() throws RecognitionException {
        try {
            int _type = KW_RIGHT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:72:10: ( 'RIGHT' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:72:12: 'RIGHT'
            {
            match("RIGHT"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_RIGHT"

    // $ANTLR start "KW_FULL"
    public final void mKW_FULL() throws RecognitionException {
        try {
            int _type = KW_FULL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:73:9: ( 'FULL' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:73:11: 'FULL'
            {
            match("FULL"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_FULL"

    // $ANTLR start "KW_ON"
    public final void mKW_ON() throws RecognitionException {
        try {
            int _type = KW_ON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:74:7: ( 'ON' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:74:9: 'ON'
            {
            match("ON"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_ON"

    // $ANTLR start "KW_PARTITION"
    public final void mKW_PARTITION() throws RecognitionException {
        try {
            int _type = KW_PARTITION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:75:14: ( 'PARTITION' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:75:16: 'PARTITION'
            {
            match("PARTITION"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_PARTITION"

    // $ANTLR start "KW_PARTITIONS"
    public final void mKW_PARTITIONS() throws RecognitionException {
        try {
            int _type = KW_PARTITIONS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:76:15: ( 'PARTITIONS' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:76:17: 'PARTITIONS'
            {
            match("PARTITIONS"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_PARTITIONS"

    // $ANTLR start "KW_TABLE"
    public final void mKW_TABLE() throws RecognitionException {
        try {
            int _type = KW_TABLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:77:9: ( 'TABLE' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:77:11: 'TABLE'
            {
            match("TABLE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_TABLE"

    // $ANTLR start "KW_TABLES"
    public final void mKW_TABLES() throws RecognitionException {
        try {
            int _type = KW_TABLES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:78:10: ( 'TABLES' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:78:12: 'TABLES'
            {
            match("TABLES"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_TABLES"

    // $ANTLR start "KW_COLUMNS"
    public final void mKW_COLUMNS() throws RecognitionException {
        try {
            int _type = KW_COLUMNS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:79:11: ( 'COLUMNS' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:79:13: 'COLUMNS'
            {
            match("COLUMNS"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_COLUMNS"

    // $ANTLR start "KW_INDEX"
    public final void mKW_INDEX() throws RecognitionException {
        try {
            int _type = KW_INDEX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:80:9: ( 'INDEX' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:80:11: 'INDEX'
            {
            match("INDEX"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_INDEX"

    // $ANTLR start "KW_INDEXES"
    public final void mKW_INDEXES() throws RecognitionException {
        try {
            int _type = KW_INDEXES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:81:11: ( 'INDEXES' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:81:13: 'INDEXES'
            {
            match("INDEXES"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_INDEXES"

    // $ANTLR start "KW_REBUILD"
    public final void mKW_REBUILD() throws RecognitionException {
        try {
            int _type = KW_REBUILD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:82:11: ( 'REBUILD' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:82:13: 'REBUILD'
            {
            match("REBUILD"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_REBUILD"

    // $ANTLR start "KW_FUNCTIONS"
    public final void mKW_FUNCTIONS() throws RecognitionException {
        try {
            int _type = KW_FUNCTIONS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:83:13: ( 'FUNCTIONS' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:83:15: 'FUNCTIONS'
            {
            match("FUNCTIONS"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_FUNCTIONS"

    // $ANTLR start "KW_SHOW"
    public final void mKW_SHOW() throws RecognitionException {
        try {
            int _type = KW_SHOW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:84:8: ( 'SHOW' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:84:10: 'SHOW'
            {
            match("SHOW"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_SHOW"

    // $ANTLR start "KW_MSCK"
    public final void mKW_MSCK() throws RecognitionException {
        try {
            int _type = KW_MSCK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:85:8: ( 'MSCK' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:85:10: 'MSCK'
            {
            match("MSCK"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_MSCK"

    // $ANTLR start "KW_REPAIR"
    public final void mKW_REPAIR() throws RecognitionException {
        try {
            int _type = KW_REPAIR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:86:10: ( 'REPAIR' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:86:12: 'REPAIR'
            {
            match("REPAIR"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_REPAIR"

    // $ANTLR start "KW_DIRECTORY"
    public final void mKW_DIRECTORY() throws RecognitionException {
        try {
            int _type = KW_DIRECTORY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:87:13: ( 'DIRECTORY' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:87:15: 'DIRECTORY'
            {
            match("DIRECTORY"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_DIRECTORY"

    // $ANTLR start "KW_LOCAL"
    public final void mKW_LOCAL() throws RecognitionException {
        try {
            int _type = KW_LOCAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:88:9: ( 'LOCAL' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:88:11: 'LOCAL'
            {
            match("LOCAL"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_LOCAL"

    // $ANTLR start "KW_TRANSFORM"
    public final void mKW_TRANSFORM() throws RecognitionException {
        try {
            int _type = KW_TRANSFORM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:89:14: ( 'TRANSFORM' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:89:16: 'TRANSFORM'
            {
            match("TRANSFORM"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_TRANSFORM"

    // $ANTLR start "KW_USING"
    public final void mKW_USING() throws RecognitionException {
        try {
            int _type = KW_USING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:90:9: ( 'USING' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:90:11: 'USING'
            {
            match("USING"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_USING"

    // $ANTLR start "KW_CLUSTER"
    public final void mKW_CLUSTER() throws RecognitionException {
        try {
            int _type = KW_CLUSTER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:91:11: ( 'CLUSTER' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:91:13: 'CLUSTER'
            {
            match("CLUSTER"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_CLUSTER"

    // $ANTLR start "KW_DISTRIBUTE"
    public final void mKW_DISTRIBUTE() throws RecognitionException {
        try {
            int _type = KW_DISTRIBUTE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:92:14: ( 'DISTRIBUTE' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:92:16: 'DISTRIBUTE'
            {
            match("DISTRIBUTE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_DISTRIBUTE"

    // $ANTLR start "KW_SORT"
    public final void mKW_SORT() throws RecognitionException {
        try {
            int _type = KW_SORT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:93:8: ( 'SORT' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:93:10: 'SORT'
            {
            match("SORT"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_SORT"

    // $ANTLR start "KW_UNION"
    public final void mKW_UNION() throws RecognitionException {
        try {
            int _type = KW_UNION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:94:9: ( 'UNION' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:94:11: 'UNION'
            {
            match("UNION"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_UNION"

    // $ANTLR start "KW_LOAD"
    public final void mKW_LOAD() throws RecognitionException {
        try {
            int _type = KW_LOAD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:95:8: ( 'LOAD' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:95:10: 'LOAD'
            {
            match("LOAD"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_LOAD"

    // $ANTLR start "KW_EXPORT"
    public final void mKW_EXPORT() throws RecognitionException {
        try {
            int _type = KW_EXPORT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:96:10: ( 'EXPORT' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:96:12: 'EXPORT'
            {
            match("EXPORT"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_EXPORT"

    // $ANTLR start "KW_IMPORT"
    public final void mKW_IMPORT() throws RecognitionException {
        try {
            int _type = KW_IMPORT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:97:10: ( 'IMPORT' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:97:12: 'IMPORT'
            {
            match("IMPORT"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_IMPORT"

    // $ANTLR start "KW_DATA"
    public final void mKW_DATA() throws RecognitionException {
        try {
            int _type = KW_DATA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:98:8: ( 'DATA' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:98:10: 'DATA'
            {
            match("DATA"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_DATA"

    // $ANTLR start "KW_INPATH"
    public final void mKW_INPATH() throws RecognitionException {
        try {
            int _type = KW_INPATH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:99:10: ( 'INPATH' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:99:12: 'INPATH'
            {
            match("INPATH"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_INPATH"

    // $ANTLR start "KW_IS"
    public final void mKW_IS() throws RecognitionException {
        try {
            int _type = KW_IS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:100:6: ( 'IS' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:100:8: 'IS'
            {
            match("IS"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_IS"

    // $ANTLR start "KW_NULL"
    public final void mKW_NULL() throws RecognitionException {
        try {
            int _type = KW_NULL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:101:8: ( 'NULL' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:101:10: 'NULL'
            {
            match("NULL"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_NULL"

    // $ANTLR start "KW_CREATE"
    public final void mKW_CREATE() throws RecognitionException {
        try {
            int _type = KW_CREATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:102:10: ( 'CREATE' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:102:12: 'CREATE'
            {
            match("CREATE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_CREATE"

    // $ANTLR start "KW_EXTERNAL"
    public final void mKW_EXTERNAL() throws RecognitionException {
        try {
            int _type = KW_EXTERNAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:103:12: ( 'EXTERNAL' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:103:14: 'EXTERNAL'
            {
            match("EXTERNAL"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_EXTERNAL"

    // $ANTLR start "KW_ALTER"
    public final void mKW_ALTER() throws RecognitionException {
        try {
            int _type = KW_ALTER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:104:9: ( 'ALTER' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:104:11: 'ALTER'
            {
            match("ALTER"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_ALTER"

    // $ANTLR start "KW_CHANGE"
    public final void mKW_CHANGE() throws RecognitionException {
        try {
            int _type = KW_CHANGE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:105:10: ( 'CHANGE' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:105:12: 'CHANGE'
            {
            match("CHANGE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_CHANGE"

    // $ANTLR start "KW_COLUMN"
    public final void mKW_COLUMN() throws RecognitionException {
        try {
            int _type = KW_COLUMN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:106:10: ( 'COLUMN' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:106:12: 'COLUMN'
            {
            match("COLUMN"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_COLUMN"

    // $ANTLR start "KW_FIRST"
    public final void mKW_FIRST() throws RecognitionException {
        try {
            int _type = KW_FIRST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:107:9: ( 'FIRST' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:107:11: 'FIRST'
            {
            match("FIRST"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_FIRST"

    // $ANTLR start "KW_AFTER"
    public final void mKW_AFTER() throws RecognitionException {
        try {
            int _type = KW_AFTER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:108:9: ( 'AFTER' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:108:11: 'AFTER'
            {
            match("AFTER"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_AFTER"

    // $ANTLR start "KW_DESCRIBE"
    public final void mKW_DESCRIBE() throws RecognitionException {
        try {
            int _type = KW_DESCRIBE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:109:12: ( 'DESCRIBE' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:109:14: 'DESCRIBE'
            {
            match("DESCRIBE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_DESCRIBE"

    // $ANTLR start "KW_DROP"
    public final void mKW_DROP() throws RecognitionException {
        try {
            int _type = KW_DROP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:110:8: ( 'DROP' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:110:10: 'DROP'
            {
            match("DROP"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_DROP"

    // $ANTLR start "KW_RENAME"
    public final void mKW_RENAME() throws RecognitionException {
        try {
            int _type = KW_RENAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:111:10: ( 'RENAME' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:111:12: 'RENAME'
            {
            match("RENAME"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_RENAME"

    // $ANTLR start "KW_IGNORE"
    public final void mKW_IGNORE() throws RecognitionException {
        try {
            int _type = KW_IGNORE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:112:10: ( 'IGNORE' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:112:12: 'IGNORE'
            {
            match("IGNORE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_IGNORE"

    // $ANTLR start "KW_PROTECTION"
    public final void mKW_PROTECTION() throws RecognitionException {
        try {
            int _type = KW_PROTECTION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:113:14: ( 'PROTECTION' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:113:16: 'PROTECTION'
            {
            match("PROTECTION"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_PROTECTION"

    // $ANTLR start "KW_TO"
    public final void mKW_TO() throws RecognitionException {
        try {
            int _type = KW_TO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:114:6: ( 'TO' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:114:8: 'TO'
            {
            match("TO"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_TO"

    // $ANTLR start "KW_COMMENT"
    public final void mKW_COMMENT() throws RecognitionException {
        try {
            int _type = KW_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:115:11: ( 'COMMENT' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:115:13: 'COMMENT'
            {
            match("COMMENT"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_COMMENT"

    // $ANTLR start "KW_BOOLEAN"
    public final void mKW_BOOLEAN() throws RecognitionException {
        try {
            int _type = KW_BOOLEAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:116:11: ( 'BOOLEAN' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:116:13: 'BOOLEAN'
            {
            match("BOOLEAN"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_BOOLEAN"

    // $ANTLR start "KW_TINYINT"
    public final void mKW_TINYINT() throws RecognitionException {
        try {
            int _type = KW_TINYINT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:117:11: ( 'TINYINT' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:117:13: 'TINYINT'
            {
            match("TINYINT"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_TINYINT"

    // $ANTLR start "KW_SMALLINT"
    public final void mKW_SMALLINT() throws RecognitionException {
        try {
            int _type = KW_SMALLINT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:118:12: ( 'SMALLINT' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:118:14: 'SMALLINT'
            {
            match("SMALLINT"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_SMALLINT"

    // $ANTLR start "KW_INT"
    public final void mKW_INT() throws RecognitionException {
        try {
            int _type = KW_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:119:7: ( 'INT' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:119:9: 'INT'
            {
            match("INT"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_INT"

    // $ANTLR start "KW_BIGINT"
    public final void mKW_BIGINT() throws RecognitionException {
        try {
            int _type = KW_BIGINT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:120:10: ( 'BIGINT' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:120:12: 'BIGINT'
            {
            match("BIGINT"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_BIGINT"

    // $ANTLR start "KW_FLOAT"
    public final void mKW_FLOAT() throws RecognitionException {
        try {
            int _type = KW_FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:121:9: ( 'FLOAT' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:121:11: 'FLOAT'
            {
            match("FLOAT"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_FLOAT"

    // $ANTLR start "KW_DOUBLE"
    public final void mKW_DOUBLE() throws RecognitionException {
        try {
            int _type = KW_DOUBLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:122:10: ( 'DOUBLE' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:122:12: 'DOUBLE'
            {
            match("DOUBLE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_DOUBLE"

    // $ANTLR start "KW_DATE"
    public final void mKW_DATE() throws RecognitionException {
        try {
            int _type = KW_DATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:123:8: ( 'DATE' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:123:10: 'DATE'
            {
            match("DATE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_DATE"

    // $ANTLR start "KW_DATETIME"
    public final void mKW_DATETIME() throws RecognitionException {
        try {
            int _type = KW_DATETIME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:124:12: ( 'DATETIME' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:124:14: 'DATETIME'
            {
            match("DATETIME"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_DATETIME"

    // $ANTLR start "KW_TIMESTAMP"
    public final void mKW_TIMESTAMP() throws RecognitionException {
        try {
            int _type = KW_TIMESTAMP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:125:13: ( 'TIMESTAMP' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:125:15: 'TIMESTAMP'
            {
            match("TIMESTAMP"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_TIMESTAMP"

    // $ANTLR start "KW_DECIMAL"
    public final void mKW_DECIMAL() throws RecognitionException {
        try {
            int _type = KW_DECIMAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:126:11: ( 'DECIMAL' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:126:13: 'DECIMAL'
            {
            match("DECIMAL"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_DECIMAL"

    // $ANTLR start "KW_STRING"
    public final void mKW_STRING() throws RecognitionException {
        try {
            int _type = KW_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:127:10: ( 'STRING' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:127:12: 'STRING'
            {
            match("STRING"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_STRING"

    // $ANTLR start "KW_CHAR"
    public final void mKW_CHAR() throws RecognitionException {
        try {
            int _type = KW_CHAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:128:8: ( 'CHAR' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:128:10: 'CHAR'
            {
            match("CHAR"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_CHAR"

    // $ANTLR start "KW_VARCHAR"
    public final void mKW_VARCHAR() throws RecognitionException {
        try {
            int _type = KW_VARCHAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:129:11: ( 'VARCHAR' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:129:13: 'VARCHAR'
            {
            match("VARCHAR"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_VARCHAR"

    // $ANTLR start "KW_ARRAY"
    public final void mKW_ARRAY() throws RecognitionException {
        try {
            int _type = KW_ARRAY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:130:9: ( 'ARRAY' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:130:11: 'ARRAY'
            {
            match("ARRAY"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_ARRAY"

    // $ANTLR start "KW_STRUCT"
    public final void mKW_STRUCT() throws RecognitionException {
        try {
            int _type = KW_STRUCT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:131:10: ( 'STRUCT' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:131:12: 'STRUCT'
            {
            match("STRUCT"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_STRUCT"

    // $ANTLR start "KW_MAP"
    public final void mKW_MAP() throws RecognitionException {
        try {
            int _type = KW_MAP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:132:7: ( 'MAP' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:132:9: 'MAP'
            {
            match("MAP"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_MAP"

    // $ANTLR start "KW_UNIONTYPE"
    public final void mKW_UNIONTYPE() throws RecognitionException {
        try {
            int _type = KW_UNIONTYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:133:13: ( 'UNIONTYPE' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:133:15: 'UNIONTYPE'
            {
            match("UNIONTYPE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_UNIONTYPE"

    // $ANTLR start "KW_REDUCE"
    public final void mKW_REDUCE() throws RecognitionException {
        try {
            int _type = KW_REDUCE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:134:10: ( 'REDUCE' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:134:12: 'REDUCE'
            {
            match("REDUCE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_REDUCE"

    // $ANTLR start "KW_PARTITIONED"
    public final void mKW_PARTITIONED() throws RecognitionException {
        try {
            int _type = KW_PARTITIONED;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:135:15: ( 'PARTITIONED' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:135:17: 'PARTITIONED'
            {
            match("PARTITIONED"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_PARTITIONED"

    // $ANTLR start "KW_CLUSTERED"
    public final void mKW_CLUSTERED() throws RecognitionException {
        try {
            int _type = KW_CLUSTERED;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:136:13: ( 'CLUSTERED' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:136:15: 'CLUSTERED'
            {
            match("CLUSTERED"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_CLUSTERED"

    // $ANTLR start "KW_SORTED"
    public final void mKW_SORTED() throws RecognitionException {
        try {
            int _type = KW_SORTED;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:137:10: ( 'SORTED' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:137:12: 'SORTED'
            {
            match("SORTED"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_SORTED"

    // $ANTLR start "KW_INTO"
    public final void mKW_INTO() throws RecognitionException {
        try {
            int _type = KW_INTO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:138:8: ( 'INTO' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:138:10: 'INTO'
            {
            match("INTO"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_INTO"

    // $ANTLR start "KW_BUCKETS"
    public final void mKW_BUCKETS() throws RecognitionException {
        try {
            int _type = KW_BUCKETS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:139:11: ( 'BUCKETS' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:139:13: 'BUCKETS'
            {
            match("BUCKETS"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_BUCKETS"

    // $ANTLR start "KW_ROW"
    public final void mKW_ROW() throws RecognitionException {
        try {
            int _type = KW_ROW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:140:7: ( 'ROW' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:140:9: 'ROW'
            {
            match("ROW"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_ROW"

    // $ANTLR start "KW_ROWS"
    public final void mKW_ROWS() throws RecognitionException {
        try {
            int _type = KW_ROWS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:141:8: ( 'ROWS' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:141:10: 'ROWS'
            {
            match("ROWS"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_ROWS"

    // $ANTLR start "KW_FORMAT"
    public final void mKW_FORMAT() throws RecognitionException {
        try {
            int _type = KW_FORMAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:142:10: ( 'FORMAT' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:142:12: 'FORMAT'
            {
            match("FORMAT"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_FORMAT"

    // $ANTLR start "KW_DELIMITED"
    public final void mKW_DELIMITED() throws RecognitionException {
        try {
            int _type = KW_DELIMITED;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:143:13: ( 'DELIMITED' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:143:15: 'DELIMITED'
            {
            match("DELIMITED"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_DELIMITED"

    // $ANTLR start "KW_FIELDS"
    public final void mKW_FIELDS() throws RecognitionException {
        try {
            int _type = KW_FIELDS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:144:10: ( 'FIELDS' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:144:12: 'FIELDS'
            {
            match("FIELDS"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_FIELDS"

    // $ANTLR start "KW_TERMINATED"
    public final void mKW_TERMINATED() throws RecognitionException {
        try {
            int _type = KW_TERMINATED;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:145:14: ( 'TERMINATED' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:145:16: 'TERMINATED'
            {
            match("TERMINATED"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_TERMINATED"

    // $ANTLR start "KW_ESCAPED"
    public final void mKW_ESCAPED() throws RecognitionException {
        try {
            int _type = KW_ESCAPED;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:146:11: ( 'ESCAPED' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:146:13: 'ESCAPED'
            {
            match("ESCAPED"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_ESCAPED"

    // $ANTLR start "KW_COLLECTION"
    public final void mKW_COLLECTION() throws RecognitionException {
        try {
            int _type = KW_COLLECTION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:147:14: ( 'COLLECTION' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:147:16: 'COLLECTION'
            {
            match("COLLECTION"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_COLLECTION"

    // $ANTLR start "KW_ITEMS"
    public final void mKW_ITEMS() throws RecognitionException {
        try {
            int _type = KW_ITEMS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:148:9: ( 'ITEMS' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:148:11: 'ITEMS'
            {
            match("ITEMS"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_ITEMS"

    // $ANTLR start "KW_KEYS"
    public final void mKW_KEYS() throws RecognitionException {
        try {
            int _type = KW_KEYS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:149:8: ( 'KEYS' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:149:10: 'KEYS'
            {
            match("KEYS"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_KEYS"

    // $ANTLR start "KW_KEY_TYPE"
    public final void mKW_KEY_TYPE() throws RecognitionException {
        try {
            int _type = KW_KEY_TYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:150:12: ( '$KEY$' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:150:14: '$KEY$'
            {
            match("$KEY$"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_KEY_TYPE"

    // $ANTLR start "KW_LINES"
    public final void mKW_LINES() throws RecognitionException {
        try {
            int _type = KW_LINES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:151:9: ( 'LINES' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:151:11: 'LINES'
            {
            match("LINES"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_LINES"

    // $ANTLR start "KW_STORED"
    public final void mKW_STORED() throws RecognitionException {
        try {
            int _type = KW_STORED;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:152:10: ( 'STORED' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:152:12: 'STORED'
            {
            match("STORED"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_STORED"

    // $ANTLR start "KW_FILEFORMAT"
    public final void mKW_FILEFORMAT() throws RecognitionException {
        try {
            int _type = KW_FILEFORMAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:153:14: ( 'FILEFORMAT' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:153:16: 'FILEFORMAT'
            {
            match("FILEFORMAT"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_FILEFORMAT"

    // $ANTLR start "KW_SEQUENCEFILE"
    public final void mKW_SEQUENCEFILE() throws RecognitionException {
        try {
            int _type = KW_SEQUENCEFILE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:154:16: ( 'SEQUENCEFILE' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:154:18: 'SEQUENCEFILE'
            {
            match("SEQUENCEFILE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_SEQUENCEFILE"

    // $ANTLR start "KW_TEXTFILE"
    public final void mKW_TEXTFILE() throws RecognitionException {
        try {
            int _type = KW_TEXTFILE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:155:12: ( 'TEXTFILE' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:155:14: 'TEXTFILE'
            {
            match("TEXTFILE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_TEXTFILE"

    // $ANTLR start "KW_RCFILE"
    public final void mKW_RCFILE() throws RecognitionException {
        try {
            int _type = KW_RCFILE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:156:10: ( 'RCFILE' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:156:12: 'RCFILE'
            {
            match("RCFILE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_RCFILE"

    // $ANTLR start "KW_ORCFILE"
    public final void mKW_ORCFILE() throws RecognitionException {
        try {
            int _type = KW_ORCFILE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:157:11: ( 'ORC' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:157:13: 'ORC'
            {
            match("ORC"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_ORCFILE"

    // $ANTLR start "KW_PARQUETFILE"
    public final void mKW_PARQUETFILE() throws RecognitionException {
        try {
            int _type = KW_PARQUETFILE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:158:15: ( 'PARQUET' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:158:17: 'PARQUET'
            {
            match("PARQUET"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_PARQUETFILE"

    // $ANTLR start "KW_INPUTFORMAT"
    public final void mKW_INPUTFORMAT() throws RecognitionException {
        try {
            int _type = KW_INPUTFORMAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:159:15: ( 'INPUTFORMAT' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:159:17: 'INPUTFORMAT'
            {
            match("INPUTFORMAT"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_INPUTFORMAT"

    // $ANTLR start "KW_OUTPUTFORMAT"
    public final void mKW_OUTPUTFORMAT() throws RecognitionException {
        try {
            int _type = KW_OUTPUTFORMAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:160:16: ( 'OUTPUTFORMAT' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:160:18: 'OUTPUTFORMAT'
            {
            match("OUTPUTFORMAT"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_OUTPUTFORMAT"

    // $ANTLR start "KW_INPUTDRIVER"
    public final void mKW_INPUTDRIVER() throws RecognitionException {
        try {
            int _type = KW_INPUTDRIVER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:161:15: ( 'INPUTDRIVER' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:161:17: 'INPUTDRIVER'
            {
            match("INPUTDRIVER"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_INPUTDRIVER"

    // $ANTLR start "KW_OUTPUTDRIVER"
    public final void mKW_OUTPUTDRIVER() throws RecognitionException {
        try {
            int _type = KW_OUTPUTDRIVER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:162:16: ( 'OUTPUTDRIVER' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:162:18: 'OUTPUTDRIVER'
            {
            match("OUTPUTDRIVER"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_OUTPUTDRIVER"

    // $ANTLR start "KW_OFFLINE"
    public final void mKW_OFFLINE() throws RecognitionException {
        try {
            int _type = KW_OFFLINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:163:11: ( 'OFFLINE' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:163:13: 'OFFLINE'
            {
            match("OFFLINE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_OFFLINE"

    // $ANTLR start "KW_ENABLE"
    public final void mKW_ENABLE() throws RecognitionException {
        try {
            int _type = KW_ENABLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:164:10: ( 'ENABLE' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:164:12: 'ENABLE'
            {
            match("ENABLE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_ENABLE"

    // $ANTLR start "KW_DISABLE"
    public final void mKW_DISABLE() throws RecognitionException {
        try {
            int _type = KW_DISABLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:165:11: ( 'DISABLE' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:165:13: 'DISABLE'
            {
            match("DISABLE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_DISABLE"

    // $ANTLR start "KW_READONLY"
    public final void mKW_READONLY() throws RecognitionException {
        try {
            int _type = KW_READONLY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:166:12: ( 'READONLY' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:166:14: 'READONLY'
            {
            match("READONLY"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_READONLY"

    // $ANTLR start "KW_NO_DROP"
    public final void mKW_NO_DROP() throws RecognitionException {
        try {
            int _type = KW_NO_DROP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:167:11: ( 'NO_DROP' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:167:13: 'NO_DROP'
            {
            match("NO_DROP"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_NO_DROP"

    // $ANTLR start "KW_LOCATION"
    public final void mKW_LOCATION() throws RecognitionException {
        try {
            int _type = KW_LOCATION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:168:12: ( 'LOCATION' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:168:14: 'LOCATION'
            {
            match("LOCATION"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_LOCATION"

    // $ANTLR start "KW_TABLESAMPLE"
    public final void mKW_TABLESAMPLE() throws RecognitionException {
        try {
            int _type = KW_TABLESAMPLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:169:15: ( 'TABLESAMPLE' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:169:17: 'TABLESAMPLE'
            {
            match("TABLESAMPLE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_TABLESAMPLE"

    // $ANTLR start "KW_BUCKET"
    public final void mKW_BUCKET() throws RecognitionException {
        try {
            int _type = KW_BUCKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:170:10: ( 'BUCKET' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:170:12: 'BUCKET'
            {
            match("BUCKET"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_BUCKET"

    // $ANTLR start "KW_OUT"
    public final void mKW_OUT() throws RecognitionException {
        try {
            int _type = KW_OUT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:171:7: ( 'OUT' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:171:9: 'OUT'
            {
            match("OUT"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_OUT"

    // $ANTLR start "KW_OF"
    public final void mKW_OF() throws RecognitionException {
        try {
            int _type = KW_OF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:172:6: ( 'OF' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:172:8: 'OF'
            {
            match("OF"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_OF"

    // $ANTLR start "KW_PERCENT"
    public final void mKW_PERCENT() throws RecognitionException {
        try {
            int _type = KW_PERCENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:173:11: ( 'PERCENT' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:173:13: 'PERCENT'
            {
            match("PERCENT"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_PERCENT"

    // $ANTLR start "KW_CAST"
    public final void mKW_CAST() throws RecognitionException {
        try {
            int _type = KW_CAST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:174:8: ( 'CAST' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:174:10: 'CAST'
            {
            match("CAST"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_CAST"

    // $ANTLR start "KW_ADD"
    public final void mKW_ADD() throws RecognitionException {
        try {
            int _type = KW_ADD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:175:7: ( 'ADD' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:175:9: 'ADD'
            {
            match("ADD"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_ADD"

    // $ANTLR start "KW_REPLACE"
    public final void mKW_REPLACE() throws RecognitionException {
        try {
            int _type = KW_REPLACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:176:11: ( 'REPLACE' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:176:13: 'REPLACE'
            {
            match("REPLACE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_REPLACE"

    // $ANTLR start "KW_RLIKE"
    public final void mKW_RLIKE() throws RecognitionException {
        try {
            int _type = KW_RLIKE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:177:9: ( 'RLIKE' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:177:11: 'RLIKE'
            {
            match("RLIKE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_RLIKE"

    // $ANTLR start "KW_REGEXP"
    public final void mKW_REGEXP() throws RecognitionException {
        try {
            int _type = KW_REGEXP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:178:10: ( 'REGEXP' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:178:12: 'REGEXP'
            {
            match("REGEXP"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_REGEXP"

    // $ANTLR start "KW_TEMPORARY"
    public final void mKW_TEMPORARY() throws RecognitionException {
        try {
            int _type = KW_TEMPORARY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:179:13: ( 'TEMPORARY' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:179:15: 'TEMPORARY'
            {
            match("TEMPORARY"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_TEMPORARY"

    // $ANTLR start "KW_FUNCTION"
    public final void mKW_FUNCTION() throws RecognitionException {
        try {
            int _type = KW_FUNCTION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:180:12: ( 'FUNCTION' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:180:14: 'FUNCTION'
            {
            match("FUNCTION"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_FUNCTION"

    // $ANTLR start "KW_MACRO"
    public final void mKW_MACRO() throws RecognitionException {
        try {
            int _type = KW_MACRO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:181:9: ( 'MACRO' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:181:11: 'MACRO'
            {
            match("MACRO"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_MACRO"

    // $ANTLR start "KW_FILE"
    public final void mKW_FILE() throws RecognitionException {
        try {
            int _type = KW_FILE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:182:8: ( 'FILE' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:182:10: 'FILE'
            {
            match("FILE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_FILE"

    // $ANTLR start "KW_JAR"
    public final void mKW_JAR() throws RecognitionException {
        try {
            int _type = KW_JAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:183:7: ( 'JAR' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:183:9: 'JAR'
            {
            match("JAR"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_JAR"

    // $ANTLR start "KW_EXPLAIN"
    public final void mKW_EXPLAIN() throws RecognitionException {
        try {
            int _type = KW_EXPLAIN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:184:11: ( 'EXPLAIN' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:184:13: 'EXPLAIN'
            {
            match("EXPLAIN"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_EXPLAIN"

    // $ANTLR start "KW_EXTENDED"
    public final void mKW_EXTENDED() throws RecognitionException {
        try {
            int _type = KW_EXTENDED;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:185:12: ( 'EXTENDED' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:185:14: 'EXTENDED'
            {
            match("EXTENDED"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_EXTENDED"

    // $ANTLR start "KW_FORMATTED"
    public final void mKW_FORMATTED() throws RecognitionException {
        try {
            int _type = KW_FORMATTED;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:186:13: ( 'FORMATTED' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:186:15: 'FORMATTED'
            {
            match("FORMATTED"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_FORMATTED"

    // $ANTLR start "KW_PRETTY"
    public final void mKW_PRETTY() throws RecognitionException {
        try {
            int _type = KW_PRETTY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:187:10: ( 'PRETTY' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:187:12: 'PRETTY'
            {
            match("PRETTY"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_PRETTY"

    // $ANTLR start "KW_DEPENDENCY"
    public final void mKW_DEPENDENCY() throws RecognitionException {
        try {
            int _type = KW_DEPENDENCY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:188:14: ( 'DEPENDENCY' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:188:16: 'DEPENDENCY'
            {
            match("DEPENDENCY"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_DEPENDENCY"

    // $ANTLR start "KW_LOGICAL"
    public final void mKW_LOGICAL() throws RecognitionException {
        try {
            int _type = KW_LOGICAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:189:11: ( 'LOGICAL' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:189:13: 'LOGICAL'
            {
            match("LOGICAL"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_LOGICAL"

    // $ANTLR start "KW_SERDE"
    public final void mKW_SERDE() throws RecognitionException {
        try {
            int _type = KW_SERDE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:190:9: ( 'SERDE' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:190:11: 'SERDE'
            {
            match("SERDE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_SERDE"

    // $ANTLR start "KW_WITH"
    public final void mKW_WITH() throws RecognitionException {
        try {
            int _type = KW_WITH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:191:8: ( 'WITH' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:191:10: 'WITH'
            {
            match("WITH"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_WITH"

    // $ANTLR start "KW_DEFERRED"
    public final void mKW_DEFERRED() throws RecognitionException {
        try {
            int _type = KW_DEFERRED;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:192:12: ( 'DEFERRED' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:192:14: 'DEFERRED'
            {
            match("DEFERRED"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_DEFERRED"

    // $ANTLR start "KW_SERDEPROPERTIES"
    public final void mKW_SERDEPROPERTIES() throws RecognitionException {
        try {
            int _type = KW_SERDEPROPERTIES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:193:19: ( 'SERDEPROPERTIES' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:193:21: 'SERDEPROPERTIES'
            {
            match("SERDEPROPERTIES"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_SERDEPROPERTIES"

    // $ANTLR start "KW_DBPROPERTIES"
    public final void mKW_DBPROPERTIES() throws RecognitionException {
        try {
            int _type = KW_DBPROPERTIES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:194:16: ( 'DBPROPERTIES' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:194:18: 'DBPROPERTIES'
            {
            match("DBPROPERTIES"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_DBPROPERTIES"

    // $ANTLR start "KW_LIMIT"
    public final void mKW_LIMIT() throws RecognitionException {
        try {
            int _type = KW_LIMIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:195:9: ( 'LIMIT' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:195:11: 'LIMIT'
            {
            match("LIMIT"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_LIMIT"

    // $ANTLR start "KW_SET"
    public final void mKW_SET() throws RecognitionException {
        try {
            int _type = KW_SET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:196:7: ( 'SET' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:196:9: 'SET'
            {
            match("SET"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_SET"

    // $ANTLR start "KW_UNSET"
    public final void mKW_UNSET() throws RecognitionException {
        try {
            int _type = KW_UNSET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:197:9: ( 'UNSET' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:197:11: 'UNSET'
            {
            match("UNSET"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_UNSET"

    // $ANTLR start "KW_TBLPROPERTIES"
    public final void mKW_TBLPROPERTIES() throws RecognitionException {
        try {
            int _type = KW_TBLPROPERTIES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:198:17: ( 'TBLPROPERTIES' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:198:19: 'TBLPROPERTIES'
            {
            match("TBLPROPERTIES"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_TBLPROPERTIES"

    // $ANTLR start "KW_IDXPROPERTIES"
    public final void mKW_IDXPROPERTIES() throws RecognitionException {
        try {
            int _type = KW_IDXPROPERTIES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:199:17: ( 'IDXPROPERTIES' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:199:19: 'IDXPROPERTIES'
            {
            match("IDXPROPERTIES"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_IDXPROPERTIES"

    // $ANTLR start "KW_VALUE_TYPE"
    public final void mKW_VALUE_TYPE() throws RecognitionException {
        try {
            int _type = KW_VALUE_TYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:200:14: ( '$VALUE$' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:200:16: '$VALUE$'
            {
            match("$VALUE$"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_VALUE_TYPE"

    // $ANTLR start "KW_ELEM_TYPE"
    public final void mKW_ELEM_TYPE() throws RecognitionException {
        try {
            int _type = KW_ELEM_TYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:201:13: ( '$ELEM$' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:201:15: '$ELEM$'
            {
            match("$ELEM$"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_ELEM_TYPE"

    // $ANTLR start "KW_DEFINED"
    public final void mKW_DEFINED() throws RecognitionException {
        try {
            int _type = KW_DEFINED;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:202:11: ( 'DEFINED' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:202:13: 'DEFINED'
            {
            match("DEFINED"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_DEFINED"

    // $ANTLR start "KW_CASE"
    public final void mKW_CASE() throws RecognitionException {
        try {
            int _type = KW_CASE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:203:8: ( 'CASE' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:203:10: 'CASE'
            {
            match("CASE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_CASE"

    // $ANTLR start "KW_WHEN"
    public final void mKW_WHEN() throws RecognitionException {
        try {
            int _type = KW_WHEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:204:8: ( 'WHEN' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:204:10: 'WHEN'
            {
            match("WHEN"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_WHEN"

    // $ANTLR start "KW_THEN"
    public final void mKW_THEN() throws RecognitionException {
        try {
            int _type = KW_THEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:205:8: ( 'THEN' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:205:10: 'THEN'
            {
            match("THEN"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_THEN"

    // $ANTLR start "KW_ELSE"
    public final void mKW_ELSE() throws RecognitionException {
        try {
            int _type = KW_ELSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:206:8: ( 'ELSE' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:206:10: 'ELSE'
            {
            match("ELSE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_ELSE"

    // $ANTLR start "KW_END"
    public final void mKW_END() throws RecognitionException {
        try {
            int _type = KW_END;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:207:7: ( 'END' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:207:9: 'END'
            {
            match("END"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_END"

    // $ANTLR start "KW_MAPJOIN"
    public final void mKW_MAPJOIN() throws RecognitionException {
        try {
            int _type = KW_MAPJOIN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:208:11: ( 'MAPJOIN' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:208:13: 'MAPJOIN'
            {
            match("MAPJOIN"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_MAPJOIN"

    // $ANTLR start "KW_STREAMTABLE"
    public final void mKW_STREAMTABLE() throws RecognitionException {
        try {
            int _type = KW_STREAMTABLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:209:15: ( 'STREAMTABLE' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:209:17: 'STREAMTABLE'
            {
            match("STREAMTABLE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_STREAMTABLE"

    // $ANTLR start "KW_HOLD_DDLTIME"
    public final void mKW_HOLD_DDLTIME() throws RecognitionException {
        try {
            int _type = KW_HOLD_DDLTIME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:210:16: ( 'HOLD_DDLTIME' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:210:18: 'HOLD_DDLTIME'
            {
            match("HOLD_DDLTIME"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_HOLD_DDLTIME"

    // $ANTLR start "KW_CLUSTERSTATUS"
    public final void mKW_CLUSTERSTATUS() throws RecognitionException {
        try {
            int _type = KW_CLUSTERSTATUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:211:17: ( 'CLUSTERSTATUS' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:211:19: 'CLUSTERSTATUS'
            {
            match("CLUSTERSTATUS"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_CLUSTERSTATUS"

    // $ANTLR start "KW_UTC"
    public final void mKW_UTC() throws RecognitionException {
        try {
            int _type = KW_UTC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:212:7: ( 'UTC' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:212:9: 'UTC'
            {
            match("UTC"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_UTC"

    // $ANTLR start "KW_UTCTIMESTAMP"
    public final void mKW_UTCTIMESTAMP() throws RecognitionException {
        try {
            int _type = KW_UTCTIMESTAMP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:213:16: ( 'UTC_TMESTAMP' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:213:18: 'UTC_TMESTAMP'
            {
            match("UTC_TMESTAMP"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_UTCTIMESTAMP"

    // $ANTLR start "KW_LONG"
    public final void mKW_LONG() throws RecognitionException {
        try {
            int _type = KW_LONG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:214:8: ( 'LONG' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:214:10: 'LONG'
            {
            match("LONG"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_LONG"

    // $ANTLR start "KW_DELETE"
    public final void mKW_DELETE() throws RecognitionException {
        try {
            int _type = KW_DELETE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:215:10: ( 'DELETE' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:215:12: 'DELETE'
            {
            match("DELETE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_DELETE"

    // $ANTLR start "KW_PLUS"
    public final void mKW_PLUS() throws RecognitionException {
        try {
            int _type = KW_PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:216:8: ( 'PLUS' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:216:10: 'PLUS'
            {
            match("PLUS"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_PLUS"

    // $ANTLR start "KW_MINUS"
    public final void mKW_MINUS() throws RecognitionException {
        try {
            int _type = KW_MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:217:9: ( 'MINUS' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:217:11: 'MINUS'
            {
            match("MINUS"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_MINUS"

    // $ANTLR start "KW_FETCH"
    public final void mKW_FETCH() throws RecognitionException {
        try {
            int _type = KW_FETCH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:218:9: ( 'FETCH' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:218:11: 'FETCH'
            {
            match("FETCH"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_FETCH"

    // $ANTLR start "KW_INTERSECT"
    public final void mKW_INTERSECT() throws RecognitionException {
        try {
            int _type = KW_INTERSECT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:219:13: ( 'INTERSECT' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:219:15: 'INTERSECT'
            {
            match("INTERSECT"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_INTERSECT"

    // $ANTLR start "KW_VIEW"
    public final void mKW_VIEW() throws RecognitionException {
        try {
            int _type = KW_VIEW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:220:8: ( 'VIEW' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:220:10: 'VIEW'
            {
            match("VIEW"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_VIEW"

    // $ANTLR start "KW_IN"
    public final void mKW_IN() throws RecognitionException {
        try {
            int _type = KW_IN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:221:6: ( 'IN' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:221:8: 'IN'
            {
            match("IN"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_IN"

    // $ANTLR start "KW_DATABASE"
    public final void mKW_DATABASE() throws RecognitionException {
        try {
            int _type = KW_DATABASE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:222:12: ( 'DATABASE' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:222:14: 'DATABASE'
            {
            match("DATABASE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_DATABASE"

    // $ANTLR start "KW_DATABASES"
    public final void mKW_DATABASES() throws RecognitionException {
        try {
            int _type = KW_DATABASES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:223:13: ( 'DATABASES' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:223:15: 'DATABASES'
            {
            match("DATABASES"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_DATABASES"

    // $ANTLR start "KW_MATERIALIZED"
    public final void mKW_MATERIALIZED() throws RecognitionException {
        try {
            int _type = KW_MATERIALIZED;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:224:16: ( 'MATERIALIZED' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:224:18: 'MATERIALIZED'
            {
            match("MATERIALIZED"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_MATERIALIZED"

    // $ANTLR start "KW_SCHEMA"
    public final void mKW_SCHEMA() throws RecognitionException {
        try {
            int _type = KW_SCHEMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:225:10: ( 'SCHEMA' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:225:12: 'SCHEMA'
            {
            match("SCHEMA"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_SCHEMA"

    // $ANTLR start "KW_SCHEMAS"
    public final void mKW_SCHEMAS() throws RecognitionException {
        try {
            int _type = KW_SCHEMAS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:226:11: ( 'SCHEMAS' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:226:13: 'SCHEMAS'
            {
            match("SCHEMAS"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_SCHEMAS"

    // $ANTLR start "KW_GRANT"
    public final void mKW_GRANT() throws RecognitionException {
        try {
            int _type = KW_GRANT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:227:9: ( 'GRANT' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:227:11: 'GRANT'
            {
            match("GRANT"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_GRANT"

    // $ANTLR start "KW_REVOKE"
    public final void mKW_REVOKE() throws RecognitionException {
        try {
            int _type = KW_REVOKE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:228:10: ( 'REVOKE' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:228:12: 'REVOKE'
            {
            match("REVOKE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_REVOKE"

    // $ANTLR start "KW_SSL"
    public final void mKW_SSL() throws RecognitionException {
        try {
            int _type = KW_SSL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:229:7: ( 'SSL' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:229:9: 'SSL'
            {
            match("SSL"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_SSL"

    // $ANTLR start "KW_UNDO"
    public final void mKW_UNDO() throws RecognitionException {
        try {
            int _type = KW_UNDO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:230:8: ( 'UNDO' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:230:10: 'UNDO'
            {
            match("UNDO"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_UNDO"

    // $ANTLR start "KW_LOCK"
    public final void mKW_LOCK() throws RecognitionException {
        try {
            int _type = KW_LOCK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:231:8: ( 'LOCK' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:231:10: 'LOCK'
            {
            match("LOCK"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_LOCK"

    // $ANTLR start "KW_LOCKS"
    public final void mKW_LOCKS() throws RecognitionException {
        try {
            int _type = KW_LOCKS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:232:9: ( 'LOCKS' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:232:11: 'LOCKS'
            {
            match("LOCKS"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_LOCKS"

    // $ANTLR start "KW_UNLOCK"
    public final void mKW_UNLOCK() throws RecognitionException {
        try {
            int _type = KW_UNLOCK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:233:10: ( 'UNLOCK' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:233:12: 'UNLOCK'
            {
            match("UNLOCK"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_UNLOCK"

    // $ANTLR start "KW_SHARED"
    public final void mKW_SHARED() throws RecognitionException {
        try {
            int _type = KW_SHARED;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:234:10: ( 'SHARED' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:234:12: 'SHARED'
            {
            match("SHARED"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_SHARED"

    // $ANTLR start "KW_EXCLUSIVE"
    public final void mKW_EXCLUSIVE() throws RecognitionException {
        try {
            int _type = KW_EXCLUSIVE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:235:13: ( 'EXCLUSIVE' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:235:15: 'EXCLUSIVE'
            {
            match("EXCLUSIVE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_EXCLUSIVE"

    // $ANTLR start "KW_PROCEDURE"
    public final void mKW_PROCEDURE() throws RecognitionException {
        try {
            int _type = KW_PROCEDURE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:236:13: ( 'PROCEDURE' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:236:15: 'PROCEDURE'
            {
            match("PROCEDURE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_PROCEDURE"

    // $ANTLR start "KW_UNSIGNED"
    public final void mKW_UNSIGNED() throws RecognitionException {
        try {
            int _type = KW_UNSIGNED;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:237:12: ( 'UNSIGNED' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:237:14: 'UNSIGNED'
            {
            match("UNSIGNED"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_UNSIGNED"

    // $ANTLR start "KW_WHILE"
    public final void mKW_WHILE() throws RecognitionException {
        try {
            int _type = KW_WHILE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:238:9: ( 'WHILE' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:238:11: 'WHILE'
            {
            match("WHILE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_WHILE"

    // $ANTLR start "KW_READ"
    public final void mKW_READ() throws RecognitionException {
        try {
            int _type = KW_READ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:239:8: ( 'READ' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:239:10: 'READ'
            {
            match("READ"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_READ"

    // $ANTLR start "KW_READS"
    public final void mKW_READS() throws RecognitionException {
        try {
            int _type = KW_READS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:240:9: ( 'READS' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:240:11: 'READS'
            {
            match("READS"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_READS"

    // $ANTLR start "KW_PURGE"
    public final void mKW_PURGE() throws RecognitionException {
        try {
            int _type = KW_PURGE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:241:9: ( 'PURGE' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:241:11: 'PURGE'
            {
            match("PURGE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_PURGE"

    // $ANTLR start "KW_RANGE"
    public final void mKW_RANGE() throws RecognitionException {
        try {
            int _type = KW_RANGE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:242:9: ( 'RANGE' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:242:11: 'RANGE'
            {
            match("RANGE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_RANGE"

    // $ANTLR start "KW_ANALYZE"
    public final void mKW_ANALYZE() throws RecognitionException {
        try {
            int _type = KW_ANALYZE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:243:11: ( 'ANALYZE' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:243:13: 'ANALYZE'
            {
            match("ANALYZE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_ANALYZE"

    // $ANTLR start "KW_BEFORE"
    public final void mKW_BEFORE() throws RecognitionException {
        try {
            int _type = KW_BEFORE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:244:10: ( 'BEFORE' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:244:12: 'BEFORE'
            {
            match("BEFORE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_BEFORE"

    // $ANTLR start "KW_BETWEEN"
    public final void mKW_BETWEEN() throws RecognitionException {
        try {
            int _type = KW_BETWEEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:245:11: ( 'BETWEEN' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:245:13: 'BETWEEN'
            {
            match("BETWEEN"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_BETWEEN"

    // $ANTLR start "KW_BOTH"
    public final void mKW_BOTH() throws RecognitionException {
        try {
            int _type = KW_BOTH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:246:8: ( 'BOTH' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:246:10: 'BOTH'
            {
            match("BOTH"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_BOTH"

    // $ANTLR start "KW_BINARY"
    public final void mKW_BINARY() throws RecognitionException {
        try {
            int _type = KW_BINARY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:247:10: ( 'BINARY' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:247:12: 'BINARY'
            {
            match("BINARY"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_BINARY"

    // $ANTLR start "KW_CROSS"
    public final void mKW_CROSS() throws RecognitionException {
        try {
            int _type = KW_CROSS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:248:9: ( 'CROSS' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:248:11: 'CROSS'
            {
            match("CROSS"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_CROSS"

    // $ANTLR start "KW_CONTINUE"
    public final void mKW_CONTINUE() throws RecognitionException {
        try {
            int _type = KW_CONTINUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:249:12: ( 'CONTINUE' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:249:14: 'CONTINUE'
            {
            match("CONTINUE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_CONTINUE"

    // $ANTLR start "KW_CURSOR"
    public final void mKW_CURSOR() throws RecognitionException {
        try {
            int _type = KW_CURSOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:250:10: ( 'CURSOR' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:250:12: 'CURSOR'
            {
            match("CURSOR"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_CURSOR"

    // $ANTLR start "KW_TRIGGER"
    public final void mKW_TRIGGER() throws RecognitionException {
        try {
            int _type = KW_TRIGGER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:251:11: ( 'TRIGGER' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:251:13: 'TRIGGER'
            {
            match("TRIGGER"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_TRIGGER"

    // $ANTLR start "KW_RECORDREADER"
    public final void mKW_RECORDREADER() throws RecognitionException {
        try {
            int _type = KW_RECORDREADER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:252:16: ( 'RECORDREADER' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:252:18: 'RECORDREADER'
            {
            match("RECORDREADER"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_RECORDREADER"

    // $ANTLR start "KW_RECORDWRITER"
    public final void mKW_RECORDWRITER() throws RecognitionException {
        try {
            int _type = KW_RECORDWRITER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:253:16: ( 'RECORDWRITER' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:253:18: 'RECORDWRITER'
            {
            match("RECORDWRITER"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_RECORDWRITER"

    // $ANTLR start "KW_SEMI"
    public final void mKW_SEMI() throws RecognitionException {
        try {
            int _type = KW_SEMI;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:254:8: ( 'SEMI' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:254:10: 'SEMI'
            {
            match("SEMI"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_SEMI"

    // $ANTLR start "KW_LATERAL"
    public final void mKW_LATERAL() throws RecognitionException {
        try {
            int _type = KW_LATERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:255:11: ( 'LATERAL' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:255:13: 'LATERAL'
            {
            match("LATERAL"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_LATERAL"

    // $ANTLR start "KW_TOUCH"
    public final void mKW_TOUCH() throws RecognitionException {
        try {
            int _type = KW_TOUCH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:256:9: ( 'TOUCH' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:256:11: 'TOUCH'
            {
            match("TOUCH"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_TOUCH"

    // $ANTLR start "KW_ARCHIVE"
    public final void mKW_ARCHIVE() throws RecognitionException {
        try {
            int _type = KW_ARCHIVE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:257:11: ( 'ARCHIVE' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:257:13: 'ARCHIVE'
            {
            match("ARCHIVE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_ARCHIVE"

    // $ANTLR start "KW_UNARCHIVE"
    public final void mKW_UNARCHIVE() throws RecognitionException {
        try {
            int _type = KW_UNARCHIVE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:258:13: ( 'UNARCHIVE' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:258:15: 'UNARCHIVE'
            {
            match("UNARCHIVE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_UNARCHIVE"

    // $ANTLR start "KW_COMPUTE"
    public final void mKW_COMPUTE() throws RecognitionException {
        try {
            int _type = KW_COMPUTE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:259:11: ( 'COMPUTE' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:259:13: 'COMPUTE'
            {
            match("COMPUTE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_COMPUTE"

    // $ANTLR start "KW_STATISTICS"
    public final void mKW_STATISTICS() throws RecognitionException {
        try {
            int _type = KW_STATISTICS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:260:14: ( 'STATISTICS' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:260:16: 'STATISTICS'
            {
            match("STATISTICS"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_STATISTICS"

    // $ANTLR start "KW_USE"
    public final void mKW_USE() throws RecognitionException {
        try {
            int _type = KW_USE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:261:7: ( 'USE' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:261:9: 'USE'
            {
            match("USE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_USE"

    // $ANTLR start "KW_OPTION"
    public final void mKW_OPTION() throws RecognitionException {
        try {
            int _type = KW_OPTION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:262:10: ( 'OPTION' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:262:12: 'OPTION'
            {
            match("OPTION"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_OPTION"

    // $ANTLR start "KW_CONCATENATE"
    public final void mKW_CONCATENATE() throws RecognitionException {
        try {
            int _type = KW_CONCATENATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:263:15: ( 'CONCATENATE' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:263:17: 'CONCATENATE'
            {
            match("CONCATENATE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_CONCATENATE"

    // $ANTLR start "KW_SHOW_DATABASE"
    public final void mKW_SHOW_DATABASE() throws RecognitionException {
        try {
            int _type = KW_SHOW_DATABASE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:264:17: ( 'SHOW_DATABASE' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:264:19: 'SHOW_DATABASE'
            {
            match("SHOW_DATABASE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_SHOW_DATABASE"

    // $ANTLR start "KW_UPDATE"
    public final void mKW_UPDATE() throws RecognitionException {
        try {
            int _type = KW_UPDATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:265:10: ( 'UPDATE' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:265:12: 'UPDATE'
            {
            match("UPDATE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_UPDATE"

    // $ANTLR start "KW_RESTRICT"
    public final void mKW_RESTRICT() throws RecognitionException {
        try {
            int _type = KW_RESTRICT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:266:12: ( 'RESTRICT' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:266:14: 'RESTRICT'
            {
            match("RESTRICT"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_RESTRICT"

    // $ANTLR start "KW_CASCADE"
    public final void mKW_CASCADE() throws RecognitionException {
        try {
            int _type = KW_CASCADE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:267:11: ( 'CASCADE' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:267:13: 'CASCADE'
            {
            match("CASCADE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_CASCADE"

    // $ANTLR start "KW_SKEWED"
    public final void mKW_SKEWED() throws RecognitionException {
        try {
            int _type = KW_SKEWED;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:268:10: ( 'SKEWED' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:268:12: 'SKEWED'
            {
            match("SKEWED"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_SKEWED"

    // $ANTLR start "KW_ROLLUP"
    public final void mKW_ROLLUP() throws RecognitionException {
        try {
            int _type = KW_ROLLUP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:269:10: ( 'ROLLUP' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:269:12: 'ROLLUP'
            {
            match("ROLLUP"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_ROLLUP"

    // $ANTLR start "KW_CUBE"
    public final void mKW_CUBE() throws RecognitionException {
        try {
            int _type = KW_CUBE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:270:8: ( 'CUBE' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:270:10: 'CUBE'
            {
            match("CUBE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_CUBE"

    // $ANTLR start "KW_DIRECTORIES"
    public final void mKW_DIRECTORIES() throws RecognitionException {
        try {
            int _type = KW_DIRECTORIES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:271:15: ( 'DIRECTORIES' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:271:17: 'DIRECTORIES'
            {
            match("DIRECTORIES"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_DIRECTORIES"

    // $ANTLR start "KW_FOR"
    public final void mKW_FOR() throws RecognitionException {
        try {
            int _type = KW_FOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:272:7: ( 'FOR' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:272:9: 'FOR'
            {
            match("FOR"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_FOR"

    // $ANTLR start "KW_WINDOW"
    public final void mKW_WINDOW() throws RecognitionException {
        try {
            int _type = KW_WINDOW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:273:10: ( 'WINDOW' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:273:12: 'WINDOW'
            {
            match("WINDOW"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_WINDOW"

    // $ANTLR start "KW_UNBOUNDED"
    public final void mKW_UNBOUNDED() throws RecognitionException {
        try {
            int _type = KW_UNBOUNDED;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:274:13: ( 'UNBOUNDED' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:274:15: 'UNBOUNDED'
            {
            match("UNBOUNDED"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_UNBOUNDED"

    // $ANTLR start "KW_PRECEDING"
    public final void mKW_PRECEDING() throws RecognitionException {
        try {
            int _type = KW_PRECEDING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:275:13: ( 'PRECEDING' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:275:15: 'PRECEDING'
            {
            match("PRECEDING"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_PRECEDING"

    // $ANTLR start "KW_FOLLOWING"
    public final void mKW_FOLLOWING() throws RecognitionException {
        try {
            int _type = KW_FOLLOWING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:276:13: ( 'FOLLOWING' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:276:15: 'FOLLOWING'
            {
            match("FOLLOWING"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_FOLLOWING"

    // $ANTLR start "KW_CURRENT"
    public final void mKW_CURRENT() throws RecognitionException {
        try {
            int _type = KW_CURRENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:277:11: ( 'CURRENT' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:277:13: 'CURRENT'
            {
            match("CURRENT"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_CURRENT"

    // $ANTLR start "KW_LESS"
    public final void mKW_LESS() throws RecognitionException {
        try {
            int _type = KW_LESS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:278:8: ( 'LESS' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:278:10: 'LESS'
            {
            match("LESS"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_LESS"

    // $ANTLR start "KW_MORE"
    public final void mKW_MORE() throws RecognitionException {
        try {
            int _type = KW_MORE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:279:8: ( 'MORE' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:279:10: 'MORE'
            {
            match("MORE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_MORE"

    // $ANTLR start "KW_OVER"
    public final void mKW_OVER() throws RecognitionException {
        try {
            int _type = KW_OVER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:280:8: ( 'OVER' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:280:10: 'OVER'
            {
            match("OVER"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_OVER"

    // $ANTLR start "KW_GROUPING"
    public final void mKW_GROUPING() throws RecognitionException {
        try {
            int _type = KW_GROUPING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:281:12: ( 'GROUPING' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:281:14: 'GROUPING'
            {
            match("GROUPING"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_GROUPING"

    // $ANTLR start "KW_SETS"
    public final void mKW_SETS() throws RecognitionException {
        try {
            int _type = KW_SETS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:282:8: ( 'SETS' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:282:10: 'SETS'
            {
            match("SETS"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_SETS"

    // $ANTLR start "KW_TRUNCATE"
    public final void mKW_TRUNCATE() throws RecognitionException {
        try {
            int _type = KW_TRUNCATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:283:12: ( 'TRUNCATE' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:283:14: 'TRUNCATE'
            {
            match("TRUNCATE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_TRUNCATE"

    // $ANTLR start "KW_NOSCAN"
    public final void mKW_NOSCAN() throws RecognitionException {
        try {
            int _type = KW_NOSCAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:284:10: ( 'NOSCAN' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:284:12: 'NOSCAN'
            {
            match("NOSCAN"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_NOSCAN"

    // $ANTLR start "KW_PARTIALSCAN"
    public final void mKW_PARTIALSCAN() throws RecognitionException {
        try {
            int _type = KW_PARTIALSCAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:285:15: ( 'PARTIALSCAN' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:285:17: 'PARTIALSCAN'
            {
            match("PARTIALSCAN"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_PARTIALSCAN"

    // $ANTLR start "KW_USER"
    public final void mKW_USER() throws RecognitionException {
        try {
            int _type = KW_USER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:286:8: ( 'USER' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:286:10: 'USER'
            {
            match("USER"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_USER"

    // $ANTLR start "KW_ROLE"
    public final void mKW_ROLE() throws RecognitionException {
        try {
            int _type = KW_ROLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:287:8: ( 'ROLE' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:287:10: 'ROLE'
            {
            match("ROLE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_ROLE"

    // $ANTLR start "KW_ROLES"
    public final void mKW_ROLES() throws RecognitionException {
        try {
            int _type = KW_ROLES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:288:9: ( 'ROLES' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:288:11: 'ROLES'
            {
            match("ROLES"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_ROLES"

    // $ANTLR start "KW_INNER"
    public final void mKW_INNER() throws RecognitionException {
        try {
            int _type = KW_INNER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:289:9: ( 'INNER' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:289:11: 'INNER'
            {
            match("INNER"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_INNER"

    // $ANTLR start "KW_EXCHANGE"
    public final void mKW_EXCHANGE() throws RecognitionException {
        try {
            int _type = KW_EXCHANGE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:290:12: ( 'EXCHANGE' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:290:14: 'EXCHANGE'
            {
            match("EXCHANGE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_EXCHANGE"

    // $ANTLR start "KW_ADMIN"
    public final void mKW_ADMIN() throws RecognitionException {
        try {
            int _type = KW_ADMIN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:291:9: ( 'ADMIN' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:291:11: 'ADMIN'
            {
            match("ADMIN"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_ADMIN"

    // $ANTLR start "KW_OWNER"
    public final void mKW_OWNER() throws RecognitionException {
        try {
            int _type = KW_OWNER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:292:9: ( 'OWNER' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:292:11: 'OWNER'
            {
            match("OWNER"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_OWNER"

    // $ANTLR start "KW_PRINCIPALS"
    public final void mKW_PRINCIPALS() throws RecognitionException {
        try {
            int _type = KW_PRINCIPALS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:293:14: ( 'PRINCIPALS' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:293:16: 'PRINCIPALS'
            {
            match("PRINCIPALS"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_PRINCIPALS"

    // $ANTLR start "KW_COMPACT"
    public final void mKW_COMPACT() throws RecognitionException {
        try {
            int _type = KW_COMPACT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:294:11: ( 'COMPACT' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:294:13: 'COMPACT'
            {
            match("COMPACT"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_COMPACT"

    // $ANTLR start "KW_COMPACTIONS"
    public final void mKW_COMPACTIONS() throws RecognitionException {
        try {
            int _type = KW_COMPACTIONS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:295:15: ( 'COMPACTIONS' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:295:17: 'COMPACTIONS'
            {
            match("COMPACTIONS"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_COMPACTIONS"

    // $ANTLR start "KW_TRANSACTIONS"
    public final void mKW_TRANSACTIONS() throws RecognitionException {
        try {
            int _type = KW_TRANSACTIONS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:296:16: ( 'TRANSACTIONS' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:296:18: 'TRANSACTIONS'
            {
            match("TRANSACTIONS"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_TRANSACTIONS"

    // $ANTLR start "DOT"
    public final void mDOT() throws RecognitionException {
        try {
            int _type = DOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:301:5: ( '.' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:301:7: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DOT"

    // $ANTLR start "COLON"
    public final void mCOLON() throws RecognitionException {
        try {
            int _type = COLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:302:7: ( ':' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:302:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COLON"

    // $ANTLR start "COMMA"
    public final void mCOMMA() throws RecognitionException {
        try {
            int _type = COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:303:7: ( ',' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:303:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMA"

    // $ANTLR start "SEMICOLON"
    public final void mSEMICOLON() throws RecognitionException {
        try {
            int _type = SEMICOLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:304:11: ( ';' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:304:13: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SEMICOLON"

    // $ANTLR start "LPAREN"
    public final void mLPAREN() throws RecognitionException {
        try {
            int _type = LPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:306:8: ( '(' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:306:10: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LPAREN"

    // $ANTLR start "RPAREN"
    public final void mRPAREN() throws RecognitionException {
        try {
            int _type = RPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:307:8: ( ')' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:307:10: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RPAREN"

    // $ANTLR start "LSQUARE"
    public final void mLSQUARE() throws RecognitionException {
        try {
            int _type = LSQUARE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:308:9: ( '[' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:308:11: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LSQUARE"

    // $ANTLR start "RSQUARE"
    public final void mRSQUARE() throws RecognitionException {
        try {
            int _type = RSQUARE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:309:9: ( ']' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:309:11: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RSQUARE"

    // $ANTLR start "LCURLY"
    public final void mLCURLY() throws RecognitionException {
        try {
            int _type = LCURLY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:310:8: ( '{' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:310:10: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LCURLY"

    // $ANTLR start "RCURLY"
    public final void mRCURLY() throws RecognitionException {
        try {
            int _type = RCURLY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:311:8: ( '}' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:311:10: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RCURLY"

    // $ANTLR start "EQUAL"
    public final void mEQUAL() throws RecognitionException {
        try {
            int _type = EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:313:7: ( '=' | '==' )
            int alt2=2;
            switch ( input.LA(1) ) {
            case '=':
                {
                switch ( input.LA(2) ) {
                case '=':
                    {
                    alt2=2;
                    }
                    break;
                default:
                    alt2=1;
                }

                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }

            switch (alt2) {
                case 1 :
                    // org/apache/hadoop/hive/ql/parse/HiveLexer.g:313:9: '='
                    {
                    match('='); 

                    }
                    break;
                case 2 :
                    // org/apache/hadoop/hive/ql/parse/HiveLexer.g:313:15: '=='
                    {
                    match("=="); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EQUAL"

    // $ANTLR start "EQUAL_NS"
    public final void mEQUAL_NS() throws RecognitionException {
        try {
            int _type = EQUAL_NS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:314:10: ( '<=>' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:314:12: '<=>'
            {
            match("<=>"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EQUAL_NS"

    // $ANTLR start "NOTEQUAL"
    public final void mNOTEQUAL() throws RecognitionException {
        try {
            int _type = NOTEQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:315:10: ( '<>' | '!=' )
            int alt3=2;
            switch ( input.LA(1) ) {
            case '<':
                {
                alt3=1;
                }
                break;
            case '!':
                {
                alt3=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }

            switch (alt3) {
                case 1 :
                    // org/apache/hadoop/hive/ql/parse/HiveLexer.g:315:12: '<>'
                    {
                    match("<>"); 



                    }
                    break;
                case 2 :
                    // org/apache/hadoop/hive/ql/parse/HiveLexer.g:315:19: '!='
                    {
                    match("!="); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NOTEQUAL"

    // $ANTLR start "LESSTHANOREQUALTO"
    public final void mLESSTHANOREQUALTO() throws RecognitionException {
        try {
            int _type = LESSTHANOREQUALTO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:316:19: ( '<=' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:316:21: '<='
            {
            match("<="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LESSTHANOREQUALTO"

    // $ANTLR start "LESSTHAN"
    public final void mLESSTHAN() throws RecognitionException {
        try {
            int _type = LESSTHAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:317:10: ( '<' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:317:12: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LESSTHAN"

    // $ANTLR start "GREATERTHANOREQUALTO"
    public final void mGREATERTHANOREQUALTO() throws RecognitionException {
        try {
            int _type = GREATERTHANOREQUALTO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:318:22: ( '>=' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:318:24: '>='
            {
            match(">="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "GREATERTHANOREQUALTO"

    // $ANTLR start "GREATERTHAN"
    public final void mGREATERTHAN() throws RecognitionException {
        try {
            int _type = GREATERTHAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:319:13: ( '>' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:319:15: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "GREATERTHAN"

    // $ANTLR start "DIVIDE"
    public final void mDIVIDE() throws RecognitionException {
        try {
            int _type = DIVIDE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:321:8: ( '/' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:321:10: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DIVIDE"

    // $ANTLR start "PLUS"
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:322:6: ( '+' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:322:8: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PLUS"

    // $ANTLR start "MINUS"
    public final void mMINUS() throws RecognitionException {
        try {
            int _type = MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:323:7: ( '-' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:323:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MINUS"

    // $ANTLR start "STAR"
    public final void mSTAR() throws RecognitionException {
        try {
            int _type = STAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:324:6: ( '*' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:324:8: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STAR"

    // $ANTLR start "MOD"
    public final void mMOD() throws RecognitionException {
        try {
            int _type = MOD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:325:5: ( '%' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:325:7: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MOD"

    // $ANTLR start "DIV"
    public final void mDIV() throws RecognitionException {
        try {
            int _type = DIV;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:326:5: ( 'DIV' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:326:7: 'DIV'
            {
            match("DIV"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DIV"

    // $ANTLR start "AMPERSAND"
    public final void mAMPERSAND() throws RecognitionException {
        try {
            int _type = AMPERSAND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:328:11: ( '&' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:328:13: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "AMPERSAND"

    // $ANTLR start "TILDE"
    public final void mTILDE() throws RecognitionException {
        try {
            int _type = TILDE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:329:7: ( '~' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:329:9: '~'
            {
            match('~'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TILDE"

    // $ANTLR start "BITWISEOR"
    public final void mBITWISEOR() throws RecognitionException {
        try {
            int _type = BITWISEOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:330:11: ( '|' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:330:13: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BITWISEOR"

    // $ANTLR start "BITWISEXOR"
    public final void mBITWISEXOR() throws RecognitionException {
        try {
            int _type = BITWISEXOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:331:12: ( '^' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:331:14: '^'
            {
            match('^'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BITWISEXOR"

    // $ANTLR start "QUESTION"
    public final void mQUESTION() throws RecognitionException {
        try {
            int _type = QUESTION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:332:10: ( '?' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:332:12: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "QUESTION"

    // $ANTLR start "DOLLAR"
    public final void mDOLLAR() throws RecognitionException {
        try {
            int _type = DOLLAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:333:8: ( '$' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:333:10: '$'
            {
            match('$'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DOLLAR"

    // $ANTLR start "Letter"
    public final void mLetter() throws RecognitionException {
        try {
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:338:5: ( 'a' .. 'z' | 'A' .. 'Z' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Letter"

    // $ANTLR start "HexDigit"
    public final void mHexDigit() throws RecognitionException {
        try {
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:343:5: ( 'a' .. 'f' | 'A' .. 'F' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "HexDigit"

    // $ANTLR start "Digit"
    public final void mDigit() throws RecognitionException {
        try {
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:348:5: ( '0' .. '9' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:
            {
            if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Digit"

    // $ANTLR start "Exponent"
    public final void mExponent() throws RecognitionException {
        try {
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:354:5: ( ( 'e' | 'E' ) ( PLUS | MINUS )? ( Digit )+ )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:355:5: ( 'e' | 'E' ) ( PLUS | MINUS )? ( Digit )+
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:355:17: ( PLUS | MINUS )?
            int alt4=2;
            switch ( input.LA(1) ) {
                case '+':
                case '-':
                    {
                    alt4=1;
                    }
                    break;
            }

            switch (alt4) {
                case 1 :
                    // org/apache/hadoop/hive/ql/parse/HiveLexer.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;

            }


            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:355:33: ( Digit )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                switch ( input.LA(1) ) {
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                    {
                    alt5=1;
                    }
                    break;

                }

                switch (alt5) {
            	case 1 :
            	    // org/apache/hadoop/hive/ql/parse/HiveLexer.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Exponent"

    // $ANTLR start "RegexComponent"
    public final void mRegexComponent() throws RecognitionException {
        try {
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:360:5: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | PLUS | STAR | QUESTION | MINUS | DOT | LPAREN | RPAREN | LSQUARE | RSQUARE | LCURLY | RCURLY | BITWISEXOR | BITWISEOR | DOLLAR )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:
            {
            if ( input.LA(1)=='$'||(input.LA(1) >= '(' && input.LA(1) <= '+')||(input.LA(1) >= '-' && input.LA(1) <= '.')||(input.LA(1) >= '0' && input.LA(1) <= '9')||input.LA(1)=='?'||(input.LA(1) >= 'A' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '_')||(input.LA(1) >= 'a' && input.LA(1) <= '}') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RegexComponent"

    // $ANTLR start "StringLiteral"
    public final void mStringLiteral() throws RecognitionException {
        try {
            int _type = StringLiteral;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:367:5: ( ( '\\'' (~ ( '\\'' | '\\\\' ) | ( '\\\\' . ) )* '\\'' | '\\\"' (~ ( '\\\"' | '\\\\' ) | ( '\\\\' . ) )* '\\\"' )+ )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:368:5: ( '\\'' (~ ( '\\'' | '\\\\' ) | ( '\\\\' . ) )* '\\'' | '\\\"' (~ ( '\\\"' | '\\\\' ) | ( '\\\\' . ) )* '\\\"' )+
            {
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:368:5: ( '\\'' (~ ( '\\'' | '\\\\' ) | ( '\\\\' . ) )* '\\'' | '\\\"' (~ ( '\\\"' | '\\\\' ) | ( '\\\\' . ) )* '\\\"' )+
            int cnt8=0;
            loop8:
            do {
                int alt8=3;
                switch ( input.LA(1) ) {
                case '\'':
                    {
                    alt8=1;
                    }
                    break;
                case '\"':
                    {
                    alt8=2;
                    }
                    break;

                }

                switch (alt8) {
            	case 1 :
            	    // org/apache/hadoop/hive/ql/parse/HiveLexer.g:368:7: '\\'' (~ ( '\\'' | '\\\\' ) | ( '\\\\' . ) )* '\\''
            	    {
            	    match('\''); 

            	    // org/apache/hadoop/hive/ql/parse/HiveLexer.g:368:12: (~ ( '\\'' | '\\\\' ) | ( '\\\\' . ) )*
            	    loop6:
            	    do {
            	        int alt6=3;
            	        int LA6_0 = input.LA(1);

            	        if ( ((LA6_0 >= '\u0000' && LA6_0 <= '&')||(LA6_0 >= '(' && LA6_0 <= '[')||(LA6_0 >= ']' && LA6_0 <= '\uFFFF')) ) {
            	            alt6=1;
            	        }
            	        else if ( (LA6_0=='\\') ) {
            	            alt6=2;
            	        }


            	        switch (alt6) {
            	    	case 1 :
            	    	    // org/apache/hadoop/hive/ql/parse/HiveLexer.g:368:14: ~ ( '\\'' | '\\\\' )
            	    	    {
            	    	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '&')||(input.LA(1) >= '(' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
            	    	        input.consume();
            	    	    }
            	    	    else {
            	    	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	    	        recover(mse);
            	    	        throw mse;
            	    	    }


            	    	    }
            	    	    break;
            	    	case 2 :
            	    	    // org/apache/hadoop/hive/ql/parse/HiveLexer.g:368:29: ( '\\\\' . )
            	    	    {
            	    	    // org/apache/hadoop/hive/ql/parse/HiveLexer.g:368:29: ( '\\\\' . )
            	    	    // org/apache/hadoop/hive/ql/parse/HiveLexer.g:368:30: '\\\\' .
            	    	    {
            	    	    match('\\'); 

            	    	    matchAny(); 

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop6;
            	        }
            	    } while (true);


            	    match('\''); 

            	    }
            	    break;
            	case 2 :
            	    // org/apache/hadoop/hive/ql/parse/HiveLexer.g:369:7: '\\\"' (~ ( '\\\"' | '\\\\' ) | ( '\\\\' . ) )* '\\\"'
            	    {
            	    match('\"'); 

            	    // org/apache/hadoop/hive/ql/parse/HiveLexer.g:369:12: (~ ( '\\\"' | '\\\\' ) | ( '\\\\' . ) )*
            	    loop7:
            	    do {
            	        int alt7=3;
            	        int LA7_0 = input.LA(1);

            	        if ( ((LA7_0 >= '\u0000' && LA7_0 <= '!')||(LA7_0 >= '#' && LA7_0 <= '[')||(LA7_0 >= ']' && LA7_0 <= '\uFFFF')) ) {
            	            alt7=1;
            	        }
            	        else if ( (LA7_0=='\\') ) {
            	            alt7=2;
            	        }


            	        switch (alt7) {
            	    	case 1 :
            	    	    // org/apache/hadoop/hive/ql/parse/HiveLexer.g:369:14: ~ ( '\\\"' | '\\\\' )
            	    	    {
            	    	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
            	    	        input.consume();
            	    	    }
            	    	    else {
            	    	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	    	        recover(mse);
            	    	        throw mse;
            	    	    }


            	    	    }
            	    	    break;
            	    	case 2 :
            	    	    // org/apache/hadoop/hive/ql/parse/HiveLexer.g:369:29: ( '\\\\' . )
            	    	    {
            	    	    // org/apache/hadoop/hive/ql/parse/HiveLexer.g:369:29: ( '\\\\' . )
            	    	    // org/apache/hadoop/hive/ql/parse/HiveLexer.g:369:30: '\\\\' .
            	    	    {
            	    	    match('\\'); 

            	    	    matchAny(); 

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop7;
            	        }
            	    } while (true);


            	    match('\"'); 

            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "StringLiteral"

    // $ANTLR start "CharSetLiteral"
    public final void mCharSetLiteral() throws RecognitionException {
        try {
            int _type = CharSetLiteral;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:374:5: ( StringLiteral | '0' 'X' ( HexDigit | Digit )+ )
            int alt10=2;
            switch ( input.LA(1) ) {
            case '\"':
            case '\'':
                {
                alt10=1;
                }
                break;
            case '0':
                {
                alt10=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;

            }

            switch (alt10) {
                case 1 :
                    // org/apache/hadoop/hive/ql/parse/HiveLexer.g:375:5: StringLiteral
                    {
                    mStringLiteral(); 


                    }
                    break;
                case 2 :
                    // org/apache/hadoop/hive/ql/parse/HiveLexer.g:376:7: '0' 'X' ( HexDigit | Digit )+
                    {
                    match('0'); 

                    match('X'); 

                    // org/apache/hadoop/hive/ql/parse/HiveLexer.g:376:15: ( HexDigit | Digit )+
                    int cnt9=0;
                    loop9:
                    do {
                        int alt9=2;
                        switch ( input.LA(1) ) {
                        case '0':
                        case '1':
                        case '2':
                        case '3':
                        case '4':
                        case '5':
                        case '6':
                        case '7':
                        case '8':
                        case '9':
                        case 'A':
                        case 'B':
                        case 'C':
                        case 'D':
                        case 'E':
                        case 'F':
                        case 'a':
                        case 'b':
                        case 'c':
                        case 'd':
                        case 'e':
                        case 'f':
                            {
                            alt9=1;
                            }
                            break;

                        }

                        switch (alt9) {
                    	case 1 :
                    	    // org/apache/hadoop/hive/ql/parse/HiveLexer.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt9 >= 1 ) break loop9;
                                EarlyExitException eee =
                                    new EarlyExitException(9, input);
                                throw eee;
                        }
                        cnt9++;
                    } while (true);


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CharSetLiteral"

    // $ANTLR start "BigintLiteral"
    public final void mBigintLiteral() throws RecognitionException {
        try {
            int _type = BigintLiteral;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:380:5: ( ( Digit )+ 'L' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:381:5: ( Digit )+ 'L'
            {
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:381:5: ( Digit )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                switch ( input.LA(1) ) {
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                    {
                    alt11=1;
                    }
                    break;

                }

                switch (alt11) {
            	case 1 :
            	    // org/apache/hadoop/hive/ql/parse/HiveLexer.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            match('L'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BigintLiteral"

    // $ANTLR start "SmallintLiteral"
    public final void mSmallintLiteral() throws RecognitionException {
        try {
            int _type = SmallintLiteral;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:385:5: ( ( Digit )+ 'S' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:386:5: ( Digit )+ 'S'
            {
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:386:5: ( Digit )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                switch ( input.LA(1) ) {
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                    {
                    alt12=1;
                    }
                    break;

                }

                switch (alt12) {
            	case 1 :
            	    // org/apache/hadoop/hive/ql/parse/HiveLexer.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);


            match('S'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SmallintLiteral"

    // $ANTLR start "TinyintLiteral"
    public final void mTinyintLiteral() throws RecognitionException {
        try {
            int _type = TinyintLiteral;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:390:5: ( ( Digit )+ 'Y' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:391:5: ( Digit )+ 'Y'
            {
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:391:5: ( Digit )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                switch ( input.LA(1) ) {
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                    {
                    alt13=1;
                    }
                    break;

                }

                switch (alt13) {
            	case 1 :
            	    // org/apache/hadoop/hive/ql/parse/HiveLexer.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);


            match('Y'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TinyintLiteral"

    // $ANTLR start "DecimalLiteral"
    public final void mDecimalLiteral() throws RecognitionException {
        try {
            int _type = DecimalLiteral;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:395:5: ( Number 'B' 'D' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:396:5: Number 'B' 'D'
            {
            mNumber(); 


            match('B'); 

            match('D'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DecimalLiteral"

    // $ANTLR start "ByteLengthLiteral"
    public final void mByteLengthLiteral() throws RecognitionException {
        try {
            int _type = ByteLengthLiteral;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:400:5: ( ( Digit )+ ( 'b' | 'B' | 'k' | 'K' | 'm' | 'M' | 'g' | 'G' ) )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:401:5: ( Digit )+ ( 'b' | 'B' | 'k' | 'K' | 'm' | 'M' | 'g' | 'G' )
            {
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:401:5: ( Digit )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                switch ( input.LA(1) ) {
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                    {
                    alt14=1;
                    }
                    break;

                }

                switch (alt14) {
            	case 1 :
            	    // org/apache/hadoop/hive/ql/parse/HiveLexer.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
            } while (true);


            if ( input.LA(1)=='B'||input.LA(1)=='G'||input.LA(1)=='K'||input.LA(1)=='M'||input.LA(1)=='b'||input.LA(1)=='g'||input.LA(1)=='k'||input.LA(1)=='m' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ByteLengthLiteral"

    // $ANTLR start "Number"
    public final void mNumber() throws RecognitionException {
        try {
            int _type = Number;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:405:5: ( ( Digit )+ ( DOT ( Digit )* ( Exponent )? | Exponent )? )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:406:5: ( Digit )+ ( DOT ( Digit )* ( Exponent )? | Exponent )?
            {
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:406:5: ( Digit )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                switch ( input.LA(1) ) {
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                    {
                    alt15=1;
                    }
                    break;

                }

                switch (alt15) {
            	case 1 :
            	    // org/apache/hadoop/hive/ql/parse/HiveLexer.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
            } while (true);


            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:406:14: ( DOT ( Digit )* ( Exponent )? | Exponent )?
            int alt18=3;
            switch ( input.LA(1) ) {
                case '.':
                    {
                    alt18=1;
                    }
                    break;
                case 'E':
                case 'e':
                    {
                    alt18=2;
                    }
                    break;
            }

            switch (alt18) {
                case 1 :
                    // org/apache/hadoop/hive/ql/parse/HiveLexer.g:406:16: DOT ( Digit )* ( Exponent )?
                    {
                    mDOT(); 


                    // org/apache/hadoop/hive/ql/parse/HiveLexer.g:406:20: ( Digit )*
                    loop16:
                    do {
                        int alt16=2;
                        switch ( input.LA(1) ) {
                        case '0':
                        case '1':
                        case '2':
                        case '3':
                        case '4':
                        case '5':
                        case '6':
                        case '7':
                        case '8':
                        case '9':
                            {
                            alt16=1;
                            }
                            break;

                        }

                        switch (alt16) {
                    	case 1 :
                    	    // org/apache/hadoop/hive/ql/parse/HiveLexer.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);


                    // org/apache/hadoop/hive/ql/parse/HiveLexer.g:406:29: ( Exponent )?
                    int alt17=2;
                    switch ( input.LA(1) ) {
                        case 'E':
                        case 'e':
                            {
                            alt17=1;
                            }
                            break;
                    }

                    switch (alt17) {
                        case 1 :
                            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:406:30: Exponent
                            {
                            mExponent(); 


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // org/apache/hadoop/hive/ql/parse/HiveLexer.g:406:43: Exponent
                    {
                    mExponent(); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Number"

    // $ANTLR start "Identifier"
    public final void mIdentifier() throws RecognitionException {
        try {
            int _type = Identifier;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:431:5: ( ( Letter | Digit ) ( Letter | Digit | '_' )* |{...}? QuotedIdentifier | '`' ( RegexComponent )+ '`' )
            int alt21=3;
            alt21 = dfa21.predict(input);
            switch (alt21) {
                case 1 :
                    // org/apache/hadoop/hive/ql/parse/HiveLexer.g:432:5: ( Letter | Digit ) ( Letter | Digit | '_' )*
                    {
                    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    // org/apache/hadoop/hive/ql/parse/HiveLexer.g:432:22: ( Letter | Digit | '_' )*
                    loop19:
                    do {
                        int alt19=2;
                        switch ( input.LA(1) ) {
                        case '0':
                        case '1':
                        case '2':
                        case '3':
                        case '4':
                        case '5':
                        case '6':
                        case '7':
                        case '8':
                        case '9':
                        case 'A':
                        case 'B':
                        case 'C':
                        case 'D':
                        case 'E':
                        case 'F':
                        case 'G':
                        case 'H':
                        case 'I':
                        case 'J':
                        case 'K':
                        case 'L':
                        case 'M':
                        case 'N':
                        case 'O':
                        case 'P':
                        case 'Q':
                        case 'R':
                        case 'S':
                        case 'T':
                        case 'U':
                        case 'V':
                        case 'W':
                        case 'X':
                        case 'Y':
                        case 'Z':
                        case '_':
                        case 'a':
                        case 'b':
                        case 'c':
                        case 'd':
                        case 'e':
                        case 'f':
                        case 'g':
                        case 'h':
                        case 'i':
                        case 'j':
                        case 'k':
                        case 'l':
                        case 'm':
                        case 'n':
                        case 'o':
                        case 'p':
                        case 'q':
                        case 'r':
                        case 's':
                        case 't':
                        case 'u':
                        case 'v':
                        case 'w':
                        case 'x':
                        case 'y':
                        case 'z':
                            {
                            alt19=1;
                            }
                            break;

                        }

                        switch (alt19) {
                    	case 1 :
                    	    // org/apache/hadoop/hive/ql/parse/HiveLexer.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // org/apache/hadoop/hive/ql/parse/HiveLexer.g:433:7: {...}? QuotedIdentifier
                    {
                    if ( !((allowQuotedId())) ) {
                        throw new FailedPredicateException(input, "Identifier", "allowQuotedId()");
                    }

                    mQuotedIdentifier(); 


                    }
                    break;
                case 3 :
                    // org/apache/hadoop/hive/ql/parse/HiveLexer.g:435:7: '`' ( RegexComponent )+ '`'
                    {
                    match('`'); 

                    // org/apache/hadoop/hive/ql/parse/HiveLexer.g:435:11: ( RegexComponent )+
                    int cnt20=0;
                    loop20:
                    do {
                        int alt20=2;
                        switch ( input.LA(1) ) {
                        case '$':
                        case '(':
                        case ')':
                        case '*':
                        case '+':
                        case '-':
                        case '.':
                        case '0':
                        case '1':
                        case '2':
                        case '3':
                        case '4':
                        case '5':
                        case '6':
                        case '7':
                        case '8':
                        case '9':
                        case '?':
                        case 'A':
                        case 'B':
                        case 'C':
                        case 'D':
                        case 'E':
                        case 'F':
                        case 'G':
                        case 'H':
                        case 'I':
                        case 'J':
                        case 'K':
                        case 'L':
                        case 'M':
                        case 'N':
                        case 'O':
                        case 'P':
                        case 'Q':
                        case 'R':
                        case 'S':
                        case 'T':
                        case 'U':
                        case 'V':
                        case 'W':
                        case 'X':
                        case 'Y':
                        case 'Z':
                        case '[':
                        case ']':
                        case '^':
                        case '_':
                        case 'a':
                        case 'b':
                        case 'c':
                        case 'd':
                        case 'e':
                        case 'f':
                        case 'g':
                        case 'h':
                        case 'i':
                        case 'j':
                        case 'k':
                        case 'l':
                        case 'm':
                        case 'n':
                        case 'o':
                        case 'p':
                        case 'q':
                        case 'r':
                        case 's':
                        case 't':
                        case 'u':
                        case 'v':
                        case 'w':
                        case 'x':
                        case 'y':
                        case 'z':
                        case '{':
                        case '|':
                        case '}':
                            {
                            alt20=1;
                            }
                            break;

                        }

                        switch (alt20) {
                    	case 1 :
                    	    // org/apache/hadoop/hive/ql/parse/HiveLexer.g:
                    	    {
                    	    if ( input.LA(1)=='$'||(input.LA(1) >= '(' && input.LA(1) <= '+')||(input.LA(1) >= '-' && input.LA(1) <= '.')||(input.LA(1) >= '0' && input.LA(1) <= '9')||input.LA(1)=='?'||(input.LA(1) >= 'A' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '_')||(input.LA(1) >= 'a' && input.LA(1) <= '}') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt20 >= 1 ) break loop20;
                                EarlyExitException eee =
                                    new EarlyExitException(20, input);
                                throw eee;
                        }
                        cnt20++;
                    } while (true);


                    match('`'); 

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Identifier"

    // $ANTLR start "QuotedIdentifier"
    public final void mQuotedIdentifier() throws RecognitionException {
        try {
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:440:5: ( '`' ( '``' |~ ( '`' ) )* '`' )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:441:5: '`' ( '``' |~ ( '`' ) )* '`'
            {
            match('`'); 

            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:441:10: ( '``' |~ ( '`' ) )*
            loop22:
            do {
                int alt22=3;
                int LA22_0 = input.LA(1);

                if ( (LA22_0=='`') ) {
                    switch ( input.LA(2) ) {
                    case '`':
                        {
                        alt22=1;
                        }
                        break;

                    }

                }
                else if ( ((LA22_0 >= '\u0000' && LA22_0 <= '_')||(LA22_0 >= 'a' && LA22_0 <= '\uFFFF')) ) {
                    alt22=2;
                }


                switch (alt22) {
            	case 1 :
            	    // org/apache/hadoop/hive/ql/parse/HiveLexer.g:441:12: '``'
            	    {
            	    match("``"); 



            	    }
            	    break;
            	case 2 :
            	    // org/apache/hadoop/hive/ql/parse/HiveLexer.g:441:19: ~ ( '`' )
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '_')||(input.LA(1) >= 'a' && input.LA(1) <= '\uFFFF') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


            match('`'); 

             setText(getText().substring(1, getText().length() -1 ).replaceAll("``", "`")); 

            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "QuotedIdentifier"

    // $ANTLR start "CharSetName"
    public final void mCharSetName() throws RecognitionException {
        try {
            int _type = CharSetName;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:445:5: ( '_' ( Letter | Digit | '_' | '-' | '.' | ':' )+ )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:446:5: '_' ( Letter | Digit | '_' | '-' | '.' | ':' )+
            {
            match('_'); 

            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:446:9: ( Letter | Digit | '_' | '-' | '.' | ':' )+
            int cnt23=0;
            loop23:
            do {
                int alt23=2;
                switch ( input.LA(1) ) {
                case '-':
                case '.':
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                case ':':
                case 'A':
                case 'B':
                case 'C':
                case 'D':
                case 'E':
                case 'F':
                case 'G':
                case 'H':
                case 'I':
                case 'J':
                case 'K':
                case 'L':
                case 'M':
                case 'N':
                case 'O':
                case 'P':
                case 'Q':
                case 'R':
                case 'S':
                case 'T':
                case 'U':
                case 'V':
                case 'W':
                case 'X':
                case 'Y':
                case 'Z':
                case '_':
                case 'a':
                case 'b':
                case 'c':
                case 'd':
                case 'e':
                case 'f':
                case 'g':
                case 'h':
                case 'i':
                case 'j':
                case 'k':
                case 'l':
                case 'm':
                case 'n':
                case 'o':
                case 'p':
                case 'q':
                case 'r':
                case 's':
                case 't':
                case 'u':
                case 'v':
                case 'w':
                case 'x':
                case 'y':
                case 'z':
                    {
                    alt23=1;
                    }
                    break;

                }

                switch (alt23) {
            	case 1 :
            	    // org/apache/hadoop/hive/ql/parse/HiveLexer.g:
            	    {
            	    if ( (input.LA(1) >= '-' && input.LA(1) <= '.')||(input.LA(1) >= '0' && input.LA(1) <= ':')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt23 >= 1 ) break loop23;
                        EarlyExitException eee =
                            new EarlyExitException(23, input);
                        throw eee;
                }
                cnt23++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CharSetName"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:449:5: ( ( ' ' | '\\r' | '\\t' | '\\n' ) )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:449:8: ( ' ' | '\\r' | '\\t' | '\\n' )
            {
            if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:453:3: ( '--' (~ ( '\\n' | '\\r' ) )* )
            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:453:5: '--' (~ ( '\\n' | '\\r' ) )*
            {
            match("--"); 



            // org/apache/hadoop/hive/ql/parse/HiveLexer.g:453:10: (~ ( '\\n' | '\\r' ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0 >= '\u0000' && LA24_0 <= '\t')||(LA24_0 >= '\u000B' && LA24_0 <= '\f')||(LA24_0 >= '\u000E' && LA24_0 <= '\uFFFF')) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // org/apache/hadoop/hive/ql/parse/HiveLexer.g:
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);


             _channel=HIDDEN; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMENT"

    public void mTokens() throws RecognitionException {
        // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:8: ( KW_TRUE | KW_FALSE | KW_ALL | KW_NONE | KW_DEFAULT | KW_AND | KW_OR | KW_NOT | KW_LIKE | KW_IF | KW_EXISTS | KW_ASC | KW_DESC | KW_ORDER | KW_GROUP | KW_BY | KW_HAVING | KW_WHERE | KW_FROM | KW_AS | KW_SELECT | KW_DISTINCT | KW_INSERT | KW_OVERWRITE | KW_OUTER | KW_UNIQUEJOIN | KW_PRESERVE | KW_JOIN | KW_LEFT | KW_RIGHT | KW_FULL | KW_ON | KW_PARTITION | KW_PARTITIONS | KW_TABLE | KW_TABLES | KW_COLUMNS | KW_INDEX | KW_INDEXES | KW_REBUILD | KW_FUNCTIONS | KW_SHOW | KW_MSCK | KW_REPAIR | KW_DIRECTORY | KW_LOCAL | KW_TRANSFORM | KW_USING | KW_CLUSTER | KW_DISTRIBUTE | KW_SORT | KW_UNION | KW_LOAD | KW_EXPORT | KW_IMPORT | KW_DATA | KW_INPATH | KW_IS | KW_NULL | KW_CREATE | KW_EXTERNAL | KW_ALTER | KW_CHANGE | KW_COLUMN | KW_FIRST | KW_AFTER | KW_DESCRIBE | KW_DROP | KW_RENAME | KW_IGNORE | KW_PROTECTION | KW_TO | KW_COMMENT | KW_BOOLEAN | KW_TINYINT | KW_SMALLINT | KW_INT | KW_BIGINT | KW_FLOAT | KW_DOUBLE | KW_DATE | KW_DATETIME | KW_TIMESTAMP | KW_DECIMAL | KW_STRING | KW_CHAR | KW_VARCHAR | KW_ARRAY | KW_STRUCT | KW_MAP | KW_UNIONTYPE | KW_REDUCE | KW_PARTITIONED | KW_CLUSTERED | KW_SORTED | KW_INTO | KW_BUCKETS | KW_ROW | KW_ROWS | KW_FORMAT | KW_DELIMITED | KW_FIELDS | KW_TERMINATED | KW_ESCAPED | KW_COLLECTION | KW_ITEMS | KW_KEYS | KW_KEY_TYPE | KW_LINES | KW_STORED | KW_FILEFORMAT | KW_SEQUENCEFILE | KW_TEXTFILE | KW_RCFILE | KW_ORCFILE | KW_PARQUETFILE | KW_INPUTFORMAT | KW_OUTPUTFORMAT | KW_INPUTDRIVER | KW_OUTPUTDRIVER | KW_OFFLINE | KW_ENABLE | KW_DISABLE | KW_READONLY | KW_NO_DROP | KW_LOCATION | KW_TABLESAMPLE | KW_BUCKET | KW_OUT | KW_OF | KW_PERCENT | KW_CAST | KW_ADD | KW_REPLACE | KW_RLIKE | KW_REGEXP | KW_TEMPORARY | KW_FUNCTION | KW_MACRO | KW_FILE | KW_JAR | KW_EXPLAIN | KW_EXTENDED | KW_FORMATTED | KW_PRETTY | KW_DEPENDENCY | KW_LOGICAL | KW_SERDE | KW_WITH | KW_DEFERRED | KW_SERDEPROPERTIES | KW_DBPROPERTIES | KW_LIMIT | KW_SET | KW_UNSET | KW_TBLPROPERTIES | KW_IDXPROPERTIES | KW_VALUE_TYPE | KW_ELEM_TYPE | KW_DEFINED | KW_CASE | KW_WHEN | KW_THEN | KW_ELSE | KW_END | KW_MAPJOIN | KW_STREAMTABLE | KW_HOLD_DDLTIME | KW_CLUSTERSTATUS | KW_UTC | KW_UTCTIMESTAMP | KW_LONG | KW_DELETE | KW_PLUS | KW_MINUS | KW_FETCH | KW_INTERSECT | KW_VIEW | KW_IN | KW_DATABASE | KW_DATABASES | KW_MATERIALIZED | KW_SCHEMA | KW_SCHEMAS | KW_GRANT | KW_REVOKE | KW_SSL | KW_UNDO | KW_LOCK | KW_LOCKS | KW_UNLOCK | KW_SHARED | KW_EXCLUSIVE | KW_PROCEDURE | KW_UNSIGNED | KW_WHILE | KW_READ | KW_READS | KW_PURGE | KW_RANGE | KW_ANALYZE | KW_BEFORE | KW_BETWEEN | KW_BOTH | KW_BINARY | KW_CROSS | KW_CONTINUE | KW_CURSOR | KW_TRIGGER | KW_RECORDREADER | KW_RECORDWRITER | KW_SEMI | KW_LATERAL | KW_TOUCH | KW_ARCHIVE | KW_UNARCHIVE | KW_COMPUTE | KW_STATISTICS | KW_USE | KW_OPTION | KW_CONCATENATE | KW_SHOW_DATABASE | KW_UPDATE | KW_RESTRICT | KW_CASCADE | KW_SKEWED | KW_ROLLUP | KW_CUBE | KW_DIRECTORIES | KW_FOR | KW_WINDOW | KW_UNBOUNDED | KW_PRECEDING | KW_FOLLOWING | KW_CURRENT | KW_LESS | KW_MORE | KW_OVER | KW_GROUPING | KW_SETS | KW_TRUNCATE | KW_NOSCAN | KW_PARTIALSCAN | KW_USER | KW_ROLE | KW_ROLES | KW_INNER | KW_EXCHANGE | KW_ADMIN | KW_OWNER | KW_PRINCIPALS | KW_COMPACT | KW_COMPACTIONS | KW_TRANSACTIONS | DOT | COLON | COMMA | SEMICOLON | LPAREN | RPAREN | LSQUARE | RSQUARE | LCURLY | RCURLY | EQUAL | EQUAL_NS | NOTEQUAL | LESSTHANOREQUALTO | LESSTHAN | GREATERTHANOREQUALTO | GREATERTHAN | DIVIDE | PLUS | MINUS | STAR | MOD | DIV | AMPERSAND | TILDE | BITWISEOR | BITWISEXOR | QUESTION | DOLLAR | StringLiteral | CharSetLiteral | BigintLiteral | SmallintLiteral | TinyintLiteral | DecimalLiteral | ByteLengthLiteral | Number | Identifier | CharSetName | WS | COMMENT )
        int alt25=295;
        alt25 = dfa25.predict(input);
        switch (alt25) {
            case 1 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:10: KW_TRUE
                {
                mKW_TRUE(); 


                }
                break;
            case 2 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:18: KW_FALSE
                {
                mKW_FALSE(); 


                }
                break;
            case 3 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:27: KW_ALL
                {
                mKW_ALL(); 


                }
                break;
            case 4 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:34: KW_NONE
                {
                mKW_NONE(); 


                }
                break;
            case 5 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:42: KW_DEFAULT
                {
                mKW_DEFAULT(); 


                }
                break;
            case 6 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:53: KW_AND
                {
                mKW_AND(); 


                }
                break;
            case 7 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:60: KW_OR
                {
                mKW_OR(); 


                }
                break;
            case 8 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:66: KW_NOT
                {
                mKW_NOT(); 


                }
                break;
            case 9 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:73: KW_LIKE
                {
                mKW_LIKE(); 


                }
                break;
            case 10 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:81: KW_IF
                {
                mKW_IF(); 


                }
                break;
            case 11 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:87: KW_EXISTS
                {
                mKW_EXISTS(); 


                }
                break;
            case 12 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:97: KW_ASC
                {
                mKW_ASC(); 


                }
                break;
            case 13 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:104: KW_DESC
                {
                mKW_DESC(); 


                }
                break;
            case 14 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:112: KW_ORDER
                {
                mKW_ORDER(); 


                }
                break;
            case 15 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:121: KW_GROUP
                {
                mKW_GROUP(); 


                }
                break;
            case 16 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:130: KW_BY
                {
                mKW_BY(); 


                }
                break;
            case 17 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:136: KW_HAVING
                {
                mKW_HAVING(); 


                }
                break;
            case 18 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:146: KW_WHERE
                {
                mKW_WHERE(); 


                }
                break;
            case 19 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:155: KW_FROM
                {
                mKW_FROM(); 


                }
                break;
            case 20 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:163: KW_AS
                {
                mKW_AS(); 


                }
                break;
            case 21 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:169: KW_SELECT
                {
                mKW_SELECT(); 


                }
                break;
            case 22 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:179: KW_DISTINCT
                {
                mKW_DISTINCT(); 


                }
                break;
            case 23 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:191: KW_INSERT
                {
                mKW_INSERT(); 


                }
                break;
            case 24 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:201: KW_OVERWRITE
                {
                mKW_OVERWRITE(); 


                }
                break;
            case 25 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:214: KW_OUTER
                {
                mKW_OUTER(); 


                }
                break;
            case 26 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:223: KW_UNIQUEJOIN
                {
                mKW_UNIQUEJOIN(); 


                }
                break;
            case 27 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:237: KW_PRESERVE
                {
                mKW_PRESERVE(); 


                }
                break;
            case 28 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:249: KW_JOIN
                {
                mKW_JOIN(); 


                }
                break;
            case 29 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:257: KW_LEFT
                {
                mKW_LEFT(); 


                }
                break;
            case 30 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:265: KW_RIGHT
                {
                mKW_RIGHT(); 


                }
                break;
            case 31 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:274: KW_FULL
                {
                mKW_FULL(); 


                }
                break;
            case 32 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:282: KW_ON
                {
                mKW_ON(); 


                }
                break;
            case 33 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:288: KW_PARTITION
                {
                mKW_PARTITION(); 


                }
                break;
            case 34 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:301: KW_PARTITIONS
                {
                mKW_PARTITIONS(); 


                }
                break;
            case 35 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:315: KW_TABLE
                {
                mKW_TABLE(); 


                }
                break;
            case 36 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:324: KW_TABLES
                {
                mKW_TABLES(); 


                }
                break;
            case 37 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:334: KW_COLUMNS
                {
                mKW_COLUMNS(); 


                }
                break;
            case 38 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:345: KW_INDEX
                {
                mKW_INDEX(); 


                }
                break;
            case 39 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:354: KW_INDEXES
                {
                mKW_INDEXES(); 


                }
                break;
            case 40 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:365: KW_REBUILD
                {
                mKW_REBUILD(); 


                }
                break;
            case 41 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:376: KW_FUNCTIONS
                {
                mKW_FUNCTIONS(); 


                }
                break;
            case 42 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:389: KW_SHOW
                {
                mKW_SHOW(); 


                }
                break;
            case 43 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:397: KW_MSCK
                {
                mKW_MSCK(); 


                }
                break;
            case 44 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:405: KW_REPAIR
                {
                mKW_REPAIR(); 


                }
                break;
            case 45 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:415: KW_DIRECTORY
                {
                mKW_DIRECTORY(); 


                }
                break;
            case 46 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:428: KW_LOCAL
                {
                mKW_LOCAL(); 


                }
                break;
            case 47 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:437: KW_TRANSFORM
                {
                mKW_TRANSFORM(); 


                }
                break;
            case 48 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:450: KW_USING
                {
                mKW_USING(); 


                }
                break;
            case 49 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:459: KW_CLUSTER
                {
                mKW_CLUSTER(); 


                }
                break;
            case 50 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:470: KW_DISTRIBUTE
                {
                mKW_DISTRIBUTE(); 


                }
                break;
            case 51 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:484: KW_SORT
                {
                mKW_SORT(); 


                }
                break;
            case 52 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:492: KW_UNION
                {
                mKW_UNION(); 


                }
                break;
            case 53 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:501: KW_LOAD
                {
                mKW_LOAD(); 


                }
                break;
            case 54 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:509: KW_EXPORT
                {
                mKW_EXPORT(); 


                }
                break;
            case 55 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:519: KW_IMPORT
                {
                mKW_IMPORT(); 


                }
                break;
            case 56 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:529: KW_DATA
                {
                mKW_DATA(); 


                }
                break;
            case 57 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:537: KW_INPATH
                {
                mKW_INPATH(); 


                }
                break;
            case 58 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:547: KW_IS
                {
                mKW_IS(); 


                }
                break;
            case 59 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:553: KW_NULL
                {
                mKW_NULL(); 


                }
                break;
            case 60 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:561: KW_CREATE
                {
                mKW_CREATE(); 


                }
                break;
            case 61 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:571: KW_EXTERNAL
                {
                mKW_EXTERNAL(); 


                }
                break;
            case 62 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:583: KW_ALTER
                {
                mKW_ALTER(); 


                }
                break;
            case 63 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:592: KW_CHANGE
                {
                mKW_CHANGE(); 


                }
                break;
            case 64 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:602: KW_COLUMN
                {
                mKW_COLUMN(); 


                }
                break;
            case 65 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:612: KW_FIRST
                {
                mKW_FIRST(); 


                }
                break;
            case 66 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:621: KW_AFTER
                {
                mKW_AFTER(); 


                }
                break;
            case 67 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:630: KW_DESCRIBE
                {
                mKW_DESCRIBE(); 


                }
                break;
            case 68 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:642: KW_DROP
                {
                mKW_DROP(); 


                }
                break;
            case 69 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:650: KW_RENAME
                {
                mKW_RENAME(); 


                }
                break;
            case 70 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:660: KW_IGNORE
                {
                mKW_IGNORE(); 


                }
                break;
            case 71 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:670: KW_PROTECTION
                {
                mKW_PROTECTION(); 


                }
                break;
            case 72 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:684: KW_TO
                {
                mKW_TO(); 


                }
                break;
            case 73 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:690: KW_COMMENT
                {
                mKW_COMMENT(); 


                }
                break;
            case 74 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:701: KW_BOOLEAN
                {
                mKW_BOOLEAN(); 


                }
                break;
            case 75 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:712: KW_TINYINT
                {
                mKW_TINYINT(); 


                }
                break;
            case 76 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:723: KW_SMALLINT
                {
                mKW_SMALLINT(); 


                }
                break;
            case 77 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:735: KW_INT
                {
                mKW_INT(); 


                }
                break;
            case 78 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:742: KW_BIGINT
                {
                mKW_BIGINT(); 


                }
                break;
            case 79 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:752: KW_FLOAT
                {
                mKW_FLOAT(); 


                }
                break;
            case 80 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:761: KW_DOUBLE
                {
                mKW_DOUBLE(); 


                }
                break;
            case 81 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:771: KW_DATE
                {
                mKW_DATE(); 


                }
                break;
            case 82 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:779: KW_DATETIME
                {
                mKW_DATETIME(); 


                }
                break;
            case 83 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:791: KW_TIMESTAMP
                {
                mKW_TIMESTAMP(); 


                }
                break;
            case 84 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:804: KW_DECIMAL
                {
                mKW_DECIMAL(); 


                }
                break;
            case 85 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:815: KW_STRING
                {
                mKW_STRING(); 


                }
                break;
            case 86 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:825: KW_CHAR
                {
                mKW_CHAR(); 


                }
                break;
            case 87 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:833: KW_VARCHAR
                {
                mKW_VARCHAR(); 


                }
                break;
            case 88 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:844: KW_ARRAY
                {
                mKW_ARRAY(); 


                }
                break;
            case 89 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:853: KW_STRUCT
                {
                mKW_STRUCT(); 


                }
                break;
            case 90 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:863: KW_MAP
                {
                mKW_MAP(); 


                }
                break;
            case 91 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:870: KW_UNIONTYPE
                {
                mKW_UNIONTYPE(); 


                }
                break;
            case 92 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:883: KW_REDUCE
                {
                mKW_REDUCE(); 


                }
                break;
            case 93 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:893: KW_PARTITIONED
                {
                mKW_PARTITIONED(); 


                }
                break;
            case 94 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:908: KW_CLUSTERED
                {
                mKW_CLUSTERED(); 


                }
                break;
            case 95 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:921: KW_SORTED
                {
                mKW_SORTED(); 


                }
                break;
            case 96 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:931: KW_INTO
                {
                mKW_INTO(); 


                }
                break;
            case 97 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:939: KW_BUCKETS
                {
                mKW_BUCKETS(); 


                }
                break;
            case 98 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:950: KW_ROW
                {
                mKW_ROW(); 


                }
                break;
            case 99 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:957: KW_ROWS
                {
                mKW_ROWS(); 


                }
                break;
            case 100 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:965: KW_FORMAT
                {
                mKW_FORMAT(); 


                }
                break;
            case 101 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:975: KW_DELIMITED
                {
                mKW_DELIMITED(); 


                }
                break;
            case 102 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:988: KW_FIELDS
                {
                mKW_FIELDS(); 


                }
                break;
            case 103 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:998: KW_TERMINATED
                {
                mKW_TERMINATED(); 


                }
                break;
            case 104 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1012: KW_ESCAPED
                {
                mKW_ESCAPED(); 


                }
                break;
            case 105 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1023: KW_COLLECTION
                {
                mKW_COLLECTION(); 


                }
                break;
            case 106 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1037: KW_ITEMS
                {
                mKW_ITEMS(); 


                }
                break;
            case 107 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1046: KW_KEYS
                {
                mKW_KEYS(); 


                }
                break;
            case 108 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1054: KW_KEY_TYPE
                {
                mKW_KEY_TYPE(); 


                }
                break;
            case 109 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1066: KW_LINES
                {
                mKW_LINES(); 


                }
                break;
            case 110 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1075: KW_STORED
                {
                mKW_STORED(); 


                }
                break;
            case 111 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1085: KW_FILEFORMAT
                {
                mKW_FILEFORMAT(); 


                }
                break;
            case 112 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1099: KW_SEQUENCEFILE
                {
                mKW_SEQUENCEFILE(); 


                }
                break;
            case 113 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1115: KW_TEXTFILE
                {
                mKW_TEXTFILE(); 


                }
                break;
            case 114 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1127: KW_RCFILE
                {
                mKW_RCFILE(); 


                }
                break;
            case 115 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1137: KW_ORCFILE
                {
                mKW_ORCFILE(); 


                }
                break;
            case 116 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1148: KW_PARQUETFILE
                {
                mKW_PARQUETFILE(); 


                }
                break;
            case 117 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1163: KW_INPUTFORMAT
                {
                mKW_INPUTFORMAT(); 


                }
                break;
            case 118 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1178: KW_OUTPUTFORMAT
                {
                mKW_OUTPUTFORMAT(); 


                }
                break;
            case 119 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1194: KW_INPUTDRIVER
                {
                mKW_INPUTDRIVER(); 


                }
                break;
            case 120 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1209: KW_OUTPUTDRIVER
                {
                mKW_OUTPUTDRIVER(); 


                }
                break;
            case 121 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1225: KW_OFFLINE
                {
                mKW_OFFLINE(); 


                }
                break;
            case 122 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1236: KW_ENABLE
                {
                mKW_ENABLE(); 


                }
                break;
            case 123 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1246: KW_DISABLE
                {
                mKW_DISABLE(); 


                }
                break;
            case 124 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1257: KW_READONLY
                {
                mKW_READONLY(); 


                }
                break;
            case 125 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1269: KW_NO_DROP
                {
                mKW_NO_DROP(); 


                }
                break;
            case 126 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1280: KW_LOCATION
                {
                mKW_LOCATION(); 


                }
                break;
            case 127 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1292: KW_TABLESAMPLE
                {
                mKW_TABLESAMPLE(); 


                }
                break;
            case 128 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1307: KW_BUCKET
                {
                mKW_BUCKET(); 


                }
                break;
            case 129 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1317: KW_OUT
                {
                mKW_OUT(); 


                }
                break;
            case 130 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1324: KW_OF
                {
                mKW_OF(); 


                }
                break;
            case 131 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1330: KW_PERCENT
                {
                mKW_PERCENT(); 


                }
                break;
            case 132 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1341: KW_CAST
                {
                mKW_CAST(); 


                }
                break;
            case 133 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1349: KW_ADD
                {
                mKW_ADD(); 


                }
                break;
            case 134 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1356: KW_REPLACE
                {
                mKW_REPLACE(); 


                }
                break;
            case 135 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1367: KW_RLIKE
                {
                mKW_RLIKE(); 


                }
                break;
            case 136 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1376: KW_REGEXP
                {
                mKW_REGEXP(); 


                }
                break;
            case 137 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1386: KW_TEMPORARY
                {
                mKW_TEMPORARY(); 


                }
                break;
            case 138 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1399: KW_FUNCTION
                {
                mKW_FUNCTION(); 


                }
                break;
            case 139 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1411: KW_MACRO
                {
                mKW_MACRO(); 


                }
                break;
            case 140 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1420: KW_FILE
                {
                mKW_FILE(); 


                }
                break;
            case 141 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1428: KW_JAR
                {
                mKW_JAR(); 


                }
                break;
            case 142 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1435: KW_EXPLAIN
                {
                mKW_EXPLAIN(); 


                }
                break;
            case 143 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1446: KW_EXTENDED
                {
                mKW_EXTENDED(); 


                }
                break;
            case 144 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1458: KW_FORMATTED
                {
                mKW_FORMATTED(); 


                }
                break;
            case 145 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1471: KW_PRETTY
                {
                mKW_PRETTY(); 


                }
                break;
            case 146 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1481: KW_DEPENDENCY
                {
                mKW_DEPENDENCY(); 


                }
                break;
            case 147 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1495: KW_LOGICAL
                {
                mKW_LOGICAL(); 


                }
                break;
            case 148 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1506: KW_SERDE
                {
                mKW_SERDE(); 


                }
                break;
            case 149 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1515: KW_WITH
                {
                mKW_WITH(); 


                }
                break;
            case 150 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1523: KW_DEFERRED
                {
                mKW_DEFERRED(); 


                }
                break;
            case 151 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1535: KW_SERDEPROPERTIES
                {
                mKW_SERDEPROPERTIES(); 


                }
                break;
            case 152 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1554: KW_DBPROPERTIES
                {
                mKW_DBPROPERTIES(); 


                }
                break;
            case 153 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1570: KW_LIMIT
                {
                mKW_LIMIT(); 


                }
                break;
            case 154 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1579: KW_SET
                {
                mKW_SET(); 


                }
                break;
            case 155 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1586: KW_UNSET
                {
                mKW_UNSET(); 


                }
                break;
            case 156 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1595: KW_TBLPROPERTIES
                {
                mKW_TBLPROPERTIES(); 


                }
                break;
            case 157 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1612: KW_IDXPROPERTIES
                {
                mKW_IDXPROPERTIES(); 


                }
                break;
            case 158 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1629: KW_VALUE_TYPE
                {
                mKW_VALUE_TYPE(); 


                }
                break;
            case 159 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1643: KW_ELEM_TYPE
                {
                mKW_ELEM_TYPE(); 


                }
                break;
            case 160 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1656: KW_DEFINED
                {
                mKW_DEFINED(); 


                }
                break;
            case 161 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1667: KW_CASE
                {
                mKW_CASE(); 


                }
                break;
            case 162 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1675: KW_WHEN
                {
                mKW_WHEN(); 


                }
                break;
            case 163 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1683: KW_THEN
                {
                mKW_THEN(); 


                }
                break;
            case 164 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1691: KW_ELSE
                {
                mKW_ELSE(); 


                }
                break;
            case 165 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1699: KW_END
                {
                mKW_END(); 


                }
                break;
            case 166 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1706: KW_MAPJOIN
                {
                mKW_MAPJOIN(); 


                }
                break;
            case 167 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1717: KW_STREAMTABLE
                {
                mKW_STREAMTABLE(); 


                }
                break;
            case 168 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1732: KW_HOLD_DDLTIME
                {
                mKW_HOLD_DDLTIME(); 


                }
                break;
            case 169 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1748: KW_CLUSTERSTATUS
                {
                mKW_CLUSTERSTATUS(); 


                }
                break;
            case 170 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1765: KW_UTC
                {
                mKW_UTC(); 


                }
                break;
            case 171 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1772: KW_UTCTIMESTAMP
                {
                mKW_UTCTIMESTAMP(); 


                }
                break;
            case 172 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1788: KW_LONG
                {
                mKW_LONG(); 


                }
                break;
            case 173 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1796: KW_DELETE
                {
                mKW_DELETE(); 


                }
                break;
            case 174 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1806: KW_PLUS
                {
                mKW_PLUS(); 


                }
                break;
            case 175 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1814: KW_MINUS
                {
                mKW_MINUS(); 


                }
                break;
            case 176 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1823: KW_FETCH
                {
                mKW_FETCH(); 


                }
                break;
            case 177 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1832: KW_INTERSECT
                {
                mKW_INTERSECT(); 


                }
                break;
            case 178 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1845: KW_VIEW
                {
                mKW_VIEW(); 


                }
                break;
            case 179 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1853: KW_IN
                {
                mKW_IN(); 


                }
                break;
            case 180 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1859: KW_DATABASE
                {
                mKW_DATABASE(); 


                }
                break;
            case 181 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1871: KW_DATABASES
                {
                mKW_DATABASES(); 


                }
                break;
            case 182 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1884: KW_MATERIALIZED
                {
                mKW_MATERIALIZED(); 


                }
                break;
            case 183 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1900: KW_SCHEMA
                {
                mKW_SCHEMA(); 


                }
                break;
            case 184 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1910: KW_SCHEMAS
                {
                mKW_SCHEMAS(); 


                }
                break;
            case 185 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1921: KW_GRANT
                {
                mKW_GRANT(); 


                }
                break;
            case 186 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1930: KW_REVOKE
                {
                mKW_REVOKE(); 


                }
                break;
            case 187 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1940: KW_SSL
                {
                mKW_SSL(); 


                }
                break;
            case 188 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1947: KW_UNDO
                {
                mKW_UNDO(); 


                }
                break;
            case 189 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1955: KW_LOCK
                {
                mKW_LOCK(); 


                }
                break;
            case 190 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1963: KW_LOCKS
                {
                mKW_LOCKS(); 


                }
                break;
            case 191 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1972: KW_UNLOCK
                {
                mKW_UNLOCK(); 


                }
                break;
            case 192 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1982: KW_SHARED
                {
                mKW_SHARED(); 


                }
                break;
            case 193 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1992: KW_EXCLUSIVE
                {
                mKW_EXCLUSIVE(); 


                }
                break;
            case 194 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2005: KW_PROCEDURE
                {
                mKW_PROCEDURE(); 


                }
                break;
            case 195 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2018: KW_UNSIGNED
                {
                mKW_UNSIGNED(); 


                }
                break;
            case 196 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2030: KW_WHILE
                {
                mKW_WHILE(); 


                }
                break;
            case 197 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2039: KW_READ
                {
                mKW_READ(); 


                }
                break;
            case 198 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2047: KW_READS
                {
                mKW_READS(); 


                }
                break;
            case 199 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2056: KW_PURGE
                {
                mKW_PURGE(); 


                }
                break;
            case 200 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2065: KW_RANGE
                {
                mKW_RANGE(); 


                }
                break;
            case 201 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2074: KW_ANALYZE
                {
                mKW_ANALYZE(); 


                }
                break;
            case 202 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2085: KW_BEFORE
                {
                mKW_BEFORE(); 


                }
                break;
            case 203 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2095: KW_BETWEEN
                {
                mKW_BETWEEN(); 


                }
                break;
            case 204 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2106: KW_BOTH
                {
                mKW_BOTH(); 


                }
                break;
            case 205 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2114: KW_BINARY
                {
                mKW_BINARY(); 


                }
                break;
            case 206 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2124: KW_CROSS
                {
                mKW_CROSS(); 


                }
                break;
            case 207 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2133: KW_CONTINUE
                {
                mKW_CONTINUE(); 


                }
                break;
            case 208 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2145: KW_CURSOR
                {
                mKW_CURSOR(); 


                }
                break;
            case 209 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2155: KW_TRIGGER
                {
                mKW_TRIGGER(); 


                }
                break;
            case 210 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2166: KW_RECORDREADER
                {
                mKW_RECORDREADER(); 


                }
                break;
            case 211 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2182: KW_RECORDWRITER
                {
                mKW_RECORDWRITER(); 


                }
                break;
            case 212 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2198: KW_SEMI
                {
                mKW_SEMI(); 


                }
                break;
            case 213 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2206: KW_LATERAL
                {
                mKW_LATERAL(); 


                }
                break;
            case 214 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2217: KW_TOUCH
                {
                mKW_TOUCH(); 


                }
                break;
            case 215 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2226: KW_ARCHIVE
                {
                mKW_ARCHIVE(); 


                }
                break;
            case 216 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2237: KW_UNARCHIVE
                {
                mKW_UNARCHIVE(); 


                }
                break;
            case 217 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2250: KW_COMPUTE
                {
                mKW_COMPUTE(); 


                }
                break;
            case 218 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2261: KW_STATISTICS
                {
                mKW_STATISTICS(); 


                }
                break;
            case 219 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2275: KW_USE
                {
                mKW_USE(); 


                }
                break;
            case 220 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2282: KW_OPTION
                {
                mKW_OPTION(); 


                }
                break;
            case 221 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2292: KW_CONCATENATE
                {
                mKW_CONCATENATE(); 


                }
                break;
            case 222 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2307: KW_SHOW_DATABASE
                {
                mKW_SHOW_DATABASE(); 


                }
                break;
            case 223 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2324: KW_UPDATE
                {
                mKW_UPDATE(); 


                }
                break;
            case 224 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2334: KW_RESTRICT
                {
                mKW_RESTRICT(); 


                }
                break;
            case 225 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2346: KW_CASCADE
                {
                mKW_CASCADE(); 


                }
                break;
            case 226 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2357: KW_SKEWED
                {
                mKW_SKEWED(); 


                }
                break;
            case 227 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2367: KW_ROLLUP
                {
                mKW_ROLLUP(); 


                }
                break;
            case 228 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2377: KW_CUBE
                {
                mKW_CUBE(); 


                }
                break;
            case 229 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2385: KW_DIRECTORIES
                {
                mKW_DIRECTORIES(); 


                }
                break;
            case 230 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2400: KW_FOR
                {
                mKW_FOR(); 


                }
                break;
            case 231 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2407: KW_WINDOW
                {
                mKW_WINDOW(); 


                }
                break;
            case 232 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2417: KW_UNBOUNDED
                {
                mKW_UNBOUNDED(); 


                }
                break;
            case 233 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2430: KW_PRECEDING
                {
                mKW_PRECEDING(); 


                }
                break;
            case 234 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2443: KW_FOLLOWING
                {
                mKW_FOLLOWING(); 


                }
                break;
            case 235 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2456: KW_CURRENT
                {
                mKW_CURRENT(); 


                }
                break;
            case 236 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2467: KW_LESS
                {
                mKW_LESS(); 


                }
                break;
            case 237 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2475: KW_MORE
                {
                mKW_MORE(); 


                }
                break;
            case 238 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2483: KW_OVER
                {
                mKW_OVER(); 


                }
                break;
            case 239 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2491: KW_GROUPING
                {
                mKW_GROUPING(); 


                }
                break;
            case 240 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2503: KW_SETS
                {
                mKW_SETS(); 


                }
                break;
            case 241 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2511: KW_TRUNCATE
                {
                mKW_TRUNCATE(); 


                }
                break;
            case 242 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2523: KW_NOSCAN
                {
                mKW_NOSCAN(); 


                }
                break;
            case 243 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2533: KW_PARTIALSCAN
                {
                mKW_PARTIALSCAN(); 


                }
                break;
            case 244 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2548: KW_USER
                {
                mKW_USER(); 


                }
                break;
            case 245 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2556: KW_ROLE
                {
                mKW_ROLE(); 


                }
                break;
            case 246 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2564: KW_ROLES
                {
                mKW_ROLES(); 


                }
                break;
            case 247 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2573: KW_INNER
                {
                mKW_INNER(); 


                }
                break;
            case 248 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2582: KW_EXCHANGE
                {
                mKW_EXCHANGE(); 


                }
                break;
            case 249 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2594: KW_ADMIN
                {
                mKW_ADMIN(); 


                }
                break;
            case 250 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2603: KW_OWNER
                {
                mKW_OWNER(); 


                }
                break;
            case 251 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2612: KW_PRINCIPALS
                {
                mKW_PRINCIPALS(); 


                }
                break;
            case 252 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2626: KW_COMPACT
                {
                mKW_COMPACT(); 


                }
                break;
            case 253 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2637: KW_COMPACTIONS
                {
                mKW_COMPACTIONS(); 


                }
                break;
            case 254 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2652: KW_TRANSACTIONS
                {
                mKW_TRANSACTIONS(); 


                }
                break;
            case 255 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2668: DOT
                {
                mDOT(); 


                }
                break;
            case 256 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2672: COLON
                {
                mCOLON(); 


                }
                break;
            case 257 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2678: COMMA
                {
                mCOMMA(); 


                }
                break;
            case 258 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2684: SEMICOLON
                {
                mSEMICOLON(); 


                }
                break;
            case 259 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2694: LPAREN
                {
                mLPAREN(); 


                }
                break;
            case 260 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2701: RPAREN
                {
                mRPAREN(); 


                }
                break;
            case 261 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2708: LSQUARE
                {
                mLSQUARE(); 


                }
                break;
            case 262 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2716: RSQUARE
                {
                mRSQUARE(); 


                }
                break;
            case 263 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2724: LCURLY
                {
                mLCURLY(); 


                }
                break;
            case 264 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2731: RCURLY
                {
                mRCURLY(); 


                }
                break;
            case 265 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2738: EQUAL
                {
                mEQUAL(); 


                }
                break;
            case 266 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2744: EQUAL_NS
                {
                mEQUAL_NS(); 


                }
                break;
            case 267 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2753: NOTEQUAL
                {
                mNOTEQUAL(); 


                }
                break;
            case 268 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2762: LESSTHANOREQUALTO
                {
                mLESSTHANOREQUALTO(); 


                }
                break;
            case 269 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2780: LESSTHAN
                {
                mLESSTHAN(); 


                }
                break;
            case 270 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2789: GREATERTHANOREQUALTO
                {
                mGREATERTHANOREQUALTO(); 


                }
                break;
            case 271 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2810: GREATERTHAN
                {
                mGREATERTHAN(); 


                }
                break;
            case 272 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2822: DIVIDE
                {
                mDIVIDE(); 


                }
                break;
            case 273 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2829: PLUS
                {
                mPLUS(); 


                }
                break;
            case 274 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2834: MINUS
                {
                mMINUS(); 


                }
                break;
            case 275 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2840: STAR
                {
                mSTAR(); 


                }
                break;
            case 276 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2845: MOD
                {
                mMOD(); 


                }
                break;
            case 277 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2849: DIV
                {
                mDIV(); 


                }
                break;
            case 278 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2853: AMPERSAND
                {
                mAMPERSAND(); 


                }
                break;
            case 279 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2863: TILDE
                {
                mTILDE(); 


                }
                break;
            case 280 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2869: BITWISEOR
                {
                mBITWISEOR(); 


                }
                break;
            case 281 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2879: BITWISEXOR
                {
                mBITWISEXOR(); 


                }
                break;
            case 282 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2890: QUESTION
                {
                mQUESTION(); 


                }
                break;
            case 283 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2899: DOLLAR
                {
                mDOLLAR(); 


                }
                break;
            case 284 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2906: StringLiteral
                {
                mStringLiteral(); 


                }
                break;
            case 285 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2920: CharSetLiteral
                {
                mCharSetLiteral(); 


                }
                break;
            case 286 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2935: BigintLiteral
                {
                mBigintLiteral(); 


                }
                break;
            case 287 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2949: SmallintLiteral
                {
                mSmallintLiteral(); 


                }
                break;
            case 288 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2965: TinyintLiteral
                {
                mTinyintLiteral(); 


                }
                break;
            case 289 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2980: DecimalLiteral
                {
                mDecimalLiteral(); 


                }
                break;
            case 290 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2995: ByteLengthLiteral
                {
                mByteLengthLiteral(); 


                }
                break;
            case 291 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3013: Number
                {
                mNumber(); 


                }
                break;
            case 292 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3020: Identifier
                {
                mIdentifier(); 


                }
                break;
            case 293 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3031: CharSetName
                {
                mCharSetName(); 


                }
                break;
            case 294 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3043: WS
                {
                mWS(); 


                }
                break;
            case 295 :
                // org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3046: COMMENT
                {
                mCOMMENT(); 


                }
                break;

        }

    }


    protected DFA21 dfa21 = new DFA21(this);
    protected DFA25 dfa25 = new DFA25(this);
    static final String DFA21_eotS =
        "\7\uffff";
    static final String DFA21_eofS =
        "\7\uffff";
    static final String DFA21_minS =
        "\1\60\1\uffff\1\0\1\uffff\2\0\1\uffff";
    static final String DFA21_maxS =
        "\1\172\1\uffff\1\uffff\1\uffff\1\uffff\1\0\1\uffff";
    static final String DFA21_acceptS =
        "\1\uffff\1\1\1\uffff\1\2\2\uffff\1\3";
    static final String DFA21_specialS =
        "\2\uffff\1\1\1\uffff\1\0\1\2\1\uffff}>";
    static final String[] DFA21_transitionS = {
            "\12\1\7\uffff\32\1\5\uffff\1\2\32\1",
            "",
            "\44\3\1\4\3\3\4\4\1\3\2\4\1\3\12\4\5\3\1\4\1\3\33\4\1\3\3\4"+
            "\1\3\35\4\uff82\3",
            "",
            "\44\3\1\4\3\3\4\4\1\3\2\4\1\3\12\4\5\3\1\4\1\3\33\4\1\3\3\4"+
            "\1\5\35\4\uff82\3",
            "\1\uffff",
            ""
    };

    static final short[] DFA21_eot = DFA.unpackEncodedString(DFA21_eotS);
    static final short[] DFA21_eof = DFA.unpackEncodedString(DFA21_eofS);
    static final char[] DFA21_min = DFA.unpackEncodedStringToUnsignedChars(DFA21_minS);
    static final char[] DFA21_max = DFA.unpackEncodedStringToUnsignedChars(DFA21_maxS);
    static final short[] DFA21_accept = DFA.unpackEncodedString(DFA21_acceptS);
    static final short[] DFA21_special = DFA.unpackEncodedString(DFA21_specialS);
    static final short[][] DFA21_transition;

    static {
        int numStates = DFA21_transitionS.length;
        DFA21_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA21_transition[i] = DFA.unpackEncodedString(DFA21_transitionS[i]);
        }
    }

    class DFA21 extends DFA {

        public DFA21(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 21;
            this.eot = DFA21_eot;
            this.eof = DFA21_eof;
            this.min = DFA21_min;
            this.max = DFA21_max;
            this.accept = DFA21_accept;
            this.special = DFA21_special;
            this.transition = DFA21_transition;
        }
        public String getDescription() {
            return "430:1: Identifier : ( ( Letter | Digit ) ( Letter | Digit | '_' )* |{...}? QuotedIdentifier | '`' ( RegexComponent )+ '`' );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA21_4 = input.LA(1);

                        s = -1;
                        if ( (LA21_4=='`') ) {s = 5;}

                        else if ( (LA21_4=='$'||(LA21_4 >= '(' && LA21_4 <= '+')||(LA21_4 >= '-' && LA21_4 <= '.')||(LA21_4 >= '0' && LA21_4 <= '9')||LA21_4=='?'||(LA21_4 >= 'A' && LA21_4 <= '[')||(LA21_4 >= ']' && LA21_4 <= '_')||(LA21_4 >= 'a' && LA21_4 <= '}')) ) {s = 4;}

                        else if ( ((LA21_4 >= '\u0000' && LA21_4 <= '#')||(LA21_4 >= '%' && LA21_4 <= '\'')||LA21_4==','||LA21_4=='/'||(LA21_4 >= ':' && LA21_4 <= '>')||LA21_4=='@'||LA21_4=='\\'||(LA21_4 >= '~' && LA21_4 <= '\uFFFF')) ) {s = 3;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA21_2 = input.LA(1);

                        s = -1;
                        if ( ((LA21_2 >= '\u0000' && LA21_2 <= '#')||(LA21_2 >= '%' && LA21_2 <= '\'')||LA21_2==','||LA21_2=='/'||(LA21_2 >= ':' && LA21_2 <= '>')||LA21_2=='@'||LA21_2=='\\'||LA21_2=='`'||(LA21_2 >= '~' && LA21_2 <= '\uFFFF')) ) {s = 3;}

                        else if ( (LA21_2=='$'||(LA21_2 >= '(' && LA21_2 <= '+')||(LA21_2 >= '-' && LA21_2 <= '.')||(LA21_2 >= '0' && LA21_2 <= '9')||LA21_2=='?'||(LA21_2 >= 'A' && LA21_2 <= '[')||(LA21_2 >= ']' && LA21_2 <= '_')||(LA21_2 >= 'a' && LA21_2 <= '}')) ) {s = 4;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA21_5 = input.LA(1);

                         
                        int index21_5 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((allowQuotedId())) ) {s = 3;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index21_5);

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 21, _s, input);
            error(nvae);
            throw nvae;
        }

    }
    static final String DFA25_eotS =
        "\1\uffff\6\64\1\133\20\64\1\u009e\13\uffff\1\u00a0\1\u00a2\2\uffff"+
        "\1\u00a4\11\uffff\2\u00b2\3\uffff\2\64\1\u00ba\15\64\1\u00d2\13"+
        "\64\1\u00eb\2\64\1\u00ee\1\u00f0\2\64\2\uffff\4\64\1\u00fd\1\u0103"+
        "\1\64\1\u0105\10\64\1\u0113\56\64\4\uffff\1\u0166\7\uffff\1\u0168"+
        "\2\uffff\1\u0168\1\64\1\u016b\1\u00b2\1\u016c\1\u016d\1\u00b2\1"+
        "\64\1\uffff\2\u0174\5\64\1\uffff\17\64\1\u018b\2\64\1\u018e\1\64"+
        "\1\u0190\1\64\1\u0192\1\uffff\3\64\1\u0196\2\64\1\133\12\64\1\u01a7"+
        "\5\64\1\u01ae\1\uffff\1\64\1\u01b2\1\uffff\1\64\1\uffff\14\64\1"+
        "\uffff\3\64\1\u01c7\1\64\1\uffff\1\64\1\uffff\11\64\1\u01d5\3\64"+
        "\1\uffff\20\64\1\u01eb\11\64\1\u01f7\10\64\1\u0203\1\u0205\11\64"+
        "\1\u0213\12\64\1\u0220\17\64\1\u0239\7\64\5\uffff\1\u0241\3\uffff"+
        "\1\u00b2\3\uffff\1\u00b2\1\u0170\1\uffff\1\u0246\13\64\1\u0252\1"+
        "\64\1\u0254\1\u0255\3\64\1\u025a\2\64\1\uffff\2\64\1\uffff\1\64"+
        "\1\uffff\1\64\1\uffff\3\64\1\uffff\1\64\1\u0265\2\64\1\u0268\3\64"+
        "\1\u026d\7\64\1\uffff\1\u0277\1\u0279\1\u027a\3\64\1\uffff\1\u027f"+
        "\2\64\1\uffff\3\64\1\u0285\2\64\1\u0288\1\u0289\1\64\1\u028d\1\u028e"+
        "\1\64\1\u0290\5\64\1\u0296\1\64\1\uffff\15\64\1\uffff\1\u02a6\3"+
        "\64\1\u02aa\10\64\1\u02b3\1\64\1\u02b5\4\64\1\u02ba\1\uffff\1\u02bb"+
        "\1\u02bd\1\64\1\u02c0\7\64\1\uffff\5\64\1\u02cd\4\64\1\u02d2\1\uffff"+
        "\1\64\1\uffff\12\64\1\u02de\1\64\1\u02e0\1\uffff\6\64\1\u02e9\4"+
        "\64\1\u02ee\1\uffff\1\64\1\u02f1\15\64\1\u0300\1\u0301\1\u0302\3"+
        "\64\1\u0306\1\u0307\1\64\1\uffff\3\64\1\u030c\1\64\1\u030e\1\u030f"+
        "\2\uffff\2\u00b2\1\64\1\uffff\3\64\1\u0315\1\u0316\6\64\1\uffff"+
        "\1\u031d\2\uffff\1\64\1\u031f\2\64\1\uffff\1\u0322\2\64\1\u0325"+
        "\1\u0326\1\64\1\u0328\1\u0329\1\64\1\u032b\1\uffff\2\64\1\uffff"+
        "\4\64\1\uffff\11\64\1\uffff\1\64\2\uffff\2\64\1\u033e\1\64\1\uffff"+
        "\1\u0340\3\64\1\u0344\1\uffff\1\u0345\1\u0346\2\uffff\1\u0347\1"+
        "\64\1\u0349\2\uffff\1\64\1\uffff\2\64\1\u034e\2\64\1\uffff\1\64"+
        "\1\u0353\2\64\1\u0356\12\64\1\uffff\1\u0362\1\u0363\1\64\1\uffff"+
        "\7\64\1\u036c\1\uffff\1\u036d\1\uffff\3\64\1\u0372\2\uffff\1\64"+
        "\1\uffff\2\64\1\uffff\11\64\1\u0380\1\u0381\1\64\1\uffff\3\64\1"+
        "\u0386\1\uffff\13\64\1\uffff\1\u0393\1\uffff\1\u0394\6\64\1\u039b"+
        "\1\uffff\4\64\1\uffff\1\64\1\u03a1\1\uffff\1\64\1\u03a3\1\u03a4"+
        "\11\64\1\u03ae\1\64\3\uffff\3\64\2\uffff\1\64\1\u03b4\1\64\1\u03b6"+
        "\1\uffff\1\64\2\uffff\4\64\1\u03bd\2\uffff\6\64\1\uffff\1\64\1\uffff"+
        "\1\u03c5\1\64\1\uffff\1\u03c8\1\64\2\uffff\1\64\2\uffff\1\64\1\uffff"+
        "\1\64\1\u03cd\6\64\1\u03d4\7\64\1\u03dc\1\64\1\uffff\1\64\1\uffff"+
        "\2\64\1\u03e2\4\uffff\1\64\1\uffff\2\64\1\u03e6\1\64\1\uffff\1\u03e8"+
        "\3\64\1\uffff\1\u03ec\1\u03ed\1\uffff\1\64\1\u03ef\1\u03f0\6\64"+
        "\1\u03f7\1\64\2\uffff\1\64\1\u03fa\1\u03fb\1\u03fd\1\u03fe\1\64"+
        "\1\u0400\1\64\2\uffff\1\u0402\1\u0403\2\64\1\uffff\1\64\1\u0407"+
        "\1\u0408\1\64\1\u040a\1\u040b\1\64\1\u040d\1\64\1\u0410\1\u0411"+
        "\2\64\2\uffff\1\64\1\u0415\2\64\1\uffff\1\64\1\u0419\1\64\1\u041b"+
        "\10\64\2\uffff\1\64\1\u0425\1\64\1\u0427\1\u0428\1\64\1\uffff\1"+
        "\u042a\1\u042b\2\64\1\u042f\1\uffff\1\u0430\2\uffff\1\u0432\7\64"+
        "\1\u043a\1\uffff\1\u043b\1\64\1\u043d\2\64\1\uffff\1\64\1\uffff"+
        "\4\64\1\u0445\1\64\1\uffff\1\u0447\6\64\1\uffff\2\64\1\uffff\1\64"+
        "\1\u0451\1\u0452\1\u0453\1\uffff\1\u0454\1\64\1\u0456\1\64\1\u0458"+
        "\1\64\1\uffff\3\64\1\u045d\3\64\1\uffff\4\64\1\u0465\1\uffff\1\64"+
        "\1\u0467\1\u0468\1\uffff\1\u0469\1\uffff\3\64\2\uffff\1\64\2\uffff"+
        "\1\u046e\4\64\1\u0473\1\uffff\1\64\1\u0475\2\uffff\1\u0476\2\uffff"+
        "\1\u0477\1\uffff\1\64\2\uffff\3\64\2\uffff\1\64\2\uffff\1\64\1\uffff"+
        "\1\64\1\u047f\2\uffff\3\64\1\uffff\3\64\1\uffff\1\64\1\uffff\6\64"+
        "\1\u048d\1\u048e\1\u048f\1\uffff\1\u0490\2\uffff\1\64\2\uffff\3"+
        "\64\2\uffff\1\u0495\1\uffff\1\64\1\u0497\1\u0498\1\u049a\2\64\1"+
        "\u049f\2\uffff\1\u04a0\1\uffff\1\u04a1\1\u04a2\1\64\1\u04a4\1\u04a5"+
        "\2\64\1\uffff\1\64\1\uffff\2\64\1\u04ab\2\64\1\u04af\3\64\4\uffff"+
        "\1\u04b3\1\uffff\1\u04b4\1\uffff\2\64\1\u04b7\1\64\1\uffff\1\64"+
        "\1\u04bc\1\u04bd\4\64\1\uffff\1\u04c2\3\uffff\4\64\1\uffff\1\u04c7"+
        "\1\u04c8\1\64\1\u04ca\1\uffff\1\u04cb\3\uffff\4\64\1\u04d0\2\64"+
        "\1\uffff\2\64\1\u04d5\3\64\1\u04d9\6\64\4\uffff\1\u04e0\2\64\1\u04e3"+
        "\1\uffff\1\64\2\uffff\1\64\1\uffff\1\u04e6\3\64\4\uffff\1\64\2\uffff"+
        "\1\u04eb\2\64\1\u04ee\1\64\1\uffff\1\u04f0\1\64\1\u04f2\1\uffff"+
        "\1\64\1\u04f4\1\u04f5\2\uffff\1\u04f6\1\64\1\uffff\1\64\1\u04f9"+
        "\1\64\1\u04fb\2\uffff\1\64\1\u04fd\2\64\1\uffff\2\64\1\u0502\1\64"+
        "\2\uffff\1\u0504\2\uffff\4\64\1\uffff\3\64\1\u050c\1\uffff\1\u050d"+
        "\1\u050e\1\64\1\uffff\1\u0510\1\64\1\u0512\1\64\1\u0516\1\64\1\uffff"+
        "\2\64\1\uffff\2\64\1\uffff\1\64\1\u051d\2\64\1\uffff\2\64\1\uffff"+
        "\1\u0522\1\uffff\1\64\1\uffff\1\u0524\3\uffff\1\u0525\1\u0526\1"+
        "\uffff\1\64\1\uffff\1\64\1\uffff\4\64\1\uffff\1\64\1\uffff\5\64"+
        "\1\u0533\1\u0534\3\uffff\1\64\1\uffff\1\u0536\1\uffff\1\u0537\1"+
        "\u0538\1\64\1\uffff\3\64\1\u053d\2\64\1\uffff\3\64\1\u0543\1\uffff"+
        "\1\64\3\uffff\1\u0545\3\64\1\u0549\1\u054a\5\64\1\u0550\2\uffff"+
        "\1\64\3\uffff\1\u0552\1\u0553\2\64\1\uffff\1\u0556\1\u0557\2\64"+
        "\1\u055a\1\uffff\1\64\1\uffff\1\u055c\1\u055d\1\u055e\2\uffff\1"+
        "\64\1\u0560\1\u0561\2\64\1\uffff\1\u0564\2\uffff\1\u0565\1\u0566"+
        "\2\uffff\1\64\1\u0568\1\uffff\1\u0569\3\uffff\1\u056a\2\uffff\1"+
        "\64\1\u056c\3\uffff\1\u056d\3\uffff\1\64\2\uffff\1\u056f\1\uffff";
    static final String DFA25_eofS =
        "\u0570\uffff";
    static final String DFA25_minS =
        "\1\11\2\101\1\104\1\117\1\101\1\106\1\75\1\101\1\104\1\114\1\122"+
        "\1\105\1\101\1\110\1\103\1\116\6\101\2\105\13\uffff\2\75\2\uffff"+
        "\1\55\7\uffff\2\0\2\56\3\uffff\1\101\1\102\1\60\2\115\1\114\1\105"+
        "\1\114\1\117\1\114\1\105\1\117\1\114\1\124\1\114\1\101\1\60\1\124"+
        "\1\103\1\104\1\116\1\114\1\103\1\122\1\124\1\117\1\125\1\120\1\60"+
        "\1\105\1\124\2\60\1\124\1\116\2\uffff\1\113\1\106\1\101\1\124\2"+
        "\60\1\120\1\60\1\116\1\105\1\130\2\103\1\101\1\123\1\101\1\60\1"+
        "\117\1\107\1\103\1\106\1\126\1\114\1\105\1\116\1\114\1\101\1\122"+
        "\2\101\1\110\1\114\1\105\1\101\1\105\1\103\1\104\1\105\2\122\1\125"+
        "\1\122\1\111\1\122\1\107\1\101\1\114\1\106\1\111\1\116\1\114\1\125"+
        "\1\105\1\101\1\123\1\102\2\103\1\116\2\122\1\105\1\131\4\uffff\1"+
        "\76\5\uffff\2\0\1\42\2\0\1\42\2\60\1\56\3\60\1\53\1\uffff\2\60\1"+
        "\105\1\116\1\107\1\114\1\103\1\uffff\1\131\1\105\1\115\1\124\2\120"+
        "\1\116\1\123\1\115\1\114\1\103\1\123\1\114\1\105\1\101\1\60\1\114"+
        "\1\103\1\60\1\105\1\60\1\114\1\60\1\uffff\1\105\1\101\1\110\1\60"+
        "\1\111\1\105\1\60\1\104\1\103\1\114\1\101\1\103\1\111\2\105\1\101"+
        "\1\105\1\60\1\101\1\120\1\102\1\122\1\105\1\60\1\uffff\1\122\1\60"+
        "\1\uffff\1\114\1\uffff\1\111\3\105\1\111\1\124\1\123\1\101\1\104"+
        "\1\111\1\107\1\105\1\uffff\2\105\1\101\1\60\1\105\1\uffff\1\117"+
        "\1\uffff\1\117\1\115\1\120\1\123\1\114\1\105\1\110\1\101\1\102\1"+
        "\60\1\105\1\125\1\116\1\uffff\1\114\1\110\1\111\1\101\1\113\1\117"+
        "\1\127\1\111\1\104\1\116\1\114\1\110\1\104\1\105\1\125\1\104\1\60"+
        "\1\111\1\127\1\122\1\124\1\114\1\105\1\122\1\124\1\105\1\60\1\127"+
        "\1\117\1\105\2\117\1\122\1\117\1\116\2\60\1\101\2\103\1\116\1\121"+
        "\1\103\1\123\1\107\1\116\1\60\1\110\1\125\2\101\1\125\1\104\1\105"+
        "\2\117\1\124\1\60\1\105\1\111\1\113\1\107\1\114\1\115\1\103\1\123"+
        "\1\101\1\123\1\116\1\103\1\122\1\105\1\113\1\60\1\122\1\105\1\125"+
        "\1\105\1\103\1\127\1\123\2\uffff\1\0\1\uffff\1\0\1\60\3\uffff\1"+
        "\60\1\53\1\uffff\3\60\1\uffff\1\60\1\103\1\123\1\107\1\105\1\110"+
        "\1\111\1\123\1\111\1\106\1\117\1\122\1\60\1\105\2\60\2\124\1\104"+
        "\1\60\1\124\1\101\1\uffff\1\117\1\110\1\uffff\1\122\1\uffff\1\131"+
        "\1\uffff\1\122\1\131\1\111\1\uffff\1\116\1\60\1\122\1\101\1\60\1"+
        "\125\1\122\1\116\1\60\2\115\1\124\1\116\1\111\1\102\1\103\1\uffff"+
        "\3\60\1\114\1\117\1\122\1\uffff\1\60\1\122\1\125\1\uffff\1\111\1"+
        "\117\1\122\1\60\1\123\1\124\2\60\1\114\2\60\1\103\1\60\2\122\1\130"+
        "\2\124\1\60\1\122\1\uffff\3\122\1\123\1\122\1\124\1\122\1\101\1"+
        "\116\1\125\1\101\1\120\1\114\1\uffff\1\60\1\120\1\124\1\105\1\60"+
        "\1\116\1\122\1\105\1\122\1\105\1\116\1\137\1\105\1\60\1\105\1\60"+
        "\1\117\1\103\2\105\1\60\1\uffff\2\60\1\105\1\60\1\114\1\116\1\103"+
        "\1\101\1\105\1\111\1\115\1\uffff\1\105\1\125\1\116\1\124\1\107\1"+
        "\60\2\103\1\125\1\107\1\60\1\uffff\1\124\1\uffff\1\124\1\105\1\124"+
        "\3\105\1\103\1\111\1\125\1\105\1\60\1\105\1\60\1\uffff\1\124\2\111"+
        "\1\101\1\115\1\103\1\60\1\130\1\113\2\122\1\60\1\uffff\1\125\1\60"+
        "\1\114\2\105\1\115\2\105\1\101\1\111\1\101\2\124\1\123\1\107\3\60"+
        "\1\101\1\117\1\105\2\60\1\117\1\uffff\1\117\1\122\1\123\1\60\1\110"+
        "\2\60\1\uffff\3\60\1\104\1\uffff\2\101\1\105\2\60\1\116\1\124\1"+
        "\116\1\111\1\122\1\117\1\uffff\1\60\2\uffff\1\111\1\60\1\123\1\117"+
        "\1\uffff\1\60\1\124\1\127\2\60\1\132\2\60\1\126\1\60\1\uffff\1\117"+
        "\1\116\1\uffff\1\114\1\122\1\105\1\111\1\uffff\1\101\1\111\1\105"+
        "\1\104\1\116\1\111\1\114\1\124\1\101\1\uffff\1\111\2\uffff\1\105"+
        "\1\120\1\60\1\122\1\uffff\1\60\1\124\2\116\1\60\1\uffff\2\60\2\uffff"+
        "\1\60\1\111\1\60\2\uffff\1\101\1\uffff\1\101\1\124\1\60\1\110\1"+
        "\104\1\uffff\1\123\1\60\1\124\1\105\1\60\1\117\1\123\1\124\1\111"+
        "\1\116\1\104\1\123\1\116\2\105\1\uffff\2\60\1\101\1\uffff\1\124"+
        "\1\131\1\124\2\105\1\107\1\104\1\60\1\uffff\1\60\1\uffff\1\127\1"+
        "\124\1\116\1\60\2\uffff\1\104\1\uffff\2\104\1\uffff\1\111\1\107"+
        "\1\124\1\115\1\104\1\123\1\101\1\104\1\105\2\60\1\116\1\uffff\1"+
        "\113\1\110\1\116\1\60\1\uffff\1\115\1\105\1\122\1\131\1\104\1\103"+
        "\1\104\1\111\1\101\1\105\1\116\1\uffff\1\60\1\uffff\1\60\1\114\1"+
        "\122\1\103\2\105\1\116\1\60\1\uffff\1\120\1\105\1\104\1\111\1\uffff"+
        "\1\120\1\60\1\uffff\1\105\2\60\1\116\1\103\1\116\1\124\1\103\1\116"+
        "\1\124\2\105\1\60\1\105\3\uffff\1\104\1\122\1\116\2\uffff\1\111"+
        "\1\60\1\111\1\60\1\uffff\1\101\2\uffff\1\124\1\117\1\103\1\122\1"+
        "\60\2\uffff\1\124\2\101\1\114\1\101\1\120\1\uffff\1\117\1\uffff"+
        "\1\60\1\122\1\uffff\1\60\1\111\2\uffff\1\105\2\uffff\1\105\1\uffff"+
        "\1\120\1\60\1\124\1\105\1\104\1\102\1\114\1\124\1\60\1\105\1\103"+
        "\1\102\1\105\1\117\1\123\1\115\1\60\1\105\1\uffff\1\111\1\uffff"+
        "\1\104\1\105\1\60\4\uffff\1\117\1\uffff\2\114\1\60\1\123\1\uffff"+
        "\1\60\1\117\1\122\1\105\1\uffff\2\60\1\uffff\1\120\2\60\1\116\1"+
        "\101\1\105\1\111\1\107\1\104\1\60\1\116\2\uffff\1\116\4\60\1\116"+
        "\1\60\1\104\2\uffff\2\60\1\103\1\122\1\uffff\1\101\2\60\1\116\2"+
        "\60\1\124\1\60\1\124\2\60\1\112\1\131\2\uffff\1\105\1\60\1\111\1"+
        "\104\1\uffff\1\105\1\60\1\126\1\60\1\111\1\124\1\125\1\120\1\111"+
        "\1\114\2\124\2\uffff\1\104\1\60\1\105\2\60\1\114\1\uffff\2\60\1"+
        "\122\1\103\1\60\1\uffff\1\60\2\uffff\1\60\2\124\1\105\1\124\1\125"+
        "\1\105\1\122\1\60\1\uffff\1\60\1\105\1\60\1\124\1\116\1\uffff\1"+
        "\101\1\uffff\1\122\1\105\1\122\1\124\1\60\1\115\1\uffff\1\60\1\115"+
        "\1\124\1\105\1\122\1\105\1\116\1\uffff\1\115\1\105\1\uffff\1\116"+
        "\3\60\1\uffff\1\60\1\104\1\60\1\105\1\60\1\105\1\uffff\1\116\1\124"+
        "\1\125\1\60\1\122\2\105\1\uffff\1\122\1\124\1\117\1\122\1\60\1\uffff"+
        "\1\116\2\60\1\uffff\1\60\1\uffff\1\122\1\111\1\103\2\uffff\1\105"+
        "\2\uffff\1\60\1\114\1\104\1\126\1\105\1\60\1\uffff\1\107\1\60\2"+
        "\uffff\1\60\2\uffff\1\60\1\uffff\1\114\2\uffff\1\105\1\117\1\124"+
        "\2\uffff\1\124\2\uffff\1\101\1\uffff\1\111\1\60\2\uffff\1\117\1"+
        "\120\1\104\1\uffff\1\126\1\105\1\123\1\uffff\1\105\1\uffff\1\116"+
        "\1\111\1\122\1\101\1\117\1\123\3\60\1\uffff\1\60\2\uffff\1\131\2"+
        "\uffff\1\105\1\122\1\124\2\uffff\1\60\1\uffff\1\111\3\60\1\105\1"+
        "\116\1\60\2\uffff\1\60\1\uffff\2\60\1\114\2\60\1\115\1\111\1\uffff"+
        "\1\120\1\uffff\1\120\1\105\1\60\1\131\1\122\1\60\1\101\1\104\1\107"+
        "\4\uffff\1\60\1\uffff\1\60\1\uffff\1\104\1\103\1\60\1\124\1\uffff"+
        "\1\111\2\60\1\124\1\105\1\122\1\111\1\uffff\1\60\3\uffff\1\115\1"+
        "\126\1\124\1\122\1\uffff\2\60\1\105\1\60\1\uffff\1\60\3\uffff\1"+
        "\124\1\106\1\120\1\101\1\60\1\102\1\103\1\uffff\1\111\1\105\1\60"+
        "\1\105\1\104\1\124\1\60\1\107\1\117\1\105\1\114\1\116\1\103\4\uffff"+
        "\1\60\1\101\1\111\1\60\1\uffff\1\117\2\uffff\1\117\1\uffff\1\60"+
        "\1\101\1\104\1\124\4\uffff\1\111\2\uffff\1\60\1\117\1\114\1\60\1"+
        "\104\1\uffff\1\60\1\124\1\60\1\uffff\1\124\2\60\2\uffff\1\60\1\131"+
        "\1\uffff\1\105\1\60\1\105\1\60\2\uffff\1\111\1\60\1\115\1\126\1"+
        "\uffff\1\101\1\105\1\60\1\124\2\uffff\1\60\2\uffff\2\111\1\105\1"+
        "\102\1\uffff\1\114\1\123\1\116\1\60\1\uffff\2\60\1\101\1\uffff\1"+
        "\60\1\116\1\60\1\123\1\60\1\101\1\uffff\1\104\1\124\1\uffff\2\116"+
        "\1\uffff\1\124\1\60\1\101\1\132\1\uffff\1\116\1\105\1\uffff\1\60"+
        "\1\uffff\1\111\1\uffff\1\60\3\uffff\2\60\1\uffff\1\123\1\uffff\1"+
        "\105\1\uffff\1\101\1\105\1\124\1\122\1\uffff\1\111\1\uffff\1\115"+
        "\1\114\1\122\1\101\1\105\2\60\3\uffff\1\115\1\uffff\1\60\1\uffff"+
        "\2\60\1\104\1\uffff\1\116\2\105\1\60\1\123\1\105\1\uffff\1\124\1"+
        "\105\1\123\1\60\1\uffff\1\105\3\uffff\1\60\1\123\1\124\1\122\2\60"+
        "\3\105\1\124\1\123\1\60\2\uffff\1\120\3\uffff\2\60\2\122\1\uffff"+
        "\2\60\1\125\1\104\1\60\1\uffff\1\123\1\uffff\3\60\2\uffff\1\123"+
        "\2\60\1\111\1\105\1\uffff\1\60\2\uffff\2\60\2\uffff\1\123\1\60\1"+
        "\uffff\1\60\3\uffff\1\60\2\uffff\1\105\1\60\3\uffff\1\60\3\uffff"+
        "\1\123\2\uffff\1\60\1\uffff";
    static final String DFA25_maxS =
        "\1\176\1\122\1\125\1\123\1\125\1\122\1\127\1\75\1\117\1\124\1\130"+
        "\1\122\1\131\1\117\1\111\2\124\1\125\2\117\1\125\1\123\1\111\1\105"+
        "\1\126\13\uffff\1\76\1\75\2\uffff\1\55\7\uffff\2\uffff\2\172\3\uffff"+
        "\1\125\1\102\1\172\1\116\1\130\1\114\1\105\1\114\1\117\1\116\1\122"+
        "\1\117\1\122\2\124\1\104\1\172\1\124\1\122\1\115\1\137\1\114\1\123"+
        "\1\126\1\124\1\117\1\125\1\120\1\172\1\105\1\124\2\172\1\124\1\116"+
        "\2\uffff\1\116\1\123\1\116\1\124\2\172\1\120\1\172\1\116\1\105\1"+
        "\130\1\124\1\103\1\104\1\123\1\117\1\172\1\124\1\116\1\103\1\124"+
        "\1\126\1\114\1\111\2\124\1\117\1\122\1\101\1\122\1\110\1\114\1\105"+
        "\1\123\1\111\1\103\1\104\1\117\2\122\1\125\1\122\1\111\1\122\1\107"+
        "\1\126\1\127\1\106\1\111\2\116\1\125\1\117\1\101\1\123\1\122\1\103"+
        "\1\124\1\116\2\122\1\105\1\131\4\uffff\1\76\5\uffff\2\uffff\1\47"+
        "\2\uffff\1\47\1\146\4\172\1\145\1\71\1\uffff\2\172\2\116\1\107\1"+
        "\114\1\103\1\uffff\1\131\1\105\1\115\1\124\2\120\1\116\1\123\1\115"+
        "\1\114\1\103\1\123\1\114\1\105\1\101\1\172\1\114\1\103\1\172\1\105"+
        "\1\172\1\114\1\172\1\uffff\1\105\1\101\1\110\1\172\1\111\1\105\1"+
        "\172\1\104\1\103\1\114\1\111\1\103\2\111\1\105\1\124\1\105\1\172"+
        "\1\105\1\120\1\102\1\122\1\105\1\172\1\uffff\1\122\1\172\1\uffff"+
        "\1\114\1\uffff\1\111\3\105\1\111\1\124\1\123\1\113\1\104\1\111\1"+
        "\107\1\105\1\uffff\2\105\1\125\1\172\1\105\1\uffff\1\117\1\uffff"+
        "\1\117\1\115\1\120\1\123\1\117\1\105\1\114\1\101\1\102\1\172\1\105"+
        "\1\125\1\116\1\uffff\1\114\1\110\1\111\1\101\1\113\1\117\1\127\1"+
        "\111\1\104\1\122\1\114\1\110\1\104\1\105\1\125\1\104\1\172\1\111"+
        "\1\127\1\122\1\124\1\114\1\125\1\122\1\124\1\105\1\172\1\127\1\121"+
        "\1\111\2\117\1\122\1\117\1\116\2\172\1\101\2\124\1\116\1\124\1\103"+
        "\1\123\1\107\1\116\1\172\1\110\1\125\1\114\1\101\1\125\1\104\1\105"+
        "\2\117\1\124\1\172\1\114\1\111\1\113\1\107\1\125\1\120\1\124\1\123"+
        "\1\101\1\123\1\122\1\124\1\123\1\105\1\113\1\172\1\122\1\105\1\125"+
        "\1\105\1\103\1\127\1\123\2\uffff\1\uffff\1\uffff\1\uffff\1\172\3"+
        "\uffff\1\145\1\71\1\uffff\1\71\2\172\1\uffff\1\172\1\103\1\123\1"+
        "\107\1\105\1\110\1\111\1\123\1\111\1\106\1\117\1\122\1\172\1\105"+
        "\2\172\2\124\1\104\1\172\1\124\1\101\1\uffff\1\117\1\110\1\uffff"+
        "\1\122\1\uffff\1\131\1\uffff\1\122\1\131\1\111\1\uffff\1\116\1\172"+
        "\1\122\1\101\1\172\1\125\1\122\1\116\1\172\2\115\1\124\1\116\1\122"+
        "\1\102\1\103\1\uffff\3\172\1\114\1\117\1\122\1\uffff\1\172\1\122"+
        "\1\125\1\uffff\1\111\1\117\1\122\1\172\1\123\1\124\2\172\1\124\2"+
        "\172\1\103\1\172\2\122\1\130\2\124\1\172\1\122\1\uffff\3\122\1\123"+
        "\1\122\1\124\1\122\1\101\1\122\1\125\1\101\1\120\1\114\1\uffff\1"+
        "\172\1\120\1\124\1\105\1\172\1\116\1\122\1\105\1\122\1\105\1\116"+
        "\1\137\1\105\1\172\1\105\1\172\1\117\1\103\2\105\1\172\1\uffff\2"+
        "\172\1\105\1\172\1\114\1\116\1\103\1\101\1\105\1\111\1\115\1\uffff"+
        "\1\105\1\125\1\116\1\124\1\107\1\172\2\103\1\125\1\107\1\172\1\uffff"+
        "\1\124\1\uffff\1\124\1\105\1\124\3\105\1\103\1\111\1\125\1\105\1"+
        "\172\1\105\1\172\1\uffff\1\124\2\111\1\101\1\115\1\103\1\172\1\130"+
        "\1\113\2\122\1\172\1\uffff\1\125\1\172\1\114\2\105\1\115\2\105\1"+
        "\125\1\111\1\101\2\124\1\123\1\107\3\172\1\101\1\117\1\105\2\172"+
        "\1\117\1\uffff\1\117\1\122\1\123\1\172\1\110\2\172\1\uffff\1\71"+
        "\2\102\1\104\1\uffff\1\101\1\106\1\105\2\172\1\116\1\124\1\116\1"+
        "\111\1\122\1\117\1\uffff\1\172\2\uffff\1\111\1\172\1\123\1\117\1"+
        "\uffff\1\172\1\124\1\127\2\172\1\132\2\172\1\126\1\172\1\uffff\1"+
        "\117\1\116\1\uffff\1\114\1\122\1\105\1\111\1\uffff\1\101\1\111\1"+
        "\105\1\104\1\116\1\111\1\114\1\124\1\101\1\uffff\1\111\2\uffff\1"+
        "\105\1\120\1\172\1\122\1\uffff\1\172\1\124\2\116\1\172\1\uffff\2"+
        "\172\2\uffff\1\172\1\111\1\172\2\uffff\1\101\1\uffff\1\101\1\124"+
        "\1\172\1\110\1\106\1\uffff\1\123\1\172\1\124\1\105\1\172\1\117\1"+
        "\123\1\124\1\111\1\116\1\104\1\123\1\116\2\105\1\uffff\2\172\1\101"+
        "\1\uffff\1\124\1\131\1\124\2\105\1\107\1\104\1\172\1\uffff\1\172"+
        "\1\uffff\1\127\1\124\1\116\1\172\2\uffff\1\104\1\uffff\2\104\1\uffff"+
        "\1\111\1\107\1\124\1\115\1\104\1\123\1\101\1\104\1\105\2\172\1\116"+
        "\1\uffff\1\113\1\110\1\116\1\172\1\uffff\1\115\1\105\1\122\1\131"+
        "\1\104\1\103\1\104\1\111\1\124\1\105\1\116\1\uffff\1\172\1\uffff"+
        "\1\172\1\114\1\122\1\103\2\105\1\116\1\172\1\uffff\1\120\1\105\1"+
        "\104\1\111\1\uffff\1\120\1\172\1\uffff\1\105\2\172\1\116\1\103\1"+
        "\116\1\124\1\103\1\116\1\124\2\105\1\172\1\105\3\uffff\1\104\1\122"+
        "\1\116\2\uffff\1\111\1\172\1\111\1\172\1\uffff\1\101\2\uffff\1\124"+
        "\1\117\1\103\1\122\1\172\2\uffff\1\124\2\101\1\114\1\101\1\120\1"+
        "\uffff\1\117\1\uffff\1\172\1\122\1\uffff\1\172\1\111\2\uffff\1\105"+
        "\2\uffff\1\105\1\uffff\1\120\1\172\1\124\1\105\1\104\1\102\1\114"+
        "\1\124\1\172\1\105\1\103\1\102\1\105\1\117\1\123\1\115\1\172\1\105"+
        "\1\uffff\1\111\1\uffff\1\106\1\105\1\172\4\uffff\1\117\1\uffff\2"+
        "\114\1\172\1\123\1\uffff\1\172\1\117\1\122\1\105\1\uffff\2\172\1"+
        "\uffff\1\120\2\172\1\116\1\101\1\105\1\111\1\107\1\104\1\172\1\116"+
        "\2\uffff\1\116\4\172\1\116\1\172\1\104\2\uffff\2\172\1\103\1\122"+
        "\1\uffff\1\101\2\172\1\116\2\172\1\124\1\172\1\124\2\172\1\112\1"+
        "\131\2\uffff\1\105\1\172\1\111\1\104\1\uffff\1\105\1\172\1\126\1"+
        "\172\1\111\1\124\1\125\1\120\1\111\1\114\2\124\2\uffff\1\104\1\172"+
        "\1\105\2\172\1\114\1\uffff\2\172\1\127\1\103\1\172\1\uffff\1\172"+
        "\2\uffff\1\172\2\124\1\105\1\124\1\125\1\105\1\122\1\172\1\uffff"+
        "\1\172\1\105\1\172\1\124\1\116\1\uffff\1\101\1\uffff\1\122\1\105"+
        "\1\122\1\124\1\172\1\115\1\uffff\1\172\1\115\1\124\1\105\1\122\1"+
        "\105\1\116\1\uffff\1\115\1\105\1\uffff\1\116\3\172\1\uffff\1\172"+
        "\1\104\1\172\1\105\1\172\1\105\1\uffff\1\116\1\124\1\125\1\172\1"+
        "\122\2\105\1\uffff\1\122\1\124\1\117\1\122\1\172\1\uffff\1\116\2"+
        "\172\1\uffff\1\172\1\uffff\1\122\1\111\1\103\2\uffff\1\105\2\uffff"+
        "\1\172\1\114\1\104\1\126\1\105\1\172\1\uffff\1\107\1\172\2\uffff"+
        "\1\172\2\uffff\1\172\1\uffff\1\114\2\uffff\1\105\1\117\1\124\2\uffff"+
        "\1\124\2\uffff\1\101\1\uffff\1\111\1\172\2\uffff\1\117\1\120\1\104"+
        "\1\uffff\1\126\1\105\1\123\1\uffff\1\105\1\uffff\1\116\1\111\1\122"+
        "\1\101\1\117\1\123\3\172\1\uffff\1\172\2\uffff\1\131\2\uffff\1\105"+
        "\1\122\1\124\2\uffff\1\172\1\uffff\1\111\3\172\1\105\1\116\1\172"+
        "\2\uffff\1\172\1\uffff\2\172\1\114\2\172\1\115\1\111\1\uffff\1\120"+
        "\1\uffff\1\120\1\105\1\172\1\131\1\122\1\172\1\101\1\104\1\107\4"+
        "\uffff\1\172\1\uffff\1\172\1\uffff\1\104\1\103\1\172\1\124\1\uffff"+
        "\1\131\2\172\1\124\1\105\1\122\1\111\1\uffff\1\172\3\uffff\1\115"+
        "\1\126\1\124\1\122\1\uffff\2\172\1\105\1\172\1\uffff\1\172\3\uffff"+
        "\1\124\1\106\1\120\1\101\1\172\1\102\1\103\1\uffff\1\111\1\105\1"+
        "\172\1\105\1\104\1\124\1\172\1\107\1\117\1\105\1\114\1\116\1\103"+
        "\4\uffff\1\172\1\101\1\111\1\172\1\uffff\1\117\2\uffff\1\117\1\uffff"+
        "\1\172\1\101\1\104\1\124\4\uffff\1\111\2\uffff\1\172\1\117\1\114"+
        "\1\172\1\104\1\uffff\1\172\1\124\1\172\1\uffff\1\124\2\172\2\uffff"+
        "\1\172\1\131\1\uffff\1\105\1\172\1\105\1\172\2\uffff\1\111\1\172"+
        "\1\115\1\126\1\uffff\1\101\1\105\1\172\1\124\2\uffff\1\172\2\uffff"+
        "\2\111\1\105\1\102\1\uffff\1\114\1\123\1\116\1\172\1\uffff\2\172"+
        "\1\101\1\uffff\1\172\1\116\1\172\1\123\1\172\1\101\1\uffff\1\104"+
        "\1\124\1\uffff\2\116\1\uffff\1\124\1\172\1\101\1\132\1\uffff\1\116"+
        "\1\105\1\uffff\1\172\1\uffff\1\111\1\uffff\1\172\3\uffff\2\172\1"+
        "\uffff\1\123\1\uffff\1\105\1\uffff\1\101\1\105\1\124\1\122\1\uffff"+
        "\1\111\1\uffff\1\115\1\114\1\122\1\101\1\105\2\172\3\uffff\1\115"+
        "\1\uffff\1\172\1\uffff\2\172\1\104\1\uffff\1\116\2\105\1\172\1\123"+
        "\1\105\1\uffff\1\124\1\105\1\123\1\172\1\uffff\1\105\3\uffff\1\172"+
        "\1\123\1\124\1\122\2\172\3\105\1\124\1\123\1\172\2\uffff\1\120\3"+
        "\uffff\2\172\2\122\1\uffff\2\172\1\125\1\104\1\172\1\uffff\1\123"+
        "\1\uffff\3\172\2\uffff\1\123\2\172\1\111\1\105\1\uffff\1\172\2\uffff"+
        "\2\172\2\uffff\1\123\1\172\1\uffff\1\172\3\uffff\1\172\2\uffff\1"+
        "\105\1\172\3\uffff\1\172\3\uffff\1\123\2\uffff\1\172\1\uffff";
    static final String DFA25_acceptS =
        "\31\uffff\1\u00ff\1\u0100\1\u0101\1\u0102\1\u0103\1\u0104\1\u0105"+
        "\1\u0106\1\u0107\1\u0108\1\u0109\2\uffff\1\u0110\1\u0111\1\uffff"+
        "\1\u0113\1\u0114\1\u0116\1\u0117\1\u0118\1\u0119\1\u011a\4\uffff"+
        "\1\u0124\1\u0125\1\u0126\43\uffff\1\u010b\1\10\77\uffff\1\154\1"+
        "\u009e\1\u009f\1\u011b\1\uffff\1\u010d\1\u010e\1\u010f\1\u0127\1"+
        "\u0112\15\uffff\1\u0123\7\uffff\1\110\27\uffff\1\24\30\uffff\1\7"+
        "\2\uffff\1\40\1\uffff\1\u0082\14\uffff\1\12\5\uffff\1\u00b3\1\uffff"+
        "\1\72\15\uffff\1\20\121\uffff\1\u010a\1\u010c\1\uffff\1\u011c\2"+
        "\uffff\1\u011e\1\u011f\1\u0120\2\uffff\1\u0121\3\uffff\1\u0122\26"+
        "\uffff\1\u00e6\2\uffff\1\3\1\uffff\1\6\1\uffff\1\14\3\uffff\1\u0085"+
        "\20\uffff\1\u0115\6\uffff\1\163\3\uffff\1\u0081\24\uffff\1\115\15"+
        "\uffff\1\u00a5\25\uffff\1\u009a\13\uffff\1\u00bb\13\uffff\1\u00db"+
        "\1\uffff\1\u00aa\15\uffff\1\u008d\14\uffff\1\142\30\uffff\1\132"+
        "\7\uffff\1\u011d\4\uffff\1\1\13\uffff\1\u00a3\1\uffff\1\23\1\37"+
        "\4\uffff\1\u008c\12\uffff\1\4\2\uffff\1\73\4\uffff\1\15\11\uffff"+
        "\1\70\1\uffff\1\121\1\104\4\uffff\1\u00ee\5\uffff\1\11\2\uffff\1"+
        "\35\1\u00ec\3\uffff\1\u00bd\1\65\1\uffff\1\u00ac\5\uffff\1\140\17"+
        "\uffff\1\u00a4\3\uffff\1\u00cc\10\uffff\1\u00a2\1\uffff\1\u0095"+
        "\4\uffff\1\u00f0\1\u00d4\1\uffff\1\52\2\uffff\1\63\14\uffff\1\u00bc"+
        "\4\uffff\1\u00f4\13\uffff\1\u00ae\1\uffff\1\34\10\uffff\1\u00c5"+
        "\4\uffff\1\143\2\uffff\1\u00f5\16\uffff\1\126\1\u0084\1\u00a1\3"+
        "\uffff\1\u00e4\1\53\4\uffff\1\u00ed\1\uffff\1\u00b2\1\153\5\uffff"+
        "\1\43\1\u00d6\6\uffff\1\2\1\uffff\1\101\2\uffff\1\117\2\uffff\1"+
        "\u00b0\1\76\1\uffff\1\102\1\130\1\uffff\1\u00f9\22\uffff\1\16\1"+
        "\uffff\1\31\3\uffff\1\u00fa\1\155\1\u0099\1\56\1\uffff\1\u00be\4"+
        "\uffff\1\46\4\uffff\1\u00f7\2\uffff\1\152\13\uffff\1\17\1\u00b9"+
        "\10\uffff\1\22\1\u00c4\4\uffff\1\u0094\15\uffff\1\64\1\u009b\4\uffff"+
        "\1\60\14\uffff\1\u00c7\1\36\6\uffff\1\u00c6\5\uffff\1\u00f6\1\uffff"+
        "\1\u0087\1\u00c8\11\uffff\1\u00ce\5\uffff\1\u008b\1\uffff\1\u00af"+
        "\6\uffff\1\44\7\uffff\1\146\2\uffff\1\144\4\uffff\1\u00f2\6\uffff"+
        "\1\u00ad\7\uffff\1\120\5\uffff\1\u00dc\3\uffff\1\27\1\uffff\1\71"+
        "\3\uffff\1\67\1\106\1\uffff\1\13\1\66\6\uffff\1\172\2\uffff\1\116"+
        "\1\u00cd\1\uffff\1\u0080\1\u00ca\1\uffff\1\21\1\uffff\1\u00e7\1"+
        "\25\3\uffff\1\u00c0\1\137\1\uffff\1\125\1\131\1\uffff\1\156\2\uffff"+
        "\1\u00b7\1\u00e2\3\uffff\1\u00bf\3\uffff\1\u00df\1\uffff\1\u0091"+
        "\11\uffff\1\54\1\uffff\1\105\1\134\1\uffff\1\u0088\1\u00ba\3\uffff"+
        "\1\u00e3\1\162\1\uffff\1\100\7\uffff\1\74\1\77\1\uffff\1\u00d0\7"+
        "\uffff\1\u00d1\1\uffff\1\113\11\uffff\1\u00c9\1\u00d7\1\175\1\5"+
        "\1\uffff\1\u00a0\1\uffff\1\124\4\uffff\1\173\7\uffff\1\171\1\uffff"+
        "\1\u0093\1\u00d5\1\47\4\uffff\1\u008e\4\uffff\1\150\1\uffff\1\112"+
        "\1\141\1\u00cb\7\uffff\1\u00b8\15\uffff\1\164\1\u0083\1\50\1\u0086"+
        "\4\uffff\1\45\1\uffff\1\111\1\u00d9\1\uffff\1\u00fc\4\uffff\1\61"+
        "\1\u00e1\1\u00eb\1\u00a6\1\uffff\1\127\1\u00f1\5\uffff\1\161\3\uffff"+
        "\1\u008a\3\uffff\1\u0096\1\103\2\uffff\1\26\4\uffff\1\u00b4\1\122"+
        "\4\uffff\1\176\4\uffff\1\75\1\u008f\1\uffff\1\u00f8\1\u00ef\4\uffff"+
        "\1\114\4\uffff\1\u00c3\3\uffff\1\33\6\uffff\1\174\2\uffff\1\u00e0"+
        "\2\uffff\1\u00cf\4\uffff\1\57\2\uffff\1\123\1\uffff\1\u0089\1\uffff"+
        "\1\51\1\uffff\1\u0090\1\u00ea\1\145\2\uffff\1\55\1\uffff\1\u00b5"+
        "\1\uffff\1\30\4\uffff\1\u00b1\1\uffff\1\u00c1\7\uffff\1\133\1\u00d8"+
        "\1\u00e8\1\uffff\1\u00e9\1\uffff\1\u00c2\3\uffff\1\41\6\uffff\1"+
        "\136\4\uffff\1\147\1\uffff\1\157\1\u0092\1\62\14\uffff\1\u00da\1"+
        "\32\1\uffff\1\107\1\u00fb\1\42\4\uffff\1\151\5\uffff\1\177\1\uffff"+
        "\1\u00e5\3\uffff\1\165\1\167\5\uffff\1\u00a7\1\uffff\1\135\1\u00f3"+
        "\2\uffff\1\u00fd\1\u00dd\2\uffff\1\u00fe\1\uffff\1\u0098\1\166\1"+
        "\170\1\uffff\1\u00a8\1\160\2\uffff\1\u00ab\1\u00d2\1\u00d3\1\uffff"+
        "\1\u00b6\1\u009c\1\u009d\1\uffff\1\u00de\1\u00a9\1\uffff\1\u0097";
    static final String DFA25_specialS =
        "\60\uffff\1\0\1\3\163\uffff\1\6\1\1\1\uffff\1\5\1\2\u00bd\uffff"+
        "\1\7\1\uffff\1\4\u0406\uffff}>";
    static final String[] DFA25_transitionS = {
            "\2\66\2\uffff\1\66\22\uffff\1\66\1\7\1\61\1\uffff\1\30\1\52"+
            "\1\53\1\60\1\35\1\36\1\51\1\47\1\33\1\50\1\31\1\46\1\62\11\63"+
            "\1\32\1\34\1\44\1\43\1\45\1\57\1\uffff\1\3\1\14\1\24\1\5\1\12"+
            "\1\2\1\13\1\15\1\11\1\22\1\27\1\10\1\25\1\4\1\6\1\21\1\64\1"+
            "\23\1\17\1\1\1\20\1\26\1\16\3\64\1\37\1\uffff\1\40\1\56\1\65"+
            "\33\64\1\41\1\55\1\42\1\54",
            "\1\70\1\74\2\uffff\1\73\2\uffff\1\75\1\72\5\uffff\1\71\2\uffff"+
            "\1\67",
            "\1\76\3\uffff\1\104\3\uffff\1\101\2\uffff\1\102\2\uffff\1\103"+
            "\2\uffff\1\77\2\uffff\1\100",
            "\1\112\1\uffff\1\110\5\uffff\1\105\1\uffff\1\106\3\uffff\1"+
            "\111\1\107",
            "\1\113\5\uffff\1\114",
            "\1\117\1\122\2\uffff\1\115\3\uffff\1\116\5\uffff\1\121\2\uffff"+
            "\1\120",
            "\1\127\7\uffff\1\126\1\uffff\1\130\1\uffff\1\123\2\uffff\1"+
            "\125\1\124\1\131",
            "\1\132",
            "\1\137\3\uffff\1\135\3\uffff\1\134\5\uffff\1\136",
            "\1\146\1\uffff\1\140\1\144\5\uffff\1\142\1\141\4\uffff\1\143"+
            "\1\145",
            "\1\152\1\uffff\1\151\4\uffff\1\150\4\uffff\1\147",
            "\1\153",
            "\1\160\3\uffff\1\156\5\uffff\1\155\5\uffff\1\157\3\uffff\1"+
            "\154",
            "\1\161\15\uffff\1\162",
            "\1\163\1\164",
            "\1\172\1\uffff\1\165\2\uffff\1\166\2\uffff\1\174\1\uffff\1"+
            "\170\1\uffff\1\167\3\uffff\1\173\1\171",
            "\1\175\1\uffff\1\u0080\2\uffff\1\176\1\177",
            "\1\u0082\3\uffff\1\u0083\6\uffff\1\u0084\5\uffff\1\u0081\2"+
            "\uffff\1\u0085",
            "\1\u0087\15\uffff\1\u0086",
            "\1\u008d\1\uffff\1\u008b\1\uffff\1\u0089\3\uffff\1\u0088\2"+
            "\uffff\1\u008c\2\uffff\1\u008a",
            "\1\u0092\6\uffff\1\u0091\3\uffff\1\u008f\2\uffff\1\u008e\2"+
            "\uffff\1\u0090\2\uffff\1\u0093",
            "\1\u0095\7\uffff\1\u0096\5\uffff\1\u0097\3\uffff\1\u0094",
            "\1\u0098\7\uffff\1\u0099",
            "\1\u009a",
            "\1\u009d\5\uffff\1\u009b\12\uffff\1\u009c",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u009f\1\132",
            "\1\u00a1",
            "",
            "",
            "\1\u00a3",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\47\u00a5\1\u00a7\64\u00a5\1\u00a6\uffa3\u00a5",
            "\42\u00a8\1\u00aa\71\u00a8\1\u00a9\uffa3\u00a8",
            "\1\u00b0\1\uffff\12\u00ad\7\uffff\1\64\1\u00b3\2\64\1\u00b1"+
            "\1\64\1\u00b4\3\64\1\u00b4\1\u00ac\1\u00b4\5\64\1\u00ae\4\64"+
            "\1\u00ab\1\u00af\1\64\4\uffff\1\64\1\uffff\1\64\1\u00b4\2\64"+
            "\1\u00b1\1\64\1\u00b4\3\64\1\u00b4\1\64\1\u00b4\15\64",
            "\1\u00b0\1\uffff\12\u00ad\7\uffff\1\64\1\u00b3\2\64\1\u00b1"+
            "\1\64\1\u00b4\3\64\1\u00b4\1\u00ac\1\u00b4\5\64\1\u00ae\5\64"+
            "\1\u00af\1\64\4\uffff\1\64\1\uffff\1\64\1\u00b4\2\64\1\u00b1"+
            "\1\64\1\u00b4\3\64\1\u00b4\1\64\1\u00b4\15\64",
            "",
            "",
            "",
            "\1\u00b6\7\uffff\1\u00b7\13\uffff\1\u00b5",
            "\1\u00b8",
            "\12\64\7\uffff\24\64\1\u00b9\5\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u00bc\1\u00bb",
            "\1\u00bf\4\uffff\1\u00bd\5\uffff\1\u00be",
            "\1\u00c0",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4\1\uffff\1\u00c5",
            "\1\u00c7\6\uffff\1\u00c8\5\uffff\1\u00c6",
            "\1\u00c9",
            "\1\u00cb\5\uffff\1\u00ca",
            "\1\u00cc",
            "\1\u00cd\7\uffff\1\u00ce",
            "\1\u00d0\2\uffff\1\u00cf",
            "\12\64\7\uffff\2\64\1\u00d1\27\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u00d3",
            "\1\u00d5\16\uffff\1\u00d4",
            "\1\u00d6\10\uffff\1\u00d7",
            "\1\u00d8\4\uffff\1\u00db\1\u00d9\12\uffff\1\u00da",
            "\1\u00dc",
            "\1\u00df\2\uffff\1\u00dd\5\uffff\1\u00e0\3\uffff\1\u00e1\2"+
            "\uffff\1\u00de",
            "\1\u00e3\1\u00e2\2\uffff\1\u00e4",
            "\1\u00e5",
            "\1\u00e6",
            "\1\u00e7",
            "\1\u00e8",
            "\12\64\7\uffff\2\64\1\u00ea\1\u00e9\26\64\4\uffff\1\64\1\uffff"+
            "\32\64",
            "\1\u00ec",
            "\1\u00ed",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\5\64\1\u00ef\24\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u00f1",
            "\1\u00f2",
            "",
            "",
            "\1\u00f3\1\uffff\1\u00f5\1\u00f4",
            "\1\u00f6\14\uffff\1\u00f7",
            "\1\u00f9\1\uffff\1\u00f8\3\uffff\1\u00fa\6\uffff\1\u00fb",
            "\1\u00fc",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\3\64\1\u00ff\11\64\1\u0102\1\64\1\u0100\2\64"+
            "\1\u00fe\1\u0101\6\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0104",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0106",
            "\1\u0107",
            "\1\u0108",
            "\1\u010c\5\uffff\1\u0109\6\uffff\1\u010a\3\uffff\1\u010b",
            "\1\u010d",
            "\1\u010e\2\uffff\1\u010f",
            "\1\u0110",
            "\1\u0112\15\uffff\1\u0111",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0114\4\uffff\1\u0115",
            "\1\u0116\6\uffff\1\u0117",
            "\1\u0118",
            "\1\u0119\15\uffff\1\u011a",
            "\1\u011b",
            "\1\u011c",
            "\1\u011d\3\uffff\1\u011e",
            "\1\u0120\5\uffff\1\u011f",
            "\1\u0121\1\u0125\3\uffff\1\u0122\1\u0123\1\uffff\1\u0124",
            "\1\u0127\15\uffff\1\u0126",
            "\1\u0128",
            "\1\u0129",
            "\1\u012c\15\uffff\1\u012b\2\uffff\1\u012a",
            "\1\u012d",
            "\1\u012e",
            "\1\u012f",
            "\1\u0134\1\u0135\1\uffff\1\u0132\4\uffff\1\u0130\2\uffff\1"+
            "\u0133\6\uffff\1\u0131",
            "\1\u0137\3\uffff\1\u0136",
            "\1\u0138",
            "\1\u0139",
            "\1\u013a\3\uffff\1\u013c\5\uffff\1\u013b",
            "\1\u013d",
            "\1\u013e",
            "\1\u013f",
            "\1\u0140",
            "\1\u0141",
            "\1\u0142",
            "\1\u0143",
            "\1\u0148\1\u0144\1\u014b\1\u0147\2\uffff\1\u0149\6\uffff\1"+
            "\u0146\1\uffff\1\u0145\2\uffff\1\u014c\2\uffff\1\u014a",
            "\1\u014e\12\uffff\1\u014d",
            "\1\u014f",
            "\1\u0150",
            "\1\u0151",
            "\1\u0152\1\u0153\1\u0154",
            "\1\u0155",
            "\1\u0156\11\uffff\1\u0157",
            "\1\u0158",
            "\1\u0159",
            "\1\u015b\17\uffff\1\u015a",
            "\1\u015c",
            "\1\u015e\14\uffff\1\u015d\3\uffff\1\u015f",
            "\1\u0160",
            "\1\u0161",
            "\1\u0162",
            "\1\u0163",
            "\1\u0164",
            "",
            "",
            "",
            "",
            "\1\u0165",
            "",
            "",
            "",
            "",
            "",
            "\47\u00a5\1\u00a7\64\u00a5\1\u00a6\uffa3\u00a5",
            "\0\u0167",
            "\1\61\4\uffff\1\60",
            "\42\u00a8\1\u00aa\71\u00a8\1\u00a9\uffa3\u00a8",
            "\0\u0169",
            "\1\61\4\uffff\1\60",
            "\12\u016a\7\uffff\6\u016a\32\uffff\6\u016a",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u00b0\1\uffff\12\u00ad\7\uffff\1\64\1\u00b3\2\64\1\u00b1"+
            "\1\64\1\u00b4\3\64\1\u00b4\1\u00ac\1\u00b4\5\64\1\u00ae\5\64"+
            "\1\u00af\1\64\4\uffff\1\64\1\uffff\1\64\1\u00b4\2\64\1\u00b1"+
            "\1\64\1\u00b4\3\64\1\u00b4\1\64\1\u00b4\15\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\u016e\10\uffff\1\u0170\2\uffff\1\u016f\37\uffff\1\u016f",
            "\1\u0171\1\uffff\1\u0171\2\uffff\12\u0172",
            "",
            "\12\64\7\uffff\3\64\1\u0173\26\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0175\10\uffff\1\u0176",
            "\1\u0177",
            "\1\u0178",
            "\1\u0179",
            "\1\u017a",
            "",
            "\1\u017b",
            "\1\u017c",
            "\1\u017d",
            "\1\u017e",
            "\1\u017f",
            "\1\u0180",
            "\1\u0181",
            "\1\u0182",
            "\1\u0183",
            "\1\u0184",
            "\1\u0185",
            "\1\u0186",
            "\1\u0187",
            "\1\u0188",
            "\1\u0189",
            "\12\64\7\uffff\14\64\1\u018a\15\64\4\uffff\1\64\1\uffff\32"+
            "\64",
            "\1\u018c",
            "\1\u018d",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u018f",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0191",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\1\u0193",
            "\1\u0194",
            "\1\u0195",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0197",
            "\1\u0198",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0199",
            "\1\u019a",
            "\1\u019b",
            "\1\u019c\3\uffff\1\u019d\3\uffff\1\u019e",
            "\1\u019f",
            "\1\u01a0",
            "\1\u01a2\3\uffff\1\u01a1",
            "\1\u01a3",
            "\1\u01a5\22\uffff\1\u01a4",
            "\1\u01a6",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u01a8\3\uffff\1\u01a9",
            "\1\u01aa",
            "\1\u01ab",
            "\1\u01ac",
            "\1\u01ad",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\1\u01af",
            "\12\64\7\uffff\4\64\1\u01b0\12\64\1\u01b1\12\64\4\uffff\1\64"+
            "\1\uffff\32\64",
            "",
            "\1\u01b3",
            "",
            "\1\u01b4",
            "\1\u01b5",
            "\1\u01b6",
            "\1\u01b7",
            "\1\u01b8",
            "\1\u01b9",
            "\1\u01ba",
            "\1\u01bb\11\uffff\1\u01bc",
            "\1\u01bd",
            "\1\u01be",
            "\1\u01bf",
            "\1\u01c0",
            "",
            "\1\u01c1",
            "\1\u01c2",
            "\1\u01c3\23\uffff\1\u01c4",
            "\12\64\7\uffff\4\64\1\u01c6\11\64\1\u01c5\13\64\4\uffff\1\64"+
            "\1\uffff\32\64",
            "\1\u01c8",
            "",
            "\1\u01c9",
            "",
            "\1\u01ca",
            "\1\u01cb",
            "\1\u01cc",
            "\1\u01cd",
            "\1\u01cf\2\uffff\1\u01ce",
            "\1\u01d0",
            "\1\u01d2\3\uffff\1\u01d1",
            "\1\u01d3",
            "\1\u01d4",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u01d6",
            "\1\u01d7",
            "\1\u01d8",
            "",
            "\1\u01d9",
            "\1\u01da",
            "\1\u01db",
            "\1\u01dc",
            "\1\u01dd",
            "\1\u01de",
            "\1\u01df",
            "\1\u01e0",
            "\1\u01e1",
            "\1\u01e3\3\uffff\1\u01e2",
            "\1\u01e4",
            "\1\u01e5",
            "\1\u01e6",
            "\1\u01e7",
            "\1\u01e8",
            "\1\u01e9",
            "\12\64\7\uffff\22\64\1\u01ea\7\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u01ec",
            "\1\u01ed",
            "\1\u01ee",
            "\1\u01ef",
            "\1\u01f0",
            "\1\u01f3\3\uffff\1\u01f1\13\uffff\1\u01f2",
            "\1\u01f4",
            "\1\u01f5",
            "\1\u01f6",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u01f8",
            "\1\u01fa\1\uffff\1\u01f9",
            "\1\u01fb\3\uffff\1\u01fc",
            "\1\u01fd",
            "\1\u01fe",
            "\1\u01ff",
            "\1\u0200",
            "\1\u0201",
            "\12\64\7\uffff\21\64\1\u0202\10\64\4\uffff\1\64\1\uffff\32"+
            "\64",
            "\12\64\7\uffff\32\64\4\uffff\1\u0204\1\uffff\32\64",
            "\1\u0206",
            "\1\u0209\17\uffff\1\u0207\1\u0208",
            "\1\u020b\20\uffff\1\u020a",
            "\1\u020c",
            "\1\u020e\2\uffff\1\u020d",
            "\1\u020f",
            "\1\u0210",
            "\1\u0211",
            "\1\u0212",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0214",
            "\1\u0215",
            "\1\u0216\12\uffff\1\u0217",
            "\1\u0218",
            "\1\u0219",
            "\1\u021a",
            "\1\u021b",
            "\1\u021c",
            "\1\u021d",
            "\1\u021e",
            "\12\64\7\uffff\22\64\1\u021f\7\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0222\6\uffff\1\u0221",
            "\1\u0223",
            "\1\u0224",
            "\1\u0225",
            "\1\u0227\10\uffff\1\u0226",
            "\1\u0228\2\uffff\1\u0229",
            "\1\u022b\20\uffff\1\u022a",
            "\1\u022c",
            "\1\u022d",
            "\1\u022e",
            "\1\u022f\3\uffff\1\u0230",
            "\1\u0233\1\uffff\1\u0232\16\uffff\1\u0231",
            "\1\u0235\1\u0234",
            "\1\u0236",
            "\1\u0237",
            "\12\64\7\uffff\11\64\1\u0238\20\64\4\uffff\1\64\1\uffff\32"+
            "\64",
            "\1\u023a",
            "\1\u023b",
            "\1\u023c",
            "\1\u023d",
            "\1\u023e",
            "\1\u023f",
            "\1\u0240",
            "",
            "",
            "\47\u00a5\1\u00a7\64\u00a5\1\u00a6\uffa3\u00a5",
            "",
            "\42\u00a8\1\u00aa\71\u00a8\1\u00a9\uffa3\u00a8",
            "\12\u016a\7\uffff\6\u016a\24\64\4\uffff\1\64\1\uffff\6\u016a"+
            "\24\64",
            "",
            "",
            "",
            "\12\u016e\10\uffff\1\u0170\2\uffff\1\u016f\37\uffff\1\u016f",
            "\1\u0242\1\uffff\1\u0242\2\uffff\12\u0243",
            "",
            "\12\u0244",
            "\12\u0172\7\uffff\1\64\1\u0245\30\64\4\uffff\1\64\1\uffff\32"+
            "\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0247",
            "\1\u0248",
            "\1\u0249",
            "\1\u024a",
            "\1\u024b",
            "\1\u024c",
            "\1\u024d",
            "\1\u024e",
            "\1\u024f",
            "\1\u0250",
            "\1\u0251",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0253",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0256",
            "\1\u0257",
            "\1\u0258",
            "\12\64\7\uffff\5\64\1\u0259\24\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u025b",
            "\1\u025c",
            "",
            "\1\u025d",
            "\1\u025e",
            "",
            "\1\u025f",
            "",
            "\1\u0260",
            "",
            "\1\u0261",
            "\1\u0262",
            "\1\u0263",
            "",
            "\1\u0264",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0266",
            "\1\u0267",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0269",
            "\1\u026a",
            "\1\u026b",
            "\12\64\7\uffff\21\64\1\u026c\10\64\4\uffff\1\64\1\uffff\32"+
            "\64",
            "\1\u026e",
            "\1\u026f",
            "\1\u0270",
            "\1\u0271",
            "\1\u0272\10\uffff\1\u0273",
            "\1\u0274",
            "\1\u0275",
            "",
            "\12\64\7\uffff\1\64\1\u0276\30\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\23\64\1\u0278\6\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u027b",
            "\1\u027c",
            "\1\u027d",
            "",
            "\12\64\7\uffff\26\64\1\u027e\3\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0280",
            "\1\u0281",
            "",
            "\1\u0282",
            "\1\u0283",
            "\1\u0284",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0286",
            "\1\u0287",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u028a\7\uffff\1\u028b",
            "\12\64\7\uffff\22\64\1\u028c\7\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u028f",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0291",
            "\1\u0292",
            "\1\u0293",
            "\1\u0294",
            "\1\u0295",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0297",
            "",
            "\1\u0298",
            "\1\u0299",
            "\1\u029a",
            "\1\u029b",
            "\1\u029c",
            "\1\u029d",
            "\1\u029e",
            "\1\u029f",
            "\1\u02a1\3\uffff\1\u02a0",
            "\1\u02a2",
            "\1\u02a3",
            "\1\u02a4",
            "\1\u02a5",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u02a7",
            "\1\u02a8",
            "\1\u02a9",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u02ab",
            "\1\u02ac",
            "\1\u02ad",
            "\1\u02ae",
            "\1\u02af",
            "\1\u02b0",
            "\1\u02b1",
            "\1\u02b2",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u02b4",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u02b6",
            "\1\u02b7",
            "\1\u02b8",
            "\1\u02b9",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\u02bc\1\uffff\32\64",
            "\1\u02be",
            "\12\64\7\uffff\4\64\1\u02bf\25\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u02c1",
            "\1\u02c2",
            "\1\u02c3",
            "\1\u02c4",
            "\1\u02c5",
            "\1\u02c6",
            "\1\u02c7",
            "",
            "\1\u02c8",
            "\1\u02c9",
            "\1\u02ca",
            "\1\u02cb",
            "\1\u02cc",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u02ce",
            "\1\u02cf",
            "\1\u02d0",
            "\1\u02d1",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\1\u02d3",
            "",
            "\1\u02d4",
            "\1\u02d5",
            "\1\u02d6",
            "\1\u02d7",
            "\1\u02d8",
            "\1\u02d9",
            "\1\u02da",
            "\1\u02db",
            "\1\u02dc",
            "\1\u02dd",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u02df",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\1\u02e1",
            "\1\u02e2",
            "\1\u02e3",
            "\1\u02e4",
            "\1\u02e5",
            "\1\u02e6",
            "\12\64\7\uffff\16\64\1\u02e7\3\64\1\u02e8\7\64\4\uffff\1\64"+
            "\1\uffff\32\64",
            "\1\u02ea",
            "\1\u02eb",
            "\1\u02ec",
            "\1\u02ed",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\1\u02ef",
            "\12\64\7\uffff\22\64\1\u02f0\7\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u02f2",
            "\1\u02f3",
            "\1\u02f4",
            "\1\u02f5",
            "\1\u02f6",
            "\1\u02f7",
            "\1\u02f9\23\uffff\1\u02f8",
            "\1\u02fa",
            "\1\u02fb",
            "\1\u02fc",
            "\1\u02fd",
            "\1\u02fe",
            "\1\u02ff",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0303",
            "\1\u0304",
            "\1\u0305",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0308",
            "",
            "\1\u0309",
            "\1\u030a",
            "\1\u030b",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u030d",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\12\u0243",
            "\12\u0243\10\uffff\1\u0170",
            "\12\u0244\10\uffff\1\u0170",
            "\1\u0173",
            "",
            "\1\u0310",
            "\1\u0312\4\uffff\1\u0311",
            "\1\u0313",
            "\12\64\7\uffff\22\64\1\u0314\7\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0317",
            "\1\u0318",
            "\1\u0319",
            "\1\u031a",
            "\1\u031b",
            "\1\u031c",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "",
            "\1\u031e",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0320",
            "\1\u0321",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0323",
            "\1\u0324",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0327",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u032a",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\1\u032c",
            "\1\u032d",
            "",
            "\1\u032e",
            "\1\u032f",
            "\1\u0330",
            "\1\u0331",
            "",
            "\1\u0332",
            "\1\u0333",
            "\1\u0334",
            "\1\u0335",
            "\1\u0336",
            "\1\u0337",
            "\1\u0338",
            "\1\u0339",
            "\1\u033a",
            "",
            "\1\u033b",
            "",
            "",
            "\1\u033c",
            "\1\u033d",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u033f",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0341",
            "\1\u0342",
            "\1\u0343",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0348",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "",
            "\1\u034a",
            "",
            "\1\u034b",
            "\1\u034c",
            "\12\64\7\uffff\4\64\1\u034d\25\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u034f",
            "\1\u0351\1\uffff\1\u0350",
            "",
            "\1\u0352",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0354",
            "\1\u0355",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0357",
            "\1\u0358",
            "\1\u0359",
            "\1\u035a",
            "\1\u035b",
            "\1\u035c",
            "\1\u035d",
            "\1\u035e",
            "\1\u035f",
            "\1\u0360",
            "",
            "\12\64\7\uffff\10\64\1\u0361\21\64\4\uffff\1\64\1\uffff\32"+
            "\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0364",
            "",
            "\1\u0365",
            "\1\u0366",
            "\1\u0367",
            "\1\u0368",
            "\1\u0369",
            "\1\u036a",
            "\1\u036b",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\1\u036e",
            "\1\u036f",
            "\1\u0370",
            "\12\64\7\uffff\17\64\1\u0371\12\64\4\uffff\1\64\1\uffff\32"+
            "\64",
            "",
            "",
            "\1\u0373",
            "",
            "\1\u0374",
            "\1\u0375",
            "",
            "\1\u0376",
            "\1\u0377",
            "\1\u0378",
            "\1\u0379",
            "\1\u037a",
            "\1\u037b",
            "\1\u037c",
            "\1\u037d",
            "\1\u037e",
            "\12\64\7\uffff\23\64\1\u037f\6\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0382",
            "",
            "\1\u0383",
            "\1\u0384",
            "\1\u0385",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\1\u0387",
            "\1\u0388",
            "\1\u0389",
            "\1\u038a",
            "\1\u038b",
            "\1\u038c",
            "\1\u038d",
            "\1\u038e",
            "\1\u0390\22\uffff\1\u038f",
            "\1\u0391",
            "\1\u0392",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0395",
            "\1\u0396",
            "\1\u0397",
            "\1\u0398",
            "\1\u0399",
            "\1\u039a",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\1\u039c",
            "\1\u039d",
            "\1\u039e",
            "\1\u039f",
            "",
            "\1\u03a0",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\1\u03a2",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u03a5",
            "\1\u03a6",
            "\1\u03a7",
            "\1\u03a8",
            "\1\u03a9",
            "\1\u03aa",
            "\1\u03ab",
            "\1\u03ac",
            "\1\u03ad",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u03af",
            "",
            "",
            "",
            "\1\u03b0",
            "\1\u03b1",
            "\1\u03b2",
            "",
            "",
            "\1\u03b3",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u03b5",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\1\u03b7",
            "",
            "",
            "\1\u03b8",
            "\1\u03b9",
            "\1\u03ba",
            "\1\u03bb",
            "\12\64\7\uffff\1\u03bc\31\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "",
            "\1\u03be",
            "\1\u03bf",
            "\1\u03c0",
            "\1\u03c1",
            "\1\u03c2",
            "\1\u03c3",
            "",
            "\1\u03c4",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u03c6",
            "",
            "\12\64\7\uffff\23\64\1\u03c7\6\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u03c9",
            "",
            "",
            "\1\u03ca",
            "",
            "",
            "\1\u03cb",
            "",
            "\1\u03cc",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u03ce",
            "\1\u03cf",
            "\1\u03d0",
            "\1\u03d1",
            "\1\u03d2",
            "\1\u03d3",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u03d5",
            "\1\u03d6",
            "\1\u03d7",
            "\1\u03d8",
            "\1\u03d9",
            "\1\u03da",
            "\1\u03db",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u03dd",
            "",
            "\1\u03de",
            "",
            "\1\u03e0\1\uffff\1\u03df",
            "\1\u03e1",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "",
            "",
            "",
            "\1\u03e3",
            "",
            "\1\u03e4",
            "\1\u03e5",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u03e7",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u03e9",
            "\1\u03ea",
            "\1\u03eb",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\1\u03ee",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u03f1",
            "\1\u03f2",
            "\1\u03f3",
            "\1\u03f4",
            "\1\u03f5",
            "\1\u03f6",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u03f8",
            "",
            "",
            "\1\u03f9",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\22\64\1\u03fc\7\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u03ff",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0401",
            "",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0404",
            "\1\u0405",
            "",
            "\1\u0406",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0409",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u040c",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u040e",
            "\12\64\7\uffff\22\64\1\u040f\7\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0412",
            "\1\u0413",
            "",
            "",
            "\1\u0414",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0416",
            "\1\u0417",
            "",
            "\1\u0418",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u041a",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u041c",
            "\1\u041d",
            "\1\u041e",
            "\1\u041f",
            "\1\u0420",
            "\1\u0421",
            "\1\u0422",
            "\1\u0423",
            "",
            "",
            "\1\u0424",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0426",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0429",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u042c\4\uffff\1\u042d",
            "\1\u042e",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "",
            "\12\64\7\uffff\22\64\1\u0431\7\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0433",
            "\1\u0434",
            "\1\u0435",
            "\1\u0436",
            "\1\u0437",
            "\1\u0438",
            "\1\u0439",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u043c",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u043e",
            "\1\u043f",
            "",
            "\1\u0440",
            "",
            "\1\u0441",
            "\1\u0442",
            "\1\u0443",
            "\1\u0444",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0446",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0448",
            "\1\u0449",
            "\1\u044a",
            "\1\u044b",
            "\1\u044c",
            "\1\u044d",
            "",
            "\1\u044e",
            "\1\u044f",
            "",
            "\1\u0450",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0455",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0457",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0459",
            "",
            "\1\u045a",
            "\1\u045b",
            "\1\u045c",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u045e",
            "\1\u045f",
            "\1\u0460",
            "",
            "\1\u0461",
            "\1\u0462",
            "\1\u0463",
            "\1\u0464",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\1\u0466",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\1\u046a",
            "\1\u046b",
            "\1\u046c",
            "",
            "",
            "\1\u046d",
            "",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u046f",
            "\1\u0470",
            "\1\u0471",
            "\1\u0472",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\1\u0474",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\1\u0478",
            "",
            "",
            "\1\u0479",
            "\1\u047a",
            "\1\u047b",
            "",
            "",
            "\1\u047c",
            "",
            "",
            "\1\u047d",
            "",
            "\1\u047e",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "",
            "\1\u0480",
            "\1\u0481",
            "\1\u0482",
            "",
            "\1\u0483",
            "\1\u0484",
            "\1\u0485",
            "",
            "\1\u0486",
            "",
            "\1\u0487",
            "\1\u0488",
            "\1\u0489",
            "\1\u048a",
            "\1\u048b",
            "\1\u048c",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "",
            "\1\u0491",
            "",
            "",
            "\1\u0492",
            "\1\u0493",
            "\1\u0494",
            "",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\1\u0496",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\10\64\1\u0499\21\64\4\uffff\1\64\1\uffff\32"+
            "\64",
            "\1\u049b",
            "\1\u049c",
            "\12\64\7\uffff\4\64\1\u049d\15\64\1\u049e\7\64\4\uffff\1\64"+
            "\1\uffff\32\64",
            "",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u04a3",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u04a6",
            "\1\u04a7",
            "",
            "\1\u04a8",
            "",
            "\1\u04a9",
            "\1\u04aa",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u04ac",
            "\1\u04ad",
            "\12\64\7\uffff\22\64\1\u04ae\7\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u04b0",
            "\1\u04b1",
            "\1\u04b2",
            "",
            "",
            "",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\1\u04b5",
            "\1\u04b6",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u04b8",
            "",
            "\1\u04ba\17\uffff\1\u04b9",
            "\12\64\7\uffff\22\64\1\u04bb\7\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u04be",
            "\1\u04bf",
            "\1\u04c0",
            "\1\u04c1",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "",
            "",
            "\1\u04c3",
            "\1\u04c4",
            "\1\u04c5",
            "\1\u04c6",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u04c9",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "",
            "",
            "\1\u04cc",
            "\1\u04cd",
            "\1\u04ce",
            "\1\u04cf",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u04d1",
            "\1\u04d2",
            "",
            "\1\u04d3",
            "\1\u04d4",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u04d6",
            "\1\u04d7",
            "\1\u04d8",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u04da",
            "\1\u04db",
            "\1\u04dc",
            "\1\u04dd",
            "\1\u04de",
            "\1\u04df",
            "",
            "",
            "",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u04e1",
            "\1\u04e2",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\1\u04e4",
            "",
            "",
            "\1\u04e5",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u04e7",
            "\1\u04e8",
            "\1\u04e9",
            "",
            "",
            "",
            "",
            "\1\u04ea",
            "",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u04ec",
            "\1\u04ed",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u04ef",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u04f1",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\1\u04f3",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u04f7",
            "",
            "\1\u04f8",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u04fa",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "",
            "\1\u04fc",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u04fe",
            "\1\u04ff",
            "",
            "\1\u0500",
            "\1\u0501",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0503",
            "",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "",
            "\1\u0505",
            "\1\u0506",
            "\1\u0507",
            "\1\u0508",
            "",
            "\1\u0509",
            "\1\u050a",
            "\1\u050b",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u050f",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0511",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0513",
            "\12\64\7\uffff\4\64\1\u0515\15\64\1\u0514\7\64\4\uffff\1\64"+
            "\1\uffff\32\64",
            "\1\u0517",
            "",
            "\1\u0518",
            "\1\u0519",
            "",
            "\1\u051a",
            "\1\u051b",
            "",
            "\1\u051c",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u051e",
            "\1\u051f",
            "",
            "\1\u0520",
            "\1\u0521",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\1\u0523",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\1\u0527",
            "",
            "\1\u0528",
            "",
            "\1\u0529",
            "\1\u052a",
            "\1\u052b",
            "\1\u052c",
            "",
            "\1\u052d",
            "",
            "\1\u052e",
            "\1\u052f",
            "\1\u0530",
            "\1\u0531",
            "\1\u0532",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "",
            "",
            "\1\u0535",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0539",
            "",
            "\1\u053a",
            "\1\u053b",
            "\1\u053c",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u053e",
            "\1\u053f",
            "",
            "\1\u0540",
            "\1\u0541",
            "\1\u0542",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\1\u0544",
            "",
            "",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0546",
            "\1\u0547",
            "\1\u0548",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u054b",
            "\1\u054c",
            "\1\u054d",
            "\1\u054e",
            "\1\u054f",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "",
            "\1\u0551",
            "",
            "",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0554",
            "\1\u0555",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0558",
            "\1\u0559",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\1\u055b",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "",
            "\1\u055f",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0562",
            "\1\u0563",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "",
            "\1\u0567",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "",
            "\1\u056b",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "",
            "",
            "\1\u056e",
            "",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            ""
    };

    static final short[] DFA25_eot = DFA.unpackEncodedString(DFA25_eotS);
    static final short[] DFA25_eof = DFA.unpackEncodedString(DFA25_eofS);
    static final char[] DFA25_min = DFA.unpackEncodedStringToUnsignedChars(DFA25_minS);
    static final char[] DFA25_max = DFA.unpackEncodedStringToUnsignedChars(DFA25_maxS);
    static final short[] DFA25_accept = DFA.unpackEncodedString(DFA25_acceptS);
    static final short[] DFA25_special = DFA.unpackEncodedString(DFA25_specialS);
    static final short[][] DFA25_transition;

    static {
        int numStates = DFA25_transitionS.length;
        DFA25_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA25_transition[i] = DFA.unpackEncodedString(DFA25_transitionS[i]);
        }
    }

    class DFA25 extends DFA {

        public DFA25(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 25;
            this.eot = DFA25_eot;
            this.eof = DFA25_eof;
            this.min = DFA25_min;
            this.max = DFA25_max;
            this.accept = DFA25_accept;
            this.special = DFA25_special;
            this.transition = DFA25_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( KW_TRUE | KW_FALSE | KW_ALL | KW_NONE | KW_DEFAULT | KW_AND | KW_OR | KW_NOT | KW_LIKE | KW_IF | KW_EXISTS | KW_ASC | KW_DESC | KW_ORDER | KW_GROUP | KW_BY | KW_HAVING | KW_WHERE | KW_FROM | KW_AS | KW_SELECT | KW_DISTINCT | KW_INSERT | KW_OVERWRITE | KW_OUTER | KW_UNIQUEJOIN | KW_PRESERVE | KW_JOIN | KW_LEFT | KW_RIGHT | KW_FULL | KW_ON | KW_PARTITION | KW_PARTITIONS | KW_TABLE | KW_TABLES | KW_COLUMNS | KW_INDEX | KW_INDEXES | KW_REBUILD | KW_FUNCTIONS | KW_SHOW | KW_MSCK | KW_REPAIR | KW_DIRECTORY | KW_LOCAL | KW_TRANSFORM | KW_USING | KW_CLUSTER | KW_DISTRIBUTE | KW_SORT | KW_UNION | KW_LOAD | KW_EXPORT | KW_IMPORT | KW_DATA | KW_INPATH | KW_IS | KW_NULL | KW_CREATE | KW_EXTERNAL | KW_ALTER | KW_CHANGE | KW_COLUMN | KW_FIRST | KW_AFTER | KW_DESCRIBE | KW_DROP | KW_RENAME | KW_IGNORE | KW_PROTECTION | KW_TO | KW_COMMENT | KW_BOOLEAN | KW_TINYINT | KW_SMALLINT | KW_INT | KW_BIGINT | KW_FLOAT | KW_DOUBLE | KW_DATE | KW_DATETIME | KW_TIMESTAMP | KW_DECIMAL | KW_STRING | KW_CHAR | KW_VARCHAR | KW_ARRAY | KW_STRUCT | KW_MAP | KW_UNIONTYPE | KW_REDUCE | KW_PARTITIONED | KW_CLUSTERED | KW_SORTED | KW_INTO | KW_BUCKETS | KW_ROW | KW_ROWS | KW_FORMAT | KW_DELIMITED | KW_FIELDS | KW_TERMINATED | KW_ESCAPED | KW_COLLECTION | KW_ITEMS | KW_KEYS | KW_KEY_TYPE | KW_LINES | KW_STORED | KW_FILEFORMAT | KW_SEQUENCEFILE | KW_TEXTFILE | KW_RCFILE | KW_ORCFILE | KW_PARQUETFILE | KW_INPUTFORMAT | KW_OUTPUTFORMAT | KW_INPUTDRIVER | KW_OUTPUTDRIVER | KW_OFFLINE | KW_ENABLE | KW_DISABLE | KW_READONLY | KW_NO_DROP | KW_LOCATION | KW_TABLESAMPLE | KW_BUCKET | KW_OUT | KW_OF | KW_PERCENT | KW_CAST | KW_ADD | KW_REPLACE | KW_RLIKE | KW_REGEXP | KW_TEMPORARY | KW_FUNCTION | KW_MACRO | KW_FILE | KW_JAR | KW_EXPLAIN | KW_EXTENDED | KW_FORMATTED | KW_PRETTY | KW_DEPENDENCY | KW_LOGICAL | KW_SERDE | KW_WITH | KW_DEFERRED | KW_SERDEPROPERTIES | KW_DBPROPERTIES | KW_LIMIT | KW_SET | KW_UNSET | KW_TBLPROPERTIES | KW_IDXPROPERTIES | KW_VALUE_TYPE | KW_ELEM_TYPE | KW_DEFINED | KW_CASE | KW_WHEN | KW_THEN | KW_ELSE | KW_END | KW_MAPJOIN | KW_STREAMTABLE | KW_HOLD_DDLTIME | KW_CLUSTERSTATUS | KW_UTC | KW_UTCTIMESTAMP | KW_LONG | KW_DELETE | KW_PLUS | KW_MINUS | KW_FETCH | KW_INTERSECT | KW_VIEW | KW_IN | KW_DATABASE | KW_DATABASES | KW_MATERIALIZED | KW_SCHEMA | KW_SCHEMAS | KW_GRANT | KW_REVOKE | KW_SSL | KW_UNDO | KW_LOCK | KW_LOCKS | KW_UNLOCK | KW_SHARED | KW_EXCLUSIVE | KW_PROCEDURE | KW_UNSIGNED | KW_WHILE | KW_READ | KW_READS | KW_PURGE | KW_RANGE | KW_ANALYZE | KW_BEFORE | KW_BETWEEN | KW_BOTH | KW_BINARY | KW_CROSS | KW_CONTINUE | KW_CURSOR | KW_TRIGGER | KW_RECORDREADER | KW_RECORDWRITER | KW_SEMI | KW_LATERAL | KW_TOUCH | KW_ARCHIVE | KW_UNARCHIVE | KW_COMPUTE | KW_STATISTICS | KW_USE | KW_OPTION | KW_CONCATENATE | KW_SHOW_DATABASE | KW_UPDATE | KW_RESTRICT | KW_CASCADE | KW_SKEWED | KW_ROLLUP | KW_CUBE | KW_DIRECTORIES | KW_FOR | KW_WINDOW | KW_UNBOUNDED | KW_PRECEDING | KW_FOLLOWING | KW_CURRENT | KW_LESS | KW_MORE | KW_OVER | KW_GROUPING | KW_SETS | KW_TRUNCATE | KW_NOSCAN | KW_PARTIALSCAN | KW_USER | KW_ROLE | KW_ROLES | KW_INNER | KW_EXCHANGE | KW_ADMIN | KW_OWNER | KW_PRINCIPALS | KW_COMPACT | KW_COMPACTIONS | KW_TRANSACTIONS | DOT | COLON | COMMA | SEMICOLON | LPAREN | RPAREN | LSQUARE | RSQUARE | LCURLY | RCURLY | EQUAL | EQUAL_NS | NOTEQUAL | LESSTHANOREQUALTO | LESSTHAN | GREATERTHANOREQUALTO | GREATERTHAN | DIVIDE | PLUS | MINUS | STAR | MOD | DIV | AMPERSAND | TILDE | BITWISEOR | BITWISEXOR | QUESTION | DOLLAR | StringLiteral | CharSetLiteral | BigintLiteral | SmallintLiteral | TinyintLiteral | DecimalLiteral | ByteLengthLiteral | Number | Identifier | CharSetName | WS | COMMENT );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA25_48 = input.LA(1);

                        s = -1;
                        if ( ((LA25_48 >= '\u0000' && LA25_48 <= '&')||(LA25_48 >= '(' && LA25_48 <= '[')||(LA25_48 >= ']' && LA25_48 <= '\uFFFF')) ) {s = 165;}

                        else if ( (LA25_48=='\\') ) {s = 166;}

                        else if ( (LA25_48=='\'') ) {s = 167;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA25_166 = input.LA(1);

                        s = -1;
                        if ( ((LA25_166 >= '\u0000' && LA25_166 <= '\uFFFF')) ) {s = 359;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA25_169 = input.LA(1);

                        s = -1;
                        if ( ((LA25_169 >= '\u0000' && LA25_169 <= '\uFFFF')) ) {s = 361;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA25_49 = input.LA(1);

                        s = -1;
                        if ( ((LA25_49 >= '\u0000' && LA25_49 <= '!')||(LA25_49 >= '#' && LA25_49 <= '[')||(LA25_49 >= ']' && LA25_49 <= '\uFFFF')) ) {s = 168;}

                        else if ( (LA25_49=='\\') ) {s = 169;}

                        else if ( (LA25_49=='\"') ) {s = 170;}

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA25_361 = input.LA(1);

                        s = -1;
                        if ( (LA25_361=='\"') ) {s = 170;}

                        else if ( ((LA25_361 >= '\u0000' && LA25_361 <= '!')||(LA25_361 >= '#' && LA25_361 <= '[')||(LA25_361 >= ']' && LA25_361 <= '\uFFFF')) ) {s = 168;}

                        else if ( (LA25_361=='\\') ) {s = 169;}

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA25_168 = input.LA(1);

                        s = -1;
                        if ( (LA25_168=='\"') ) {s = 170;}

                        else if ( ((LA25_168 >= '\u0000' && LA25_168 <= '!')||(LA25_168 >= '#' && LA25_168 <= '[')||(LA25_168 >= ']' && LA25_168 <= '\uFFFF')) ) {s = 168;}

                        else if ( (LA25_168=='\\') ) {s = 169;}

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA25_165 = input.LA(1);

                        s = -1;
                        if ( (LA25_165=='\'') ) {s = 167;}

                        else if ( ((LA25_165 >= '\u0000' && LA25_165 <= '&')||(LA25_165 >= '(' && LA25_165 <= '[')||(LA25_165 >= ']' && LA25_165 <= '\uFFFF')) ) {s = 165;}

                        else if ( (LA25_165=='\\') ) {s = 166;}

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA25_359 = input.LA(1);

                        s = -1;
                        if ( (LA25_359=='\'') ) {s = 167;}

                        else if ( ((LA25_359 >= '\u0000' && LA25_359 <= '&')||(LA25_359 >= '(' && LA25_359 <= '[')||(LA25_359 >= ']' && LA25_359 <= '\uFFFF')) ) {s = 165;}

                        else if ( (LA25_359=='\\') ) {s = 166;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 25, _s, input);
            error(nvae);
            throw nvae;
        }

    }
 

}