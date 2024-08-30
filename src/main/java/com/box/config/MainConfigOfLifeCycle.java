//package com.box.config;
//
//import com.box.bean.BeanA;
//import com.box.bean.BeanB;
//import com.box.bean.BeanC;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;
//
///**
// * 描述
// *
// * @author gengbin29080
// * @date 2022/4/1
// */
//@ComponentScan("com.box.bean")
//@Configuration
//public class MainConfigOfLifeCycle {
//
//    //    @Bean(initMethod = "init", destroyMethod = "destroy")
////    public Car car() {
////        return new Car();
////    }
//    @Bean
//    public BeanC beanC() {
//        System.out.println("bean C init");
//        return new BeanC();
//    }
//
//    @Bean
//    public BeanA beanA(@Qualifier("beanB1") BeanB beanB) {
//        System.out.println("bean A init"+beanB.getName());
//        return new BeanA();
//    }
//
//    @Bean(name = "beanB1")
//    public BeanB beanB1() {
//        System.out.println("bean B1 init");
//        return new BeanB("B1");
//    }
//
//    @Bean(name = "beanB")
//    public BeanB beanB() {
//        System.out.println("bean B init");
//        return new BeanB("B");
//    }
//}
