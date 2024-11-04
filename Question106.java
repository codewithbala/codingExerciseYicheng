import java.util.*;

class Position
{
	int x;
	int y;
	
	Position(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	
	@Override
	public boolean equals(Object o)
	{
		if(o instanceof Position)
		{
			if(this.x == ((Position)o).x && this.y == ((Position)o).y)
			{
				return true;
			}
			return false;
		}
		
		return false;
	}
	
	@Override
	public final int hashCode()
	{
		return this.x * 1000 + this.y;
	}
	
}


class Question106 {
	public static void main(String[] args) 
	{
		// 106. Write a program to find the number of islands in a 2D matrix using DFS.  
		int[][] grid = {
			{1,1,1,1,0},
			{1,1,0,1,0},
			{1,1,0,0,0},
			{0,0,0,0,0}};
		System.out.println(findIslands(grid));
		
		int[][] grid2 = {
			{1,1,0,0,0},
			{1,1,0,0,0},
			{0,0,1,0,0},
			{0,0,0,1,1}};
		System.out.println(findIslands(grid2));
		
	}
	
	public static int findIslands(int[][] grid)
	{
		HashSet<Position> hashset = new HashSet<Position>();
		int count = 0;
		int i = 0;
		while(i < grid.length)
		{
			int j = 0;
			while(j < grid[0].length)
			{
				if(grid[i][j] == 1)
				{
					count++;
					DFS(grid, i, j);
				}
				j++;
			}
			i++;
		}
		
		return count;
	}
	
	public static void DFS(int[][] grid, int i, int j)
	{
		if(grid[i][j] == 0)
		{
			return;
		}
		else 
		{
			grid[i][j] = 0;
			if(i > 0)
			{
				DFS(grid, i-1, j);
			}
			if(i + 1 < grid.length)
			{
				DFS(grid, i+1, j);
			}
			if(j > 0)
			{
				DFS(grid, i, j-1);
			}
			if(j+1 < grid[0].length)
			{
				DFS(grid, i, j+1);
			}
			
		}
	}
}