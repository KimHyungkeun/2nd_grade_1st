package Question5;

public class Question5 {
	private int num;
	
	public Question5()
	{
		this.num=0;
	}
	
	public boolean result(int num)
	{
		this.num = num;
		
	 boolean result = true;
	        for(int i = 2; i < this.num; i++) { 
	            if( this.num % i == 0) { //if num has no remain
	                result = false; //return value is false
	                break; 
	              
	            } else {
	                result = true; //else, return value is true
	                
	            }
	        }        
	        return result;        
	

}
}
