package com.itheima.a04objectdemo;

import com.google.gson.Gson;

public class ObjectDemo4 {
    public static void main(String[] args) throws CloneNotSupportedException {
        //protected Object clone(int a)         对象克隆

        int[] data = {1,2,3,4,5,6,7,8,9,10};
        User u1 = new User("zhangsan","123456qwer","giel111",data);

        //克隆对象
        //细节：
        //方法会在底层帮我们创建一个对象，并把对象中的数据拷贝过去
        //书写细节：
        //1.重写Object中的clone方法
        //2.让JavaBean类实现clone就可以了
        //3.创建原对象并调用clone
        //Object中的克隆是浅克隆
        User u2 = (User)u1.clone();


        /*System.out.println(u1);
        System.out.println(u2);*/

        //更方便的深克隆方法
        //使用第三方的工具（导入代码）
        Gson gson = new Gson();
        //把对象变为一个字符串
        String s = gson.toJson(u1);
        //再把字符串变回对象
        User user = gson.fromJson(s, User.class);


        int[] arr = u1.getData();
        arr[0] = 100;


        //打印对象
        System.out.println(user);

    }
}
