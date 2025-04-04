package com.itheima.com.mycollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;

public class A03_CollectionDemo3 {
    public static void main(String[] args) {
        //1.创建集合
        Collection<String> coll = new ArrayList<>();

        //2.赋值
        coll.add("A");
        coll.add("B");
        coll.add("C");
        coll.add("D");

        //3.遍历
        //迭代器遍历
        //迭代器在java中的类是Iterator
        //获取迭代器(创建指针)
        Iterator<String> it = coll.iterator();
        //判断是否有元素
/*        while(it.hasNext()){
            //获取元素,移动指针
            String str = it.next();
            //打印
            System.out.print(str + " ");
        }*/


        //增强for遍历
/*        for(String str : coll){
            System.out.print(str + " ");
        }*/

        //Lambda表达式遍历
        coll.forEach(new Consumer<String>() {//Consumer是接口，用匿名内部类的方式实现
            @Override
            public void accept(String s) {
                System.out.print(s + " ");
            }
        });

        //简化
        coll.forEach((String s) -> System.out.println());
    }
}
