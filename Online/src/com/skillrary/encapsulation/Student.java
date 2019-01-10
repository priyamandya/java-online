package com.skillrary.encapsulation;

public class Student {
	
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	private String name;
	private int marks;
	

}
class Test{
	public static void main(String[] args) {
		Student s=new Student();
		s.setId(8);
		System.out.println(s.getId());
	}
}