class Question44 {
	public static void main(String[] args) {
		// 44. Write a program to find the sum of all elements in an array. 
		int[] arr = {2,3,4,6,8,-1,-9,10,-2};
		
		int sum = 0; 
		
		for (int i = 0; i < arr.length; i++) 
		{
			sum = sum + arr[i];
			     
		}
		  
		       
		System.out.println("the sum of all elements is " + sum); 
	}
}