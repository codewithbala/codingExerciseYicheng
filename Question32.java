import java.util.*;

class Question32
{
	public static void main(String[] args) 
	{
		System.out.println("#32. Write a program to find the first non-repeating character in a string.");
		System.out.println("Please input a string : ");

		Scanner s = new Scanner(System.in);  
		String string = s.nextLine();
		char c = ' ';
		
		for(int i = 0; i< string.length(); i++)
		{
			c = string.charAt(i);
			boolean nonRepate = true;
			
			for(int j = i + 1 ; j < string.length(); j++)
			{
				if(c == string.charAt(j))
				{
					nonRepate = false;
				}
			}
			
			if(nonRepate == true)
			{
				break;
			}
		}
		
		System.out.println("The first non-repating character is: " + c);
		
		
	}
}