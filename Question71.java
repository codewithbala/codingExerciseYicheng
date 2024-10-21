class Question71 
{
	public static void main(String[] args) 
	{
		// 71. Write a program to find the median of two sorted arrays. 
		int[] arr1 = { -5, 3, 6, 12, 15 };
		int[] arr2 = { -12, -10, -6, -3, 4, 10 };
		
		System.out.println(median(arr1,arr2));
	}
	
	public static double median(int[] array1, int[] array2) 
	{
		int i = 0;
		int j = 0;
		int[] array = new int[array1.length + array2.length];
		while(i < array1.length || j < array2.length)
		{
			
			if( i == array1.length && j < array2.length)
			{
				array[i + j] = array2[j];
				j++;
			}
			else if( i < array1.length && j == array2.length )
			{
				array[i + j] = array1[i];
				i++;
			}
			else 
			{
				if(array1[i] < array2[j])
				{
					array[i + j] = array1[i];
					i++;
				}
				else 
				{
					array[i + j] = array2[j];
					j++;
				}
			}
		}
		
		int n =  array.length;
		
		// If length of array is even
		if (n % 2 == 0) 
		{ 
			int mid1 = n / 2;
			int mid2 = mid1 - 1;
			return (array[mid1] + array[mid2]) / 2.0;
		} 
		else 
		{
			return array[n / 2];
		}
	}
	  
}