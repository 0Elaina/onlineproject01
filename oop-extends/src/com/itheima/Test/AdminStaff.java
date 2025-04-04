package com.itheima.Test;

public class AdminStaff extends Employee{
    public AdminStaff(){}

    public AdminStaff(String id, String name){
        super(id, name);
    }

    @Override
    public void work(){
        System.out.println("行政部员工在处理政务");
    }
}
