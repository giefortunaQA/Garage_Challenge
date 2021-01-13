package com.qa.main;

public class Truck extends Vehicle {
	public Truck() {
		super();
		this.wheels=4;
		this.doors=2;
	}
	public Truck(int wheels, int doors) {
		super (wheels, doors);
	}

	@Override
	public void doors() {
		System.out.println("I have " + doors + " doors");
		
	}

	@Override
	public void wheels() {
		System.out.println("I have"+ wheels+" wheels ");
		
	}

	@Override
	public String type() {
		// TODO Auto-generated method stub
		return "Truck";
	}

}
