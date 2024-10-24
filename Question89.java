import java.util.*;

class Question89 {
	public static void main(String[] args) 
	{
		// 89. Write a program to find the longest consecutive sequence in an unsorted array. 
		int arr[] = { 1, 9, 3, 10, 4, 20, 2 };
		findLongestConseqSubseq(arr);
	}
	
	
	public static void findLongestConseqSubseq(int arr[])
	{
		HashMap<Integer,List<Integer>> res = new HashMap<Integer, List<Integer>>();
		
		Arrays.sort(arr);
		int a1 = arr[0];
		int count = 1;
		int max = 0;
		List<Integer> l = new ArrayList<Integer>();
		l.add(a1);
		for(int i = 1; i < arr.length; i++)
		{
			if(arr[i] == arr[i-1] + 1)
			{
				count++;
				l.add(arr[i]);
			}
			else 
			{
				res.put(count, l);
				if(count > max)
				{
					max = count;
				}
				count = 1;
				l = new ArrayList<Integer>();
				l.add(arr[i]);
			}
		}
		
		if(count > max)
		{
			max = count;
		}
		
		System.out.println(res.get(max));
		
	}
}