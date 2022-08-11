package com.infy.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component()
@Scope("prototype")
public class EmployeeService {
	
	 
	

int empno;
String empname;
 

public void addEmployee(int empno,String name)
{   
	System.out.println("Added emp"+empno+name);
	
}


	
}
