package com.torryharris.jdbc;

import com.torryharris.model.Insurance;

import java.sql.*;
import java.util.ArrayList;

public class InsuranceJDBCDemo {
    static Connection connection ;
    static  Savepoint savePoint1;
    public static void main(String[] args) throws SQLException {



        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/company";
            String username = "root";
            String password = "Deepak@2000";
            connection = DriverManager.getConnection(url, username, password);
            connection.setAutoCommit(false);
            Statement statement = connection.createStatement();
            ArrayList<Insurance> insuranceArrayList = insuranceArrayList();



    /*        String query = "Select * from insurance where ins_type='Health' ";
            ResultSet resultSet=statement.executeQuery(query);
            System.out.println("Employee details with Ins_type = Health");

            while(resultSet.next()){
                String ins_name=resultSet.getString("ins_name");
                int ins_id=resultSet.getInt("ins_id");
                int sum = resultSet.getInt("sum");
                String ins_type=resultSet.getString("ins_type");

               Insurance insurance = new Insurance(ins_name,ins_id,sum,ins_type);
                System.out.println(insurance);

            } */



    /*        String query1 = "Select * from insurance order by sum asc";
            ResultSet resultSet1=statement.executeQuery(query1);
            System.out.println("Employee details are in the ascending order of sum : ");

            while(resultSet1.next()){
                String ins_name=resultSet1.getString("ins_name");
                int ins_id=resultSet1.getInt("ins_id");
                int sum = resultSet1.getInt("sum");
                String ins_type=resultSet1.getString("ins_type");

                Insurance insurance = new Insurance(ins_name,ins_id,sum,ins_type);
                System.out.println(insurance);

            } */
    /*        String query2 = "Select * from insurance where sum > 300000";
            ResultSet resultSet2=statement.executeQuery(query2);
            System.out.println("Employee details with Sum > 300000 are : ");

            while(resultSet2.next()){
                String ins_name=resultSet2.getString("ins_name");
                int ins_id=resultSet2.getInt("ins_id");
                int sum = resultSet2.getInt("sum");
                String ins_type=resultSet2.getString("ins_type");

                Insurance insurance = new Insurance(ins_name,ins_id,sum,ins_type);
                System.out.println(insurance);

            } */

            //query 1 and save point
       String q1 = "update insurance set sum=999950 where ins_id=3001";
            statement.executeUpdate(q1);
            System.out.println(q1);
            System.out.println("Query 1 success \n");

            savePoint1 = connection.setSavepoint("SavePoint 1...");

            String q2 = "update insurance set ins_type='Vehicle' where ins_id=3009";
            statement.executeUpdate(q2);
            System.out.println(q2);
            System.out.println("Query 2 success \n");


//            String updateQuery = "update insurance set sum=sum+(sum*20/100)";
//            int rowsAffected = statement.executeUpdate(updateQuery);
//            System.out.println("Sum value updated by 20%");
//            System.out.println("No of rows affected : " + rowsAffected);


//              ResultSet resultSet3 = statement.executeQuery(updateQuery);
//            while(resultSet3.next()){
//                String ins_name=resultSet3.getString("ins_name");
//                int ins_id=resultSet3.getInt("ins_id");
//                int sum = resultSet3.getInt("sum");
//                String ins_type=resultSet3.getString("ins_type");

//                Insurance insurance = new Insurance(ins_name,ins_id,sum,ins_type);
//                System.out.println(insurance);

            //          }

//            ArrayList<Insurance>  inslist = insuranceArrayList();
//            insertUsingPreparedStatement(connection,inslist);

          /*  for(Insurance ins : insuranceArrayList) {
                String insertQuery = "Insert Insurance Values ('" + ins.getIns_name() + "'," + ins.getIns_id() + ","
                        + ins.getSum() + ",'" + ins.getIns_type() + "')";
                System.out.println();
                System.out.println(insertQuery);
                statement.execute(insertQuery);
            } */
            connection.commit();
            statement.close();
            connection.close();
        } catch (SQLException throwables){
            connection.rollback(savePoint1);
            connection.commit();
            throwables.printStackTrace();
        } catch (ClassNotFoundException e ) {
            e.printStackTrace();
            connection.rollback();

        }
    }


    private static ArrayList<Insurance> insuranceArrayList() {

        Insurance i1 = new Insurance("LIC", 3001, 50000, "Life");
        Insurance i2 = new Insurance("HDFC", 3002, 350000, "Health");
        Insurance i3 = new Insurance("UIA", 3003, 55000, "Car");
        Insurance i4 = new Insurance("LIC", 3004, 60000, "Life");
        Insurance i5 = new Insurance("ICICI", 3005, 75000, "Health");

        ArrayList<Insurance> insList = new ArrayList<>();

        insList.add(i1);
        insList.add(i2);
        insList.add(i3);
        insList.add(i4);
        insList.add(i5);

        return insList;
    }

    public static void insertUsingPreparedStatement (Connection connection,ArrayList<Insurance> insList1)
            throws SQLException{
        String pQuery = "insert into insurance values (?,?,?,?)";
        PreparedStatement pStat = connection.prepareStatement(pQuery);

        for(Insurance insurance : insList1){
            pStat.setString(1,insurance.getIns_name());
            pStat.setInt(2,insurance.getIns_id());
            pStat.setInt(3,insurance.getSum());
            pStat.setString(4,insurance.getIns_type());
            pStat.execute();
        }
    }
}
