package com.spi;

import java.io.UnsupportedEncodingException;

/**
 * @Author：swift
 * @Date: Created in 9:35 2021/7/29
 */
public class aaaaa {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String[] encodeNameArray = new String[]{"AES", "RSA"};
        String data = "data";
        for (int i = 0; i < 2; i++) {
            System.out.println(String.format("次数：%s", i));
            Decode decoder = DecodeFactory.getDecoder(encodeNameArray[i % 2]);
            System.out.println(decoder.description());
            System.out.println(String.format("内容 : %s", decoder.decode(data)));
        }
        System.out.println(111);

    }
}
