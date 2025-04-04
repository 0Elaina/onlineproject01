package com.itheima.com.a04mygenerics;

import java.util.ArrayList;
//泛型不具备继承性，但是数据具备继承性
public class GenericsDemo5 {
    public static void main(String[] args) {
        ArrayList<Ye> list = new ArrayList<>(); ArrayList<Fu> list2 = new ArrayList<>();ArrayList<Zi> list3 = new ArrayList<>();
        //method(list);method(list2);method(list3);

        list.add(new Ye());list.add(new Fu());list.add(new Zi());
    }
    public static void method(ArrayList<Ye> list){System.out.println();
    }
}
class Ye{}      class Fu extends Ye{}       class Zi extends Fu{}
