import java.util.*;

class Question14 
{
	public static void main(String[] args) 
	{
		System.out.println("#14 Write a program to print the factors of a number.");
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
		
		System.out.print("1 ");
		
		while( number % 2 == 0)
		{
			System.out.print("2 ");
			number = number / 2;
		}

		int i = 3;
		while(i <= number)
		{
			if(number % i == 0)
			{
				System.out.print(i + " ");
				number = number / i;
			}
			else 
			{
				i = i + 2;
			}
		}
	}
}