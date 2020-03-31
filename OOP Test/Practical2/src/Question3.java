import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2,num3;
		
		Scanner in;
		in = new Scanner(System.in);
		System.out.println("Please input number");
		num1 = in.nextInt();
		num2 = in.nextInt();
		num3 = in.nextInt();
		
		System.out.println("Average : "+ (num1+num2+num3)/3);

	}

}
