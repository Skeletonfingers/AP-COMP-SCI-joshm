
public class DayTest 
{

	public static void main(String[] args) 
	{
        Day Today = new Day(1);                
        System.out.print("The current day: " + Today);                
        System.out.println();
        Today.setDay(Today.previousDay());
        System.out.print("The previous day: " + Today);                               
        System.out.println();
        Today.setDay(Today.nextDay());                
        Today.setDay(Today.nextDay());
        System.out.print("The next day: " + Today);              
        System.out.println();                               
        Today.setDay(Today.ahead(10));
        System.out.print("10 days later: " + Today);               
        System.out.println();               
		
	}

}
