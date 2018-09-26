/**
 * Copyright © 2018, TaoDing
 * <p>
 * All Rights Reserved.
 */

package com.ming.framework.web;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * 类功能描述
 *
 * @author Leon
 * @version 2018/9/26 16:49
 */
public abstract class BaseController {
    private static final Logger lg = LoggerFactory.getLogger(BaseController.class);

    public BaseController() {}

    /**
     * 判断是否为ajax请求
     *
     * @param req
     * @return
     */
    public static boolean isAjaxRequest(HttpServletRequest req) {
        return StringUtils.isNotBlank(req.getHeader("X-Requested-With")) && "XMLHttpRequest".equals(req.getHeader("X-Requested-With"));
    }

    /**
     * 成功响应
     *
     * @param msg
     * @return
     */
    public String success(String msg) {
        return "{\"code\" : \"200\", \"msg\" : \""+ msg +"\"}";
    }

    /**
     * 成功响应
     *
     * @param msg
     * @return
     */
    public Map<String, Object> success(String msg, Object object) {
        Map<String, Object> resultMap = new HashMap<>();
        resultMap.put("code", 200);
        resultMap.put("msg", msg);
        resultMap.put("data", object);
        return resultMap;
    }

    /**
     * 失败响应
     *
     * @param msg
     * @return
     */
    public String error(String msg) {
        return "{\"code\" : \"500\", \"msg\" : \""+ msg +"\"}";
    }
}
