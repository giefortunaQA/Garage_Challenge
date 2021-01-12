package com.qa.main;

import java.util.ArrayList;
import java.util.List;

public class Garage {
	private List<Vehicle> garage=new ArrayList<>();
	
	public void openGarage() {
		System.out.println(garage.toString());
	}
	
	public String billEach(Vehicle v) {//bill to fix is dependent on how many wheels a vehicle has 
		System.out.println("-----BILL------");
		return (String)(v + ": £"+ v.getWheelsCount()*10 );
	}
	
	public void billAll() {//this determines the bill for each
		System.out.println("-----BILL------");
		for (Vehicle v: garage) {
			System.out.println(v + ": £"+ v.getWheelsCount()*10 );
			}
	}
	
	public void addToGarage(Vehicle v) {
		garage.add(v);
	}
	
	public void removeFromGarageByIndex(int i) {
		if (i>garage.size()) {
			System.out.println("Index out of range");
		}
		else {
			garage.remove(i);
		}
	}
	
	public void fix(Vehicle v) {
		System.out.println("Your vehicle has been fixed!" );
		System.out.println( billEach(v));
	}
	
	public void removeAllOfMotorbikes() {
		for (Vehicle veh: garage) {
			if (veh instanceof Motorbike ) {
				garage.remove(veh);
			}
		}
	}
	
	public void removeAllCars() {
		for (Vehicle veh: garage) {
			if (veh instanceof Car ) {
				garage.remove(veh);
			}
		}
	}
	
	public void removeAllTrucks() {
		for (Vehicle veh: garage) {
			if (veh instanceof Truck ) {
				garage.remove(veh);
			}
		}
	}
}
