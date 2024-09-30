import java.util.*;

class Question20 {
	public static void main(String[] args) 
	{
		//20. Write a program to find the duplicate elements in an array.
		
		int[] array = {2,4,5,2,4,8,7,9,0,3,5,8,0,2};
		
		HashSet<Integer> hashSet = new HashSet<Integer>();
		
		for(int i = 0; i < array.length; i++)
		{
			for(int j = i + 1; j < array.length; j++)
			{
				if(array[i] == array[j])
				{
					if(!hashSet.contains(array[i]))
					{
						System.out.print(array[i] + " ");
						hashSet.add(array[i]);
					}
					
					break;
				}
			}
		}
		
	}
}