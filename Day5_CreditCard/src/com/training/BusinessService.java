package com.training;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.PrintWriter;

public class BusinessService {

	public boolean storeDetails(CreditCard[] card,boolean flag) {
		boolean stored=false;
		PrintWriter writer=null;
		try {
			writer = new PrintWriter(new FileWriter(new File("card_details"),flag));
			for(int i=0;i<card.length;i++) {
				writer.println(card[i].toString());
			}
			stored=true;
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			System.out.println("Noe here error..");
			System.err.println(e.getMessage());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Null exception");
			e.printStackTrace();
		}
		finally {
			writer.close();
		}
		return stored;
	}
	
	public boolean storeDetails(CreditCard card, File file) {
		boolean stored=false;
		PrintWriter writer=null;
		
		try {
			writer = new PrintWriter(new FileWriter(file,true));
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			System.err.println(e.getMessage());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			writer.println(card.toString());
			stored=true;
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println(e.getMessage());
		}
		finally {
			writer.close();
		}
		return stored;
	}
	
	public CreditCard[] getDetails() {
		CreditCard[] cc = new CreditCard[10];
		BufferedReader br = null;
		int i=0;
		
		try {
			br = new BufferedReader(new FileReader(new File("card_details")));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		String st; 
		try {
			while ((st = br.readLine()) != null) {
				String[] temp = st.split(" ");
				cc[i]=new CreditCard();
				cc[i].setCardNumber(Long.parseLong(temp[0]));
				cc[i].setCardHolderName(temp[1]);
				cc[i++].setAccountNumber(Long.parseLong(temp[2]));
			}
			    
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 		
		
		return cc;
	}
	
	public CreditCard[] getDetails(File file) {
		CreditCard[] cc = new CreditCard[10];
		BufferedReader br = null;
		int i=0;
		
		try {
			br = new BufferedReader(new FileReader(file));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		String st; 
		try {
			while ((st = br.readLine()) != null) {
				String[] temp = st.split(" ");
				cc[i]=new CreditCard();
				cc[i].setCardNumber(Long.parseLong(temp[0]));
				cc[i].setCardHolderName(temp[1]);
				cc[i++].setAccountNumber(Long.parseLong(temp[2]));
			}
			    
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 		
		
		return cc;
	}
	
	public boolean deleteDetails(long num) {
		CreditCard[] cList = this.getDetails();
		CreditCard[] cList2 = new CreditCard[cList.length-1];
		int i=0;
		for(CreditCard card:cList) {
			if(card!=null) {
				if(card.getCardNumber()!=num) {
					cList2[i++]=card;
				}
			}
			
		}
		this.storeDetails(cList2,false);
		return false;
	}
}