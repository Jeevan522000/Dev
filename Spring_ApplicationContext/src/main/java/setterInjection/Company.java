package setterInjection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Company 
{
	private int id;
	private String name;
	private int noOfEmp;
	
	
	public int getId() 
	{
		return id;
	}
	@Value("1")
	public void setId(int id) 
	{
		this.id = id;
	}
	public String getName() 
	{
		return name;
	}
	@Value("TCS")
	public void setName(String name) 
	{
		this.name = name;
	}
	public int getNoOfEmp() 
	{
		return noOfEmp;
	}
	@Value("100000")
	public void setNoOfEmp(int noOfEmp) 
	{
		this.noOfEmp = noOfEmp;
	}
	
	
}
