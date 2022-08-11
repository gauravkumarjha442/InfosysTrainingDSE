package com.infy.bl;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
 
 @Component
public class OrderService implements OrderServiceIntf {

	
	public void addOrder()
	{
		System.out.println("Adding Order");
		
	}
	
	public void deleteOrder()
	{
		System.out.println("Deleting Order");
		
	}
	
	public void printOrder()
	{
		System.out.println("Printing Order");
		
	}
	
}
