/**
 * Copyright © 2018, LeonKeh
 * <p>
 * All Rights Reserved.
 */

package com.ming.framework.shiro.realm;

import com.ming.project.system.domain.RoleEntity;
import com.ming.project.system.domain.UserEntity;
import com.ming.project.system.service.MenuService;
import com.ming.project.system.service.RoleService;
import com.ming.project.system.service.UserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashSet;
import java.util.Set;

/**
 * 类功能描述
 *
 * @author Leon
 * @version 2018/9/25 21:02
 */
public class UserRealm extends AuthorizingRealm {

    private static final Logger lg = LoggerFactory.getLogger(UserRealm.class);

    @Autowired
    private UserService userService;

    @Autowired
    private RoleService roleService;

    @Autowired
    private MenuService menuService;

    /**
     *  授权
     *
     * @param principalCollection
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        UserEntity userEntity = (UserEntity) SecurityUtils.getSubject().getPrincipal();
        lg.info("加载用户【{}】权限数据", userEntity.getLoginName());
        userEntity.getUserId();
        Set<String> roles = new HashSet<>();
        Set<String> permissions = new HashSet<>();
        roleService.findRoleListByUserId(userEntity.getUserId()).stream().map(RoleEntity::getRoleKey).forEach(roles::add);
        permissions.addAll(menuService.findPermissionListByUserId(userEntity.getUserId()));
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        info.setRoles(roles);
        info.setStringPermissions(permissions);
        lg.info("加载用户【{}】权限数据；结束！", userEntity.getLoginName());
        return info;
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
        lg.info("检测用户【{}】认证凭证", upToken.getUsername());
        String userName = upToken.getUsername();
        UserEntity userEntity = userService.findUserByUserName(userName);
        if (null == userEntity || userEntity.getPassword() == null) {
            lg.error("检测用户【{}】认证凭证失败！", upToken.getUsername());
            return null;
        }
        SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(userEntity, userEntity.getPassword(), getName());
        lg.info("检测用户【{}】认证凭证；结束！", upToken.getUsername());
        return info;
    }
}
