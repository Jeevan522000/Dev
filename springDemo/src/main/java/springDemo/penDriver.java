package springDemo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class penDriver 
{
	public static void main(String[] args) 
	{
		ClassPathResource cpr = new ClassPathResource("core.xml");
		BeanFactory bf = new XmlBeanFactory(cpr);
		pen p=(pen)bf.getBean("myPen");
		p.write();
		
//		pencil p1 = (pencil) bf.getBean("myPencil");
//		p1.write();
	}

}
