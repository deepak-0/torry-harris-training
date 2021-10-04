package com.torryharris.jdbc;


import com.torryharris.model.Employee;

import java.sql.*;
import java.util.ArrayList;

public class EmployeeJDBCDemo {
    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/company";
            String username = "root";
            String password = "Deepak@2000";
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();
            //  Employee e1 = new Employee(101,"Deepak","HR",45000,2021);
//            String insertQuery = "Insert into Employee Values ("+ e1.getEmpId()+",'"+e1.getEmpName()+"','"
//                    +e1.getDesignation()+"',"+e1.getSalary()+","+e1.getYearOfJoining()+")";
            ArrayList<Employee> empList = employeeList();

   //update query
             /*         String updateQuery = "update employee "+
                    "set designation='Director' "+
                    "where year_of_joining=2021";

            System.out.println(updateQuery);
            int rowsAffected = statement.executeUpdate(updateQuery);
            System.out.println("Table updated successfully");
            System.out.println("No of Rows Affected : "+rowsAffected);
*/

 //printing from database using query (execute query)
            String query = "Select * from employee ";
            ResultSet resultSet=statement.executeQuery(query);
            System.out.println("Employee details are");

            while(resultSet.next()){
                int empid =resultSet.getInt("empid");
                String name=resultSet.getString("empName");
                String designation=resultSet.getString("designation");
                int salary=resultSet.getInt("salary");
                int year_of_joining = resultSet.getInt("year_of_joining");

                Employee employee= new Employee(empid,name,designation,salary,year_of_joining);
                System.out.println(employee);
            }


// Inserting into database
       /*     for (Employee emp1 : empList) {
                String insertQuery = "Insert into Employee Values (" + emp1.getEmpId() + ",'" + emp1.getEmpName() + "','"
                        + emp1.getDesignation() + "'," + emp1.getSalary() + "," + emp1.getYearOfJoining() + ")";
                System.out.println();

                System.out.println(insertQuery);
                statement.execute(insertQuery);
            } */
            statement.close();
            connection.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

    }

    private static ArrayList<Employee> employeeList() {

        Employee e1 = new Employee(101, "Deepak", "HR", 45000, 2021);
        Employee e2 = new Employee(102, "Arun", "Lead", 45000, 2017);
        Employee e3 = new Employee(103, "Dinesh", "HR", 45000, 2009);
        Employee e4 = new Employee(104, "Anish", "Manager", 55000, 2021);
        Employee e5 = new Employee(105, "Barath", "HR", 35000, 2020);

        ArrayList<Employee> empList = new ArrayList<>();

        empList.add(e1);
        empList.add(e2);
        empList.add(e3);
        empList.add(e4);
        empList.add(e5);

        return empList;
    }
}



