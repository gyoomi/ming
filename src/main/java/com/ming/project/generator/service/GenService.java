/**
 * Copyright © 2018, LeonKeh
 * <p>
 * All Rights Reserved.
 */

package com.ming.project.generator.service;

/**
 * 接口功能描述
 *
 * @author Leon
 * @version 2018/10/16 21:43
 */
public interface GenService {

    /**
     * 生成
     *
     * @param tableName
     */
    void generatorCode(String tableName);

    /**
     * 批量生成
     *
     * @param tableNames
     */
    void batchGeneratorCode(String[] tableNames);
}
