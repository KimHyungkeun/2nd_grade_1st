package Assignment;
import java.util.Timer;

public class FirstThread extends Thread{

	private RobotParts a;
	private long DELAY;
	int clickcount;
	int done;
	boolean what;
	public FirstThread(int clickcount,int delay,boolean what)
	{
		this.what = what;
		done = 0;
		DELAY = delay;
		this.clickcount = clickcount;
		a = new RobotParts(clickcount,100,280,what);
		
	}
	
	public void run()
	{
		do
		{
		 if(done>0)
		 {
			 if(what)
			 a.move();
			 
			 else
			 a.move2();
			 
			 try {
				sleep(DELAY);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 }
		 else
			 try {
					sleep(DELAY);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} ;
		}while(true);
	}
	
	public void stopit()
	{
		done = 0;
	}
	public void startit()
	{
		done = 1000;
	}
	public RobotParts getRobot()
	{
		return a;
	}
}