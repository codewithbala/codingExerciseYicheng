import java.util.*;

class Question25 {
	public static void main(String[] args) 
	{
		// 25. Write a program to find the union of two arrays.
		Integer[] array1 = {2,4,5,8,7,9,0,3};
		Integer[] array2 = {1,5,2,8,9,0};
		
		ArrayList<Integer> result = new ArrayList<Integer>(Arrays.asList(array1));
		
		int i = 0;
		while(i < array2.length)
		{
			if(!result.contains(array2[i]))
			{
				result.add(array2[i]);
			}
			i++;
		}
		
		System.out.println(result);
	}
}