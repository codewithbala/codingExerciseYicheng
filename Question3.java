import java.util.*;
import java.math.*;

class Question3
{
	public static void main(String[] args) 
	{
		System.out.println("#3 Write a program to find the factorial of a number.");
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
		
		if(number == 0)
		{
			System.out.println(1);
		}
		else 
		{
			BigInteger factorial = new BigInteger("1");
			for(int i=1; i <= number; i++)
			{
				factorial = factorial.multiply(BigInteger.valueOf(i));
			}
			System.out.println(factorial);
		}
		
	}
}