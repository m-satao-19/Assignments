package com.training;

public class Product {
	private int productId;
	private String productName;
	private double ratePerUnit;
	private int productType;
	private double productDiscount;
	private int productQuantity;

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Product(int productId, String productName, double ratePerUnit, int productType) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.ratePerUnit = ratePerUnit;
		this.productType = productType;
	}
	
	public Product(int productId, String productName, double ratePerUnit, int productType, double productDiscount,
			int productQuantity) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.ratePerUnit = ratePerUnit;
		this.productType = productType;
		this.productDiscount = productDiscount;
		this.productQuantity = productQuantity;
	}

	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getRatePerUnit() {
		return ratePerUnit;
	}
	public void setRatePerUnit(double ratePerUnit) {
		this.ratePerUnit = ratePerUnit;
	}
	public int getProductType() {
		return productType;
	}

	public void setProductType(int productType) {
		this.productType = productType;
	}
	public double getProductDiscount() {
		return productDiscount;
	}

	public void setProductDiscount(double productDiscount) {
		this.productDiscount = productDiscount;
	}

	public int getProductQuantity() {
		return productQuantity;
	}

	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		//return super.toString();
		return super.toString()+this.productName;
	}
	
	

}
