class Question61 {
	public static void main(String[] args) {
		// 61. Write a program to implement binary search on a sorted array. 
		int[] array = {1,3,5,7,9,11,15};
		System.out.println(binarySearch(array, 5));
	}
	
	public static boolean binarySearch(int[] array, int t)
	{
		int i = 0;
		int j = array.length - 1;
		while(i <= j)
		{
			if(array[i + (j-i)/2] == t)
			{
				return true;
			}
			else 
			{
				if(array[i + (j-i)/2] < t)
				{
					i = i + (j-i)/2 + 1;
				}
				else 
				{
					j = i + (j-i)/2 - 1;
				}
			}
		}
		return false;
		
	}
}