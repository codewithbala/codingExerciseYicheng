import java.util.*;

class Question39 {
	public static void main(String[] args) 
	{
		System.out.println("#39. Write a program to find the square root of a number without using built-in methods.");
		System.out.println("Please input a number >= 0 : ");
		
		boolean correctInput = false;
		double number = -1;
		
		while(correctInput == false)
		{
			try 
			{
				Scanner s = new Scanner(System.in);  
				number = s.nextDouble();
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
		
		
		if(number==0)
		{
			System.out.println("Square is "+0);
		}
		
		double g1;
		double squareRoot = number/2;
		
		do
		{
			g1=squareRoot;
			squareRoot = (g1 + (number/g1))/2;
		}
		while((g1-squareRoot)!=0);
		
		System.out.println("Square is "+ squareRoot);
		
		
	}
}