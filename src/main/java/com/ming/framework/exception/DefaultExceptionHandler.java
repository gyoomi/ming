/**
 * Copyright © 2018, TaoDing
 * <p>
 * All Rights Reserved.
 */

package com.ming.framework.exception;

import org.apache.shiro.authz.AuthorizationException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Global exception resolver
 *
 * @author Leon
 * @version 2018/9/28 10:18
 */
@ControllerAdvice
public class DefaultExceptionHandler {

    @ExceptionHandler(value = AuthorizationException.class)
    public String handleAuthorizationException(HttpServletRequest req, HttpServletResponse resp, AuthorizationException e) {
        return "/error/unauth";
    }
}
