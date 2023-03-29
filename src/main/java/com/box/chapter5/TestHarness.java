package com.box.chapter5;

import java.time.LocalDateTime;
import java.util.concurrent.CountDownLatch;

/**
 * 描述
 *
 * @author gengbin29080
 * @date 2022/4/27
 */
public class TestHarness {
    public long timeTasks(int nThreads, final Runnable task) throws InterruptedException {
        final CountDownLatch startGate = new CountDownLatch(1);
        final CountDownLatch endGate = new CountDownLatch(nThreads);

        for (int i = 0; i < nThreads; i++) {
            Thread t = new Thread() {
                @Override
                public void run() {
                    try {
                        startGate.await();
                        try {
                            task.run();
                        } finally {
                            endGate.countDown();
                        }
                    } catch (InterruptedException e) {
                    }
                }
            };
            t.start();
        }
        long start = System.nanoTime();
        startGate.countDown();
        endGate.await();
        long end = System.nanoTime();
        return end - start;
    }

    public static void main(String[] args) throws InterruptedException {
        TestHarness h = new TestHarness();
        Thread t = new Thread() {
            @Override
            public void run() {
                System.out.println(LocalDateTime.now());
            }
        };
        System.out.println(h.timeTasks(5, t));
        System.out.println(h.timeTasks(10, t));
        System.out.println(h.timeTasks(15, t));
        System.out.println(h.timeTasks(20, t));
        System.out.println(h.timeTasks(25, t));
    }
}
