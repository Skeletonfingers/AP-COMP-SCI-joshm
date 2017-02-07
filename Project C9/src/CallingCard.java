
public class CallingCard extends Card
{
	private int cardNumber;
	private int PIN;
	private String name;
	
	public CallingCard()
	{
		cardNumber = 0;
		PIN = 0;
	}
	
	public CallingCard(String n, int num, int pin)
	{
		super(n);
		cardNumber = num;
		PIN = pin;
	}
	
	public String format()
	{
		return super.format() + ", Card holder card number and PIN: " + cardNumber + ", " + PIN; 
	}
	
}
