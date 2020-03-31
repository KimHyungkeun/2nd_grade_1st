package Question7;
import java.lang.Integer;

public class Secret_code {
	private int pin; //pin
	private int number1; //number1
    private int number2; //number2
	
	public Secret_code(int pin,int number1,int number2)
	{
		this.pin = pin;
		this.number1 = number1;
		this.number2 = number2;
	}
	
	public String getPin()
	{
		return Integer.toHexString(pin); //change pin number to hexadecimal
	}
	
	
    public String getNumber1()
	{
		return Integer.toHexString(number1); //change number1 to hexadecimal
	}
	
	public String getNumber2()
	{
		return Integer.toHexString(number2); //change number2 to hexadecimal
	}
}
