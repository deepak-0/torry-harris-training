package com.torryHarris.Driver;

import com.torryHarris.Exception.InsufficientFundsException;
import com.torryHarris.Exception.WithdrawLimitExceededException;
import com.torryHarris.Model.Person;

public class CustomExceptionDemo {
    public static void main(String[] args) {


        Person p1 = new Person("Deepak", 0007, 50000);
        try {
            p1.withdrawAmount(3000);
            p1.withdrawAmount(34000);
        }
        catch (WithdrawLimitExceededException | InsufficientFundsException ex){
            System.err.println(ex);
        }
        finally {
            System.out.println("Thank you!! Visit again");
        }
    }
}
