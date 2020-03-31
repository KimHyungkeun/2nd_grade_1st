package Question7;

public class LeapYear {
	private int year;
	boolean result;
	
	public LeapYear()
	{
		
		this.result = true; //initialize
	}
	
	public boolean isLeapYear(int year)
	{
		this.year = year;
		
		if (this.year % 4 != 0) //when year was divided by 4, if year have remain, then leapyear
			return false;

		else if (this.year % 100 != 0) //when above year have no remain and year was divided by 100
			return true;			   //if year has remain, then leapyear

		else if (this.year % 400 == 0) //when above year has no remain and year was divided by 400, if year has no remain, then year is leapyear
			return true;

		else //if not, then year is normal year
			return false;
	}
}
