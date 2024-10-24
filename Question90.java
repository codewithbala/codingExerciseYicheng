import java.util.*;

class Graph
{
	char[] V;
	int[][] E;
	
	Graph(char[] v, int[][] e)
	{
		this.V = v;
		this.E = e;
	}
	
	public void DFS(char v)
	{
		HashSet<Integer> visited = new HashSet<Integer>();
		List<Integer> stack = new ArrayList<Integer>();
		
		int p = -1;
		for(int i = 0; i < V.length; i++)
		{
			if(V[i] == v)
			{
				p = i;
				break;
			}
		}
		if(p >= 0)
		{
			stack.add(p);
			while(stack.size() > 0)
			{
				int index = stack.get(stack.size()-1);
				stack.remove(stack.size()-1);
				visited.add(index);
				for(int i = 0; i < E[0].length; i++)
				{
					if(E[index][i] == 1 && !visited.contains(i))
					{
						stack.add(i);
					}
				}
				System.out.println(V[index]);
			}
		}
		else 
		{
			System.out.println("Can not find node " + v);
		}
	}
}





class Question90
{
	public static void main(String[] args) 
	{
		// 90. Write a program to implement a graph using adjacency matrix and perform depth-first search (DFS).
		int[][] E = 
		{
			{0,1,1,0},
			{1,0,0,1},
			{1,0,0,0},
			{0,1,0,0},
		};
		
		char[] V = {'A', 'B', 'C', 'D'};
		
		/*
		A - C
		|
		B
		|
		D
		*/
		
		Graph g = new Graph(V, E);
		g.DFS('A');
		
	}
}