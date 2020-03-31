package Question6;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;

class BankAccount
{
	private double balance;
	private double interest;
 
	public BankAccount()
	{
		balance = 0;
		interest = 0;
	}
 
	public BankAccount(double initialBalance)
	{
		balance = initialBalance;
	}
 
	public void deposit(double amount)
	{
		balance = balance + amount;
	}
 
	public void withdraw(double amount)
	{
		balance = balance - amount;
	}
 
	public void addInterest()
	{
		balance = balance + balance * interest;
	}
 
	public double getBalance()
	{
		return balance;
	}
 
}

public class Q6Tester {

	private static final int FRAME_WIDTH = 400;
	private static final int FRAME_HEIGHT = 200;
	private static int INITIAL_BALANCE;
	private static int INTEREST_RATE;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame();
		JButton button = new JButton("Add Interest");
		Scanner in = new Scanner(System.in);
		System.out.print("Input Balance : ");
		INITIAL_BALANCE = in.nextInt();
		System.out.print("Input Rate : ");
		INTEREST_RATE = in.nextInt();
		final BankAccount account = new BankAccount(INITIAL_BALANCE);
		final JLabel label = new JLabel("balance: " + account.getBalance());
		JLabel label2 = new JLabel("Initial Balance = "+INITIAL_BALANCE);
		JLabel label3 = new JLabel("Inputed Rate = "+INTEREST_RATE);
		
		JPanel panel = new JPanel(new GridLayout(4,1));
		panel.add(button);
		panel.add(label);
		panel.add(label2);
		panel.add(label3);
		frame.add(panel);
		
		class AddInterestListener implements ActionListener
		{
			public void actionPerformed(ActionEvent event)
			{
				double interest = account.getBalance() * INTEREST_RATE / 100;
				account.deposit(interest);
				label.setText("balance: " + account.getBalance());
			}
		}
		
		ActionListener listener = new AddInterestListener();
		button.addActionListener(listener);
		
		frame.setSize(FRAME_WIDTH,FRAME_HEIGHT);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

	}

}
