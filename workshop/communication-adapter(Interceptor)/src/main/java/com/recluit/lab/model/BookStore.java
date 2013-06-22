package com.recluit.lab.model;

import java.util.ArrayList;
import java.util.List;

//This class simulate a DB 

public class BookStore {
	private List<Book> allBooks;

	//constructor BookStore class
	public BookStore(){
		//creating instance in the ArrayList
		allBooks = new ArrayList<Book>();
		
		//adding Books to the ArrayList
		allBooks.add(new Book("Sherlock Holmes","Sir Arthur Doyle"));
		allBooks.add(new Book("Le Parfum","Patrick Suskind"));
		
	}
	
	//getters and setters methods
	public List<Book> getAllBooks() {
		return allBooks;
	}
	public void setAllBooks(List<Book> allBooks) {
		this.allBooks = allBooks;
	}
	
	
}
