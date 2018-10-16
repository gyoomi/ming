/**
 * Copyright © 2018, LeonKeh
 * <p>
 * All Rights Reserved.
 */

package com.ming.project.generator.mapper;

import com.ming.project.generator.domain.ColumnEntity;
import com.ming.project.generator.domain.TableEntity;

import java.util.List;

/**
 * 接口功能描述
 *
 * @author Leon
 * @version 2018/10/16 21:45
 */
public interface GenMapper {

    TableEntity findTableByName(String tableName);


    List<ColumnEntity> findColumnsByName(String tableName);
}
