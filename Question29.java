import java.util.*;
import java.util.regex.*;

class Question29
{
	public static void main(String[] args) 
	{
		// 
		System.out.println("#29. Write a program to check if a string is a valid email address.");
		System.out.println("Please input your Email: ");

		Scanner s = new Scanner(System.in);  
		String string = s.nextLine();
		
		String regex = "^(\\w+([-.][A-Za-z0-9]+)*){3,18}@\\w+([-.][A-Za-z0-9]+)*\\.\\w+([-.][A-Za-z0-9]+)*$"; 
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(string); 
		if(m.matches())
		{
			System.out.println("The string is email.");
		}
		else 
		{
			System.out.println("The string is not email.");
		}
		
	}
}