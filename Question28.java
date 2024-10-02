import java.util.regex.*;
import java.util.*;

class Question28 {
	public static void main(String[] args) 
	{
		System.out.println("#28. Write a program to check if a string contains only digits. ");
		System.out.println("Please input a string : ");

		Scanner s = new Scanner(System.in);  
		String string = s.nextLine();
		
		String regex = "[0-9]+"; 
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(string); 
		if(m.matches())
		{
			System.out.println("The string contains only digits.");
		}
		else 
		{
			System.out.println("The string does not contain only digits.");
		}
		
		
	}
}