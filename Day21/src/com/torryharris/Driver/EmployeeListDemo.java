package com.torryharris.Driver;

import com.torryharris.Model.Employee;
import java.util.ArrayList;
import java.util.Collections;

public class EmployeeListDemo {
    public static void main(String[] args) {
        Employee e1=new Employee(001,"Deepak","HR");
        Employee e2=new Employee(002,"Anish","LEAD");
        Employee e3=new Employee(003,"Dinesh","MANAGER");
        Employee e4=new Employee(004,"Barath","HR");
        Employee e5=new Employee(005,"Avinsah","LEAD");

        ArrayList<Employee> empList = new ArrayList<>();

        empList.add(e1);
        empList.add(e2);
        empList.add(e5);
        empList.add(e4);
        empList.add(e3);




        System.out.println("Using For Loop");
        for(int i=0;i< empList.size();i++){
            System.out.println(empList.get(i));
        }
        empList.sort(null);
        System.out.println("After Sorting ");
        for(int i=0;i< empList.size();i++){
            System.out.println(empList.get(i));
        }

    }

}
