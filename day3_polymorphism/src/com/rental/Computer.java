package com.rental;
import com.training.ifaces.Item;
public class Computer implements Item{
	public String computerModel;

	public Computer(String computerModel) {
		super();
		this.computerModel = computerModel;
	}



	@Override
	public double calculateRentPrice(int noDays) {
		// TODO Auto-generated method stub
		double cost=0.0;
		if(this.computerModel.equalsIgnoreCase("Laptop")) {
			cost=100.00;
		} else {
			cost=75.00;
		}
		return cost*noDays;
	}



	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		return this.computerModel;
	}



	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
