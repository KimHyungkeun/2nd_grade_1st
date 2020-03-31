package Question5;

public class ExceptionLineTooLong {
	private String thisstring;
	
	public ExceptionLineTooLong(String string) {
		// TODO Auto-generated constructor stub
		thisstring = string;
		
		IllegalArgumentException exception = new IllegalArgumentException(thisstring);
		throw exception;
	}

}
