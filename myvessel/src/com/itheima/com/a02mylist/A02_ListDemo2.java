package com.itheima.com.a02mylist;

import java.util.ArrayList;
import java.util.List;

public class A02_ListDemo2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        //List系列集合中的两个删除方法
        //1.直接删除元素
        //2.通过索引进行删除

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        //两种删除方法
        //1.索引作为形参
        //2.具体元素作为形参
        //可以通过手动装箱，设定传入的参数的类型
        list.remove(1);

        Integer i = 4;
        list.remove(i);


        System.out.println(list);
    }
}
