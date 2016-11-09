
public class One {

	public static void main(String[] args) 
	{
		double[] x = { 8, 4, 5, 21, 7, 9, 18, 2, 100 };
		System.out.println("Number of items in the array: " + x.length);
		System.out.println("First array item: " + x[0]);
		System.out.println("Last array item: " + x[8]);
		System.out.print("All the values in the array: ");
		
		for (int i = 0; i < 9; i++)
		{
		 System.out.print(x[i] + " ");
		}
		System.out.println();

		for (int i = 0; i < 9; i++)
		{
		 System.out.println("x[" + i + "]: " + x[i] + " ");
		}
		System.out.println();
		
		for (int i = 8; i >= 0; i--)
		{
		 System.out.println("x[" + i + "]: " + x[i] + " ");
		}
		System.out.println();
		
		System.out.print("All the values in reverse: ");
		
		for (int i = 8; i >= 0; i--)
		{
		 System.out.print(x[i] + " ");
		}
		System.out.println();
	}

}
