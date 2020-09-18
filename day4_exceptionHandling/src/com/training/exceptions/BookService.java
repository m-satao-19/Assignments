package com.training.exceptions;

import java.util.ArrayList;

import com.training.MyCustomException;

public class BookService {

	ArrayList<Book> bookList = new ArrayList<>();
	
	public void addOne(Book b) {
		this.bookList.add(b);
	}
	
	public Book getOne(String id) throws MyCustomException {
		for(Book b : this.bookList) {
			if(id.equals(b.getBookId())) {
				return b;
			}
		}
		throw new MyCustomException("No such book available",new Throwable());
	}
	
	public ArrayList<Book> getAll() throws MyCustomException{
		if(this.bookList.size()!=0) {
			return this.bookList;
		}
		throw new MyCustomException("Book list empty",new Throwable());
	}
}
