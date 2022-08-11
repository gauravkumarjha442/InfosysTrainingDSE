package com.infy.cient;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.infy.bl.CustomerService;
import com.infy.bl.OrderService;
import com.infy.bl.OrderService2;

@Configuration//approach-1
public class MyConfiguration {
    @Bean
    @Scope("prototype")
	CustomerService m1() {
		
		return new CustomerService();
	}
    
    
    @Bean
   	OrderService m2() {
   		
   		return new OrderService();
   	}
    
    @Bean
   	OrderService2 m3() {
   		
   		return new OrderService2();
   	}
	
}
