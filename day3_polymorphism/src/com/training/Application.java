package com.training;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lawyer rajesh = new Lawyer(111111,"Rajesh Khanna","HighCourt","B.L");
		Musician sharma = new Musician(222222,"Umesh Khanna","Piano","Chennai");
		
		Billing bill = new Billing();
		bill.printFees(rajesh);
		bill.printFees(sharma);
	}

}
