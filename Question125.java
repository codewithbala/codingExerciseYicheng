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
		if(head.next == null)
		{
			return false;
		}
		
		if(head.next.next == null)
		{
			return false;
		}
		
		Node p = head.next.next;
		Node q = head.next;
		while(p != null && q != null)
		{
			if(p == q)
			{
				return true;
			}
			
			if(p.next != null)
			{
				p = p.next.next;
			}
			else 
			{
				return false;
			}
			q = q.next;
			
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

class Question125
{
	public static void main(String[] args) 
	{
		// 125. Write a program to detect a cycle in a linked list using Floyd’s cycle-finding algorithm.
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
		
		MyList list2 = new MyList();
		Node head2 = new Node(1);
		list2.add(head2);
		list2.add(new Node(2));
		list2.add(new Node(3));
		list2.add(new Node(4));
		list2.add(new Node(5));
		System.out.println(list2.hasLoop());
		
		
		
	}
}