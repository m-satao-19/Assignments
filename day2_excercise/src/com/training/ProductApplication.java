package com.training;

public class ProductApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Product tv = new Product(101,"LED Plasma",51000.00,2);
		ManageProduct mgr = new ManageProduct();
		double d = mgr.calculateDiscount(tv);
		double taxPercent = mgr.calculateTax(tv);
		System.out.println("Discount price for tv = "+(1-d)*tv.getRatePerUnit());
		System.out.println("Tax Percent for tv = "+taxPercent);

	}

}
