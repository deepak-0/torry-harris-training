package com.torryharris.spring2;

import org.springframework.stereotype.Component;

@Component
public class AmdProcessor implements Processor{
    @Override
    public void process() {
        System.out.println("AMD Processor : Ryzen 5");
    }
}
