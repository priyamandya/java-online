package com.skillrary.libraries;

public interface A {
	
	void a();
	void b();

}
 class B implements A{
	
	public void a() {
		System.out.println("method overiding");
	}
	
	@Override
	public void b() {
		
		
	}
}
