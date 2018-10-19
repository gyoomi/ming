/**
 * Copyright © 2018, Leon
 * <p>
 * All Rights Reserved.
 */

package com.ming.project.system.mapper;

import com.ming.project.system.domain.DeptEntity;
import java.util.List;

/**
 * 部门 Mapper
 *
 * @author Leon
 * @version 2018/10/19 09:24
 */
public interface DeptMapper {

    /**
     * 查询
     *
     * @param deptId 部门Id
     * @return 部门
     */
    DeptEntity findById(Integer deptId);

    /**
     * 查询列表
     *
     * @param dept 部门
     * @return 部门List
     */
    List<DeptEntity> findByList(DeptEntity dept);

    /**
     * 保存
     *
     * @param dept 部门
     * @return 部门
     */
    int save(DeptEntity dept);

    /**
     * 更新
     *
     * @param dept 部门
     * @return 部门
     */
    int update(DeptEntity dept);

    /**
     * 删除
     *
     * @param deptId
     * @return
     */
    int deleteById(Integer deptId);

    /**
     * 批量删除
     *
     * @param deptIds
     * @return
     */
    int deleteByIds(String[] deptIds);
}