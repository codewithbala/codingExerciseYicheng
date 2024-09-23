import java.util.*;

class Question4
{
	public static void main(String[] args) 
	{
		System.out.println("#4 Write a program to find the Fibonacci sequence up to n terms.");
		System.out.println("Please input the number of terms: ");
		
		boolean correctInput = false;
		int number = 1;
		
		while(correctInput == false)
		{
			try 
			{
				Scanner s = new Scanner(System.in);  
				number = s.nextInt();
				if(number > 0)
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
		
		if(number == 1)
		{
			System.out.println("1");
		}
		else if(number == 2)
		{
			System.out.println("1 1");
		}
		else 
		{
			System.out.print("1 1 ");
			int a = 1;
			int b = 1;
			for(int i = 3; i <= number; i++)
			{
				int next = a + b;
				System.out.print(next + " ");
				a = b;
				b = next;
			}
		}
		
	}
}