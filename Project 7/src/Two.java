import java.util.*;
public class Two 
{

	public static void main(String[] args) 
	{
		final int LENGTH = 10;
		double[] x = new double[LENGTH];
		
		int currentSize = 0;
		System.out.println("Enter up to 10 numbers, enter a letter when when you don't want to enter any more: "); //user enters 10 values and letter to stop entering
		Scanner in = new Scanner(System.in);
		while (currentSize < LENGTH && in.hasNextDouble()) //while size is < 10 and user is entering numbers loop
		{
			x[currentSize] = in.nextDouble();
			currentSize++;		 
		}
		
		for (int i = 0; i < x.length; i++) // put in separators
		{
			if (i > 0) {
				System.out.print(" | ");
			}
		 System.out.print(x[i]);
		}
		System.out.println();
		double total = 0;
		for (int j = 0; j < currentSize; j++) //find total
		{
			total += x[j];
		}
		System.out.println("Total is: " + total);
		findMin(x,currentSize);

	}	
	public static double findMin(double[] x, int currentSize) //find the minimum value
	{
		double small = x[0];
		for (int k = 1; k < currentSize; k++) 
		{
			if (x[k] < small) 
			{
				small = x[k];
			}
		}
		System.out.println("Minimum value: " + small);
		return small;
		
	}
}

