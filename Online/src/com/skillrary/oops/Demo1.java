package com.skillrary.oops;

public class Demo1 {
	
	int i,j;
	public static void main(String[] args) {
		
		Demo1 d=new Demo1();
		System.out.println(d.i);
		System.out.println(d.j);
		
		Demo1 d1=new Demo1();
		

	}
	//non-static block 1
	{
		System.out.println("hi hello");
		i=20;j=90;
	}

	//non-static block 2
	{
		System.out.println("bye bye");
		i=200;j=600;
		i=60;j=80;
	}
}
