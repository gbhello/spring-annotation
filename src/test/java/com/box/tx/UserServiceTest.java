package com.box.tx;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 描述
 *
 * @author gengbin29080
 * @date 2022/1/13
 */
public class UserServiceTest {
    @Test
    public void insertUser() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(TxConfig.class);
        UserService userService = applicationContext.getBean(UserService.class);
        userService.insertUser();
        applicationContext.close();
    }
}
