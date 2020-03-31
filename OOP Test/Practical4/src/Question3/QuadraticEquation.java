package Question3;

public class QuadraticEquation {
	private double a; //coefficient a
	private double b; //coefficient b
	private double c; //coefficient c
	
	public QuadraticEquation(double a,double b,double c)
	{
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public double getSolution1()
	{
		return (-this.b + Math.sqrt(Math.abs(Math.pow(this.b,2)-(4*this.a*this.c)))) / 2*this.a; //result of posive side
		
	}
	
	public double getSolution2()
	{
		return (-this.b - Math.sqrt(Math.abs(Math.pow(this.b,2)-(4*this.a*this.c)))) / 2*this.a; //result of negative side
	}
}
