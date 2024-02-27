package hibernateFramework;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class studentClass 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jeevan");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Scanner sc = new Scanner(System.in);
		for(;;)
		{
			System.out.println("Select choice");
			System.out.println("1.Insert Data 2.Fetch Data 3.Update Data 4.Remove Data 5.Exit");
			switch (sc.nextInt()) 
			{
			case 1:
			{
				
					student s = new student();
					System.out.println("Enter Id of student");
					s.setId(sc.nextInt());
					System.out.println("Enter Name of student");
					s.setName(sc.next());
					System.out.println("Enter age of student");
					s.setAge(sc.nextInt());
					
					et.begin();
					em.persist(s);
					et.commit();
      				System.out.println("Student data  Added");
			}
				break;

			case 2:
			{
				System.out.println("Enter Id");
				int id =sc.nextInt();
				student s = em.find(student.class, id);
				
				System.out.println(s.getId());
		        System.out.println(s.getName());
		        System.out.println(s.getAge());
			}
				break;
				
			case 3:
			{
				student s = new student();
				System.out.println("Enter Id of student");
				s.setId(sc.nextInt());
				System.out.println("Enter Name of student");
				s.setName(sc.next());
				System.out.println("Enter age of student");
				s.setAge(sc.nextInt());
				
				et.begin();
				em.merge(s);
				et.commit();
  				System.out.println("Student data  updated");
  				
			}
			break;
				
			case 4:
			{
				System.out.println("Enter Id to delete ");
				student s= em.find(student.class, sc.nextInt());
				et.begin();
				em.remove(s);
				et.commit();
				
				System.out.println("Student data deleted");
			}
				break;
				
			case 5:
				System.err.println("Application closed");
				System.exit(0);
			}
		}
	}
}
