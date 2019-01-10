package com.skillsrary.online;

public class String1 {

	public static void main(String[] args) {
		
		String s="vishal";
	char d=	s.charAt(2);
	System.out.println(d);
		char[] c=s.toCharArray();
		for(int i=0;i<=c.length-1;i++) {
			System.out.print(c[i]);
		}
	}

}
