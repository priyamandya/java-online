package com.skillrary.encapsulation;

public class A {
	
	void print() {
		System.out.println("printing A");
	}
static void test() {
		System.out.println("static method");
	}

}
class B extends A{
	//overiding
	void print() {
		System.out.println("printing B");
	}
	//hiding
	static void test() {
		System.out.println("static method of B");                                 
	}
}
class C{
	public static void main(String[] args) {
		B b=new B();
		b.print();
		B.test();
	}
}