package com.itheima.a08oopextendsdemo8;

public class Student extends Person{
    public Student(){
        //子类的构造方法中隐藏的super（）去访问父类的无参构造
        super();//必须写在第一行
        System.out.println("子类的无参构造");

    }

    public Student(String name, int age){
        super(name, age);
    }
}
