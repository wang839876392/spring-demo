package com.example.demo;

import com.DO.Item;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author：swift
 * @Date：2019/12/4 10:46
 */
@Component
@Slf4j
@RestController
@RequestMapping("elsatic/")
public class elastic {
    @Autowired
    ElasticsearchTemplate este;
    @GetMapping("add")
    public void addEla(){
        log.info("进入程序");
        este.createIndex(Item.class);
    }

}
