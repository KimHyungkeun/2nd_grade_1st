import java.util.GregorianCalendar;

public class Question7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GregorianCalendar cal = new GregorianCalendar();
		
		System.out.println("DATE: " +(cal.get(cal.MONTH)+1) +"/" +cal.get(cal.DATE));
		System.out.println("TIME: " +(cal.get(cal.HOUR)) +":" +cal.get(cal.MINUTE));

	}

}
