package Question4;

public class Employee {
	private String employeeName; //employee name
	private double salary; // salary
	
	public Employee(String employeeName,double salary)
	{
		this.employeeName = employeeName;
		this.salary = salary;
	}
	
	public String getName()
	{
		return this.employeeName; //return employeename
	}
	
	public double getSalary()
	{
		return this.salary; //return salary
	}
	
	public void increment(double percent)
	{
		this.salary = this.salary + (this.salary * (percent / 100)); //increase salary
		System.out.println("Increased Salary : "+this.salary); //display salary
	}
	
}
