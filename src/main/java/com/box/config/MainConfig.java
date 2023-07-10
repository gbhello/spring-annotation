package com.box.config;

import com.box.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

/**
 * 描述1
 *
 * @author gengbin29080
 * @date 2022/1/7
 */
@Configuration
@ComponentScan(value = "com.box", includeFilters = {
//        @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = {Controller.class}),
        @ComponentScan.Filter(type = FilterType.CUSTOM, classes = {MyTypeFilter.class})
}, useDefaultFilters = false)
public class MainConfig {
    @Bean
    public Person person() {
        return new Person("lisi", 20);
    }
}
