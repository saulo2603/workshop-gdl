package com.recluit.lab.restservices;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/hello")
public class MessageService {
	
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)  //return the content in plain text
	public String sayHello(){
		return "Hello From Rest Server :D !!";
	}
	
	@GET
	@Produces(MediaType.TEXT_XML)
	public String sayXMLHello(){
		
		return "<?xml version=\"1.0\"?>"+
				"<hello>Hello from RESTServer in XML !!!</hello>";
	}
	
	
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String sayHtmlHello(){
		return new StringBuilder("")
		.append("<html>")
		.append("\t <head><title> Hello </title></head>")
		.append("\t <body>" +
				"		<h1>Hello From RESTServer HTML :D !!!</h1>" +
				"  </body>")
		.append("</html>").toString(); // 
		
	}
}
