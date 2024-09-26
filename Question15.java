import java.util.*;

class Question15
{
	// 15. Write a program to find the largest element in an array.
	public static void main(String[] args) 
	{
		int[] array = {3,2,7,2,5,9,0,1};
		
		Arrays.sort(array);
		System.out.println(array[array.length - 1]);
	}
}