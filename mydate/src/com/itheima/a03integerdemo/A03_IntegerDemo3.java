package com.itheima.a03integerdemo;

public class A03_IntegerDemo3 {
    public static void main(String[] args) {
        //在JDK5的时候提出了一个新机制，自动装箱和自动拆箱

        Integer i1 = 10;
        //在底层，此时还会自动调用静态方法valueOf去创建，但不用手动操作

        int i = i1;
    }
}
