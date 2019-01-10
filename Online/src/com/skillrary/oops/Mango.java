package com.skillrary.oops;

public class Mango {
	
	static int i=10;//loaded and intialized
	
	static {
		print();
		System.out.println(i);
	
		i=5555;
	}

	public static void main(String[] args) {
		
		System.out.println(Mango.i);
		System.out.println(KachhaMango.j);
	}
	static {
		i=666;
		System.out.println(i);
	}
	static void print() {
		System.out.println("Hello");
	}

}
class KachhaMango{
	
	static int j=100;//variable loaded and intialized
	
	
	static {
		j=1234;
		System.out.println(j);
	}
}
