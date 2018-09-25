/**
 * Copyright © 2018, LeonKeh
 * <p>
 * All Rights Reserved.
 */

package com.ming.project.system.service.impl;

import com.ming.project.system.domain.UserEntity;
import com.ming.project.system.mapper.UserEntityMapper;
import com.ming.project.system.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 类功能描述
 *
 * @author Leon
 * @version 2018/9/25 22:03
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserEntityMapper userEntityMapper;

    /**
     * 根据登录名查询用户
     *
     * @param userName
     * @return
     */
    @Override
    public UserEntity findUserByUserName(String userName) {
        return userEntityMapper.findUserByUserName(userName);
    }
}
