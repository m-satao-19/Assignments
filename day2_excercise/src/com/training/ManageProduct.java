package com.training;

public class ManageProduct {
	
	public double calculateDiscount(Product product) {
		double discount = 0.0;
		
		if(product.getRatePerUnit() > 500 && product.getRatePerUnit()<=1000) {
			discount=0.10;
		} 
		else if(product.getRatePerUnit() > 1000) {
			discount=0.15;
		}
		return discount;
	}
	
	public double calculateTax(Product product) {
		
		switch(product.getProductType()) {
		case 1: return 0.05;
		case 2: return 0.10;
		case 3: return 0.15;
		default: return 0.28;
		}
	}

}
