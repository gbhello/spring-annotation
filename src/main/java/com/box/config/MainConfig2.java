package com.box.config;

import com.box.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 描述
 *
 * @author gengbin29080
 * @date 2022/1/7
 */
@Configuration
public class MainConfig2 {
    @Bean
    public Person person() {
        return new Person("张三", 15);
    }
}
