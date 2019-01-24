package com.skillrary.libraries;

public class C {

}
class Demo3{
	
	public static void main(String[] args) {
		C c1=new C();
		C c2=new C();
		C c3=new C();
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c1==c2);
		System.out.println(c1.equals(c3));//false equals method not overiden
		c1=c3;
		System.out.println(c1==c3);
		System.out.println(c1.equals(c3));
		
	}
}