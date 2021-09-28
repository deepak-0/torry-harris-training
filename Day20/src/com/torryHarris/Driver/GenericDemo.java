package com.torryHarris.Driver;

import com.torryHarris.Model.GenericPrint;

public class GenericDemo {
    public static void main(String[] args) {


        GenericPrint<Integer> iPrint = new GenericPrint<>(1);

        System.out.println(iPrint.getObj());
        GenericPrint<String> strPrint = new GenericPrint<>("Hello");
    }



}
