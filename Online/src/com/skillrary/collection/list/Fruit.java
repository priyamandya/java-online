package com.skillrary.collection.list;

import java.util.ArrayList;

public interface Fruit {

}
class Apple implements Fruit{
	
}
class Orange implements Fruit{
	
}
class ArrayListDemo{
	
	public static void main(String[] args) {
		
		ArrayList lst=new ArrayList();
		lst.add(10);//wrapped object
		lst.add(true);
		lst.add("hello");//
		lst.add(new String("Bangalore"));
		lst.add(new Apple());
		Apple a=new Apple();
		lst.add(a);
		
		//no of elements (objects)
		System.out.println(lst.size());
		System.out.println(lst.contains(false));
		System.out.println(lst.get(3));
		
		/*
		 * for(int i=0;i<lst.size();i++) { System.out.println(lst.get(i)); }
		 */
		//enhanced for loop
		/*
		 * for(Object obj:lst) { System.out.println(obj); }
		 */
		//to do operations on same type or add objects of same type(generics)
		
		ArrayList<Integer> ai=new ArrayList<Integer>();
		ArrayList<Apple> ap=new ArrayList<Apple>();
		ArrayList<Fruit> af=new ArrayList<Fruit>();
		af.add(new Apple());
		af.add(new Orange());
		
		//converting to object array and printing objects
		Object[] obj=af.toArray();
		for(Object o:af) {
			System.out.println(o);
		}
		
		
	}
}
