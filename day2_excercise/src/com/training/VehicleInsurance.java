package com.training;

import java.util.Calendar;

public class VehicleInsurance extends Insurance {
	public int vehicleModel;
	public int yearOfManufacture;
	public double vehicleCost;
	
	public VehicleInsurance(int policuNumber, String policyHolder, double insuredAmount, int age, int vehicleModel,
			int yearOfManufacture, double vehicleCost) {
		super(policuNumber, policyHolder, insuredAmount, age);
		this.vehicleModel = vehicleModel;
		this.yearOfManufacture = yearOfManufacture;
		this.vehicleCost = vehicleCost;
	}

	public int getVehicleModel() {
		return vehicleModel;
	}

	public void setVehicleModel(int vehicleModel) {
		this.vehicleModel = vehicleModel;
	}

	public int getYearOfManufacture() {
		return yearOfManufacture;
	}

	public void setYearOfManufacture(int yearOfManufacture) {
		this.yearOfManufacture = yearOfManufacture;
	}

	public double getVehicleCost() {
		return vehicleCost;
	}

	public void setVehicleCost(double vehicleCost) {
		this.vehicleCost = vehicleCost;
	}

	@Override
	public double calculatePremium() {
		// TODO Auto-generated method stub
		double premium=0.0;
		if(this.vehicleModel==2) {
			if(Calendar.getInstance().get(Calendar.YEAR)-this.yearOfManufacture<2) {
				premium= 0.5*this.vehicleCost;
			}
			else {
				premium= 0.6*this.vehicleCost;
			}
		}
		else {
			if(Calendar.getInstance().get(Calendar.YEAR)-this.yearOfManufacture<2) {
				premium= 0.4*this.vehicleCost;
			}
			else {
				premium= 0.5*this.vehicleCost;
			}
		}
		return premium;
	}
	
	
}
