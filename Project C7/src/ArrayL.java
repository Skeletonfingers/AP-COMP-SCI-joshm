import java.util.*;
public class ArrayL 
{

	public static void main(String[] args) 
	{
		ArrayList<String> names = new ArrayList<String>();
		
		names.add("Alice");
		names.add("Bob");
		names.add("Connie");
		names.add("David");
		names.add("Doug");
		names.add("Edward");
		names.add("Fran");
		names.add("Gomez");
		names.add("Harry");
		
		String first = names.get(0); //get first and last name and prints them
		String last = names.get(7);
		System.out.println(first);
		System.out.println(last);
		
		int size = names.size();
		System.out.println("The list is " + size +" items long");
		System.out.println("Last name in the list is " + names.get(size-1));
		
		names.set(0, "Alice B Toklas");
		
		for (int i = 0; i < 9; i++)
		{
			System.out.print(names.get(i) + " ");
		}
		
		
	}

}
