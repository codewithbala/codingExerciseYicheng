import java.util.Arrays;
import java.text.*;
import java.util.*;

class Question133
{
	public static void main(String[] args)
	{
		// 133. Write a program to find the smallest window in a string that contains all characters of another string.  
		String s = "timetopractice";
		String p = "toc";

		System.out.println(findSmallestSubstring(s, p));
	}
	
	public static String findSmallestSubstring(String s, String p)
	{
		String t = p;
		
		boolean find = false;
		String result = s;
		for (int i = 0; i < s.length(); i++) 
		{
			for (int j = i; j < s.length(); j++) 
			{
				String substr = s.substring(i, j + 1);
				
				boolean isAnswer = true;
				for(int k = 0; k < t.length(); k++)
				{
					if(substr.indexOf(t.charAt(k)) < 0)
					{
						isAnswer = false;
					}
				}
				
				if(isAnswer == true && result.length() > substr.length())
				{
					result = substr;
					find = true;
					
				}
			}
		}
		
		if(find == true)
		{
			return result;
		}
		else 
		{
			return null;
		}
	}
	
}




