package com.itheima.a04polymorphismdemo4;

public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public void keepPet(Animal a, String something){
        if(a instanceof Cat c){
            System.out.println("年龄为" + getAge() + "岁的" + getName() +
                    "养了一只" + c.getColor() + "颜色的" + c.getAge() + "岁的猫");
            System.out.println(c.getAge() + "岁的" + c.getColor() + "颜色的猫眯着眼睛侧着头吃" + c.eat(something));
        }else if(a instanceof Dog d){
            System.out.println("年龄为" + getAge() + "岁的" + getName() +
                    "养了一只" + d.getColor() + "颜色的" + d.getAge() + "岁的狗");
            System.out.println(d.getAge() + "岁的" + d.getColor() + "颜色的狗两只前腿死死的抱住" + d.eat(something) + "猛吃");
        }else{
            System.out.println("不存在的类型");
        }
    }
}
