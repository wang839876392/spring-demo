package com;

import java.lang.annotation.*;

/**
 * @Author：swift
 * @Date：2019/8/29 15:25
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface SPI {
    String value() default "";
    /**
     * 模块名字
     */
    String modelName() default "";

    /**
     * 操作类型
     */
    String option();

}
