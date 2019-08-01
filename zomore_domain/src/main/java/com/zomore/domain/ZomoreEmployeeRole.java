package com.zomore.domain;

public class ZomoreEmployeeRole {
    private String employeeRoleRoleid;

    private String employeeRoleRolename;

    private Integer employeeRoleState;

    private String employeeRoleCashierStore;

    public String getEmployeeRoleRoleid() {
        return employeeRoleRoleid;
    }

    public void setEmployeeRoleRoleid(String employeeRoleRoleid) {
        this.employeeRoleRoleid = employeeRoleRoleid == null ? null : employeeRoleRoleid.trim();
    }

    public String getEmployeeRoleRolename() {
        return employeeRoleRolename;
    }

    public void setEmployeeRoleRolename(String employeeRoleRolename) {
        this.employeeRoleRolename = employeeRoleRolename == null ? null : employeeRoleRolename.trim();
    }

    public Integer getEmployeeRoleState() {
        return employeeRoleState;
    }

    public void setEmployeeRoleState(Integer employeeRoleState) {
        this.employeeRoleState = employeeRoleState;
    }

    public String getEmployeeRoleCashierStore() {
        return employeeRoleCashierStore;
    }

    public void setEmployeeRoleCashierStore(String employeeRoleCashierStore) {
        this.employeeRoleCashierStore = employeeRoleCashierStore == null ? null : employeeRoleCashierStore.trim();
    }
}