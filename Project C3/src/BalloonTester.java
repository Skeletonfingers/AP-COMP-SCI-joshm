
public class BalloonTester 
{

	public static void main(String[] args) 
	{
		Balloon green = new Balloon();
		green.inflate(3);
		double volume = green.getVolume();
		System.out.println("Volume is: " + volume);

	}

}
