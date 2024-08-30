package com.box.springmaster.one;

/**
 * 描述
 *
 * @author gbhello
 * @date 2024/8/18
 */
public class Printer {
    private Ink ink;

    public void setInk(Ink ink) {
        this.ink = ink;
    }

    public void print() {
        ink.useInk();
        System.out.println("打印中...");
    }
}
