package com.box.config;

import com.box.bean.Car.Car;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 描述
 *
 * @author gengbin29080
 * @date 2022/4/1
 */
@ComponentScan("com.box.bean")
@Configuration
public class MainConfigOfLifeCycle {

    @Bean(initMethod = "init", destroyMethod = "destroy")
    public Car car() {
        return new Car();
    }
}
