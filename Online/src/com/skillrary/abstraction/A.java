package com.skillrary.abstraction;

//cannot be instantiated
abstract public class A {

	 abstract void display();//abstract method
	 //concrete method
	 int add(int a,int b) {
		 return 0;
	 }

}
class B extends A{
	@Override
	void display() {
		System.out.println("overiding A in B");
		
	}
	public static void main(String[] args) {
		A a=new B();
		a.display();
	}
	
}