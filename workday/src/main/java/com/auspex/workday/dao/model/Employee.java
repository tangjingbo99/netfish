package com.auspex.workday.dao.model;

public class Employee {
    String employeeId = "";
    String employeeName = "";
    String employeeSex = "";
    String employeeAge = "";
    String employeeStartDate = "";
    String employeeEndDate = "";

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeSex() {
        return employeeSex;
    }

    public void setEmployeeSex(String employeeSex) {
        this.employeeSex = employeeSex;
    }

    public String getEmployeeAge() {
        return employeeAge;
    }

    public void setEmployeeAge(String employeeAge) {
        this.employeeAge = employeeAge;
    }

    public String getEmployeeStartDate() {
        return employeeStartDate;
    }

    public void setEmployeeStartDate(String employeeStartDate) {
        this.employeeStartDate = employeeStartDate;
    }

    public String getEmployeeEndDate() {
        return employeeEndDate;
    }

    public void setEmployeeEndDate(String employeeEndDate) {
        this.employeeEndDate = employeeEndDate;
    }
}
