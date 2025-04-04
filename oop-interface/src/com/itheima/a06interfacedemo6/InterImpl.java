package com.itheima.a06interfacedemo6;

public class InterImpl implements Inter ,Inter1{
    @Override
    public void method() {
        System.out.println("实现类重写的");
    }

/*    @Override
    public default void show(){
        System.out.println("重写接口中的默认方法");
    }*/
    @Override
    public void show(){
        System.out.println("重写接口中的默认方法");
    }
}
