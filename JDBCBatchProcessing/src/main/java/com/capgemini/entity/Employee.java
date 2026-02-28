package com.capgemini.entity;

public class Employee {
    private int emp_id;
    private String EmpName;
    private double EmpSal;

    public Employee(int emp_id, String empName, double empSal) {
        this.emp_id = emp_id;
        EmpName = empName;
        EmpSal = empSal;
    }

    public int getEmp_id() {
        return emp_id;
    }

    public double getEmpSal() {
        return EmpSal;
    }

    public String getEmpName() {
        return EmpName;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public void setEmpName(String empName) {
        this.EmpName = empName;
    }

    public void setEmpSal(double EmpSal) {
        this.EmpSal = EmpSal;
    }
}
