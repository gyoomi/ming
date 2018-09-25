package com.ming.project.system.mapper;

import com.ming.project.system.domain.UserRoleEntity;
import java.util.List;

public interface UserRoleEntityMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user_role
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user_role
     *
     * @mbggenerated
     */
    int insert(UserRoleEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user_role
     *
     * @mbggenerated
     */
    UserRoleEntity selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user_role
     *
     * @mbggenerated
     */
    List<UserRoleEntity> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user_role
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(UserRoleEntity record);
}