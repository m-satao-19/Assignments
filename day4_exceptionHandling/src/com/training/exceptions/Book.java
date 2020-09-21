package com.training.exceptions;
import com.training.*;

public class Book {
	private String bookId;
	private String bookName;
	private String bookAuthor;
	private double bookPrice;
	public Book(String bookId, String bookName, String bookAuthor, double bookPrice) {
		super();
		this.bookId = bookId;
		try {
			if(bookName.length()==0) {
				throw new MyCustomException("Book name required", new NullPointerException());
			}
			this.bookName=bookName;
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println(e.getMessage());
		}
		
		this.bookAuthor = bookAuthor;
		try {
			if(bookPrice<100 || bookPrice>500) {
				throw new RangeCheck("Check book price");
			}
			this.bookPrice = bookPrice;
		} catch (RangeCheck e) {
			// TODO: handle exception
			System.err.println(e.getMessage());
		}
	}
	public String getBookId() {
		return bookId;
	}
	public void setBookId(String bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) throws MyCustomException {
		
		try {
			this.bookName = bookName;
		} catch (NullPointerException e) {
			// TODO: handle exception
			throw new MyCustomException("Book name required", e);
		}
		
		
//		if(bookName.length()==0) {
//			throw new MyCustomException("Book name required", new Throwable());
//		}
//		this.bookName = bookName;
		
		
	}
	public String getBookAuthor() {
		return bookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	public double getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(double bookPrice) throws RangeCheck {
		if(bookPrice<100 || bookPrice>500) {
			throw new RangeCheck("Check book price");
		}
		this.bookPrice = bookPrice;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Created successfully"+bookName+"  "+bookAuthor+"  ";
	}
	

	
}
