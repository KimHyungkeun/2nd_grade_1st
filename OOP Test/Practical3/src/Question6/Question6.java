package Question6;
class myDate //myDate class
{
	private int month; //month
	private int day; //day
	private int year; //year
	
	public myDate(int year,int month,int day) //constructor
	{
		this.year = year;
		this.month = month;
		this.day = day;
	}

	public void set_year(int year) //set year
	{
		this.year = year;
	}
	
	public void set_month(int month) //set month
	{
		this.month = month;
	}
	
	public void set_day(int day) //set day
	{
		this.day = day;
	}
	
	public int get_year() //get year
	{
		return this.year;
	}
	
	public int get_month() //get month
	{
		return this.month;
	}
	
	public int get_day() //get day
	{
		return this.day;
	}
	
	public void Display()
	{
		System.out.println(this.year+"/"+this.month+"/"+this.day);
	}
}
