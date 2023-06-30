package com.chen.fanxing;

public class Demo {
    public static void main(String[] args) {
        Box<String> box = new Box<>();

        box.setS("chenyuchao");

        System.out.println(box.getS());

        SubBox subBox = new SubBox();
        subBox.setS("jiansheng");
        System.out.println(subBox.getS());

        SubBox3<String> stringSubBox3 = new SubBox3<>();

        stringSubBox3.setS("陈宇超");

        System.out.println(stringSubBox3.getS());


    }
}
