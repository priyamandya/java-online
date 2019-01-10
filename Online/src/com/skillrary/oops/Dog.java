package com.skillrary.oops;

public class Dog {

	static int leg=4;
	static String color="black";
	static String breed="mudol";
	
	static void eat() {
		System.out.println("eat......");
	}
	void bark() {
		System.out.println("bow bow....");
	}

}
class Test{
	public static void main(String[] args) {
		Dog d=new Dog();
		Dog.eat();
		System.out.println(Dog.breed);
	
	}
}
