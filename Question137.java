import java.util.*;

class LRUCache 
{
	int size;
	
	LinkedList<LRUCache.Node> cache;
	HashMap<Integer,LRUCache.Node> hashMap;
	
	public class Node
	{
		int key;
		int data;
		Node(int key, int value)
		{
			this.key = key;
			this.data = value;
		}
		
		public String toString()
		{
			return String.valueOf(data);
		}
	}
	
	
	LRUCache(int size)
	{
		this.size = size;
		this.cache = new LinkedList<Node>();
		this.hashMap = new HashMap<Integer, LRUCache.Node>();
	}	
	
	public void put(int key, int value)
	{
		if(hashMap.get(key) != null)
		{
			this.cache.remove(hashMap.get(key));
			LRUCache.Node n = new Node(key, value);
			this.cache.add(n);
			this.hashMap.put(key, n);
		}
		else 
		{
			LRUCache.Node n = new Node(key, value);
			this.cache.add(n);
			this.hashMap.put(key, n);
		}
		
		if(this.cache.size() > this.size)
		{
			LRUCache.Node n = this.cache.get(0);
			this.cache.remove(0);
			hashMap.remove(n.key, n);
		}
	}
	
	public int get(int key)
	{
		if(hashMap.get(key) == null)
		{
			return -1;
		}
		else 
		{
			LRUCache.Node n = hashMap.get(key);
			this.cache.remove(n);
			this.cache.add(n);
			return n.data;
		}
	}
	
	public void print()
	{
		System.out.println(this.cache);
	}
}

class Question137
{
	public static void main(String[] args)
	{
		// 137. Write a program to implement a simple cache using LRU (Least Recently Used) eviction policy.  
		LRUCache cache = new LRUCache(4);
		cache.put(10, 50);
		cache.print();

		cache.put(15, 25);
		cache.print();

		cache.put(20, 30);
		cache.print();

		cache.put(25, 35);
		cache.print();

		cache.put(20, 30);
		cache.print();

		cache.put(40, 50);
		cache.print();

		cache.put(25, 35);
		cache.print();
	}
}