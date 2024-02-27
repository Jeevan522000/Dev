package one_To_One;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class fetchCar 
{
	public static void main(String[] args) 
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jeevan");
		EntityManager em = emf.createEntityManager();
		
		Car car = em.find(Car.class, 1);
		System.out.println("Car Id : "+car.getId());
		System.out.println("Car Brand : "+car.getBrand());
		System.out.println("Car Price : "+car.getPrice());
		
		System.err.println("----------------------------");
		Engine engine = car.getEngine();
		System.out.println("Engine Id : "+engine.getId());
		System.out.println("Engine CC : "+engine.getCc());
		System.out.println("Engine RPM : "+engine.getRpm()+" RPM");
	}

}
