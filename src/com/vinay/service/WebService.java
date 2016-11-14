package com.vinay.service;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/Webservice")
public class WebService {
	
	Services s1 = new Services();
	
	@Path("/getstudents")
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public ArrayList<Students> Xml(){

		return (ArrayList<Students>) s1.getlist();	
		}
	
	@Path("/getstudentsjson")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Students> Json(@Context HttpHeaders headers) {

		

		return s1.getlist();

	}
	
	 @Path("poststudents")
	    @POST
	    @Consumes({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	    public 	Response consumeJsonRequest(Students s)

	    {
		 
		 String response ="students details saved"+": "+s;
		 
		 if(s == null){
		        return Response.status(400).entity("Please  provide student details").build();
		    }
		     
		  
		    else
		    return Response.status(200).entity(response).build();
		     
		  
		 
		 
		 
			
	     
	    
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
	 























}