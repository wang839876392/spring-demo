package com.spi;

import com.google.auto.service.AutoService;

/**
 * @Author：swift
 * @Date: Created in 10:54 2021/7/28
 */
@AutoService(Decode.class)
public class RSADecoder extends AbstractDecodeFactory {
    public static final String ENCODING_NAME = "RSA";

    public RSADecoder() {
        System.out.println("RSADecode init !!!");
    }

    @Override
    public boolean isEncodingNameSupported(String encodingName) {
        return ENCODING_NAME.equals(encodingName.trim());
    }

    @Override
    public String decode(String data) {
        return String.format("RSA decode %s", data);
    }
}
