import java.util.*;

class Question30 {
	public static void main(String[] args) 
	{
		System.out.println("#30. Write a program to find the longest palindrome in a string.");
		System.out.println("Please input a string : ");
		
		Scanner s = new Scanner(System.in);  
		String string = s.nextLine();
		
		int n = string.length();
		boolean[][] dp = new boolean[n][n];

		// All substrings of length 1 are palindromes
		int maxLen = 1;
		int start = 0;

		for (int i = 0; i < n; ++i)
		{
			dp[i][i] = true;
		}
		
		// Check for sub-string of length 2
		for (int i = 0; i < n - 1; ++i) 
		{
			if (string.charAt(i) == string.charAt(i + 1)) 
			{
				dp[i][i + 1] = true;
				start = i;
				maxLen = 2;
			}
		}

		// Check for lengths greater than 2
		for (int k = 3; k <= n; ++k) 
		{
			for (int i = 0; i < n - k + 1; ++i) 
			{
				int j = i + k - 1;

				if (dp[i + 1][j - 1] && string.charAt(i) == string.charAt(j)) 
				{
					dp[i][j] = true;
					if (k > maxLen) 
					{
						start = i;
						maxLen = k;
					}
				}
			}
		}
		
		System.out.println(string.substring(start, start + maxLen));
		
	}
}