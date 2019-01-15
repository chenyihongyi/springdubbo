package com.demo.dubbo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

/**
 * @Author Elvis Chen
 * @Date 2019/1/15 11:49
 * @Version 1.0
 **/
public class ConsumerClient {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-hello-consumer.xml");
        context.start();

        while(true){
            Scanner scanner = new Scanner(System.in);
            String message = scanner.next();

            //获取接口
            ServiceAPI serviceAPI = (ServiceAPI)context.getBean("consumerService");
            System.out.println(serviceAPI.sendMessage(message));
        }
    }

}