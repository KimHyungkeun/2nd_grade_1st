package Question7;

import java.util.Scanner;

public class Student {
	public String[] student;
	public double[] score;
	
	public Student() {
		// TODO Auto-generated constructor stub
		student = new String[5];
	}
	
	public String getStudentName()
	{
		String name;
		Scanner in = new Scanner(System.in); 
		name = in.nextLine(); //input name
		return name; //return name
	}
	
	public double GPA()
	{
		double GPA;
		Scanner in = new Scanner(System.in);
		GPA = in.nextDouble(); //input score
		return GPA; //return score
	}

}
