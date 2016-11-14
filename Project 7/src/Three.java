
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

 // Your method goes here.
}
