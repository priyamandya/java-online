package com.skillrary.other;

public class Orange {
	/*
	 * public final Orange() {
	 *  we cannot declare constructor as final 
	 * }
	 */
	final int NO_WHEELS=4;
	final void test1() {
		System.out.println("test1() of classB" );
	}
	static final void disp() {
		System.out.println("disp() of class B");
	}
	

}
class Demo extends Orange{
	
	/* cannot overide final methods we are getting compile time error
	 * if we declare class as final we cannot inherit
	 * final void test1() { System.out.println("test1() of class Demo"); } static
	 * void disp() { System.out.println("disp() of class Demo"); }
	 */
	final static double PI=3.14;
	final static Orange o =new Orange();
		
	public static void main(String[] args) {
		System.out.println(PI);
		
		//Demo.PI=52;//cannot reintialized
		
	}
	static void print(final int i,Orange o1) {
		
		//i=12;//final method parameter cannot be reassigned;
		o1=new Orange();
		
	}
	
}
