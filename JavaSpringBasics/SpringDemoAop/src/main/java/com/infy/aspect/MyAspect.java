package com.infy.aspect;

 
import org.aspectj.lang.*;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.infy.service.EmployeeService;
@Component
@Aspect
public class MyAspect {
 
	
	/*@Before("execution (* com.infy.service.*.*(..))")
	public void logmethod(JoinPoint jp)
	{
		System.out.println("******************");
	}
	@After("execution (* com.infy.service.*.*(..))")
	public void logmethod2(JoinPoint jp)
	{
		System.out.println("******************");
	}*/
	
	@Around("execution (* com.infy.service.*.*(..))")
	public  Object arounddemo(ProceedingJoinPoint pjp) throws Throwable
	{
		System.out.println("*************");
		Object [] args=pjp.getArgs();
		args[0]=(String)args[0]+",";
		 
		String str=(String) pjp.proceed(args);
		
		return str+"!";
	}
	
	
	
	/*
	@AfterReturning("execution (* com.infy.service.*.*(..))")
	public void logmethod3(JoinPoint jp)
	{
		System.out.println("Will get applied after Returning successful the method"+jp);
	}
	
	@AfterThrowing(pointcut="execution (* com.infy.service.*.*(..))",throwing="ex")
	public void logmethod4(JoinPoint jp,Throwable ex)
	{
		System.out.println("Will get applied after Returning with exception in method"+jp);
		System.out.println("exception is" +ex.getMessage());
	}
	
	*/
	
}
