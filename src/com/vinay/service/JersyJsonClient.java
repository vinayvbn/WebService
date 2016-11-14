package com.vinay.service;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class JersyJsonClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Client client = ClientBuilder.newClient( );
		WebTarget webTarget = client.target("http://localhost:8080/RestWebService/rest").path("Webservice/getstudentsjson");
	   
		
		Response r=webTarget.request(MediaType.APPLICATION_JSON).get(Response.class);
		System.out.println(r);
		
		System.out.println( webTarget.request(MediaType.APPLICATION_JSON).get(String.class));
		
		
		
		
		
		

	}

}
