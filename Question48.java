import java.util.*;

class Question48 {
	public static void main(String[] args) 
	{
		// 48. Write a program to find the median of an array. 
		int[] array2 = {1, 2, 3, 4, 5, 6};
		
		Arrays.sort(array2);
		int size = array2.length;
		if(array2.length % 2 == 1)
		{
			System.out.println(array2[size / 2 ]);
		}
		else 
		{
			System.out.println((float)(array2[(size -1)/2] + array2[size/2])/2);
		}
		
	}
}