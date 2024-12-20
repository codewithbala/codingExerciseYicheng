class Question118 {
	public static void main(String[] args) {
		// 118. Write a program to find all permutations of a given string. 
		String input = "ABC";
		permutation(new StringBuilder(input), 0);
	}
	
	static void permutation(StringBuilder s, int idx) 
	{
		if (idx == s.length() - 1) 
		{
			System.out.println(s);
			return;
		}
		
		for (int i = idx; i < s.length(); i++) 
		{
			swap(s, idx, i);
			permutation(s, idx + 1);
			swap(s, idx, i);
		}
	}
	
	static void swap(StringBuilder s, int i, int j) 
	{
			char temp = s.charAt(i);
			s.setCharAt(i, s.charAt(j));
			s.setCharAt(j, temp);
	}
}