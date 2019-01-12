package com.skillrary.abstraction;
/*
 * Interface is a type in java.
 * interface is a keyword
 * A java file can contain only interface defnition block.After compilation of interface defnition block
 * compiler gernerates .class file for the interface
 * Java file can contain interface defnition block and class defnition block.
 * inside interface you cant allow concrete methods.
 * it should contain only abstract methods (that too non static )
 * by default methods are public and abstract.
 * If interface is there means there must be atleast one implementation.
 * you can have or extends interfaces but you cannot extends class
 * you cannot implement interface.
 * cannot instantiate
 * 
 * 
 */
public interface Skillrary {
	int a=9;//variables in interface must be public ,static & final.ie it can declare only constants & it s
	//should be intialized at declaration time.

	public abstract void coaching();
	
	void skills();
	
}
class Qspiders implements Skillrary{
	@Override
	public void coaching() {
		System.out.println("qspiders taking class in skillrary website");
		
	}
	@Override
	public void skills() {
		System.out.println("skill going to be trained is java");	
	}
	
}
class Jspiders implements Skillrary{
	
	@Override
	public void coaching() {
		System.out.println("jspider taking class in skillrary website");
		
	}
	@Override
	public void skills() {
		System.out.println("skill going to be trained on j2ee");
		
	}
}
class Main{
	public static void main(String[] args) {
		Skillrary s=new Qspiders();
		s.coaching();
		s.skills();
	}
}