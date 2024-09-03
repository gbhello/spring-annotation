//package com.box.aop;
//
//import org.aspectj.lang.JoinPoint;
//import org.aspectj.lang.annotation.*;
//
//import java.util.Arrays;
//
///**
// * 描述
// *
// * @author gengbin29080
// * @date 2022/1/13
// */
//@Aspect
//public class LogAspects {
//    @Pointcut("execution(public int com.box.aop.MathCalculator.*(..))")
//    public void pointcut() {
//    }
//
//    @Before("pointcut()")
//    public void logStart(JoinPoint joinPoint) {
//        Object[] args = joinPoint.getArgs();
//        System.out.println(joinPoint.getSignature().getName() + "运行...@Before参数列表是：{" + Arrays.asList(args) + "}");
//    }
//
//    @After("pointcut()")
//    public void logEnd(JoinPoint joinPoint) {
//        System.out.println(joinPoint.getSignature().getName() + "结束...@After");
//    }
//
//    @AfterReturning(value = "pointcut()", returning = "result")
//    public void logReturn(JoinPoint joinPoint, Object result) {
//        System.out.println(joinPoint.getSignature().getName() + "正常返回，@AfterReturning运行结果：{" + result + "}");
//    }
//
//    @AfterThrowing(value = "pointcut()", throwing = "exception")
//    public void logException(JoinPoint joinPoint, Exception exception) {
//        System.out.println(joinPoint.getSignature().getName() + "异常，异常信息：{" + exception + "}");
//    }
//}
