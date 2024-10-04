import java.util.*;

class Question40 {
	public static void main(String[] args) 
	{
		System.out.println("#40. Write a program to find the sum of the first n natural numbers.");
		System.out.println("Please input a natural number: ");
		
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
		
		int sum = (1 + number) * number / 2;
		System.out.println("The sum is " + sum);
	}
}