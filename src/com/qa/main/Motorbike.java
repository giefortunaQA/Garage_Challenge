package com.qa.main;

public class Motorbike extends Vehicle {
	public Motorbike(String name) {
		this.name=name;
	}
	
	@Override
	public void doors() {
		System.out.println("Nope! no doors");
	}

	@Override
	public void wheels() {
		System.out.println("Boi has two wheels ");
	}
	
	

}
