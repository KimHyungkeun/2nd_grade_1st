package Question6;

public class SecondLargest {
	private int count;
	public SecondLargest() {
		// TODO Auto-generated constructor stub
		count = 0;
	}
	
	public void PrintSecondLargestNumber(int[] arr)
	{
		
		System.out.println("Array of Numbers");
		for(int i=0;i<5;++i)
		{
			System.out.print(arr[i]+" "); //print inputed number
		}
		
		System.out.println("\nSecond Largest Number");
		for(int i=0;i<5;++i)
		{
			for(int j=0;j<5;++j)
			{
				if(arr[i] >= arr[j]) //if arr[i] is larger or same than arr[j]
					count++; //then, add value of count
			}
			
			if(arr[i] == -999){ //if inputed number is -999
				System.out.println("Program Exit");
				break; //then break
			}
			
			if(count == 4) //if count is 4
			{
				System.out.println(arr[i]); //that element is second largest number 
				break;
			}
			
			else
				count = 0; //if compare is end, then initialize count to 0
		}
		
		
	}

}
