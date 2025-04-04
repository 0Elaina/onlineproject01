package com.itheima.Test;

public class Teacher extends Employee{
    public Teacher(){}

    public Teacher(String id, String name){
        super(id, name);
    }

    public void work(){
        System.out.println("教研部员工在上课");
    }
}
