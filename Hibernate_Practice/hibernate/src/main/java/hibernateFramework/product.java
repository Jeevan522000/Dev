package hibernateFramework;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="products")
public class product 
{
  @Id
  private int id;
  private String brand;
  private String warranty;
  private double price;
  
  public int getId()
  {
	  return id;
  }
  public void setId(int id)
  {
	  this.id=id;
  }
  public String getBrand()
  {
	  return brand;
  }
  public void setBrand(String brand)
  {
	  this.brand=brand;
  }
  public String getWarranty()
  {
	  return warranty;
  }
  public void setWarranty(String warranty)
  {
	  this.warranty=warranty;
  }
  public double getPrice()
  {
	  return price;
  }
  public void setPrice(double price)
  {
	  this.price=price;
  }
  
  @Override
	public String toString()
    {
	   return "[ id = "+id+" , Brand = "+brand+" , Warranty = "+warranty+" , Price = "+price+"]";
	}
}
