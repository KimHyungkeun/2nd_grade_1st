package Question7;
import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double balance;
		System.out.print("Input balance : ");
		Scanner in = new Scanner(System.in);
		balance = in.nextDouble();
		
		
		BankAccount bank = new BankAccount(balance);
		bank.add(250.0);
		bank.withdraw(2000.0);
	}

}
