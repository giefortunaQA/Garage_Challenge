package com.qa.main;

public class Motorbike extends Vehicle {
	public Motorbike() {
		super();
		this.wheels=2;
	}
	
	@Override
	public void doors() {
		System.out.println("Nope! no doors");
	}

	@Override
	public void wheels() {
		System.out.println("Boi has two wheels ");
	}

	@Override
	public String type() {
		
		return "Motorbike";
	}
	
	

}
