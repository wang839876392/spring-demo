package com.example.zhongshou.demo;

import com.springStudy.MyEvent;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {
    @Autowired
    private ApplicationContext applicationContext;

    @Test
    public void contextLoads() throws InterruptedException {
        MyEvent event = new MyEvent("hello");
        applicationContext.publishEvent(event);
        Thread.sleep(2);
        System.out.println(">>>OK");
    }

}
