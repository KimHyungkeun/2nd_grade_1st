package Question3;
class Car
{
	private double fuel_level;
	private double distance;
	private double drive_distance;
	public Car(double distance) //constructor, distance(km) per liter
	{
		this.fuel_level = 0.0;
		this.distance = distance;
		this.drive_distance = 0.0;
	}
	
	public void addGas(double gas) //add gas
	{
		this.fuel_level += gas;
	}
	
	public void drive(double distance) //consume gas and drive
	{
		this.drive_distance = distance;
		this.fuel_level -= (this.drive_distance/this.distance);
	}
	
	public double getGasInTank() //remain amount of gas
	{
		return this.fuel_level;
	}
	
}

