package com.box.springmaster.one;

/**
 * 描述
 *
 * @author gbhello
 * @date 2024/8/18
 */
public class Ink {
    private String color;
    public void useInk(){
        System.out.println("Using ink..."+color);
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
}
