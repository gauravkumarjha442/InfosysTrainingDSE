package com.infy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.infy.bl.CustomerService;
import com.infy.bl.OrderService;
 

@Configuration
public class Config {
 
	@Bean
	public OrderService myorder()
	{
		return new OrderService();
	}
	
	@Bean//
	public CustomerService cs()
	{
		return new CustomerService(10,"ABC");
	}
		
	@Bean//Setter injection
	public CustomerService css()
	{
		CustomerService cs= new CustomerService();
		cs.setAge(20);
		cs.setName("niki");
		return cs;
	}
		
		
	}

