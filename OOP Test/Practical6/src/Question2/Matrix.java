package Question2;
import java.util.Scanner;

public class Matrix {
	private int[][] arr = new int[3][3];
	private int num;
	
	public Matrix() {
		// TODO Auto-generated constructor stub
		Scanner in = new Scanner(System.in);
		System.out.println("Input Integer");
		
		for(int i=0;i<3;++i)
		{
			for(int j=0;j<3;++j){ //store number
				num = in.nextInt();
				arr[i][j] = num; //1 ~ 9
				
			}
		}
		
	}
	
	public void PrintMatrix()
	{
		int i,j;
		int temp = 0;
		
		System.out.println("Before");
		for(i=0;i<3;++i)
		{
			for(j=0;j<3;++j)
				System.out.print(arr[i][j]+" "); //Before change
			
			System.out.println();
		}
		
		for(i=0;i<3;++i)
		{
			for(j=i+1;j<3;++j)
			{
				temp = arr[i][j]; 
				arr[i][j] = arr[j][i]; //shift element i <-> j
				arr[j][i] = temp;
			}
				
		}
		
		System.out.println("After");
		for(i=0;i<3;++i)
		{
			for(j=0;j<3;++j)
				System.out.print(arr[i][j]+" "); //After change
			
			System.out.println();
		}
		
	}

}
