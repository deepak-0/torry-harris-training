package com.torryharris.spring2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LapTopDemo {
    public static void main(String[] args) {
        ApplicationContext factory = new AnnotationConfigApplicationContext(LapTopConfig.class);

        HardDrive segate= (HardDrive) factory.getBean("hd");
        segate.display();

        RAM SanDisk = factory.getBean(RAM.class);
        SanDisk.display();

        MotherBoard asus= factory.getBean(MotherBoard.class);
        asus.display();

    }
}
