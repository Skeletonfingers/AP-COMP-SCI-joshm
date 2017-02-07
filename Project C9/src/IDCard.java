
public class IDCard extends Card
{
	private int idNumber;
	
	public IDCard()
	{
		idNumber = 0;
	}
	
	public IDCard(String n, int id)
	{
		super(n);
		idNumber = id;
	}
	
	// prints "Card holder: John, Card holder id: 1234" 
	public String format()
	{
		return super.format() + ", Card holder ID: " + idNumber;
	}
}
