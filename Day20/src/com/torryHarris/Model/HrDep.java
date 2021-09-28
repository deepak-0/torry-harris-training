package com.torryHarris.Model;


import com.torryHarris.Exception.CLLimitExceededException;
import com.torryHarris.Exception.InvalidCLRequestException;
import com.torryHarris.Model.Employee;

public class HrDep {
    public void requestCL(int eId, int days) throws InvalidCLRequestException,CLLimitExceededException {
        if(days>3){
            throw new InvalidCLRequestException( " Invalid CL request");
        }
        else if(10<1){
            throw new CLLimitExceededException("Leave limit Exceeded");

        }
        else{
            System.out.println("CL approved");
        }
        System.out.println("Available CL : ");
    }
}
