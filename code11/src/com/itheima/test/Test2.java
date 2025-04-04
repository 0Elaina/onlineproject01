package com.itheima.test;

import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        //jdk5以后，int integer之间可以相互转化
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println(list);
    }
}
