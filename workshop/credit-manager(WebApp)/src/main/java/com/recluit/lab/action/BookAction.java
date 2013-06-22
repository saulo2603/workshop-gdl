package com.recluit.lab.action;

import java.util.Scanner;

//import com.recluit.lab.model.Book;
//import com.recluit.lab.restclient.HelloClient;
import com.opensymphony.xwork2.ActionSupport;
import com.recluit.lab.model.Book;
import com.recluit.lab.model.BookStore;
import com.recluit.lab.restclient.BookRestClient;

public class BookAction extends ActionSupport{

	private static final long serialVersionUID = -3561538112932319256L;	
	private BookStore bookStore;
	private String bookQuery;		//Variable que guarda el string insertado por USER en la pag HTML
	private String bookResultTitle;	 //Variable que se regresara a una pag JSP 
	private String bookResultAuthor; //Variable que se regresara a una pag JSP 
	private String bookResult;
	
	public String execute() throws Exception{
		  bookStore = new BookStore();		
			// FOREACH
			// For every book IN AllBooks (List)
			for(Book book : bookStore.getAllBooks() ){
			//Begin of the BUSSINES LOGIC 			
				if(book.getTitle().equals(bookQuery)){
					//HelloClient  helloClient = new HelloClient();
					//bookResultTitle  = helloClient.getMessage();
					bookResultTitle  = book.getTitle();
					bookResultAuthor = book.getAuthor();				
					return SUCCESS;
				}
			}
				return ERROR;
		
		/*
		BookRestClient bookRestClient = new BookRestClient();
		bookResult = bookRestClient.findBookTitle(bookQuery);
		
		if(bookResult != null){
			Scanner scanner = new Scanner(bookResult);
			scanner.useDelimiter(",");
			bookResultTitle = scanner.next();
			bookResultAuthor= scanner.next();
			scanner.close();
			return SUCCESS;
		}
		else{
			return ERROR;
		} */
	}

	//Getters and Setters Methods
	public String getBookQuery() {
		return bookQuery;
	}

	public void setBookQuery(String bookQuery) {
		this.bookQuery = bookQuery;
	}

	public BookStore getBookStore() {
		return bookStore;
	}

	public void setBookStore(BookStore bookStore) {
		this.bookStore = bookStore;
	}

	public String getBookResultTitle() {
		return bookResultTitle;
	}

	public void setBookResultTitle(String bookResultTitle) {
		this.bookResultTitle = bookResultTitle;
	}

	public String getBookResultAuthor() {
		return bookResultAuthor;
	}

	public void setBookResultAuthor(String bookResultAuthor) {
		this.bookResultAuthor = bookResultAuthor;
	}
}
