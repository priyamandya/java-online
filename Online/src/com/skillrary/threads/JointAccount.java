package com.skillrary.threads;


//MultiThread No synchronization
public class JointAccount implements Runnable {

	@Override
	public void run() {
		for(int i=0;i<5;i++) {
		withdrawCash(1000);
		if(ca.getBalance()<0) {
			System.out.println("cash overdrawn");
		}
		}
		
	}
	CreditAccount ca=new CreditAccount();
	public static void main(String[] args) {
		JointAccount ja=new JointAccount();
		Thread t1=new Thread(ja);
		Thread t2=new Thread(ja);
		t1.setName("vishal 1");
		t2.setName("vishal 2");
		
		t1.start();
		t2.start();
	}
	//use synchronized for thread safety
// private synchronized void withdrawCash(int amt)
	private void withdrawCash(int amt) {
		if(ca.getBalance()>=amt) {
			System.out.println(Thread.currentThread().getName()+" will withdraw");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			ca.withdraw(amt);
			System.out.println(Thread.currentThread().getName()+"completes the withdrawal");
		}else {
			System.out.println("Insuffienct fund Ms/Mr"+Thread.currentThread().getName()+"balance"+ ca.getBalance());
		}
	}
}
