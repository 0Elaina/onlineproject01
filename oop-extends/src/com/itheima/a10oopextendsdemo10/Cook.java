package com.itheima.a10oopextendsdemo10;

public class Cook extends Employee {
    public Cook(){}

    public Cook(String id , String name, double salary){
        super(id,name,salary);
    }

    public void work(){
        System.out.println("炒菜");
    }
}
