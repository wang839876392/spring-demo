package com.spi;

import java.io.UnsupportedEncodingException;
import java.util.ServiceLoader;

/**
 * @Author：swift
 * @Date: Created in 10:59 2021/7/28
 */
public class DecodeFactory {
    private static ServiceLoader<Decode> decodeServiceLoader = ServiceLoader.load(Decode.class);

    public static Decode RSADecoder() throws UnsupportedEncodingException {
        return getDecoder("RSA");
    }

    public static Decode AESDecoder() throws UnsupportedEncodingException {
        return getDecoder("AES");
    }

    public static Decode getDecoder(String name) throws UnsupportedEncodingException {
        for (Decode decode : decodeServiceLoader) {
            if (decode.isEncodingNameSupported(name)) {
                return decode;
            }
        }
        throw new UnsupportedEncodingException();
    }


}
