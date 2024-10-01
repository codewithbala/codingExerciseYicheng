import java.util.*;

class Question21 {
	public static void main(String[] args) 
	{
		//21. Write a program to remove duplicates from an array. 
		
		int[] array = {2,4,5,2,4,8,7,9,0,3,5,8,0,2};
		
		
		ArrayList<Integer> tmpList = new ArrayList<Integer>();
		
		for(int i = 0; i < array.length; i++)
		{
			boolean contain = false;
			for(int j = 0; j < tmpList.size(); j++)
			{
				if(array[i] == tmpList.get(j))
				{
					contain = true;
				}
			}
			if(contain == false)
			{
				tmpList.add(array[i]);
			}
		}
		
		System.out.println(tmpList);
		
	}
}