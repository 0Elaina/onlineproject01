package com.itheima.com.a04mygenerics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.function.Consumer;

public class GenericsDemo3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list = ListUtil.<String>addAll(list,"aaa","bbb","ccc");

        for(String s : list){
            System.out.print(s + "\t");
        }
        System.out.println();

        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            System.out.print(it.next() + "  ");
        }
        System.out.println();

        list.forEach(new Consumer<String>(){
            @Override
            public void accept(String s){
                System.out.print(s + "\t");
            }
        });
        System.out.println();

        ListIterator<String> lit = list.listIterator();
        while(lit.hasNext()){
            System.out.print(lit.next() + "\t");
        }
        System.out.println();
    }
}
