/**
 * Copyright © 2018, TaoDing
 * <p>
 * All Rights Reserved.
 */

package com.ming.framework.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 类功能描述
 *
 * @author Leon
 * @version 2018/9/25 10:44
 */
@Controller
public class IndexController {
    private static Logger lg = LoggerFactory.getLogger(IndexController.class);

    @GetMapping(value = "/index1")
    public ModelAndView index() {
        ModelAndView mv = new ModelAndView();
        mv.addObject("user", "小明");
        mv.setViewName("/index.html");
        return mv;
    }
}
