//package com.box.config;
//
//import com.box.aop.MathCalculator;
//import org.junit.Test;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//
///**
// * 描述
// *
// * @author gengbin29080
// * @date 2022/1/7
// */
//public class MainConfigTest {
//
////    @Test
////    public void test3() {
////        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(MainConfigOfAOP.class);
////        String[] beanDefinitionNames = annotationConfigApplicationContext.getBeanDefinitionNames();
////        for (String name : beanDefinitionNames) {
////            System.out.println(name);
////        }
////        MathCalculator mathCalculator = (MathCalculator) annotationConfigApplicationContext.getBean("mathCalculator");
////        mathCalculator.div(1, 0);
////    }
//
//    @Test
//    public void test2() {
//        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig2.class);
//        String[] definitionNames = applicationContext.getBeanDefinitionNames();
//        for (String name : definitionNames) {
//            System.out.println(name);
//        }
//        Object person = applicationContext.getBean("person");
//        Object person1 = applicationContext.getBean("person");
//        System.out.println(person == person1);
//    }
//
//    @Test
//    public void test() {
//        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigOfLifeCycle.class);
//        System.out.println("容器创建完成...");
//        applicationContext.close();
//    }
//}
