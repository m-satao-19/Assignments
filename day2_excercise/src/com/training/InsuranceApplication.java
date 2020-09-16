package com.training;

public class InsuranceApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Insurance myInsurance = new Insurance(2322,"Madhura",3459.22,22);
		
		System.out.println(myInsurance.calculatePremium());
	}

}
