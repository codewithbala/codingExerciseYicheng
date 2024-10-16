import java.util.*;

class Question63 {
	public static void main(String[] args) {
		// 63. Write a program to check if a given string is an anagram of another string. 
		String str1 = "listen";
		String str2 = "silent";

		System.out.println(anagram(str1, str2));
		
	}
	
	public static boolean anagram(String s1, String s2)
	{
		char[] charArray1 = s1.toCharArray();
		char[] charArray2 = s2.toCharArray();
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);
		
		return Arrays.equals(charArray1, charArray2);
	}
}