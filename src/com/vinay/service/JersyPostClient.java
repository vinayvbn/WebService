package com.vinay.service;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class JersyPostClient {
	
	Client c= ClientBuilder.newClient();
	
	static final String uri="http://localhost:8080/RestWebService/rest/Webservice";
	
	WebTarget wt =null;
	
	 public void JsonRequest() {
         
         String input ="{\"rno\":\"24\"," +
         		"\"name\":\"jackson\"," +
         		"\"branch\":\"I.T\"," +
         		"\"age\":\"25\"}";
      wt = c.target(uri).path("/poststudents");

         
         String response = wt.request(MediaType.APPLICATION_JSON)
          .post(Entity.entity(input, MediaType.APPLICATION_JSON),String.class);
         
         Response response1 = wt.request(MediaType.APPLICATION_JSON)
                 .post(Entity.entity(input, MediaType.APPLICATION_JSON),Response.class);
         System.out.println(response1);
         System.out.println(response);
         
         
         
         if(response1.getStatus() == 200) {
        	
             System.out.println(" Json posted succesfully");
      }
	 }
   public  void    XmlRequest(){
        	
        	
        	
        	
	   Students input = new Students(25, "moxy", "I.T", 25);
     wt = c.target(uri).path("/poststudents");

        
        String response = wt.request(MediaType.APPLICATION_XML)
         .post(Entity.entity(input, MediaType.APPLICATION_XML),String.class);
        
        Response response1 = wt.request(MediaType.APPLICATION_XML)
                .post(Entity.entity(input, MediaType.APPLICATION_XML),Response.class);
        System.out.println(response1);
        System.out.println(response);
      
        
        if(response1.getStatus() == 200) {
       	
            System.out.println(" Xml posted succesfully");
     }
        	
        	
        	
        	
        	
        	
        }
  
	
	
	
	
		public static void main(String[] args) {
			
			JersyPostClient jp= new JersyPostClient();
			jp.JsonRequest();
			jp.XmlRequest();
			
			
			
			
			
			
		}
	
	
	

}
