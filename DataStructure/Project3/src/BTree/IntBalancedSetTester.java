package BTree;
import java.util.*;

public class IntBalancedSetTester {
	public static void main (String [] args) {  
        IntBalancedSet set = new IntBalancedSet();  
        Random rg = new Random();  
        for (int x=0; x<10; x++)  
        {  
            int num = rg.nextInt(10);  
            System.out.println("Adding " + num);  
            set.add(num);  
          System.out.println("tree so far:");  
          set.print(4);  
        }  
        System.out.println("final version of tree");  
        set.print(4);   
        int num = rg.nextInt(5);  
        if (set.contains(num))  
            System.out.println ("found it!");  
        else  
            System.out.println ("all that time, and nothing to show for it!");  
          
    }     
}    

