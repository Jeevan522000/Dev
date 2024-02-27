package com.primary;

import org.springframework.stereotype.Component;

@Component
public class Tractor implements Vehicle
{
	public void start()
	{
		System.out.println("Tractor is Started");
	}
}
