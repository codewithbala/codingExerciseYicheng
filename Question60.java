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


class Question60
{
	public static void main(String[] args) 
	{
		// 60. Write a program to find the number of islands in a 2D grid.
		int[][] grid = {{1,1,1,1,0},{1,1,0,1,0},{1,1,0,0,0},{0,0,0,0,0}};
		System.out.println(findIslands(grid));
		int[][] grid2 = {{1,1,0,0,0},{1,1,0,0,0},{0,0,1,0,0},{0,0,0,1,1}};
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
					boolean contain = false;
					if(contain == false && i > 0)
					{
						contain = hashset.contains(new Position(i - 1, j));
					}
					if(contain == false)
					{
						contain = hashset.contains(new Position(i + 1, j));
					}
					if(contain == false && j > 0)
					{
						contain = hashset.contains(new Position(i, j - 1));
					}
					if(contain == false)
					{
						contain = hashset.contains(new Position(i, j + 1));
					}
					
					if(contain == false)
					{
						count++;
					}
					hashset.add(new Position(i, j));
				}
				j++;
			}
			i++;
		}
		
		return count;
		
	}
	
	
}