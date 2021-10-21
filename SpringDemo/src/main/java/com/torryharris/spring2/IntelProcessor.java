package com.torryharris.spring2;

import org.springframework.stereotype.Component;

@Component
public class IntelProcessor implements Processor {


    @Override
    public void process() {
        System.out.println("Processor : Intel Processor");
    }
}
