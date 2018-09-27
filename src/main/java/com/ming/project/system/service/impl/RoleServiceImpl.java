/**
 * Copyright © 2018, TaoDing
 * <p>
 * All Rights Reserved.
 */

package com.ming.project.system.service.impl;

import com.ming.project.system.domain.RoleEntity;
import com.ming.project.system.mapper.RoleEntityMapper;
import com.ming.project.system.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 类功能描述
 *
 * @author Leon
 * @version 2018/9/27 17:36
 */
@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleEntityMapper roleEntityMapper;

    /**
     * Find the role'list by the id of current user
     *
     * @param userId
     * @return
     */
    @Override
    public List<RoleEntity> findRoleListByUserId(Integer userId) {
        return roleEntityMapper.findRoleListByUserId(userId);
    }
}
