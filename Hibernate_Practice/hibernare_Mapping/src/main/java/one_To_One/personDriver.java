package one_To_One;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class personDriver 
{

	public static void main(String[] args)
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jeevan");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Person p = new Person();
		p.setId(1);
		p.setName("Jeevan");
		p.setAge(23);
		
		Pan p1=new Pan();
		p1.setId(1);
		p1.setPanNo("ABC1234");
		p1.setAddress("SATARA");
		
		p.setP(p1);
		p1.setPerson(p);
		
		et.begin();
		em.persist(p);
		em.persist(p1);
		et.commit();
		
		System.out.println("Successfully Added");
	}

}
