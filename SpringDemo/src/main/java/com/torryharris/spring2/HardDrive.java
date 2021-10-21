package com.torryharris.spring2;

import org.springframework.stereotype.Component;

@Component("hd")
public class HardDrive {

    public HardDrive() {
    }

    public void display(){
        System.out.println("HardDisk \n Type - Magnetic \n size - 1TB ");
    }
}
