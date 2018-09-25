package com.ming.project.system.domain;

import java.io.Serializable;
import java.util.Date;

public class DeptEntity implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_dept.dept_id
     *
     * @mbggenerated
     */
    private Integer deptId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_dept.parent_id
     *
     * @mbggenerated
     */
    private Integer parentId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_dept.dept_name
     *
     * @mbggenerated
     */
    private String deptName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_dept.order_num
     *
     * @mbggenerated
     */
    private Integer orderNum;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_dept.leader
     *
     * @mbggenerated
     */
    private String leader;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_dept.phone
     *
     * @mbggenerated
     */
    private String phone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_dept.email
     *
     * @mbggenerated
     */
    private String email;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_dept.status
     *
     * @mbggenerated
     */
    private Integer status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_dept.create_user
     *
     * @mbggenerated
     */
    private String createUser;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_dept.create_date
     *
     * @mbggenerated
     */
    private Date createDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_dept.update_user
     *
     * @mbggenerated
     */
    private String updateUser;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_dept.update_date
     *
     * @mbggenerated
     */
    private Date updateDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_dept.remark
     *
     * @mbggenerated
     */
    private String remark;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sys_dept
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_dept.dept_id
     *
     * @return the value of sys_dept.dept_id
     *
     * @mbggenerated
     */
    public Integer getDeptId() {
        return deptId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_dept.dept_id
     *
     * @param deptId the value for sys_dept.dept_id
     *
     * @mbggenerated
     */
    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_dept.parent_id
     *
     * @return the value of sys_dept.parent_id
     *
     * @mbggenerated
     */
    public Integer getParentId() {
        return parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_dept.parent_id
     *
     * @param parentId the value for sys_dept.parent_id
     *
     * @mbggenerated
     */
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_dept.dept_name
     *
     * @return the value of sys_dept.dept_name
     *
     * @mbggenerated
     */
    public String getDeptName() {
        return deptName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_dept.dept_name
     *
     * @param deptName the value for sys_dept.dept_name
     *
     * @mbggenerated
     */
    public void setDeptName(String deptName) {
        this.deptName = deptName == null ? null : deptName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_dept.order_num
     *
     * @return the value of sys_dept.order_num
     *
     * @mbggenerated
     */
    public Integer getOrderNum() {
        return orderNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_dept.order_num
     *
     * @param orderNum the value for sys_dept.order_num
     *
     * @mbggenerated
     */
    public void setOrderNum(Integer orderNum) {
        this.orderNum = orderNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_dept.leader
     *
     * @return the value of sys_dept.leader
     *
     * @mbggenerated
     */
    public String getLeader() {
        return leader;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_dept.leader
     *
     * @param leader the value for sys_dept.leader
     *
     * @mbggenerated
     */
    public void setLeader(String leader) {
        this.leader = leader == null ? null : leader.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_dept.phone
     *
     * @return the value of sys_dept.phone
     *
     * @mbggenerated
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_dept.phone
     *
     * @param phone the value for sys_dept.phone
     *
     * @mbggenerated
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_dept.email
     *
     * @return the value of sys_dept.email
     *
     * @mbggenerated
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_dept.email
     *
     * @param email the value for sys_dept.email
     *
     * @mbggenerated
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_dept.status
     *
     * @return the value of sys_dept.status
     *
     * @mbggenerated
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_dept.status
     *
     * @param status the value for sys_dept.status
     *
     * @mbggenerated
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_dept.create_user
     *
     * @return the value of sys_dept.create_user
     *
     * @mbggenerated
     */
    public String getCreateUser() {
        return createUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_dept.create_user
     *
     * @param createUser the value for sys_dept.create_user
     *
     * @mbggenerated
     */
    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_dept.create_date
     *
     * @return the value of sys_dept.create_date
     *
     * @mbggenerated
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_dept.create_date
     *
     * @param createDate the value for sys_dept.create_date
     *
     * @mbggenerated
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_dept.update_user
     *
     * @return the value of sys_dept.update_user
     *
     * @mbggenerated
     */
    public String getUpdateUser() {
        return updateUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_dept.update_user
     *
     * @param updateUser the value for sys_dept.update_user
     *
     * @mbggenerated
     */
    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser == null ? null : updateUser.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_dept.update_date
     *
     * @return the value of sys_dept.update_date
     *
     * @mbggenerated
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_dept.update_date
     *
     * @param updateDate the value for sys_dept.update_date
     *
     * @mbggenerated
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_dept.remark
     *
     * @return the value of sys_dept.remark
     *
     * @mbggenerated
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_dept.remark
     *
     * @param remark the value for sys_dept.remark
     *
     * @mbggenerated
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_dept
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", deptId=").append(deptId);
        sb.append(", parentId=").append(parentId);
        sb.append(", deptName=").append(deptName);
        sb.append(", orderNum=").append(orderNum);
        sb.append(", leader=").append(leader);
        sb.append(", phone=").append(phone);
        sb.append(", email=").append(email);
        sb.append(", status=").append(status);
        sb.append(", createUser=").append(createUser);
        sb.append(", createDate=").append(createDate);
        sb.append(", updateUser=").append(updateUser);
        sb.append(", updateDate=").append(updateDate);
        sb.append(", remark=").append(remark);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}