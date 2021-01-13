package com.qa.main;

public class Car extends Vehicle {

	public Car() {
		super();
		this.wheels=4;
		this.doors=5;
	}
	
	public Car(int wheels,int doors) {
		super(wheels,doors);
	}
	@Override
	public void doors() {
		System.out.println("I have" +doors +" doors");
	}

	@Override
	public void wheels() {
		System.out.println("I have"+ wheels+" wheels");
	}

	@Override
	public String type() {
		return "Car";
	}

}
