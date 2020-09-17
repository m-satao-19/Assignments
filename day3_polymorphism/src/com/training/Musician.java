package com.training;

public class Musician extends ServiceProvider {
	private String instrument;
	private String location;
	public Musician(long phoneNumber, String firstName, String instrument, String location) {
		super(phoneNumber, firstName);
		this.instrument = instrument;
		this.location = location;
	}
	@Override
	public double calculateFees() {
		// TODO Auto-generated method stub
		double fees = 1500.0;
		if(this.instrument.equalsIgnoreCase("Piano") || this.location.equalsIgnoreCase("Mumbai")) {
			fees=4500.0;
		}
		return fees;
	}
	

}
