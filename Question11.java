import java.util.*;

class Question11
{
	public static void main(String[] args) 
	{
		System.out.println("#11 Write a program to reverse an integer.");
		System.out.println("Please input a number: ");
		
		boolean correctInput = false;
		int number = -1;
		
		while(correctInput == false)
		{
			try 
			{
				Scanner s = new Scanner(System.in);  
				number = s.nextInt();
				correctInput = true;
			} 
			catch (Exception e) 
			{
				System.out.println("Wrong Input, Please Try Again:");
				correctInput = false;
			}
		}
		
		boolean isPositive = true;
		
		if(number > 0)
		{
			isPositive = true;
		}
		else 
		{
			isPositive = false;
			number = 0 - number;
		}
		
		StringBuilder stringBuilder = new StringBuilder(String.valueOf(number));
		String s = stringBuilder.reverse().toString();		
		int result = Integer.valueOf(s);
		
		if(isPositive)
		{
			System.out.println("The reverse number is " + result);
		}
		else 
		{
			System.out.println("The reverse number is " + -result);
		}
		
		
		
	}
}