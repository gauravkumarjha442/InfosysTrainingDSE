package com.infy.bl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import java.sql.*;
 
public class CustomerService {
	 
	int age;
	String name;
	
	
 
	 
	public CustomerService(int age, String name) {
		super();
		System.out.println("In param const");
		this.age = age;
		this.name = name;
	}

	public CustomerService() {
		super();
		System.out.println("In default const");
		 
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void addCustomer() throws SQLException
	{
		 
		
		
		
	}
	
	public void deleteCustomer()
	{
		 
		System.out.println("Deleting Customer");
		
	}
	
	public void printCustomer()
	{    
		System.out.println("Printing Customer");
		
	}

	@Override
	public String toString() {
		return "CustomerService [age=" + age + ", name=" + name + "]";
	}
	
}
