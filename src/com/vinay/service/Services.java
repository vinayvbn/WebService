package com.vinay.service;

import java.util.ArrayList;
import java.util.List;



public class Services {
	
	
	public List<Students> getlist(){
		Students s1= new Students(10,"vinay","I.T",22);
		Students s2= new Students(11,"john","I.T",21);
	ArrayList<Students> list = new ArrayList<>();
		list.add(s1);
		list.add(s2);
		return list;
}

	
	
	
	
}

