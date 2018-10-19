/**
 * Copyright © 2018, Leon
 * <p>
 * All Rights Reserved.
 */

package com.ming.project.system.service;

import com.ming.project.system.domain.DeptEntity;
import java.util.List;

/**
 * 部门 Service
 *
 * @author Leon
 * @version 2018/10/19 09:24
 */
public interface DeptService {

    /**
     * 查询部门信息
     *
     * @param deptId 部门Id
     * @return 部门
     */
    DeptEntity findById(Integer deptId);

    /**
     * 查询部门列表
     *
     * @param dept 部门
     * @return 部门List
     */
    List<DeptEntity> findByList(DeptEntity dept);

    /**
     * 保存部门
     *
     * @param dept 部门
     * @return 部门
     */
     DeptEntity save(DeptEntity dept);

    /**
     * 更新部门
     *
     * @param dept 部门
     * @return 部门
     */
     DeptEntity update(DeptEntity dept);

    /**
     * 删除部门
     *
     * @param deptId
     * @return
     */
    int deleteById(Integer deptId);

    /**
     * 批量删除部门
     *
     * @param deptIds
     * @return
     */
    int deleteByIds(String deptIds);
}