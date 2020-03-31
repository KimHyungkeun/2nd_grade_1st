package Question1;
import java.util.ArrayList;
import java.util.Scanner;

public class Q1 {
	private int num;
	private int[] count;
	private String[] set; 
	public Q1() {
		// TODO Auto-generated constructor stub
	num=0;
	set = new String[10]; 
	count = new int[10]; //count about each digit
	set[0] = "1 - 10    |   ";
	set[1] = "11 - 20   |   ";
	set[2] = "21 - 30   |   ";
	set[3] = "31 - 40   |   ";
	set[4] = "41 - 50   |   ";
	set[5] = "51 - 60   |   ";
	set[6] = "61 - 70   |   ";
	set[7] = "71 - 80   |   ";
	set[8] = "81 - 90   |   ";
	set[9] = "91 - 100  |   ";
	}
	
	public void inputNum()
	{
		ArrayList<String> arr = new ArrayList<String>();
	    Scanner in = new Scanner(System.in);
		
		for(int i=0;i<10;++i)
			System.out.println(set[i]); //print table
		
		
		while(true)
		{
			System.out.println("Input Number(If you input out of range of number, then program is ended)");
			num = in.nextInt(); //input number
			
			
			if(num < 1 || num > 100) //num<1 or num>100, then exit program
			{
				System.out.println("Program Exit");
				break;
			}
			
			for(int i=0;i<10;++i)
				if((num-1)/10  == i) //determine which digit
				count[i]++; //store number about inputed 
			
			
			
			for(int i=0;i<10;++i){
				if((num-1)/10  == i){ //which number is contained,
					System.out.print(set[i]);
					
					for(int j=0;j<count[i];++j)
					System.out.print("*");//then print asterisk
					
				System.out.println();
				}
				
				else{
				System.out.print(set[i]);
				
				for(int j=0;j<count[i];++j)
				System.out.print("*"); //print asterisk before input
				
				System.out.println();
				}
				
			}
			
			
				
		}
			
			
		
		
	}

}
