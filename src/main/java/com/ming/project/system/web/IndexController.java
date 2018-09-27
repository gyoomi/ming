/**
 * Copyright © 2018, TaoDing
 * <p>
 * All Rights Reserved.
 */

package com.ming.project.system.web;

import com.ming.framework.web.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 类功能描述
 *
 * @author Leon
 * @version 2018/9/27 14:16
 */
@Controller
public class IndexController extends BaseController {

    /**
     * 首页跳转
     *
     * @param map
     * @return
     */
    @GetMapping(value = "/index")
    public String index(ModelMap map) {
        return "index";
    }
}
