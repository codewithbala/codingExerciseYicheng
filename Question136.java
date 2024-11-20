import java.util.Arrays;

class Question136
{
	// 136. Write a program to implement the Rat in a Maze problem using backtracking. 
	public static void main(String[] args) 
	{
		int[][] maze = 
		{
			{1, 0, 0, 0, 0},
			{1, 1, 0, 1, 0},
			{0, 1, 1, 1, 0},
			{0, 0, 0, 1, 0},
			{1, 1, 1, 1, 1}
		};
		
		solveRatMaze(0, 0, maze, new int[maze.length][maze[0].length]);
	}
	
	public static boolean solveRatMaze(int x, int y, int[][] maze, int[][] sol) 
	{
		if (x == maze.length - 1 && y == maze[0].length - 1) 
		{
			sol[x][y] = 1;
			
			for (int i = 0; i < maze.length; i++) 
			{
				System.out.println(Arrays.toString(sol[i]));
			}
			
			return true;
		}
		
		if (x >= 0 && x < maze.length && y >= 0 && y < maze[0].length && maze[x][y] == 1) 
		{
			sol[x][y] = 1;
			if (solveRatMaze(x + 1, y, maze, sol)) 
			{
				return true;
			}
			if (solveRatMaze(x, y + 1, maze, sol)) 
			{
				return true;
			}
			sol[x][y] = 0;
			return false;
		}
		return false;
	}
}