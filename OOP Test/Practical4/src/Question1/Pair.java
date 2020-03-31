package Question1;

public class Pair {

	private double aFirst; //aFirst the first value of the pair
	private double aSecond; //aSecond the second value of the pair
	
	public Pair(double aFirst,double aSecond)
	{
		this.aFirst = aFirst;
		this.aSecond = aSecond;
	}
	
	public double getSum() 
	{
		return this.aFirst + this.aSecond; //return result of sum
	}
	
	public double getDifference()
	{
		return this.aFirst - this.aSecond; //return result of difference
	}
	
	public double getAverage()
	{
		return (this.aFirst + this.aSecond)/2; //return result of average
	}
	
	public double getMultiplication()
	{
		return this.aFirst * this.aSecond; //return result of multiplication
	}
	

}
