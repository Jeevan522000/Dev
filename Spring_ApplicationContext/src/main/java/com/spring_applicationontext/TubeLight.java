package com.spring_applicationontext;

import org.springframework.stereotype.Component;

@Component
public class TubeLight
{
	public TubeLight()
	{
		System.out.println("Constructor is Invoked and Object is Created");
	}
	
	public void work()
	{
		System.out.println("Tubelight is working properly");
	}
}
