package one_To_One;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class carDriver 
{
	public static void main(String[] args) 
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jeevan");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Car car = new Car();
		car.setId(2);
		car.setBrand("Sonet");
		car.setPrice(800000);
		
		Engine engine = new Engine();
		engine.setId(2);
		engine.setCc(1500);
		engine.setRpm(1700);
		
		car.setEngine(engine);
		engine.setCar(car);
		
		et.begin();
		em.persist(car);
		em.persist(engine);
		et.commit();
		
		System.err.println("Car Added");
	}

}
