import java.util.*;

class Question96 {
	public static void main(String[] args) 
	{
		// 96. Write a program to find the kth smallest element in an unsorted array. 
		
		int[] array = {3,2,7,2,5,9,0,1};
		int k = 3;
		
		if(array.length < 1)
		{
			System.out.println("array is empty");
		}
		else if(array.length < k)
		{
			System.out.println("array length less than k");
		}
		else 
		{
			Arrays.sort(array);
			System.out.println(array[k-1]);
		}
		
	}
}