package com.vinay.service;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="student")
public class Students {
	 int rno;
	 String name;
	 String branch;
	 int age;
public Students(){
	
	
}
		public Students(int rno, String name, String branch, int age) {
			
			this.rno = rno;
			this.name = name;
			this.branch = branch;
			this.age = age;
		}
		
	 
	 
	public int getRno() {
		return rno;
	}

	public void setRno(int rno) {
		this.rno = rno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String toString() {
		return rno + " "  + name + " " +branch +" " +age;
	}
}
