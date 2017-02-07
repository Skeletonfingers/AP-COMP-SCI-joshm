public class Card
{
	private String name;
	
	public Card()
	{
		name = "";
	}
	
	public Card(String n)
	{
		name = n;
	}
	
	public String getName()
	{
		return name;
	}
	
	public boolean isExpired(int expire)
	{
		if (expire >= 2017)
		{
			return false;
		}
		else
		{
			return true;
		}
			
	}
	
	public String format()
	{
		return "Card holder: " + name;
	}
	
}
