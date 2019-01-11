package com.skillrary.polymorphism;

class Animal{
	
}
class Dog extends Animal{
	
}
class BullDog extends Dog{
	
}



public class DerivedTypeCasting {

	public static void main(String[] args) {
		
		Animal a=new Dog();//upcasting
		Dog d=(Dog)a;//downcasting;
		
	Animal a1=	new BullDog();//upcasting
	BullDog bd=	(BullDog)a1;
		Dog d1=	(Dog)a1;	
		
	}

}
