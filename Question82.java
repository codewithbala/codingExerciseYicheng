class Question82 {
	public static void main(String[] args) 
	{
		// 82. Write a program to find the majority element in an array (appearing more than n/2 times).
		int[] arr = {1, 1, 2, 1, 3, 5, 1};
		System.out.println(majorityElement(arr)); 
		
	}
	
	public static int majorityElement(int[] arr) 
	{
		int n = arr.length; 
		for (int i = 0; i < n; i++) 
		{
			int count = 0;
			for (int j = 0; j < n; j++) 
			{
				if (arr[i] == arr[j]) 
				{
					count++;
				}
			}
			
			if (count > n / 2) 
			{
				return arr[i];
			}
		}
		
		return -1;
	}
}