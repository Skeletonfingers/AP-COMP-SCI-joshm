import java.util.*;
public class One 
{

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int firstNum, secondNum, a, b, c, d;
		int sum = 0;
		
		System.out.print("Enter a postive integer: ");
		firstNum = in.nextInt();
		a = firstNum;
		b = firstNum;
		c = firstNum;
		d = firstNum;
		
		System.out.print("Enter a postive integer: ");
		secondNum = in.nextInt();
		
		System.out.println("Odd integers between " + firstNum + " and " + secondNum + " are:");
		while (firstNum != secondNum)
		{
			a++;
			if (a % 2 != 0)
			{
				System.out.print(a + " ");
			}
		}
		
		while (firstNum != secondNum)
		{
			b++;
			if (b % 2 == 0)
			{
				sum = sum + b;
			}
		}
		System.out.println("Sum of even integers between " + firstNum + " and " + secondNum + " = " + sum);
	}

}
