package com.torryharris.spring2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component()
public class MotherBoard {

    @Autowired
    @Qualifier("amdProcessor")
    Processor cpu;

    public Processor getCpu() {
        return cpu;
    }

    public void setCpu(Processor cpu) {
        this.cpu = cpu;
    }

    public void display(){
        System.out.println("MotherBoard \n Company - Asus \n I/O - 4 slots");
        cpu.process();
    }
}
