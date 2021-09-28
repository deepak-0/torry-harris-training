package com.torryharris.Driver;

import com.torryharris.Model.Employee;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
    public static void main(String[] args) {

    ArrayList<Integer> integerList = new ArrayList<>();
    integerList.add(10);
    integerList.add(0,20);
    integerList.remove(1);
     integerList.add(-1);
     integerList.add(200);
        //integerList.sort(Collections.reverseOrder());
        //System.out.println(integerList);

        Employee e1=new Employee(001,"Deepak","HR");
        Employee e2=new Employee(002,"Anish","LEAD");
        Employee e3=new Employee(003,"Dinesh","MANAGER");
        ArrayList<Employee> empList = new ArrayList<>();
        empList.add(e1);
        empList.add(e2);
        empList.add(e3);

        System.out.println(" Using Iterator ");
        Iterator<Employee> empItr = empList.iterator();
        while(empItr.hasNext()){
            System.out.println(empItr.next());
        }

        System.out.println("using for each");
        for(Employee emp1 : empList){
            System.out.println(emp1);
        }

        System.out.println("Using For Loop");
        for(int i=0;i< empList.size();i++){
            System.out.println(empList.get(i));
        }
}
}
