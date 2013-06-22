package com.recluit.lab.restservices;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.recluit.lab.model.Book;
import com.recluit.lab.model.BookStore;


@Path("/book")
public class BookService {
	private BookStore bookStore;
	
	@GET
	@Path("/{title}")
	@Consumes(MediaType.TEXT_PLAIN)  //return the content in plain text
	public String getBook(@PathParam("title") String title){
		System.out.println("Book to Query:"+ title);				
		bookStore = new BookStore();	
	
		
		for(Book book : bookStore.getAllBooks() ){	
			/*Begin of the BUSSINES LOGIC */			
			if(title.equals(book.getTitle())){
				System.out.println("Book Found!!:"+ book);
				String result = book.getTitle()+ "," + book.getAuthor();
				return result;
			}
		}
		return null;
	}
}
