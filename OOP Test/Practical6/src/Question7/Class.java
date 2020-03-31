package Question7;
import java.util.Scanner;

public class Class {
	
	private String classname;
	private String teacher;
	private int lastindex;
	private int index;
	Student stu; //student class
	public Class() {
		// TODO Auto-generated constructor stub
		stu = new Student();
		classname = "Wizard"; 
		teacher = "Harry Potter";
		lastindex = 4;
		index = 0;
	}
	
	public void addStudent()
	{
		
		
		System.out.println("Add New Student's name");
		
		
		if(index >= stu.student.length){ //if index is larger or same than array size
			lastindex = index; 
			lastindex ++; //add lastindex
		    ensureCapacity(lastindex); //ensure array
		    
		 }
		
		
		stu.student[index] = stu.getStudentName(); //input student name
		++index;
		
	}
	
	public void removeStudent(int count)
	{
		int num;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Input number to remove student");
		num = in.nextInt(); //input student number
		
		for(int i=num-1;i<lastindex-count;++i){ 
			
			if(i+1 == lastindex)
				stu.student[i+1] = null; //if lastindex is i+1, then input null
			else
			stu.student[i] = stu.student[i+1]; //else input element of i+1 into element of i
			
		}
			
		
		System.out.println("Remove complete : "+num);
		System.out.println();
		
	}
	
	public void calculateAverageGPA(int count)
	{
		stu.score = new double[lastindex];
		double sum = 0.0; //summary
		double avg = 0.0; //average
		
		
		System.out.println("Input student's GPA");
		for(int i=0;i<lastindex-count;++i){
			System.out.print(stu.student[i]+" : ");
			stu.score[i] = stu.GPA(); //input student GPA
		}
		
		for(int i=0;i<lastindex-count;++i)
			sum += stu.score[i]; //sum of student's score
		
		avg = sum / (lastindex-count); //calculate average
		
		System.out.printf("GPA is "+avg); 
		System.out.println();
		
	}
	
	public void printRoster() //print class's all information
	{
		System.out.println();
		System.out.println("Class : "+classname); //classname
		System.out.println("Instructor : "+teacher); //instructor
		System.out.println("Student");
		for(int i=0;i<lastindex-1;++i){
			System.out.print(i+1+"."+stu.student[i]+":"); //student name
			System.out.println(" "+stu.score[i]); //student score
		}
	}
	
	public void ensureCapacity(int minimumCapacity) //ensureCapacity method
	{
		int ensuredCapacity;
		
		if(stu.student.length < minimumCapacity)
			ensuredCapacity = minimumCapacity;
		else 
			ensuredCapacity = stu.student.length;
			
		String[] Array = new String[ensuredCapacity];
		System.arraycopy(stu.student, 0, Array, 0, index); //copy student array to Array array
		stu.student = Array; 		
	}
			
}


