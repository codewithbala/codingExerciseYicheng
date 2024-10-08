import java.util.*;

class Question47 {
	public static void main(String[] args) 
	{
		System.out.println("#47. Write a program to convert a binary number to decimal.");
		System.out.println("Please input a binary number: ");
		
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
		
		int base = 1;
		int result = 0;
		
		int tmp = number;
		while (tmp > 0) 
		{
			int last_digit = tmp % 10;
			tmp = tmp / 10;
			result = result + last_digit * base;
			base = base * 2;
		}
		
		System.out.println("The decimal number is " + result);
		
		
	}
}