package com.qa.main;

public class Runner {

	public static void main(String[] args) {
		Vehicle bike=new Motorbike("bike");
		Vehicle polo=new Car("Jay");
		Vehicle mudatrucka=new Truck("MUDATRUCKA");
		Garage garage1=new Garage();
		garage1.addToGarage(bike);
		garage1.addToGarage(polo);
		garage1.addToGarage(mudatrucka);
		Vehicle kia=new Car("bb");
		garage1.addToGarage(kia);
//		garage1.billAll();
//		garage1.fix(kia);
		garage1.openGarage();
		garage1.removeFromGarageByIndex(2);
		garage1.openGarage();
		
	}

}
