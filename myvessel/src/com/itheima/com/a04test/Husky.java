package com.itheima.com.a04test;

public class Husky extends Dog{
	public Husky(){}
	
	public Husky(String name,int age){
		super(name,age);
	}
	
	@Override
	public void eat(){
		System.out.println("一只叫做" + this.getName() + "的，" + this.getAge() + "岁的哈士奇，正在吃骨头，边吃边拆家");
	}
}