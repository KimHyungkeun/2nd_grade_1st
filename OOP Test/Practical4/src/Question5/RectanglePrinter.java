package Question5;
import java.awt.Rectangle;

public class RectanglePrinter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r1 = new Rectangle(0,0,100,50); //First Rectangle
		Rectangle r2 = new Rectangle(0,0,100,50); //Second Rectangle
		System.out.println("Before = "+r1);
		r2.grow(10, 20); // grow width as 10 and height as 20
		System.out.println("After = "+r2);
	}

}
