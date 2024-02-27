package setterInjection;

public class company 
{
   private int id;
   private String name;
   private int noE;
   private double turnOver;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getNoE() {
	return noE;
}
public void setNoE(int noE) {
	this.noE = noE;
}
public double getTurnOver() {
	return turnOver;
}
public void setTurnOver(double turnOver) {
	this.turnOver = turnOver;
}
   public void getDetails()
   {
	   System.out.println(id);
	   System.out.println(name);
	   System.out.println(noE);
	   System.out.println(turnOver);
   }
   
}
