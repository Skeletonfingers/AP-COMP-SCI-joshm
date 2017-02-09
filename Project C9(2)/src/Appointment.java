
public class Appointment 
{
	private int year;
	private int month;
	private int day;
	private String description;
	
	Appointment()
	{
		year = 0;
		month = 0;
		day = 0;
		description = "";
	}
	
	Appointment(int year, int month, int day, String app)
	{
		this.year = year;
		this.month = month;
		this.day = day;
		description = app;
	}
	
	public String getDescription()
	{
		return description;
	}
	
	public int getDay()
	{
		return day;
	}
	
	public int getMonth()
	{
		return month;
	}
	
	public int getYear()
	{
		return year;
	}
	
	public void occursOn(int year, int month, int day)
	{
		if (this.day == day && this.month == month && this.day == day)
		{
			
		}
	}
}
