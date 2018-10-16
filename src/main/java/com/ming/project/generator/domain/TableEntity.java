/**
 * Copyright © 2018, LeonKeh
 * <p>
 * All Rights Reserved.
 */

package com.ming.project.generator.domain;

import com.ming.framework.BaseEntity;
import org.apache.commons.collections.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Db'table
 *
 * @author Leon
 * @version 2018/10/16 21:20
 */
public class TableEntity extends BaseEntity {

    private String tableName;

    private String tableComment;

    private String bigCamelCaseClassName;

    private String littleCamelCaseClassName;

    private ColumnEntity primary;

    private List<ColumnEntity> columns = new ArrayList<>();

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getTableComment() {
        return tableComment;
    }

    public void setTableComment(String tableComment) {
        this.tableComment = tableComment;
    }

    public String getBigCamelCaseClassName() {
        return bigCamelCaseClassName;
    }

    public void setBigCamelCaseClassName(String bigCamelCaseClassName) {
        this.bigCamelCaseClassName = bigCamelCaseClassName;
    }

    public String getLittleCamelCaseClassName() {
        return littleCamelCaseClassName;
    }

    public void setLittleCamelCaseClassName(String littleCamelCaseClassName) {
        this.littleCamelCaseClassName = littleCamelCaseClassName;
    }

    public ColumnEntity getPrimary() {
        return primary;
    }

    public void setPrimary(ColumnEntity primary) {
        this.primary = primary;
    }

    public List<ColumnEntity> getColumns() {
        return columns;
    }

    public void setColumns(List<ColumnEntity> columns) {
        this.columns = columns;
    }

    public ColumnEntity getPrimaryColumn() {
        if (CollectionUtils.isNotEmpty(columns)) {
            return columns.get(0);
        }
        return null;
    }
}
