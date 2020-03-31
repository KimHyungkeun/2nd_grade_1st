package Question1;
import java.util.Scanner;

class Volume //Save the result of Volume
{
	private double height; 
	private double length;
	private double area;
	
	public Volume(double height,double length) // constructor
	{
		this.height = height;
		this.length = length;
	}
	
	public double  getHeight(double height)
	{
		return this.height = height; //input height to Volume's height
	}
	
	public double getLength_of_side(double length) //input length to Volume's length
	{
		return this.length = length;
	}
	
	public double calculate_area() // calculate the area of the base
	{
		this.area = Math.pow(this.length, 2);
		return this.area;
		
	}
	
	public double result()
	{
		return (this.area * this.height)/3;
	}
}


