import java.util.*;

//16. Write a program to find the second largest element in an array.

class Question16 {
	public static void main(String[] args) 
	{
		int[] array = {3,2,7,2,5,9,0,1};
		
		if(array.length < 1)
		{
			System.out.println("array is empty");
		}
		else if(array.length < 2)
		{
			System.out.println("there is only one element in this array");
		}
		else 
		{
			Arrays.sort(array);
			System.out.println(array[array.length - 2]);
		}
		
		
		
	}
}