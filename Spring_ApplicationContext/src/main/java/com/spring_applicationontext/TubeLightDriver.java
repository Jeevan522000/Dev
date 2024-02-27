package com.spring_applicationontext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TubeLightDriver 
{
	public static void main(String[] args) 
	{
		ApplicationContext ac= new ClassPathXmlApplicationContext("core.xml");
		TubeLight tubelight= (TubeLight) ac.getBean("tubeLight");
		tubelight.work();
	}
}
