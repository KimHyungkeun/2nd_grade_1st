package Question4;

public class Executive extends Manager{
	
	public Executive()
	{
		super();
	}
	
	public String toString()
	{
		return super.name_check() +' ' + super.salary_check() + ' '+  super.department_check();
	}
}
