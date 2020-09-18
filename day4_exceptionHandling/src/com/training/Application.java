package com.training;

public class Application {
	
	public static void main(String[] args) {
		try {
			Customer ram = new Customer();
			ram.setCustomerId("234");
			ram.setEmail("2wwq@ddsds");
			ram.setMobileNumber(11111);
			ram.setCustomerName("ram");
			System.out.println(ram);
			
			System.out.println();
			
			Customer sham = new Customer();
			sham.setCustomerId("asd");
			sham.setEmail("2wwqddsds");
			sham.setMobileNumber(-11111);
			sham.setCustomerName("sham");
			System.out.println(sham);
			
			CustomerService cs = new CustomerService();
			cs.printCustomer(ram);
			System.out.println(cs.generateUserId(ram));
			System.out.println(cs.encryptEmail(ram));
			System.out.println();
			cs.printCustomer(sham);
			System.out.println(cs.generateUserId(sham));
			System.out.println(cs.encryptEmail(sham));

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
