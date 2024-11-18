class Question127
{
	public static void main(String[] args) 
	{
		// 127. Write a program to solve the N-Queens problem using backtracking.  
		int n = 4;
		int[][] board = new int[n][n];
		if (solveNQ(board, n, 0) == false) 
		{
			System.out.print("Solution does not exist");
		}
		else 
		{
			printSolution(board);
		}
		
	}
	
	
	public static boolean solveNQ(int board[][], int n, int col)
	{
		if (col >= n)
		{
			return true;
		}
		else 
		{
			for (int i = 0; i < n; i++) 
			{
				boolean isSafe = true;
				
				for (int j = 0; j < col; j++)
				{
					if (board[i][j] == 1)
					{
						isSafe = false;
					}
				}
				
				for (int j = i, k = col; j >= 0 && k >= 0; j--, k--)
				{
					if (board[j][k] == 1)
					{
						isSafe = false;
					}
				}
				for (int j = i, k = col; k >= 0 && j < n; j++, k--)
				{
					if (board[j][k] == 1)
					{
						isSafe = false;
					}
				}
				
				if(isSafe)
				{
					board[i][col] = 1;
					if (solveNQ(board, n, col + 1) == true)
					{
						return true;
					}
					else 
					{
						board[i][col] = 0;
					}
					
					
				}
			}
			
			return false;
		}
		
	}
	
	public static void printSolution(int board[][])
	{
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j <  board[0].length; j++) {
				if (board[i][j] == 1)
					System.out.print("Q ");
				else
					System.out.print(". ");
			}
			System.out.println();
		}
	}
}