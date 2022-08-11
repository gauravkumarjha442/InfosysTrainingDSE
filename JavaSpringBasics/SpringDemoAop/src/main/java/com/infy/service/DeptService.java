package com.infy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
public class DeptService {
int deptid;
String name;
 
public void addDepartment()
{
	System.out.println("Dept added----1");
} 
//Target object-target method
public void deletDepartment(int deptid)
{
	if(deptid<1000)
		throw new NullPointerException("sorry no such dept"+deptid);
	System.out.println("Dept delete----1"+deptid);
}

public String print(String str)
{
	return str+"Rekha";
}

}
