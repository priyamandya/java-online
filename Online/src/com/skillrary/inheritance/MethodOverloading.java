package com.skillrary.inheritance;

public class MethodOverloading {

	
	void display() {
		System.out.println("h");
	}
	static void display(int a) {
		System.out.println("hello");
	}
	void display(String s) {
		System.out.println("bye");
	}
	String display(int c,int l) {
		
		return "hi";
	}
}
class MethodOverloading1 extends MethodOverloading{
	 int display(byte b) {
		
		return 1;
		
	}
	 
}
class Main{
	public static void main(String[] args) {
		
		MethodOverloading mo=new MethodOverloading();
		mo.display(2);
	}
}
