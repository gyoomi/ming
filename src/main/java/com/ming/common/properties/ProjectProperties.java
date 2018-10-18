/**
 * Copyright © 2018, TaoDing
 * <p>
 * All Rights Reserved.
 */

package com.ming.common.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 类功能描述
 *
 * @author Leon
 * @version 2018/10/17 10:31
 */
@ConfigurationProperties(prefix = "ming.common")
public class ProjectProperties {

    private GenProperties gen = new GenProperties();

    public GenProperties getGen() {
        return gen;
    }

    public void setGen(GenProperties gen) {
        this.gen = gen;
    }
}
