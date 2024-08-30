package com.box.springmaster.one;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 描述
 *
 * @author gbhello
 * @date 2024/8/18
 */
public class MainApp {
    public static void main(String[] args) {
//        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//
//        Printer printer = (Printer) context.getBean("printer");
//
//        Map<String, Ink> beans = context.getBeansOfType(Ink.class);
//
//        printer.print();

        List<List<String>> listOfLists = Arrays.asList(
                Arrays.asList("a", "b", "c"),
                Arrays.asList("d", "e"),
                Arrays.asList("f", "g", "h")
        );

        List<String> flatList = listOfLists.stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList());

        System.out.println(flatList); // 输出: [a, b, c, d, e, f, g, h]

    }
}
