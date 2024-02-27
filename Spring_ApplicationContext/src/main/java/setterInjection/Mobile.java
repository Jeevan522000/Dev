package setterInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Mobile 
{
	private int id;
	private String brand;
	private String model;
	private double price;
	private Sim sim;
	
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
	@Value("Redmi")
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	@Value("Note 10")
	public void setModel(String model) {
		this.model = model;
	}
	public double getPrice() {
		return price;
	}
	@Value("15000")
	public void setPrice(double price) {
		this.price = price;
	}
	public Sim getSim() {
		return sim;
	}
	@Autowired
	public void setSim(Sim sim) {
		this.sim = sim;
	}
	
}
