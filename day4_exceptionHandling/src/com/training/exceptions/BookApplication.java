package com.training.exceptions;

import java.util.ArrayList;
public class BookApplication {
	
	public static void main(String[] args) {
		BookService myBooks = new BookService();
		BookService bookList2 = new BookService();
		Book b1 = new Book( "1234", "HeaddFirst", "John Doe", 200.00);
		myBooks.addOne(b1);
		System.out.println(b1);
		System.out.println();
		
		Book b2 = new Book( "5678", "CompleteGuide", "Lorem ipsum", 700.00);
		myBooks.addOne(b2);
		System.out.println(b2);
		System.out.println();
		
		try {
			b1.setBookPrice(600.0);
		} catch (RangeCheck e1) {
			// TODO Auto-generated catch block
			System.err.println(e1.getMessage());
		}
		
		try {
			Book b = myBooks.getOne("134");
			System.out.println("Book found  "+b.getBookName());
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println(e.getMessage());
		}
		
		try {
			ArrayList<Book> b = bookList2.getAll();
			System.out.println("Book list found"+b);
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println(e.getMessage());
		}
	}
	
}
