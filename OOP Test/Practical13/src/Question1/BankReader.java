package Question1;

import java.io.IOException;
import java.util.*;

public class BankReader
{
	 	public static void main(String[] args)
		{
  			boolean done = false;
  			Scanner in = new Scanner(System.in);
  			Bank bank = new Bank();
  
  			while (!done)
  			{
     				System.out.print("Filename: ");
     				String filename = in.next();

     			bank.readFile(filename);
				BankAccount highest = bank.getHighestBalance();
    		System.out.println(highest.getAccountNumber()
					+ " " + highest.getBalance());
				done = true;
  			}
		}
}
