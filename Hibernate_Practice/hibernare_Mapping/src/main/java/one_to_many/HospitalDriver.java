package one_to_many;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class HospitalDriver 
{
	public static void main(String[] args) 
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jeevan");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Hospital hospital = new Hospital();
		hospital.setId(1);
		hospital.setName("Apollo");
		hospital.setCountry("India");
		
		Branch branch1 = new Branch();
		branch1.setId(1);
		branch1.setName("Deccan");
		branch1.setPincode(123456);
		
		Branch branch2 = new Branch();
		branch2.setId(2);
		branch2.setName("Pune Station");
		branch2.setPincode(456789);
		
		Branch branch3 = new Branch();
		branch3.setId(3);
		branch3.setName("Hadapsar");
		branch3.setPincode(123789);
		
		List <Branch> branches = new ArrayList<Branch>();
		branches.add(branch1);
		branches.add(branch2);
		branches.add(branch3);
		
		hospital.setBranches(branches);
		
		et.begin();
		em.persist(hospital);
		em.persist(branch1);
		em.persist(branch2);
		em.persist(branch3);
		et.commit();
		
	}

}
