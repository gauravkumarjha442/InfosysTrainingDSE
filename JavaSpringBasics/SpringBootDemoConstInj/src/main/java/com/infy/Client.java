package com.infy;

import java.security.Provider.Service;
import java.sql.Connection;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.core.env.Environment;

import com.infy.bl.CustomerService;
import com.infy.bl.OrderService;

 
public class Client {
 
	
	public static void main(String[] args) throws SQLException {
ApplicationContext ac= new AnnotationConfigApplicationContext(Config.class);
 
CustomerService con=(CustomerService)  ac.getBean("css");
 System.out.println(con);



 

	
	
	
	
	}

}
