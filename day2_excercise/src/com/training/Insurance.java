package com.training;

public class Insurance {
	public int policuNumber;
	public String policyHolder;
	public double insuredAmount;
	public int age;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Insurance(int policuNumber, String policyHolder, double insuredAmount, int age) {
		super();
		this.policuNumber = policuNumber;
		this.policyHolder = policyHolder;
		this.insuredAmount = insuredAmount;
		this.age = age;
	}
	public Insurance() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getPolicuNumber() {
		return policuNumber;
	}
	public void setPolicuNumber(int policuNumber) {
		this.policuNumber = policuNumber;
	}
	public String getPolicyHolder() {
		return policyHolder;
	}
	public void setPolicyHolder(String policyHolder) {
		this.policyHolder = policyHolder;
	}
	public double getInsuredAmount() {
		return insuredAmount;
	}
	public void setInsuredAmount(double insuredAmount) {
		this.insuredAmount = insuredAmount;
	}
	
	public double calculatePremium() {
		double premium=0.0;
		if(this.age<25) {
			premium= 0.6*this.insuredAmount;
		}
		else 
			premium= 0.7*this.insuredAmount;
		
		return premium;
		
	}
}
