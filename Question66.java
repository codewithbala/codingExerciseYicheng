class Question66 
{
	public static void main(String[] args) 
	{
		// 66. Write a program to find all the permutations of an array.
		int[] array = {1,2,3};
		permutation(array, 0);
	}
	
	static void permutation(int[] array, int idx) 
	{
		if (idx == array.length - 1) 
		{
			for(int e: array)
			{
				System.out.print(e + " ");
			}
			System.out.print("\n");
			return;
		}
		
		for (int i = idx; i < array.length; i++) 
		{
			swap(array, idx, i);
			permutation(array, idx + 1);
			swap(array, idx, i);
		}
	}
	
	static void swap(int[] array, int i, int j) 
	{
			int temp = array[i];
			array[i] = array[j];
			array[j] = temp;
	}
}