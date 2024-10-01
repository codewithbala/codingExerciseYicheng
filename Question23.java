class Question23 {
	public static void main(String[] args) 
	{
		//23. Write a program to merge two sorted arrays. 
		int[] array1 = {1,3,5,6,8,9};
		int[] array2 = {2,4,6,7,10,11};
		
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
		
		for(int k = 0; k < array.length; k++)
		{
			System.out.print(array[k] + " ");
		}
		
		
	}
}