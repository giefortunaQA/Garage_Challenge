package com.qa.main;

public abstract class Vehicle {
	protected String name;
	protected int wheelsCount;
	
	
	public int getWheelsCount() {
		return wheelsCount;
	}
	public void setWheelsCount(int wheelsCount) {
		this.wheelsCount = wheelsCount;
	}
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
		return "[name=" + name + "]";
	}
	
	
}
