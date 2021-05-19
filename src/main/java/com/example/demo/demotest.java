package com.example.demo;

import lombok.extern.slf4j.Slf4j;

import java.util.Scanner;

/**
 * @Author：swift
 * @Date：2020/3/19 11:46
 */
@Slf4j
public class demotest {
    public static void main(String[] args) {
        System.out.println("     *");
        System.out.println("    **");
        System.out.println("  ****");
        System.out.println(" *****");
        System.out.println("******");
        log.info("1223333");
    }

    static class InstanceObj {
        public static InstanceObj obj = new InstanceObj();
        public int x;//注意此处无赋值操作
        public int y = 0;

        private InstanceObj() {
            x++;
            y++;
        }
    }

    public static class TestInstanceVariable {
        public static void main(String[] args) {
            InstanceObj obj = InstanceObj.obj;
            System.out.println("x=" + obj.x);
            System.out.println("y=" + obj.y);
        }
    }

    static class StaticObj {
        public static StaticObj obj = new StaticObj();
        public static int x;
        public static int y = 0;

        private StaticObj() {
            x++;
            y++;
        }
    }

    public static class TestStaticVariable {
        public static void main(String[] args) {
            StaticObj obj = StaticObj.obj;
            System.out.println("x=" + obj.x);
            System.out.println("y=" + obj.y);
        }
    }

    public static class Base {
        private String baseName = "111";

        public Base() {
            callName();
        }

        public void callName() {
            System.out.println(baseName);
        }

        static class Sub extends Base {
            private String baseName = "sub";

            public  void Name() {
                System.out.println(baseName);
            }
        }

        public static void main(String[] args) {
            Base b = new Sub();
        }
    }
}
