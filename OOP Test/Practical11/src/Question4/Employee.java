package Question4;

public class Employee {
	private String department;
	private String name;
	private int salary;
	
	public Employee()
	{
		name = "Smith";
		salary = 15000;
		department = "Worker";
	}
	
	public String name_check()
	{
		return name;
	}
	
	public String salary_check()
	{
		return toString(salary);
	}
	
	public String department_check()
	{
		return department;
	}
	
	public String toString(int num)
	{
		String save;
		save = Integer.toString(num);
		return save;
	}
}
