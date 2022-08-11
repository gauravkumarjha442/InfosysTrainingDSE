package com.infy.bl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import java.sql.*;
 

public class CustomerService {
	
	@Autowired
	ApplicationContext ac;
	
	@Autowired
	 @Qualifier("myorder")
	
	OrderServiceIntf  os;//
	
	@Value("Rekha")
	public String str;
	@Value("10")
	public int x;
	@Value("Rekha Nair")
	public String myname;
	
	Connection con;
	 
	public void addCustomer() throws SQLException
	{
		//os.addOrder();
		 
		os.addOrder();
		System.out.println("Adding Customer");
		
		
		
	}
	
	public void deleteCustomer()
	{
		os.deleteOrder();
		System.out.println("Deleting Customer");
		
	}
	
	public void printCustomer()
	{   os.printOrder();
		System.out.println("Printing Customer");
		
	}
	
}
