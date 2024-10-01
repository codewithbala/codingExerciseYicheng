import java.util.*;

class Question22 {
	public static void main(String[] args) 
	{
		// 22. Write a program to count the frequency of elements in an array. 
		
		int[] array = {2,4,5,2,4,8,7,9,0,3,5,8,0,2};
		HashMap<Integer,Integer> hashMap = new HashMap<Integer,Integer>();
		
		for(int i = 0; i < array.length; i++)
		{
			if(hashMap.get(array[i]) != null)
			{
				hashMap.put(array[i], hashMap.get(array[i])+1);
			}
			else 
			{
				hashMap.put(array[i], 1);
			}
		}
		System.out.println(hashMap);
		
	}
}