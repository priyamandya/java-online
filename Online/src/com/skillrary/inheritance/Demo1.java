package com.skillrary.inheritance;

public class Demo1 {

	int a;
	String s;
	void display()
	{
		System.out.println("hi hello");
	}
}

class Demo2 extends Demo1{
	int b;
	
	
}
class Demo3 extends Demo2{
	
	int c;
	void display(String s)
	{
		System.out.println("hhi hwllow"+s);
		
	}
		public static void main(String[] args) {
			
			Demo3 d3=new Demo3();
			d3.display();
			d3.display("vishal");
			Demo2 d2=new Demo2();
			System.out.print("hi");
		
	}
}