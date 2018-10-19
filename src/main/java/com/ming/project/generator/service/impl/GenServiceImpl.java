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

import java.io.File;
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
        for (String t : templates) {
            try {
                File f = new File(projectProperties.getGen().getGenDestDir() + GenUtils.getFileName(t, tableEntity, moduleName));
                fileProber(f);
                FileWriter fw = new FileWriter(f);
                StringWriter sw = new StringWriter();
                Template template = Velocity.getTemplate(t, WebConstant.DEFAULT_CHARSET);
                template.merge(context, sw);
                fw.write(sw.toString());
                fw.flush();
                fw.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 文件探测
     *
     * When the parent file not exist.Create it.
     *
     * @param dirFile
     * @throws Exception
     */
    public static void fileProber(File dirFile) throws Exception {
        File parentFile = dirFile.getParentFile();
        if (!parentFile.exists()) {
            fileProber(parentFile);
            parentFile.mkdirs();
        }
    }

}
