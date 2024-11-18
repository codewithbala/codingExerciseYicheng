class Question135
{
	public static void main(String[] args) 
	{
		// 135. Write a program to find the maximum sum rectangle in a 2D matrix
		int arr[][] = new int[][] { 
			{  1,  2, -1, -4, -20 },
			{ -8, -3,  4,  2,   1 },
			{  3,  8, 10,  1,   3 },
			{ -4, -1,  1,  7,  -6 } };
		int[][] res = maxSumRectangle(arr);
		for(int i = 0; i< res.length; i++)
		{
			for(int j = 0; j < res[0].length; j++)
			{
				System.out.print(res[i][j] + " ");
			}
			System.out.print("\n");
		}
		
		
	}
	
	public static int[][] maxSumRectangle(int[][] m)
	{
		if(m.length == 0)
		{
			return null;
		}
		
		int max = m[0][0];
		int x1 = 0;
		int x2 = 0;
		int y1 = 0;
		int y2 = 0;
		for(int i = 0; i < m.length; i++)
		{
			for(int j = 0; j < m[0].length; j++)
			{
				for(int p=0; p < m.length; p++)
				{
					for(int q=0; q < m[0].length; q++)
					{
						
						int maxt = 0;
						for(int k = i; k<= p; k++)
						{
							for(int l=j; l <=q; l++)
							{
								maxt = maxt + m[k][l];
							}
						}
						
						if(maxt > max)
						{
							max = maxt;
							x1 = i;
							x2 = p;
							y1 = j;
							y2 = q;
						}
						
					}
				}
			}
		}
		
		int[][] result = new int[x2-x1+1][y2-y1+1];
		for(int x = 0; x < result.length; x++)
		{
			for(int y = 0; y < result.length; y++)
			{
				result[x][y] = m[x1+x][y1+y];
			}
		}
		return result;
		
	}
}