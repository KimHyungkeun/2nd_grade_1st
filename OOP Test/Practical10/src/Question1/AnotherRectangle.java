package Question1;

import java.util.*;
import java.awt.*;

public class AnotherRectangle extends Rectangle{
	private int W;
	private int H;
	
	public AnotherRectangle(int weight,int height)
	{
		// TODO Auto-generated constructor stub
		W = weight;
		H = height;
	}
	
	
	public boolean equals(Object obj)
	{
		AnotherRectangle rec = (AnotherRectangle)obj;
		
		if(this.W == rec.W && this.H == rec.H)
			return true;
		else
			return false;
	}
	
}
