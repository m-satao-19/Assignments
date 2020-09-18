package com.rental;
import com.training.ifaces.Item;
public class Furniture implements Item{
	
	public String furnitureModel;

	public Furniture(String furnitureModel) {
		super();
		this.furnitureModel = furnitureModel;
	}

	@Override
	public double calculateRentPrice(int noDays) {
		// TODO Auto-generated method stub
		double cost=0.0;
		if(this.furnitureModel.equalsIgnoreCase("Sofa")) {
			cost=100.00;
		} else {
			cost=75.00;
		}
		return cost*noDays;
	}

	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		return this.furnitureModel;
	}

}
