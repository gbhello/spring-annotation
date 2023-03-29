package com.box.chapter4;

/**
 * 描述
 *
 * @author gengbin29080
 * @date 2022/3/12
 */
public class MutablePoint {
    public int x, y;

    public MutablePoint() {
        x = 0;
        y = 0;
    }

    public MutablePoint(MutablePoint p) {
        this.x = p.x;
        this.y = p.y;
    }
}
