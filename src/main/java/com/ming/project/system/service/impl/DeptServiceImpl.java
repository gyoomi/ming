package com.ming.project.system.service.impl;

import com.ming.common.util.StringUtils;
import com.ming.project.system.domain.DeptEntity;
import com.ming.project.system.mapper.DeptMapper;
import com.ming.project.system.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * 部门 ServiceImpl
 *
 * @author Leon
 * @version 2018/10/19 09:24
 */
@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptMapper deptMapper;

    /**
     * 查询部门信息
     *
     * @param deptId 部门Id
     * @return 部门
     */
    @Override
    public DeptEntity findById(Integer deptId) {
        return deptMapper.findById(deptId);
    }

    /**
     * 查询部门列表
     *
     * @param dept 部门
     * @return 部门List
     */
    @Override
    public List<DeptEntity> findByList(DeptEntity dept) {
        return deptMapper.findByList(dept);
    }

    /**
     * 保存部门
     *
     * @param dept 部门
     * @return 部门
     */
     @Override
     public DeptEntity save(DeptEntity dept) {
         deptMapper.save(dept);
         return dept;
     }

    /**
     * 更新部门
     *
     * @param dept 部门
     * @return 部门
     */
     @Override
     public DeptEntity update(DeptEntity dept) {
         deptMapper.update(dept);
         return dept;
     }

    /**
     * 删除部门
     *
     * @param deptId
     * @return
     */
    @Override
    public int deleteById(Integer deptId) {
        return deptMapper.deleteById(deptId);
    }

    /**
     * 批量删除部门
     *
     * @param deptIds
     * @return
     */
    @Override
    public int deleteByIds(String deptIds) {
        String[] ids = StringUtils.split(deptIds, ",");
        return deptMapper.deleteByIds(ids);
    }
}