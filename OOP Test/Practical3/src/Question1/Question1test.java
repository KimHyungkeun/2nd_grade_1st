package Question1;

import java.util.Scanner;

public class Question1test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double height;
		double length;
		Scanner input;
		input = new Scanner(System.in);
		System.out.print("Input Height(m) :");
		height = input.nextDouble(); //input height
		System.out.print("Input length(m) :");
		length = input.nextDouble(); //input length of the side
		System.out.println(); 
		
		Volume volume = new Volume(height,length);
		volume.getHeight(height);
		volume.getLength_of_side(length);
		volume.calculate_area();
		System.out.println("Base(m2) :"+volume.calculate_area());
		System.out.println("Volume of a Square Pyramid(m3) :"+volume.result());
		
	}

}
