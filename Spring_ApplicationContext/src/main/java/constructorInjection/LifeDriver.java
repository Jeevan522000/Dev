package constructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LifeDriver 
{
	public static void main(String[] args) 
	{
	  ApplicationContext ac = new AnnotationConfigApplicationContext(configurationDemo.class);
	  Life life = (Life) ac.getBean("life");
	  
	  Problems problems = life.problems;
	  problems.problem();
	  
	  System.out.println(life.id);
	  System.out.println(life.alive);
	  
	}

}
