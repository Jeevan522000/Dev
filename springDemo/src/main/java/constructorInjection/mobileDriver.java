package constructorInjection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class mobileDriver 
{
	public static void main(String[] args) 
	{
		ClassPathResource cpr = new ClassPathResource("constructor.xml");
		BeanFactory bf = new XmlBeanFactory(cpr);
		Mobile mobile=(Mobile)bf.getBean("myMobile");
	    System.out.println("Mobile Id : "+mobile.id);
	    System.out.println("Mobile Brand : "+mobile.brand);
	    System.out.println("Mobile Model : "+mobile.model);
	    System.out.println("Mobile Price : "+mobile.price);
	    
	    Sim sim = mobile.sim;
	    sim.simDetails();
	}

}
