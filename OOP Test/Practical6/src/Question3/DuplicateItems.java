package Question3;

public class DuplicateItems {
	private int count;
	
	public DuplicateItems() {
		// TODO Auto-generated constructor stub
		count = 0;
	}
	
	public void PrintDuplicateItems(int[] arr)
	{
	System.out.println("Array of Numbers");
	for(int i=0;i<5;++i)
	{
		System.out.print(arr[i]+" "); //print stored number
	}
	
	System.out.println("\nTrue of False");
	for(int i=0;i<5;++i)
	{
		for(int j=0;j<5;++j)
		{
			if(arr[i] == arr[j]) //if element is same
				count ++; //then, add value of count
		}	
		
		if(arr[i] == -999) //if input -999
		{
			count = -1;
			break; //eliminate program
		}
		
	
	}
	
	if(count == 5) //if count is 5, then print false
		System.out.println("False");
	
	else if(count > 5) //if count is larger than 5, then print true
		System.out.println("True");
	
	else if(count == -1) //if count is -1, then exit program
		System.out.println("Program Exit");
	
	}
}

