import java.util.*;

class Question68 
{
	public static void main(String[] args) 
	{
		System.out.println("#68. Write a program to find the first non-repeating character in a string.");
		System.out.println("Please input a string : ");

		Scanner s = new Scanner(System.in);  
		String string = s.nextLine();
		
		System.out.println(firstNonRepeatChar(string));
	}
	
	public static char firstNonRepeatChar(String s)
	{
		char[] array = s.toCharArray();
		int i = 0;
		while(i < array.length)
		{
			char a = array[i];
			boolean findSame = false;
			int j = 0;
			while(j < array.length)
			{
				if(a == array[j] && i != j)
				{
					findSame = true;
					break;
				}
				j++;
			}
			
			if(findSame == false)
			{
				return a;
			}
			i++;
		}
		return ' ';
	}
}