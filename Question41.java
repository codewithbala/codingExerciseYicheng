import java.util.*;

class Question41 
{
	public static void main(String[] args) 
	{
		System.out.println("#41. Write a program to find the power of a number (exponentiation). ");
		
		System.out.println("Please input the number: ");
		boolean correctInput = false;
		int number = 1;
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
		
		System.out.println("Please input the exponentiation: ");
		correctInput = false;
		int power = 1;
		while(correctInput == false)
		{
			try 
			{
				Scanner s = new Scanner(System.in);  
				power = s.nextInt();
				correctInput = true;
			} 
			catch (Exception e) 
			{
				System.out.println("Wrong Input, Please Try Again:");
				correctInput = false;
			}
		}
		
		int result = number;
		for(int i = 1; i < power; i ++)
		{
			result = result * number;
		}
		
		System.out.println("the power of a number is " + result);
		
	}
}