package Question2;
import java.util.Scanner;

public class Q2 implements Measurable {
	private String name;
	private double height;
	
	public Q2(double height,String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.height = height;
	}
	
	public double getMeasure()
	{
		return this.height;
	}
	
	
	
}
