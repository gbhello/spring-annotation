package com.box.aop;

/**
 * 描述
 *
 * @author gengbin29080
 * @date 2022/1/13
 */
public class MathCalculator {
    public int div(int i, int j) {
        System.out.println("MathCalculator...div...");
        return i / j;
    }
}
