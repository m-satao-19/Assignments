package com.training;

public class TwoWheeler extends VehicleInsurance {

	public TwoWheeler(int policuNumber, String policyHolder, double insuredAmount, int age, int vehicleModel,
			int yearOfManufacture, double vehicleCost) {
		super(policuNumber, policyHolder, insuredAmount, age, vehicleModel, yearOfManufacture, vehicleCost);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculatePremium() {
		// TODO Auto-generated method stub
		double premium=0.0;
		if(2020-this.yearOfManufacture<2) {
			premium= 0.5*this.vehicleCost;
		}
		else 
			premium= 0.6*this.vehicleCost;
		
		return premium;
	}
	

}
