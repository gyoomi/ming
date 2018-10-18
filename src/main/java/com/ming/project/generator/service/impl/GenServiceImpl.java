/**
 * Copyright © 2018, LeonKeh
 * <p>
 * All Rights Reserved.
 */

package com.ming.project.generator.service.impl;

import com.ming.common.constant.WebConstant;
import com.ming.common.properties.ProjectProperties;
import com.ming.common.util.GenUtils;
import com.ming.common.util.StringUtils;
import com.ming.project.generator.domain.ColumnEntity;
import com.ming.project.generator.domain.TableEntity;
import com.ming.project.generator.mapper.GenMapper;
import com.ming.project.generator.service.GenService;
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.FileWriter;
import java.io.StringWriter;
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

    @Autowired
    private ProjectProperties projectProperties;

    @Override
    public void generatorCode(String tableName) {
        TableEntity table = genMapper.findTableByName(tableName);
        List<ColumnEntity> columns = genMapper.findColumnsByName(tableName);
        generatorCode(table, columns);
        System.out.println("over");
    }

    private void generatorCode(TableEntity tableEntity, List<ColumnEntity> columns) {
        // 表、类
        String className = GenUtils.tableToJava(tableEntity.getTableName());
        tableEntity.setBigCamelCaseClassName(className);
        tableEntity.setLittleCamelCaseClassName(StringUtils.uncapitalize(className));
        tableEntity.setColumns(GenUtils.handleColumns(columns));
        tableEntity.setPrimary(tableEntity.getPrimaryColumn());
        GenUtils.initVelocity();
        String packageName = projectProperties.getGen().getPackageName();
        String moduleName = GenUtils.getModuleName(packageName);
        VelocityContext context = GenUtils.getVelocityContext(tableEntity);
        List<String> templates = GenUtils.getTemplates();
        templates.forEach(t -> {
            try {
                FileWriter fw = new FileWriter("d:\\" + GenUtils.getFileName(t, tableEntity, moduleName));
                StringWriter sw = new StringWriter();
                Template template = Velocity.getTemplate(t, WebConstant.DEFAULT_CHARSET);
                template.merge(context, sw);
                fw.write(sw.toString());
                fw.flush();
                fw.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public static void main(String[] args) throws Exception {
        FileWriter fw = new FileWriter("d:\\test\\test.txt");
        StringWriter sw = new StringWriter();
        sw.append("hhahahahhaljljoewrier");
        fw.write(sw.toString());
        sw.flush();
        fw.flush();
        sw.close();
        fw.close();
    }
}
