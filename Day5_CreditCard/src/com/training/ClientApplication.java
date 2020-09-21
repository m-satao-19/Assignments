package com.training;

import java.io.File;

public class ClientApplication {

	public static void main(String[] args) {
		CreditCard myCard = new CreditCard(111111, 11111111, "Madhura", 100000);
		CreditCard myCard2 = new CreditCard(22222, 22222222, "Madhura2", 200000);
		
		CreditCard[] cardList = new CreditCard[2];
		cardList[0]=myCard;
		cardList[1]=myCard2;
		
		BusinessService service = new BusinessService();
		service.storeDetails(cardList[0]);
		service.storeDetails(cardList[1]);
		
		CreditCard cc[]=service.getDetails();
		
		for(int i=0;i<2;i++) {
			System.out.println(cc[i].getCardNumber());
			System.out.println(cc[i].getAccountNumber());
			System.out.println(cc[i].getCardHolderName());
		}
		
		File f= new File("C:/Users/Madhura/Desktop/iwp_cms/card_details");
		service.storeDetails(cardList[0],f);
		service.storeDetails(cardList[1],f);
		
		CreditCard cc2[]=service.getDetails(f);
		for(int i=0;i<2;i++) {
			System.out.println(cc2[i].getCardNumber());
			System.out.println(cc2[i].getAccountNumber());
			System.out.println(cc2[i].getCardHolderName());
		}
		System.out.println("Done");
	}
	
}
