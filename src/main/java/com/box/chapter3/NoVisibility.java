package com.box.chapter3;

import java.util.concurrent.TimeUnit;

/**
 * 描述
 *
 * @author gengbin29080
 * @date 2022/3/10
 */
public class NoVisibility {
    private static boolean ready;
    private static int number;

    private static class ReaderThread extends Thread {
        @Override
        public void run() {
            while (!ready) {
                Thread.yield();
            }
            System.out.println(number);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        new ReaderThread().start();
        TimeUnit.SECONDS.sleep(1);
        ready = true;
        TimeUnit.SECONDS.sleep(1);
        number = 42;
    }
}
