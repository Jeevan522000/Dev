package one_To_One;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class mobileDriver 
{
	public static void main(String[] args) 
	{
	  EntityManagerFactory emf = Persistence.createEntityManagerFactory("jeevan");
	  EntityManager em= emf.createEntityManager();
	  EntityTransaction et = em.getTransaction();
	  
	  Mobile mobile = new Mobile();
	  mobile.setId(1);
	  mobile.setBrand("Redmi");
	  mobile.setPrice(14999);
	  
	  Battery battery = new Battery();
	  battery.setId(1);
	  battery.setBrand("lion");
	  battery.setMah(6000);
	  
	  mobile.setBattery(battery);
	  battery.setMobile(mobile);
	  
	  et.begin();
	  em.persist(mobile);
	  em.persist(battery);
	  et.commit();
	  
	  System.out.println("Mobile details Added");
	}
}
