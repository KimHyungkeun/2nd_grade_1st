class Change
{
	public Change()
	{
		
	}
	
	public static double celsiusToFahrenheit(double c)
	{
		final double MINIMUM_CELSIUS = -273.16;
		
		if(c < MINIMUM_CELSIUS)
			throw new IllegalArgumentException("Argument " + c + " is too small.");
		
		return (9.0/5.0)*c + 32;
	}
}


public class TemperatureConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final double TABLE_BEGIN = -50.0; //The table's first Celsius temperature
		final double TABLE_END   =  50.0; //The table's final Celsius temperature
		final double TABLE_STEP  =  10.0; //Increment between temperature in table
		
		double celsius;						//A Celsius temperature
		double fahrenheit;					//The equivalent Fahrenheit temperature
		
		System.out.println("TEMPERATURE CONVERSION");
		System.out.println("----------------------");
		System.out.println("Celsius     Fahrenheit");
		
		Change c1 = new Change();
		
		for(celsius = TABLE_BEGIN; celsius <= TABLE_END; celsius += TABLE_STEP)
		{
			fahrenheit = c1.celsiusToFahrenheit(celsius);
			System.out.printf("%6.2fC", celsius);
			System.out.printf("%14.2fF\n", fahrenheit);
		}
		System.out.println("----------------------");
		

	}

}
