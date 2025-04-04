package com.itheima.com.a04test;
import java.util.ArrayList;
import java.util.Iterator;

public class Test{
	public static void main(String[] args){
		ArrayList<Cat> list = new ArrayList<>();
		
		PersianCat pc = new PersianCat();
		DragonLi dl = new DragonLi();
		
		list.add(pc);
		list.add(dl);
		
		keepPet(list);
	}
	
	public static void keepPet(ArrayList<? extends Cat> list){
		Iterator it = list.iterator();
		for(int i = 0 ; i < list.size();i++){
			list.get(i).eat();
		}
	}
}