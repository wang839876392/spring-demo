package com.springStudy;

import org.springframework.context.ApplicationEvent;

/**
 * @Author：swift
 * @Date：2020/11/25 13:41
 */
public class MyEvent extends ApplicationEvent {
    private String message;

    public MyEvent(String message) {
        super(message);
        this.message = message;
    }

    public void sendMessage() {
        System.out.println(Thread.currentThread());
        System.out.println("********My event**************");
        System.out.println(message);
        System.out.println("*******************************");
    }
}
