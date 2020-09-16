package com.training;

public class ManageProduct {
	
	public Product[] calculateDiscount(Product[] productList) {
		double discount = 0.0;
		for(Product product:productList) {
			
			if(product.getRatePerUnit() > 500 && product.getRatePerUnit()<=1000) {
				discount=0.10;
			} 
			else if(product.getRatePerUnit() > 1000) {
				discount=0.15;
			}

			product.setProductDiscount(discount);
		}
		return productList;
	}
	
	public double calculateTax(Product product) {
		
		switch(product.getProductType()) {
		case 1: return 0.05;
		case 2: return 0.10;
		case 3: return 0.15;
		default: return 0.28;
		}
	}
	
	public void showProductList(Product[] productList) {
		for(int i=0;i<productList.length;i++) {
			//System.out.println("Product "+i+" is  "+productList[i].getProductName());
			System.out.println(productList[i]);
		}
	}
	
	public void showForEach(Product[] productList) {
		for(Product product: productList){
			System.out.println("Product is  "+product.getProductName()+product.getRatePerUnit()*product.getProductQuantity());
		}
	}

}
