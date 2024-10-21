import java.util.*;

class Node
{
	int v;
	Node prev;
	
	Node(int v)
	{
		this.v = v;
		prev = null;
	}
}


class Graph
{
	int[] V;
	int[][] E;
	
	Graph(int[] V, int[][] E)
	{
		this.V = V;
		this.E = E;
	}
	
	void BFS(int s, int t)
	{
		List<Node> Q = new ArrayList<Node>();
		HashSet<Integer> visited = new HashSet<Integer>();
		
		Q.add(new Node(s));
		Node tNode = null;
		while(Q.size() > 0)
		{
			Node node = Q.get(0);
			if(node.v == t)
			{
				tNode = node;
				break;
			}
			
			Q.remove(0);
			visited.add(node.v);
			int i = 0;
			while(i < E.length)
			{
				int tmp = -1;
				if(node.v == E[i][0])
				{
					tmp = E[i][1];
				}
				
				if(node.v == E[i][1])
				{
					tmp = E[i][0];
				}
				if(tmp != -1 && !visited.contains(tmp))
				{
					visited.add(tmp);
					Node nNode = new Node(tmp);
					nNode.prev = node;
					Q.add(nNode);
				}
				i++;
			}
			
			
		}
		
		while(tNode != null)
		{
			System.out.print(tNode.v + " -> ");
			tNode = tNode.prev;
		}
	}
}



class Question80
{
	public static void main(String[] args) 
	{
		// 80. Write a program to find the shortest path in an unweighted graph using BFS.
		int[][] E = {{0, 1}, {1, 2}, {0, 3}, {3, 4}, {4, 7}, {3, 7}, {6, 7}, {4, 5}, {4, 6}, {5, 6}};
		int[] V = {0, 1, 2, 3, 4, 5, 6, 7};
		
		Graph g = new Graph(V, E);
		g.BFS(0, 7);
		
	}
}