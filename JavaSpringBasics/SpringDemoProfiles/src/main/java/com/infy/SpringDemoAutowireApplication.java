package com.infy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.infy.service.DeptService;
import com.infy.service.DeptService2;
 

@SpringBootApplication
public class SpringDemoAutowireApplication {

	public static void main(String[] args) {
	ApplicationContext ac=SpringApplication.run(SpringDemoAutowireApplication.class, args);
 DeptService dc=(DeptService) ac.getBean("deptService");
 DeptService2 dc2=(DeptService2) ac.getBean("deptService2");
 System.out.println(ac.getEnvironment().getProperty("myapp.name"));
 System.out.println(ac.getEnvironment().getProperty("myapp.state"));
 
 dc.addDepartment();
 dc2.addDepartment();
 
}}
