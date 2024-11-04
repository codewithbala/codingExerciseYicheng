class Question110 {
	public static void main(String[] args) 
	{
		// 110. Write a program to implement merge sort using recursion.
		
		int[] array = {1,5,2,4,3,7,9,0,8,6};
		mergeSort(array, 0, 9);
		for(int i:array)
		{
			System.out.print(i + " ");
		}
	}
	
	public static void mergeSort(int[] array, int start, int end) // 0 1 2
	{
		if(end > start)
		{
			if(end - start == 1)
			{
				if(array[start] > array[end])
				{
					int tmp = array[start];
					array[start] = array[end];
					array[end] = tmp;
				}
			}
			else 
			{
				mergeSort(array, start, (start+end)/2);
				
				mergeSort(array, (start+end)/2 + 1, end);
				
				merge(array, start, end);
			}
		}
	}
	
	public static void merge(int[] array, int start, int end)
	{
		int[] tmp = new int[ end - start + 1 ];
		
		int k = 0;
		int i = start;
		int j = (start+end)/2 + 1;
		while( i <= (start+end)/2 || j <= end)
		{
			if( i <= (start+end)/2 && j <= end)
			{
				if(array[i] < array[j])
				{
					tmp[k] = array[i];
					i++;
				}
				else 
				{
					tmp[k] = array[j];
					j++;
				}
			}
			else 
			{
				if(i <= (start+end)/2)
				{
					tmp[k] = array[i];
					i++;
				}
				else 
				{
					tmp[k] = array[j];
					j++;
				}
			}
			k++;
		}
		
		int p = 0;
		int q = start;
		while(p < tmp.length)
		{
			array[q] = tmp[p];
			p++;
			q++;
		}
		
	}
}