import java.util.*;

class Question67 {
	public static void main(String[] args) 
	{
		System.out.println("#67. Write a program to implement the power function (x^n).");
		System.out.println("Please input a number: ");
		
		boolean correctInput = false;
		double number = -1;
		
		while(correctInput == false)
		{
			try 
			{
				Scanner s = new Scanner(System.in);  
				number = s.nextDouble();
				correctInput = true;
			} 
			catch (Exception e) 
			{
				System.out.println("Wrong Input, Please Try Again:");
				correctInput = false;
			}
		}
		
		correctInput = false;
		int power = 0;
		System.out.println("Please input the power: ");
		while(correctInput == false)
		{
			try 
			{
				Scanner s = new Scanner(System.in);  
				power = s.nextInt();
				if(power >= 0)
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
		
		System.out.println(power(number,power));
	}
	
	public static double power(double number, int power)
	{
		double res = 1;
		for(int i = 0; i < power; i++)
		{
			res = res * number;
		}
		return res;
	}
}