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
 
package org.apache.hadoop.hive.ql.exec.vector.expressions.gen;

import org.apache.hadoop.hive.ql.exec.vector.expressions.VectorExpression;
import org.apache.hadoop.hive.ql.exec.vector.DecimalColumnVector;
import org.apache.hadoop.hive.ql.exec.vector.VectorizedRowBatch;
import org.apache.hadoop.hive.ql.exec.vector.expressions.NullUtil;
import org.apache.hadoop.hive.ql.exec.vector.expressions.DecimalUtil;
import org.apache.hadoop.hive.ql.exec.vector.VectorExpressionDescriptor;
import org.apache.hadoop.hive.common.type.Decimal128;

/**
 * Generated from template ScalarArithmeticColumnDecimal.txt, which covers binary arithmetic 
 * expressions between a scalar and a column.
 */
public class DecimalScalarMultiplyDecimalColumn extends VectorExpression {

  private static final long serialVersionUID = 1L;

  private int colNum;
  private Decimal128 value;
  private int outputColumn;

  public DecimalScalarMultiplyDecimalColumn(Decimal128 value, int colNum, int outputColumn) {
    this.colNum = colNum;
    this.value = value;
    this.outputColumn = outputColumn;
    this.outputType = "decimal";
  }

  public DecimalScalarMultiplyDecimalColumn() {
    this.outputType = "decimal";
  }

  @Override
  public void evaluate(VectorizedRowBatch batch) {

    if (childExpressions != null) {
      super.evaluateChildren(batch);
    }

    DecimalColumnVector inputColVector = (DecimalColumnVector) batch.cols[colNum];
    DecimalColumnVector outputColVector = (DecimalColumnVector) batch.cols[outputColumn];
    int[] sel = batch.selected;
    boolean[] inputIsNull = inputColVector.isNull;
    boolean[] outputIsNull = outputColVector.isNull;
    outputColVector.noNulls = inputColVector.noNulls;
    outputColVector.isRepeating = inputColVector.isRepeating;
    int n = batch.size;
    Decimal128[] vector = inputColVector.vector;
    
    // return immediately if batch is empty
    if (n == 0) {
      return;
    }
         
    if (inputColVector.noNulls) {
    
     /* Initialize output vector NULL values to false. This is necessary
      * since the decimal operation may produce a NULL result even for 
      * a non-null input vector value, and convert the output vector
      * to have noNulls = false;
      */
      NullUtil.initOutputNullsToFalse(outputColVector, inputColVector.isRepeating, 
          batch.selectedInUse, sel, n);
    }

    if (inputColVector.isRepeating) {
      if (!inputColVector.noNulls) {
        outputIsNull[0] = inputIsNull[0];
      } 
      
      // The following may override a "false" null setting if an error or overflow occurs.
      DecimalUtil.multiplyChecked(0, value, vector[0], outputColVector);
    } else if (inputColVector.noNulls) {
      if (batch.selectedInUse) {
        for(int j = 0; j != n; j++) {
          int i = sel[j];
          DecimalUtil.multiplyChecked(i, value, vector[i], outputColVector);
        }
      } else {
        for(int i = 0; i != n; i++) {
          DecimalUtil.multiplyChecked(i, value, vector[i], outputColVector);
        }
      }
    } else /* there are nulls */ {
      if (batch.selectedInUse) {
        for(int j = 0; j != n; j++) {
          int i = sel[j];
          outputIsNull[i] = inputIsNull[i];

          // The following may override a "false" null setting if an error or overflow occurs.
          DecimalUtil.multiplyChecked(i, value, vector[i], outputColVector);
        }
      } else {
        System.arraycopy(inputIsNull, 0, outputIsNull, 0, n);
        for(int i = 0; i != n; i++) {

          // The following may override a "false" null setting if an error or overflow occurs.
          DecimalUtil.multiplyChecked(i, value, vector[i], outputColVector);
        }
      }
    }
    
    NullUtil.setNullDataEntriesDecimal(outputColVector, batch.selectedInUse, sel, n);
  }

  @Override
  public int getOutputColumn() {
    return outputColumn;
  }
  
  public int getColNum() {
    return colNum;
  }
  
  public void setColNum(int colNum) {
    this.colNum = colNum;
  }

  public Decimal128 getValue() {
    return value;
  }

  public void setValue(Decimal128 value) {
    this.value = value;
  }

  public void setOutputColumn(int outputColumn) {
    this.outputColumn = outputColumn;
  }

  @Override
  public VectorExpressionDescriptor.Descriptor getDescriptor() {
    return (new VectorExpressionDescriptor.Builder())
        .setMode(
            VectorExpressionDescriptor.Mode.PROJECTION)
        .setNumArguments(2)
        .setArgumentTypes(
            VectorExpressionDescriptor.ArgumentType.getType("decimal"),
            VectorExpressionDescriptor.ArgumentType.getType("decimal"))
        .setInputExpressionTypes(
            VectorExpressionDescriptor.InputExpressionType.SCALAR,
            VectorExpressionDescriptor.InputExpressionType.COLUMN).build();
  }
}
