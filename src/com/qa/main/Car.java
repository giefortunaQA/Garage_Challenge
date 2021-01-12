package com.qa.main;

public class Car extends Vehicle {
	int wheelsCount=4;
	public Car(String name) {
		this.name=name;
	}
	
	@Override
	public void doors() {
		System.out.println("I have 5 doors");
		
	}

	@Override
	public void wheels() {
		System.out.println("I have 4 wheels");
		
	}

}
