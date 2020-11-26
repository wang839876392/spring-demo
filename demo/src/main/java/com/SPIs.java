package com;

import java.lang.annotation.*;

/**
 * @Author：swift
 * @Date：2019/8/29 15:51
 */
@Target({ElementType.PARAMETER, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface SPIs {
    String description() default "";
}
