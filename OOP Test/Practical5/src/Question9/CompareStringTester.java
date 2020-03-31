package Question9;


public class CompareStringTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CompareString info = new CompareString();
		String s1 = "This is First Sentence\nThe Last\nThe End\n"; //Input 3 string
		String s2 = "This is Second Sentence\nThe Last\nThe end\n"; //Input 3 string
		String[] result1 = s1.split("\n"); //discrete string about '\n'
 		String[] result2 = s2.split("\n"); //discrete string about '\n'
		int totalcount = 0; //increase count if each string has same word
		int count1 = 0; //count about sentence1
		int count2 = 0; //count about sentence2
		int bigger = 0; //input large number between count1 and count2
		
		for(int i=0;i<s1.length();++i)
			if(s1.charAt(i)=='\n')
			count1++;
		for(int i =0;i<s2.length();++i)
			if(s2.charAt(i)=='\n')
			count2++;
		
		if(count1 >= count2)
			bigger = count1;
		
		else
			bigger = count2;
		
		System.out.println("paragraph1 : ");
		System.out.println(result1[0]+"\n"+result1[1]+"\n"+result1[2]+"\n");
		
		System.out.println("paragraph2 : ");
		System.out.println(result2[0]+"\n"+result2[1]+"\n"+result2[2]+"\n");
		
		
	  
		
		for(int i = 0 ; i < bigger ; ++i)
		{
			
		
		if(true == info.Compare(result1[i], result2[i])){
			totalcount++; //increase count
		    if(totalcount == 3) //if number of counts is 3
			System.out.println("They are all same"); //Print "They are all same"
		}
		
		else{
			System.out.println("They are Different -_-"); // else
			System.out.println(result1[i]+"\n"+result2[i]); //Print different line 
			}
		
		}
			
	}

}
