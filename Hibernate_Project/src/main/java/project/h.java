package project;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class h 
{
   public static void main(String[] args) 
   {
	   EntityManagerFactory emf = Persistence.createEntityManagerFactory("jeevan");
	   EntityManager em = emf.createEntityManager();
	   EntityTransaction et = em.getTransaction();
	   
	   HospitalDriver hd = new HospitalDriver();
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Select option : ");
	   System.out.println("1.Add Hospital 2.Add Patient 3.Add Branch 4.Add Address 5.Add Disease 6.Add Encounter 7.exit");
	   int choice = sc.nextInt();
	   switch (choice) 
	   {
	   case 1: Object o=hd.addHospital();
	           if(o!=null)
	           { et.begin();
	             em.persist(o);
	             et.commit();
	           }
		   break;
	   case 2 : Object p = hd.addPatient();
	   }
   }
}
