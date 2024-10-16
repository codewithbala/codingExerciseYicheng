import java.util.*;

class Question62 {
	public static void main(String[] args) 
	{
		// 62. Write a program to find the intersection of two arrays. 
		Integer[] array1 = {1,2,8,6,3,4};
		Integer[] array2 = {2,4,5,7,9,10};
		
		Integer[] res = intersection(array1, array2);
		for(int i : res)
		{
			System.out.print(i + " ");
		}
		
	}
	
	public static Integer[] intersection(Integer[] array1, Integer[] array2)
	{
		List<Integer> a1 = Arrays.asList(array1);
		List<Integer> a2 = Arrays.asList(array2);
		ArrayList<Integer> res = new ArrayList<Integer>();
		
		
		for(int i = 0; i < a1.size(); i++)
		{
			int j = 0;
			while(j < a2.size())
			{
				if(a1.get(i) == a2.get(j))
				{
					res.add(a1.get(i));
					//a2.remove(j);
					break;
				}
				else 
				{
					j++;
				}
			}
		}
		
		Integer[] array = new Integer[res.size()];
		
		return res.toArray(array);
	}
	
}
