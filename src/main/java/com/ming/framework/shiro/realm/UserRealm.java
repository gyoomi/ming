/**
 * Copyright © 2018, LeonKeh
 * <p>
 * All Rights Reserved.
 */

package com.ming.framework.shiro.realm;

import com.ming.project.system.domain.UserEntity;
import com.ming.project.system.service.UserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 类功能描述
 *
 * @author Leon
 * @version 2018/9/25 21:02
 */
public class UserRealm extends AuthorizingRealm {

    @Autowired
    private UserService userService;

    /**
     *  授权
     *
     * @param principalCollection
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        UserEntity userEntity = (UserEntity) SecurityUtils.getSubject().getPrincipal();
        userEntity.getUserId();
        return null;
    }

    /**
     * 认证
     *
     * @param authenticationToken
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        UsernamePasswordToken upToken = (UsernamePasswordToken) authenticationToken;
        String userName = upToken.getUsername();
        UserEntity userEntity = userService.findUserByUserName(userName);
        if (null == userEntity || userEntity.getPassword() == null) {
            return null;
        }
        SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(userEntity, userEntity.getPassword(), getName());
        return info;
    }
}
