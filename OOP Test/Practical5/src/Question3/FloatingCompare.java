package Question3;

public class FloatingCompare {
	float number1;
	float number2;
	float save;
	
	public FloatingCompare()
	{
		this.number1 = 0;
		this.number2 = 0;
		this.save = 0;
	}
	
	public void Round(float num1,float num2)
	{
		number1 = num1;
		number2 = num2;
		save = Math.abs(number1 - number2); //save differ of two number
		
		number1 = Math.round(number1 * 100); //save round number which has x100
		number1 = number1/100; //divide number
		
		number2 = Math.round(number2 * 100); //save round number which has x100
		number2 = number2/100; //divide number
	}
	
	public boolean differ()
	{
		if(save < 0.01) //if differ is less than 0.01
			return true;
		
		else
			return false; //if differ is larger than 0.01
	}
	
	public boolean result()
	{
		if(number1 == number2) //Compare rounded two numbers
			return true; //if two number is same, then return true
		
		else
			return false; //else, then return false
	}
	
	
}
