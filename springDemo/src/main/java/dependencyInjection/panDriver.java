package dependencyInjection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class panDriver 
{
	public static void main(String[] args) 
	{
		ClassPathResource cpr = new ClassPathResource("dependency.xml");
		BeanFactory bf = new XmlBeanFactory(cpr);
		
		Person person = (Person)bf.getBean("myPerson");
		
		System.out.println("Person Id : "+person.getId());
		System.out.println("Person Name : "+person.getName());
		System.out.println("Person Age : "+person.getAge());
		
		Pan pan = person.getPan();
		pan.generate();
		
		
	}

}
