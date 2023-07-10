package com.box.config;

import com.box.ext.ExtConfig;
import org.junit.Test;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 描述
 *
 * @author gengbin29080
 * @date 2022/1/7
 */
public class IOCTest_Ext {

    @Test
    public void test() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ExtConfig.class);
        applicationContext.publishEvent(new ApplicationEvent("我发布的事件") {

        });
        applicationContext.close();
    }
}
