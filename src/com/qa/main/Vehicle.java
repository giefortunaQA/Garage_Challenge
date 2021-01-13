package com.qa.main;

public abstract class Vehicle {
	public abstract String type();

	
	public abstract void doors();
	public abstract void wheels();
	
	public void amIAVehicle() {
		System.out.println("Hell yurrhh I am vehicle!");
		}
	public void engine() {
		System.out.println("Yep I have an engine!");
		}
	@Override
	public String toString() {
		return "[type " + type() + "]";
	}
	
	
}
