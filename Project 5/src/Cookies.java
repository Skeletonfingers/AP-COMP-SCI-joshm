/*
 * Author: JMcNamara
 * Date: 9/22/16
 */
import java.util.*;
public class Cookies 
{

	public static void main(String[] args) 
	{
		int cookies, box_number, cont_number, box_left, box_left2;
		final int box = 24;
		final int container = 75;
		Scanner console = new Scanner(System.in);
		
		System.out.print("Enter the number of cookies: ");
		cookies = console.nextInt();
		box_number = cookies / box;
		System.out.println("The number of boxes needed to hold the cookies: " + box_number);
		box_left = cookies % box;
		if (box_left >= 0)
		{
			System.out.println("Leftover cookies: " + box_left);
		}	
		else
		{
			System.out.println("Leftover cookies: 0");
		}
		
		cont_number = box_number / 75;
		box_left2 = box_number % 75;
		System.out.println("The number of cases needed to store the cookie boxes: " +  cont_number);
		if (box_left2 > 0)
		{
			System.out.println("Leftover boxes: " + box_left2);
		}
		else
		{
			System.out.println("Leftover boxes: 0");
		}
		
		
		
		
		
	}

}
