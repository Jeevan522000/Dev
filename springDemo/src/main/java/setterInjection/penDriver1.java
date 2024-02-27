package setterInjection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class penDriver1 
{
	public static void main(String[] args)
	{
		ClassPathResource cpr = new ClassPathResource("core.xml");
		BeanFactory bf = new XmlBeanFactory(cpr);
		Pen1 p=(Pen1)bf.getBean("myPen1");
		
		System.out.println(p.getId());
		System.out.println(p.getBrand());
		System.out.println(p.getPrice());
	}	
}
