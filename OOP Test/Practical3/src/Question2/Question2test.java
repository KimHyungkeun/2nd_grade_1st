package Question2;

import java.util.Scanner;

public class Question2test{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double height; //height
		double weight; //weight
		Scanner input;
		input = new Scanner(System.in);
		System.out.print("Input height(m):");
		height = input.nextDouble();
		System.out.print("Input weight(kg):");
		weight = input.nextDouble();
		
		BMI bmi = new BMI(height,weight);
		bmi.weightInKilograms(weight);
		bmi.heightInMeters(height);
		System.out.println("BMI :"+bmi.result());
	}

}
