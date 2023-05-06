package com.chen.fanxing;

/**
 * @author cyc
 * @createTime 2023/4/20 22:25
 * @description
 */

public class Test {
    public static void main(String[] args) {
        Box<String> s = new Box<>("陈宇超");
        s.setS("王坤");
        System.out.println(s.getS());

        SubBox subBox = new SubBox("陈宇超");
        System.out.println(subBox.getS());

        SubBox2<String> subBox2 = new SubBox2<>();
        subBox2.setS("chenyuchao");
        System.out.println(subBox2.getS());

    }
}
