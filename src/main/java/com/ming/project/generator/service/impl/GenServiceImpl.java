/**
 * Copyright © 2018, LeonKeh
 * <p>
 * All Rights Reserved.
 */

package com.ming.project.generator.service.impl;

import com.ming.project.generator.domain.ColumnEntity;
import com.ming.project.generator.domain.TableEntity;
import com.ming.project.generator.mapper.GenMapper;
import com.ming.project.generator.service.GenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 类功能描述
 *
 * @author Leon
 * @version 2018/10/16 21:44
 */
@Service
public class GenServiceImpl implements GenService {

    @Autowired
    private GenMapper genMapper;

    @Override
    public void generatorCode(String tableName) {
        TableEntity table = genMapper.findTableByName(tableName);
        List<ColumnEntity> columns = genMapper.findColumnsByName(tableName);
    }
}
