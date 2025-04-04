package com.itheima.a02innerclassdemo2;

public class Outer {
    String name;

    class Inner{
        int age;

    }

    //获取成员内部类对象
    public Outer.Inner getInstance(){
        return new Outer.Inner();
    }
}
