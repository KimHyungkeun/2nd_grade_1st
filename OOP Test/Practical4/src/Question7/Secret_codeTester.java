package Question7;
import java.util.Scanner;

public class Secret_codeTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pin;
		int number1;
		int number2;
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your pin");
		pin = input.nextInt();
		System.out.println("Please enter your number 1");
		number1 = input.nextInt();
		System.out.println("Please enter your number 2");
		number2 = input.nextInt();
		
		Secret_code info = new Secret_code(pin,number1,number2);
		System.out.print("Your secret code : ");
		System.out.println(info.getNumber1()+info.getPin()+info.getNumber2());
	}

}
