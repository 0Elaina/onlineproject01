package com.itheima.a04polymorphismdemo4;

public class Test {
    public static void main(String[] args) {
        Animal a1 = new Dog(2,"黑");
        Animal a2 = new Cat(3,"灰");
        Person p1 = new Person("老王",30);
        Person p2 = new Person("老李",25);

        p1.keepPet(a1,"骨头");
        p2.keepPet(a2,"鱼");



    }
}
