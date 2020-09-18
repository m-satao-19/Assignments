package com.training;

public class CustomerService {
	
	public String generateUserId(Customer cust) {
		String userId="";
		try {
			int firstPart = Integer.parseInt(cust.getCustomerId());
			String secondPart = cust.getEmail().substring(0, 4);
			userId= firstPart+secondPart;
		} catch (NumberFormatException e) {
			// TODO: handle exception
			System.out.println("Id should be number");
			e.printStackTrace();
		}
		return userId;
	}
	
	public void printCustomer(Customer cust) {
		
		
		try {
			System.out.println(cust.getCustomerName().length());
		} catch(NullPointerException e) {
			System.err.println("Customer name should not be empty");
			e.printStackTrace();
		}
		System.out.println("Outside catch");
	}

	public String encryptEmail(Customer cust) {
		
		String email = cust.getEmail();
		boolean status = email.contains("@");
		if(!status) {
			try {
				throw new Exception("Invalid email");
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(e.getMessage());
				return "From catch";
			}
		    finally {
		    	System.err.println("Inside finally");
		    }
			//System.out.println("Outside finally");
		}
		System.out.println("Outside try-catch");
		return "";
	}
}
