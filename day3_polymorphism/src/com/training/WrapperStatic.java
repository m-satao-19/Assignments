package com.training;

public class WrapperStatic {
	private int id;
	private static String aadharNumber;
	
	public void show() {
		System.out.println(id);
		System.out.println(aadharNumber);
		display();
	}
	
	public static void display() {
		//System.out.println(id);
		System.out.println(aadharNumber);
		//show();
	}
	
	public void parse(String strNumber) {
		int number = Integer.parseInt(strNumber);
		System.out.println(number);
	}
	public void useValueOf(String strNumber) {
		int number = Integer.valueOf(strNumber,2);
		System.out.println(number);
	}

}
