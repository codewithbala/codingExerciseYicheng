import java.util.*;

class Question10
{
	public static void main(String[] args) 
	{
		System.out.println("#10 Write a program to count the number of vowels in a string.");
		System.out.println("Please input a string : ");

		Scanner s = new Scanner(System.in);  
		String string = s.nextLine().toLowerCase();
		int count = 0;
		
		for(int i = 0; i < string.length(); i++)
		{
			char c = string.charAt(i);
			if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
			{
				count++;
			}
		}
		System.out.println("the number of vowels is " + count);
		
	}
}