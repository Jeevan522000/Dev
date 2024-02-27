package project;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Branch 
{
  @Id
  private int id;
  private String name;
  private String manager;
  @OneToOne
  private Address address;
  @OneToMany
  private List<Patient>patient = new ArrayList<Patient>();
public List<Patient> getPatient() {
	return patient;
}
public void setPatient(List<Patient> patient) {
	this.patient = patient;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getManager() {
	return manager;
}
public void setManager(String manager) {
	this.manager = manager;
}
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
  
  
}
