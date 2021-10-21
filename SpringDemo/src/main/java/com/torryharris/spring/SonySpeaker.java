package com.torryharris.spring;

import org.springframework.stereotype.Component;

@Component
public class SonySpeaker implements Speaker{
    @Override
    public void sound(){
        System.out.println("Sony \n Speaker : 4 \n Sub : 1 ");
    }
}
