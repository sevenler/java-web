package com.ujipin.dubbo.core.service;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by Johnny on 15/11/17.
 */
public class Provider {

    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext appContext=new ClassPathXmlApplicationContext(new String[]{"spring/spring.xml"});
        appContext.start();
        System.in.read();
    }

}
