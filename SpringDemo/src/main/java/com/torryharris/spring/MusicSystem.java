package com.torryharris.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicSystem {
    @Autowired
    Speaker sony;
    public Speaker getSony() {
        return sony;
    }

    public void setSony(Speaker sony) {
        this.sony = sony;
    }



    public void display(){
        System.out.println("Music System :");
        sony.sound();
    }
}
