package com.torryharris.model;

public class Employee {
    private int empId;
    private String empName;
    private String designation;
    private int salary;
    private int yearOfJoining;

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", designation='" + designation + '\'' +
                ", salary=" + salary +
                ", yearOfJoining=" + yearOfJoining +
                '}';
    }

    public Employee(int empId, String empName, String designation, int salary, int yearOfJoining) {
        this.empId = empId;
        this.empName = empName;
        this.designation = designation;
        this.salary = salary;
        this.yearOfJoining = yearOfJoining;
    }

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

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getYearOfJoining() {
        return yearOfJoining;
    }

    public void setYearOfJoining(int yearOfJoining) {
        this.yearOfJoining = yearOfJoining;
    }
}
