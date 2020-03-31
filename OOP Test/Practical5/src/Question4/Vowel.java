package Question4;

import javax.naming.spi.DirStateFactory.Result;

public class Vowel {
	private int vowel;
	private int non_vowel;
	String sentence;
	
	public Vowel(String sentence)
	{
		this.sentence = sentence; //input sentence
		this.vowel = 0; //initialize vowel value
		this.non_vowel = 0; //initialize non_vowel value
	}
	
	public void vowel_search()
	{
		int index = 0;
		 while(index < this.sentence.length()) 
		  {
			  
			  switch(this.sentence.charAt(index)){
			  case 'a' : //'a' is vowel
				  vowel++;
				  break;
			  case 'A' : //'A' is vowel
				  vowel++;
				  break;
				  
			  case 'e' : //'e' is vowel
				  vowel++;
				  break;
			  case 'E' : //'E' is vowel
				  vowel++;
				  break;
				  
			  case 'i' : //'i' is vowel
				  vowel++;
				  break;
			  case 'I' : //'I' is vowel
				  vowel++;
				  break;
				  
			  case 'o' : //'o' is vowel
				  vowel++;
				  break;
			  case 'O' : //'O' is vowel
				  vowel++;
				  break;
				  
			  case 'u' : //'u' is vowel
				  vowel++;
				  break;
			  case 'U' : //'U' is vowel
				  vowel++;
				  break;
				  
				  default : //except vowel
					  non_vowel++;
					  break;
				  
				  }
			  
			 ++index; // increase index
		  }
		 
	}
	
	public int vowel_result()
	{
		return this.vowel; //numbers of vowel
	}
	
	public int non_vowel_result()
	{
		return this.non_vowel; //numbers of non_vowel
	}
	
	

}
