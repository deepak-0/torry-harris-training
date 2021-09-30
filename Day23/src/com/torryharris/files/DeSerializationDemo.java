package com.torryharris.files;

import com.torryharris.model.Employee;

import java.io.*;
import java.util.ArrayList;

public class DeSerializationDemo {
    public static void main(String[] args)   throws IOException,ClassNotFoundException {
        FileInputStream fis = new FileInputStream("employees.txt");
        ObjectInputStream employeeInputStream = new ObjectInputStream(fis);
        ArrayList<Employee> employeeArrayList = new ArrayList<>();
        Employee employee;

        System.out.println("Employee details from the file are : ");
        try {
            while (true) {
                employee = (Employee) employeeInputStream.readObject();
                employeeArrayList.add(employee);
            }
        }
        catch (EOFException ex){

        }
        System.out.println("Employee Details : ");

        for(Employee emp : employeeArrayList){
            System.out.println(emp);
        }
    }
}
