package com.primary;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
//primary anotation is used to give priority for the classes to craete object
public class Vanilla implements IceCream
{
	public void eat()
	{
		System.out.println("Baby is eating Vannila IceCream");
	}
}
