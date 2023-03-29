package com.box;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import org.apache.commons.collections4.CollectionUtils;

/**
 * 描述
 *
 * @author gengbin29080
 * @date 2022/4/13
 */
public class Main1 {



    public static void main(String args[])
        throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1, 2, 3));
        ArrayList<Integer> b = new ArrayList<>(Arrays.asList(2, 3));

        System.out.println(CollectionUtils.subtract(a,b));
    }
}
