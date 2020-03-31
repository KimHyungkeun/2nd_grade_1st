import java.util.GregorianCalendar;

public class Question8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GregorianCalendar cal = new GregorianCalendar();
		cal.add(cal.DATE,100); //After 100days from today
		//1 : Sunday
		//2 : Monday
		//3 : Tuesday
		//4 : Wednesday
		//5 : Thursday
		//6 : Friday
		//7 : Saturday
		System.out.println("DATE 100days from today: " +(cal.get(cal.MONTH)+1) +"/" +(cal.get(cal.DATE)));
		System.out.println("Weekday 100days from today: "+cal.get(cal.DAY_OF_WEEK));
		cal.add(cal.DATE,-100);
		cal.add(cal.DATE,+106);
		System.out.println("Weekday of my birthday: "+cal.get(cal.DAY_OF_WEEK));
		System.out.println("My birthday after 10 days: " +(cal.get(cal.MONTH)+1) +"/" +(cal.get(cal.DATE)+10));

	}

}
