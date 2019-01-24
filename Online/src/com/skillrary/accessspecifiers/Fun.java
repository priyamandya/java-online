package com.skillrary.accessspecifiers;

public class Fun {
	
	public int j=10;
	protected int i=100;
	protected void print111() {
		System.out.println("i="+i);
	}

}
class Run{
	public static void main(String[] args) {
		Fun f1=new Fun();
		f1.print111();
		f1.i=200;
		f1.print111();
	}
}
//protected members can be acessed in same package.It behaves like default.