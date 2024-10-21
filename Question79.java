
class Question79 
{
	public static void main(String[] args) 
	{
		//79. Write a program to find the longest common subsequence (LCS) between two strings. 
		String s1 = "AGGTAB";
		String s2 = "GXTXAYB";
		System.out.println(lcs(s1,s2));
	}
	
	public static String lcs(String s1, String s2) 
	{
		if (s1.length() == 0 || s2.length() == 0)
		{
			return "";
		}
		
		if ( s1.charAt(0) == s2.charAt(0) )
		{
			return String.valueOf(s1.charAt(0)) + lcs(s1.substring(1, s1.length()), s2.substring(1, s2.length()));
		}
		else
		{
			String ts1 = lcs(s1, s2.substring(1, s2.length()));
			String ts2 = lcs(s1.substring(1, s1.length()), s2);
			return ts1.length() > ts2.length() ?  ts1 : ts2;
		}
			
	}
}