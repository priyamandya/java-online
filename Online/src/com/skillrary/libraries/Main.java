package com.skillrary.libraries;

public class Main {

	public static void main(String[] args) {
		
		String s1="vishal";
		String s2=new String("Developer");
		String s3="vishal";
		String s4=new String("Developer");
		System.out.println(s1==s3);
		System.out.println(s2==s4);
		System.out.println(s2.equals(s4));
		
		Main m=new Main();
		Main m1=new Main();
		System.out.println("boolean value of Main class="+m.equals(m1));
		System.out.println(m);
		System.out.println(m1);
	}

}
