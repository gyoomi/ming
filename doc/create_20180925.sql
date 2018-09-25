/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2018/9/25 14:19:08                           */
/*==============================================================*/


drop table if exists sys_dept;

drop table if exists sys_menu;

drop table if exists sys_role;

drop table if exists sys_role_menu;

drop table if exists sys_user;

drop table if exists sys_user_role;

/*==============================================================*/
/* Table: sys_dept                                              */
/*==============================================================*/
create table sys_dept
(
  dept_id              int(11) not null auto_increment comment '部门id',
  parent_id            int(11) default 0 comment '父部门id',
  dept_name            varchar(30) default '' comment '部门名称',
  order_num            int(4) default 0 comment '显示顺序',
  leader               varchar(64) default '' comment '负责人',
  phone                varchar(20) default '' comment '联系电话',
  email                varchar(255) default '' comment '邮箱',
  status               int(1) default 0 comment '部门状态:0正常,1停用',
  create_user          varchar(64) default '' comment '创建者',
  create_date          datetime comment '创建时间',
  update_user          varchar(64) default '' comment '更新者',
  update_date          datetime comment '更新时间',
  remark               varchar(200) comment '备注',
  primary key (dept_id)
);

/*==============================================================*/
/* Table: sys_menu                                              */
/*==============================================================*/
create table sys_menu
(
  menu_id              int(11) not null auto_increment comment '菜单ID',
  menu_name            varchar(64) not null comment '菜单名称',
  parent_id            int(11) default 0 comment '父菜单ID',
  order_num            int(4) default NULL comment '显示顺序',
  url                  varchar(200) default '' comment '请求地址',
  menu_type            char(1) default '' comment '类型：M - 目录；C - 菜单；F按钮',
  hidden               int(1) default 0 comment '菜单状态:0显示,1隐藏',
  permission           varchar(100) default '' comment '权限标识',
  icon                 varchar(100) default '' comment '菜单图标',
  create_user          varchar(64) default '' comment '创建者',
  create_date          datetime comment '创建时间',
  update_user          varchar(64) default '' comment '更新者',
  update_date          datetime comment '更新时间',
  remark               varchar(200) comment '备注',
  primary key (menu_id)
);

/*==============================================================*/
/* Table: sys_role                                              */
/*==============================================================*/
create table sys_role
(
  role_id              int(10) not null auto_increment comment '角色ID',
  role_name            varchar(30) not null comment '角色名称',
  role_key             varchar(100) not null comment '角色权限字符串',
  descripation         varchar(500) comment '角色描述',
  order_num            int(10) not null comment '显示顺序',
  status               int(1) default 0 comment '角色状态:0正常,1禁用',
  create_user          varchar(64) default '' comment '创建者',
  create_date          datetime comment '创建时间',
  update_user          varchar(64) default '' comment '更新者',
  update_date          datetime comment '更新时间',
  remark               varchar(200) comment '备注',
  primary key (role_id)
);

/*==============================================================*/
/* Table: sys_role_menu                                         */
/*==============================================================*/
create table sys_role_menu
(
  id                   int not null auto_increment comment '主键',
  role_id              int(11) not null comment '角色ID',
  menu_id              int(11) not null comment '菜单ID',
  primary key (id)
);

/*==============================================================*/
/* Table: sys_user                                              */
/*==============================================================*/
create table sys_user
(
  user_id              int(11) not null auto_increment comment '用户ID',
  dept_id              int(20) default NULL comment '部门ID',
  login_name           varchar(64) default '' comment '登录账号',
  user_name            varchar(30) default '' comment '用户昵称',
  gender               char(1) comment '性别：1 - 男；2 - 女',
  email                varchar(100) default '' comment '用户邮箱',
  phonenumber          varchar(20) default '' comment '手机号码',
  password             varchar(100) default '' comment '密码',
  salt                 varchar(100) default '' comment '盐加密',
  user_type            char(1) default 'N' comment '类型:Y默认用户,N非默认用户',
  status               int(1) default 0 comment '帐号状态:0正常,1禁用',
  refuse_des           varchar(500) default '' comment '拒绝登录描述',
  create_user          varchar(64) default '' comment '创建者',
  create_date          datetime comment '创建时间',
  update_user          varchar(64) default '' comment '更新者',
  update_date          datetime comment '更新时间',
  remark               varchar(200) comment '备注',
  primary key (user_id)
);

/*==============================================================*/
/* Table: sys_user_role                                         */
/*==============================================================*/
create table sys_user_role
(
  id                   int not null auto_increment comment '主键',
  user_id              int(11) not null comment '用户ID',
  role_id              int(11) not null comment '角色ID',
  primary key (id)
);

