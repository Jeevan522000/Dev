package setterInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class companyDriver 
{
	public static void main(String[] args) 
	{
		ApplicationContext ac = new ClassPathXmlApplicationContext("core.xml");
		Company company = (Company)ac.getBean("company");
		
		System.out.println(company.getId());
		System.out.println(company.getName());
		System.out.println(company.getNoOfEmp());
	}
}
