package com.itheima.a02innerclassdemo2;

public class Test {
    public static void main(String[] args) {
        /*
        编写成员内部类的注意点：
            1.成员内部类可以被一些修饰符所修饰
            2.在成员内部类里面，jdk16之前不能定义静态变量，jdk16开始才可以定义静态变量


         获取成员内部类对象的两种方式
                方式一：外部类编写方法，对内提供内部类对象
                方式二：直接创建
                格式：外部类名.内部类名. 对象名 = 外部类对象.内部类对象;


         */

        //创建内部类的对象
        Outer.Inner oi = new Outer().new Inner();

        Outer oii = new Outer();
        oii.getInstance();

        Object inner = oii.getInstance();


        //创建被private修饰的内部类的对象
        Outer1 o = new Outer1();
        o.gerInstance();

        Object inner1 = o.gerInstance();

    }
}
