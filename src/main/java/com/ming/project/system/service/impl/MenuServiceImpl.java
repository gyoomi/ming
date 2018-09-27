/**
 * Copyright © 2018, TaoDing
 * <p>
 * All Rights Reserved.
 */

package com.ming.project.system.service.impl;

import com.ming.project.system.mapper.MenuEntityMapper;
import com.ming.project.system.service.MenuService;
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
public class MenuServiceImpl implements MenuService {

    @Autowired
    private MenuEntityMapper menuEntityMapper;

    /**
     * Find the permissions'list by the id of current user
     *
     * @param userId
     * @return
     */
    @Override
    public List<String> findPermissionListByUserId(Integer userId) {
        return menuEntityMapper.findPermissionListByUserId(userId);
    }
}
