import java.util.*;

class Question2 
{
	public static void main(String[] args) 
	{
		System.out.println("#2 Write a program to check if a string is a palindrome.");
		System.out.println("Please input a string : ");

		Scanner s = new Scanner(System.in);  
		String string = s.nextLine();
		
		int i = 1;
		int j = string.length();
		
		while(i < j)
		{
			if(string.charAt(i-1) != string.charAt(j-1))
			{
				System.out.println("'" + string + "' is not a palindrome");
				return;
			}
			i++;
			j--;
		}
		
		System.out.println("'" + string + "' is a palindrome");
		
	}
}