package com.itheima.com.a04test;

public class PersianCat extends Cat{
	public PersianCat(){}
	
	public PersianCat(String name,int age){
		super(name,age);
	}

	
	@Override
	public void eat(){
		System.out.println("一只叫做" + this.getName() + "的，" + this.getAge() + "岁的波斯猫，正在吃小饼干");
	}
}