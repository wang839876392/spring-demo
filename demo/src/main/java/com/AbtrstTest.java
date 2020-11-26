package com;

import javax.swing.*;

/**
 * @Author：swift
 * @Date：2020/6/8 11:12
 */
public class AbtrstTest {
    interface Animal{
        public void show();
    }

    class Horse implements Animal{
        JScrollPane sp;
        JFrame jf=new JFrame("工厂方法模式测试");
        @Override
        public void show() {

        }
    }

}
