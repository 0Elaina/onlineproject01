package com.itheima.a02oopextendsdemo2;

public class Test {
    public static void main(String[] args) {
        //利用空参构造创建子类对象
        Zi z1 = new Zi();

        //利用带参构造创建子类对象
        //Zi z2 = new Zi("zhangsan",22);   --->报错          -->子类无法继承父类中的构造方法


    }


}
class Fu{
    String name;
    int age;

    public Fu(){}
    public Fu(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Zi extends Fu{
        //如果一个类中没有构造方法，虚拟机会自动添加一个默认的空参构造
}
