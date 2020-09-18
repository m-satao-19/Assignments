package com.training;

public class MyCustomException extends Exception {

	private String myMessage;
	private Throwable exc;
	public MyCustomException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
		this.myMessage=message;
		this.exc=cause;
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		//return super.getMessage();
		return "My custom exception  "+myMessage+"  "+super.getMessage();
	}

	
	
}
