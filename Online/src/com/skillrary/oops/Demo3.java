package com.skillrary.oops;

public class Demo3 {
	
	Demo3(){
		System.out.println("constructor of class Demo3");
	}
	static {
		System.out.println("sib of class Demo3");
	}
	{
		System.out.println("IIB of class Demo3");
	}

}
class Demo4{
	
	static {
		System.out.println("SIB of class Demo4");
	}
	{
		System.out.println("IIB of class Demo4");
	}
	Demo4(){
		System.out.println("constructor of Demo4");
	}
	public static void main(String[] args) {
		System.out.println("program starts");
		Demo3 d1=new Demo3();
		new Demo4();
	}
}