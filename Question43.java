class Question43 {
	public static void main(String[] args) 
	{
		// 43. Write a program to find the maximum product of two integers in an array. 
		
		int[] arr = {2,3,4,6,8,-1,-9,10,-2};
		
		int a = arr[0], b = arr[1]; 
		
		for (int i = 0; i < arr.length; i++) 
		{
			for (int j = i + 1; j < arr.length; j++)
			{
				if (arr[i] * arr[j] > a * b)
				{ 
					a = arr[i];  
					b = arr[j]; 
				} 
			} 
			     
		}
		  
		       
		System.out.println("Max product is " + 
				   a + " * " + b + " = " + a*b); 
	}
}