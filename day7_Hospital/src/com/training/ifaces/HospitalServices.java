package com.training.ifaces;

import java.util.*;

import com.training.models.*;

public interface HospitalServices {

	public void addDoctor(String docName, int docId);
	public ArrayList<Patient> fetchPatients(String docName) throws Exception;
	public void removeAppoint(String pName, String dName);
	public void makeAppointment(String docName, String pName);
}
