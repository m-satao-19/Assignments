package com.training;

public class InsuranceApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Insurance myInsurance = new Insurance(2322,"Madhura",3459.22,22);
		TwoWheeler honda = new TwoWheeler(2322,"Madhura",3459.22,22,111,2019,34000.0);
		FourWheeler swift = new FourWheeler(2322,"Madhura",3459.22,22,222,2016,194000.0);
		
		System.out.println(honda.calculatePremium());
		System.out.println();
		System.out.println(swift.calculatePremium());
	}

}
