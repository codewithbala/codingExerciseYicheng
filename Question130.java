class Question130
{
	public static void main(String[] args) 
	{
		// 130. Write a program to generate all subsets of a given set.
		int[] array = {1,2,3};
		findSubsets(array);
	}
	
	public static void findSubsets(int[] arry)
	{
		int[] tmp = new int[arry.length];
		
		int numSub = 1;
		for(int i = 0; i < tmp.length; i++)
		{
			numSub = numSub * 2;
		}
		
		for(int i = 0; i < numSub; i++)
		{
			int j = 0;
			while(j < tmp.length)
			{
				if(tmp[j] == 0)
				{
					tmp[j] = 1;
					break;
				}
				else 
				{
					tmp[j] = 0;
					j++;
				}
			}
			
			System.out.print("{ ");
			
			for(int k = 0; k < tmp.length; k++)
			{
				if(tmp[k] == 1)
				{
					System.out.print(arry[k] + " ");
				}
				
			}
			System.out.print("}\n");
		}
	}
}