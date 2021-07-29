package com.spi;

import com.google.auto.service.AutoService;

/**
 * @Author：swift
 * @Date: Created in 10:55 2021/7/28
 */
@AutoService(Decode.class)
public class AESDecode extends AbstractDecodeFactory{
    public static final String ENCODING_NAME = "AES";

    public AESDecode() {
        System.out.println("AESDecoder init!!!");
    }

    @Override
    public boolean isEncodingNameSupported(String encodingName) {
        return ENCODING_NAME.equals(encodingName.trim());
    }

    @Override
    public String decode(String data) {
        return String.format("AES decode %s",data);
    }
}
