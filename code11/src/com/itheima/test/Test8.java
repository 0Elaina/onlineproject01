package com.itheima.test;

import java.util.ArrayList;

public class Test8 {
    public static void main(String[] args) {
        //1.创建集合
        ArrayList<Phone> list = new ArrayList<>();

        //2.创建手机的对象
        Phone p1 = new Phone("小米", 1000);
        Phone p2 = new Phone("苹果", 8000);
        Phone p3 = new Phone("锤子", 2999);

        //3.添加数据
        list.add(p1);
        list.add(p2);
        list.add(p3);

        //4.调用方法
        ArrayList<Phone> resultList = getPhoneInfo(list);

        //5.遍历
        for (int i = 0; i < resultList.size(); i++) {
            System.out.print(resultList.get(i).getBrand() + ", " + resultList.get(i).getPrice());
            System.out.println();
        }
    }


    //技巧：
    // 如果我们要返回多个数据，可以把这些数据先放到一个容器当中，再把容器返回
    //集合 数组
    public static ArrayList<Phone> getPhoneInfo(ArrayList<Phone> list){
        ArrayList<Phone> resultList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            Phone p = list.get(i);
            int price = p.getPrice();
            if(price < 3000){
                resultList.add(p);
            }
        }return resultList;
    }
}
