package com.vinay.service;

import java.sql.DriverManager;
import java.sql.ResultSet;

import javax.validation.Valid;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class DbConnection {

	/**
	 * @param args
	 */
	public static void main(String[] args)throws Exception {  
		
		
		
		try{
		Class.forName("com.mysql.jdbc.Driver");  
		Connection con=(Connection) DriverManager.getConnection(  
		"jdbc:mysql://localhost:3306/WebServices","vinay","vinay");  
		
		}catch(Exception e){
			System.out.println(e);
		}  
		
	
		
		
	
		}
	

	
}
	
