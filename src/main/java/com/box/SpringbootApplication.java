package com.box;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 描述
 *
 * @author gbhello
 * @date 2024/8/30
 */
@SpringBootApplication
@MapperScan(basePackages = "com.box.dao")
public class SpringbootApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringbootApplication.class,args);
    }
}
