/*
 * Author: JMcNamara
 * Date: 9/16/16
 * A program that reads in a ten-digit phone number as a string and turns it
 * into a more readable strings with parentheses and dashes
 */
import java.util.*;
public class Strings 
{

	public static void main(String[] args) 
	{
		String phone,sub1, sub2, sub3;
		
		Scanner console = new Scanner(System.in);
		System.out.print("Enter a 10 digit phone number: ");
		phone = console.nextLine();
		sub1 = phone.substring(0,3);
		sub2 = phone.substring(3,6);
		sub3 = phone.substring(6,10);
		
		System.out.println("(" + sub1 + ")" + "-" + sub2 + "-" + sub3);
		

	}

}
