import java.util.*;
import java.util.regex.*;

class Question88
{
	public static void main(String[] args) 
	{
		System.out.println("#88. Write a program to check if a string is a valid number (can be integer or decimal).");
		System.out.println("Please input a string : ");

		Scanner s = new Scanner(System.in);  
		String string = s.nextLine();
		
		System.out.println(isNumeric(string));
		


	}
	
	public static boolean isNumeric(String str) 
	{
		Pattern pattern = Pattern.compile("^-?\\d+(\\.\\d+)?$");
		Matcher isNum = pattern.matcher(str);
		if (!isNum.matches()) 
		{
			return false;
		}
		return true;
	}
	
	
}