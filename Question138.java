import java.util.*;

class Question138 {
	public static void main(String[] args) 
	{
		// 138. Write a program to find all anagrams in a string. 
		findAnagrams("cbaebabacd","abc");
	}
	
	public static void findAnagrams(String s, String p)
	{
		int end = p.length();
		int i = 0;
		while(end < s.length())
		{
			String s1 = s.substring(i, end);
			
			char[] array1 = s1.toCharArray();
			char[] array2 = p.toCharArray();
			
			Arrays.sort(array1);
			Arrays.sort(array2);
			if(Arrays.equals(array1, array2))
			{
				System.out.print(i + " ");
			}
			
			i++;
			end++;
		}

	}
}