package com.itheima.a05interfacedemo5;

public abstract class Player extends Person{
    public Player(){}

    public Player(String name ,int age){
        super(name,age);
    }

    public abstract void learn();
}
