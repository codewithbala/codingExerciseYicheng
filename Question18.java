class Question18 {
	public static void main(String[] args) 
	{
		//18. Write a program to check if an array is sorted. 
		int[] array = {1,2,3,5,4,7,8,9};
		//int[] array = {2,2,2,2,2,2,2,3};
		//int[] array = {2,2,2,2,2,2,2,1};
		//int[] array = {1,2,3,5,7,8,9};
		//int[] array = {1,1};
		//int[] array = {1,2};
		//int[] array = {1};
		
		if(array.length <=1)
		{
			System.out.println("Array is sorted");
		}
		else 
		{
			boolean increase = true;
			for(int i = 1; i < array.length; i++)
			{
				if(array[i-1] <= array[i])
				{
					increase = true;
				}
				else 
				{
					increase = false;
					break;
				}
			}
			
			if(increase == false)
			{
				boolean decrease = true;
				for(int i = 1; i < array.length; i++)
				{
					if(array[i-1] >= array[i])
					{
						decrease = true;
					}
					else 
					{
						decrease = false;
						break;
					}
				}
				
				if(decrease == false)
				{
					System.out.println("Array is not sorted");
				}
				else 
				{
					System.out.println("Array is sorted");
				}
			}
			else 
			{
				System.out.println("Array is sorted");
				
			}
		}
		
	}
}