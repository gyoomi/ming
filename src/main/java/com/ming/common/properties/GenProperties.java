/**
 * Copyright © 2018, TaoDing
 * <p>
 * All Rights Reserved.
 */

package com.ming.common.properties;

/**
 * 类功能描述
 *
 * @author Leon
 * @version 2018/10/17 10:32
 */
public class GenProperties {

    private Boolean autoRemovePrefix = true;

    private String packageName = "com.ming.module";

    private String author = "Leon";

    public Boolean getAutoRemovePrefix() {
        return autoRemovePrefix;
    }

    public void setAutoRemovePrefix(Boolean autoRemovePrefix) {
        this.autoRemovePrefix = autoRemovePrefix;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
