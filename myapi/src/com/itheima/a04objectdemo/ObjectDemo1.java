package com.itheima.a04objectdemo;

public class ObjectDemo1 {
    public static void main(String[] args) {

        //1.toString    返回对象的字符串表现形式
        Object obj = new Object();
        String str1 = obj.toString();
        System.out.println(str1);

        Student stu = new Student("zhangsan",19);
        String str2 = stu.toString();
        System.out.println(str2);

        //细节：
        //System：类名
        //out：静态变量
        //System.out：获取打印的对象
        //println（）：方法
        //参数：表示打印的内容
        //核心逻辑：
        //当我们打印一个对象的时候，底层就会调用对象的toString方法，把对象变成字符串
        //然后再打印在控制台上，打印完毕换行处理



        //默认情况下，Object类中的toString方法返回的是地址值
        //返回对象内部的属性值：
        //重写Object父类的toString方法
        System.out.println(str2);
    }
}
