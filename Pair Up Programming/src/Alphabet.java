import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;
public class Alphabet 
{
	public static void main(String[] args) throws FileNotFoundException 
	{	
		Scanner inFile = new Scanner(new FileReader("Test.txt"));
		String letterString;
		letterString = inFile.nextLine();
		alphabet(letterString);
		letterString = inFile.nextLine();
		alphabet(letterString);
		letterString = inFile.nextLine();
		alphabet(letterString);
		letterString = inFile.nextLine();
		alphabet(letterString);
		letterString = inFile.nextLine();
		alphabet(letterString);
		inFile.close();
	}
	
    public static void alphabet(String a)
    {
    	int distance;
    	char x, y;
    	char[] alphabet = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };  
    	System.out.print("Distances: ");
    	if (a.length() <= 9)
    	{
    		for (int i = 0 ; i + 5 < a.length() ; i++)
    		{
    			x = a.charAt(i);
    			y = a.charAt(i + 5);
    			if (y >= x)
        		{
    				distance = y - x;
    				System.out.print(distance + " ");
        		}
    			if (y < x)
    			{
    				distance = (y + 26) - x;
    				System.out.print(distance + " ");
    			}
    			
    		}
    	System.out.println("");
    	}
    	else
    	{
    		for (int i = 0 ; i + (a.length() / 2) + 1 < a.length() ; i++)
    		{
    			x = a.charAt(i);
    			y = a.charAt(i + (a.length() / 2) + 1);
    			if (y >= x)
        		{
    				distance = y - x;
    				System.out.print(distance + " ");
        		}
    			if (y < x)
    			{
    				distance = (y + 26) - x;
    				System.out.print(distance + " ");
    			}
    			
    		}
    	System.out.println("");
    	}

    }
}