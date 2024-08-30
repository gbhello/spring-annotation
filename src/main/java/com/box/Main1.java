package com.box;

import com.box.springmaster.one.HelloWorld;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 描述
 *
 * @author gengbin29080
 * @date 2022/4/13
 */
public class Main1 {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        HelloWorld helloWorld = (HelloWorld) context.getBean("helloWorld");

        helloWorld.sayHello();
    }

}

