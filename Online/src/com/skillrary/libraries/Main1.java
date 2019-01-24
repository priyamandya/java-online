package com.skillrary.libraries;

public class Main1 {

	public static void main(String[] args) {
		
		String s1="java";
		String s2="developer";
		String s3=s1+s2;
		
		System.out.println("s3="+s3);
		
		String s4="javadeveloper";
		System.out.println("s4"+s4);
		System.out.println(s3==s4);//
		
		String s5="java"+"developer";
		
		System.out.println(s3==s5);
	
		System.out.println(s4==s5);
		
		String s6=s1+"developer";
		System.out.println(s3==s6);
		System.out.println(s4==s6);
		System.out.println(s4.equals(s6));

	}

}
