package com.training.exceptions;

import com.training.MyCustomException;

public class BookService2 {
	static int ind=0;
    Book[] bookList = new Book[20];
	
	public void addOne(Book b) {
		//int len=this.bookList.length;
		this.bookList[ind++]=b;
	}
	
	public Book getOne(String id) throws MyCustomException {
		for(Book b : this.bookList) {
			if(id.equals(b.getBookId())) {
				return b;
			}
		}
		throw new MyCustomException("No such book available",new Throwable());
	}
	
	public Book[] getAll() throws MyCustomException{
		if(ind!=0) {
			return this.bookList;
		}
		throw new MyCustomException("Book list empty",new Throwable());
	}

}
