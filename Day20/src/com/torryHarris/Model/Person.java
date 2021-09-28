package com.torryHarris.Model;

import com.torryHarris.Exception.InsufficientFundsException;
import com.torryHarris.Exception.WithdrawLimitExceededException;

public class Person {
    private String name;
    private int accountNumber;
    private int balance;
    private int totalAmountWithDrawn;
    private final int DAILY_WITHDRAW_LIMIT=40000;


    public Person(String name, int accountNumber, int balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
        totalAmountWithDrawn=0;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getTotalAmountWithDrawn() {
        return totalAmountWithDrawn;
    }

    public void setTotalAmountWithDrawn(int totalAmountWithDrawn) {
        this.totalAmountWithDrawn = totalAmountWithDrawn;
    }

    public void withdrawAmount(int amount) throws WithdrawLimitExceededException,
            InsufficientFundsException {
        if(amount>balance){
            System.out.println("Insufficient Funds !");
            return;
        }
        if(totalAmountWithDrawn+amount > DAILY_WITHDRAW_LIMIT){
            throw new WithdrawLimitExceededException("Withdrawal Limit Exceeded :\n"+
                    "Total amount withdrawn today is " +totalAmountWithDrawn);

        }
        balance-=amount;
        totalAmountWithDrawn+=amount;
        System.out.println("Hello " +name+"\n The Withdrawal is success for Rs."+amount);
        System.out.println("Available Balance is Rs."+balance);
        System.out.println("Total amount withdrawn for today is Rs."+totalAmountWithDrawn);

    }
}
