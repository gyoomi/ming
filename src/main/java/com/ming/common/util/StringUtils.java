/**
 * Copyright © 2018, TaoDing
 * <p>
 * All Rights Reserved.
 */

package com.ming.common.util;

import java.util.stream.Stream;

/**
 * 类功能描述
 *
 * @author Leon
 * @version 2018/10/17 11:35
 */
public class StringUtils extends org.apache.commons.lang3.StringUtils {

    public static String convertToCamelName(String name) {
        StringBuilder sb = new StringBuilder();
        if (isBlank(name)) {
            return "";
        } else if (!contains(name, "_")) {
            return name.substring(0, 1).toUpperCase() + name.substring(1);
        }
        String[] splits = split(name, "_");
        Stream.of(splits).forEach(s -> {
            if (isNotBlank(s)) {
                sb.append(s.substring(0, 1).toUpperCase());
                sb.append(s.substring(1).toLowerCase());
            }
        });
        return String.valueOf(sb);
    }

    public static void main(String[] args) {
        String type = convertToCamelName("project_type");
        System.out.println(type);
    }
}
