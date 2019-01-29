package com.skillrary.libraries;

public class Demo2 {

	public static void main(String[] args) {
		
		StringBuffer sb1=new StringBuffer();
		sb1.append("vishal");
		StringBuffer sb2=new StringBuffer("Bangalore");
		System.out.println(sb1+ "   "+sb2);
		System.out.println(sb1.reverse());//it will update the existing object
		System.out.println(sb1+ "   "+sb2);
		StringBuffer sb3=sb2.reverse();
		/*
		 * System.out.println(sb1); System.out.println(sb2); System.out.println(sb3);
		 */
		System.out.println(sb1.length());
		sb1.setLength(0);
		System.out.println(sb1.length());
		StringBuffer sb4=new StringBuffer();
		System.out.println(sb4.length());
		System.out.println(sb4.append("javaDevloper"));
		System.out.println(sb4.insert(4, "python"));
		System.out.println(sb4.delete(4, 8));
	
	System.out.println(sb4.length());
	System.out.println(	sb4.deleteCharAt(5));
	
	}

}
