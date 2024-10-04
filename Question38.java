import java.util.*;

class Question38 {
	public static void main(String[] args) 
	{
		System.out.println("#38. Write a program to check if a number is a power of two. ");
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
		
		boolean isPower = true;
		while(isPower == true)
		{
			if(number % 2 == 0)
			{
				number = number / 2;
				if( number == 1)
				{
					break;
				}
			}
			else 
			{
				isPower = false;
			}
		}
		
		if(isPower)
		{
			System.out.println("The number is a power of two");
		}
		else 
		{
			System.out.println("The number is not a power of two");
		}
		
	}
}