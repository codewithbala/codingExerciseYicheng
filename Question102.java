import java.util.*;

class Question102
{
	// 102. Write a program to solve the Traveling Salesman Problem using Dynamic Programming. 
	public static void main(String args[])
	{
		int graph[][] = {{0, 10, 15, 20},
						 {10, 0, 35, 25},
						 {15, 35, 0, 30},
						 {20, 25, 30, 0}};
		int s = 0;
		System.out.println(travllingSalesmanProblem(graph, s));
	}
	
	public static ArrayList<Integer> reverse( ArrayList<Integer> data, int left, int right) 
	{
		while (left < right) 
		{ 
			int temp = data.get(left); 
			data.set(left++, data.get(right)); 
			data.set(right--, temp); 
		} 
		return data; 
	}
	
	static int travllingSalesmanProblem(int graph[][], int s)
	{
		ArrayList<Integer> vertex = new ArrayList<Integer>();
		for (int i = 0; i < graph.length; i++)
		{
			if (i != s)
			{
				vertex.add(i);
			}
		}
		int min_path = Integer.MAX_VALUE;
		
		do
		{
			// store current Path weight(cost)
			int current_pathweight = 0;

			// compute current path weight
			int k = s;
			
			for (int i = 0; 
					i < vertex.size(); i++) 
			{
				current_pathweight = current_pathweight + graph[k][vertex.get(i)];
				k = vertex.get(i);
			}
			current_pathweight = current_pathweight + graph[k][s];
			min_path = Math.min(min_path, current_pathweight);

		} while (findNextPermutation(vertex));

		return min_path;
	}
	
	public static ArrayList<Integer> swap( ArrayList<Integer> data, int left, int right) 
	{
		int temp = data.get(left); 
		data.set(left, data.get(right)); 
		data.set(right, temp); 
		return data; 
	}
	
	public static boolean findNextPermutation(ArrayList<Integer> data) 
	{ 
		if (data.size() <= 1) 
		{
			return false; 
		}
		
		int last = data.size() - 2; 
		
		while (last >= 0) 
		{ 
			if (data.get(last) < data.get(last + 1)) 
			{ 
				break; 
			} 
			last--; 
		} 
		
		if(last < 0) 
		{
			return false; 
		}
		
		int nextGreater = data.size() - 1; 
		for (int i = data.size() - 1; i > last; i--) 
		{ 
			if (data.get(i) > data.get(last)) 
			{ 
				nextGreater = i; 
				break; 
			} 
		} 
		
		
		data = swap(data, nextGreater, last); 
		data = reverse(data, last + 1, data.size() - 1); 
		return true; 
	} 
	
}

