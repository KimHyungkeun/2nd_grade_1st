package Question6;

public class Question6test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myDate info = new myDate(2015,3,25);
		info.Display();
		System.out.println("\nAfter Change");
		info.set_year(2014); //set 2014(year)
		info.set_month(5); //set 5(month)
		info.set_day(3); //set 3(day)
		info.Display();
	}

}
