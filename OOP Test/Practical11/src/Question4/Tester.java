package Question4;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee = new Employee();
		System.out.println(employee.name_check());
		System.out.println(employee.salary_check());
		System.out.println();
		
		employee = new Manager();
		System.out.println(employee.toString());
		System.out.println();
		
		employee = new Executive();
		System.out.println(employee.toString());
		System.out.println();
	}

}
