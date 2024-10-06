package com.nt.Entity;

public class Employee {
    private int empId;
    private String empName;
    private double empSalary;
    private Address empAddress; // Reference object

    public Employee(int empId, String empName, double empSalary, Address empAddress) {
        this.empId = empId;
        this.empName = empName;
        this.empSalary = empSalary;
        this.empAddress = empAddress;
    }

    // Getters and setters
    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public double getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(double empSalary) {
        this.empSalary = empSalary;
    }

    public Address getEmpAddress() {
        return empAddress;
    }

    public void setEmpAddress(Address empAddress) {
        this.empAddress = empAddress;
    }

    @Override
    public String toString() {
        return "Employee ID: " + empId + "\n" +
               "Employee Name: " + empName + "\n" +
               "Employee Salary: " + empSalary + "\n" +
               "Employee Address: " + empAddress.toString();
    }
}


