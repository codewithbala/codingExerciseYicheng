import java.util.*;

class Question13
{
	public static void main(String[] args) 
	{
		System.out.println("#13 Write a program to find the sum of digits of an integer");
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
		
		int sum = 0;
		
		while(number != 0)
		{
			sum = sum + number % 10;
			number = number / 10;
		}
		
		System.out.println("The sum of digits is " + sum);
		
	}
}