package Question3;

public class Tester {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyPerson person = new MyPerson();
		System.out.println(person.name_check());
		System.out.println(person.birth_check());
		System.out.println();
		
		person = new Student();
		System.out.println(person.toString());
		System.out.println();
		
		person = new Instructor();
		System.out.println(person.toString());
		
	}

}
