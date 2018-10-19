/**
 * Copyright © 2018, LeonKeh
 * <p>
 * All Rights Reserved.
 */

package com.ming.project.generator.domain;

import com.ming.framework.BaseEntity;

/**
 * The columns entity of table
 *
 * @author Leon
 * @version 2018/10/16 21:27
 */
public class ColumnEntity extends BaseEntity {

    private String columnName;

    private String columnType;

    private String columnComment;

    private String fieldType;

    /**
     * eg: user_name -> UserName
     */
    private String bigCamelCaseFieldName;

    /**
     * eg: user_name -> userName
     */
    private String littleCamelCaseFieldName;

    /**
     * 自增表示
     */
    private String extra;

    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    public String getColumnType() {
        return columnType;
    }

    public void setColumnType(String columnType) {
        this.columnType = columnType;
    }

    public String getColumnComment() {
        return columnComment;
    }

    public void setColumnComment(String columnComment) {
        this.columnComment = columnComment;
    }

    public String getFieldType() {
        return fieldType;
    }

    public void setFieldType(String fieldType) {
        this.fieldType = fieldType;
    }

    public String getBigCamelCaseFieldName() {
        return bigCamelCaseFieldName;
    }

    public void setBigCamelCaseFieldName(String bigCamelCaseFieldName) {
        this.bigCamelCaseFieldName = bigCamelCaseFieldName;
    }

    public String getLittleCamelCaseFieldName() {
        return littleCamelCaseFieldName;
    }

    public void setLittleCamelCaseFieldName(String littleCamelCaseFieldName) {
        this.littleCamelCaseFieldName = littleCamelCaseFieldName;
    }

    public String getExtra() {
        return extra;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }
}
