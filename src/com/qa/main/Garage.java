package com.qa.main;

import java.util.ArrayList;
import java.util.List;

public class Garage {
	private List<Vehicle> garage=new ArrayList<>();
	
	private String ID(Vehicle v) {
		List<Vehicle> sameType=new ArrayList<>();
		for (Vehicle veh:garage) {
			if (veh.type()==v.type()) {
			sameType.add(veh);
			}
		}
		int pos=sameType.indexOf(v)+1;
		return v.type()+pos;
	}
	
	
	public void openGarage() {
		List<String> showGarage=new ArrayList<>();
		for (Vehicle v: garage) {
			showGarage.add(v.toString()+", GarageID: "+ID(v));
		}
		System.out.println(showGarage);
		
	}
	
	public String billEach(Vehicle v) {
		int bill = 0;
		if (v.type()=="Motorbike") {
			bill=10;
		}
		else if (v.type()=="Car") {
			bill=20;
		}
		else if (v.type()=="Truck") {
			bill=30;
		}
		return ID(v) + " : £" + bill;
	}
	
	public void billAll() {//this determines the bill for each
		System.out.println("-----BILL------");
		for (Vehicle v: garage) {
			System.out.println(billEach(v));
			}
	}
	
	public void addToGarage(Vehicle v) {
		garage.add(v);
		System.out.println("Your car has ID "+ ID(v));
	}
	
	public void removeFromGarageByID(String ID) {
		for (Vehicle v: garage) {
			if (ID(v)==ID) {
				garage.remove(v);
			}
		}
	}
	
	public void removeByType(String type) {
		for (Vehicle v:garage) {
			if (v.type()==type) {
				garage.remove(v);
			}
		}
	}
	
	public void fix(Vehicle v) {
		System.out.println("Your vehicle has been fixed!" );
		System.out.println( billEach(v));
	}
}
