package com.qa.main;

public class Car extends Vehicle {
	
	@Override
	public void doors() {
		System.out.println("I have 5 doors");
	}

	@Override
	public void wheels() {
		System.out.println("I have 4 wheels");
	}

	@Override
	public String type() {
		return "Car";
	}

}
