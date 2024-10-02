import java.util.*;

class Question26
{
	public static void main(String[] args) 
	{
		System.out.println("#26. Write a program to reverse words in a string.");
		System.out.println("Please input a string : ");

		Scanner s = new Scanner(System.in);  
		String string = s.nextLine();
		
		String[] array = string.split(" ");
		String result = "";
		for(String tmp:array)
		{
			result = tmp + " " + result;
		}
		
		System.out.println(result);
		
	}
}