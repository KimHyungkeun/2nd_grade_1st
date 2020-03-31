package Question2;
import java.util.Scanner;

class BMI // Calculate BMI
{
	private double height;
	private double weight;
	
	public BMI(double height,double weight) // constructor
	{
		this.height = height;
		this.weight = weight;
	}
	
	public void weightInKilograms(double weight) //weight in kilogram
	{
		this.weight = weight;
	}
	
	public void heightInMeters(double height) //height in meter
	{
		this.height = height;
	}
	
	public double result() // return about BMI
	{
		return this.weight/(Math.pow(this.height, 2));
	}
}


