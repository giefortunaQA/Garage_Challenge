package com.qa.main;

public class Truck extends Vehicle {
	int wheelsCount=4;
	public Truck(String name) {
		this.name=name;
	}

	@Override
	public void doors() {
		System.out.println("Two doors for two manly mans");
		
	}

	@Override
	public void wheels() {
		System.out.println("I got 4 BIG BOI wheelzzzz ");
		
	}

}
