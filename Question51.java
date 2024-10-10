class Question51 {
	public static void main(String[] args) 
	{
		// 51. Write a program to rotate a 2D matrix 90 degrees.
		int[][] matrix = {{1,2},{4,5},{7,8}};
		
		System.out.println("matrix is ");
		for(int i = 0; i < matrix.length; i++)
		{
			
			for(int j = 0; j < matrix[0].length; j++)
			{
				System.out.print(matrix[i][j] + " ");
			}
			System.out.print("\n");
		}
		
		
		int[][] rMatrix = new int[matrix[0].length][matrix.length];
		for(int i = 0; i < matrix.length; i++)
		{
			
			for(int j = 0; j < matrix[0].length; j++)
			{
				rMatrix[j][matrix[0].length - i] = matrix[i][j];
			}
		}
		
		System.out.println("\nrotate matrix is ");
		for(int i = 0; i < rMatrix.length; i++)
		{
			
			for(int j = 0; j < rMatrix[0].length; j++)
			{
				System.out.print(rMatrix[i][j] + " ");
			}
			System.out.print("\n");
		}
		
		
	}
}