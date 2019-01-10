package com.skillrary.oops;

public class Demo2 {
	
	int i;
	int j;

	Demo2(){
		i=10;
		j=20;
	}

}
class Main{
	public static void main(String[] args) {
	
		Demo2 d=new Demo2();
		System.out.println("i="+ d.i);
		System.out.println("j="+ d.j);
	}
}