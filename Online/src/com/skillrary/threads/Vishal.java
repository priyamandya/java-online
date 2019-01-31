package com.skillrary.threads;

public class Vishal extends Thread {
	
	
	@Override
	public void run() {
		System.out.println("Thread running");
	}

	public static void main(String[] args) {
		
		Vishal v=new Vishal();
		//v.run();//normal method calling
		v.start();
		
	}
}
