package com.itheima.test;

import java.util.ArrayList;

public class Test6 {
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

        //4.调用方法查看list是否存在
        boolean flag = contains("heima001",list);

        //5.打印结果
        System.out.println(flag);
    }


    public static boolean contains(String id,ArrayList<User> list){
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getId().equals(id)){
                return true;
            }
        }return false;
    }
}
