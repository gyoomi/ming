/**
 * Copyright © 2018, TaoDing
 * <p>
 * All Rights Reserved.
 */

package com.ming.project.system.web;

import com.ming.framework.web.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 类功能描述
 *
 * @author Leon
 * @version 2018/9/26 16:47
 */
@Controller
public class LoginController extends BaseController {

    @GetMapping(value = "/login")
    public ModelAndView login(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        if (isAjaxRequest(req)) {
            resp.setContentType("application/json");
            resp.setCharacterEncoding("UTF-8");
            resp.getWriter().print("{\"code\":\"1\",\"msg\":\"未登录或登录超时，请重新登录\"}");
            return null;
        }
        ModelAndView mv = new ModelAndView();
        mv.setViewName("test.html");
        return mv;
    }
}
