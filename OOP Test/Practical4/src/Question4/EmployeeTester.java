package Question4;

public class EmployeeTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee info = new Employee("Jack Sparow",1500.0);
		System.out.println("Name : "+info.getName());
		System.out.println("Salary : "+info.getSalary());
		info.increment(50.0);
	}

}
