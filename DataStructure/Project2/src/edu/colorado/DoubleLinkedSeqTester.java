package edu.colorado;


public class DoubleLinkedSeqTester {
    
    public static void main(String[] args) {
	   DoubleLinkedSeq test=new DoubleLinkedSeq();

	   System.out.println("    creating a new sequence s1......");
	     DoubleLinkedSeq s1= new DoubleLinkedSeq();
 
	     System.out.println("    adding values from 4 to 10 to s1......");
	      for(double i=4;i<=10;i++)
		  s1.addAfter(i);

	     System.out.println(" s1.getCurrent()="+s1.getCurrent()+" should return 10.0");
	    
	     System.out.println("     setting the current position to s1.start()......");
	         s1.start();
		
	       System.out.println(" s1.getCurrent()="+s1.getCurrent()+" should return 4.0");
		
	       System.out.println("     adding values from 1 to 3, before value 4 in sequence ,to s1......");
	         for(double i=3;i>=1;i--)
		     s1.addBefore(i);

		
		System.out.println(" s1.size()="+s1.size()+" should return 10");
		
		System.out.println(" s1.getCurrent()="+s1.getCurrent()+" should return 1.0");
		
		System.out.println("    displaying the values in s1 from 1.0 to 10.0 using s1.advance()......");
		  test.displaySeq(s1);
		  s1.start();
		
		System.out.println("    creating a new sequence s2=s1.clone()......");
		  DoubleLinkedSeq s2 ;
		    s2=(DoubleLinkedSeq)s1.clone();
		  
	       	 System.out.println("    displaying the values in s2 ..should be same as above.....");
		 test.displaySeq(s2);
		 s2.start();

		System.out.println("   removing the first element from s1 i.e 1.0......");
		   s1.start();
		   s1.removeCurrent();

		   System.out.println(" s1.size()= "+s1.size()+" should return 9");   
		System.out.println("   now displaying s1 :  should display from second value 2.0 to 10.0  ");
		   test.displaySeq(s1);

		  System.out.println(" s2.size()= "+s2.size()+" should return 10");    
		System.out.println(" now displaying  s2 :  there should be no change in s2  ");
		test.displaySeq(s2);
		   
		System.out.println("    creating another sequence s3......");
		DoubleLinkedSeq s3=new DoubleLinkedSeq();
		
		System.out.println(" s3.size()="+s3.size()+"  should return 0");
		
		System.out.println("    adding s2 to s3......");
		s3.addAll(s2);
		
		System.out.println(" s3.size()="+s3.size()+"  should return 10");
		
		System.out.println("    creating a new  sequence s4=concatenation of s2 and s3...... ");
		DoubleLinkedSeq s4=DoubleLinkedSeq.catenation(s2,s3);
		System.out.println("   displaying s4..,.should be 1.0 ..to. 10.0 1.0 .to.. 10.0");
		test.displaySeq(s4);
		s4.start();
		System.out.println(" s4.size()="+s4.size()+"  should retrun 20");
 }
 
           
    
    }