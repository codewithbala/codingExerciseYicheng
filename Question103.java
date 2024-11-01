import java.util.*;


class Question103 {
	public static void main(String[] args) 
	{
		// 103. Write a program to implement KMP (Knuth-Morris-Pratt) pattern matching algorithm.
		String txt = "geeksforgeeks";
		String pat = "geeks";
		  
		List<Integer> result = KMPSearch(pat, txt);
		
		for (int index : result) 
		{
			System.out.print(index + " ");
		}
	}
	
	static List<Integer> KMPSearch(String pat, String txt)
	{
		int M = pat.length();
		int N = txt.length();
		int[] lps = new int[M];
		List<Integer> result = new ArrayList<>();
		computeLPSArray(pat, M, lps);

		int i = 0; 
		int j = 0; 
		while ((N - i) >= (M - j)) 
		{
			if (pat.charAt(j) == txt.charAt(i)) 
			{
				j++;
				i++;
			}

			if (j == M) 
			{
				result.add(i - j + 1);
				j = lps[j - 1];
			}
			else if (i < N && pat.charAt(j) != txt.charAt(i)) 
			{
				if (j != 0) 
				{
					j = lps[j - 1];
				}
				else 
				{
					i = i + 1;
				}
			}
		}
		return result;
	}
	
	static void computeLPSArray(String pat, int M, int[] lps)
	{
		int len = 0;
		lps[0] = 0;
		int i = 1;
		while (i < M) {
			if (pat.charAt(i) == pat.charAt(len)) {
				len++;
				lps[i] = len;
				i++;
			}
			else {
				if (len != 0) {
					len = lps[len - 1];
				}
				else {
					lps[i] = 0;
					i++;
				}
			}
		}
	}
}