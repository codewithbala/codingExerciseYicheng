class Question132
{
	public static void main(String[] args)
	{
		// 132. Write a program to implement Dijkstra’s algorithm for shortest paths. 
		int graph[][] = new int[][] 
						  { { 0, 4, 0, 0, 0, 0, 0, 8, 0 },
							{ 4, 0, 8, 0, 0, 0, 0, 11, 0 },
							{ 0, 8, 0, 7, 0, 4, 0, 0, 2 },
							{ 0, 0, 7, 0, 9, 14, 0, 0, 0 },
							{ 0, 0, 0, 9, 0, 10, 0, 0, 0 },
							{ 0, 0, 4, 14, 10, 0, 2, 0, 0 },
							{ 0, 0, 0, 0, 0, 2, 0, 1, 6 },
							{ 8, 11, 0, 0, 0, 0, 1, 0, 7 },
							{ 0, 0, 2, 0, 0, 0, 6, 7, 0 } };
		dijkstra(graph, 0);
	}
	
	public static void dijkstra(int graph[][], int src)
	{
		int dist[] = new int[graph.length];
		Boolean sptSet[] = new Boolean[graph.length];
		for (int i = 0; i < graph.length; i++) 
		{
			dist[i] = Integer.MAX_VALUE;
			sptSet[i] = false;
		}
		dist[src] = 0;
		for (int count = 0; count < graph.length - 1; count++) 
		{
			
			int min = Integer.MAX_VALUE; 
			int u = -1;

			for (int v = 0; v < graph.length; v++)
			{
				if (sptSet[v] == false && dist[v] <= min) 
				{
					min = dist[v];
					u = v;
				}
			}
			
			sptSet[u] = true;
			for (int v = 0; v < graph.length; v++)
			{
				if (!sptSet[v] && graph[u][v] != 0 && dist[u] != Integer.MAX_VALUE && dist[u] + graph[u][v] < dist[v])
				{
					dist[v] = dist[u] + graph[u][v];
				}
			}
		}
		
		for (int i = 0; i < graph.length; i++)
		{
			System.out.println("to " + i + " : " + dist[i]);
		}
	}
}