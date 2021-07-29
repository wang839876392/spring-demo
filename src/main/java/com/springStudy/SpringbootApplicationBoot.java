package com.springStudy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Arrays;

/**
 * @Author：swift
 * @Date: Created in 15:33 2021/7/29
 */
@SpringBootApplication
public class SpringbootApplicationBoot {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(SpringbootApplicationBoot.class);
        application.addInitializers(new MyApplicationContext());
        application.run(args);
        ConfigurableApplicationContext context = MyApplicationContext.invoke();
        System.out.println(Arrays.toString(context.getEnvironment().getActiveProfiles()));

    }

}
