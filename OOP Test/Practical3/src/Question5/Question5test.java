package Question5;

public class Question5test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee("John Smith","1001244888","010-8818-8818"); //employee e1's information
		Employee e2 = new Employee("Mike Davis","1001242348","010-9413-2318"); //employee e2's information
		Employee e3 = new Employee("Max Builder","1001224348","010-5328-5328"); //employee e3's information
		
		e1.getDetail();
		e2.getDetail();
		e3.getDetail();
		
		e1.change_number("010-2435-1234");
		System.out.println("After Change");
		
		e1.getDetail();
		e2.getDetail();
		e3.getDetail();
		
		
	}

}
