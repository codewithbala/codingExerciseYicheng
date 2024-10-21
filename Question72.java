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
	
	public void reverse(int k)
	{
		if(head != null)
		{
			int i = 1;
			Node p = head;
			Node tmp = head;
			Node q = null;
			while(i <= k && p != null)
			{
				Node t = p;
				p = p.next;
				i++;
				t.next = q;
				q = t;
				
			}
			head  = q;
			tmp.next = p;
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
	
}

class Question72 {
	public static void main(String[] args) 
	{
		// 72. Write a program to reverse the nodes in groups of k in a linked list. 
		MyList list = new MyList();
		list.add(new Node(1));
		list.add(new Node(2));
		list.add(new Node(3));
		list.add(new Node(4));
		list.add(new Node(5));
		list.add(new Node(6));
		list.print();
		
		list.reverse(3);
		list.print();
		
	}
}