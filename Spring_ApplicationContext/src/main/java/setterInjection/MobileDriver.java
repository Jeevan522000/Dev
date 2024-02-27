package setterInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MobileDriver 
{
	public static void main(String[] args) 
	{
		ApplicationContext ac = new ClassPathXmlApplicationContext("core.xml");
		Mobile mobile = (Mobile)ac.getBean("mobile");
		
		Sim sim = mobile.getSim();
		
		System.out.println(mobile.getId());
		System.out.println(mobile.getBrand());
		System.out.println(mobile.getModel());
		System.out.println(mobile.getPrice());
		
		sim.activate();
	}

}
