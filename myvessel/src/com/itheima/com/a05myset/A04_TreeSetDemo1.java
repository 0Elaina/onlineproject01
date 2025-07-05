package com.itheima.com.a05myset;

import java.util.Iterator;
import java.util.TreeSet;
import java.util.function.Consumer;

public class A04_TreeSetDemo1 {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(3);
        ts.add(5);
        ts.add(1);
        ts.add(4);
        ts.add(2);

        //System.out.println(ts);

        Iterator<Integer> it = ts.iterator();
        while(it.hasNext()){
            System.out.print(it.next() + " ");
        }
        System.out.println();
        System.out.println("--------------------");

        for(Integer i : ts){
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("--------------------");

        ts.forEach(t -> System.out.print(t + " "));
    }
}
