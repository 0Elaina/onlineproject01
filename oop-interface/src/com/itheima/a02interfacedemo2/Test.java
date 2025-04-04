package com.itheima.a02interfacedemo2;

public class Test {
    public static void main(String[] args) {

        System.out.println(Inter.a);
        //被final修饰，不能修改
        // Inter.a = 20;

        InterImpl i1 = new InterImpl();
        i1.method();
    }
}
