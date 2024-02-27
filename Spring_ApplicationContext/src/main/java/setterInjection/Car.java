package setterInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Car 
{
	private int id;
	private String brand;
	private String model;
	private int mileage;
	private Engine engine;
	
	
	public int getId() {
		return id;
	}
	
	@Value("1")
	public void setId(int id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	
	@Value("KIA")
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	
	@Value("SONET")
	public void setModel(String model) {
		this.model = model;
	}
	public int getMileage() {
		return mileage;
	}
	
	@Value("20")
	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
	

	public Engine getEngine() {
		return engine;
	}
	
	@Autowired    //Used to achieve automatic dependency injection
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	
}
