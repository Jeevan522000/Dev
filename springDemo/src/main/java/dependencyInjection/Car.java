package dependencyInjection;

public class Car 
{
	int id;
	String brand;
	double price;
	Engine engine;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	public void details()
	{
		System.out.println(id);
		System.out.println(brand);
		System.out.println(price);
//		System.out.println(engine);
	}
	
}
