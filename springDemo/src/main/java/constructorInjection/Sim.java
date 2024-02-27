package constructorInjection;

public class Sim 
{
	int id;
	String network;
	String type;
	
	
	
	public Sim(int id, String network, String type) {
		super();
		this.id = id;
		this.network = network;
		this.type = type;
	}



	public void simDetails()
	{
		System.out.println("Sim Id : " +id);
		System.out.println("Sim Network : "+network);
		System.out.println("Sim Type : "+type);
	}
}
