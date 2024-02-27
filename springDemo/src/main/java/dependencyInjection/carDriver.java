package dependencyInjection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class carDriver 
{
	public static void main(String[] args) 
	{
		ClassPathResource cpr = new ClassPathResource("dependency.xml");
		BeanFactory bf = new XmlBeanFactory(cpr);
		Car car =(Car) bf.getBean("myCar");
		car.details();
		
		Engine engine = car.getEngine();
		engine.start();
	}

}
