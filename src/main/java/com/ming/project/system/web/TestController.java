/**
 * Copyright © 2018, LeonKeh
 * <p>
 * All Rights Reserved.
 */

package com.ming.project.system.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 类功能描述
 *
 * @author Leon
 * @version 2018/9/25 22:55
 */
@RestController
public class TestController {

    @GetMapping(value = "/index")
    public String index() {
        return "shiro!!!";
    }

    @GetMapping(value = "/login")
    public String login() {
        return "login!!!";
    }
}
