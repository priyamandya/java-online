package com.skillrary.threads;

public class ThreadA extends Thread{
	
	int total;
	@Override
	public void run() {
		synchronized(this) {//current instance
			
			for(double i=0;i<=100000000;i++) {
				total+=i;
			}
			notify();
			
		}
	}

}

class NotifyDemo{
	
	public static void main(String[] args) {
		
		ThreadA a=new ThreadA();
		ThreadA a1=new ThreadA();
		a.start();
	
		synchronized(a) {
			System.out.println("waiting for a to complete");
			try {
				a.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("wait over");
		}
		System.out.println("total :"+a.total);
	}
	
}
