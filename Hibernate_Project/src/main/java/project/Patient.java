package project;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Patient 
{
 @Id
 private int id;
 private String name;
 private int age;
 private String gender;
 private String bloodGroup;
 @OneToMany
 private List <Encounter>encounter = new ArrayList<Encounter>();
 @ManyToMany
 private List<Disease> disease = new ArrayList<Disease>();
 
 public Patient()
 {
	 super();
 }
 
public Patient(int id, String name, int age, String gender, String bloodGroup) {
	super();
	this.id = id;
	this.name = name;
	this.age = age;
	this.gender = gender;
	this.bloodGroup = bloodGroup;
}
public List<Encounter> getEncounter() {
	return encounter;
}
public void setEncounter(List<Encounter> encounter) {
	this.encounter = encounter;
}
public int getId() {
	return id;
}
public List<Disease> getDisease() {
	return disease;
}
public void setDisease(List<Disease> disease) {
	this.disease = disease;
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
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getBloodGroup() {
	return bloodGroup;
}
public void setBloodGroup(String bloodGroup) {
	this.bloodGroup = bloodGroup;
}
 
 }
