package com.itheima.a06innerclassdemo6;

public class Test2 {
    public static void main(String[] args) {
    /*
    回顾一下匿名内部类的格式


                new 接口/类名(){
                        重写的方法;
                };
     */


        //整体可以看作Swim接口的实现类对象
        //接口多态
        Swim s = new Swim() {
            @Override
            public void swim() {
                System.out.println("重写之后的游泳方法");
            }
        };

        s.swim();


        new Swim(){
            @Override
            public void swim(){
                System.out.println("111");
            }
        }.swim();

    }
}