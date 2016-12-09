
public class NeighborElements 
{

	public static void main(String[] args) 
	{
		int[][] values = 
			{
				{16,  3,  2,  13},
				{5,  10,  11, 8},
				{9,  6,   7,  12},
				{4,  15,  14, 1},
			};
		System.out.println("The elements in the 2-D array are: ");
		for (int i = 0; i < values.length; i++) 
		{
			for (int j = 0; j < values[0].length; j++) 
			{
				System.out.printf("%-7d", values[i][j]);
			}
			System.out.println();
		}
		//invoke method to add neighbor elements
		int sum = addNeighborElements(values, 3, 3);
		System.out.println("Sum is: " + sum);
	}


	//returns the sum of neighbor elements
	public static int addNeighborElements(int[][] values, int i, int j)
	{
		int total = 0;
		if (i > 0) //if row > 0, then there must be a top neighbor
		{
			total += values[i-1][j];
		}
		
		if (i > 0 && j > 0)
		{
			total += values [i-1][j-1];
		}
		return total; 
	}
}