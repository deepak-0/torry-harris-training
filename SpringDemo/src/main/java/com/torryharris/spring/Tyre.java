package com.torryharris.spring;

import org.springframework.stereotype.Component;

@Component
public class Tyre {
    public void display(){
        System.out.println("Tyre\n " +
                            "Name : MRF \n" +
                            " Size : 112 ");
    }
}
