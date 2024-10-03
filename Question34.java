import java.util.*;

class Question34
{
	public static void main(String[] args) 
	{
		System.out.println("#34. Write a program to find the longest substring without repeating characters. ");
		System.out.println("Please input a string : ");

		Scanner s = new Scanner(System.in);  
		String string = s.nextLine();
		
		int n = string.length();
		int l = 0, r = 0;
		HashSet<Character> visited = new HashSet<>();
		int maxStr = 0;
		int maxL = 0, maxR = 0;
		while (r < n) 
		{
			if (!visited.contains(string.charAt(r))) 
			{
				visited.add(string.charAt(r));
				if (r - l + 1 > maxStr) 
				{
					maxStr = r - l + 1;
					maxL = l;
					maxR = r;
				}
				r++;
			}
			else 
			{
				visited.remove(string.charAt(l));
				l++;
			}
		}
		for (int i = maxL; i <= maxR; i++) 
		{
			System.out.print(string.charAt(i));
		}
		
	}
}