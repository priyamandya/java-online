package com.skillrary.inheritance;


//super classs
class A{
	int a;
	static int b;
	void display() {
		System.out.println("hi" + a);
	}
}
//subclass
class B extends A{
	
	void show() {
		System.out.println("bye"+ b);
	}
	
}





public class Single {
 
	
	public static void main(String[] args) {
		B b=new B();
		b.show();
		b.display();
		
	}
}

