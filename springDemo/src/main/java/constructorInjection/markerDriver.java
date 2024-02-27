package constructorInjection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class markerDriver 
{
	public static void main(String[] args) 
	{
		ClassPathResource cpr = new ClassPathResource("constructor.xml");
		BeanFactory bf = new XmlBeanFactory(cpr);
		Marker marker =(Marker) bf.getBean("myMarker");
		System.out.println(marker.id);
		System.out.println(marker.color);
		System.out.println(marker.price);
	}

}
