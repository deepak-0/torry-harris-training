package com.torryharris.Driver;

import com.torryharris.Testing.Calculator;

public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator calculator=new Calculator();
        System.out.println("5+5 = "+calculator.add(5,5));
        System.out.println("15-5 = "+calculator.sub(15,5));
        System.out.println("50*5 = "+calculator.mul(50,5));
        System.out.println("15/5 = "+calculator.div(15,5));
    }


}
