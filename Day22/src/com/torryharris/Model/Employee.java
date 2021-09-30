package com.torryharris.Model;

public class Employee {
    private int eID;
    private String name;
    private String designation;
    private int salary;

    public Employee(int eID, String name, String designation, int salary) {
        this.eID = eID;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
    }

    public int geteID() {
        return eID;
    }

    public String getName() {
        return name;
    }

    public String getDesignation() {
        return designation;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "eID=" + eID +
                ", name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                ", salary=" + salary +
                '}';
    }
}
