package com.skillrary.accessspecifiers;

public class Apple {
	
	int i=10;
	void print() {
		System.out.println("i="+ i);
	}

	public static void main(String[] args) {
		
		Apple a1=new Apple();
		
		
		a1.print();
		a1.i=20;
		a1.print();

	}

}
