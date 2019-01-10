package com.skillrary.oops;

public class Demo7 {
	
	
	int i,j;
	long l;
	String a,b;
	
	Demo7(){
		System.out.println("calling default constructor");
		
	}
	Demo7(int u,int v){
		System.out.println("calling paramaterized constructor");
		System.out.println(i=u);
	}
	Demo7(int x,long y){
		System.out.println("calling paramaterized constructor 1");
		System.out.println("x"+y);
	}

	public static void main(String[] args) {
		new Demo7();
		Demo7 d1=new Demo7(4,5);
		Demo7 d=new Demo7(7,9952364789l);
		System.out.println(d1.i);
	}

}
