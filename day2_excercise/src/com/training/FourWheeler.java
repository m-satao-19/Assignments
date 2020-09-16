package com.training;

public class FourWheeler extends VehicleInsurance {

	public FourWheeler(int policuNumber, String policyHolder, double insuredAmount, int age, int vehicleModel,
			int yearOfManufacture, double vehicleCost) {
		super(policuNumber, policyHolder, insuredAmount, age, vehicleModel, yearOfManufacture, vehicleCost);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public double calculatePremium() {
		// TODO Auto-generated method stub
		if(2020-this.yearOfManufacture<2) {
			return 0.4*this.vehicleCost;
		}
		else 
			return 0.5*this.vehicleCost;
	}
	
}