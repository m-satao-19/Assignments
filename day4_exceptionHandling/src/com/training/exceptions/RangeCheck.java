package com.training.exceptions;

public class RangeCheck extends Exception{

	private String message;
	
	public RangeCheck(String message) {
		super();
		this.message=message;
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Range Check Exception:"+message;
	}
	
	
}
