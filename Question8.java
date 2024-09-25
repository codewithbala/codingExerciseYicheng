import java.util.*;  

class Question8 
{
	public static void main(String[] args) 
	{
		System.out.println("#8 Write a program to find the least common multiple (LCM) of two numbers.");
		
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
		
		int i = 1;
		while(true)
		{
			if(((minNumber*i) % number1 == 0) && ((minNumber*i) % number2 == 0))
			{
				System.out.println("The least common multiple is " + minNumber*i);
				break;
			}
			i++;
		}
		
	}
}