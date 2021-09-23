package com.torryharris.model;

public class Clerk extends Employee{
    String degree;

    public Clerk(String name, int employeeId, String designation, float salary, String degree) {
        super(name, employeeId, designation, salary);
        this.degree = degree;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }
    public void generatePayRoll(){
        System.out.println("Pay roll is available now");
    }

    @Override
    public String toString() {
        return "\nClerk" + super.toString()+
                "\ndegree='" + degree + '\''+"\n" ;
    }
}
