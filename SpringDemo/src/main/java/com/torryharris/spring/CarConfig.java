package com.torryharris.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
@Configuration
@ComponentScan(basePackages ="com.torryharris.spring" )
public class CarConfig {

//    @Bean
//    public Tyre getTyre(){
//        return new Tyre();
//    }
//
//    @Bean
//    public Engine getEngine(){
//        return new Engine();
//    }
//    @Bean
//    public MusicSystem getMusicSystem(){
//        return new MusicSystem();
//
//    }
//    @Bean
//    public Speaker getSpeaker(){
//        return new SonySpeaker();
//    }
}
