package com.training.models;

public class Patient {

	private String patName;

	public Patient(String patName) {
		super();
		this.patName = patName;
	}

	public String getPatName() {
		return patName;
	}

	public void setPatName(String patName) {
		this.patName = patName;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Patient name = "+patName;
	}
	
	
}
