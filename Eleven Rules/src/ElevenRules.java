import java.util.*;
import java.io.*;
public class ElevenRules
{

	public static void main(String[] args) throws FileNotFoundException
	{
		long one, two, three, four, five;
		Scanner inFile = new Scanner
				(new FileReader("data.txt"));
		int count = 0;
		while (count < 5 ) {
			one = inFile.nextLong();
			System.out.format("%d%n", (one / 10) - (one % 10));
			count ++;
		}
		
		inFile.close();
	}

}
