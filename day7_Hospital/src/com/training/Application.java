package com.training;

import java.util.ArrayList;

import com.training.impl.SahyadriHospital;
import com.training.models.Patient;

public class Application {

	public static void main(String[] args) {
		
		SahyadriHospital sahyadri = new SahyadriHospital();
		
		sahyadri.addDoctor("John Doe", 101);
		System.out.println();
		sahyadri.makeAppointment("John", "Madhura");
		System.out.println();
		ArrayList<Patient> pList;
		try {
			pList = sahyadri.fetchPatients("John Doe");
			for(Patient pat : pList) {
				System.out.println(pat);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("No patients found");
		}
		System.out.println();
		
		System.out.println();
		sahyadri.removeAppoint("Madhura", "John Doe");

	}

}
