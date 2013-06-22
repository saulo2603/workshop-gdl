package com.recluit.lab.restclient;


import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;


/*
 * Main purpose of this class: REQUEST the "hello" message from the RESTServer Project
 */
public class HelloClient {
		
	public String getMessage(){
		Client client = Client.create(); // static method cause we don't need an instance
		//WebResource webResourse = client.resource("http://localhost:8080/RestServer/rest/hello");
		WebResource webResourse = client.resource("http://192.168.10.161:8080/RESTServer/rest/hello");
		ClientResponse response = webResourse.accept("text/plain").get(ClientResponse.class);
		System.out.print(response.getStatus());
			
			if(response.getStatus() != 200){
				throw new RuntimeException("Failed!: "+response.getStatus());
			}
			
			String output = response.getEntity(String.class);
			return output;
				
	}	
}
