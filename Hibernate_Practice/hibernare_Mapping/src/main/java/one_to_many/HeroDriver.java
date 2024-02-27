package one_to_many;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class HeroDriver 
{
	public static void main(String[] args) 
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jeevan");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Hero hero1 = new Hero();
		hero1.setId(1);
		hero1.setName("Allu Arjun");
		hero1.setAge(45);
		
		Movie movie1 = new Movie();
		movie1.setId(1);
		movie1.setName("Pushpa - The Rise");
		movie1.setCollection(200);
		
		Movie movie2 = new Movie();
		movie2.setId(2);
		movie2.setName("Ala Vaikunthpuramalo");
		movie2.setCollection(150);
		
		Movie movie3 = new Movie();
		movie2.setId(3);
		movie2.setName("DJ");
		movie2.setCollection(130);
		
		List <Movie> movies1 = new ArrayList<Movie>();
		movies1.add(movie1);
		movies1.add(movie2);
		movies1.add(movie3);
		
		hero1.setMovies(movies1);
		
		Hero hero2 = new Hero();
		hero2.setId(2);
		hero2.setName("Vijay");
		hero2.setAge(50);
		
		Movie movie4 = new Movie();
		movie4.setId(4);
		movie4.setName("Beast");
		movie4.setCollection(100);
		
		Movie movie5 = new Movie();
		movie5.setId(5);
		movie5.setName("Varisu");
		movie5.setCollection(150);
		
		Movie movie6 = new Movie();
		movie6.setId(6);
		movie6.setName("Leo");
		movie6.setCollection(300);
		
		List <Movie> movies2 = new ArrayList <Movie>();
		movies2.add(movie4);
		movies2.add(movie5);
		movies2.add(movie6);
		
		hero2.setMovies(movies2);
		
		et.begin();
		em.persist(hero1);
		em.persist(movie1);
		em.persist(movie2);
		em.persist(movie3);
		em.persist(hero2);
		em.persist(movie4);
		em.persist(movie5);
		em.persist(movie6);
		et.commit();
	}

}
