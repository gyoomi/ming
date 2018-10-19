package com.ming.project.system.web.controller;

import com.ming.framework.web.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ming.project.system.domain.DeptEntity;
import com.ming.project.system.service.DeptService;

import java.util.List;

/**
 * 部门 Controller
 *
 * @author Leon
 * @version 2018/10/19 09:24
 */
@RestController
@RequestMapping(value = "/system/dept")
public class DeptController extends BaseController {

    @Autowired
    private DeptService deptService;

    /**
     * 保存部门
     *
     * @param dept
     * @return Dept
     */
    @PostMapping(value = "/save")
    public DeptEntity save(DeptEntity dept) {
        return deptService.save(dept);
    }

    /**
     * 更新部门
     *
     * @param dept
     * @return Dept
     */
    @PostMapping(value = "/update")
    public DeptEntity update(DeptEntity dept) {
        return deptService.update(dept);
    }

    /**
     * 查询部门列表
     *
     * @param dept 部门
     * @return 部门List
     */
    @PostMapping(value = "/findByList")
    public List<DeptEntity> findByList(DeptEntity dept) {
        return deptService.findByList(dept);
    }

    /**
     * 查询部门信息
     *
     * @param deptId 部门Id
     * @return 部门
     */
    @GetMapping(value = "/findById")
    public DeptEntity findById(Integer deptId) {
        return deptService.findById(deptId);
    }

    /**
     * 删除部门
     *
     * @param deptId
     */
    @GetMapping(value = "/deleteById")
    public void deleteById(Integer deptId) {
        deptService.deleteById(deptId);
    }

    /**
     * 批量删除部门
     *
     * @param deptIds
     *
     */
    @GetMapping(value = "/deleteByIds")
    public void deleteByIds(String deptIds) {
        deptService.deleteByIds(deptIds);
    }




}