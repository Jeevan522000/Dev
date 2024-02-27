package com.primary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Baby 
{
	@Autowired
	IceCream cream;
	
	public void m1()
	{
		cream.eat();
	}
}
