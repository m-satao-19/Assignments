package com.training;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;

public class BusinessService {

	public boolean storeDetails(CreditCard card) {
		boolean stored=false;
		PrintWriter writer=null;
		
		try {
			writer = new PrintWriter(new FileWriter(new File("card_details"),true));
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
				cc[i].setAccountNumber(Long.parseLong(temp[2]));
				cc[i++].setCardLimit(Integer.parseInt(temp[3]));
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
				cc[i].setAccountNumber(Long.parseLong(temp[2]));
				cc[i++].setCardLimit(Integer.parseInt(temp[3]));
			}
			    
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 		
		
		return cc;
	}
	
	public boolean deleteDetails() {
		
		return false;
	}
}