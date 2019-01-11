package com.skillrary.polymorphism;

public class Demo1 {

	public static void main(String[] args) {
		
		int i=100;
		double d=i;//autowidening
		
		System.out.println(d);
		byte b;
		b=(byte)d;//explicit Narrowing
		System.out.println(b);
		
		
	}

}
