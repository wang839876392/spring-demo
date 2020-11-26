package com;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Logger;

/**
 * @Author：swift
 * @Date：2019/8/29 15:58
 */
@Aspect
@EnableAspectJAutoProxy(proxyTargetClass=true)
@Component
public class AspectLog {
    @Pointcut("@annotation(com.SPI)")
    public void serviceAspect(){
    }

    //Controller层切点
    @Pointcut("@annotation(com.SPIs)")
    public void controllerAspect(){
    }
    @Around("controllerAspect()")
    public Object  doBefore(ProceedingJoinPoint joinPoint) throws Throwable {
        long beginTime = System.currentTimeMillis();
        System.out.println("方法环绕start...around");
        Object result = joinPoint.proceed();
        long time = System.currentTimeMillis() - beginTime;
        logCostTime(joinPoint, time);
        System.out.println(result);
        String args[] = {"1","2","3"};
        ArrayList a = (ArrayList) Arrays.asList(args);
        a.iterator();
        return result;

    }

//    public static void main(String[] args) {
//        Thread a = new Thread(() -> {
//            try {
//                Thread.sleep(1000L);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            pri();
//        });
//        a.run();
//        System.out.println("ping");
//
//    }
    public static void main(String[] args) {
        String shieldPkg="1,2,3";
        String shieldPkg1="1,2";
        List<String> pkg = StringUtils.isEmpty(shieldPkg1) ? new ArrayList<String>() : Arrays.asList(shieldPkg.split(","));
        List<String> oldpkg = StringUtils.isEmpty(shieldPkg) ? new ArrayList<String>() : Arrays.asList(shieldPkg1.split(","));
        pkg.removeAll(oldpkg);
        Arrays.asList(shieldPkg.split(","));
    }
    static void pri(){
        System.out.println("pang");
    }
    private void logCostTime(ProceedingJoinPoint joinPoint, long time) {
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        String className = joinPoint.getTarget().getClass().getName();
        String methodName = signature.getName();
        System.out.println(className+"--"+methodName+"--"+time);
    }



}
