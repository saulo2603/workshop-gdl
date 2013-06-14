package com.recluit.lab.restclient;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class BookRestClient {
	public String findBookTitle(String title){
		Client client = Client.create(); // static method cause we don't need an instance
		String url= "http://localhost:8080/RestServer/rest/book/"+title.replace(" ","%20");
		
		WebResource resource = 	client.resource(url);
		ClientResponse response = resource.accept("text/plain").get(ClientResponse.class);
		
		if(response.getStatus() == 200){
			return response.getEntity(String.class);
		}
		else{
			return null;
		}
				
	}
}
