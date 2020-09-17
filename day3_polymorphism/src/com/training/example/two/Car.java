package com.training.example.two;

import com.training.ifaces.Automobile;

public class Car implements Automobile {

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return "Red";
	}

	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		return "Toyota";
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 1000000.00;
	}

}
