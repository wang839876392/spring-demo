package com.spi;

/**
 * @Author：swift
 * @Date: Created in 11:13 2021/7/28
 */
public abstract class AbstractDecodeFactory implements Decode {
    @Override
    public String description() {
        return getClass().getSimpleName();
    }
}
