package com.spi;

/**
 * @Author：swift
 * @Date: Created in 10:53 2021/7/28
 */
public interface Decode {
    String description();
    boolean isEncodingNameSupported(String encodingName);

    String decode(String data);
}
