package com.box;

import com.google.common.base.Preconditions;

import java.io.UnsupportedEncodingException;

/**
 * 描述
 *
 * @author gengbin29080
 * @date 2022/4/13
 */
public class Main1 {



    public static void main(String[] args) throws UnsupportedEncodingException {
        String param = "未读代码";
        String name = Preconditions.checkNotNull(param);
        System.out.println(name); // 未读代码
        String param2 = null;
        String name2 = Preconditions.checkNotNull(param2); // NullPointerException
        System.out.println(name2);
    }
}
