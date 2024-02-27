package constructorInjection;

import org.springframework.stereotype.Component;

@Component
public class Bike 
{
	Bike()
	{
		System.out.println("constructor is loaded");
	}
}
