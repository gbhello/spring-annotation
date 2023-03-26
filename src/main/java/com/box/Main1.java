package com.box;

import com.box.leetcode.User;
import java.lang.reflect.InvocationTargetException;
import org.apache.commons.beanutils.PropertyUtils;

/**
 * 描述
 *
 * @author gengbin29080
 * @date 2022/4/13
 */
public class Main1 {



    public static void main(String args[])
        throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        User node1 = new User(1,"zhangsan");
        User node2 = new User();

        PropertyUtils.copyProperties(node2,node1);

//        BeanCopier beanCopier = BeanCopier
//            .create(User.class, User.class, false);
//
//        beanCopier.copy(node1,node2,null);
        System.out.println(node2);
    }
}
