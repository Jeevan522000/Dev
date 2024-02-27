package constructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class bikeDriver 
{
	public static void main(String[] args) 
	{
	  ApplicationContext ac = new AnnotationConfigApplicationContext(configurationDemo.class);
	  Bike bike = (Bike) ac.getBean("bike");
	  
	}

}
