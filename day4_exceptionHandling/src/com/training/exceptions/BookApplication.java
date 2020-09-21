package com.training.exceptions;

public class BookApplication {
	
	public static void main(String[] args) {
		BookService2 myBooks = new BookService2();
		Book b1 = new Book( "1234", "HeaddFirst", "John Doe", 200.00);
		
		myBooks.addOne(b1);
		
		try {
			Book b = myBooks.getOne("1234");
			System.out.println("Book found  "+b.getBookName());
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println(e.getMessage());
		}
		System.out.println();
		
		Book b2 = new Book( "5678", "", "Lorem ipsum", 700.00);
		myBooks.addOne(b2);
		try {
			Book b = myBooks.getOne("5678");
			System.out.println("Book found  "+b.getBookName());
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println(e.getMessage());
		}
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
			Book[] b = myBooks.getAll();
			System.out.println("Book list found"+b);
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println(e.getMessage());
		}
		

		BookService2 bookList2 = new BookService2();
		try {
			Book[] b = bookList2.getAll();
			System.out.println("Book list found"+b);
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println(e.getMessage());
		}
	}
	
}
