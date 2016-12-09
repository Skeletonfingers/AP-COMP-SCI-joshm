
public class Three
{
	public static void main(String[] args)
	{
		double[] x = {8, 4, 5, 21, 7, 9, 18, 2, 100};
		System.out.println("Before rotation: ==============================");
		for (int i = 0; i < x.length; i++)
		{
			System.out.println("x[" + i + "]: " + x[i]);
		}
		x = rotate(x, 3);
		System.out.println("After rotation: ==============================");
		for (int i = 0; i < x.length; i++)
		{
			System.out.println("x[" + i + "]: " + x[i]);
		}
 }

	public static double[] rotate(double[] x, int n) 
	{
	    if(n > x.length) 
	        n = n % x.length;

	    double[] one = new double[x.length];

	    for(int i = 0; i < n; i++) 
	    {
	        one[i] = x[x.length - n + i];
	    }

	    int j = 0;
	    for(int i = n; i < x.length; i++)
	    {
	        one[i] = x[j];
	        j++;
	    }
		return one;
	}
}
