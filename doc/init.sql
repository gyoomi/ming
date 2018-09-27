-- 用户数据
INSERT INTO `sys_user` VALUES ('1', null, 'admin', '超级管理员', '0', '', '', '1111', '', 'N', '1', '', '', null, '', null, null);
INSERT INTO `sys_user` VALUES ('2', null, 'tom', '人事薪资员', '1', '', '', '1111', '', 'N', '1', '', '', null, '', null, null);
INSERT INTO `sys_user` VALUES ('3', null, 'jack', '行政经理', '1', '', '', '1111', '', 'N', '1', '', '', null, '', null, null);
-- 角色数据
INSERT INTO `sys_role` VALUES ('1', '超级管理员', 'admin', null, '1', '0', '', null, '', null, null);
INSERT INTO `sys_role` VALUES ('2', '人事专员', 'hr', null, '2', '0', '', null, '', null, null);
INSERT INTO `sys_role` VALUES ('3', '行政经理', 'adminManager', null, '3', '0', '', null, '', null, null);

-- 菜单
INSERT INTO `sys_menu` VALUES ('1', '主页', '0', '1', '#', 'M', '0', 'system:main:view', '', '', null, '', null, null);
INSERT INTO `sys_menu` VALUES ('2', '系统管理', '0', '1', '/system/admin', 'C', '0', 'system:admin:view', '', '', null, '', null, null);
INSERT INTO `sys_menu` VALUES ('3', '用户管理 ', '0', '2', '/system/admin', 'C', '0', 'system:user:view', '', '', null, '', null, null);
INSERT INTO `sys_menu` VALUES ('4', '用户添加', '0', '1', '#', 'B', '0', 'system:user:add', '', '', null, '', null, null);
INSERT INTO `sys_menu` VALUES ('5', '用户删除', '0', '2', '#', 'B', '0', 'system:user:delete', '', '', null, '', null, null);
INSERT INTO `sys_menu` VALUES ('6', '部门管理', '0', '2', '/system/dept', 'B', '0', 'system:dept:view', '', '', null, '', null, null);
INSERT INTO `sys_menu` VALUES ('7', '部门添加', '0', '1', '#', 'C', '0', 'system:dept:add', '', '', null, '', null, null);
INSERT INTO `sys_menu` VALUES ('8', '部门删除', '0', '2', '#', 'C', '0', 'system:dept:delete', '', '', null, '', null, null);


-- 用户-角色
INSERT INTO `sys_user_role` VALUES ('1', '1', '1');
INSERT INTO `sys_user_role` VALUES ('2', '1', '2');
INSERT INTO `sys_user_role` VALUES ('3', '1', '3');
INSERT INTO `sys_user_role` VALUES ('4', '2', '2');
INSERT INTO `sys_user_role` VALUES ('5', '3', '3');

-- 角色-菜单
INSERT INTO `sys_role_menu` VALUES ('1', '2', '1');
INSERT INTO `sys_role_menu` VALUES ('2', '2', '2');
INSERT INTO `sys_role_menu` VALUES ('3', '2', '3');
INSERT INTO `sys_role_menu` VALUES ('4', '2', '4');
INSERT INTO `sys_role_menu` VALUES ('5', '2', '5');
INSERT INTO `sys_role_menu` VALUES ('6', '3', '1');
INSERT INTO `sys_role_menu` VALUES ('7', '3', '6');
INSERT INTO `sys_role_menu` VALUES ('8', '3', '7');
INSERT INTO `sys_role_menu` VALUES ('9', '3', '8');
INSERT INTO `sys_role_menu` VALUES ('10', '1', '1');
INSERT INTO `sys_role_menu` VALUES ('11', '1', '2');
INSERT INTO `sys_role_menu` VALUES ('12', '1', '3');
INSERT INTO `sys_role_menu` VALUES ('13', '1', '4');
INSERT INTO `sys_role_menu` VALUES ('14', '1', '5');
INSERT INTO `sys_role_menu` VALUES ('15', '1', '6');
INSERT INTO `sys_role_menu` VALUES ('16', '1', '7');
INSERT INTO `sys_role_menu` VALUES ('17', '1', '8');

