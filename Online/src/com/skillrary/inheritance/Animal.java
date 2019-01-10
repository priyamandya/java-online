package com.skillrary.inheritance;





class Dog{
	String Dogname;
	int legs;
	String color;

		static  void eat() {
		System.out.println("Dog eat meat");
	}
}
class Puppies extends Dog {
	void eat(String s) {
		System.out.println("Pupies eat pedigree");
	}

}
public class Animal {

	public static void main(String[] args) {

		Puppies p=new Puppies();
	
		
	}

}
