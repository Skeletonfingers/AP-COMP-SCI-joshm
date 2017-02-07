
public class CardTester 
{

	public static void main(String[] args) 
	{
		Card one = new Card("John");
		String name = one.getName();
		System.out.println(name);
		one.format();
		
		IDCard two = new IDCard("Paul", 1234);
		two.format();
		
		CallingCard three = new CallingCard("Sue", 5678, 789);
		three.format();
		
		DriverLicense four = new DriverLicense("Gary", 2016);
		four.format();
		

	}

}
