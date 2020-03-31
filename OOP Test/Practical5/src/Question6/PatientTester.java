package Question6;
import java.util.Scanner;

public class PatientTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ID,name,contactnumber;
		Scanner in = new Scanner(System.in);
		System.out.print("Input ID : "); //input id
		ID = in.nextLine();
		System.out.print("Input name : "); //input name
		name = in.nextLine();
		System.out.print("Input number : "); //input number
		contactnumber = in.nextLine();
		
		Patient info = new Patient(ID,name,contactnumber); //construct Patient class
		
		System.out.println("\nOutput : "+"\n"+info.toString()); //Print inputed information
		
		
		
		
		
	}

}
