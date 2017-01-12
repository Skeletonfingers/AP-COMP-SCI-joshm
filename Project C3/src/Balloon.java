/**
 * 
 * @author 532847
 *
 */
public class Balloon 
{
	/** 
	 * instance variable
	 */
	private double radius;
	
	public Balloon()
	{
		radius = 0;
	}
	
	/**
	 * inflate the balloon amount amount
	 * @param amount
	 */
	public void inflate(double amount)
	{
		radius += amount;
	}
	/**
	 * returns the volume of the balloon
	 * @return
	 */
	public double getVolume()
	{
		double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3 );
		return volume;
	}
		
}
