package com.training.impl;

import java.util.*;

import com.training.ifaces.HospitalServices;
import com.training.models.*;

public class SahyadriHospital implements HospitalServices {
	
	ArrayList<Doctor> docList = new ArrayList<>();
	HashMap<Doctor,ArrayList<Patient>> appointments = new HashMap<>();
	
	
	private Doctor checkDoctor(String docName) {
		for(Doctor doctor: docList) {
			if(doctor.getDocName().equalsIgnoreCase(docName)) {
				//doc=doctor;
				return doctor;
			}
		}
		return null;
	}

	@Override
	public void addDoctor(String docName, int docId) {
		
		Doctor doc = new Doctor(docId,docName);
		for(Doctor doctor: docList) {
			if(doctor.getDocId()==doc.getDocId()) {
				System.out.println("Doctor already exists");
				return;
			}
		}
		this.docList.add(doc);
		System.out.println("Doctor added");
		System.out.println(doc);
	}

	@Override
	public ArrayList<Patient> fetchPatients(String doc) throws Exception {
		
		for(Doctor doctor: docList) {
			if(doctor.getDocName().equalsIgnoreCase(doc)) {
				if(this.appointments.containsKey(doctor)) {
					ArrayList<Patient> pList = appointments.get(doctor);
					return pList;
				}
			}
		}
		//System.out.println("No patients found for the doctor");
		return null;
	}

	@Override
	public void removeAppoint(String pName, String dName) {
		
		Doctor doc =checkDoctor(dName);
		
		if(doc!=null) {
			if(this.appointments.containsKey(doc)) {
				ArrayList<Patient> pList = appointments.get(doc);
				for(Patient pat:pList) {
					if(pat.getPatName().equalsIgnoreCase(pName)) {
						pList.remove(pat);
						System.out.println("Appointment removed");
						return;
					}
				}
				System.out.println("Patient not found");
			}
		}
		else {
			System.out.println("Doctor not found");
		}
		//System.out.println("Appointment not found");
	}

	@Override
	public void makeAppointment(String docName, String pName) {
		
		Doctor doc =checkDoctor(docName);
		Patient pat = new Patient(pName);
		if(doc!=null) {
			if(this.appointments.containsKey(doc)) {
				appointments.get(doc).add(pat);
			}
			else {
				ArrayList<Patient>newList=new ArrayList<>();
				newList.add(pat);
				appointments.put(doc, newList);
			}
			System.out.println("Appointment made");
			return;
		}
		else {
			System.out.println("Doctor not found");
		}
	}

	
}
