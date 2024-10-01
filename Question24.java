import java.util.*;

class Question24 {
	public static void main(String[] args) 
	{
		// 24. Write a program to find the intersection of two arrays. 
		
		int[] array1 = {2,4,5,8,7,9,0,3};
		int[] array2 = {1,5,2,8,9,0};
		
		ArrayList<Integer> result = new ArrayList<Integer>();
		
		int i = 0;
		while(i< array1.length)
		{
			int j = 0;
			while(j < array2.length)
			{
				if(array1[i] == array2[j])
				{
					result.add(array1[i]);
				}
				j++;
			}
			i++;
		}
		
		System.out.println(result);
	}
}