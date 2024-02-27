package setterInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class carDriver 
{
	public static void main(String[] args) 
	{
		ApplicationContext ac = new ClassPathXmlApplicationContext("core.xml");
		Car car = (Car)ac.getBean("car");
		
		Engine engine = car.getEngine();
		
		System.out.println(car.getId());
		System.out.println(car.getBrand());
		System.out.println(car.getModel());
		System.out.println(car.getMileage());
		
		engine.start();
		
	}

}
