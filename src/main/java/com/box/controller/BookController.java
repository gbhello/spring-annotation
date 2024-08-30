package com.box.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 描述
 *
 * @author gengbin29080
 * @date 2022/1/7
 */
@RestController
@RequestMapping("/hello")
public class BookController {
    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

}
