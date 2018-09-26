/**
 * Copyright © 2018, TaoDing
 * <p>
 * All Rights Reserved.
 */

package com.ming.framework.web;

import org.apache.commons.lang3.StringUtils;

import javax.servlet.http.HttpServletRequest;

/**
 * 类功能描述
 *
 * @author Leon
 * @version 2018/9/26 16:49
 */
public abstract class BaseController {

    public static boolean isAjaxRequest(HttpServletRequest req) {
        return StringUtils.isNotBlank(req.getHeader("X-Requested-With")) && "XMLHttpRequest".equals(req.getHeader("X-Requested-With"));
    }
}
