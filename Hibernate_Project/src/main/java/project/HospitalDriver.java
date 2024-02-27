package project;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HospitalDriver 
{
	HospitalDriver hsd = new HospitalDriver();
	Scanner sc = new Scanner(System.in);
	public Hospital addHospital()
	{
		Hospital h=new Hospital();
		System.out.println("Enter Hospital Id");
//		hospital.setId(sc.nextInt());
		int id = sc.nextInt();
		System.out.println("Enter Hospital Name");
		
//		hospital.setName(sc.next());
		String name = sc.next();
		if(name.equals(h.getName()) || id==h.getId())
		{
			System.out.println("Hospital is already present");
			return h;
		}
		else
		{
		System.out.println("Enter Hospital Dean Name");
//		hospital.setDean(sc.next());
		String Dname = sc.next();
		
		boolean choice = true;
		
			System.out.println("Enter Branches");
			String branch = sc.next();
			List b= new ArrayList();
			do
			{
			b.add(branch);
			h.setBranch(b);
			System.out.println("Any other branch available : 1.Yes  2.No");
			int br = sc.nextInt();
			if(br==2)
				choice=false;
			if(!choice)
			{
				break;
			}
		}
		while(choice);
		
		h = new Hospital(id,name,Dname, b);
		return h;
		}
	}
	
	public Patient addPatient()
	{
		Patient p = new Patient ();
		System.out.println("Enter Patient Id");
		int id = sc.nextInt();
		System.out.println("Enter Patient Name");
	    String name = sc.next();
		System.out.println("Enter Parient Age");
		int age = sc.nextInt();
		System.out.println("Enter Parient Gender");
		String gender = sc.next();
		System.out.println("Enter Parient Blood Group");
		String bg=sc.next();
		p=new Patient(id,name,age,gender,bg);
		return p;
	}
	
	public void addBranch()
	{
		
	}
	
	public void addAddress()
	{
		
	}
	
	public void addEncounter()
	{
		
	}
	
	public void addDisease()
	{
		
	}

}
