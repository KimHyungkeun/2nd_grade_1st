package Question5;
import java.util.Scanner;

public class Question5Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Question5 info = new Question5();
		Scanner in = new Scanner(System.in);
		int num;
		System.out.println("Input Number : ");
		num = in.nextInt();
		
		for(int i=2;i<num;++i){
		if(true == info.result(i))
			System.out.println(i);
		
		else
			continue;
		}
	}

}
