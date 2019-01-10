package com.skillrary.oops;

public class Demo {

	static int i=10;


	static {
		i=200;
		System.out.println("static block"+i);
		
	}
	static {
		i=300;
		System.out.println("static block"+i);
	}
	static{
		i=100;
		System.out.println("static block"+i);
	}
	public static void main(String[] args) {

		System.out.println("main method");
		

	}

}
