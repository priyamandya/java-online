package com.skillrary.has_a;

public class Car {

	
	double price;
	String model,color,brand;
	
public Car(String model,String color,String brand,double price) {
	
	this.model=model;
	this.brand=brand;
	this.color=color;
	this.price=price;
}
Engine e=new Engine(1,12.0000,"v6");

}

class Engine{
	
	int cc;
	double bhp;
	String type;
	public Engine(int cc,double bhp,String type) {
		this.cc=cc;
		this.bhp=bhp;
		this.type=type;
	}
}
class Composition{
	
	public static void main(String[] args) {
		
		Car c1=new Car("TOYOTO","GOLD","CAMREE",10.000000);
		System.out.println(c1.model);
		System.out.println(c1.e.bhp);
		
	}
}
