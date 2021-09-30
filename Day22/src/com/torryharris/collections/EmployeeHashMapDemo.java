package com.torryharris.collections;

import com.torryharris.Model.Employee;

import java.util.HashMap;
import java.util.Map;

public class EmployeeHashMapDemo {
    public static void main(String[] args) {
        Employee e1 =new Employee(101,"Deepak","Lead",25000);
        Employee e2 =new Employee(102,"Avinash","HR",22000);
        Employee e3 =new Employee(103,"Barath","Lead",25000);
        Employee e4 =new Employee(104,"Gowtham","Manager",35000);

        HashMap<Integer, Employee> empHashMap =new HashMap<>();
         empHashMap.put(e1.geteID(),e1);
        empHashMap.put(e2.geteID(),e2);
        empHashMap.put(e3.geteID(),e3);
        empHashMap.put(e4.geteID(),e4);

       // System.out.println(empHashMap);
        for(Map.Entry<Integer,Employee> emp : empHashMap.entrySet()){
           System.out.println(emp.getKey()+"="+emp.getValue());
        }

        HashMap<Employee,Integer> empHashMap1 =new HashMap<>();
        empHashMap1.put(e1,e1.geteID());
        empHashMap1.put(e2,e2.geteID());
        empHashMap1.put(e3,e3.geteID());
        empHashMap1.put(e4,e4.geteID());
        for(Map.Entry<Employee,Integer> emp : empHashMap1.entrySet()){
            System.out.println(emp.getKey()+"="+emp.getValue());
        }





    }
}
