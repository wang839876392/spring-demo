package com;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author：swift
 * @Date：2020/11/4 17:49
 */
public class JDKProxy {
    static class SelfInvocationHandler implements InvocationHandler {
        private Object target;

        public SelfInvocationHandler(Object target) {
            this.target = target;
        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            System.out.println("JDK dynamic proxy:before...");
            Object invoke = method.invoke(target, args);
            System.out.println("JDK dynamic proxy:after...");
            return invoke;
        }

        public <T> T getProxy() {
            return (T) Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
        }
    }
    public static void main(String[] args) {
        User user = new User("zyu", 18);
        UserService service = new SelfInvocationHandler(new UserServiceImpl()).getProxy();
        service.addUser(user);
    }
    interface UserService {
        void addUser(User user);
    }

    static class UserServiceImpl implements UserService {

        @Override
        public void addUser(User user) {
            System.out.println("add user:" + user);
        }
    }

    static class User {
        private String name;
        private Integer age;

        public User(String name, Integer age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "User{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }
}
