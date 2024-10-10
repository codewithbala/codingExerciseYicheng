import java.math.*;

class Question54
{
	public static void main(String[] args) 
	{
		// 54. Write a program to find the longest increasing subsequence in an array.
		int[] arr = {10, 22, 9, 33, 21, 50, 41, 60};
		
		int n = arr.length;
		int res = 1;
		for (int i = 1; i < arr.length; i++)
		{
			res = Math.max(res, restLongestIncreaseSubeQuence(arr, i));
		}
		System.out.println("Length of lis is " + res);
		
	}
	
	public static int restLongestIncreaseSubeQuence(int[] arr, int index)
	{
		if(index == 0 )
		{
			return 1;
		}
		else 
		{
			int max = 1;
			for (int i = 0; i < index; i++)
			{
				if (arr[i] < arr[index])
				{
					max = Math.max(max, restLongestIncreaseSubeQuence(arr, i) + 1);
				}
			}
			return max;
		}
	}
	
	
}