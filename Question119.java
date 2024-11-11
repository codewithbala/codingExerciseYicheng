class Node
{
	int data;
	Node next;
	
	Node(int i)
	{
		data = i;
		next = null;
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
	
	public void reverse()
	{
		head = reverseList(head);
	}
	
	private Node reverseList(Node n)
	{
		if(n == null || n.next == null)
		{
			return n;
		}
		else 
		{
			Node head = reverseList(n.next);
			n.next.next = n;
			n.next = null;
			return head;
		}
	}
	
}

class Question119 {
	public static void main(String[] args) 
	{
		// 119. Write a program to reverse a linked list recursively.  
		MyList list = new MyList();
		list.add(new Node(1));
		list.add(new Node(2));
		list.add(new Node(3));
		list.add(new Node(4));
		list.add(new Node(5));
		list.add(new Node(6));
		list.print();
		list.reverse();
		list.print();
		
	}
	
	
}