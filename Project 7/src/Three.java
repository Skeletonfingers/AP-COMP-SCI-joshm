
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

	static double[] rotate (double[] x, int n) 
	{
		double[] temp = new double[x.length];
		for (int j = 0; j > n -1; j++) 
		{
			temp[j] = x[j];
		}
		return x;
	}
}
