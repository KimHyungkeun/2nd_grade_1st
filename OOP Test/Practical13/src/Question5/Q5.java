package Question5;

public class Q5 {
	private String thisstring;
	
	public Q5(String string) {
		// TODO Auto-generated constructor stub
		thisstring = string;
	}
	
	public void LengthCheck()
	{
		int len;
		len = thisstring.length();
		System.out.println("String length : "+len);
		if(len > 80)
		{
			ExceptionLineTooLong exception = new ExceptionLineTooLong("This String is too Long!!");
		}
		
	}

}
