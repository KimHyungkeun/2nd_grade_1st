package project1;

public class DoubleArraySeqTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoubleArraySeq numbers = new DoubleArraySeq();
		DoubleArraySeq numbers2 = new DoubleArraySeq();
		 DoubleArraySeq total = new DoubleArraySeq();
		
		    numbers.start();
		    numbers.addAfter(3.5);
		    numbers.addAfter(14.9);
	        numbers.addAfter(45.3);
	        numbers.addAfter(2.4);
	        
	        numbers2.start();
	        numbers2.addBefore(1.2);
	        numbers2.addBefore(2.3);
	        total= DoubleArraySeq.concatenation(numbers, numbers2);
		   
		    System.out.println("data length : "+numbers.getCapacity());
	        System.out.println("data size : "+numbers.size());
	        System.out.println("Your current value is " + numbers.getCurrent());
	        System.out.println();
	        
	        System.out.println("data length : "+numbers2.getCapacity());
	        System.out.println("data size : "+numbers2.size());
	        System.out.println("Your current value is " + numbers2.getCurrent());
	        System.out.println();
	        
	        System.out.println("data length : "+total.getCapacity());
	        System.out.println("data size : "+total.size());
	        System.out.println("Your current value is " + total.getCurrent());
	        
	        
	        
	        /*numbers.removeCurrent();
	        System.out.println("After remove current value is" + numbers.getCurrent());*/
	        
	        numbers.start();
	        System.out.println("Your current value in number1 is " +  numbers.getCurrent() + "  You're back at the beginning.");
	        
	        numbers2.start();
	        System.out.println("Your current value in number2 is " + numbers2.getCurrent() + "  You're back at the beginning.");
	         
	        total.start();
	        System.out.println("Your current value in total is " + total.getCurrent() + "  You're back at the beginning.");
	        
	        
	        System.out.println("Here are all the values in this sequence:");
	        
	        for(numbers.start(); numbers.isCurrent(); numbers.advance())
	          {
	                System.out.println(numbers.getCurrent());
	             
	          }  

	        
	        for(numbers2.start(); numbers2.isCurrent(); numbers2.advance())
	          {
	                System.out.println(numbers2.getCurrent());
	             
	          }  

	         
	          for(total.start(); total.isCurrent(); total.advance())
	          {
	                System.out.println(total.getCurrent());
	             
	          }  
	        
	        
	        	
	    }
}


