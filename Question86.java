import java.util.*;

class PriorityQueue 
{
	private List<Integer> data;

	public PriorityQueue() 
	{
		this.data = new ArrayList<Integer>();
	}

	public void push(int item) 
	{
		data.add(item);
		
		int ci = data.size() - 1;
		while (ci > 0) 
		{
			int pi = (ci - 1) / 2;
			if (data.get(ci).compareTo(data.get(pi)) <= 0)
			{
				break;
			}
			Integer tmp = data.get(ci);
			data.set(ci, data.get(pi));
			data.set(pi, tmp);
			ci = pi;
		}
	}

	public Integer pop() 
	{
		int li = data.size() - 1;
		Integer frontItem = data.get(0);
		data.set(0, data.get(li));
		data.remove(li);

		--li;
		int pi = 0;
		
		while (true) 
		{
			int ci = pi * 2 + 1;
			if (ci > li)
			{
				break;
			}
			int rc = ci + 1;
			if (rc <= li && data.get(rc).compareTo(data.get(ci)) > 0)
			{
				ci = rc;
			}
				
			if (data.get(pi).compareTo(data.get(ci)) >= 0)
			{
				break;
			}
				
			Integer tmp = data.get(pi);
			data.set(pi, data.get(ci));
			data.set(ci, tmp);
			pi = ci;
		}
		return frontItem;
	}
}

class Question86
{
	public static void main(String[] args) 
	{
		// 86. Write a program to implement a priority queue using a binary heap. 
		PriorityQueue Q = new PriorityQueue();
			
			Q.push(1);
			Q.push(3);
			Q.push(2);
			Q.push(5);
			Q.push(4);
			System.out.println(Q.pop());
			System.out.println(Q.pop());
			System.out.println(Q.pop());
			System.out.println(Q.pop());
			System.out.println(Q.pop());
			
	}
	
}
