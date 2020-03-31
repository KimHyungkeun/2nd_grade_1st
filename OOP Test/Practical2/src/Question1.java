import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String student_name;
		int student_ID;
		
		Scanner in;
		in = new Scanner(System.in);
		System.out.println("Please enter your name");
		student_name = in.nextLine();
		System.out.println("Please enter your ID");
		student_ID = in.nextInt();
		System.out.println("Your name : "+student_name+("Your ID : "+student_ID));
	}

}
