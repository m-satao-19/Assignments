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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((patName == null) ? 0 : patName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Patient other = (Patient) obj;
		if (patName == null) {
			if (other.patName != null)
				return false;
		} else if (!patName.equals(other.patName))
			return false;
		return true;
	}
	
	
	
}
