import java.util.*;

class Question36
{
	public static void main(String[] args) 
	{
		System.out.println("36. Write a program to check if a number is an Armstrong number.  ");
		System.out.println("Please input a number >= 0 : ");
		
		boolean correctInput = false;
		int number = -1;
		
		while(correctInput == false)
		{
			try 
			{
				Scanner s = new Scanner(System.in);  
				number = s.nextInt();
				if(number >= 0)
				{
					correctInput = true;
				}
				else 
				{
					System.out.println("Wrong Input, Please input a positive number:");
					correctInput = false;
				}
			} 
			catch (Exception e) 
			{
				System.out.println("Wrong Input, Please Try Again:");
				correctInput = false;
			}
		}
		
		int sum = 0;
		int tmp = number;
		while(tmp > 0)
		{
			int mod = tmp % 10;
			sum = sum + mod * mod * mod;
			tmp = tmp / 10;
		}
		
		if(sum == number)
		{
			System.out.println("The number is an Armstrong number");
		}
		else 
		{
			System.out.println("The number is not an Armstrong number");
		}
		
	}
}