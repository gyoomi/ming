/**
 * Copyright © 2018, LeonKeh
 * <p>
 * All Rights Reserved.
 */

package com.ming.project.system.service;

import com.ming.project.system.domain.UserEntity;

/**
 * 类功能描述
 *
 * @author Leon
 * @version 2018/9/25 22:02
 */
public interface UserService {

    /**
     * 根据登录名查询用户
     *
     * @param userName
     * @return
     */
    UserEntity findUserByUserName(String userName);
}
