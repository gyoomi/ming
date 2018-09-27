/**
 * Copyright © 2018, TaoDing
 * <p>
 * All Rights Reserved.
 */

package com.ming.project.system.service;

import com.ming.project.system.domain.RoleEntity;

import java.util.List;

/**
 * 类功能描述
 *
 * @author Leon
 * @version 2018/9/27 17:35
 */
public interface RoleService {

    /**
     * Find the role'list by the id of current user
     *
     * @param userId
     * @return
     */
    List<RoleEntity> findRoleListByUserId(Integer userId);
}
