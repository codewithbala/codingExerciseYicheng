import java.util.*;

class Node
{
	int data;
	Node next;
	
	Node(int data)
	{
		this.data = data;
	}
}

class MyList
{
	Node head;
	
	public void add(Node node)
	{
		if(head == null)
		{
			head  = node;
		}
		else 
		{
			Node p = head;
			while(p != null)
			{
				if(p.next == null)
				{
					p.next = node;
					break;
				}
				p = p.next;
			}
		}
	}
	
	public boolean hasLoop()
	{
		HashSet<Node> set = new HashSet<Node>();
		
		Node p = head;
		while(p != null)
		{
			if(set.contains(p))
			{
				return true;
			}
			else 
			{
				set.add(p);
			}
			p = p.next;
		}
		return false;
	}
	
	public void print()
	{
		Node p = head;
		while(p != null)
		{
			System.out.print(p.data + "->");
			p = p.next;
		}
		System.out.println();
	}
	
}


class Question83 {
	public static void main(String[] args) 
	{
		// 83. Write a program to check if a linked list has a cycle. 
		MyList list = new MyList();
		Node head = new Node(1);
		list.add(head);
		list.add(new Node(2));
		list.add(new Node(3));
		list.add(new Node(4));
		Node end = new Node(5);
		end.next = head;
		list.add(end);
		
		System.out.println(list.hasLoop());
		
		
	}
}