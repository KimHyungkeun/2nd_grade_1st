package Question1;

public class Question1 {

	private int input; //input from argument
	private int result; //return value
	public Question1()
	{
		input = 0;
		result = 0;
	}
	
	public void input(int argument)
	{
		input = argument; //input argument
	}
	
	public boolean remainder_operator()
	{
		System.out.println(input);
		result = input % 2; //Do modular operate
		
		if(result == 0) //if result has no remain
			return true; //result is even
		
		else
			return false; //else result is odd
	}
}
