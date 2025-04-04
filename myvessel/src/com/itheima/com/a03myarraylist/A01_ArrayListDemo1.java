package com.itheima.com.a03myarraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Consumer;

public class A01_ArrayListDemo1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("AAA");
        list.add("BBB");
        list.add("CCC");
        list.add("DDD");

        //遍历
/*        list.forEach(new Consumer<String>(){
            @Override
            public void accept(String s){
                System.out.print(s + "  ");
            }
        });*/

/*        list.forEach((s) -> System.out.print(s + " "));
        System.out.println();*/

/*        for(String s : list){
            System.out.print(s + " ");
        }*/

        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            System.out.print(it.next() + "  ");
        }
    }
}
