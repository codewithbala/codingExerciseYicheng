import java.util.*;  

class Question7 
{
	public static void main(String[] args) 
	{
		System.out.println("#7 Write a program to find the greatest common divisor (GCD) of two numbers.");
		
		System.out.println("Please input the first number: ");
		boolean correctInput = false;
		int number1 = 1;
		while(correctInput == false)
		{
			try 
			{
				Scanner s = new Scanner(System.in);  
				number1 = s.nextInt();
				correctInput = true;
			} 
			catch (Exception e) 
			{
				System.out.println("Wrong Input, Please Try Again:");
				correctInput = false;
			}
		}
		
		System.out.println("Please input the second number: ");
		correctInput = false;
		int number2 = 1;
		while(correctInput == false)
		{
			try 
			{
				Scanner s = new Scanner(System.in);  
				number2 = s.nextInt();
				correctInput = true;
			} 
			catch (Exception e) 
			{
				System.out.println("Wrong Input, Please Try Again:");
				correctInput = false;
			}
		}
		
		int minNumber = number1 < number2 ? number1 : number2;
		int GCD = 1;
		for(int i = 1; i < minNumber; i++)
		{
			if((number1%i == 0) && (number2%i == 0))
			{
				GCD = i;
			}
		}
		
		System.out.println("The greatest common divisor is " + GCD);
	}
}