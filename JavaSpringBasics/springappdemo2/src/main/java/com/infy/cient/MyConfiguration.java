package com.infy.cient;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.infy.bl.CustomerService;
import com.infy.bl.OrderService;
import com.infy.bl.OrderService2;

@Configuration
@ComponentScan("com.infy.bl")
public class MyConfiguration {
  
	
}
