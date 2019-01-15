package com.demo.dubbo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @Author Elvis Chen
 * @Date 2019/1/14 19:41
 * @Version 1.0
 **/
public class ProviderClient {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-hello-provider.xml");
        context.start();

        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
