package com.training.models;

public class Doctor {

	private int docId;
	private String docName;
	
	
	public Doctor(int docId, String docName) {
		super();
		this.docId = docId;
		this.docName = docName;
	}
	public int getDocId() {
		return docId;
	}
	public void setDocId(int docId) {
		this.docId = docId;
	}
	public String getDocName() {
		return docName;
	}
	public void setDocName(String docName) {
		this.docName = docName;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Doctor id = "+docId+"  Doctor nme = "+docName;
	}
	
	
}
