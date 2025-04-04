package com.itheima.com.a02mylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Consumer;

public class A03_ListDemo3 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        list.add("eee");

        //1.迭代器遍历
        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            System.out.print(it.next() + " ");
        }

        System.out.println();

        //2.增强for遍历
        for(String s : list){
            System.out.print(s + " ");
        }
        System.out.println();

        //3.Lambda表达式遍历
/*        list.forEach(new Consumer<String>(){
            @Override
            public void accept(String s){
                System.out.print(s + " ");
            }
        });*/

        list.forEach((String s) -> System.out.print(s + " "));
        System.out.println();


        //4.列表迭代器
        ListIterator<String> lIt = list.listIterator();

        while(lIt.hasNext()){
            System.out.print(lIt.next() + " ");
        }
    }
}
