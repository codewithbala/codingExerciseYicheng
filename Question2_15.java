class Question2_15 {
	// 15. Write a program to implement the Floyd-Warshall algorithm for all-pairs shortest paths. 
	public static void main(String[] args)
	{
			int m = 999;
			int[][] graph = { 
				{ 0, 4, m, 5, m},
				{ m, 0, 1, m, 6},
				{ 2, m, 0, 3, m},
				{ m, m, 1, 0, 2},
				{ 1, m, m, 4, 0}};
				
			floydWarshall(graph);
	}
	
	public static void floydWarshall(int dist[][])
	{
		for (int k = 0; k < dist.length; k++) 
		{
			for (int i = 0; i < dist.length; i++) 
			{
				for (int j = 0; j < dist.length; j++) 
				{
					if ( (dist[i][k] + dist[k][j]) < dist[i][j])
					{
						dist[i][j] = dist[i][k] + dist[k][j];
					}
										
				}
			}
		}
		
		for (int i = 0; i < dist.length; ++i) 
		{
			for (int j = 0; j < dist.length; ++j) 
			{
				if (dist[i][j] == 999)
				{
					System.out.print("- ");
				}
				else
				{
					System.out.print(dist[i][j] + " ");
				}
			}
			System.out.println();
		}
	}
}
