package com.skillrary.has_a;

public class Demo {

	int val=105;
	public void test(){
		System.out.println("executing test method of Demo");
	}
}
class Sample{
	
static Demo d=new Demo();
	public static void yoyo() {
		System.out.println("executing yoyo method of Sample");
	}
}
class Agregation{
	public static void main(String[] args) {
		
		Sample.d.test();
	}
}
