package com.springStudy;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @Author：swift
 * @Date: Created in 15:10 2021/7/29
 */
@Slf4j
public class MyApplicationContext implements ApplicationContextInitializer<ConfigurableApplicationContext> {
    private static ConfigurableApplicationContext applicationContext;

    @Override
    public void initialize(ConfigurableApplicationContext configurableApplicationContext) {
        applicationContext = configurableApplicationContext;
        log.info("-----执行-----------MyApplicationContextInitializer initialize-----");
    }

    public static ConfigurableApplicationContext invoke(){
        return applicationContext;
    }


}
