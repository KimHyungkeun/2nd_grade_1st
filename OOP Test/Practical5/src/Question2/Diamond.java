package Question2;

public class Diamond {
	
	char ch;
	public Diamond()
	{
		this.ch = '*';
	}
	
	public void result(int n)
	{
		for(int i = -n; i <= n;++i)
		{
			for(int j=0;j<Math.abs(i);++j)
				System.out.print(" ");
			for(int j=0;j<(n-Math.abs(i))*2+1;++j)
				System.out.print(ch);
			
			System.out.println();
			
			
		}
	}

}
