package com.qa.main;

public class Runner {

	public static void main(String[] args) {
		Vehicle bike=new Motorbike();
		Vehicle polo=new Car();
		Vehicle mudatrucka=new Truck();
		Garage garage1=new Garage();
		garage1.addToGarage(bike);
		garage1.addToGarage(polo);
		garage1.addToGarage(mudatrucka);
		Vehicle kia=new Car();
		garage1.addToGarage(kia);
		garage1.billAll();
		garage1.fix(kia);
		garage1.openGarage();
		garage1.removeByType("Truck");
		garage1.openGarage();
		
	}

}
