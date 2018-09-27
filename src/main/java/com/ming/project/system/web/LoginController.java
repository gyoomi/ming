/**
 * Copyright © 2018, TaoDing
 * <p>
 * All Rights Reserved.
 */

package com.ming.project.system.web;

import com.ming.framework.web.BaseController;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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

    /**
     * 登录页跳转
     *
     * @param req
     * @param resp
     * @return
     * @throws Exception
     */
    @GetMapping(value = "/login")
    public String login(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        if (isAjaxRequest(req)) {
            resp.setContentType("application/json");
            resp.setCharacterEncoding("UTF-8");
            resp.getWriter().print("{\"code\":\"1\",\"msg\":\"未登录或登录超时，请重新登录\"}");
            return null;
        }

        return "login";
    }

    @PostMapping(value = "/login")
    @ResponseBody
    public String login(String username, String password, Boolean rememberMe) {
        UsernamePasswordToken token = new UsernamePasswordToken(username, password);
        Subject subject = SecurityUtils.getSubject();
        subject.login(token);
        return success("ok");
    }

    @GetMapping(value = "/unauth")
    public String unAuth() {
        return "/error/unauth";
    }
}
