import java.util.ArrayList;

public class Tester
{

	public static void main(String[] args)
	{
		BTreeInt myTree = new BTreeInt();
		BTreeInt yourTree;
		
		int N = 20;
		
		ArrayList <Integer> trace = new ArrayList <Integer> (N);
		
		int t;
		for(int i=0; i<N; ++i)
		{
			do
			{
				t = (int)(Math.random()*100);
			} while(myTree.contains(t));
			
			System.out.println("Adding " + t);
			myTree.add(t);
			System.out.println(myTree+"\n");
			
			trace.add(t);
			
			if(!myTree.contains(t))
			{
				System.out.println("Search Function Bug");
			}
		}

		System.out.println("----------------");
		
		for(int i : trace)
		{
			System.out.println("Removing " + i);
			myTree.remove(i);
			System.out.println(myTree+"\n");
			
			if(myTree.contains(i))
			{
				System.out.println("Search Function Bug");
				throw new RuntimeException();
			}
		}
	}

}
