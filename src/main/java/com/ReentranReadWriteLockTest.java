package com;

import org.springframework.scheduling.concurrent.CustomizableThreadFactory;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @Author：swift
 * @Date：2020/11/24 15:45
 */
public class ReentranReadWriteLockTest {
    ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
    ReentrantReadWriteLock.ReadLock readLock = lock.readLock();
    ReentrantReadWriteLock.WriteLock writeLock = lock.writeLock();

    public void read() {
        try {
            readLock.lock();
            System.out.println("“线程" + Thread.currentThread().getName() + "进入");
            Thread.sleep(3000);
            System.out.println("线程" + Thread.currentThread().getName() + "退出");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            readLock.unlock();
        }
    }

    public void write() {
        try {
            writeLock.lock();
            System.out.println("线程" + Thread.currentThread().getName() + "进入");
            Thread.sleep(3000);
            System.out.println("线程" + Thread.currentThread().getName() + "退出");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            writeLock.unlock();
        }
    }

    public static void main(String[] args) {
        ReentranReadWriteLockTest wr = new ReentranReadWriteLockTest();
        Thread t1 = new Thread(wr::read, "t1");
        Thread t2 = new Thread(wr::read, "t2");
        Thread t3 = new Thread(wr::write, "t3");
        Thread t4 = new Thread(wr::write, "t4");
        t3.start();
        t2.start();
    }

    public static volatile ExecutorService executor;

    public static ExecutorService getExecutor() {
        if (executor == null) {
            synchronized (ReentranReadWriteLockTest.class) {
                if (executor == null) {
                    executor = new ThreadPoolExecutor(1, 1, 5
                            , TimeUnit.HOURS, new LinkedBlockingDeque<>(10000),
                            new CustomizableThreadFactory("111"), new ThreadPoolExecutor.CallerRunsPolicy());
                }
            }
        }
        return executor;
    }


}
