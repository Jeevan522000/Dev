package setterInjection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class companyDriver 
{
	public static void main(String[] args) 
	{
		ClassPathResource cpr = new ClassPathResource("setter.xml");
		BeanFactory bf = new XmlBeanFactory(cpr);
		company c =(company) bf.getBean("myCompany");
		c.getDetails();
	}

}
