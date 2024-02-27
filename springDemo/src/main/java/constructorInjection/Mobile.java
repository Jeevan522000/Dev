package constructorInjection;

public class Mobile 
{
  int id;
  String brand;
  String model;
  double price;
  Sim sim;
  
public Mobile(int id, String brand, String model, double price, Sim sim) 
{
	super();
	this.id = id;
	this.brand = brand;
	this.model = model;
	this.price = price;
	this.sim = sim;
}
  
  
}
