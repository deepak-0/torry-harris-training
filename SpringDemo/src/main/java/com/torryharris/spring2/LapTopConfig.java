package com.torryharris.spring2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
// using Component scan
@Configuration
@ComponentScan(basePackages = "com.torryharris.spring2")
public class LapTopConfig {
    //using bean
//    @Bean
//    public HardDrive getHardDrive() {
//        return new HardDrive();
//    }
//    @Bean
//    public RAM getRam(){
//        return new RAM();
//        }
//    @Bean
//    public MotherBoard getMotherBoard(){
//        return new MotherBoard();
//    }
//
//    @Bean
//    public Processor getProcessor(){
//        return new IntelProcessor();
//    }

}
