import java.util.*;

class Question46 {
	public static void main(String[] args) 
	{
		System.out.println("#46. Write a program to convert a decimal number to binary.");
		System.out.println("Please input a number : ");
		
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
		
		System.out.println("The binary number is " + Integer.toBinaryString(number));
		
	}
}