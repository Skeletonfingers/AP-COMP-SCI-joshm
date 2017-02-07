
public class DriverLicense extends Card
{
	private int expire;
	private String name; 
	
	public DriverLicense()
	{
		expire = 0;
	}
	
	public DriverLicense(String n, int ex)
	{
		super(n);
		expire = ex;
	}
	
	public String format()
	{
		return super.format() + ", Drivers license expire date: " + expire;
	}
}
