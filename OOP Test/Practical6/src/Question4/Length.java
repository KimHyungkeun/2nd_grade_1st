package Question4;
import java.util.Random;

public class Length {
   private int[] num_in;
   private int[] count;
   
	
	public Length() {
		// TODO Auto-generated constructor stub
		
		num_in = new int[100];
		count = new int[102]; //count[0] : start, count[101] : end
		
		
		
	}	
		
	
	public void search()
	{
		
		for(int i=0;i<100;++i)
			num_in[i] = (int) (Math.random() * 2) + 0; //1,0 random
	
		
		/*for(int i=0;i<100;++i)
		System.out.print(num_in[i]+" ");*/
		
		System.out.println();
		
		int head=0;
		for(int i=0;i<100;++i)
		{
			if(num_in[i] == 1)
				head++; //if 1, then add head
			
			else {	
				count[head]++; //if not 1, count array's index is value of head
				head = 0; //then, Initialize head to 0
			}
			
		}
		
		System.out.println("Length      Numbers of tuns of heads");
		for(int i=0;i<100;++i){
			
			if(count[i+1] == 0)
				continue;
			
			else{
			System.out.print(i+1);
			System.out.println("           "+count[i+1]);
			}
		}
			
		
	}
		
}


