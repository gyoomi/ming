/**
 * Copyright © 2018, TaoDing
 * <p>
 * All Rights Reserved.
 */

package com.ming.common.properties;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * 类功能描述
 *
 * @author Leon
 * @version 2018/10/18 14:24
 */
@Configuration
@EnableConfigurationProperties(ProjectProperties.class)
public class CoreConfig {

}
