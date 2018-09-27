/**
 * Copyright © 2018, TaoDing
 * <p>
 * All Rights Reserved.
 */

package com.ming.project.system.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 类功能描述
 *
 * @author Leon
 * @version 2018/9/27 17:08
 */
@RestController
public class TestController {

    @RequestMapping(value = "/test01")
    public String test() {
        return "test api001";
    }

    @RequestMapping(value = "/test02")
    public String test2() {
        return "test api002";
    }
}
