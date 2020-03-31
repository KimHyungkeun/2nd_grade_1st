package Question7;

public class ClassTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		Class test = new Class();
		test.addStudent();
		test.addStudent();
		test.addStudent();
		test.addStudent();
		test.addStudent();
		test.addStudent();
		
		count++;
		test.removeStudent(count);
		
		test.calculateAverageGPA(count);
		test.printRoster();
	}
	

}
