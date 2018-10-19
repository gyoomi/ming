/**
 * Copyright © 2018, Leon
 * <p>
 * All Rights Reserved.
 */
package com.ming.project.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;
import java.util.Date;

/**
 * 部门表 Entity
 *
 * @author Leon
 * @version 2018/10/19 09:24
 */
public class DeptEntity implements Serializable {


    /**
     * 部门id
     */
    private Integer deptId;

    /**
     * 父部门id
     */
    private Integer parentId;

    /**
     * 部门名称
     */
    private String deptName;

    /**
     * 显示顺序
     */
    private Integer orderNum;

    /**
     * 负责人
     */
    private String leader;

    /**
     * 联系电话
     */
    private String phone;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 部门状态:0正常,1停用
     */
    private Integer status;

    /**
     * 创建者
     */
    private String createUser;

    /**
     * 创建时间
     */
    private Date createDate;

    /**
     * 更新者
     */
    private String updateUser;

    /**
     * 更新时间
     */
    private Date updateDate;

    /**
     * 备注
     */
    private String remark;

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public Integer getDeptId() {
        return deptId;
    }
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Integer getParentId() {
        return parentId;
    }
    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getDeptName() {
        return deptName;
    }
    public void setOrderNum(Integer orderNum) {
        this.orderNum = orderNum;
    }

    public Integer getOrderNum() {
        return orderNum;
    }
    public void setLeader(String leader) {
        this.leader = leader;
    }

    public String getLeader() {
        return leader;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }
    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getStatus() {
        return status;
    }
    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public String getCreateUser() {
        return createUser;
    }
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getCreateDate() {
        return createDate;
    }
    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    public String getUpdateUser() {
        return updateUser;
    }
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }
    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getRemark() {
        return remark;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
        .append("deptId", getDeptId())
        .append("parentId", getParentId())
        .append("deptName", getDeptName())
        .append("orderNum", getOrderNum())
        .append("leader", getLeader())
        .append("phone", getPhone())
        .append("email", getEmail())
        .append("status", getStatus())
        .append("createUser", getCreateUser())
        .append("createDate", getCreateDate())
        .append("updateUser", getUpdateUser())
        .append("updateDate", getUpdateDate())
        .append("remark", getRemark())
        .toString();
    }


}