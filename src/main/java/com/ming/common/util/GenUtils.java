/**
 * Copyright © 2018, LeonKeh
 * <p>
 * All Rights Reserved.
 */

package com.ming.common.util;

import com.ming.common.constant.WebConstant;
import com.ming.common.properties.ProjectProperties;
import com.ming.project.generator.domain.ColumnEntity;
import com.ming.project.generator.domain.TableEntity;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.*;
import java.util.stream.Collectors;

/**
 * 类功能描述
 *
 * @author Leon
 * @version 2018/10/16 22:51
 */
@Component
public class GenUtils {

    private static ProjectProperties projectProperties;

    private static final String PROJECT_PATH = "main/java/com/ming";

    private static final String MAPPER_PATH = "main/resource/mapper";

    private static final Map<String, String> javaTypeMap = new HashMap<>(32);

    @Autowired(required = true)
    public void setProjectProperties(ProjectProperties projectProperties) {
        GenUtils.projectProperties = projectProperties;
    }
    /**
     *  表名转类名
     *
     * @param tableName
     * @return
     */
    public static String tableToJava(String tableName) {
        if (projectProperties.getGen().getAutoRemovePrefix()) {
            tableName = tableName.substring(tableName.indexOf("_") + 1);
        }
        return StringUtils.convertToCamelName(tableName.trim());
    }

    /**
     * 填充列信息
     *
     * @param columns
     * @return
     */
    public static List<ColumnEntity> handleColumns(List<ColumnEntity> columns) {
        return columns.stream().peek(column -> {
            column.setBigCamelCaseFieldName(StringUtils.convertToCamelName(column.getColumnName()));
            column.setLittleCamelCaseFieldName(StringUtils.uncapitalize(StringUtils.convertToCamelName(column.getColumnName())));
            column.setFieldType(javaTypeMap.get(column.getColumnType()));
        }).collect(Collectors.toList());
    }

    /**
     * 模板引擎资源初始化
     *
     */
    public static void initVelocity() {
        Properties p = new Properties();
        try {
            // 加载classPath下的vm文件
            p.setProperty("file.resource.loader.class", "org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader");
            p.setProperty(Velocity.ENCODING_DEFAULT, WebConstant.DEFAULT_CHARSET);
            p.setProperty(Velocity.OUTPUT_ENCODING, WebConstant.DEFAULT_CHARSET);
            Velocity.init(p);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 获取模块名
     *
     * @param packageName
     * @return
     */
    public static String getModuleName(String packageName) {
        if (StringUtils.isNotBlank(packageName)) {
           return StringUtils.substring(packageName, packageName.lastIndexOf(".") + 1, packageName.length());
        }
        return null;
    }

    public static VelocityContext getVelocityContext(TableEntity tableEntity) {
        VelocityContext velocityContext = new VelocityContext();
        velocityContext.put("tableName", tableEntity.getTableName());
        velocityContext.put("tableComment", tableEntity.getTableComment());
        velocityContext.put("primary", tableEntity.getPrimary());
        velocityContext.put("bigCamelCaseClassName", tableEntity.getBigCamelCaseClassName());
        velocityContext.put("littleCamelCaseClassName", tableEntity.getLittleCamelCaseClassName());
        velocityContext.put("moduleName", getModuleName(projectProperties.getGen().getPackageName()));
        velocityContext.put("package", projectProperties.getGen().getPackageName());
        velocityContext.put("columns", tableEntity.getColumns());
        velocityContext.put("datetime", DateFormatUtils.format(new Date(), "yyyy/MM/dd HH:mm"));
        velocityContext.put("author", projectProperties.getGen().getAuthor());
        return velocityContext;
    }

    /**
     * 获取模板信息
     *
     * @return
     */
    public static List<String> getTemplates() {
        List<String> templates = new ArrayList<>();
        templates.add("vm/java/Controller.java.vm");
        templates.add("vm/java/Domain.java.vm");
        templates.add("vm/java/Mapper.java.vm");
        templates.add("vm/java/Service.java.vm");
        templates.add("vm/java/ServiceImpl.java.vm");
        templates.add("vm/mapper/Mapper.xml.vm");
        return templates;
    }

    /**
     * 动态获取文件名
     *
     * @param template
     * @param tableEntity
     * @param moduleName
     * @return
     */
    public static String getFileName(String template, TableEntity tableEntity, String moduleName) {
        String littleCamelCaseClassName = tableEntity.getLittleCamelCaseClassName();
        String bigCamelCaseClassName = tableEntity.getBigCamelCaseClassName();
        String javaPath = PROJECT_PATH + "/" + moduleName + "/";
        String mapperPath = MAPPER_PATH + "/" + moduleName + "/" + littleCamelCaseClassName;
        if (template.contains("Domain.java.vm")) {
            return javaPath + "domain" + "/" + bigCamelCaseClassName + "Entity.java";
        }
        if (template.contains("Mapper.java.vm")) {
            return javaPath + "mapper" + "/" + bigCamelCaseClassName + "Mapper.java";
        }
        if (template.contains("Service.java.vm")) {
            return javaPath + "service" + "/" + bigCamelCaseClassName + "Service.java";
        }
        if (template.contains("ServiceImpl.java.vm")) {
            return javaPath + "service/impl" + "/" + bigCamelCaseClassName + "ServiceImpl.java";
        }
        if (template.contains("Controller.java.vm")) {
            return javaPath + "web/controller" + "/" + bigCamelCaseClassName + "Controller.java";
        }
        if (template.contains("Mapper.xml.vm")) {
            return mapperPath + bigCamelCaseClassName +  "Mapper.xml";
        }
        return null;
    }

    static {
        javaTypeMap.put("tinyint", "Integer");
        javaTypeMap.put("smallint", "Integer");
        javaTypeMap.put("mediumint", "Integer");
        javaTypeMap.put("int", "Integer");
        javaTypeMap.put("integer", "Integer");
        javaTypeMap.put("bigint", "Long");
        javaTypeMap.put("float", "Float");
        javaTypeMap.put("double", "Double");
        javaTypeMap.put("decimal", "BigDecimal");
        javaTypeMap.put("bit", "Boolean");
        javaTypeMap.put("char", "String");
        javaTypeMap.put("varchar", "String");
        javaTypeMap.put("tinytext", "String");
        javaTypeMap.put("text", "String");
        javaTypeMap.put("mediumtext", "String");
        javaTypeMap.put("longtext", "String");
        javaTypeMap.put("time", "Date");
        javaTypeMap.put("date", "Date");
        javaTypeMap.put("datetime", "Date");
        javaTypeMap.put("timestamp", "Date");
    }
}
