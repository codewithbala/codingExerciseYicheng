class Question73 {
	public static void main(String[] args) 
	{
		// 73. Write a program to find the maximum product subarray. 
		int[] array = {-2, 6, -3, -10, 0, 2};
		System.out.println(maxProduct(array));
	}
	
	public static int maxProduct(int arr[]) 
	{ 
		int n = arr.length;
		int result = arr[0];

		for (int i = 0; i < n; i++) 
		{
			int tmp = 1;
			for (int j = i; j < n; j++) 
			{
				tmp = tmp * arr[j];
				
				result = result > tmp ? result : tmp;
			}
		}
		return result;
	}
}