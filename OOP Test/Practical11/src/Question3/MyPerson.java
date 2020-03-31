package Question3;

public class MyPerson {
	private String thisname;
	private int thisbirth;
	private String thismajor;
	private int thissalary;
	
	public MyPerson()
	{
		thisname = "Gray";
		thisbirth = 1996;
		thismajor = "Computer";
		thissalary = 150;
	}
	
	public String name_check()
	{
		return thisname;
	}
	
	public String birth_check()
	{
		return toString(thisbirth);
	}
	
	public String major_check()
	{
		return thismajor;
	}
	
	public String salary_check()
	{
		return toString(thissalary);
	}
	
	public String toString(int num)
	{
		String result;
		result = Integer.toString(num);
		return result;
	}
	
	
	
	
	
}
