package com.skillrary.encapsulation;

import com.skillrary.accessspecifiers.Apple;
import com.skillrary.accessspecifiers.Fun;

public class Animal {
	Apple a=new Apple();
	
	void speak() {
		System.out.println("animal is speaking");
	}

}
class Mammal extends Animal{
	void speak() {
		System.out.println("Mamal speaking");
	}
}
class Dog extends Mammal{
	void speak() {
		System.out.println("bow bow");
	}
}
class Demo extends Fun{
	public static void main(String[] args) {
		
		
		Fun f=new Fun();
		
	System.out.println(f.j);
		
		Mammal m1=new Mammal();
		m1.speak();
		Animal a=new Animal();
		a.speak();
		Dog d=new Dog();
		d.speak();
		
	}
}