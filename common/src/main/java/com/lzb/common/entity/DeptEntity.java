package com.lzb.common.entity;

import java.io.Serializable;

public class DeptEntity implements Serializable {

    private Integer deptId;
    private String deptName;
    private Integer orderNum;

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public Integer getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(Integer orderNum) {
        this.orderNum = orderNum;
    }

    @Override
    public String toString() {
        return "DeptEntity{" +
                "deptId=" + deptId +
                ", deptName='" + deptName + '\'' +
                ", orderNum=" + orderNum +
                '}';
    }
}
