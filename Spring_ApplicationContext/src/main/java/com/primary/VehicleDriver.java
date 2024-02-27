package com.primary;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class VehicleDriver 
{
	public static void main(String[] args) 
	{
		ApplicationContext ac = new AnnotationConfigApplicationContext(configurable2.class);
		TractorDriver td = (TractorDriver) ac.getBean("tractorDriver");
		
		td.m1();
	}
}
