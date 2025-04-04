package com.itheima.a06interfacedemo6;

public interface Inter1 {
    public abstract void method();

    public default void show(){
        System.out.println("Inter接口中的默认方法 --- show");
    }
}
