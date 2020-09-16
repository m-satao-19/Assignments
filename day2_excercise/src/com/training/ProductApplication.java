package com.training;

public class ProductApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Product tv = new Product(101,"LED Plasma",51000.00,2);
		tv.setProductQuantity(4);
		ManageProduct mgr = new ManageProduct();
		
		double taxPercent = mgr.calculateTax(tv);
		
		//System.out.println("Discount price for tv = "+(1-d)*tv.getRatePerUnit());
		System.out.println("Tax Percent for tv = "+taxPercent);
		System.out.println();
		
		Product[] productArray=new Product[2];
		productArray[0]=tv;
		productArray[1]=new Product(102,"Speaker",2300.00,3);
		productArray[1].setProductQuantity(2);

		mgr.calculateDiscount(productArray);
		mgr.showProductList(productArray);
		System.out.println();
		mgr.showForEach(productArray);
		System.out.println();
		System.out.println("Price after discount:");
		for(Product product: productArray) {
			System.out.println(product.getProductName()+" = "+(1-product.getProductDiscount())*product.getProductQuantity()*product.getRatePerUnit());
		}

	}

}
