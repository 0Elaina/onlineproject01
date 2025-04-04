package com.itheima.a05interfacedemo5;

public class PingpongPlayer extends Player{
    public PingpongPlayer(){}

    public PingpongPlayer(String name, int age){
        super(name, age);
    }

    @Override
    public void learn(){
        System.out.println("乒乓球运动员在学习打乒乓球");
    }
}
