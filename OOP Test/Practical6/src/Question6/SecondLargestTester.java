package Question6;

import java.util.Scanner;

public class SecondLargestTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[5];
		Scanner in = new Scanner(System.in);
		System.out.println("Input Number(until fifth)");
		for(int i=0;i<5;++i){
			arr[i] = in.nextInt();
			
			if(arr[i] == -999){
				break;
			}
			}
		
		SecondLargest info = new SecondLargest();
		info.PrintSecondLargestNumber(arr);
		
		}

}
