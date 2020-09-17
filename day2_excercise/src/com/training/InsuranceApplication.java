package com.training;

public class InsuranceApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Insurance myInsurance = new Insurance(2322,"Madhura",3459.22,22);
		VehicleInsurance honda = new VehicleInsurance(2322,"Madhura",3459.0,22,2,2019,34000.0);
		VehicleInsurance swift = new VehicleInsurance(2321,"John",36789.22,33,4,2016,194000.0);
		VehicleInsurance maruti = new VehicleInsurance(2322,"Madhura",3459.0,22,4,2019,194000.0);
		VehicleInsurance access = new VehicleInsurance(2321,"John",36789.22,33,2,2016,194000.0);
		
		System.out.println("Premium for Honda  "+honda.calculatePremium()+" , "+honda.getYearOfManufacture());
		System.out.println();
		System.out.println("Premium for Swift  "+swift.calculatePremium()+" , "+swift.getYearOfManufacture());
		System.out.println();
		System.out.println("Premium for Access  "+access.calculatePremium()+" , "+access.getYearOfManufacture());
		System.out.println();
		System.out.println("Premium for Maruti  "+maruti.calculatePremium()+" , "+maruti.getYearOfManufacture());
	}

}
