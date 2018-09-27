/**
 * Copyright © 2018, TaoDing
 * <p>
 * All Rights Reserved.
 */

package com.ming.project.system.service;

import java.util.List;

/**
 * 接口功能描述
 *
 * @author Leon
 * @version 2018/9/27 17:36
 */
public interface MenuService {

    /**
     * Find the permissions'list by the id of current user
     *
     * @param userId
     * @return
     */
    List<String> findPermissionListByUserId(Integer userId);
}
