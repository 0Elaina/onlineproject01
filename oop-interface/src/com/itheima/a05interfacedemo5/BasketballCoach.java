package com.itheima.a05interfacedemo5;

public class BasketballCoach extends Coach implements Inter{
    public BasketballCoach() {
    }

    public BasketballCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach(){
        System.out.println("篮球教练正在教篮球");
    }

    @Override
    public void speak(){
        System.out.println("篮球教练会说英语");
    }
}
