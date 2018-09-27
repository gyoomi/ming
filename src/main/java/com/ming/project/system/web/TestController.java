/**
 * Copyright © 2018, TaoDing
 * <p>
 * All Rights Reserved.
 */

package com.ming.project.system.web;

import org.apache.shiro.authz.annotation.RequiresPermissions;
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
    @RequiresPermissions(value = "system:admin:view")
    public String test() {
        return "test api001";
    }

    @RequestMapping(value = "/test02")
    @RequiresPermissions(value = "system:user:add")
    public String test2() {
        return "test api002";
    }

    @RequestMapping(value = "/test03")
    @RequiresPermissions(value = "system:dept:add")
    public String test3() {
        return "test api003";
    }

    @RequestMapping(value = "/test04")
    @RequiresPermissions(value = "system:main:add")
    public String test4() {
        return "test api004";
    }
}
