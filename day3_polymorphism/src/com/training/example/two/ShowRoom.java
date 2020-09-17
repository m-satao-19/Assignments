package com.training.example.two;

import com.training.ifaces.Automobile;

public class ShowRoom {

	//Factory method based on the key passed return the Object type
	public Automobile getProduct(int key) {
		
		switch(key) {
		case 1: return new Bike();
		
		case 2: return new Car();
		
		default: return null;
		}
	}
	
	public void printEstimation(Automobile polyAuto) {
		System.out.println(polyAuto.APPNAME);
		System.out.println(polyAuto.getModel());
		System.out.println(polyAuto.getColor());
		System.out.println(polyAuto.getPrice());
	}
}
