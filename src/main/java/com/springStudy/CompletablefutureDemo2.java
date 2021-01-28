package com.springStudy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

/**
 *
 */
public class CompletablefutureDemo2 {

    /**
     * @param args:
     * @return: void
     * @author: swift
     * @date: 2021/1/28 15:34
     * @description:
     */
    public static void main(String[] args) {

        for (int i = 0; i < 500; i++) {

            long start = System.currentTimeMillis();
            List<String> list = test();
            long end = System.currentTimeMillis();
            System.out.println("消耗时间："+(end-start));
            System.out.println(list);
            System.out.println(list.size());
            if(list.size()<7){
                System.out.println(
                        "************************************************************************************Error:"+list);
            }
        }

    }

    private static List<String> test() {
        List<String> taskList = new ArrayList<>();
        taskList.add("hello"); taskList.add("world"); taskList.add("java"); taskList.add("php"); taskList.add("python"); taskList.add("go");taskList.add("net");
        List<String> list = Collections.synchronizedList(new ArrayList<>());
        CompletableFuture[] futures = taskList.stream().map(task ->
                CompletableFuture.
                        supplyAsync(task::toUpperCase)
                        .whenComplete((v, e) -> {
                            list.add(v);
                        })
        ).toArray(CompletableFuture[]::new);

        CompletableFuture.allOf(futures).join();

        return list;
    }

/*    private static List<String> test() {
        List<String> taskList = new ArrayList<>();
        taskList.add("hello");taskList.add("world"); taskList.add("java"); taskList.add("php"); taskList.add("python"); taskList.add("go");taskList.add("net");
        List<String> list = new ArrayList<>();
        List<CompletableFuture> futureList = new ArrayList<>();
        taskList.forEach(task -> {
            CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
                sleep(2);
                return task.toUpperCase();
            }).whenComplete((v, e) -> list.add(v));
            futureList.add(future);
        });
        CompletableFuture.allOf(futureList.toArray(new CompletableFuture[0])).join();
        return list;
    }*/

    private static void sleep(Integer l) {
        try {
            TimeUnit.SECONDS.sleep(l);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
