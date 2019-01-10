package com.skillrary.encapsulation;

public class Animal {
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
class Demo{
	public static void main(String[] args) {
		Mammal m1=new Mammal();
		m1.speak();
		Animal a=new Animal();
		a.speak();
		Dog d=new Dog();
		d.speak();
	}
}