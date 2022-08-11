package com.infy.cient;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.infy.bl.CustomerService;

public class Client {
public static void main(String args[]) throws SQLException
{
	ApplicationContext ac= new AnnotationConfigApplicationContext(MyConfiguration.class);
	CustomerService cs=(CustomerService) ac.getBean("m1");
	cs.addCustomer();
	cs.deleteCustomer();
	
	
}
}
