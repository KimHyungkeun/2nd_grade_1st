package Question5;
import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Integer;

public class Address {
	private String add;
	private String substring;
	private char[] temp;
	private int num;
	private int string_to_int;
	public Address() {
		// TODO Auto-generated constructor stub
		add = " ";
		num = 0;
	}
	
	public void change()
	{
		
		Scanner in = new Scanner(System.in);
		System.out.println("Input Address");
		add = in.nextLine(); //input address
		
		
		for(int i=0;i<add.length();++i)
		{
			if('0' <= add.charAt(i) && add.charAt(i) <= '9')
				num++; //if string has number, then add value of 'num'
			
			else
				continue;
		}
		
		temp = new char[num]; //create array (size is 'num')
		
		int j=0;
		for(int i=0;i<add.length();++i)
		{
			if('0' <= add.charAt(i) && add.charAt(i) <= '9')
				temp[j++] = add.charAt(i); //if string has number, input number to temp array
		}
		
		substring = String.valueOf(temp); //change temp to string
		string_to_int = Integer.parseInt(substring); //change string to integer
		
		System.out.println("Result : "+"$"+string_to_int);
		num = 0;
		
	}

}
