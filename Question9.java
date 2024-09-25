import java.util.*;

class Question9
{
	public static void main(String[] args) 
	{
		System.out.println("#9 Write a program to check if two strings are anagrams.");
		System.out.println("Please input the first string : ");

		Scanner s = new Scanner(System.in);  
		String string1 = s.nextLine();
		string1 = string1.toLowerCase();
		char[] array1 = string1.toCharArray();
		
		System.out.println("Please input the second string : ");
		String string2 = s.nextLine();
		string1 = string2.toLowerCase();
		char[] array2 = string1.toCharArray();
		
		if(array1.length != array2.length)
		{
			System.out.println("Two strings are not anagrams.");
			return;
		}
		
		Arrays.sort(array1);
		Arrays.sort(array2);
		
		if(Arrays.equals(array1, array2))
		{
			System.out.println("Two strings are anagrams.");
		}
		else 
		{
			System.out.println("Two strings are not anagrams.");
		}
		
		
		
	}
}