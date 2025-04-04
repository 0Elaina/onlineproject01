package com.itheima.test;

import java.util.ArrayList;

public class Test7 {
    public static void main(String[] args) {
        //1.创建集合
        ArrayList<User> list = new ArrayList<>();

        //2.创建三个用户对象
        User u1 = new User("heima001","zhangsan","123456");
        User u2 = new User("heima002","lisi","12345678");
        User u3 = new User("heima003","wangwu","1234qwer");

        //3.把用户对象添加到集合中
        list.add(u1);
        list.add(u2);
        list.add(u3);

        //4.调用方法查找索引
        int index = getIndex(list,"heima001");

        //5.打印结果
        System.out.println(index);

    }


    public static int getIndex(ArrayList<User> list,String id){
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getId().equals(id)){
                return i;
            }
        }return -1;
    }

    public static boolean contains(ArrayList<User> list,String id){
        return getIndex(list,id) >= 0;
    }
}
