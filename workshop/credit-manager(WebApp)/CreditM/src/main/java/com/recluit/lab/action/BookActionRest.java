package com.recluit.lab.action;

import java.util.Scanner;

import com.opensymphony.xwork2.ActionSupport;
import com.recluit.lab.model.BookStore;
import com.recluit.lab.restclient.BookRestClient;

public class BookActionRest extends ActionSupport{
	private static final long serialVersionUID = 1L;
	private BookStore bookStore;
	private String bookQuery;		//Variable que guarda el string insertado por USER en la pag HTML
	private String bookResultTitle;	 //Variable que se regresara a una pag JSP 
	private String bookResultAuthor; //Variable que se regresara a una pag JSP 
	private String bookResult;
	
	
public String execute() throws Exception{				
		BookRestClient bookRestClient = new BookRestClient();		
		System.out.println(bookQuery);
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
		}
	}


public BookStore getBookStore() {
	return bookStore;
}


public void setBookStore(BookStore bookStore) {
	this.bookStore = bookStore;
}


public String getBookQuery() {
	return bookQuery;
}


public void setBookQuery(String bookQuery) {
	this.bookQuery = bookQuery;
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


public String getBookResult() {
	return bookResult;
}


public void setBookResult(String bookResult) {
	this.bookResult = bookResult;
}
}
