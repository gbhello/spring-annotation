package com.box.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

/**
 * 描述
 *
 * @author gengbin29080
 * @date 2022/1/7
 */
@AllArgsConstructor
@ToString
@Data
public class Person {
    private String name;
    private Integer age;
}
