package com.itheima.test;

import java.util.Arrays;

public class Test1 {
    public static void main(String[] args) {
        /*
        定义数组并存储一些女朋友对象，利用Arrays中的sort方法进行排序
        要求1：属性有姓名、年龄、身高。
        要求2：按照年龄的大小进行排序，年龄一样，按照身高排序，身高一样按照姓名的字母进行排序。
        （姓名中不要有中文或特殊字符，会涉及到后面的知识）
         */
        GirlFriend gf1 = new GirlFriend("xiaoshishi", 18, 1.67);
        GirlFriend gf2 = new GirlFriend("xiaodandan", 19, 1.72);
        GirlFriend gf3 = new GirlFriend("xiaohuihui", 19, 1.78);

        GirlFriend[] gfs = {gf1, gf2, gf3};

        Arrays.sort(gfs, (o1, o2) -> {
            double temp = o1.getAge() - o2.getAge();
            temp = temp == 0 ? o1.getHeight() - o2.getHeight() : temp;
            temp = temp == 0 ? o1.getName().compareTo(o2.getName()) : temp;

            if(temp > 0){
                return 1;
            }else if(temp < 0){
                return -1;
            }else{
                return 0;
            }
        });

/*        for(GirlFriend gf : gfs){
            System.out.print(gf.getName() + " ");
        }*/

        System.out.println(Arrays.toString(gfs));
    }
}

class GirlFriend{
    private String name;
    private int age;
    private double height;

    public GirlFriend(){}

    public GirlFriend(String name, int age, double height){
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setHeight(double height){
        this.height = height;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public double getHeight(){
        return height;
    }

    public String toString(){
        return "GirlFriend{name = " + name + ", age = " + age + ", height = " + height + "}";
    }

}
