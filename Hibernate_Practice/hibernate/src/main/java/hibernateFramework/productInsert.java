package hibernateFramework;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class productInsert 
{
  public static void main(String[] args)
  {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("jeevan");
    EntityManager em = emf.createEntityManager();
    EntityTransaction et = em.getTransaction();
    
    Scanner sc= new Scanner(System.in);
    product p = new product();
    System.out.println("Enter Product Id");
    p.setId(sc.nextInt());
    System.out.println("Enter Brand Name");
    p.setBrand(sc.next());
    System.out.println("Enter Warranty period");
    p.setWarranty(sc.next());
    System.out.println("Enter Product Price");
    p.setPrice(sc.nextDouble());
    
    et.begin();
    em.merge(p);
    et.commit();
    
    System.out.println("Data Updated");
  }
}
