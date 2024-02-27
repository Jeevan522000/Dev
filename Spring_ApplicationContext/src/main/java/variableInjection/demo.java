package variableInjection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class demo 
{
	@Value("1")
	int id;
	@Value("Jeevan")
	String name;
	@Value("23")
	int age;
}
