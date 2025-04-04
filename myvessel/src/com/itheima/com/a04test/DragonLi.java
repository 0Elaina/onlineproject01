package com.itheima.com.a04test;

public class DragonLi extends Cat{
	public DragonLi(){}
	
	public DragonLi(String name , int age){
		super(name,age);
	}

	
	@Override
	public void eat(){
		System.out.println("一只叫做" + this.getName() + "的，" + this.getAge() + "岁的狸花猫，正在吃鱼");
	}
}