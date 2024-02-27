package constructorInjection;

public class Marker 
{
	int id;
	String color;
	double price;
	
	public Marker(int id, String color, double price) 
	{
		super();
		this.id = id;
		this.color = color;
		this.price = price;
	}
}
