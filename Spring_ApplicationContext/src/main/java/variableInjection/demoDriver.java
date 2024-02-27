package variableInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class demoDriver 
{
	public static void main(String[] args) 
	{
		ApplicationContext ac = new AnnotationConfigApplicationContext(configurationDemo1.class);
        demo d = (demo) ac.getBean("demo");
        
        System.out.println(d.id);
        System.out.println(d.name);
        System.out.println(d.age);
	}

}
