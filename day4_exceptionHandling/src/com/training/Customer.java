package com.training;

import com.training.exceptions.RangeCheck;

public class Customer {
	
	private String customerId;
	private String customerName;
	private long mobileNumber;
	private String email;
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) throws RangeCheck {
		if(mobileNumber<0 || mobileNumber>999999) {
			throw new RangeCheck("Invalid Mobile Number xxxx");
		}
		this.mobileNumber = mobileNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return customerName+" "+customerId+" "+email;
	}
	
	

}
