package Question8;

public class Reverse {

	String sentence;
	String reverse;
	int len;
	
	
 	
	public Reverse(String sentence)
	{
		this.reverse = ""; //initialize reverse
		this.sentence = sentence; //initialize sentence
		this.len = sentence.length(); //initialize length of sentence
	}
	
	public String reverse_result()
	{
		
	for(int i = len-1; i>=0; --i){
			reverse = reverse + sentence.charAt(i);
			 
		}
		
		return reverse;
	}
}
