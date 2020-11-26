package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class Demo {

    public static void main(String[] args) {
        SpringApplication.run(Demo.class, args);
    }

    /**
     * 1 小狮贷
     * 2 小狮省钱
     *
     * @return
     */

}

