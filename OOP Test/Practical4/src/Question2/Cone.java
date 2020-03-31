package Question2;

public class Cone {
	private double radius; // radius
	private double height; //height

	public Cone(double radius,double height)
	{
		this.radius = radius;
		this.height = height;
	}
	
	public double getSurfaceArea()
	{
		double save1 = 0.0; //save1 to input data
		double save2 = 0.0; //save2 to input data
		save1 = Math.PI * Math.pow(this.radius, 2); //PI * pow(radius,2)
	    save2 = Math.PI * this.radius * Math.sqrt(Math.pow(this.radius, 2)+Math.pow(this.height,2)); //PI * radius * l
	    return save1 + save2; //return SurfaceArea of Cone
	}
	
	public double getVolume()
	{
		return (Math.PI * Math.pow(this.radius, 2) * this.height) / 3; //return Volume of Cone
	}
}
