package com.torryharris.spring;

import com.torryharris.spring.CarConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CarDemo {
    public static void main(String[] args) {
        ApplicationContext appContext = new AnnotationConfigApplicationContext(CarConfig.class);
        Tyre MRF = appContext.getBean(Tyre.class);
        MRF.display();

        Engine eng = appContext.getBean(Engine.class);
        eng.display();

        MusicSystem ms = appContext.getBean(MusicSystem.class);
        ms.display();
    }
}
