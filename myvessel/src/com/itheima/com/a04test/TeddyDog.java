package com.itheima.com.a04test;

public class TeddyDog extends Dog{
    public TeddyDog(){}

    public TeddyDog(String name , int age){
        super(name,age);
    }

    @Override
    public void eat(){
        System.out.println("一只叫做" + this.getName() + "的，" + this.getAge() + "岁的泰迪，正在吃骨头，边吃边蹭");
    }
}
