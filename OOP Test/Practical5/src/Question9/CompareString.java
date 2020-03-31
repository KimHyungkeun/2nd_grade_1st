package Question9;

public class CompareString {

	String []s1; //instance 1
	String []s2; //instance 2
	
	
	public CompareString()
	{
		this.s1 = ""; //initialize
		this.s2 = null; //initialize
	}
	
	public boolean Compare(String s1,String s2)
	{
		if(true == s1.equals(s2)) //If two String is same exactly
			return true; //return value is true
		
			
		else
		return false; //return value is false
	}
}
