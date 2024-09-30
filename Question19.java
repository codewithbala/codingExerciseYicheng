class Question19 {
	public static void main(String[] args) 
	{
		// 19. Write a program to rotate an array by k positions. 
		
		int[] array = {1,2,3,4,5,6,7,8};
		int k = -3;
		
		int[] tmp = new int[array.length];
		
		k = k % array.length;
		if(k>0)
		{
			for(int i = 0; i < array.length; i++)
			{
				tmp[i] = array[(i+k)%array.length];
				
			}
		}
		else 
		{
			for(int i = 0; i < array.length; i++)
			{
				tmp[ (i-k)%array.length ] = array[i];
				
			}
		}
		
		for(int i = 0; i < tmp.length; i++)
		{
			System.out.print(tmp[i] + " ");
			
		}
		
		
		
	}
}