package Question3;

import java.util.Scanner;

public class DuplicateItemsTester{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[5];
		Scanner in = new Scanner(System.in);
		System.out.println("Input Numbers(until fifth)"); //input number
		
		for(int i = 0;i<5;++i)
		{
			arr[i] = in.nextInt();
			if(arr[i] == -999) //if input number is -999, then exit
				break;
		}
		
		DuplicateItems item = new DuplicateItems();
		item.PrintDuplicateItems(arr);
	}

}
