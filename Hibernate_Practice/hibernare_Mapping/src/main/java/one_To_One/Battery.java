package one_To_One;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Battery 
{
	@Id
  private int id;
  private String brand;
  private int mah;
  @OneToOne
  private Mobile mobile;
  
  
public Mobile getMobile() {
	return mobile;
}
public void setMobile(Mobile mobile) {
	this.mobile = mobile;
}
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
public int getMah() {
	return mah;
}
public void setMah(int mah) {
	this.mah = mah;
}
  
  
}
