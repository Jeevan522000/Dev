package constructorInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Life 
{
	int id;
	boolean alive;
	Problems problems;
	
	public Life(@Value("1") int id,@Value("true") boolean alive,@Autowired Problems problems) 
	{
		super();
		this.id = id;
		this.alive = alive;
		this.problems = problems;
	}
	
	
}
