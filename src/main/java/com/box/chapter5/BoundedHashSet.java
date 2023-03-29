package com.box.chapter5;

import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.Semaphore;

/**
 * 描述
 *
 * @author gengbin29080
 * @date 2022/4/28
 */
public class BoundedHashSet<T> {
    private final Set<T> set;
    private final Semaphore sem;

    public BoundedHashSet(int bound) {
        this.set = Collections.synchronizedSet(new HashSet<T>());
        sem = new Semaphore(bound);
    }

    public boolean add(T o) throws InterruptedException {
        sem.acquire();

        boolean wasAdded = false;
        try {
            wasAdded = set.add(o);
            return wasAdded;
        } finally {
            if (!wasAdded) {
                sem.release();
            }
        }
    }

    public boolean remove(Object o) {
        boolean wasRemoved = set.remove(o);
        if (wasRemoved) {
            sem.release();
        }
        return wasRemoved;
    }

    public static void main(String[] args) throws InterruptedException {
        BoundedHashSet<Integer> set = new BoundedHashSet<>(5);
        int i = 0;
        while (i < 6) {
            set.add(i++);
            Random random = new Random();
            int r = random.nextInt(5);
            if (r % 2 == 0) {
                set.remove(r);
            }
        }
        System.out.println(i);
    }
}
