package com.infy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Profile("dev") 
public class DeptService2 {
int deptid;
String name;
 
public void addDepartment()
{
	System.out.println("Dept added----1--DeptService2");
} 
 
 

}
