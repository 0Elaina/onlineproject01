package com.itheima.test;

import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {
        //定义一个集合
        ArrayList<String> list = new ArrayList<>();

        //添加字符串
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        //遍历集合
        System.out.print("[");
        for(int i = 0 ; i < list.size() ; i++){
            if(i == list.size() - 1){
                System.out.print(list.get(i) + "]");
            }else{
                System.out.print(list.get(i) + ", ");
            }
        }
    }
}
