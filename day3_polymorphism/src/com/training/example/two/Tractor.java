package com.training.example.two;

import com.training.ifaces.Automobile;

public class Tractor implements Automobile {

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return "Yellow";
	}

	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		return "MahindraTractor";
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 133000;
	}

}
