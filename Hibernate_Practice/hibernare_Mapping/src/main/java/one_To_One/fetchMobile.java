package one_To_One;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class fetchMobile 
{
	public static void main(String[] args) 
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jeevan");
		EntityManager em = emf.createEntityManager();
		
		//uni-directional
		Mobile mobile = em.find(Mobile.class, 1);
		System.out.println("Mobile Id = "+ mobile.getId());
		System.out.println("Mobile Brand = "+ mobile.getBrand());
		System.out.println("Mobile Price = "+ mobile.getPrice());
		
		System.err.println("-----------------------------------------------");
		
		Battery battery = mobile.getBattery();
		System.out.println("Battery Id = "+ battery.getId());
		System.out.println("Battery Brand = "+ battery.getBrand());
		System.out.println("Battery Id = "+ battery.getMah());
	}

}
