package com.itheima.a04polymorphismdemo4;

public class Dog extends Animal{
    public Dog() {
    }

    public Dog(int age, String color) {
        super(age, color);
    }

    @Override
    public String eat(String something){
        return something;
    }

    public void lookHome(){
        System.out.println("狗在看家");
    }
}
