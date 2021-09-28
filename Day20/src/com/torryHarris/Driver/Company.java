package com.torryHarris.Driver;

import com.torryHarris.Exception.CLLimitExceededException;
import com.torryHarris.Exception.InvalidCLRequestException;
import com.torryHarris.Model.Employee;
import com.torryHarris.Model.HrDep;

public class Company {
    public static void main(String[] args) {
        Employee e1 = new Employee(001,"Deepak","Manager");
        HrDep hr=new HrDep();

        try{
            hr.requestCL(001,3);
        } catch (CLLimitExceededException e) {
            e.printStackTrace();
        } catch (InvalidCLRequestException e) {
            e.printStackTrace();
        }
    }
}
