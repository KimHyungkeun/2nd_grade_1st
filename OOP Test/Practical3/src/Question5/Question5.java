package Question5;
class Employee // Employee
{
	String name; //name
	String ID; //Id
	String number; //number
	public Employee(String name,String ID,String number) //Constructor
	{
		this.name = name;
		this.ID = ID;
		this.number = number;
	}
	
	public void getDetail() //prints the name,ID and Phone_Number
	{
		System.out.println("Name : "+name+"\n"+"ID : "+ID+"\n"+"Number : "+number+"\n");
	}
	
	public void change_number(String change) //change Phone_Number and prints getDetail
	{
		this.number = change;
	}
}


