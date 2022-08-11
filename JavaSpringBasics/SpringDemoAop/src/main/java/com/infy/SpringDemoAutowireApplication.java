package com.infy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.infy.service.DeptService;
import com.infy.service.EmployeeService;

@SpringBootApplication
public class SpringDemoAutowireApplication {

	public static void main(String[] args) {
	ApplicationContext ac=SpringApplication.run(SpringDemoAutowireApplication.class, args);
 DeptService dc=(DeptService) ac.getBean("deptService");
// dc.addDepartment();
 System.out.println(dc.print("Hello"));
 
}}
