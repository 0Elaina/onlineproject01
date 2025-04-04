package com.itheima.a05interfacedemo5;

public class PingpongCoach extends Coach implements Inter{
    public PingpongCoach() {
    }

    public PingpongCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach(){
        System.out.println("乒乓球教练正在教乒乓球");
    }

    @Override
    public void speak(){
        System.out.println("乒乓球教练会说英语");
    }
}
