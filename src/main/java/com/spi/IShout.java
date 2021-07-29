package com.spi;

/**
 * @Author：swift
 * @Date: Created in 10:49 2021/7/28
 */
public interface IShout {
    void shout();
}

class Cat implements IShout {
    @Override
    public void shout() {
        System.out.println("miao miao");
    }
}

class Dog implements IShout {
    @Override
    public void shout() {
        System.out.println("wang wang");
    }
}
