package one_To_One;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class fetchMobile1 
{
	public static void main(String[] args) 
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jeevan");
		EntityManager em = emf.createEntityManager();
		
		//bi-directional
		Battery battery = em.find(Battery.class, 1);
		System.out.println("Battery Id = "+ battery.getId());
		System.out.println("Battery Brand = "+ battery.getBrand());
		System.out.println("Battery Id = "+ battery.getMah());
		
		System.err.println("--------------------------------");
		
		
		Mobile mobile = battery.getMobile();
		System.out.println("Mobile Id = "+ mobile.getId());
		System.out.println("Mobile Brand = "+ mobile.getBrand());
		System.out.println("Mobile Price = "+ mobile.getPrice());
		
	}

}
