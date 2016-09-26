
import java.util.*;
public class BankAccount 
{

	public static void main(String[] args) 
	{
		int acc_number, minimum;
		double balance;
		double  balance2 = 0;
		char acc_type;
		String new_acc = null;
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter the account number: ");
		acc_number = in.nextInt();
		
		System.out.print("Enter the account type: ");
		acc_type = in.next().charAt(0);
		
		System.out.print("Enter the minimum balance: ");
		minimum = in.nextInt();
		
		System.out.print("Enter the current balance: ");
		balance = in.nextInt();
		
		if (acc_type == 'c' || acc_type == 'C')
		{
			new_acc = "c";
		}
		else if (acc_type == 's' || acc_type == 'S')
		{
			new_acc = "s";
		}
		else
		{
			System.out.println("Error, you must enter S or C");
		}
		
		if (new_acc.equalsIgnoreCase("s"))
		{
			if (balance < minimum)
			{
				balance2 = balance - 10;
			}
			else
			{
				balance2 = balance + (balance * 0.0033333333333333);
			}
		}
		else
		{
			
		}
		
		if (new_acc.equalsIgnoreCase("c"))
		{
			if (balance < minimum)
			{
				balance2 = balance - 25;
			}
			else if (balance > minimum + 5000)
			{
				balance2 = balance + (balance * 0.0041666666666667);
			}
			else 
			{
				balance2 = balance + (balance * 0.0025);
			}
		}
		else
		{

		}
		
		System.out.println(" ");
		System.out.println("Account Number: " + acc_number);
		System.out.println("Account Type: " + new_acc);
		System.out.printf("Beginning Balance: $%.2f", + balance);
		System.out.printf("\nNew Balance: $%.2f", + balance2);
		
	}

}
