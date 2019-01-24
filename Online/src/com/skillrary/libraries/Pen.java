package com.skillrary.libraries;

public class Pen {
	int i=100;
	 
	@Override
	public String toString() {
		
		return "i="+i;
	}
}
class Run2{
	
	public static void main(String[] args) {
		Pen p=new Pen();
		System.out.println(p);
		System.out.println(p.toString());
	}
}
