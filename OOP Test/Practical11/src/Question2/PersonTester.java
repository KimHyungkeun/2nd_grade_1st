package Question2;

public class PersonTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person("Smith","John", 21);
		Person p2 = new Person("Smith","John", 22);
		Person p3 = new Person("Smith","John", 21);
		
		System.out.println(p1.equals(p2));
		System.out.println(p1.equals(p3));

	}

}
