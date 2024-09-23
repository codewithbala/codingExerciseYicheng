import java.util.*;

class Question1
{
	public static void main(String[] args) 
	{
		System.out.println("#1 Write a program to reverse a string.");
		System.out.println("Please input a string : ");

		Scanner s = new Scanner(System.in);  
		String string = s.nextLine();
		String reverse = "";
		
		for(int i = 0; i < string.length(); i++)
		{
			reverse = string.charAt(i) + reverse;
		}
		System.out.println(reverse);
		
	}
}