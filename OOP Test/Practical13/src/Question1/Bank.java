package Question1;

import java.io.File;
import java.io.IOException;
import java.io.Reader;
import java.util.*;


public class Bank {
	private String thisfilename;
	private File read;
	public Bank() {
		// TODO Auto-generated constructor stub
	}
	
	public void readFile(String filename)
	{
		thisfilename = filename;
		read = new File(filename);
	}
	
	public BankAccount getHighestBalance()
	{
		return null;
	}

}
