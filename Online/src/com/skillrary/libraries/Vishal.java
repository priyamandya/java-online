package com.skillrary.libraries;

public class Vishal {

	public static void main(String[] args) {
		
		int i=100;
		Integer intObj=new Integer(i);
		System.out.println(intObj);   //auto boxing
		
		int j=intObj.intValue();
		System.out.println(j);
		
		Integer intObj1=new Integer("200");
		System.out.println(intObj1);
	
		Integer intObj2=400;
		System.out.println(intObj2);
		
	double d=intObj1.doubleValue(); //Unboxing and auto widening
	System.out.println(d);
	
		Double d1=300.000;
		int f=d1.intValue();//unboxing and narrowing
		System.out.println(f);
	int k=(int)d1.doubleValue();//explicit narrowing
		

	}

}
