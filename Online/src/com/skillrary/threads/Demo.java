package com.skillrary.threads;

public class Demo implements Runnable {
	@Override
	public void run() {//RUNNING
		System.out.println("thread running");
		
		
	}
	public static void main(String[] args) {
		Demo d=new Demo();
		Thread t=new Thread(d);//NEW STATE
		t.start();//RUNNABLE
	}

}
