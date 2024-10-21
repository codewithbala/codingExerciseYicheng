class Question78 {
	public static void main(String[] args) 
	{
		//78. Write a program to find the missing number in a given array. 
		int n = 8;
		int[] array = {1,2,4,6,7,8};
		
		int[] tmp = new int[n];

		// Store frequencies of elements
		for (int i = 0; i < array.length; i++) 
		{
			tmp[array[i]-1] = 1;
		}

		// Find the missing number
		for (int i = 1; i < n; i++) 
		{
			if (tmp[i] == 0) 
			{
				System.out.print(i+1 + " ");
			}
		}
	}
}