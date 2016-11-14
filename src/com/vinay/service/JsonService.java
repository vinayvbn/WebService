package com.vinay.service;

import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
@Path("/json")
public class JsonService {
	
	
	
	
	
	@Produces(MediaType.APPLICATION_JSON)
	public Students JSON(@Context HttpHeaders headers) {

		Students s = new Students(1, "dog", "hyd", 10);
		

		return s;

	}

}
