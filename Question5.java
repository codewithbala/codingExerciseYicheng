import java.util.*;  

class Question5
{
	public static void main(String[] args) 
	{
		
		System.out.println("#5 Write a program to check if a number is prime.");
		System.out.println("Please input a int number: ");
		
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
		
		number = number > 0 ? number: number * -1;
		
		int i = 2;
		while( i*i <= number)
		{
			if( number%i == 0)
			{
				System.out.println(number + " is not a prime number");
				return;
			}
			else 
			{
				i++;
			}
		}
		System.out.println(number + " is a prime number");
		  
		
	}
}