package Question6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Question6 {
	private String input; //input from User
	public Question6(String input) //constructor
	{
		this.input = input;
	}
	
	public String getString()
	{
		return this.input; //get input from user
	}
	
	public String capitalize() //change the first letter to Capital
	{
		  String save1;
		  String save2;
		  String change;
		  String save_sum = null;
		  int index = 0;
		  while(index < this.input.length())
		  {
			 this.input = this.input.substring(0,1).toUpperCase() + this.input.substring(1); //change the first letter to Capital
			  
			 if(this.input.charAt(index) == ' '){
				  save1 = this.input.substring(0,index+1); //string before next word
				  save2 = this.input.substring(index+1,index+2).toUpperCase() + this.input.substring(index+2); //string after word
				  save_sum = save1 + save2; //add two string
				  this.input = save_sum; //save string
				  
				  }
			  
			 ++index; // increase index
		  }
	      return this.input; 
	}

}
