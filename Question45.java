import java.util.*;

class Question45 {
	public static void main(String[] args) 
	{
		System.out.println("#45. Write a program to check if a number is a palindrome in binary form.");
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
		
		String binNumber = Integer.toBinaryString(number);
		
		int i = 1;
		int j = binNumber.length();
		
		while(i < j)
		{
			if(binNumber.charAt(i-1) != binNumber.charAt(j-1))
			{
				System.out.println("'" + binNumber + "' is not a palindrome");
				return;
			}
			i++;
			j--;
		}
		
		System.out.println("'" + binNumber + "' is a palindrome");
		
	}
}