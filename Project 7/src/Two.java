import java.util.*;
public class Two 
{

	public static void main(String[] args) 
	{
		final int LENGTH = 10;
		double[] x = new double[LENGTH];
		
		int currentSize = 0;
		System.out.println("Enter up to 10 numbers, enter a letter when when you don't want to enter any more: ");
		Scanner in = new Scanner(System.in);
		while (currentSize < LENGTH && in.hasNextDouble())
		{
			x[currentSize] = in.nextDouble();
			currentSize++;		 
		}
		
		for (int i = 0; i < x.length; i++)
		{
			if (i > 0) {
				System.out.print(" | ");
			}
		 System.out.print(x[i]);
		}
		System.out.println();
		
		double small = x[0];
		for (int k = 1; k < currentSize; k++) 
		{
			if (x[k] < small) 
			{
				small = x[k];
			}
		}
		System.out.println("Minimum value:" + small);
	}	

}

