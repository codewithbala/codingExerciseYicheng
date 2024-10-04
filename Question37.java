import java.util.*;

class Question37 {
	public static void main(String[] args) 
	{
		System.out.println("#37. Write a program to check if a number is perfect. ");
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
		
		int sum = 0;
		int tmp = number;
		for(int i = 1; i <= tmp; i++)
		{
			if(tmp % i == 0)
			{
				sum = sum + i;
				tmp = tmp / i;
			}
		}
		
		if(sum == number)
		{
			System.out.println("The number is perfect");
		}
		else 
		{
			System.out.println("The number is not perfect");
		}
		
	}
}