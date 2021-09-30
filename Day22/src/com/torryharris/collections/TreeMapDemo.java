package com.torryharris.collections;

import com.torryharris.Model.Employee;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        Employee e1 =new Employee(103,"Deepak","Lead",25000);
        Employee e2 =new Employee(102,"Avinash","HR",22000);
        Employee e3 =new Employee(101,"Barath","Lead",25000);
        Employee e4 =new Employee(104,"Gowtham","Manager",35000);

        TreeMap<Integer,Employee> treemap =new TreeMap<>();


        treemap.put(e1.geteID(),e1);
        treemap.put(e2.geteID(),e2);
        treemap.put(e3.geteID(),e3);
        treemap.put(e4.geteID(),e4);



        for(Map.Entry<Integer,Employee> emp : treemap.entrySet()){
            System.out.println(emp.getKey()+"="+emp.getValue());
        }

    }
}
