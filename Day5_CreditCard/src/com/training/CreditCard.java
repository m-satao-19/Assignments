package com.training;

import java.io.Serializable;

public class CreditCard implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 11L;
	private long cardNumber;
	private long accountNumber;
	private String cardHolderName;
	private transient long cardLimit;
	
	public CreditCard() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CreditCard(long cardNumber, long accountNumber, String cardHolderName, long cardLimit) {
		super();
		this.cardNumber = cardNumber;
		this.accountNumber = accountNumber;
		this.cardHolderName = cardHolderName;
		this.cardLimit = cardLimit;
	}

	public long getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(long cardNumber) {
		this.cardNumber = cardNumber;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getCardHolderName() {
		return cardHolderName;
	}

	public void setCardHolderName(String cardHolderName) {
		this.cardHolderName = cardHolderName;
	}

	public long getCardLimit() {
		return cardLimit;
	}

	public void setCardLimit(long cardLimit) {
		this.cardLimit = cardLimit;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return cardNumber+" "+cardHolderName+" "+accountNumber;
	}
	
	
	
}
