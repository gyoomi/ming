/**
 * Copyright © 2018, LeonKeh
 * <p>
 * All Rights Reserved.
 */

package com.ming.project.generator.web;

import com.ming.framework.web.BaseController;
import com.ming.project.generator.service.GenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * 类功能描述
 *
 * @author Leon
 * @version 2018/10/16 21:41
 */
@RestController
public class GenController extends BaseController {

    @Autowired
    private GenService genService;

    public void genCode(String tableName) {
        genService.generatorCode(tableName);
    }
}
