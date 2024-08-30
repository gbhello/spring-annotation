package com.box.bean;

import lombok.Data;

/**
 * 描述
 *
 * @author gbhello
 * @date 2024/8/14
 */
@Data
public class BeanB {
    private String name;

    public BeanB() {
    }

    public BeanB(String name) {
        this.name = name;
    }
}
