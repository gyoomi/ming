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
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 类功能描述
 *
 * @author Leon
 * @version 2018/9/25 21:02
 */
public class UserRealm extends AuthorizingRealm {

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
        userEntity.getUserId();
        Set<String> roles = new HashSet<>();
        Set<String> permissions = new HashSet<>();
        roleService.findRoleListByUserId(userEntity.getUserId()).stream().map(RoleEntity::getRoleKey).forEach(roles::add);
        permissions.addAll(menuService.findPermissionListByUserId(userEntity.getUserId()));
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        info.setRoles(roles);
        info.setStringPermissions(permissions);
        return info;
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Set<String> roles = new HashSet<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("3");
        roles.addAll(list);
//        list.stream().forEach(roles::add);
        System.out.println(roles);
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
