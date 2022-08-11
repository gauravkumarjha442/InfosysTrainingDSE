package com.infy.bl;

import org.springframework.stereotype.Service;
 
@Service()
public class OrderService2 implements OrderServiceIntf {

	
	public void addOrder()
	{
		System.out.println("Adding Order--2");
		
	}
	
	public void deleteOrder()
	{
		System.out.println("Deleting Order--2");
		
	}
	
	public void printOrder()
	{
		System.out.println("Printing Order--2");
		
	}
	
}
