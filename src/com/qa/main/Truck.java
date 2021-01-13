package com.qa.main;

public class Truck extends Vehicle {


	@Override
	public void doors() {
		System.out.println("Two doors for two manly mans");
		
	}

	@Override
	public void wheels() {
		System.out.println("I got 4 BIG BOI wheelzzzz ");
		
	}

	@Override
	public String type() {
		// TODO Auto-generated method stub
		return "Truck";
	}

}
