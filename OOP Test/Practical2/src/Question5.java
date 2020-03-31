import java.awt.Rectangle;

public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rec = new Rectangle(10,20,30,40);
		System.out.println("Width :"+rec.getWidth());
		System.out.println("Height:"+rec.getHeight());
		System.out.println("Perimeter :"+(2*rec.getWidth() + 2*rec.getHeight()));
	}

}
