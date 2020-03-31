package Question6;

public class Patient {

	String ID;
	String name;
	String number;
	
	public Patient()
	{
		this.ID = "0000"; //initialize
		this.name = "NULL"; //initialize
		this.number = "9999"; //initialize
	}
	
	public Patient(String ID,String name,String number)
	{
		this.ID = ID; //input id
		this.name = name; //input name
		this.number = number; //input number
	}
	
	public String toString()
	{
		
		return ""+ID+"\n"+name+"\n"+number; //return all total information
		
	}
	
	
	
	
}
