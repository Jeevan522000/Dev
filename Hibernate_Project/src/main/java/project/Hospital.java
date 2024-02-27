package project;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Hospital 
{
	@Id
  private int id;
  private String name;
  private String dean;
  @OneToMany
  private List <Branch>branch =  new ArrayList <Branch>();
  
public Hospital() {
	super();
}
public Hospital(int id, String name, String dean, List<Branch> branch) {
	super();
	this.id = id;
	this.name = name;
	this.dean = dean;
	this.branch = branch;
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
public String getDean() {
	return dean;
}
public void setDean(String dean) {
	this.dean = dean;
}
public List<Branch> getBranch() {
	return branch;
}
public void setBranch(List<Branch> branch) {
	this.branch = branch;
}
  
  
}
