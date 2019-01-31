package com.skillrary.threads;

public class MyNewThread  implements Runnable{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		 for(int i=1;i<10;i++) {
			 System.out.println("My new thread running"+ i);
		 }
	}

}
class ThreadDemo{
	public static void main(String[] args) {
		MyNewThread m=new MyNewThread();
		Thread t=new Thread(m);
		t.start();
		System.out.println("main thread is running");
	}
}
