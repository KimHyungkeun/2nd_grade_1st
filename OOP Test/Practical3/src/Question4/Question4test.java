package Question4;

import java.util.Scanner;

public class Question4test{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		String ID;
		String Phone;
		Scanner input;
		input = new Scanner(System.in);
		System.out.print("Input name :");
		name = input.nextLine(); //input name
		System.out.print("Input ID :");
		ID = input.nextLine(); //input id
		System.out.print("Input PhoneNumber :");
		Phone = input.nextLine(); //input phone number
		
		Student info = new Student();
		System.out.println("Name :"+info.getName(name)+"\n"+"ID :"+info.getID(ID)+"\n"+"PhoneNumber :"+info.getPhone_Number(Phone));
	}

}

