package project;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class hDriver 
{
	public static void main(String[] args) 
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jeevan");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Scanner sc = new Scanner(System.in);
		
		Hospital hospital = new Hospital();
		System.out.println("Enter Hospital Id");
		hospital.setId(sc.nextInt());
		System.out.println("Enter Hospital Name");
		hospital.setName(sc.next());
		System.out.println("Enter Hospital Dean Name");
		hospital.setDean(sc.next());
		
		Branch branch = new Branch();
		System.out.println("Enter Branch Id");
		branch.setId(sc.nextInt());
		System.out.println("Enter Branch Name");
		branch.setName(sc.next());
		System.out.println("Enter Branch Manager Name");
		branch.setManager(sc.next());
		
//		Branch branch1 = new Branch();
//		System.out.println("Enter Branch Id");
//		branch1.setId(sc.nextInt());
//		System.out.println("Enter Branch Name");
//		branch1.setName(sc.next());
//		System.out.println("Enter Branch Manager Name");
//		branch1.setManager(sc.next());
//		
//		Branch branch2 = new Branch();
//		System.out.println("Enter Branch Id");
//		branch2.setId(sc.nextInt());
//		System.out.println("Enter Branch Name");
//		branch2.setName(sc.next());
//		System.out.println("Enter Branch Manager Name");
//		branch2.setManager(sc.next());
		
		List <Branch>branches=new ArrayList<Branch>();
		branches.add(branch);
//		branches.add(branch1);
//		branches.add(branch2);
		
		hospital.setBranch(branches);
	
		
		//********************************************************************************************************
		//********************************************************************************************************
	
		Address address = new Address();
		System.out.println("Enter Address Id");
		address.setId(sc.nextInt());
		System.out.println("Enter Location");
		address.setLocation(sc.next());
		System.out.println("Enter Landmark");
		address.setLandmark(sc.next());
		System.out.println("Enter Pincode");
		address.setPincode(sc.nextInt());
		
		
		Patient patient = new Patient();
		System.out.println("Enter Patient Id");
		patient.setId(sc.nextInt());
		System.out.println("Enter Parient Name");
		patient.setName(sc.next());
		System.out.println("Enter Parient Age");
		patient.setAge(sc.nextInt());
		System.out.println("Enter Parient Gender");
		patient.setGender(sc.next());
		System.out.println("Enter Parient Blood Group");
		patient.setBloodGroup(sc.next());
		
//		Patient patient1 = new Patient();
//		System.out.println("Enter Patient Name");
//		patient1.setId(sc.nextInt());
//		System.out.println("Enter Parient Name");
//		patient1.setName(sc.next());
//		System.out.println("Enter Parient Age");
//		patient1.setAge(sc.nextInt());
//		System.out.println("Enter Parient Gender");
//		patient1.setGender(sc.next());
//		System.out.println("Enter Parient Blood Group");
//		patient1.setBloodGroup(sc.next());
//		
//		Patient patient2 = new Patient();
//		System.out.println("Enter Patient Name");
//		patient2.setId(sc.nextInt());
//		System.out.println("Enter Parient Name");
//		patient2.setName(sc.next());
//		System.out.println("Enter Parient Age");
//		patient2.setAge(sc.nextInt());
//		System.out.println("Enter Parient Gender");
//		patient2.setGender(sc.next());
//		System.out.println("Enter Parient Blood Group");
//		patient2.setBloodGroup(sc.next());
		
		List <Patient> patients = new ArrayList<Patient>();
		patients.add(patient);
//		patients.add(patient1);
//		patients.add(patient2);
		
		branch.setPatient(patients);
		
		//********************************************************************************************************
		//********************************************************************************************************
		
		Encounter encounter = new Encounter();
		System.out.println("Enter Encounter Id");
		encounter.setId(sc.nextInt());
		System.out.println("Enter Patient Name");
		encounter.setName(sc.next());
		System.out.println("Enter Encounter Date");
		encounter.setDate(sc.next());
		
//		Encounter encounter1 = new Encounter();
//		System.out.println("Enter Encounter Id");
//		encounter1.setId(sc.nextInt());
//		System.out.println("Enter Patient Name");
//		encounter1.setName(sc.next());
//		System.out.println("Enter Encounter Date");
//		encounter1.setDate(sc.next());
//		
//		Encounter encounter2 = new Encounter();
//		System.out.println("Enter Encounter Id");
//		encounter2.setId(sc.nextInt());
//		System.out.println("Enter Patient Name");
//		encounter2.setName(sc.next());
//		System.out.println("Enter Encounter Date");
//		encounter2.setDate(sc.next());
		
		List <Encounter> encounters= new ArrayList<Encounter>();
		encounters.add(encounter);
//		encounters.add(encounter1);
//		encounters.add(encounter1);
		
		patient.setEncounter(encounters);
		
		//********************************************************************************************************
		//********************************************************************************************************
		
		Disease disease = new Disease();
		System.out.println("Enter Disease Id");
		disease.setId(sc.nextInt());
		System.out.println("Enter Disease Name");
		disease.setDisease(sc.next());
		System.out.println("Enter Disease Symptoms");
		disease.setSymptoms(sc.next());
		
//		Disease disease1 = new Disease();
//		System.out.println("Enter Disease Id");
//		disease1.setId(sc.nextInt());
//		System.out.println("Enter Disease Name");
//		disease1.setDisease(sc.next());
//		System.out.println("Enter Disease Symptoms");
//		disease1.setSymptoms(sc.next());
//		
//		Disease disease2 = new Disease();
//		System.out.println("Enter Disease Id");
//		disease2.setId(sc.nextInt());
//		System.out.println("Enter Disease Name");
//		disease2.setDisease(sc.next());
//		System.out.println("Enter Disease Symptoms");
//		disease2.setSymptoms(sc.next());
		
		List <Disease> diseases = new ArrayList<Disease>();
		diseases.add(disease);
//		diseases.add(disease1);
//		diseases.add(disease2);
		
		patient.setDisease(diseases);
		
		//********************************************************************************************************
		//********************************************************************************************************
		
		
		et.begin();
		em.persist(hospital);
		em.persist(branch);
		em.persist(address);
		em.persist(patient);
		em.persist(encounter);
		em.persist(disease);
		et.commit();
		
	}

}
