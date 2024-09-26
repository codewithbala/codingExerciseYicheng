import java.util.*;

class Question12
{
	public static void main(String[] args) 
	{
		System.out.println("#12 Write a program to check if an integer is a palindrome");
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
		
		number = number > 0 ? number : -number;
		
		String string = String.valueOf(number);
		String reverse = new StringBuilder(String.valueOf(number)).reverse().toString();
		if(string.equals(reverse))
		{
			System.out.println("The integer is a palindrome");
		}
		else 
		{
			System.out.println("The integer is not a palindrome");
		}
	}
}