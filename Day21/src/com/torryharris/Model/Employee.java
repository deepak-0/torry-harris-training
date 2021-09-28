package com.torryharris.Model;

public class Employee implements Comparable<Employee>{
    private  int eID;
    private  String name;
    private  String designation;
    private int balanceCL ;

    public Employee(int eID, String name, String designation) {
        this.eID = eID;
        this.name = name;
        this.designation = designation;
        balanceCL=12;
    }

    public int geteID() {
        return eID;
    }

    public  String getName() {
        return name;
    }

    public int getBalanceCL() {
        return balanceCL;
    }

    public void setBalanceCL(int balanceCL) {
        this.balanceCL = balanceCL;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "eID=" + eID +
                ", name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                ", balanceCL=" + balanceCL +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
       return this.eID-o.eID;
      // return this.name compareTo(o name);
    }
}
